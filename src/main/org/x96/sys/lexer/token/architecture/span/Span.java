package org.x96.sys.lexer.token.architecture.span;

public record Span(Position start, Position end) {

    public int length() {
        if (start.line() == 0) {
            return 0;
        }
        return end.offset() - start.offset();
    }

    @Override
    public String toString() {
        return start + ":" + end;
    }
}
