package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    private boolean end = false;
    private String name;
    private int quantityOfWins;
    private int comWins;
    private int gamerWins;

    public int startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your name: ");
        this.name = scanner.nextLine();

        System.out.println("Give the number of wins: ");
        this.quantityOfWins = scanner.nextInt();

        return quantityOfWins;
    }

    public void gameSupport() {
        System.out.println("Buttons:");
        System.out.println("Button \"1\": Rock");
        System.out.println("Button \"2\": Paper");
        System.out.println("Button \"3\": Scissors");
        System.out.println("Button \"x\": End Game");
        System.out.println("Button \"n\": New Game");
    }

    public void controller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " make a move.");
        int move = scanner.nextInt();

        Random generator = new Random();
        int computer = generator.nextInt(3) + 1;

        if (move != computer) {
            if (move == 1 && computer == 2) {
                System.out.println("Rock vs Paper. Round for computer.");
                this.comWins++;
                System.out.println(gamerWins + ":" + comWins);
            } else if (move == 1 && computer == 3) {
                System.out.println("Rock vs Scissors. Round for " + name + ".");
                this.gamerWins++;
                System.out.println(gamerWins + ":" + comWins);
            }
            if (move == 2 && computer == 3) {
                System.out.println("Paper vs Scissors. Round for computer.");
                this.comWins++;
                System.out.println(gamerWins + ":" + comWins);
            } else if (move == 2 && computer == 1) {
                System.out.println("Paper vs Rock. Round for " + name + ".");
                this.gamerWins++;
                System.out.println(gamerWins + ":" + comWins);
            }
            if (move == 3 && computer == 1) {
                System.out.println("Scissors vs Rock. Round for computer.");
                this.comWins++;
                System.out.println(gamerWins + ":" + comWins);
            } else if (move == 3 && computer == 2) {
                System.out.println("Scissors vs Paper. Round for " + name + ".");
                this.gamerWins++;
                System.out.println(gamerWins + ":" + comWins);
            }
        } else if (move == 1) {
            System.out.println("Rock vs Rock. Draw");
            System.out.println(gamerWins + ":" + comWins);
        } else if (move == 2) {
            System.out.println("Paper vs Paper. Draw");
            System.out.println(gamerWins + ":" + comWins);
        } else if (move == 3) {
            System.out.println("Scissors vs Scissors. Draw");
            System.out.println(gamerWins + ":" + comWins);
        }

    }

    public void endGame() {

        if (comWins == quantityOfWins || gamerWins == quantityOfWins) {
            end = true;
            if (comWins > gamerWins) {
                System.out.println("Winner is computer !! Congratulations");
            } else {
                System.out.println("Winner is " + name + " !! Congratulations");
            }

            System.out.println();
            System.out.println("If you want keep play, please press \"n\" button or you can finish for now, by press \"x\" ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if (choice.equals("n")) {
                comWins = 0;
                gamerWins = 0;
                end = false;
            } else {
                System.out.println("Thanks for playing. Have a nice day");
            }
        }
    }


    public static void main(String[] args) {

        RpsRunner game = new RpsRunner();

        game.startGame();
        game.gameSupport();

        while (!game.end) {
            game.controller();
            game.endGame();
        }

    }
}
