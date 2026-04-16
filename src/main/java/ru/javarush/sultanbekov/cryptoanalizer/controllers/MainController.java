package ru.javarush.sultanbekov.cryptoanalizer.controllers;

import ru.javarush.sultanbekov.cryptoanalizer.commands.Action;
import ru.javarush.sultanbekov.cryptoanalizer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] params) {
        Action action = Actions.find(actionName);
        Result result = action.executer(params);
        return result;
    }
}
