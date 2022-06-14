package com.chris.rps;

import java.util.Random;
import java.util.Scanner;

enum moves {
    Rock,
    Paper,
    Scissors
}

public class GameLogic {

    //attributes
    private int numberOfRounds, humanScore, compScore, tiedRound;
    private final int MAX_ROUNDS = 10;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    boolean continuePlaying = true;


    //behaviour
    public void startGame() {

        while(continuePlaying)
        {

            //Ensure number of rounds is a valid int - hit catch if not
         while(true)
         {
             System.out.println("How many rounds would you like to play 1-10?");

             try{
                 numberOfRounds = Integer.parseInt(scan.nextLine());

                 if (numberOfRounds <= 0 || numberOfRounds > MAX_ROUNDS) {
                     System.out.println("Invalid amount of rounds");
                     return;
                 }
                 break;
             }catch(NumberFormatException ex){
                 System.out.println("Invalid input " + numberOfRounds + " is not a number");
             }
         }

            //initialize scores as 0
            humanScore = 0;
            compScore = 0;

            //begin the rounds
            playRounds();

            //print results of rounds
            System.out.println("Human score:" + humanScore + "\nComputer:" + compScore + "\nDraws:" +  tiedRound);

            //Ask user to play again. playAgain initialized to true so only check for [N]response
            System.out.println("Play again? [Y] or [N]");
            String playAgain = scan.nextLine();
            if(playAgain.equalsIgnoreCase("N"))
            {
                System.out.println("Goodbye");
                return;
            }



        }



    }

    public void playRounds() {
        //play the required no of rounds
        while (numberOfRounds > 0) {

            //Make moves
            int moveOne = humanMove();
            int moveTwo = compMove();

            //calculate winner
            char winner = calculateWinner(moveOne, moveTwo);

            //Update scores
            if (winner == 'h') {

                humanScore++;
                System.out.println("Human " + moves.values()[moveOne - 1] + " beats Comp " + moves.values()[moveTwo - 1]);

            } else if (winner == 'c') {
                compScore++;
                System.out.println("Comp " + moves.values()[moveTwo - 1] + " beats Human " + moves.values()[moveOne - 1]);
            } else {
                System.out.println("Human " + moves.values()[moveOne - 1] + " draws Comp " + moves.values()[moveTwo - 1]);
                tiedRound++;
            }

            //subtract 1 from numberOfRounds
            numberOfRounds--;
        }
    }

    public char calculateWinner(int moveOne, int moveTwo) {
        int winningNum = Math.abs(moveTwo - moveOne);

        if (winningNum == 0) {
            //Draw
            return 'd';
        } else if (winningNum == 1) {
            //moveTwo won
            return 'c';
        } else return 'h'; //moveOne won
    }

    public int humanMove() {
        System.out.println("Make a move [1]Rock, [2]Paper, [3]Scissors");
        int move = scan.nextInt();
        scan.nextLine();
        return move;
    }

    public int compMove() {
        return rand.nextInt(1, 3) + 1;
    }

}
