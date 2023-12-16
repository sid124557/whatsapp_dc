package X;

import android.content.Context;
import android.text.Spannable;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ae  reason: invalid class name and case insensitive filesystem */
public abstract class C107075ae {
    public static final C107075ae A00 = new AnonymousClass68L(1);
    public static final C107075ae A01 = new AnonymousClass68L(2);
    public static final C107075ae A02 = new C138116pn();
    public static final C107075ae A03 = new AnonymousClass68L(0);
    public static final Map A04 = AnonymousClass0x9.A1D();

    public abstract void A02(Context context, Spannable spannable, int i, int i2);

    public static CharSequence A01(Context context, C620733j r7, CharSequence charSequence, List list) {
        return (CharSequence) A00(context, r7, A01, charSequence, list, true).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r0 != 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r8 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r8 = android.text.SpannableString.valueOf(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        r14.A02(r21, r8, r10, r9);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        if (r8 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c2, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7IU A00(android.content.Context r21, X.C620733j r22, X.C107075ae r23, java.lang.CharSequence r24, java.util.List r25, boolean r26) {
        /*
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            r20 = r24
            if (r24 == 0) goto L_0x013b
            r13 = r25
            if (r25 == 0) goto L_0x0133
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0133
            java.util.regex.Pattern r1 = X.C107155an.A02
            r0 = r20
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = " "
            java.lang.String r11 = r1.replaceAll(r0)
            java.text.BreakIterator r19 = X.C107155an.A02(r22)
            r0 = r19
            r0.setText(r11)
            int r10 = r19.first()
            int r9 = r19.next()
            r1 = -1
            r8 = 0
            r5 = 0
            r7 = -1
            r6 = 0
        L_0x0036:
            if (r9 == r1) goto L_0x0131
            java.lang.String r18 = r11.substring(r10, r9)
            r17 = 1
            if (r5 != 0) goto L_0x0084
            java.util.Locale r2 = X.C620733j.A02(r22)
            java.util.Map r1 = A04
            java.lang.Object r0 = r1.get(r2)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L_0x0056
            X.5tE r0 = new X.5tE
            r0.<init>(r2)
            r1.put(r2, r0)
        L_0x0056:
            java.lang.Object r5 = r0.get()
            X.C626936e.A06(r5)
            java.text.Collator r5 = (java.text.Collator) r5
            int r0 = r13.size()
            java.text.CollationKey[] r6 = new java.text.CollationKey[r0]
            int r2 = X.AnonymousClass002.A03(r13)
        L_0x0069:
            if (r2 < 0) goto L_0x0084
            java.lang.String r1 = X.AnonymousClass001.A0n(r13, r2)
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r2)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            r6[r2] = r0
            int r0 = r1.length()
            int r7 = java.lang.Math.max(r7, r0)
            int r2 = r2 + -1
            goto L_0x0069
        L_0x0084:
            X.5ae r0 = A01
            r4 = 0
            r14 = r23
            if (r14 == r0) goto L_0x00c9
            X.5ae r0 = A00
            if (r14 == r0) goto L_0x00c9
            int r0 = r18.length()
            int r16 = java.lang.Math.min(r0, r7)
            r3 = 1
            r17 = 0
        L_0x009a:
            r0 = r16
            if (r3 > r0) goto L_0x00ee
            r0 = r18
            java.lang.String r0 = r0.substring(r4, r3)
            java.text.CollationKey r15 = r5.getCollationKey(r0)
            int r2 = r6.length
        L_0x00a9:
            if (r4 >= r2) goto L_0x00c5
            r0 = r6[r4]
            int r0 = r15.compareTo(r0)
            if (r0 != 0) goto L_0x00c2
            if (r8 != 0) goto L_0x00b9
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00b9:
            int r1 = r10 + r3
            r0 = r21
            r14.A02(r0, r8, r10, r1)
            r17 = 1
        L_0x00c2:
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00c5:
            int r3 = r3 + 1
            r4 = 0
            goto L_0x009a
        L_0x00c9:
            java.lang.String r3 = X.C107575bX.A07(r18)
        L_0x00cd:
            int r0 = r6.length
            int r1 = r0 + -1
            if (r4 >= r1) goto L_0x0109
            r1 = r6[r4]
            java.text.CollationKey r0 = r5.getCollationKey(r3)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0106
            r0 = 1
        L_0x00df:
            r17 = r0
            if (r0 == 0) goto L_0x00ee
        L_0x00e3:
            if (r8 != 0) goto L_0x00e9
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00e9:
            r0 = r21
            r14.A02(r0, r8, r10, r9)
        L_0x00ee:
            if (r26 == 0) goto L_0x00fd
            if (r17 == 0) goto L_0x00fd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.AnonymousClass0x2.A1G(r1, r0, r12)
        L_0x00fd:
            int r0 = r19.next()
            r10 = r9
            r1 = -1
            r9 = r0
            goto L_0x0036
        L_0x0106:
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x0109:
            r0 = 0
            r4 = r6[r1]
            int r2 = r3.length()
            java.lang.String r1 = r4.getSourceString()
            int r1 = r1.length()
            int r2 = java.lang.Math.min(r2, r1)
            r1 = 1
        L_0x011d:
            if (r1 > r2) goto L_0x00df
            java.lang.String r0 = r3.substring(r0, r1)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            int r0 = r0.compareTo(r4)
            if (r0 == 0) goto L_0x00e3
            int r1 = r1 + 1
            r0 = 0
            goto L_0x011d
        L_0x0131:
            if (r8 != 0) goto L_0x0135
        L_0x0133:
            r8 = r20
        L_0x0135:
            X.7IU r0 = new X.7IU
            r0.<init>(r8, r12)
            return r0
        L_0x013b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107075ae.A00(android.content.Context, X.33j, X.5ae, java.lang.CharSequence, java.util.List, boolean):X.7IU");
    }
}
