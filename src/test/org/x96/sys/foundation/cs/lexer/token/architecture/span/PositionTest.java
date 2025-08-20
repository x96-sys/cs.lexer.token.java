package org.x96.sys.foundation.cs.lexer.token.architecture.span;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

    // ls **/*.java | entr sh -c 'clear && make test-method
    // METHOD="org.x96.sys.foundation.tokenizer.token.architecture.PositionTest#happy"'
    @Test
    void happy() {
        int line = 0;
        int column = 1;
        int offset = 2;

        Position position = new Position(line, column, offset);
        assertEquals(0, position.line());
        assertEquals(1, position.column());
        assertEquals(2, position.offset());
        assertEquals(String.format("{%d:%d %d}", line, column, offset), position.toString());
    }
}
