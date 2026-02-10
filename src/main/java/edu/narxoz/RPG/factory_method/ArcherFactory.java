package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.characters.Archer;
import edu.narxoz.RPG.characters.Character;

public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Archer();
    }
}