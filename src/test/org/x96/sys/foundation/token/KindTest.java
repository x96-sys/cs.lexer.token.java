package org.x96.sys.foundation.token;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class KindTest {
    @Test
    void happyIs() {
        assertEquals(Kind.UNKNOWN, Kind.is(-3));
        assertEquals(Kind.UNKNOWN, Kind.is(-2));
        assertEquals(Kind.UNKNOWN, Kind.is(-1));

        assertEquals(Kind.NULL, Kind.is((byte) 0x0));
        assertEquals(Kind.NULL, Kind.is((byte) 0x0));
        assertEquals(Kind.SOH, Kind.is((byte) 0x1));
        assertEquals(Kind.STX, Kind.is((byte) 0x2));
        assertEquals(Kind.ETX, Kind.is((byte) 0x3));
        assertEquals(Kind.EOT, Kind.is((byte) 0x4));
        assertEquals(Kind.ENQ, Kind.is((byte) 0x5));
        assertEquals(Kind.ACK, Kind.is((byte) 0x6));
        assertEquals(Kind.BEL, Kind.is((byte) 0x7));
        assertEquals(Kind.BS, Kind.is((byte) 0x8));
        assertEquals(Kind.HT, Kind.is((byte) 0x9));
        assertEquals(Kind.LF, Kind.is((byte) 0xA));
        assertEquals(Kind.VT, Kind.is((byte) 0xB));
        assertEquals(Kind.FF, Kind.is((byte) 0xC));
        assertEquals(Kind.CR, Kind.is((byte) 0xD));
        assertEquals(Kind.SO, Kind.is((byte) 0xE));
        assertEquals(Kind.SI, Kind.is((byte) 0xF));

        assertEquals(Kind.DLE, Kind.is((byte) 0x10));
        assertEquals(Kind.DC1, Kind.is((byte) 0x11));
        assertEquals(Kind.DC2, Kind.is((byte) 0x12));
        assertEquals(Kind.DC3, Kind.is((byte) 0x13));
        assertEquals(Kind.DC4, Kind.is((byte) 0x14));
        assertEquals(Kind.NAK, Kind.is((byte) 0x15));
        assertEquals(Kind.SYN, Kind.is((byte) 0x16));
        assertEquals(Kind.ETB, Kind.is((byte) 0x17));
        assertEquals(Kind.CAN, Kind.is((byte) 0x18));
        assertEquals(Kind.EM, Kind.is((byte) 0x19));
        assertEquals(Kind.SUB, Kind.is((byte) 0x1A));
        assertEquals(Kind.ESC, Kind.is((byte) 0x1B));
        assertEquals(Kind.FS, Kind.is((byte) 0x1C));
        assertEquals(Kind.GS, Kind.is((byte) 0x1D));
        assertEquals(Kind.RS, Kind.is((byte) 0x1E));
        assertEquals(Kind.US, Kind.is((byte) 0x1F));

        assertEquals(Kind.SPACE, Kind.is((byte) 0x20));
        assertEquals(Kind.EXCLAMATION_MARK, Kind.is((byte) 0x21));
        assertEquals(Kind.QUOTATION_MARK, Kind.is((byte) 0x22));
        assertEquals(Kind.NUMBER_SIGN, Kind.is((byte) 0x23));
        assertEquals(Kind.DOLLAR_SIGN, Kind.is((byte) 0x24));
        assertEquals(Kind.PERCENT_SIGN, Kind.is((byte) 0x25));
        assertEquals(Kind.AMPERSAND, Kind.is((byte) 0x26));
        assertEquals(Kind.APOSTROPHE, Kind.is((byte) 0x27));
        assertEquals(Kind.LEFT_PARENTHESIS, Kind.is((byte) 0x28));
        assertEquals(Kind.RIGHT_PARENTHESIS, Kind.is((byte) 0x29));
        assertEquals(Kind.ASTERISK, Kind.is((byte) 0x2A));
        assertEquals(Kind.PLUS, Kind.is((byte) 0x2B));
        assertEquals(Kind.COMMA, Kind.is((byte) 0x2C));
        assertEquals(Kind.HYPHEN_MINUS, Kind.is((byte) 0x2D));
        assertEquals(Kind.FULL_STOP, Kind.is((byte) 0x2E));
        assertEquals(Kind.SOLIDUS, Kind.is((byte) 0x2F));

        assertEquals(Kind.DIGIT_ZERO, Kind.is((byte) 0x30));
        assertEquals(Kind.DIGIT_ONE, Kind.is((byte) 0x31));
        assertEquals(Kind.DIGIT_TWO, Kind.is((byte) 0x32));
        assertEquals(Kind.DIGIT_THREE, Kind.is((byte) 0x33));
        assertEquals(Kind.DIGIT_FOUR, Kind.is((byte) 0x34));
        assertEquals(Kind.DIGIT_FIVE, Kind.is((byte) 0x35));
        assertEquals(Kind.DIGIT_SIX, Kind.is((byte) 0x36));
        assertEquals(Kind.DIGIT_SEVEN, Kind.is((byte) 0x37));
        assertEquals(Kind.DIGIT_EIGHT, Kind.is((byte) 0x38));
        assertEquals(Kind.DIGIT_NINE, Kind.is((byte) 0x39));
        assertEquals(Kind.COLON, Kind.is((byte) 0x3A));
        assertEquals(Kind.SEMICOLON, Kind.is((byte) 0x3B));
        assertEquals(Kind.LESS_THAN_SIGN, Kind.is((byte) 0x3C));
        assertEquals(Kind.EQUALS, Kind.is((byte) 0x3D));
        assertEquals(Kind.GREATER_THAN_SIGN, Kind.is((byte) 0x3E));
        assertEquals(Kind.QUESTION_MARK, Kind.is((byte) 0x3F));

        assertEquals(Kind.COMMERCIAL_AT, Kind.is((byte) 0x40));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_A, Kind.is((byte) 0x41));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_B, Kind.is((byte) 0x42));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_C, Kind.is((byte) 0x43));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_D, Kind.is((byte) 0x44));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_E, Kind.is((byte) 0x45));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_F, Kind.is((byte) 0x46));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_G, Kind.is((byte) 0x47));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_H, Kind.is((byte) 0x48));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_I, Kind.is((byte) 0x49));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_J, Kind.is((byte) 0x4A));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_K, Kind.is((byte) 0x4B));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_L, Kind.is((byte) 0x4C));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_M, Kind.is((byte) 0x4D));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_N, Kind.is((byte) 0x4E));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_O, Kind.is((byte) 0x4F));

        assertEquals(Kind.LATIN_CAPITAL_LETTER_P, Kind.is((byte) 0x50));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_Q, Kind.is((byte) 0x51));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_R, Kind.is((byte) 0x52));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_S, Kind.is((byte) 0x53));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_T, Kind.is((byte) 0x54));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_U, Kind.is((byte) 0x55));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_V, Kind.is((byte) 0x56));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_W, Kind.is((byte) 0x57));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_X, Kind.is((byte) 0x58));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_Y, Kind.is((byte) 0x59));
        assertEquals(Kind.LATIN_CAPITAL_LETTER_Z, Kind.is((byte) 0x5A));
        assertEquals(Kind.LEFT_SQUARE_BRACKET, Kind.is((byte) 0x5B));
        assertEquals(Kind.REVERSE_SOLIDUS, Kind.is((byte) 0x5C));
        assertEquals(Kind.RIGHT_SQUARE_BRACKET, Kind.is((byte) 0x5D));
        assertEquals(Kind.CIRCUMFLEX_ACCENT, Kind.is((byte) 0x5E));
        assertEquals(Kind.LOW_LINE, Kind.is((byte) 0x5F));

        assertEquals(Kind.GRAVE_ACCENT, Kind.is((byte) 0x60));
        assertEquals(Kind.LATIN_SMALL_LETTER_A, Kind.is((byte) 0x61));
        assertEquals(Kind.LATIN_SMALL_LETTER_B, Kind.is((byte) 0x62));
        assertEquals(Kind.LATIN_SMALL_LETTER_C, Kind.is((byte) 0x63));
        assertEquals(Kind.LATIN_SMALL_LETTER_D, Kind.is((byte) 0x64));
        assertEquals(Kind.LATIN_SMALL_LETTER_E, Kind.is((byte) 0x65));
        assertEquals(Kind.LATIN_SMALL_LETTER_F, Kind.is((byte) 0x66));
        assertEquals(Kind.LATIN_SMALL_LETTER_G, Kind.is((byte) 0x67));
        assertEquals(Kind.LATIN_SMALL_LETTER_H, Kind.is((byte) 0x68));
        assertEquals(Kind.LATIN_SMALL_LETTER_I, Kind.is((byte) 0x69));
        assertEquals(Kind.LATIN_SMALL_LETTER_J, Kind.is((byte) 0x6A));
        assertEquals(Kind.LATIN_SMALL_LETTER_K, Kind.is((byte) 0x6B));
        assertEquals(Kind.LATIN_SMALL_LETTER_L, Kind.is((byte) 0x6C));
        assertEquals(Kind.LATIN_SMALL_LETTER_M, Kind.is((byte) 0x6D));
        assertEquals(Kind.LATIN_SMALL_LETTER_N, Kind.is((byte) 0x6E));
        assertEquals(Kind.LATIN_SMALL_LETTER_O, Kind.is((byte) 0x6F));

        assertEquals(Kind.LATIN_SMALL_LETTER_P, Kind.is((byte) 0x70));
        assertEquals(Kind.LATIN_SMALL_LETTER_Q, Kind.is((byte) 0x71));
        assertEquals(Kind.LATIN_SMALL_LETTER_R, Kind.is((byte) 0x72));
        assertEquals(Kind.LATIN_SMALL_LETTER_S, Kind.is((byte) 0x73));
        assertEquals(Kind.LATIN_SMALL_LETTER_T, Kind.is((byte) 0x74));
        assertEquals(Kind.LATIN_SMALL_LETTER_U, Kind.is((byte) 0x75));
        assertEquals(Kind.LATIN_SMALL_LETTER_V, Kind.is((byte) 0x76));
        assertEquals(Kind.LATIN_SMALL_LETTER_W, Kind.is((byte) 0x77));
        assertEquals(Kind.LATIN_SMALL_LETTER_X, Kind.is((byte) 0x78));
        assertEquals(Kind.LATIN_SMALL_LETTER_Y, Kind.is((byte) 0x79));
        assertEquals(Kind.LATIN_SMALL_LETTER_Z, Kind.is((byte) 0x7A));
        assertEquals(Kind.LEFT_CURLY_BRACKET, Kind.is((byte) 0x7B));
        assertEquals(Kind.VERTICAL_LINE, Kind.is((byte) 0x7C));
        assertEquals(Kind.RIGHT_CURLY_BRACKET, Kind.is((byte) 0x7D));
        assertEquals(Kind.TILDE, Kind.is((byte) 0x7E));
        assertEquals(Kind.DELETE, Kind.is((byte) 0x7F));

        assertEquals(Kind.UNKNOWN, Kind.is(0x80));
        assertEquals(Kind.UNKNOWN, Kind.is(0x81));
    }

    @Test
    void happyIsNull() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x0) assertTrue(Kind.isNull((byte) i));
            if (i != 0x0) assertFalse(Kind.isNull((byte) i));
        }
    }

    @Test
    void happyIsSoh() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1) assertTrue(Kind.isSoh((byte) i));
            if (i != 0x1) assertFalse(Kind.isSoh((byte) i));
        }
    }

    @Test
    void happyIsStx() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2) assertTrue(Kind.isStx((byte) i));
            if (i != 0x2) assertFalse(Kind.isStx((byte) i));
        }
    }

    @Test
    void happyIsEtx() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3) assertTrue(Kind.isEtx((byte) i));
            if (i != 0x3) assertFalse(Kind.isEtx((byte) i));
        }
    }

    @Test
    void happyIsEot() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4) assertTrue(Kind.isEot((byte) i));
            if (i != 0x4) assertFalse(Kind.isEot((byte) i));
        }
    }

    @Test
    void happyIsEnq() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5) assertTrue(Kind.isEnq((byte) i));
            if (i != 0x5) assertFalse(Kind.isEnq((byte) i));
        }
    }

    @Test
    void happyIsAck() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6) assertTrue(Kind.isAck((byte) i));
            if (i != 0x6) assertFalse(Kind.isAck((byte) i));
        }
    }

    @Test
    void happyIsBel() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7) assertTrue(Kind.isBel((byte) i));
            if (i != 0x7) assertFalse(Kind.isBel((byte) i));
        }
    }

    @Test
    void happyIsBs() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x8) assertTrue(Kind.isBs((byte) i));
            if (i != 0x8) assertFalse(Kind.isBs((byte) i));
        }
    }

    @Test
    void happyIsHt() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x9) assertTrue(Kind.isHt((byte) i));
            if (i != 0x9) assertFalse(Kind.isHt((byte) i));
        }
    }

    @Test
    void happyIsLf() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xA) assertTrue(Kind.isLf((byte) i));
            if (i != 0xA) assertFalse(Kind.isLf((byte) i));
        }
    }

    @Test
    void happyIsVt() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xB) assertTrue(Kind.isVt((byte) i));
            if (i != 0xB) assertFalse(Kind.isVt((byte) i));
        }
    }

    @Test
    void happyIsFf() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xC) assertTrue(Kind.isFf((byte) i));
            if (i != 0xC) assertFalse(Kind.isFf((byte) i));
        }
    }

    @Test
    void happyIsCr() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xD) assertTrue(Kind.isCr((byte) i));
            if (i != 0xD) assertFalse(Kind.isCr((byte) i));
        }
    }

    @Test
    void happyIsSo() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xE) assertTrue(Kind.isSo((byte) i));
            if (i != 0xE) assertFalse(Kind.isSo((byte) i));
        }
    }

    @Test
    void happyIsSi() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0xF) assertTrue(Kind.isSi((byte) i));
            if (i != 0xF) assertFalse(Kind.isSi((byte) i));
        }
    }

    @Test
    void happyIsDle() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x10) assertTrue(Kind.isDle((byte) i));
            if (i != 0x10) assertFalse(Kind.isDle((byte) i));
        }
    }

    @Test
    void happyIsDc1() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x11) assertTrue(Kind.isDc1((byte) i));
            if (i != 0x11) assertFalse(Kind.isDc1((byte) i));
        }
    }

    @Test
    void happyIsDc2() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x12) assertTrue(Kind.isDc2((byte) i));
            if (i != 0x12) assertFalse(Kind.isDc2((byte) i));
        }
    }

    @Test
    void happyIsDc3() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x13) assertTrue(Kind.isDc3((byte) i));
            if (i != 0x13) assertFalse(Kind.isDc3((byte) i));
        }
    }

    @Test
    void happyIsDc4() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x14) assertTrue(Kind.isDc4((byte) i));
            if (i != 0x14) assertFalse(Kind.isDc4((byte) i));
        }
    }

    @Test
    void happyIsNak() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x15) assertTrue(Kind.isNak((byte) i));
            if (i != 0x15) assertFalse(Kind.isNak((byte) i));
        }
    }

    @Test
    void happyIsSyn() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x16) assertTrue(Kind.isSyn((byte) i));
            if (i != 0x16) assertFalse(Kind.isSyn((byte) i));
        }
    }

    @Test
    void happyIsEtb() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x17) assertTrue(Kind.isEtb((byte) i));
            if (i != 0x17) assertFalse(Kind.isEtb((byte) i));
        }
    }

    @Test
    void happyIsCan() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x18) assertTrue(Kind.isCan((byte) i));
            if (i != 0x18) assertFalse(Kind.isCan((byte) i));
        }
    }

    @Test
    void happyIsEm() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x19) assertTrue(Kind.isEm((byte) i));
            if (i != 0x19) assertFalse(Kind.isEm((byte) i));
        }
    }

    @Test
    void happyIsSub() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1A) assertTrue(Kind.isSub((byte) i));
            if (i != 0x1A) assertFalse(Kind.isSub((byte) i));
        }
    }

    @Test
    void happyIsEsc() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1B) assertTrue(Kind.isEsc((byte) i));
            if (i != 0x1B) assertFalse(Kind.isEsc((byte) i));
        }
    }

    @Test
    void happyIsFs() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1C) assertTrue(Kind.isFs((byte) i));
            if (i != 0x1C) assertFalse(Kind.isFs((byte) i));
        }
    }

    @Test
    void happyIsGs() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1D) assertTrue(Kind.isGs((byte) i));
            if (i != 0x1D) assertFalse(Kind.isGs((byte) i));
        }
    }

    @Test
    void happyIsRs() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1E) assertTrue(Kind.isRs((byte) i));
            if (i != 0x1E) assertFalse(Kind.isRs((byte) i));
        }
    }

    @Test
    void happyIsUs() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x1F) assertTrue(Kind.isUs((byte) i));
            if (i != 0x1F) assertFalse(Kind.isUs((byte) i));
        }
    }

    // -----------------------------------------

    // -----------------------------------------

    @Test
    void happyIsSpace() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x20) assertTrue(Kind.isSpace((byte) i));
            if (i != 0x20) assertFalse(Kind.isSpace((byte) i));
        }
    }

    @Test
    void happyIsExclamationMark() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x21) assertTrue(Kind.isExclamationMark((byte) i));
            if (i != 0x21) assertFalse(Kind.isExclamationMark((byte) i));
        }
    }

    @Test
    void happyIsQuotationMark() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x22) assertTrue(Kind.isQuotationMark((byte) i));
            if (i != 0x22) assertFalse(Kind.isQuotationMark((byte) i));
        }
    }

    @Test
    void happyIsNumberSign() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x23) assertTrue(Kind.isNumberSign((byte) i));
            if (i != 0x23) assertFalse(Kind.isNumberSign((byte) i));
        }
    }

    @Test
    void happyIsDollarSign() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x24) assertTrue(Kind.isDollarSign((byte) i));
            if (i != 0x24) assertFalse(Kind.isDollarSign((byte) i));
        }
    }

    @Test
    void happyIsPercentSign() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x25) assertTrue(Kind.isPercentSign((byte) i));
            if (i != 0x25) assertFalse(Kind.isPercentSign((byte) i));
        }
    }

    @Test
    void happyIsAmpersand() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x26) assertTrue(Kind.isAmpersand((byte) i));
            if (i != 0x26) assertFalse(Kind.isAmpersand((byte) i));
        }
    }

    @Test
    void happyIsApostrophe() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x27) assertTrue(Kind.isApostrophe((byte) i));
            if (i != 0x27) assertFalse(Kind.isApostrophe((byte) i));
        }
    }

    @Test
    void happyIsLeftParenthesis() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x28) assertTrue(Kind.isLeftParenthesis((byte) i));
            if (i != 0x28) assertFalse(Kind.isLeftParenthesis((byte) i));
        }
    }

    @Test
    void happyIsRightParenthesis() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x29) assertTrue(Kind.isRightParenthesis((byte) i));
            if (i != 0x29) assertFalse(Kind.isRightParenthesis((byte) i));
        }
    }

    @Test
    void happyIsAsterisk() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2A) assertTrue(Kind.isAsterisk((byte) i));
            if (i != 0x2A) assertFalse(Kind.isAsterisk((byte) i));
        }
    }

    @Test
    void happyIsPlus() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2B) assertTrue(Kind.isPlus((byte) i));
            if (i != 0x2B) assertFalse(Kind.isPlus((byte) i));
        }
    }

    @Test
    void happyIsComma() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2C) assertTrue(Kind.isComma((byte) i));
            if (i != 0x2C) assertFalse(Kind.isComma((byte) i));
        }
    }

    @Test
    void happyIsHyphenMinus() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2D) assertTrue(Kind.isHyphenMinus((byte) i));
            if (i != 0x2D) assertFalse(Kind.isHyphenMinus((byte) i));
        }
    }

    @Test
    void happyIsFullStop() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2E) assertTrue(Kind.isFullStop((byte) i));
            if (i != 0x2E) assertFalse(Kind.isFullStop((byte) i));
        }
    }

    @Test
    void happyIsSolidus() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x2F) assertTrue(Kind.isSolidus((byte) i));
            if (i != 0x2F) assertFalse(Kind.isSolidus((byte) i));
        }
    }

    // -----------------------------------------

    @Test
    void happyIsDigitZero() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x30) assertTrue(Kind.isDigitZero((byte) i));
            if (i != 0x30) assertFalse(Kind.isDigitZero((byte) i));
        }
    }

    @Test
    void happyIsDigitOne() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x31) assertTrue(Kind.isDigitOne((byte) i));
            if (i != 0x31) assertFalse(Kind.isDigitOne((byte) i));
        }
    }

    @Test
    void happyIsDigitTwo() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x32) assertTrue(Kind.isDigitTwo((byte) i));
            if (i != 0x32) assertFalse(Kind.isDigitTwo((byte) i));
        }
    }

    @Test
    void happyIsDigitThree() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x33) assertTrue(Kind.isDigitThree((byte) i));
            if (i != 0x33) assertFalse(Kind.isDigitThree((byte) i));
        }
    }

    @Test
    void happyIsDigitFour() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x34) assertTrue(Kind.isDigitFour((byte) i));
            if (i != 0x34) assertFalse(Kind.isDigitFour((byte) i));
        }
    }

    @Test
    void happyIsDigitFive() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x35) assertTrue(Kind.isDigitFive((byte) i));
            if (i != 0x35) assertFalse(Kind.isDigitFive((byte) i));
        }
    }

    @Test
    void happyIsDigitSix() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x36) assertTrue(Kind.isDigitSix((byte) i));
            if (i != 0x36) assertFalse(Kind.isDigitSix((byte) i));
        }
    }

    @Test
    void happyIsDigitSeven() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x37) assertTrue(Kind.isDigitSeven((byte) i));
            if (i != 0x37) assertFalse(Kind.isDigitSeven((byte) i));
        }
    }

    @Test
    void happyIsDigitEight() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x38) assertTrue(Kind.isDigitEight((byte) i));
            if (i != 0x38) assertFalse(Kind.isDigitEight((byte) i));
        }
    }

    @Test
    void happyIsDigitNine() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x39) assertTrue(Kind.isDigitNine((byte) i));
            if (i != 0x39) assertFalse(Kind.isDigitNine((byte) i));
        }
    }

    @Test
    void happyIsColon() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3A) assertTrue(Kind.isColon((byte) i));
            if (i != 0x3A) assertFalse(Kind.isColon((byte) i));
        }
    }

    @Test
    void happyIsSemicolon() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3B) assertTrue(Kind.isSemicolon((byte) i));
            if (i != 0x3B) assertFalse(Kind.isSemicolon((byte) i));
        }
    }

    @Test
    void happyIsLessThanSign() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3C) assertTrue(Kind.isLessThanSign((byte) i));
            if (i != 0x3C) assertFalse(Kind.isLessThanSign((byte) i));
        }
    }

    @Test
    void happyIsEquals() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3D) assertTrue(Kind.isEquals((byte) i));
            if (i != 0x3D) assertFalse(Kind.isEquals((byte) i));
        }
    }

    @Test
    void happyIsGreaterThanSign() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3E) assertTrue(Kind.isGreaterThanSign((byte) i));
            if (i != 0x3E) assertFalse(Kind.isGreaterThanSign((byte) i));
        }
    }

    @Test
    void happyIsQuestionMark() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x3F) assertTrue(Kind.isQuestionMark((byte) i));
            if (i != 0x3F) assertFalse(Kind.isQuestionMark((byte) i));
        }
    }

    // -----------------------------------------

    @Test
    void happyIsCommercialAt() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x40) assertTrue(Kind.isCommercialAt((byte) i));
            if (i != 0x40) assertFalse(Kind.isCommercialAt((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterA() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x41) assertTrue(Kind.isLatinCapitalLetterA((byte) i));
            if (i != 0x41) assertFalse(Kind.isLatinCapitalLetterA((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterB() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x42) assertTrue(Kind.isLatinCapitalLetterB((byte) i));
            if (i != 0x42) assertFalse(Kind.isLatinCapitalLetterB((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterC() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x43) assertTrue(Kind.isLatinCapitalLetterC((byte) i));
            if (i != 0x43) assertFalse(Kind.isLatinCapitalLetterC((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterD() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x44) assertTrue(Kind.isLatinCapitalLetterD((byte) i));
            if (i != 0x44) assertFalse(Kind.isLatinCapitalLetterD((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterE() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x45) assertTrue(Kind.isLatinCapitalLetterE((byte) i));
            if (i != 0x45) assertFalse(Kind.isLatinCapitalLetterE((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterF() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x46) assertTrue(Kind.isLatinCapitalLetterF((byte) i));
            if (i != 0x46) assertFalse(Kind.isLatinCapitalLetterF((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterG() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x47) assertTrue(Kind.isLatinCapitalLetterG((byte) i));
            if (i != 0x47) assertFalse(Kind.isLatinCapitalLetterG((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterH() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x48) assertTrue(Kind.isLatinCapitalLetterH((byte) i));
            if (i != 0x48) assertFalse(Kind.isLatinCapitalLetterH((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterI() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x49) assertTrue(Kind.isLatinCapitalLetterI((byte) i));
            if (i != 0x49) assertFalse(Kind.isLatinCapitalLetterI((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterJ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4A) assertTrue(Kind.isLatinCapitalLetterJ((byte) i));
            if (i != 0x4A) assertFalse(Kind.isLatinCapitalLetterJ((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterK() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4B) assertTrue(Kind.isLatinCapitalLetterK((byte) i));
            if (i != 0x4B) assertFalse(Kind.isLatinCapitalLetterK((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterL() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4C) assertTrue(Kind.isLatinCapitalLetterL((byte) i));
            if (i != 0x4C) assertFalse(Kind.isLatinCapitalLetterL((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterM() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4D) assertTrue(Kind.isLatinCapitalLetterM((byte) i));
            if (i != 0x4D) assertFalse(Kind.isLatinCapitalLetterM((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterN() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4E) assertTrue(Kind.isLatinCapitalLetterN((byte) i));
            if (i != 0x4E) assertFalse(Kind.isLatinCapitalLetterN((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterO() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x4F) assertTrue(Kind.isLatinCapitalLetterO((byte) i));
            if (i != 0x4F) assertFalse(Kind.isLatinCapitalLetterO((byte) i));
        }
    }

    // -----------------------------------------

    @Test
    void happyIsLatinCapitalLetterP() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x50) assertTrue(Kind.isLatinCapitalLetterP((byte) i));
            if (i != 0x50) assertFalse(Kind.isLatinCapitalLetterP((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterQ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x51) assertTrue(Kind.isLatinCapitalLetterQ((byte) i));
            if (i != 0x51) assertFalse(Kind.isLatinCapitalLetterQ((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterR() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x52) assertTrue(Kind.isLatinCapitalLetterR((byte) i));
            if (i != 0x52) assertFalse(Kind.isLatinCapitalLetterR((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterS() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x53) assertTrue(Kind.isLatinCapitalLetterS((byte) i));
            if (i != 0x53) assertFalse(Kind.isLatinCapitalLetterS((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterT() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x54) assertTrue(Kind.isLatinCapitalLetterT((byte) i));
            if (i != 0x54) assertFalse(Kind.isLatinCapitalLetterT((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterU() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x55) assertTrue(Kind.isLatinCapitalLetterU((byte) i));
            if (i != 0x55) assertFalse(Kind.isLatinCapitalLetterU((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterV() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x56) assertTrue(Kind.isLatinCapitalLetterV((byte) i));
            if (i != 0x56) assertFalse(Kind.isLatinCapitalLetterV((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterW() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x57) assertTrue(Kind.isLatinCapitalLetterW((byte) i));
            if (i != 0x57) assertFalse(Kind.isLatinCapitalLetterW((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterX() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x58) assertTrue(Kind.isLatinCapitalLetterX((byte) i));
            if (i != 0x58) assertFalse(Kind.isLatinCapitalLetterX((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterY() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x59) assertTrue(Kind.isLatinCapitalLetterY((byte) i));
            if (i != 0x59) assertFalse(Kind.isLatinCapitalLetterY((byte) i));
        }
    }

    @Test
    void happyIsLatinCapitalLetterZ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5A) assertTrue(Kind.isLatinCapitalLetterZ((byte) i));
            if (i != 0x5A) assertFalse(Kind.isLatinCapitalLetterZ((byte) i));
        }
    }

    @Test
    void happyIsLeftSquareBracket() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5B) assertTrue(Kind.isLeftSquareBracket((byte) i));
            if (i != 0x5B) assertFalse(Kind.isLeftSquareBracket((byte) i));
        }
    }

    @Test
    void happyIsReverseSolidus() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5C) assertTrue(Kind.isReverseSolidus((byte) i));
            if (i != 0x5C) assertFalse(Kind.isReverseSolidus((byte) i));
        }
    }

    @Test
    void happyIsRightSquareBracket() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5D) assertTrue(Kind.isRightSquareBracket((byte) i));
            if (i != 0x5D) assertFalse(Kind.isRightSquareBracket((byte) i));
        }
    }

    @Test
    void happyIsCircumflexAccent() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5E) assertTrue(Kind.isCircumflexAccent((byte) i));
            if (i != 0x5E) assertFalse(Kind.isCircumflexAccent((byte) i));
        }
    }

    @Test
    void happyIsLowLine() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x5F) assertTrue(Kind.isLowLine((byte) i));
            if (i != 0x5F) assertFalse(Kind.isLowLine((byte) i));
        }
    }

    // -----------------------------------------

    @Test
    void happyIsGraveAccent() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x60) assertTrue(Kind.isGraveAccent((byte) i));
            if (i != 0x60) assertFalse(Kind.isGraveAccent((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterA() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x61) assertTrue(Kind.isLatinSmallLetterA((byte) i));
            if (i != 0x61) assertFalse(Kind.isLatinSmallLetterA((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterB() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x62) assertTrue(Kind.isLatinSmallLetterB((byte) i));
            if (i != 0x62) assertFalse(Kind.isLatinSmallLetterB((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterC() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x63) assertTrue(Kind.isLatinSmallLetterC((byte) i));
            if (i != 0x63) assertFalse(Kind.isLatinSmallLetterC((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterD() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x64) assertTrue(Kind.isLatinSmallLetterD((byte) i));
            if (i != 0x64) assertFalse(Kind.isLatinSmallLetterD((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterE() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x65) assertTrue(Kind.isLatinSmallLetterE((byte) i));
            if (i != 0x65) assertFalse(Kind.isLatinSmallLetterE((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterF() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x66) assertTrue(Kind.isLatinSmallLetterF((byte) i));
            if (i != 0x66) assertFalse(Kind.isLatinSmallLetterF((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterG() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x67) assertTrue(Kind.isLatinSmallLetterG((byte) i));
            if (i != 0x67) assertFalse(Kind.isLatinSmallLetterG((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterH() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x68) assertTrue(Kind.isLatinSmallLetterH((byte) i));
            if (i != 0x68) assertFalse(Kind.isLatinSmallLetterH((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterI() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x69) assertTrue(Kind.isLatinSmallLetterI((byte) i));
            if (i != 0x69) assertFalse(Kind.isLatinSmallLetterI((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterJ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6A) assertTrue(Kind.isLatinSmallLetterJ((byte) i));
            if (i != 0x6A) assertFalse(Kind.isLatinSmallLetterJ((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterK() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6B) assertTrue(Kind.isLatinSmallLetterK((byte) i));
            if (i != 0x6B) assertFalse(Kind.isLatinSmallLetterK((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterL() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6C) assertTrue(Kind.isLatinSmallLetterL((byte) i));
            if (i != 0x6C) assertFalse(Kind.isLatinSmallLetterL((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterM() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6D) assertTrue(Kind.isLatinSmallLetterM((byte) i));
            if (i != 0x6D) assertFalse(Kind.isLatinSmallLetterM((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterN() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6E) assertTrue(Kind.isLatinSmallLetterN((byte) i));
            if (i != 0x6E) assertFalse(Kind.isLatinSmallLetterN((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterO() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x6F) assertTrue(Kind.isLatinSmallLetterO((byte) i));
            if (i != 0x6F) assertFalse(Kind.isLatinSmallLetterO((byte) i));
        }
    }

    // -----------------------------------------

    @Test
    void happyIsLatinSmallLetterP() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x70) assertTrue(Kind.isLatinSmallLetterP((byte) i));
            if (i != 0x70) assertFalse(Kind.isLatinSmallLetterP((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterQ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x71) assertTrue(Kind.isLatinSmallLetterQ((byte) i));
            if (i != 0x71) assertFalse(Kind.isLatinSmallLetterQ((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterR() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x72) assertTrue(Kind.isLatinSmallLetterR((byte) i));
            if (i != 0x72) assertFalse(Kind.isLatinSmallLetterR((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterS() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x73) assertTrue(Kind.isLatinSmallLetterS((byte) i));
            if (i != 0x73) assertFalse(Kind.isLatinSmallLetterS((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterT() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x74) assertTrue(Kind.isLatinSmallLetterT((byte) i));
            if (i != 0x74) assertFalse(Kind.isLatinSmallLetterT((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterU() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x75) assertTrue(Kind.isLatinSmallLetterU((byte) i));
            if (i != 0x75) assertFalse(Kind.isLatinSmallLetterU((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterV() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x76) assertTrue(Kind.isLatinSmallLetterV((byte) i));
            if (i != 0x76) assertFalse(Kind.isLatinSmallLetterV((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterW() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x77) assertTrue(Kind.isLatinSmallLetterW((byte) i));
            if (i != 0x77) assertFalse(Kind.isLatinSmallLetterW((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterX() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x78) assertTrue(Kind.isLatinSmallLetterX((byte) i));
            if (i != 0x78) assertFalse(Kind.isLatinSmallLetterX((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterY() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x79) assertTrue(Kind.isLatinSmallLetterY((byte) i));
            if (i != 0x79) assertFalse(Kind.isLatinSmallLetterY((byte) i));
        }
    }

    @Test
    void happyIsLatinSmallLetterZ() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7A) assertTrue(Kind.isLatinSmallLetterZ((byte) i));
            if (i != 0x7A) assertFalse(Kind.isLatinSmallLetterZ((byte) i));
        }
    }

    @Test
    void happyIsLeftCurlyBracket() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7B) assertTrue(Kind.isLeftCurlyBracket((byte) i));
            if (i != 0x7B) assertFalse(Kind.isLeftCurlyBracket((byte) i));
        }
    }

    @Test
    void happyIsVerticalLine() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7C) assertTrue(Kind.isVerticalLine((byte) i));
            if (i != 0x7C) assertFalse(Kind.isVerticalLine((byte) i));
        }
    }

    @Test
    void happyIsRightCurlyBracket() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7D) assertTrue(Kind.isRightCurlyBracket((byte) i));
            if (i != 0x7D) assertFalse(Kind.isRightCurlyBracket((byte) i));
        }
    }

    @Test
    void happyIsTilde() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7E) assertTrue(Kind.isTilde((byte) i));
            if (i != 0x7E) assertFalse(Kind.isTilde((byte) i));
        }
    }

    @Test
    void happyIsDelete() {
        for (int i = 0; i < 0x80; i++) {
            if (i == 0x7F) assertTrue(Kind.isDelete((byte) i));
            if (i != 0x7F) assertFalse(Kind.isDelete((byte) i));
        }
    }
}
