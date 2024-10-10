package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("\n   -----  Welcome to Bedtime Stories Application  -----\n");
        System.out.println("We have the Following Bedtime Stories for Tonight!  \n");
        while (true) {
            System.out.println("Please Select from the Following: ");
            System.out.println("\nFor Mary Had a Little Lamb Select     [A]");
            System.out.println("For Hansel and Gretel                 [B]");
            System.out.println("For Goldilocks                        [C]");
            System.out.println("For Exiting from Application          [X]\n");
            String command = Utilities.PromptForString("Please Enter [A], [B], [C], [X]   :     ");
            Thread.sleep(500);

            if (command.equalsIgnoreCase("A")) {
               storyReader('A');
                //mary_had_a_little_lamb();
            } else if (command.equalsIgnoreCase("B")) {
                storyReader('B');
                //hansel_and_gretel();
            } else if (command.equalsIgnoreCase("C")) {
                storyReader('C');
                //goldilocks();
            } else if (command.equalsIgnoreCase("X")) {
                break;
            }
        }
    }

    public static void storyReader(char command ) {


        String story = "";
        if (command == 'A'){
            story = "mary_had_a_little_lamb.txt";
        }
        if (command=='B'){
            story = "goldilocks.txt";
        }
        if (command=='C'){
            story =  "hansel_and_gretel.txt";
        }
        try {
            // create a FileInputStream object pointing to
            // a specific file

            FileInputStream fis = new FileInputStream(story);
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            // read until there is no more data
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
            System.out.println("\n     ---------- That's Your Bedtime-story For Tonight Comeback Tomorrow Night ... ----------\n");
            // close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
