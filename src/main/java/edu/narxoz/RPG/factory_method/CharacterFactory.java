package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.characters.Character;

public abstract class CharacterFactory {

    public Character create() {
        return createCharacter();
    }

    protected abstract Character createCharacter();
}