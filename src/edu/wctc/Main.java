package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        readUserInput();
    }

    public static void readUserInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Preference Quiz!");
        System.out.println("-------------------------------");

        String[] choices = {"Mild or Spicy?", "Tea or Coffee?", "Breakfast or Brunch?",
                "Summer or Winter?", "Paper or Plastic?"};

        String zero = """
                Enter 0 for the choice on the LEFT\s
                Enter 1 for the choice on the RIGHT""";

        int[] answers = new int[5];

        int endQuiz = 0;

        for (int i = 0; i < choices.length; i++) {
            System.out.println(choices[i]);
            System.out.println(zero);
            answers[i] = Integer.parseInt(keyboard.nextLine());
            if (answers[i] == 1) {
                endQuiz++;
            }
        }

        System.out.printf("Your score is: %d \n", endQuiz);

        if (endQuiz < 3) {
            System.out.println("You prefer life to be calm and organized");
        } else if (endQuiz == 3) {
            System.out.println("You prefer a good balance in life");
        } else {
            System.out.println("You prefer life to be spontaneous and active");
        }

        System.out.println("Again? Enter 1 to play again, or any other key to exit");

        int again = Integer.parseInt(keyboard.nextLine());

        if (again == 1) {
            readUserInput();
        }
    }
}