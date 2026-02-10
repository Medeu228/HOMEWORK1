package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.characters.Character;
import edu.narxoz.RPG.characters.Mage;

public class MageFactory extends CharacterFactory {

    protected Character createCharacter() {
        return new Mage();
    }
}