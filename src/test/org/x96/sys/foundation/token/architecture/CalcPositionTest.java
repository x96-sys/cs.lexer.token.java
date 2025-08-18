package org.x96.sys.foundation.token.architecture;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.x96.sys.foundation.io.ByteStream;
import org.x96.sys.foundation.token.architecture.span.Position;

class CalcPositionTest {

    private static void test(byte[] hex, int offset, int expected_line, int expected_column) {
        CalcPosition cp = new CalcPosition(ByteStream.raw(hex));
        Position pos = cp.getPosition(offset);
        assertEquals(pos.column(), expected_column);
        assertEquals(pos.line(), expected_line);
        assertEquals(pos.offset(), offset);
    }

    @Test
    void happy() {
        byte[] hex =
                new byte[] {
                    0x2, 0xA, 0x61, 0xA, 0x62, 0x62, 0xA, 0x63, 0x63, 0x63, 0xA, 0x64, 0x20, 0x65,
                    0x66, 0xA, 0x3
                };
        test(hex, 0, 0, 0);

        test(hex, 1, 1, 1);

        test(hex, 2, 2, 1);
        test(hex, 3, 2, 2);

        test(hex, 4, 3, 1);
        test(hex, 5, 3, 2);
        test(hex, 6, 3, 3);

        test(hex, 7, 4, 1);
        test(hex, 8, 4, 2);
        test(hex, 9, 4, 3);
        test(hex, 10, 4, 4);

        test(hex, 11, 5, 1);
        test(hex, 12, 5, 2);
        test(hex, 13, 5, 3);
        test(hex, 14, 5, 4);
        test(hex, 15, 5, 5);
    }
}
