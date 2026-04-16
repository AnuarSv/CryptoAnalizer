package ru.javarush.sultanbekov.cryptoanalizer.commands;

import ru.javarush.sultanbekov.cryptoanalizer.entity.Result;
import ru.javarush.sultanbekov.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action {
    @Override
    public Result executer(String[] params) {
        // TODO Encoder fun
        return new Result("BruteForce complete", ResultCode.OK);
    }
}
