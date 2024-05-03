package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class SongsDatabaseTest{
    @Test
    public void testAddSong() {
    	SongsDatabase playlist = new SongsDatabase();
        playlist.addSong("Rap", "Savage");
        assertTrue(playlist.getSongsInGenre("Rap").contains("Savage"));
    }

    @Test
    public void testFindGenreOfSong() {
    	SongsDatabase playlist = new SongsDatabase();
        playlist.addSong("Rap", "Savage");
        assertEquals("Rap", playlist.findGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongsInGenre() {
    	SongsDatabase playlist = new SongsDatabase();
        playlist.addSong("Rap", "Savage");
        playlist.addSong("Rap", "Gin and Juice");
        Set<String> expectedSongs = new HashSet<>(Arrays.asList("Savage", "Gin and Juice"));
        assertEquals(expectedSongs, playlist.getSongsInGenre("Rap"));
    }
}