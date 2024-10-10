package com.pluralsight;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ChatGPTRevised {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n   -----  Welcome to Bedtime Stories Application  -----\n");
        System.out.println("We have the following bedtime stories for tonight!  \n");

        while (true) {
            System.out.println("Please select from the following: ");
            System.out.println("\nFor Mary Had a Little Lamb Select     [A]");
            System.out.println("For Hansel and Gretel                 [B]");
            System.out.println("For Goldilocks                        [C]");
            System.out.println("To Exit the application               [X]\n");
            String command = Utilities.PromptForString("Please Enter [A], [B], [C], or [X]: ").toUpperCase();
            Thread.sleep(500);

            switch (command) {
                case "A":
                case "B":
                case "C":
                    storyReader(command.charAt(0));
                    break;
                case "X":
                    System.out.println("Are you sure you want to exit? [Y/N]");
                    String confirm = Utilities.PromptForString("Enter Y to confirm exit: ");
                    if (confirm.equalsIgnoreCase("Y")) {
                        System.out.println("Goodbye! Come back for more stories soon.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select [A], [B], [C], or [X].");
            }
        }
    }

    public static void storyReader(char command) {
        String story = "";
        switch (command) {
            case 'A':
                story = "mary_had_a_little_lamb.txt";
                break;
            case 'B':
                story = "goldilocks.txt";
                break;
            case 'C':
                story = "hansel_and_gretel.txt";
                break;
        }

        try (FileInputStream fis = new FileInputStream(story);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("\n     ---------- That's your bedtime story for tonight. Come back tomorrow night! ----------\n");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the story file could not be found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the story.");
        }
    }
}

