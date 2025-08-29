package org.x96.sys.lexer.token.architecture;

public record Lexeme(byte b) {

    @Override
    public String toString() {
        return String.format("0x%X", b);
    }
}
