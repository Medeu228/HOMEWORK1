package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.characters.Character;
import edu.narxoz.RPG.characters.Archer;

public class ArcherFactory extends CharacterFactory {

    protected Character createCharacter() {
        return new Archer();
    }
}