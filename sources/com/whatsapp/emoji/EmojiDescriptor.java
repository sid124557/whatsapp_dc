package com.whatsapp.emoji;

import X.C1457377c;
import X.C1457477d;
import X.C1457577e;
import X.C1457677f;
import X.C1457777g;
import X.C157857j0;
import java.util.Arrays;

public class EmojiDescriptor {
    public static long getDescriptor(C157857j0 r1) {
        return A00(r1, false);
    }

    public static long A00(C157857j0 r9, boolean z) {
        long j = 0;
        do {
            int A00 = r9.A00();
            if (A00 == 0) {
                return C1457477d.A00[(int) j];
            }
            int i = (int) j;
            int binarySearch = Arrays.binarySearch(C1457377c.A00, C1457777g.A00[i], C1457577e.A00[i], A00);
            if (binarySearch >= 0) {
                j = C1457677f.A00[binarySearch];
            } else if (!z) {
                return C1457477d.A00[i];
            } else {
                return -1;
            }
        } while (j >= 0);
        if (z) {
            if (r9.A00() != 0 || j == -1) {
                return -1;
            }
            return -j;
        } else if (j != -1) {
            return -j;
        } else {
            return -1;
        }
    }
}
