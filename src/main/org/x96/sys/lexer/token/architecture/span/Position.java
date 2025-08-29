package org.x96.sys.lexer.token.architecture.span;

public record Position(int line, int column, int offset) {

    @Override
    public String toString() {
        return "{" + line + ":" + column + " " + offset + "}";
    }
}
