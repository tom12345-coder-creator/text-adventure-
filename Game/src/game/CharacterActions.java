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
public interface CharacterActions {

    public int getAttack();

    public void addAttack();

    public String getName();

    public int decreasehealth();

    public int increasehealth();

    public int gethealth();

    public void caught();

    public void eat();

}
