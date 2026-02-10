package edu.narxoz.RPG.characters;

import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.interfaces.Weapon;

public class Archer implements Character {

    private String name;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Archer() {
        this.name = "Archer";
        this.health = 120;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public Weapon getWeapon() { return weapon; }
    public Armor getArmor() { return armor; }

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }
}