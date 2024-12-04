package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String NAME_REGEX = "^[A-Za-z]+$";
    private static final String RANK_REGEX = "^[A-Za-z]+$";
    private static final String SALARY_REGEX = "^\\d+$";

    public static boolean validateName(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }
    public static boolean validateRank(String rank) {
        return Pattern.matches(RANK_REGEX, rank);
    }
    public static boolean validateSalary(String salary) {
        return Pattern.matches(SALARY_REGEX, salary);
    }
}
