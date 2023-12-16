package X;

import java.util.HashMap;

/* renamed from: X.2xs  reason: invalid class name and case insensitive filesystem */
public class C60022xs {
    public final C56612sH A00;
    public final AnonymousClass4FV A01;
    public final HashMap A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.A03 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C41402Kc r4, X.C25931bJ r5) {
        /*
            X.2Tz r3 = r4.A00
            X.2al r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x009b
            boolean r0 = r0.A03
            r1 = 1
            r2 = 1
            if (r0 != 0) goto L_0x009b
        L_0x000d:
            X.2al r0 = r3.A08
            if (r0 == 0) goto L_0x0019
            r2 = r2 | 2
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0019
            r1 = r1 | 2
        L_0x0019:
            X.2al r0 = r3.A09
            if (r0 == 0) goto L_0x0025
            r2 = r2 | 4
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0025
            r1 = r1 | 4
        L_0x0025:
            X.2al r0 = r3.A07
            if (r0 == 0) goto L_0x0031
            r2 = r2 | 8
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0031
            r1 = r1 | 8
        L_0x0031:
            X.2al r0 = r3.A01
            if (r0 == 0) goto L_0x003d
            r2 = r2 | 16
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x003d
            r1 = r1 | 16
        L_0x003d:
            X.2al r0 = r3.A03
            if (r0 == 0) goto L_0x0049
            r2 = r2 | 32
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0049
            r1 = r1 | 32
        L_0x0049:
            X.2al r0 = r3.A06
            if (r0 == 0) goto L_0x0055
            r2 = r2 | 64
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0055
            r1 = r1 | 64
        L_0x0055:
            X.2al r0 = r3.A04
            if (r0 == 0) goto L_0x0061
            r2 = r2 | 128(0x80, float:1.794E-43)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0061
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x0061:
            X.2al r0 = r3.A05
            if (r0 == 0) goto L_0x006d
            r2 = r2 | 256(0x100, float:3.59E-43)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x006d
            r1 = r1 | 256(0x100, float:3.59E-43)
        L_0x006d:
            X.2al r0 = r3.A00
            if (r0 == 0) goto L_0x0079
            r2 = r2 | 512(0x200, float:7.175E-43)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0079
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0079:
            X.2al r0 = r3.A0B
            if (r0 == 0) goto L_0x0085
            r2 = r2 | 1024(0x400, float:1.435E-42)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0085
            r1 = r1 | 1024(0x400, float:1.435E-42)
        L_0x0085:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r5.A0D = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r5.A0A = r0
            X.2UJ[] r0 = r4.A01
            int r0 = r0.length
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r5.A0G = r0
            return
        L_0x009b:
            r1 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60022xs.A00(X.2Kc, X.1bJ):void");
    }

    public final void A01(C25931bJ r6) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(r6)) {
            r6.A0B = C18310x6.A0f(this.A00.A0H(), C18310x6.A0B(hashMap.get(r6)));
            hashMap.remove(r6);
            return;
        }
        r6.A0B = -1L;
    }

    public C60022xs(C56612sH r2, AnonymousClass4FV r3) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = A0t;
    }
}
