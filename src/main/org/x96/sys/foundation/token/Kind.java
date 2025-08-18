package org.x96.sys.foundation.token;

import java.util.Arrays;

public enum Kind {
    // -----------------------------------------
    UNKNOWN, // [?] Generic unknown token
    // -----------------------------------------
    //                   0x0
    // -----------------------------------------
    NULL, // 0x0
    SOH, // 0x1
    STX, // 0x2
    ETX, // 0x3
    EOT, // 0x4
    ENQ, // 0x5
    ACK, // 0x6
    BEL, // 0x7
    BS, // 0x8
    HT, // 0x9
    LF, // 0xA
    VT, // 0xB
    FF, // 0xC
    CR, // 0xD
    SO, // 0xE
    SI, // 0xF
    // -----------------------------------------
    //                   0x1
    // -----------------------------------------
    DLE, // 0x10
    DC1, // 0x11
    DC2, // 0x12
    DC3, // 0x13
    DC4, // 0x14
    NAK, // 0x15
    SYN, // 0x16
    ETB, // 0x17
    CAN, // 0x18
    EM, // 0x19
    SUB, // 0x1A
    ESC, // 0x1B
    FS, // 0x1C
    GS, // 0x1D
    RS, // 0x1E
    US, // 0x1F
    // -----------------------------------------
    //                   0x2
    // -----------------------------------------
    SPACE, // 0x20
    EXCLAMATION_MARK, // 0x21
    QUOTATION_MARK, // 0x22
    NUMBER_SIGN, // 0x23
    DOLLAR_SIGN, // 0x24
    PERCENT_SIGN, // 0x25
    AMPERSAND, // 0x26
    APOSTROPHE, // 0x27
    LEFT_PARENTHESIS, // 0x28
    RIGHT_PARENTHESIS, // 0x29
    ASTERISK, // 0x2A
    PLUS, // 0x2B
    COMMA, // 0x2C
    HYPHEN_MINUS, // 0x2D
    FULL_STOP, // 0x2E
    SOLIDUS, // 0x2F
    // -----------------------------------------
    //                   0x3
    // -----------------------------------------
    DIGIT_ZERO, // 0x30
    DIGIT_ONE, // 0x31
    DIGIT_TWO, // 0x32
    DIGIT_THREE, // 0x33
    DIGIT_FOUR, // 0x34
    DIGIT_FIVE, // 0x35
    DIGIT_SIX, // 0x36
    DIGIT_SEVEN, // 0x37
    DIGIT_EIGHT, // 0x38
    DIGIT_NINE, // 0x39
    COLON, // 0x3A
    SEMICOLON, // 0x3B
    LESS_THAN_SIGN, // 0x3C
    EQUALS, // 0x3D
    GREATER_THAN_SIGN, // 0x3E
    QUESTION_MARK, // 0x3F
    // -----------------------------------------
    //                   0x4
    // -----------------------------------------
    COMMERCIAL_AT, // 0x40
    LATIN_CAPITAL_LETTER_A, // 0x41
    LATIN_CAPITAL_LETTER_B, // 0x42
    LATIN_CAPITAL_LETTER_C, // 0x43
    LATIN_CAPITAL_LETTER_D, // 0x44
    LATIN_CAPITAL_LETTER_E, // 0x45
    LATIN_CAPITAL_LETTER_F, // 0x46
    LATIN_CAPITAL_LETTER_G, // 0x47
    LATIN_CAPITAL_LETTER_H, // 0x48
    LATIN_CAPITAL_LETTER_I, // 0x49
    LATIN_CAPITAL_LETTER_J, // 0x4A
    LATIN_CAPITAL_LETTER_K, // 0x4B
    LATIN_CAPITAL_LETTER_L, // 0x4C
    LATIN_CAPITAL_LETTER_M, // 0x4D
    LATIN_CAPITAL_LETTER_N, // 0x4E
    LATIN_CAPITAL_LETTER_O, // 0x4F
    // -----------------------------------------
    //                   0x5
    // -----------------------------------------
    LATIN_CAPITAL_LETTER_P, // 0x50
    LATIN_CAPITAL_LETTER_Q, // 0x51
    LATIN_CAPITAL_LETTER_R, // 0x52
    LATIN_CAPITAL_LETTER_S, // 0x53
    LATIN_CAPITAL_LETTER_T, // 0x54
    LATIN_CAPITAL_LETTER_U, // 0x55
    LATIN_CAPITAL_LETTER_V, // 0x56
    LATIN_CAPITAL_LETTER_W, // 0x57
    LATIN_CAPITAL_LETTER_X, // 0x58
    LATIN_CAPITAL_LETTER_Y, // 0x59
    LATIN_CAPITAL_LETTER_Z, // 0x5A
    LEFT_SQUARE_BRACKET, // 0x5B
    REVERSE_SOLIDUS, // 0x5C
    RIGHT_SQUARE_BRACKET, // 0x5D
    CIRCUMFLEX_ACCENT, // 0x5E
    LOW_LINE, // 0x5F
    // -----------------------------------------
    //                   0x6
    // -----------------------------------------
    GRAVE_ACCENT, // 0x60
    LATIN_SMALL_LETTER_A, // 0x61
    LATIN_SMALL_LETTER_B, // 0x62
    LATIN_SMALL_LETTER_C, // 0x63
    LATIN_SMALL_LETTER_D, // 0x64
    LATIN_SMALL_LETTER_E, // 0x65
    LATIN_SMALL_LETTER_F, // 0x66
    LATIN_SMALL_LETTER_G, // 0x67
    LATIN_SMALL_LETTER_H, // 0x68
    LATIN_SMALL_LETTER_I, // 0x69
    LATIN_SMALL_LETTER_J, // 0x6A
    LATIN_SMALL_LETTER_K, // 0x6B
    LATIN_SMALL_LETTER_L, // 0x6C
    LATIN_SMALL_LETTER_M, // 0x6D
    LATIN_SMALL_LETTER_N, // 0x6E
    LATIN_SMALL_LETTER_O, // 0x6F
    // -----------------------------------------
    //                   0x7
    // -----------------------------------------
    LATIN_SMALL_LETTER_P, // 0x70
    LATIN_SMALL_LETTER_Q, // 0x71
    LATIN_SMALL_LETTER_R, // 0x72
    LATIN_SMALL_LETTER_S, // 0x73
    LATIN_SMALL_LETTER_T, // 0x74
    LATIN_SMALL_LETTER_U, // 0x75
    LATIN_SMALL_LETTER_V, // 0x76
    LATIN_SMALL_LETTER_W, // 0x77
    LATIN_SMALL_LETTER_X, // 0x78
    LATIN_SMALL_LETTER_Y, // 0x79
    LATIN_SMALL_LETTER_Z, // 0x7A
    LEFT_CURLY_BRACKET, // 0x7B
    VERTICAL_LINE, // 0x7C
    RIGHT_CURLY_BRACKET, // 0x7D
    TILDE, // 0x7E
    DELETE, // 0x7F
// -----------------------------------------
;

    private static final Kind[] KIND_CACHE = new Kind[0x80];

    static {
        Arrays.fill(KIND_CACHE, Kind.UNKNOWN);

        KIND_CACHE[0x0] = Kind.NULL;
        KIND_CACHE[0x1] = Kind.SOH;
        KIND_CACHE[0x2] = Kind.STX;
        KIND_CACHE[0x3] = Kind.ETX;
        KIND_CACHE[0x4] = Kind.EOT;
        KIND_CACHE[0x5] = Kind.ENQ;
        KIND_CACHE[0x6] = Kind.ACK;
        KIND_CACHE[0x7] = Kind.BEL;
        KIND_CACHE[0x8] = Kind.BS;
        KIND_CACHE[0x9] = Kind.HT;
        KIND_CACHE[0xA] = Kind.LF;
        KIND_CACHE[0xB] = Kind.VT;
        KIND_CACHE[0xC] = Kind.FF;
        KIND_CACHE[0xD] = Kind.CR;
        KIND_CACHE[0xE] = Kind.SO;
        KIND_CACHE[0xF] = Kind.SI;

        KIND_CACHE[0x10] = Kind.DLE;
        KIND_CACHE[0x11] = Kind.DC1;
        KIND_CACHE[0x12] = Kind.DC2;
        KIND_CACHE[0x13] = Kind.DC3;
        KIND_CACHE[0x14] = Kind.DC4;
        KIND_CACHE[0x15] = Kind.NAK;
        KIND_CACHE[0x16] = Kind.SYN;
        KIND_CACHE[0x17] = Kind.ETB;
        KIND_CACHE[0x18] = Kind.CAN;
        KIND_CACHE[0x19] = Kind.EM;
        KIND_CACHE[0x1A] = Kind.SUB;
        KIND_CACHE[0x1B] = Kind.ESC;
        KIND_CACHE[0x1C] = Kind.FS;
        KIND_CACHE[0x1D] = Kind.GS;
        KIND_CACHE[0x1E] = Kind.RS;
        KIND_CACHE[0x1F] = Kind.US;

        KIND_CACHE[0x20] = Kind.SPACE;
        KIND_CACHE[0x21] = Kind.EXCLAMATION_MARK;
        KIND_CACHE[0x22] = Kind.QUOTATION_MARK;
        KIND_CACHE[0x23] = Kind.NUMBER_SIGN;
        KIND_CACHE[0x24] = Kind.DOLLAR_SIGN;
        KIND_CACHE[0x25] = Kind.PERCENT_SIGN;
        KIND_CACHE[0x26] = Kind.AMPERSAND;
        KIND_CACHE[0x27] = Kind.APOSTROPHE;
        KIND_CACHE[0x28] = Kind.LEFT_PARENTHESIS;
        KIND_CACHE[0x29] = Kind.RIGHT_PARENTHESIS;
        KIND_CACHE[0x2A] = Kind.ASTERISK;
        KIND_CACHE[0x2B] = Kind.PLUS;
        KIND_CACHE[0x2C] = Kind.COMMA;
        KIND_CACHE[0x2D] = Kind.HYPHEN_MINUS;
        KIND_CACHE[0x2E] = Kind.FULL_STOP;
        KIND_CACHE[0x2F] = Kind.SOLIDUS;

        KIND_CACHE[0x30] = Kind.DIGIT_ZERO;
        KIND_CACHE[0x31] = Kind.DIGIT_ONE;
        KIND_CACHE[0x32] = Kind.DIGIT_TWO;
        KIND_CACHE[0x33] = Kind.DIGIT_THREE;
        KIND_CACHE[0x34] = Kind.DIGIT_FOUR;
        KIND_CACHE[0x35] = Kind.DIGIT_FIVE;
        KIND_CACHE[0x36] = Kind.DIGIT_SIX;
        KIND_CACHE[0x37] = Kind.DIGIT_SEVEN;
        KIND_CACHE[0x38] = Kind.DIGIT_EIGHT;
        KIND_CACHE[0x39] = Kind.DIGIT_NINE;
        KIND_CACHE[0x3A] = Kind.COLON;
        KIND_CACHE[0x3B] = Kind.SEMICOLON;
        KIND_CACHE[0x3C] = Kind.LESS_THAN_SIGN;
        KIND_CACHE[0x3D] = Kind.EQUALS;
        KIND_CACHE[0x3E] = Kind.GREATER_THAN_SIGN;
        KIND_CACHE[0x3F] = Kind.QUESTION_MARK;

        KIND_CACHE[0x40] = Kind.COMMERCIAL_AT;
        KIND_CACHE[0x41] = Kind.LATIN_CAPITAL_LETTER_A;
        KIND_CACHE[0x42] = Kind.LATIN_CAPITAL_LETTER_B;
        KIND_CACHE[0x43] = Kind.LATIN_CAPITAL_LETTER_C;
        KIND_CACHE[0x44] = Kind.LATIN_CAPITAL_LETTER_D;
        KIND_CACHE[0x45] = Kind.LATIN_CAPITAL_LETTER_E;
        KIND_CACHE[0x46] = Kind.LATIN_CAPITAL_LETTER_F;
        KIND_CACHE[0x47] = Kind.LATIN_CAPITAL_LETTER_G;
        KIND_CACHE[0x48] = Kind.LATIN_CAPITAL_LETTER_H;
        KIND_CACHE[0x49] = Kind.LATIN_CAPITAL_LETTER_I;
        KIND_CACHE[0x4A] = Kind.LATIN_CAPITAL_LETTER_J;
        KIND_CACHE[0x4B] = Kind.LATIN_CAPITAL_LETTER_K;
        KIND_CACHE[0x4C] = Kind.LATIN_CAPITAL_LETTER_L;
        KIND_CACHE[0x4D] = Kind.LATIN_CAPITAL_LETTER_M;
        KIND_CACHE[0x4E] = Kind.LATIN_CAPITAL_LETTER_N;
        KIND_CACHE[0x4F] = Kind.LATIN_CAPITAL_LETTER_O;

        KIND_CACHE[0x50] = Kind.LATIN_CAPITAL_LETTER_P;
        KIND_CACHE[0x51] = Kind.LATIN_CAPITAL_LETTER_Q;
        KIND_CACHE[0x52] = Kind.LATIN_CAPITAL_LETTER_R;
        KIND_CACHE[0x53] = Kind.LATIN_CAPITAL_LETTER_S;
        KIND_CACHE[0x54] = Kind.LATIN_CAPITAL_LETTER_T;
        KIND_CACHE[0x55] = Kind.LATIN_CAPITAL_LETTER_U;
        KIND_CACHE[0x56] = Kind.LATIN_CAPITAL_LETTER_V;
        KIND_CACHE[0x57] = Kind.LATIN_CAPITAL_LETTER_W;
        KIND_CACHE[0x58] = Kind.LATIN_CAPITAL_LETTER_X;
        KIND_CACHE[0x59] = Kind.LATIN_CAPITAL_LETTER_Y;
        KIND_CACHE[0x5A] = Kind.LATIN_CAPITAL_LETTER_Z;
        KIND_CACHE[0x5B] = Kind.LEFT_SQUARE_BRACKET;
        KIND_CACHE[0x5C] = Kind.REVERSE_SOLIDUS;
        KIND_CACHE[0x5D] = Kind.RIGHT_SQUARE_BRACKET;
        KIND_CACHE[0x5E] = Kind.CIRCUMFLEX_ACCENT;
        KIND_CACHE[0x5F] = Kind.LOW_LINE;

        KIND_CACHE[0x60] = Kind.GRAVE_ACCENT;
        KIND_CACHE[0x61] = Kind.LATIN_SMALL_LETTER_A;
        KIND_CACHE[0x62] = Kind.LATIN_SMALL_LETTER_B;
        KIND_CACHE[0x63] = Kind.LATIN_SMALL_LETTER_C;
        KIND_CACHE[0x64] = Kind.LATIN_SMALL_LETTER_D;
        KIND_CACHE[0x65] = Kind.LATIN_SMALL_LETTER_E;
        KIND_CACHE[0x66] = Kind.LATIN_SMALL_LETTER_F;
        KIND_CACHE[0x67] = Kind.LATIN_SMALL_LETTER_G;
        KIND_CACHE[0x68] = Kind.LATIN_SMALL_LETTER_H;
        KIND_CACHE[0x69] = Kind.LATIN_SMALL_LETTER_I;
        KIND_CACHE[0x6A] = Kind.LATIN_SMALL_LETTER_J;
        KIND_CACHE[0x6B] = Kind.LATIN_SMALL_LETTER_K;
        KIND_CACHE[0x6C] = Kind.LATIN_SMALL_LETTER_L;
        KIND_CACHE[0x6D] = Kind.LATIN_SMALL_LETTER_M;
        KIND_CACHE[0x6E] = Kind.LATIN_SMALL_LETTER_N;
        KIND_CACHE[0x6F] = Kind.LATIN_SMALL_LETTER_O;

        KIND_CACHE[0x70] = Kind.LATIN_SMALL_LETTER_P;
        KIND_CACHE[0x71] = Kind.LATIN_SMALL_LETTER_Q;
        KIND_CACHE[0x72] = Kind.LATIN_SMALL_LETTER_R;
        KIND_CACHE[0x73] = Kind.LATIN_SMALL_LETTER_S;
        KIND_CACHE[0x74] = Kind.LATIN_SMALL_LETTER_T;
        KIND_CACHE[0x75] = Kind.LATIN_SMALL_LETTER_U;
        KIND_CACHE[0x76] = Kind.LATIN_SMALL_LETTER_V;
        KIND_CACHE[0x77] = Kind.LATIN_SMALL_LETTER_W;
        KIND_CACHE[0x78] = Kind.LATIN_SMALL_LETTER_X;
        KIND_CACHE[0x79] = Kind.LATIN_SMALL_LETTER_Y;
        KIND_CACHE[0x7A] = Kind.LATIN_SMALL_LETTER_Z;
        KIND_CACHE[0x7B] = Kind.LEFT_CURLY_BRACKET;
        KIND_CACHE[0x7C] = Kind.VERTICAL_LINE;
        KIND_CACHE[0x7D] = Kind.RIGHT_CURLY_BRACKET;
        KIND_CACHE[0x7E] = Kind.TILDE;
        KIND_CACHE[0x7F] = Kind.DELETE;
    }

    public static Kind is(int b) {
        if (b < 0 || b >= KIND_CACHE.length) return Kind.UNKNOWN;
        return KIND_CACHE[b];
    }

    // -----------------------------------------
    //                   0x0
    // -----------------------------------------
    public static boolean isNull(byte b) {
        return b == 0x0;
    }

    public static boolean isSoh(byte b) {
        return b == 0x1;
    }

    public static boolean isStx(byte b) {
        return b == 0x2;
    }

    public static boolean isEtx(byte b) {
        return b == 0x3;
    }

    public static boolean isEot(byte b) {
        return b == 0x4;
    }

    public static boolean isEnq(byte b) {
        return b == 0x5;
    }

    public static boolean isAck(byte b) {
        return b == 0x6;
    }

    public static boolean isBel(byte b) {
        return b == 0x7;
    }

    public static boolean isBs(byte b) {
        return b == 0x8;
    }

    public static boolean isHt(byte b) {
        return b == 0x9;
    }

    public static boolean isLf(byte b) {
        return b == 0xA;
    }

    public static boolean isVt(byte b) {
        return b == 0xB;
    }

    public static boolean isFf(byte b) {
        return b == 0xC;
    }

    public static boolean isCr(byte b) {
        return b == 0xD;
    }

    public static boolean isSo(byte b) {
        return b == 0xE;
    }

    public static boolean isSi(byte b) {
        return b == 0xF;
    }

    // -----------------------------------------
    //                   0x1
    // -----------------------------------------
    public static boolean isDle(byte b) {
        return b == 0x10;
    }

    public static boolean isDc1(byte b) {
        return b == 0x11;
    }

    public static boolean isDc2(byte b) {
        return b == 0x12;
    }

    public static boolean isDc3(byte b) {
        return b == 0x13;
    }

    public static boolean isDc4(byte b) {
        return b == 0x14;
    }

    public static boolean isNak(byte b) {
        return b == 0x15;
    }

    public static boolean isSyn(byte b) {
        return b == 0x16;
    }

    public static boolean isEtb(byte b) {
        return b == 0x17;
    }

    public static boolean isCan(byte b) {
        return b == 0x18;
    }

    public static boolean isEm(byte b) {
        return b == 0x19;
    }

    public static boolean isSub(byte b) {
        return b == 0x1A;
    }

    public static boolean isEsc(byte b) {
        return b == 0x1B;
    }

    public static boolean isFs(byte b) {
        return b == 0x1C;
    }

    public static boolean isGs(byte b) {
        return b == 0x1D;
    }

    public static boolean isRs(byte b) {
        return b == 0x1E;
    }

    public static boolean isUs(byte b) {
        return b == 0x1F;
    }

    // -----------------------------------------
    //                   0x2
    // -----------------------------------------
    public static boolean isSpace(byte b) {
        return b == 0x20;
    }

    public static boolean isExclamationMark(byte b) {
        return b == 0x21;
    }

    public static boolean isQuotationMark(byte b) {
        return b == 0x22;
    }

    public static boolean isNumberSign(byte b) {
        return b == 0x23;
    }

    public static boolean isDollarSign(byte b) {
        return b == 0x24;
    }

    public static boolean isPercentSign(byte b) {
        return b == 0x25;
    }

    public static boolean isAmpersand(byte b) {
        return b == 0x26;
    }

    public static boolean isApostrophe(byte b) {
        return b == 0x27;
    }

    public static boolean isLeftParenthesis(byte b) {
        return b == 0x28;
    }

    public static boolean isRightParenthesis(byte b) {
        return b == 0x29;
    }

    public static boolean isAsterisk(byte b) {
        return b == 0x2A;
    }

    public static boolean isPlus(byte b) {
        return b == 0x2B;
    }

    public static boolean isComma(byte b) {
        return b == 0x2C;
    }

    public static boolean isHyphenMinus(byte b) {
        return b == 0x2D;
    }

    public static boolean isFullStop(byte b) {
        return b == 0x2E;
    }

    public static boolean isSolidus(byte b) {
        return b == 0x2F;
    }

    // -----------------------------------------
    //                   0x3
    // -----------------------------------------
    public static boolean isDigitZero(byte b) {
        return b == 0x30;
    }

    public static boolean isDigitOne(byte b) {
        return b == 0x31;
    }

    public static boolean isDigitTwo(byte b) {
        return b == 0x32;
    }

    public static boolean isDigitThree(byte b) {
        return b == 0x33;
    }

    public static boolean isDigitFour(byte b) {
        return b == 0x34;
    }

    public static boolean isDigitFive(byte b) {
        return b == 0x35;
    }

    public static boolean isDigitSix(byte b) {
        return b == 0x36;
    }

    public static boolean isDigitSeven(byte b) {
        return b == 0x37;
    }

    public static boolean isDigitEight(byte b) {
        return b == 0x38;
    }

    public static boolean isDigitNine(byte b) {
        return b == 0x39;
    }

    public static boolean isColon(byte b) {
        return b == 0x3A;
    }

    public static boolean isSemicolon(byte b) {
        return b == 0x3B;
    }

    public static boolean isLessThanSign(byte b) {
        return b == 0x3C;
    }

    public static boolean isEquals(byte b) {
        return b == 0x3D;
    }

    public static boolean isGreaterThanSign(byte b) {
        return b == 0x3E;
    }

    public static boolean isQuestionMark(byte b) {
        return b == 0x3F;
    }

    // -----------------------------------------
    //                   0x4
    // -----------------------------------------
    public static boolean isCommercialAt(byte b) {
        return b == 0x40;
    }

    public static boolean isLatinCapitalLetterA(byte b) {
        return b == 0x41;
    }

    public static boolean isLatinCapitalLetterB(byte b) {
        return b == 0x42;
    }

    public static boolean isLatinCapitalLetterC(byte b) {
        return b == 0x43;
    }

    public static boolean isLatinCapitalLetterD(byte b) {
        return b == 0x44;
    }

    public static boolean isLatinCapitalLetterE(byte b) {
        return b == 0x45;
    }

    public static boolean isLatinCapitalLetterF(byte b) {
        return b == 0x46;
    }

    public static boolean isLatinCapitalLetterG(byte b) {
        return b == 0x47;
    }

    public static boolean isLatinCapitalLetterH(byte b) {
        return b == 0x48;
    }

    public static boolean isLatinCapitalLetterI(byte b) {
        return b == 0x49;
    }

    public static boolean isLatinCapitalLetterJ(byte b) {
        return b == 0x4A;
    }

    public static boolean isLatinCapitalLetterK(byte b) {
        return b == 0x4B;
    }

    public static boolean isLatinCapitalLetterL(byte b) {
        return b == 0x4C;
    }

    public static boolean isLatinCapitalLetterM(byte b) {
        return b == 0x4D;
    }

    public static boolean isLatinCapitalLetterN(byte b) {
        return b == 0x4E;
    }

    public static boolean isLatinCapitalLetterO(byte b) {
        return b == 0x4F;
    }

    // -----------------------------------------
    //                   0x5
    // -----------------------------------------
    public static boolean isLatinCapitalLetterP(byte b) {
        return b == 0x50;
    }

    public static boolean isLatinCapitalLetterQ(byte b) {
        return b == 0x51;
    }

    public static boolean isLatinCapitalLetterR(byte b) {
        return b == 0x52;
    }

    public static boolean isLatinCapitalLetterS(byte b) {
        return b == 0x53;
    }

    public static boolean isLatinCapitalLetterT(byte b) {
        return b == 0x54;
    }

    public static boolean isLatinCapitalLetterU(byte b) {
        return b == 0x55;
    }

    public static boolean isLatinCapitalLetterV(byte b) {
        return b == 0x56;
    }

    public static boolean isLatinCapitalLetterW(byte b) {
        return b == 0x57;
    }

    public static boolean isLatinCapitalLetterX(byte b) {
        return b == 0x58;
    }

    public static boolean isLatinCapitalLetterY(byte b) {
        return b == 0x59;
    }

    public static boolean isLatinCapitalLetterZ(byte b) {
        return b == 0x5A;
    }

    public static boolean isLeftSquareBracket(byte b) {
        return b == 0x5B;
    }

    public static boolean isReverseSolidus(byte b) {
        return b == 0x5C;
    }

    public static boolean isRightSquareBracket(byte b) {
        return b == 0x5D;
    }

    public static boolean isCircumflexAccent(byte b) {
        return b == 0x5E;
    }

    public static boolean isLowLine(byte b) {
        return b == 0x5F;
    }

    // -----------------------------------------
    //                   0x6
    // -----------------------------------------
    public static boolean isGraveAccent(byte b) {
        return b == 0x60;
    }

    public static boolean isLatinSmallLetterA(byte b) {
        return b == 0x61;
    }

    public static boolean isLatinSmallLetterB(byte b) {
        return b == 0x62;
    }

    public static boolean isLatinSmallLetterC(byte b) {
        return b == 0x63;
    }

    public static boolean isLatinSmallLetterD(byte b) {
        return b == 0x64;
    }

    public static boolean isLatinSmallLetterE(byte b) {
        return b == 0x65;
    }

    public static boolean isLatinSmallLetterF(byte b) {
        return b == 0x66;
    }

    public static boolean isLatinSmallLetterG(byte b) {
        return b == 0x67;
    }

    public static boolean isLatinSmallLetterH(byte b) {
        return b == 0x68;
    }

    public static boolean isLatinSmallLetterI(byte b) {
        return b == 0x69;
    }

    public static boolean isLatinSmallLetterJ(byte b) {
        return b == 0x6A;
    }

    public static boolean isLatinSmallLetterK(byte b) {
        return b == 0x6B;
    }

    public static boolean isLatinSmallLetterL(byte b) {
        return b == 0x6C;
    }

    public static boolean isLatinSmallLetterM(byte b) {
        return b == 0x6D;
    }

    public static boolean isLatinSmallLetterN(byte b) {
        return b == 0x6E;
    }

    public static boolean isLatinSmallLetterO(byte b) {
        return b == 0x6F;
    }

    // -----------------------------------------
    //                   0x7
    // -----------------------------------------
    public static boolean isLatinSmallLetterP(byte b) {
        return b == 0x70;
    }

    public static boolean isLatinSmallLetterQ(byte b) {
        return b == 0x71;
    }

    public static boolean isLatinSmallLetterR(byte b) {
        return b == 0x72;
    }

    public static boolean isLatinSmallLetterS(byte b) {
        return b == 0x73;
    }

    public static boolean isLatinSmallLetterT(byte b) {
        return b == 0x74;
    }

    public static boolean isLatinSmallLetterU(byte b) {
        return b == 0x75;
    }

    public static boolean isLatinSmallLetterV(byte b) {
        return b == 0x76;
    }

    public static boolean isLatinSmallLetterW(byte b) {
        return b == 0x77;
    }

    public static boolean isLatinSmallLetterX(byte b) {
        return b == 0x78;
    }

    public static boolean isLatinSmallLetterY(byte b) {
        return b == 0x79;
    }

    public static boolean isLatinSmallLetterZ(byte b) {
        return b == 0x7A;
    }

    public static boolean isLeftCurlyBracket(byte b) {
        return b == 0x7B;
    }

    public static boolean isVerticalLine(byte b) {
        return b == 0x7C;
    }

    public static boolean isRightCurlyBracket(byte b) {
        return b == 0x7D;
    }

    public static boolean isTilde(byte b) {
        return b == 0x7E;
    }

    public static boolean isDelete(byte b) {
        return b == 0x7F;
    }
}
