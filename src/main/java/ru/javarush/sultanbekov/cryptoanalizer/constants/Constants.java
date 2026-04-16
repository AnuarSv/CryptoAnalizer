package ru.javarush.sultanbekov.cryptoanalizer.constants;

import java.io.File;

public class Constants {
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cypher = "0123456789";
    private static final String z = "!&#$%^&*(){}[]";

    public static final String ALPHABET = rus + eng + rus.toUpperCase() + eng.toUpperCase() + cypher + z;
    public static final String TXT_FOLDER = System.getProperty("user.dir") + File.separator + "text" + File.separator;
}
