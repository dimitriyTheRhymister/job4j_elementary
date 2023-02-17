package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty()) {
            valid = false;
        } else if (isUpperCase(name.codePointAt(0))) {
            valid = false;
        }
        if (isNumeric(name)) {
            valid = false;
        }
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!(isSpecialSymbol(code) || isLowerLatinLetter(code) || isUpperLatinLetter(code) || isDigit(code))) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}