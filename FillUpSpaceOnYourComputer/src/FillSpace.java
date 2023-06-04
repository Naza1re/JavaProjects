

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FillSpace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getFreeSpace();
        System.out.print("Введите количество мегабайт: ");
        int fileSizeInMB = scanner.nextInt();
        func(fileSizeInMB);
        getFreeSpace();
    }

    public static void func(long fileSizeInMB){
        long fileSizeInBytes = fileSizeInMB * 1024 * 1024;

        String fileName = "output.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (long i = 0; i < fileSizeInBytes; i++) {
                printWriter.print("A");
            }

            printWriter.close();
            System.out.println("Текстовый файл создан: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
    public static void getFreeSpace(){
    File drive = new File("C:");
    long freeSpaceBytes = drive.getFreeSpace();
    long freeSpaceMB = freeSpaceBytes / (1024 * 1024);

        System.out.println("Свободное место на диске C: " + freeSpaceMB + "MB");
    }


}



