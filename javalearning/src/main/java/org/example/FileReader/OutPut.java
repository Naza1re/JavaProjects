package org.example.FileReader;

import java.io.FileInputStream;

public class OutPut {
    public static void main(String[] args) {


        try(FileInputStream file = new FileInputStream("hello world")){

            int i;
            while ((i=file.read())!=-1){
                System.out.print((char)i);
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
