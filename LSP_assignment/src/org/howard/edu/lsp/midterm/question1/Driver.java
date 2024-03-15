package org.howard.edu.lsp.midterm.question1;

public class Driver {
    public static void main(String[] args) {
        String originalText = "I love CSCI363";
        System.out.println("The original string is: " + originalText + ", and the encrypted string is: " + SecurityOps.encrypt(originalText));
        
        originalText = " HU YOU KNOW";
        System.out.println("The original string is: " + originalText + ", and the encrypted string is: " + SecurityOps.encrypt(originalText));

    }
}

