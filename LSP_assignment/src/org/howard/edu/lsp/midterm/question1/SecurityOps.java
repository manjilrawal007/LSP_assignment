package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String input) {
        String alphanumericText = "";
        String cipherText = "";
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (Character.isDigit(currentChar) || Character.isLetter(currentChar)) {
                alphanumericText += currentChar;
            }
        }
        
        for (int evenIndex = 0; evenIndex < alphanumericText.length(); evenIndex += 2) {
            cipherText += alphanumericText.charAt(evenIndex);
        }
        for (int oddIndex = 1; oddIndex < alphanumericText.length(); oddIndex += 2) {
            cipherText += alphanumericText.charAt(oddIndex);
        }
        
        return cipherText;
    }
}

