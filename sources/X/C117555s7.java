package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.5s7  reason: invalid class name and case insensitive filesystem */
public class C117555s7 implements Runnable {
    public C147307Dp A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C56982ss A04;
    public final C66543Lv A05;
    public final C56362rr A06;
    public final C95814uZ A07;
    public final C56212rc A08;
    public final C55832qz A09;
    public final String A0A;
    public final List A0B;
    public final Set A0C;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0110 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r17 = 0
            r3 = r18
            java.lang.String r0 = "messagesViewModel/more-messages/loading/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            X.3Lv r8 = r3.A05     // Catch:{ all -> 0x0118 }
            X.4uZ r5 = r3.A07     // Catch:{ all -> 0x0118 }
            long r6 = r3.A02     // Catch:{ all -> 0x0118 }
            r4 = 100
            long r0 = r3.A01     // Catch:{ all -> 0x0118 }
            X.2rt r2 = r8.A1P     // Catch:{ all -> 0x0118 }
            r9 = r2
            r10 = r5
            r11 = r4
            r12 = r6
            r14 = r0
            long r11 = r9.A04(r10, r11, r12, r14)     // Catch:{ all -> 0x0118 }
            r2 = 1
            r9 = r5
            r10 = r4
            r13 = r0
            r15 = r2
            X.2Ni r8 = r8.A0B(r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0118 }
            android.database.Cursor r7 = r8.A00     // Catch:{ all -> 0x0118 }
            if (r7 == 0) goto L_0x007d
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x007d
            r7.getCount()     // Catch:{ all -> 0x0118 }
            X.2rr r6 = r3.A06     // Catch:{ all -> 0x0118 }
            long r0 = r8.A02     // Catch:{ all -> 0x0118 }
            boolean r9 = r6.A07(r5, r0)     // Catch:{ all -> 0x0118 }
            X.2qz r0 = r3.A09     // Catch:{ all -> 0x0118 }
            X.34x r13 = r0.A04(r7, r5)     // Catch:{ all -> 0x0118 }
            if (r13 == 0) goto L_0x007e
            java.util.List r12 = r3.A0B     // Catch:{ all -> 0x0118 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x007e
            java.util.ArrayList r11 = X.AnonymousClass000.A0p(r12)     // Catch:{ all -> 0x0118 }
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x0118 }
        L_0x0054:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0072
            X.34x r10 = X.C18300x5.A0T(r16)     // Catch:{ all -> 0x0118 }
            long r0 = r10.A1L     // Catch:{ all -> 0x0118 }
            r14 = 0
            int r6 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0054
            long r6 = r10.A1M     // Catch:{ all -> 0x0118 }
            long r0 = r13.A1M     // Catch:{ all -> 0x0118 }
            int r14 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0054
            r11.add(r10)     // Catch:{ all -> 0x0118 }
            goto L_0x0054
        L_0x0072:
            r12.removeAll(r11)     // Catch:{ all -> 0x0118 }
            int r0 = r11.size()     // Catch:{ all -> 0x0118 }
            r11 = 1
            if (r0 != 0) goto L_0x007f
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            r11 = 0
        L_0x007f:
            X.7Dp r1 = r3.A00     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x00ee
            X.2ss r0 = r3.A04     // Catch:{ all -> 0x0118 }
            X.31A r0 = X.C56982ss.A01(r0, r5)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x008d
            r0 = 0
            goto L_0x008f
        L_0x008d:
            int r0 = r0.A03     // Catch:{ all -> 0x0118 }
        L_0x008f:
            X.5Pv r10 = new X.5Pv     // Catch:{ all -> 0x0118 }
            r10.<init>(r8, r0, r9)     // Catch:{ all -> 0x0118 }
            X.4VQ r8 = r1.A00     // Catch:{ all -> 0x0118 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0118 }
            r8.A0O = r0     // Catch:{ all -> 0x0118 }
            int r0 = r10.A00     // Catch:{ all -> 0x0118 }
            r8.A01 = r0     // Catch:{ all -> 0x0118 }
            X.2Ni r9 = r10.A01     // Catch:{ all -> 0x0118 }
            android.os.Handler r6 = X.AnonymousClass000.A0A()     // Catch:{ all -> 0x0118 }
            r1 = 12
            X.5rT r0 = new X.5rT     // Catch:{ all -> 0x0118 }
            r0.<init>(r8, r1, r9)     // Catch:{ all -> 0x0118 }
            r6.post(r0)     // Catch:{ all -> 0x0118 }
            long r6 = r9.A02     // Catch:{ all -> 0x0118 }
            r8.A0O(r6)     // Catch:{ all -> 0x0118 }
            long r0 = r9.A01     // Catch:{ all -> 0x0118 }
            r8.A0M(r0)     // Catch:{ all -> 0x0118 }
            r8.A0N(r6)     // Catch:{ all -> 0x0118 }
            X.08M r0 = r8.A0W     // Catch:{ all -> 0x0118 }
            r0.A0G(r10)     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x00e3
            X.5OX r1 = new X.5OX     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            java.util.List r0 = r8.A1I     // Catch:{ all -> 0x0118 }
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0118 }
            r1.A00 = r0     // Catch:{ all -> 0x0118 }
            r1.A06 = r2     // Catch:{ all -> 0x0118 }
            X.5Qd r6 = r1.A00()     // Catch:{ all -> 0x0118 }
            android.os.Handler r2 = X.AnonymousClass000.A0A()     // Catch:{ all -> 0x0118 }
            r1 = 13
            X.5rT r0 = new X.5rT     // Catch:{ all -> 0x0118 }
            r0.<init>(r8, r1, r6)     // Catch:{ all -> 0x0118 }
            r2.post(r0)     // Catch:{ all -> 0x0118 }
        L_0x00e3:
            android.os.Handler r1 = r8.A0R     // Catch:{ all -> 0x0118 }
            r0 = 16
            X.5sE r0 = X.C117625sE.A00(r8, r0)     // Catch:{ all -> 0x0118 }
            r1.post(r0)     // Catch:{ all -> 0x0118 }
        L_0x00ee:
            boolean r0 = r5 instanceof X.C95804uY     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0106
            X.2rc r2 = r3.A08     // Catch:{ all -> 0x0118 }
            X.4uY r5 = (X.C95804uY) r5     // Catch:{ all -> 0x0118 }
            long r0 = r3.A03     // Catch:{ all -> 0x0118 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0118 }
            X.8Ho r0 = new X.8Ho     // Catch:{ all -> 0x0118 }
            r0.<init>(r3)     // Catch:{ all -> 0x0118 }
            r2.A04(r5, r0, r1, r4)     // Catch:{ all -> 0x0118 }
            r17 = 1
        L_0x0106:
            java.lang.String r0 = "messagesViewModel/more-messages/loading/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0118 }
            if (r17 != 0) goto L_0x0117
            java.util.Set r1 = r3.A0C
            java.lang.String r0 = r3.A0A
            r1.remove(r0)
        L_0x0117:
            return
        L_0x0118:
            r2 = move-exception
            if (r17 != 0) goto L_0x0122
            java.util.Set r1 = r3.A0C
            java.lang.String r0 = r3.A0A
            r1.remove(r0)
        L_0x0122:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117555s7.run():void");
    }

    public C117555s7(C147307Dp r1, C56982ss r2, C66543Lv r3, C56362rr r4, C95814uZ r5, C56212rc r6, C55832qz r7, String str, List list, Set set, long j, long j2, long j3) {
        this.A01 = j;
        this.A0A = str;
        this.A05 = r3;
        this.A09 = r7;
        this.A07 = r5;
        this.A02 = j2;
        this.A03 = j3;
        this.A04 = r2;
        this.A06 = r4;
        this.A08 = r6;
        this.A0C = set;
        this.A0B = list;
        this.A00 = r1;
    }
}
