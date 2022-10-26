package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistance() {
        assertEquals(StringUtils.levenshteinDistance("chat", "chat"), 0);
        assertEquals(StringUtils.levenshteinDistance("chat", "chats"), 1);
        assertEquals(StringUtils.levenshteinDistance("chats", "chat"), 1);
        assertEquals(StringUtils.levenshteinDistance("machin", "machine"), 1);

        assertEquals(StringUtils.levenshteinDistance("aviron", "avion"), 1);
        assertEquals(StringUtils.levenshteinDistance("distance", "instance"), 2);
        assertNotEquals(StringUtils.levenshteinDistance("chien", "chine"), 1);
        assertEquals(StringUtils.levenshteinDistance("chien", "chine"), 2);

        assertNotEquals(StringUtils.levenshteinDistance("chien", null), 2);
        assertNotEquals(StringUtils.levenshteinDistance(null, "chine"), 2);
        assertEquals(StringUtils.levenshteinDistance(null, null), -1);
    }
}