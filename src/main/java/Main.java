import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Chanelle's Guessing Game!");
        System.out.println("Guess The Number");
            int correctNumber = 12;
            int guess = 0;
            int counter = 0;
            while (guess != correctNumber) {
                System.out.print("You Guessed: ");
                guess = in.nextInt();
                counter++;
                if (guess > correctNumber) {
                    System.out.println("Too large");
                } else if (guess < correctNumber) {
                    System.out.println("Too small");
                } else {
                    System.out.println("You're CORRECT!");
                    System.out.println("It took you "  + counter +  " times to guess correctly!");
                }
            }
        }
    }

