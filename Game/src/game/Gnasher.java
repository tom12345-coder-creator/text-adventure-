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
public class Gnasher extends Dog implements Animals {

    public int age;
    public String gender;
    public String nickname;
    public int strength;
    public int health;
    public String name;
    public static int numOfMis = 5;
    public String Owner;

    public Gnasher(int age, String gender, String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.Owner = "Dennis the menace";
    }

    @Override
    public void bite(CharacterActions thebiten) {
        System.out.println(getName() + "bites " + thebiten.getName() + " when biten they now have " + thebiten.gethealth() + " health left");
    }

    @Override
    public void Ablility(CharacterActions theTarget) {
        System.out.println(getName() + " uses his mega bark at " + theTarget.getName() + " the shock from the mega bark knocks him, now has has " + theTarget.getAttack() + " attacks");
    }

    @Override
    public void Speak() {
        System.out.println(getName() + "says nash nash ");
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
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    public void move() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
