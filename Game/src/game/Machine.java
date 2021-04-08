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
public interface Machine {

    public void Ablility(CharacterActions theTarget);

    public void Speak();

    public String getName();

    public void increaseHealth();

    public int getHealth();

    public int decreasehealth();

    public int gethealth();
}
