package replitConstructorsEng;

/*
Write a Scrabble Game for two person Rules OK== 1- At the beginning
Ask to first Player enter a word for starting game OK 2- Then change
the player ask to new player if given word is valid or not OK i) If new
player accepts the given word add number of letters in the word as
points to player who wrote the word And go to step 3 OK ii) If new
player does not accept the word as valid then print "Invalid word,
player X(Current player) won the game" and finish the game

OK 3- Ask to users if user want to continue game or not OK i) If player
want to continue, OK ask to user a letter to add to word OK and ask to
user side to add (beginning or end) OK then add letter to word and run step 2

OK ii) If player does not want to continue then print "Game Finished"
and print points and winner
 */

import java.util.Scanner;

public class Constructors_01 {
    static int player = 1;
    static int point1 = 0;
    static int point2 = 0;
    static String word = "";
    static String add = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(player + "st player please enter a word: ");
        word = scan.next();

        changePlayer();

        askForConfirmation();


    }

    private static void askForConfirmation() {
        System.out.println("Word entered: " + word);
        System.out.println(player + "st player do you accept the entered word? \n1: Yes \n0: No");

        int accept = scan.nextInt();
        if (accept == 1) {

            if (player == 1) {
                point2 += word.length();
            } else point1 += word.length();

            isGameContinue();

        } else finishTheGame();
    }



    private static void isGameContinue() {
        System.out.println("Do you want to continue the game? " +
                "\n1: Yes \n0: No");
        int choice = scan.nextInt();
        if (choice == 1) {
            addWord();


        } else {
            System.out.println("Game over");
            System.out.println("1st player points1: " + point1);
            System.out.println("2st player points2: " + point2);
            if (point1 > point2) {
                System.out.println("1st player wins");
            } else if (point2 > point1) {
                System.out.println("2st player wins");
            } else System.out.println("Game ended in a draw");
        }
    }

    private static void addWord() {
        System.out.println("Enter a new word to add to the old word: ");
        add=scan.next();
        System.out.println("Do you want to add the new word to the beginning or the end? " +
                "\n 1: add the beggin 0: add to end");
        int choice= scan.nextInt();
        if (choice==1){
            word=add+word;
        } else word=word+add;
        changePlayer();
        askForConfirmation();
    }

    private static void finishTheGame() {
        System.out.println("is game "+player+"st player win game. Because the other player entered the wrong word");
    }
    private static void changePlayer () {
        if (player == 1)
            player = 2;
        else
            player = 1;
    }
}

