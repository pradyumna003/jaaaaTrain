package com.demo_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_demo {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fs =new FileInputStream("C:\\Users\\prady\\system.txt");
            int s= fs.read();
            System.out.println((char) s);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
