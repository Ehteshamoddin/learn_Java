package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) throws IOException {
        //Code to create a new file
//        File myFile = new File("java-file.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("unable to create file");
//            e.printStackTrace();
//        }

        //Code to write to a file
//        try (FileWriter fileWriter = new FileWriter("java-file.txt")) {
//            System.out.println("Edit success");
//            fileWriter.write("Hello there");
//            fileWriter.close();
//        }

//        try {
//            FileWriter fileWriter = new FileWriter("java-file.txt");
//            fileWriter.write("This is our first file in java file handling\nNow close the file");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Reading a file in java
//        File myFile = new File("java-file.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Delete file
//        File myFile = new File("java-file.txt");
//        if (myFile.delete()){
//            System.out.println("Deleted file:"+myFile.getName());
//        }
//        else {
//            System.out.println("Error occurred");
//        }
    }
}
