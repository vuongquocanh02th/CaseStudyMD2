package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexValidator {
    private static final String NAME_PATTERN = "^[A-Z][a-zA-Z ]*$";

    public static boolean validateName(String name) {
        // Kiểm tra null hoặc chuỗi trống
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        // Tạo một Pattern từ regex
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        // Kiểm tra tên với regex
        return matcher.matches();
    }
}
