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
public class Treehouse implements Location {

    public static int apples;
    private String location;

    public Treehouse(int pies, String location) {
        Treehouse.apples = pies;
        this.location = location;
    }

    @Override
    public int PickUpItem() {
        return apples;
    }

    @Override
    public void setitem() {
        apples--;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void ExplainLocation() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("You are currently at the treehouse around your treehouse there are apples scattered about that you can pick up,from where you are at "
                + "you can see the local shops nearby as well as your home,. what do you want to do.");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void goToTreehouse() {
        Dennis DennisM = new Dennis(10, "Male", 0, "Dennis the menis", 5, 100, "Dennis", 0, 0, 0, 0, 0);
        DennisM.lost();
        Treehouse DennisTreehouse = new Treehouse(10, "Dennis's backgarden");
        Game.getExplainInfo();
        System.out.println("starting the game");
        System.out.println("----------------------------------------------------------------------------------------");
        DennisTreehouse.ExplainLocation();
        Scanner input1 = new Scanner(System.in);
        System.out.println("type what to do next");
        System.out.println("----------------------------------------------------------------------------------------");

        String responce = input1.nextLine();

        if (responce.equals("go to shops")) {
            Shops.gotoShops();
        } else if (responce.equals("make mischeif")) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("their currently isn't anyone near by");
            System.out.println("----------------------------------------------------------------------------------------");
            goToTreehouse();
        } else if (responce.equals("go to living room")) {
            LivingRoom.goToLivingRoom();
        } else if (responce.equals("collect apple")) {
            if (DennisTreehouse.apples != 0) {
                DennisM.addApples();
                DennisTreehouse.setitem();
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("you have collected a apple  " + DennisM.getApples());
                System.out.println("----------------------------------------------------------------------------------------");
                goToTreehouse();
            } else {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("there are no apples left about");
                System.out.println("----------------------------------------------------------------------------------------");
                goToTreehouse();
            }
        } else if (responce.equals("help")) {
            Game.GetHelp();
            goToTreehouse();
        } else {
            System.out.println("unknown action");
            goToTreehouse();

        };

    }

}
