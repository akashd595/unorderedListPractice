package com.bridgelabz.unordered_practice;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class SplitingString {
    static String[] sentence;

    public static void main(String[] args) {
        String fileContent = "";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Akash\\Downloads\\BufferedWriterTesting.txt"));
            System.out.println("Enter your story");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            writer.write(str);
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Akash\\Downloads\\BufferedWriterTesting.txt"));
            fileContent = reader.readLine();
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void toSpiltSentance(String fileContent){

        String storingInput = fileContent.toLowerCase(Locale.ROOT);
        sentence = storingInput.split(" ");

    }
}

