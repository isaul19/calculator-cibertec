package utils;

public class CalculatorUtils {
    public static boolean isValidStudent(String student) {
        return student != null && !student.trim().isEmpty();
    }

    public static boolean isValidNote(String note) {
        try {
            double value = Double.parseDouble(note);
            return value >= 0 && value <= 20;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
