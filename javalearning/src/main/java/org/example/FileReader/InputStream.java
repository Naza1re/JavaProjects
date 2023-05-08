package org.example.FileReader;

import java.io.FileOutputStream;

public class InputStream {
    public static void main(String[] args) {

        String text = "Hello World";
        try(FileOutputStream file = new FileOutputStream("resources/hello world")){
            byte[] buffer = text.getBytes();
            file.write(buffer,0,buffer.length);
            System.out.println("Текст был записан в файл");



        }
        catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
