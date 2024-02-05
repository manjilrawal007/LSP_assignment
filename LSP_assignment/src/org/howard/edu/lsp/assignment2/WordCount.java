package org.howard.edu.lsp.assignment2;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        
        String fileName = "LSP_assignment/src/words.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line, wordCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        wordCount.forEach((word, count) -> System.out.println(word + " " + count));
    }

    private static void processLine(String line, Map<String, Integer> wordCount) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z']", "").toLowerCase();

            
            if (word.length() > 3) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
    }
}