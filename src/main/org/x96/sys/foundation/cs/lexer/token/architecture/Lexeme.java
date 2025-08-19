package org.x96.sys.foundation.cs.lexer.token.architecture;

public record Lexeme(byte b) {

    @Override
    public String toString() {
        return String.format("0x%X", b);
    }
}
