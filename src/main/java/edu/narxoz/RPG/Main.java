package edu.narxoz.RPG;

import edu.narxoz.RPG.characters.Character;
import edu.narxoz.RPG.factory_method.*;
import edu.narxoz.RPG.abstract_factory.*;

public class Main {

    public static void main(String[] args) {


        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.create();
        Character mage = mageFactory.create();
        Character archer = archerFactory.create();


        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();

        warrior.equip(medieval.createWeapon(), medieval.createArmor());
        mage.equip(magic.createWeapon(), magic.createArmor());
        archer.equip(ranger.createWeapon(), ranger.createArmor());


        warrior.showInfo();
        mage.showInfo();
        archer.showInfo();
    }
}