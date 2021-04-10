package ca.sheridancollege.project;

import java.util.Scanner;

public class GoFish {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to GoFish a game against the computer");
        System.out.println("please enter your preferred username");
        Game game = new Game(in.nextLine());
        game.play();
    }


}
