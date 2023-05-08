package org.example.FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {


    public static void main(String[] args) {


        try{
            FileOutputStream file = new FileOutputStream("hello world3");
        String text = "hello world my name is anton";

        byte[] buffer =  text.getBytes();
        file.write(buffer,0,buffer.length);
        file.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileInputStream file = new FileInputStream("hello world2")){
            int i;

            while ((i=file.read())!=-1){
                System.out.print((char) i);
            }



        }
        catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
