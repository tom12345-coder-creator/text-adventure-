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
public class LivingRoom implements Location {

    private String location;

    public LivingRoom(String location) {

        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void ExplainLocation() {
        System.out.println("your are in the living room");
    }

    public static void goToLivingRoom() {
        DennisMum Mum = new DennisMum(38, "Female", 0, "Dennis Mum", 5, 100, "Sandra Menace");
        DennisDad Dad = new DennisDad(40, "Male", 0, "Dennis Dad", 25, 100, "Dennis Menace senior");
        Dennis DennisM = new Dennis(10, "Male", 0, "Dennis the Menace", 15, 100, "Dennis", 0, 0, 0, 0, 0);
        DennisM.lost();
        LivingRoom lounge = new LivingRoom("you are in the lounge of Dennis's house");
        System.out.println("you are in the loughe with dennis's mum and dad, you can talk to them or go toanother area");
        Scanner input1 = new Scanner(System.in);
        System.out.println("what you would like to do next");
        String responce = input1.nextLine();

        if (responce.equals("go to your room")) {
            Game.goToRoom();
        } else if (responce.equals("go to treehouse")) {
            Treehouse.goToTreehouse();
        } else if (responce.equals("go to shops")) {
            Shops.gotoShops();
        } else if (responce.equals("talk to mum")) {
            System.out.println("Hey dennis iv'e been meaning to ask you about your homework, a little birdy told me you've got a pile of work to be doing have you done it yet");
            Scanner input2 = new Scanner(System.in);
            System.out.println("Did you do your homework type in your responce");
            String reHomework = input2.nextLine();
            if (reHomework.equals("yes")) {
                System.out.println("oh right that's good I'll let your teacher know then");
                goToLivingRoom();
            } else {
                System.out.println("hmm I thought so");
                Mum.Punishment(DennisM);
            }

        }
    }

    @Override
    public int PickUpItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setitem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
