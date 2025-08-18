package org.x96.sys.foundation.token.architecture;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LexemeTest {
    @Test
    void happy() {
        Lexeme lexeme = new Lexeme((byte) 0xFF);
        assertEquals("0xFF", lexeme.toString());
    }
}
