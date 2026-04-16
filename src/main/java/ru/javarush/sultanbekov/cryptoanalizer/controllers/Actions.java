package ru.javarush.sultanbekov.cryptoanalizer.controllers;

import ru.javarush.sultanbekov.cryptoanalizer.commands.Action;
import ru.javarush.sultanbekov.cryptoanalizer.commands.Decoder;
import ru.javarush.sultanbekov.cryptoanalizer.commands.Encoder;
import ru.javarush.sultanbekov.cryptoanalizer.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());


    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            Action action = value.action;
            return action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}
