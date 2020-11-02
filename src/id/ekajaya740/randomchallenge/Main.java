package id.ekajaya740.randomchallenge;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gameStarted = false;

        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Welcome, " + name);

        System.out.println("Start the game?\n[Y/y] [N/n]");
        String cond = scan.next();

        if(cond.equals("Y") || cond.equals("y")){
            gameStarted = true;

        }else if(cond.equals("N") || cond.equals("n")){
            gameStarted = false;
            System.out.println("Quitting the game");
        }

        if(gameStarted){
            System.out.println("Game Started!");
            Random random = new Random();
            boolean isGuessed = false;
            int numberGuess = random.nextInt();
            int hp = 5;

            while(numberGuess < 0){
                numberGuess = random.nextInt();
            }

            while(!isGuessed){
                isGuessed = false;
                System.out.println("Input your number:");
                long userNumber = scan.nextLong();
                if(userNumber == numberGuess){
                    isGuessed = true;
                    System.out.println("Congratulation " + name);
                }else if(numberGuess > userNumber){
                    System.out.println("Higher your answer");
                }else if(numberGuess < userNumber){
                    System.out.println("Lower your answer");
                }
                hp -= 1;

                if(hp <= 0){
                    System.out.println("Game Over");
                    System.out.println("The answer is " + numberGuess);
                    System.out.println("Sorry, " + name);
                    break;
                }
            }
        }
    }
}
