package ru.javarush.sultanbekov.cryptoanalizer.commands;

import ru.javarush.sultanbekov.cryptoanalizer.entity.Result;

public interface Action {
    Result executer(String[] params);
}
