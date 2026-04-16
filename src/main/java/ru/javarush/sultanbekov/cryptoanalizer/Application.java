package ru.javarush.sultanbekov.cryptoanalizer;

import ru.javarush.sultanbekov.cryptoanalizer.controllers.MainController;
import ru.javarush.sultanbekov.cryptoanalizer.entity.Result;
import ru.javarush.sultanbekov.cryptoanalizer.exception.AppException;

import java.util.Arrays;

public class Application {
    public MainController mainController;

    public Application() {
        mainController = new MainController();

    }
    public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] params = Arrays.copyOfRange(args, 1, args.length);

            Result result = mainController.doAction(action, params);
        }
        throw new AppException();
    }

}
