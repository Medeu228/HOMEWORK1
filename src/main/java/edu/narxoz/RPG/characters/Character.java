package edu.narxoz.RPG.characters;

import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.interfaces.Weapon;

public interface Character {
    String getName();
    int getHealth();
    Weapon getWeapon();
    Armor getArmor();
    void equip(Weapon weapon, Armor armor);
}