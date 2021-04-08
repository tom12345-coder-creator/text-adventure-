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
public class HQ implements Location {

    public int Catapult;
    public String location;

    public HQ(int Catapult, String location) {
        this.Catapult = Catapult;
        this.location = location;
    }

    @Override
    public int PickUpItem() {
        return Catapult;
    }

    @Override
    public void setitem() {
        Catapult--;
    }

    public void useCatapult() {
        System.out.println("you put on the disguise you got from the school to get into the MI 13 secret service headquarters ");
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void ExplainLocation() {
        System.out.println("you are at the MI 13 secret service headquarters where they have fun gadgets that you can use"
                + "you can see your treehouse and the park from the headquaters ");
    }

    public static void gotoHeadquaters() {
        Dennis DennisM = new Dennis(10, "Male", 0, "Dennis the menis", 5, 100, "Dennis", 0, 0, 0, 0, 0);
        DennisM.lost();
        HQ MI13 = new HQ(1, "");
        MI13.ExplainLocation();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------");
        Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        if (responce.equals("go to treeshouse")) {
            Treehouse.goToTreehouse();
        } else if (responce.equals("make mischeif")) {
            System.out.println("you start to circle around peole with your skatebaord ");
            gotoHeadquaters();
        } else if (responce.equals("go to aprk")) {
            School.gotoSchool();
        } else if (responce.equals("set up catapult")) {
            if (MI13.Catapult != 0) {
                DennisM.addCatapult();
                MI13.setitem();
                System.out.println("you have set the catapult all thats left is to pull the switch. " + DennisM.getCatapult());
                gotoHeadquaters();
            } else {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("cant reload the catapult");
                System.out.println("----------------------------------------------------------------------------------------");
                gotoHeadquaters();
            }
        } else if (responce.equals("help")) {
            Game.GetHelp();
            gotoHeadquaters();
        } else {
            System.out.println("unknown action");
            gotoHeadquaters();
        };

    }
}
