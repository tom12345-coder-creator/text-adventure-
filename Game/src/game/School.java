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
public class School implements Location {

    private int Disguises;
    private String location;

    public School(int Disguises, String location) {
        this.Disguises = Disguises;
        this.location = location;
    }

    @Override
    public int PickUpItem() {
        return Disguises;
    }

    @Override
    public void setitem() {
        Disguises--;
    }

    public void useDisguies() {
        System.out.println("you have put on a Disguises");
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the school, there is a drama department where you can get a Disguises to help you hide from people."
                + "you can see the park and the MI 13 secret service headquarters from the school ");
    }

    public static void gotoSchool() {

        Dennis DennisM = new Dennis(1, "Male", 0, "Dennis the menis", 5, 100, "Dennis", 0, 0, 0, 0 ,0);
        DennisM.lost();
        TheTeacher Carol = new TheTeacher(93, "female", 1, "Mrs Creecher", 5, 100, "Carol Creecher");
        School bashstreetschool = new School(10, "Bash Street School that dennis attends");

        bashstreetschool.ExplainLocation();

        System.out.println(
                "----------------------------------------------------------------------------------------");
        System.out.println(
                "while in the school you have to be carefull of miss creecher ,try getting a disguise to help you avoid her and cause some mischief"
                + " after you finish in the school you can see the park and the MI 13 secret service headquarters pick where to go");
        System.out.println(
                "----------------------------------------------------------------------------------------");
        Scanner input1 = new Scanner(System.in);

        System.out.println(
                "please type in what you would like to do next");
        String responce = input1.nextLine();

        if (responce.equals(
              "go to park")) {
            PublicPark.gotoPark();
        } else if (responce.equals(
                "make mischeif")) {
            System.out.println("you stole a disguise from the school and used it to help you mess with the teachers");
            gotoSchool();
        } else if (responce.equals(
                "go to headquaters")) {
            HQ.gotoHeadquaters();
        } else if (responce.equals(
                "help")) {
            Game.GetHelp();
            gotoSchool();
        } else {
            System.out.println("unknown action");
            gotoSchool();
        };

    }

}
