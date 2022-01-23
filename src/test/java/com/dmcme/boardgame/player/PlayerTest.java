package com.dmcme.boardgame.player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @BeforeEach
    void setUp() {
        player = new Player("Darren");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verify Player Get Name Test")
    void getName() {
        assertEquals("Darren", player.getName());
        assertNotEquals("Bob", player.getName());
    }

    @Test
    @DisplayName("Verify ToString Test")
    void testToString() {
        assertEquals("Player(name=Darren)", player.toString());
        assertNotEquals("Darren", player.toString());
    }
}