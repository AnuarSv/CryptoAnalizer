package ru.javarush.sultanbekov.cryptoanalizer.controllers;

import ru.javarush.sultanbekov.cryptoanalizer.commands.Action;
import ru.javarush.sultanbekov.cryptoanalizer.commands.Decoder;
import ru.javarush.sultanbekov.cryptoanalizer.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());


    private final Action action;
    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName){
        Actions.valueOf(actionName.toUpperCase());
        Action action = value.action;
    }
}
