package X;

/* renamed from: X.5BG  reason: invalid class name */
public class AnonymousClass5BG {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r1 == 43) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r11.A0X(3349) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r26 == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C95204sn A00(X.AnonymousClass33p r10, X.AnonymousClass1VX r11, java.lang.Integer r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, byte r16, int r17, int r18, long r19, long r21, long r23, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r6 = 1
            r5 = 0
            if (r25 == 0) goto L_0x0007
            r1 = 0
            if (r26 != 0) goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            java.lang.String r0 = "Status can't be view once."
            X.C626936e.A0E(r1, r0)
            X.4sn r4 = new X.4sn
            r4.<init>()
            r8 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.A0E = r1
            r4.A0F = r1
            r4.A0B = r1
            r4.A09 = r1
            r4.A0A = r1
            r4.A0C = r1
            r4.A0G = r1
            r4.A0I = r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A03 = r0
            r4.A0D = r1
            long r2 = X.C18290x4.A09(r25)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0N = r0
            r0 = r17
            long r0 = (long) r0
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)
            r4.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r26)
            r4.A02 = r0
            r1 = r16
            if (r1 == r6) goto L_0x00f0
            r0 = 3
            if (r1 == r0) goto L_0x005b
            r0 = 13
            if (r1 == r0) goto L_0x00ec
            r0 = 42
            if (r1 == r0) goto L_0x00f0
            r0 = 43
            r7 = 1
            if (r1 != r0) goto L_0x005c
        L_0x005b:
            r7 = 3
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r4.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r27)
            r4.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)
            r4.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r4.A0L = r0
            r0 = r19
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            r2 = r21
            int r8 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x008c
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r4.A0H = r0
        L_0x008c:
            r0 = 2
            if (r7 != r0) goto L_0x009a
            r0 = 3349(0xd15, float:4.693E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 != 0) goto L_0x00a6
        L_0x0097:
            r4.A0M = r13
            return r4
        L_0x009a:
            r0 = 3
            if (r7 != r0) goto L_0x0097
            r0 = 4468(0x1174, float:6.261E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x0097
            r6 = 0
        L_0x00a6:
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x00d5
            if (r12 == 0) goto L_0x00b4
            int r5 = r12.intValue()
        L_0x00b4:
            r0 = 5954(0x1742, float:8.343E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x00c0
            r4.A0K = r14
            r4.A0J = r15
        L_0x00c0:
            r1 = 2
            r0 = 1
            if (r5 == r0) goto L_0x00cc
            r0 = 2
            r1 = 1
            if (r5 == r0) goto L_0x00cc
            r1 = 3
            if (r5 == r1) goto L_0x00cc
            r1 = 0
        L_0x00cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r6 == 0) goto L_0x00e9
            r4.A06 = r0
            goto L_0x0097
        L_0x00d5:
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)
            if (r6 == 0) goto L_0x00e2
            java.lang.String r0 = "photo_quality"
            int r5 = X.C18280x3.A02(r1, r0)
            goto L_0x00b4
        L_0x00e2:
            java.lang.String r0 = "video_quality"
            int r5 = X.C18280x3.A02(r1, r0)
            goto L_0x00b4
        L_0x00e9:
            r4.A07 = r0
            goto L_0x0097
        L_0x00ec:
            r7 = 11
            goto L_0x005c
        L_0x00f0:
            r7 = 2
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5BG.A00(X.33p, X.1VX, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, byte, int, int, long, long, long, boolean, boolean, boolean, boolean):X.4sn");
    }
}
