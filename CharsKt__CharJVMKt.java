package kotlin.text;

import X.C56902Vt;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    public static final boolean L(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static final int checkRadix(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        new IntRange(2, 36);
        throw new IllegalArgumentException(C56902Vt.L);
    }
}
