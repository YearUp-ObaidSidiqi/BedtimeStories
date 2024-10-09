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
                mary_had_a_little_lamb();
            } else if (command.equalsIgnoreCase("B")) {
                hansel_and_gretel();
            } else if (command.equalsIgnoreCase("C")) {
                goldilocks();
            } else if (command.equalsIgnoreCase("X")) {
                break;
            }
        }
    }

    public static void mary_had_a_little_lamb() {
        try {
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream("mary_had_a_little_lamb.txt");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            // read until there is no more data
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);

            }
            System.out.println("     ---------- That's Your Bedtime-story For Tonight Comeback Tomorrow Night ... ----------\n");
            // close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }

        public static void goldilocks() {
            try {
                // create a FileInputStream object pointing to
                // a specific file
                FileInputStream fis = new FileInputStream("goldilocks.txt");
                // create a Scanner to reference the file to be read
                Scanner scanner = new Scanner(fis);
                String input;
                // read until there is no more data
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                System.out.println("     ---------- That's Your Bedtime-story For Tonight Comeback Tomorrow Night ... ----------\n");
                // close the scanner and release the resources
                scanner.close();
            } catch (IOException e) {
                // display stack trace if there was an error
                e.printStackTrace();
            }
        }

            public static void hansel_and_gretel() {
                try {
                    // create a FileInputStream object pointing to
                    // a specific file
                    FileInputStream fis = new FileInputStream("hansel_and_gretel.txt");
                    // create a Scanner to reference the file to be read
                    Scanner scanner = new Scanner(fis);
                    String input;
                    // read until there is no more data
                    while (scanner.hasNextLine()) {
                        input = scanner.nextLine();
                        System.out.println(input);

                    }
                    System.out.println("     ---------- That's Your Bedtime-story For Tonight Comeback Tomorrow Night ... ----------\n");
                    // close the scanner and release the resources
                    scanner.close();
                } catch (IOException e) {
                    // display stack trace if there was an error
                    e.printStackTrace();
                }
            }


        }
