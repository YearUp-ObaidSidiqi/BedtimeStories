package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Mary_had_a_little_lamb {
    public static void main(String[] args) {



        try
        {
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream("mary_had_a_little_lamb.txt");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            // read until there is no more data
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
            // close the scanner and release the resources
            scanner.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
