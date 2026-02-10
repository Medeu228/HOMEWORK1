package edu.narxoz.RPG.interfaces;

public interface Character {

    String getName();

    int getHealth();

    Weapon getWeapon();

    Armor getArmor();

    void equip(Weapon weapon, Armor armor);
}