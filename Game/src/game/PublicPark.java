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
public class PublicPark implements Location {

    private int SkateBoard;
    private String location;

    public PublicPark(int skateboard, String location) {
        this.SkateBoard = skateboard;
        this.location = location;
    }

    
    public int PickUpItem() {
        return SkateBoard;
    }

    
    public void setitem() {
        SkateBoard--;
    }

    public void useSkateBoard() {
        System.out.println("you start using the skatebooard arounf the park");
    }

    
    public String getLocation() {
        return location;
    }

    
    public void ExplainLocation() {
        System.out.println("you are at the park where you meet the gang and decide to have some fun."
                + "you can see your house and the school from the park ");
    }

    public static void gotoPark() {
        Dennis DennisM = new Dennis(10, "Male", 0, "Dennis the menis", 5, 100, "Dennis", 0, 0, 0, 0, 0);
        DennisM.lost();
        PublicPark PublicPark1 = new PublicPark(1, "the public park next to the school");
        PublicPark1.ExplainLocation();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("at the park you can play around with his friends  and go stakebaording around the park,");
        System.out.println("----------------------------------------------------------------------------------------");
        Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        if (responce.equals("go to treeshouse")) {
            Treehouse.goToTreehouse();
        } else if (responce.equals("make mischeif")) {
            System.out.println("you start to circle around peole with your skatebaord ");
            gotoPark();
        } else if (responce.equals("go to school")) {
            School.gotoSchool();
        } else if (responce.equals("pick up skateboard")) {
            if (PublicPark1.SkateBoard != 0) {
                DennisM.addSkateBoard();
                PublicPark1.setitem();
                System.out.println("you have picked up your skateboard and started to roll around the park. " + DennisM.getSkateBoard());
                gotoPark();
            } else {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("you only need 1 stakeboard");
                System.out.println("----------------------------------------------------------------------------------------");
                gotoPark();
            }
        } else if (responce.equals("help")) {
            Game.GetHelp();
            gotoPark();
        } else {
            System.out.println("unknown action");
            gotoPark();
        };

    }
}
