package com.company;
/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
import java.util.Scanner;
import java.util.Random;

class Game{
    int noOfGuesses = 0;
    int number;
    int inputNumber;
    Game(){
         Random random = new Random();
         this.number = random.nextInt(100);
     }
     void takeUserInput(){
         System.out.println("Guess the number");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
     }

     boolean isCorrectNumber(){
         noOfGuesses++ ;
        if (inputNumber == number){
            System.out.format("Congrats!! You have guessed the correct number the number is %d\nyou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if (inputNumber < number) {
            System.out.println(" is less... ");
        }
        else if(inputNumber > number){
            System.out.println(" is more... ");
        }
         return false;
     }
    public void setNoOfGuesses(int i){
        this.noOfGuesses = i;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

}
public class Vid43_Guess_Game {
    public static void main(String[] args) {

//        System.out.println(" Enter the guessed number: ");
//        Scanner sc = new Scanner(System.in);
//        int takeUserInput = sc.nextInt();
//
//        Random random = new Random();
//        int compInput = random.nextInt(101);
//
//        if (takeUserInput == compInput){
//            System.out.println("Congratulations!, your guess is right!");
//        }
//        else if (takeUserInput < compInput) {
//            System.out.println("The guessed number is less than original number");
//        }
//        else if (takeUserInput > compInput) {
//            System.out.println("The guessed number is greater than original number");
//        }
//
//        Game guessingGame = new Game();
////        guessingGame.setNoOfGuesses();
////        guessingGame.getNoOfGuesses();
//
//        // ****************** HALF-SOLVED ***********************//


        Game game = new Game();
        boolean b = false;
        while (!b){
            game.takeUserInput();
            b = game.isCorrectNumber();
            //System.out.println(b);
        }
    }
}
