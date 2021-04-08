/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;


/**
 *
 * @author thomas
 */
public class Shops implements Location {

    private int pies;
    private String location;

    public Shops(int apples, String location) {
        this.pies = apples;
        this.location = location;
    }

    @Override
    public int PickUpItem() {
        return pies;
    }

    @Override
    public void setitem() {
        this.pies = pies;
    }

    public void eatapple(CharacterActions theEater) {
        theEater.increasehealth();
        System.out.println("yummy" + theEater.getName() + " eats the apple restoring 1 point of health");
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void ExplainLocation() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("You are currently at the shops you see the where villian police officer slippers, the shop is having a sale all pies today becuase it is the anniversery of the shops opening");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    
    public static void gotoShops() {
        Dennis DennisM = new Dennis(10, "Male", 0, "Dennis the menis", 5, 100, "Dennis", 0, 0, 0, 0, 0);
        DennisM.lost();
        SgtSlipper SlipperS = new SgtSlipper(34, "Male", 1, "Slipper", 5, 100, "Sgt. Slipper");
        Shops localShops = new Shops(5, "local shops near Dennis house");
        localShops.ExplainLocation();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("At the shop there is the police officer Sgt slppiers patrolling around be careful with what you do, from the shops you can go back to the treehouse or go to the lving room");
        System.out.println("----------------------------------------------------------------------------------------");
        Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        if (responce.equals("go to treeshouse")) {
            Treehouse.goToTreehouse();
        } else if (responce.equals("make mischeif")) {
            System.out.println("you played a prank on sgt slippers");
            gotoShops();
        } else if (responce.equals("go to living room")) {
            LivingRoom.goToLivingRoom();
        } else if (responce.equals("buy a pie")) {
            if (localShops.pies != 0) {
                DennisM.addPies();
                localShops.setitem();
                System.out.println("you have bought an pie from the shop  " + DennisM.getPies());
                gotoShops();
            } else {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("cant buy anymore pies out of money");
                System.out.println("----------------------------------------------------------------------------------------");
                gotoShops();
            }
        } else if (responce.equals("help")) {
            Game.GetHelp();
            gotoShops();
        } else {
            System.out.println("unknown action");
            gotoShops();
        };
        if (responce.equals("shoot slingshoot")) {
            DennisM.shootSling(SlipperS);
            SlipperS.Punishment(DennisM);
            Scanner playAgain = new Scanner(System.in);
            System.out.println("Would you like to play again?");
            String playAgainInput = input1.nextLine();
            if (playAgainInput.equals("yes")) {
                Treehouse.goToTreehouse();
            } else {
                System.out.println("Thanks for playing");
            }
        } else {
            System.out.println("unknown action");
            gotoShops();

        };

    }

}
