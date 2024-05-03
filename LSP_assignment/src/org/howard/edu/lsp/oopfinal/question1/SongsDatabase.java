package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> songsMap = new HashMap<>();

    /* Method to add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        songsMap.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    /* Method to return the genre of a song title */
    public String findGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : songsMap.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; // Returns null if the songTitle is not found
    }

    /* Method to return the set of songs for a given genre */
    public Set<String> getSongsInGenre(String genre) {
        return songsMap.getOrDefault(genre, new HashSet<>());
    }
}
