package org.x96.sys.lexer.token.architecture.span;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// ls **/*.java | entr sh -c 'clear && make test-class
// CLASS="org.x96.sys.foundation.tokenizer.token.architecture.SpanTest"'
class SpanTest {

    // ls **/*.java | entr sh -c 'clear && make test-method
    // METHOD="org.x96.sys.foundation.tokenizer.token.architecture.SpanTest#happy"'
    @Test
    void happy() {
        Position a = new Position(3, 2, 1);
        Position b = new Position(6, 5, 4);
        Span s = new Span(a, b);
        assertEquals(a, s.start());
        assertEquals(b, s.end());
        assertEquals(String.format("%s:%s", a.toString(), b.toString()), s.toString());
        assertEquals(b.offset() - a.offset(), s.length());
    }

    @Test
    void happyLengthZeroWhenStartOnLineZero() {
        Position a = new Position(0, 2, 1);
        Position b = new Position(6, 5, 4);
        Span s = new Span(a, b);
        assertEquals(0, s.length());
    }
}
