package org.x96.sys.foundation.token;

import org.x96.sys.foundation.token.architecture.Lexeme;
import org.x96.sys.foundation.token.architecture.span.Span;

import java.util.Objects;

public final class Token {
    private final Kind kind;
    private final Lexeme lexeme;
    private final Span span;
    public String overKind;

    public Token(Kind kind, Lexeme lexeme, Span span) {
        this.kind = kind;
        this.lexeme = lexeme;
        this.span = span;
    }

    @Override
    public String toString() {
        return String.format(
                "Token { Kind[%s] Lexeme[%s] Span[%s] }",
                this.overKind == null ? kind.toString() : this.overKind,
                lexeme.toString(),
                span.toString());
    }

    public Kind kind() {
        return kind;
    }

    public Lexeme lexeme() {
        return lexeme;
    }

    public Span span() {
        return span;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Token) obj;
        return Objects.equals(this.kind, that.kind)
                && Objects.equals(this.lexeme, that.lexeme)
                && Objects.equals(this.span, that.span);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, lexeme, span);
    }

    public Token overKind(String overKind) {
        this.overKind = overKind;
        return this;
    }
}
