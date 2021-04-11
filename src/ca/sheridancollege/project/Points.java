/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author ammar
 */

public class Points {

    private int computerPoints;
    private int playerPoints;



    public Points() {
    computerPoints = 0;
    playerPoints = 1;
    }

    public void addPoint(Player player){
        if (player.getPlayerID().equals("computer")){
            computerPoints++;
        }else
            playerPoints++;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public int getPoints (){
        return computerPoints + playerPoints;
    }

}