package X;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.359  reason: invalid class name */
public class AnonymousClass359 {
    public static final HashSet A00 = AnonymousClass0x9.A15(Collections.singletonList("GTQ"));

    public static String A00(C620733j r3, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C160617ny A0M = AnonymousClass0x7.A0M(C160617ny.A02, str);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!z) {
            str2 = "";
        }
        A0o.append(str2);
        A0o.append(A0M.A03(r3, bigDecimal, i, false));
        return AnonymousClass000.A0V(" ", str, A0o);
    }

    public static String A01(C620733j r5, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C160617ny r4 = C160617ny.A02;
        String A03 = AnonymousClass0x7.A0M(r4, str).A03(r5, bigDecimal, i, z);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A03;
        }
        String replace = A03.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = AnonymousClass0x7.A0M(r4, str).A02(r5);
        }
        return replace.replace(str, str2);
    }

    public static String A02(C620733j r5, String str, String str2, BigDecimal bigDecimal, boolean z) {
        C160617ny r4 = C160617ny.A02;
        String A04 = AnonymousClass0x7.A0M(r4, str).A04(r5, bigDecimal, z);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A04;
        }
        String replace = A04.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = AnonymousClass0x7.A0M(r4, str).A02(r5);
        }
        return replace.replace(str, str2);
    }
}
