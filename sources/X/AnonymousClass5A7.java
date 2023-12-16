package X;

import java.text.Collator;

/* renamed from: X.5A7  reason: invalid class name */
public final class AnonymousClass5A7 {
    public static final boolean A00(C620733j r5, String str, String str2) {
        Collator A0w = C86614Ku.A0w(r5);
        C162457s7.A0D(A0w);
        A0w.setStrength(0);
        int length = str2.length();
        if (length > str.length()) {
            return false;
        }
        String substring = str.substring(0, length);
        C162457s7.A0D(substring);
        if (A0w.compare(str2, substring) == 0) {
            return true;
        }
        return false;
    }
}
