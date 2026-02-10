package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.characters.Character;
import edu.narxoz.RPG.characters.Warrior;

public class WarriorFactory extends CharacterFactory {

    protected Character createCharacter() {
        return new Warrior();
    }
}