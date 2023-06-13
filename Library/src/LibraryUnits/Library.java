package LibraryUnits;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library implements Comparator<Book> {
    public static List<Book> books = new ArrayList<>();

    public static Book[] displayBooksFromFile(String filePath) {
        List<Book> sortedBooks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String title = parts[0].trim().replaceAll("\"", "");
                    String author = parts[1].trim().replaceAll("\"", "");
                    String id = parts[2].trim().replaceAll("\"", "");
                    String user = parts[3].trim().replaceAll("\"", "");
                    String population = parts[4].trim().replaceAll("\"", "");
                    Book book = new Book(title, author, id, user, population);
                    System.out.println("Добавлена книга " + book);
                    sortedBooks.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }

        sortedBooks.sort(Comparator.comparing(Book::getPopulation, Comparator.reverseOrder()));

        Book[] sortedPopulation = new Book[sortedBooks.size()];
        for (int i = 0; i < sortedBooks.size(); i++) {
            sortedPopulation[i] = sortedBooks.get(i);
        }

        return sortedPopulation;
    }



    public static String[] readBooksFromFileByAuthor(String filename, String author) {
        List<String> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 4 && bookDetails[1].equalsIgnoreCase(author)) {
                    books.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books.toArray(new String[0]);
    }
    public static String[] readBooksFromFileByTitle(String filename, String title) {
        List<String> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 4 && bookDetails[0].replaceAll("\"", "").equalsIgnoreCase(title)) {
                    books.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books.toArray(new String[0]);
    }
    public static void removeUserFromBook(String id) {
        String filePath = "books.txt";
        String tempFilePath = "temp.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 5 && bookDetails[2].replaceAll("\"", "").equalsIgnoreCase(id)) {
                    String updatedLine = line.replace("\"" + bookDetails[3] + "\";", "\"\";");
                    writer.write(updatedLine);
                } else {

                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.move(Path.of(tempFilePath), Path.of(filePath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String[] readBooksFromFileById(String filename, String Id) {
        List<String> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 4 && bookDetails[2].equalsIgnoreCase(Id)) {
                    books.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books.toArray(new String[0]);
    }

    public static void addUserToBook(String user, String id) {
        String filePath = "books.txt";
        String tempFilePath = "temp.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 5 && bookDetails[2].replaceAll("\"", "").equalsIgnoreCase(id)) {
                    int currentPopulation = Integer.parseInt(bookDetails[4].replaceAll("\"", ""));
                    int increasedPopulation = currentPopulation + 1;
                    String updatedLine =  bookDetails[0] + "\";\"" + bookDetails[1] + "\";\"" + bookDetails[2] + "\";\"" + user + "\";\"" + increasedPopulation + "\"";
                    writer.write(updatedLine);
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Заменяем исходный файл обновленным временным файлом
            Files.move(Path.of(tempFilePath), Path.of(filePath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    public static void addBookToLibrary(String title,String author,String id){
        Book book1 = new Book(title,author,id,"","0");
        books.add(book1);
        try (PrintWriter writer = new PrintWriter(new FileWriter("books.txt", true))) {
            for (Book book : books) {
                String line = "\"" + book.getTitle() + "\";\"" + book.getAuthor() + "\";\""+book.getId()+"\";\""+ book.getUser()+"\";\""+book.getPopulation()+"\"";
                writer.println(line);
            }
            System.out.println("Books added to file: " + "books.txt");
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }

    }
    public static String[] readBooksFromFileByUser(String filename, String user) {
        List<String> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.split("\";\"");
                if (bookDetails.length >= 4 && bookDetails[3].replaceAll("\"", "").equalsIgnoreCase(user)) {
                    books.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books.toArray(new String[0]);
    }

    @Override
    public int compare(Book o1, Book o2) {
        System.out.println("Книга 1 : "+ o1.population+"Книга 2 : " +o2.population);
        int a = Integer.parseInt(o1.population);
        int b = Integer.parseInt(o2.population);
        return b-a;
    }
}
