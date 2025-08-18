package org.x96.sys.foundation.token;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.x96.sys.foundation.token.architecture.Lexeme;
import org.x96.sys.foundation.token.architecture.span.Position;
import org.x96.sys.foundation.token.architecture.span.Span;

class TokenTest {

    @Test
    void happy() {
        Token token =
                new Token(
                        Kind.LATIN_SMALL_LETTER_A,
                        new Lexeme((byte) 0x61),
                        new Span(new Position(3, 4, 5), new Position(4, 5, 6)));

        assertEquals(Kind.LATIN_SMALL_LETTER_A, token.kind());
        assertEquals(0x61, token.lexeme().b());
        assertEquals(
                "Token { Kind[LATIN_SMALL_LETTER_A] Lexeme[0x61] Span[{3:4 5}:{4:5 6}] }",
                token.toString());

        token.overKind("a");
        assertEquals("Token { Kind[a] Lexeme[0x61] Span[{3:4 5}:{4:5 6}] }", token.toString());
        assertEquals(Kind.LATIN_SMALL_LETTER_A, token.kind());
        assertEquals(3, token.span().start().line());
        assertEquals(4, token.span().start().column());
        assertEquals(5, token.span().start().offset());

        assertEquals(4, token.span().end().line());
        assertEquals(5, token.span().end().column());
        assertEquals(6, token.span().end().offset());

        Token t2 =
                new Token(
                        Kind.LATIN_SMALL_LETTER_A,
                        new Lexeme((byte) 0x61),
                        new Span(new Position(3, 4, 5), new Position(4, 5, 6)));
        assertEquals(token, t2);

        Token t3 =
                new Token(
                        Kind.LATIN_SMALL_LETTER_A,
                        new Lexeme((byte) 0x61),
                        new Span(new Position(3, 4, 5), new Position(4, 5, 7)));
        assertNotEquals(t2, t3);

        Token t4 =
                new Token(
                        Kind.LATIN_SMALL_LETTER_A,
                        new Lexeme((byte) 0x62),
                        new Span(new Position(3, 4, 5), new Position(4, 5, 6)));
        assertNotEquals(token, t4);
        assertNotEquals(token, null);
        assertNotEquals(token, 0);
        assertNotEquals(token, "0");
    }

    @Test
    void equalsAndHashCode() {
        Lexeme lexeme1 = new Lexeme((byte) 0x61);
        Kind kind1 = Kind.LATIN_SMALL_LETTER_A;
        Position start1 = new Position(1, 1, 1);
        Position end1 = new Position(1, 2, 2);
        Span span1 = new Span(start1, end1);

        Lexeme lexeme2 = new Lexeme((byte) 0x61);
        Kind kind2 = Kind.LATIN_SMALL_LETTER_A;
        Position start2 = new Position(1, 1, 1);
        Position end2 = new Position(1, 2, 2);
        Span span2 = new Span(start2, end2);

        Token token1 = new Token(kind1, lexeme1, span1);
        Token token2 = new Token(kind2, lexeme2, span2);
        Token token3 = new Token(Kind.LATIN_CAPITAL_LETTER_A, lexeme1, span1);

        // Reflexivo
        assertEquals(token1, token1);

        // Simétrico
        assertEquals(token1, token2);
        assertEquals(token2, token1);

        // Consistente com hashCode
        assertEquals(token1.hashCode(), token2.hashCode());

        // Diferente
        assertNotEquals(token1, token3);
    }

    @Test
    void lexemeEqualsAndHashCode() {
        Lexeme lexeme1 = new Lexeme((byte) 0x41);
        Lexeme lexeme2 = new Lexeme((byte) 0x41);
        Lexeme lexeme3 = new Lexeme((byte) 0x42);

        // Reflexive
        assertEquals(lexeme1, lexeme1);
        // Symmetric
        assertEquals(lexeme1, lexeme2);
        assertEquals(lexeme2, lexeme1);
        // Consistent hashCode
        assertEquals(lexeme1.hashCode(), lexeme2.hashCode());
        // Inequality
        assertNotEquals(lexeme1, lexeme3);
    }

    @Test
    void spanEqualsAndHashCode() {
        Position start1 = new Position(2, 3, 4);
        Position end1 = new Position(2, 5, 6);
        Span span1 = new Span(start1, end1);
        // identical values
        Position start2 = new Position(2, 3, 4);
        Position end2 = new Position(2, 5, 6);
        Span span2 = new Span(start2, end2);
        // different
        Position start3 = new Position(2, 3, 4);
        Position end3 = new Position(2, 7, 8);
        Span span3 = new Span(start3, end3);

        // Reflexive
        assertEquals(span1, span1);
        // Symmetric
        assertEquals(span1, span2);
        assertEquals(span2, span1);
        // Consistent hashCode
        assertEquals(span1.hashCode(), span2.hashCode());
        // Inequality
        assertNotEquals(span1, span3);
    }

    @Test
    void positionEqualsAndHashCode() {
        Position pos1 = new Position(5, 6, 7);
        Position pos2 = new Position(5, 6, 7);
        Position pos3 = new Position(5, 6, 8);

        // Reflexive
        assertEquals(pos1, pos1);
        // Symmetric
        assertEquals(pos1, pos2);
        assertEquals(pos2, pos1);
        // Consistent hashCode
        assertEquals(pos1.hashCode(), pos2.hashCode());
        // Inequality
        assertNotEquals(pos1, pos3);
    }
}
