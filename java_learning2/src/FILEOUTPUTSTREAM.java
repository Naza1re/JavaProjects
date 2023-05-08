import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FILEOUTPUTSTREAM {
    public static void main(String[] args) {

        String text = "Му name is Chiki,chiki chiki";
        try(FileOutputStream out = new FileOutputStream("hello.txt")) {

            byte[] buffer = text.getBytes();
            out.write(buffer,0,buffer.length);
            System.out.println("File was written in file hello.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
