/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author thomas
 */
public class Dennis extends Kid implements CharacterActions {

    public int age;
    public  String gender;
    private static int attack;
    public String nickname;
    private int strength;
    private  static int health;
    public  final String name;
    public int pies;
    public int apples;
    public int Disguise;
    public int SkateBoard;
    public  int Catapult;
    private int numOfMis = 5;
    public  String pets;

    public Dennis(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies, int apples, int Disguise, int SkateBoard, int Catapult) {
        this.age = age;
        this.gender = gender;
        Dennis.attack = strikes;
        this.nickname = nickname;
        this.strength = strength;
        Dennis.health = health;
        this.name = name;
        this.pets = "Gnasher the dog" + "Joe the cow" + "Rasher the dog";
        this.pies = pies;
        this.apples = apples;
        this.Disguise = Disguise;
        this.SkateBoard = SkateBoard;
        this.Catapult = Catapult;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public int getPies() {
        return pies;
    }

    public int addPies() {
        pies++;
        return pies;
    }

    public int getApples() {
        return apples;
    }

    public int addApples() {
        apples++;
        return apples;
    }

    public int getSkateBoard() {
        return SkateBoard;
    }

    public int addSkateBoard() {
        SkateBoard++;
        return SkateBoard;
    }

    public int getDisguise() {
        return Disguise;
    }

    public int addDisguise() {
        Disguise++;
        return Disguise;
    }

    public int getCatapult() {
        return Catapult;
    }

    public int addCatapult() {
        Catapult++;
        return Catapult;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStrikes(int numst) {
        Dennis.attack = numst;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }
    
    
    /**
     *created a method that will tell the player when they have lost the fight 
     * 
     */
    public void lost() {
        while (Dennis.attack >= 10) {
            if (Dennis.attack == 10) {
                System.out.println("You have lost better luck next time ");
            }
        }
    }

    public void pickItem(Object theItem) {
        System.out.println("you have found an item");
    }

    /**
     *this is the method that the player can use to attack enemy within the game 
     * 
     */
    @Override
    public void shootSling(CharacterActions theEnemy) {
        theEnemy.decreasehealth();
        System.out.println("you take aim with your slingshoot " + theEnemy.getName() + " you hit them in the arm with it leaveing the with." + theEnemy.gethealth() + " left ");
    }
    /**
     *created a method that will tell the player when they have lost the game 
     * 
     * 
     */
    public static void loseGame() {
        System.out.println("you have lost the game");
    }

    @Override
    public void caught() {
        loseGame();
    }

    @Override
    public void TakelItem() {

    }

    /**
     *an alternative way for players to attack characters  
     * 
     */
    public void playPrank(CharacterActions theEn) {
        theEn.addAttack();
        System.out.println(this.getName() + "has played a prank on " + theEn.getName() + " the shock renders them with " + theEn.getAttack() + "health left");
    }

    public String getName() {
        return name;
    }

    @Override

    public void addAttack() {
        this.attack++;
    }

    @Override
    public void makeMischief(CharacterActions theEn) {
        if (numOfMis < 0) {
            theEn.addAttack();
            theEn.addAttack();
            System.out.println(this.getName() + "has pranked " + theEn.getName() + " the prankk has left the eniemie with  " + theEn.getAttack() + "health");
        } else {
            System.out.println("dont know what other pranks that can be pulled on people ");
        }
    }

    @Override
    public int decreasehealth() {
        health--;
        return health;
    }

    @Override
    public int gethealth() {
        return health;
    }

    public void showSrikes() {
        System.out.println(attack);

    }
    /**
     *a method that the players can use to attack with the items that they collect throughout the game
     * 
     */
    public int throwpie(CharacterActions theEn) {
        if (pies > 0) {
            theEn.addAttack();
            System.out.println("you started trowing a pie at " + theEn.getName() + " you hit them in the face with the pie they now have " + theEn.getAttack() + "health left");
            pies--;
        } else {
            System.out.println("you have ran out of pies try and get more");
        }
        return pies;
    }

    @Override
    public int increasehealth() {
        return this.health++;
    }

    @Override
    public void eat() {
        this.health += 10;
        System.out.println("this is amazing" + this.getName() + "devours the food and now has " + this.gethealth() + "heatlh");
    }

}
