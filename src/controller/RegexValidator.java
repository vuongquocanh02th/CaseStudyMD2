package controller;
import java.util.regex.*;

public class RegexValidator {
    public static boolean validateFileName(String fileName) {
        String regex = "^[a-zA-Z0-9_]+\\\\.txt$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
}
