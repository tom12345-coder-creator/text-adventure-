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
public class SgtSlipper extends GrownUp implements CharacterActions {

    private int age;
    private String gender;
    private int attack;
    private String nickname;
    private int strength;
    private int health;
    private String name;

    public SgtSlipper(int age, String gender, int strikes, String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.attack = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addAttack() {
        this.attack++;
    }

    public int decreasehealth() {
        return --health;
    }

    public void Punishment(CharacterActions theTroubleMaker) {
        theTroubleMaker.caught();
        System.out.println("you have been apprehended by the police");
    }

    @Override
    public void detain(CharacterActions theTroubleMaker) {
        theTroubleMaker.addAttack();
        System.out.println("You have been caught " + theTroubleMaker.getName() + " now has " + theTroubleMaker.getAttack() + "attacks  ");
    }

    @Override
    public int gethealth() {
        return health;
    }

    @Override
    public void caught() {
        attack += 10;
    }

    @Override
    public int increasehealth() {
        return health++;
    }

    @Override
    public void eat() {
        this.health++;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food");
    }

}
