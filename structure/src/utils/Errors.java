package utils;

import javax.swing.JOptionPane;

public class Errors {
    public static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
