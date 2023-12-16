package X;

/* renamed from: X.5aC  reason: invalid class name and case insensitive filesystem */
public final class C106805aC {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r8 < 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r0.A01().A0J == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.view.ViewGroup r21, android.widget.TextView r22, X.C148887Kc r23, X.C620733j r24, X.C56232re r25, X.C30471mV r26) {
        /*
            r2 = r26
            X.33C r3 = X.C30471mV.A00(r2)
            long r4 = r3.A0C
            int r0 = (int) r4
            r4 = r25
            int r0 = A00(r4, r2, r0)
            long r6 = (long) r0
            X.3QO r0 = X.C86654Ky.A0a(r4, r2)
            if (r0 == 0) goto L_0x001f
            X.2dV r0 = r0.A01()
            boolean r0 = r0.A0J
            r1 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            r16 = 100
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r15 = r22
            r14 = r23
            if (r0 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x0032
            boolean r0 = r4.A05(r2)
            if (r0 == 0) goto L_0x004e
        L_0x0032:
            r1 = 0
            r14.A00 = r1
            r0 = 8
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x0041
            r0 = r21
            r0.setVisibility(r1)
        L_0x0041:
            X.7Kb r2 = r14.A01
            r0 = -9223372036854775808
            r2.A02 = r0
            r2.A01 = r0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2.A00 = r0
        L_0x004d:
            return
        L_0x004e:
            boolean r0 = r3.A0c
            if (r0 == 0) goto L_0x0032
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0032
            long r8 = android.os.SystemClock.elapsedRealtime()
            r3 = r24
            if (r24 == 0) goto L_0x0127
            long r0 = r2.A00
            java.lang.String r20 = X.AnonymousClass35V.A03(r3, r0)
        L_0x0064:
            r18 = 0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            int r1 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            boolean r13 = r14.A00
            if (r13 != 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            r0 = 8
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x004d
            r1 = 0
        L_0x0082:
            r0 = r21
            r0.setVisibility(r1)
            return
        L_0x0088:
            long r4 = r16 - r6
            X.7Kb r10 = r14.A01
            long r0 = r10.A02
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x009d
            long r2 = r10.A01
            int r11 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r11 >= 0) goto L_0x009d
            r10.A02 = r8
            r0 = r8
            r10.A01 = r4
        L_0x009d:
            long r11 = r8 - r0
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x004d
            int r2 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x004d
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x004d
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x004d
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x004d
            long r2 = r10.A01
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            r16 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            long r2 = r2 - r4
            double r0 = (double) r2
            double r2 = (double) r11
            double r0 = r0 / r2
            double r2 = r10.A00
            r16 = 0
            int r11 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d8
            r11 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r0 = r0 * r11
            r11 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r2 = r2 * r11
            double r0 = r0 + r2
        L_0x00d8:
            r10.A00 = r0
            double r2 = (double) r4
            double r2 = r2 / r0
            long r0 = (long) r2
            r10.A02 = r8
            r10.A01 = r4
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x004d
            r3 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1U(r2)
            r13 = r13 | r2
            r14.A00 = r13
            if (r13 == 0) goto L_0x004d
            X.5WW r2 = r14.A02
            android.text.Spanned r0 = r2.A00(r6, r0)
            r15.setText(r0)
            if (r20 == 0) goto L_0x011d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = " "
            r3.append(r2)
            android.content.Context r1 = r15.getContext()
            r0 = 2131895788(0x7f1225ec, float:1.9426419E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r3)
            r15.append(r0)
            r0 = r20
            r15.append(r0)
        L_0x011d:
            r0 = 0
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x004d
            r1 = 8
            goto L_0x0082
        L_0x0127:
            r20 = 0
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106805aC.A02(android.view.ViewGroup, android.widget.TextView, X.7Kc, X.33j, X.2re, X.1mV):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1.A05(r2) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C56232re r1, X.C30471mV r2, int r3) {
        /*
            X.3QO r0 = X.C86654Ky.A0a(r1, r2)
            if (r0 == 0) goto L_0x002a
            X.2dV r0 = r0.A01()
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x002a
            X.3QO r0 = X.C86654Ky.A0a(r1, r2)
            if (r0 == 0) goto L_0x0023
            X.2dV r0 = r0.A01()
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0023
            boolean r1 = r1.A05(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            int r3 = r3 / 2
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 50
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106805aC.A00(X.2re, X.1mV, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0.A01().A0J == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C56232re r8, X.C30471mV r9, X.AnonymousClass5UY r10) {
        /*
            X.33C r1 = X.C30471mV.A00(r9)
            boolean r0 = r1.A0c
            r3 = 0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.A0a
            if (r0 != 0) goto L_0x004e
            android.view.View r7 = r10.A04()
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            r7.setVisibility(r3)
            long r1 = r1.A0C
            int r0 = (int) r1
            int r3 = A00(r8, r9, r0)
            long r4 = (long) r3
            X.3QO r0 = X.C86654Ky.A0a(r8, r9)
            if (r0 == 0) goto L_0x002d
            X.2dV r0 = r0.A01()
            boolean r0 = r0.A0J
            r6 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            r1 = 100
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            if (r6 == 0) goto L_0x003c
            boolean r0 = r8.A05(r9)
            if (r0 == 0) goto L_0x004c
        L_0x003c:
            r1 = 1
        L_0x003d:
            if (r3 <= 0) goto L_0x004b
            r0 = 100
            if (r3 < r0) goto L_0x0045
            if (r1 == 0) goto L_0x004b
        L_0x0045:
            r7.setProgress(r3)
            r7.setIndeterminate(r1)
        L_0x004b:
            return r3
        L_0x004c:
            r1 = 0
            goto L_0x003d
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.Class<X.5aC> r0 = X.C106805aC.class
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = "#updateProgress"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r1 = 4
            X.92F r0 = new X.92F
            r0.<init>(r1)
            r10.A0A(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106805aC.A01(X.2re, X.1mV, X.5UY):int");
    }
}
