package X;

import android.text.TextUtils;

/* renamed from: X.5aB  reason: invalid class name and case insensitive filesystem */
public class C106795aB {
    public static C95814uZ A00(C56972sr r3, AnonymousClass3ZH r4, C624134x r5) {
        if (r5 == null || r5.A0D == 6 || (!r4.A0U() && !(r4.A0H instanceof AnonymousClass1fS))) {
            return null;
        }
        if (r5.A1J.A02) {
            return C56972sr.A04(r3);
        }
        C95814uZ A0n = r5.A0n();
        if (A0n != null) {
            return A0n;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversations_row/missing_rmt_src:");
        C18260x0.A1K(A0o, C627636p.A0E(r5));
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r8.A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A01(android.content.Context r4, X.C56972sr r5, X.AnonymousClass5ZU r6, X.C620733j r7, X.AnonymousClass3ZH r8, boolean r9) {
        /*
            java.lang.String r2 = ""
            if (r9 != 0) goto L_0x0045
            if (r8 == 0) goto L_0x0043
            X.4uZ r0 = r8.A0H
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.A0a(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r1 = X.C18300x5.A0h(r6, r8)
        L_0x0014:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r1)
            java.lang.String r0 = ": "
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)
            boolean r5 = X.C620733j.A04(r7)
            r4 = 2
            r3 = 1
            r2 = 0
            r0 = 3
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            r0 = 8207(0x200f, float:1.15E-41)
            if (r5 == 0) goto L_0x0034
            r0 = 8206(0x200e, float:1.1499E-41)
        L_0x0034:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1[r2] = r0
            r1[r3] = r6
            r1[r4] = r0
            java.lang.CharSequence r2 = android.text.TextUtils.concat(r1)
        L_0x0042:
            return r2
        L_0x0043:
            r1 = r2
            goto L_0x0014
        L_0x0045:
            r0 = 2131890036(0x7f120f74, float:1.9414752E38)
            java.lang.String r1 = r4.getString(r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106795aB.A01(android.content.Context, X.2sr, X.5ZU, X.33j, X.3ZH, boolean):java.lang.CharSequence");
    }

    public static CharSequence A02(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        boolean A0C = C107555bV.A0C(charSequence2);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = charSequence;
        char c = 8207;
        if (A0C) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = charSequence2;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }
}
