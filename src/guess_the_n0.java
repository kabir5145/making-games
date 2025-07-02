/*
   create a class game, which allow a user to play "guess the number "
   game once . game should have the following methods :
   1. constructor to generate the random no.
   2. takeUserInput() to take a user input of no.
   3. isCorrectNumber() to detect weather the number entered by the user is true
   4. getter and setter for noOfGuess
   using properties such as noOfGuesses(int) , etc to get this task done !
    */

import java.util.Scanner;

class game {
    public int randomNum;
    public int attempts;
    public int maxAttempts;

    public game() {
        this.randomNum = (100) + 1;
        this.attempts = 0;
        this.maxAttempts = maxAttempts;
    }

    public String makingGuess(int guess) {
        attempts++;
        if (guess < randomNum) {
            return "too slow";
        } else if (guess > randomNum) {
            return "too high";
        }else {
            return "congrats you have guessed the number";
        }
    }
    public boolean isGameOver(){
        return attempts>=maxAttempts;
    }
    public String revealAns(){
        return "the ans is "+randomNum;
    }
    public int getAttempts(){
        return attempts;
    }
}
public class guess_the_n0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        game g = new game();
        System.out.println("welcome to the game of guess the number");
        s.next();

    }
}
