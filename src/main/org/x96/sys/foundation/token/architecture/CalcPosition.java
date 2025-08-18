package org.x96.sys.foundation.token.architecture;

import org.x96.sys.foundation.io.ByteStream;
import org.x96.sys.foundation.token.architecture.span.Position;

import java.util.ArrayList;

public class CalcPosition {
    public final int[] line_starts;

    public CalcPosition(ByteStream bs) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < bs.length(); i++) {
            if (bs.at(i) == 0xA) {
                ls.add(i);
            }
        }
        this.line_starts = ls.stream().mapToInt(Integer::intValue).toArray();
    }

    public Position getPosition(int offset) {
        return new Position(getLine(offset), getColumn(offset), offset);
    }

    private int getLine(int offset) {
        if (offset == 0) return 0;

        int low = 0;
        int high = line_starts.length - 1;
        int line = line_starts.length; // valor default caso offset > todas posições

        while (low <= high) {
            int mid = (low + high) / 2;
            if (offset <= line_starts[mid]) {
                line = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return line + 1;
    }

    private int getColumn(int offset) {
        int line = getLine(offset);
        if (line == 0) return 0;
        if (line == 1) return offset;
        return offset - line_starts[line - 2];
    }
}
