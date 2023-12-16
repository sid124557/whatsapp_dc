package X;

import java.util.List;

/* renamed from: X.8Db  reason: invalid class name and case insensitive filesystem */
public class C170408Db implements C181478mp {
    public boolean B2l(C159187lJ r5, C159187lJ r6, AnonymousClass7MS r7) {
        boolean z;
        int i;
        if (r6 instanceof C131486df) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        int intValue = r6.A03().A00.intValue();
        if (r5 instanceof C131446db) {
            i = r5.A05().A01.length();
        } else if (!(r5 instanceof C131476de)) {
            return false;
        } else {
            C131476de A02 = r5.A02();
            if (A02.A07() instanceof List) {
                i = ((List) A02.A07()).size();
            } else {
                i = -1;
            }
        }
        if (i == intValue) {
            return true;
        }
        return false;
    }
}
