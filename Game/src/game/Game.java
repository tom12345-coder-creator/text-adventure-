/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thomas
 */
public class Game {

    public static void main(String[] args) {
        Treehouse.goToTreehouse();
    }

    private static void explainInfo() {
        System.out.println("this is a text adventure game based around the cartoon series dennis the menace");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void getExplainInfo() {
        explainInfo();
    }

    private static String help() {
        System.out.println("HELP: if your not sure what you can do try the following 1. type go to and a name of a location this will take you to a diffrent location.");
        return ("back to the game");
    }

    public static void GetHelp() {
        help();
    }

    public static void goToRoom() {
        System.out.println("you have gone to your room");
    }

}
