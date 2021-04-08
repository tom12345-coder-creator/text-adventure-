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
public class Gnashinator extends Robot implements Machine {

    public int age;
    public String gender;
    public String nickname;
    public int strength;
    public int health;
    public String name;
    public static int numOfMis = 5;
    public String Owner;

    public Gnashinator(int age, String gender, String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.Owner = "Dennis the menace";
    }

    
    public void lazereyes(CharacterActions thebiten) {
        System.out.println(getName() + "shoots lazers at " + thebiten.getName() + " the lazers have hit they now have " + thebiten.gethealth() + " health left");
    }

    @Override
    public void Ablility(CharacterActions theTarget) {
        System.out.println(getName() + " uses his metal claws " + theTarget.getName() + " the the metal claws come out they now have now  " + theTarget.getAttack() + " attacks");
    }

    @Override
    public void Speak() {
        System.out.println(getName() + "says nashinator must destroy ");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void increaseHealth() {
        health++;
    }

    @Override
    public int getHealth() {
        return health;
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

    public void eat() {
        this.health += 10;
        System.out.println("needs nutriants " + this.getName() + "enjoys having their power supply increse health to " + this.getHealth() + "heatlh");
    }

    public void move() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void lasereyes(CharacterActions thebiten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
