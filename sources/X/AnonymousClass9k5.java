package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9k5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9k5 implements Runnable {
    public final /* synthetic */ AnonymousClass3XA A00;
    public final /* synthetic */ AnonymousClass39R A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass9VS A04;
    public final /* synthetic */ C624134x A05;
    public final /* synthetic */ AnonymousClass39M A06;
    public final /* synthetic */ Integer A07;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            X.9VS r5 = r0.A04
            X.39M r8 = r0.A06
            X.4uZ r13 = r0.A02
            com.whatsapp.jid.UserJid r14 = r0.A03
            X.34x r7 = r0.A05
            java.lang.Integer r6 = r0.A07
            X.39R r4 = r0.A01
            X.3XA r3 = r0.A00
            X.9PL r2 = new X.9PL
            r2.<init>()
            r0 = 2
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r10.<init>(r0)
            if (r8 != 0) goto L_0x009d
            r0 = 6
        L_0x0020:
            r2.A01 = r0
            r10.countDown()
        L_0x0025:
            X.1VX r9 = r5.A04
            r8 = 1084(0x43c, float:1.519E-42)
            boolean r1 = r9.A0X(r8)
            r0 = 7
            if (r1 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x0043
            X.3Dh r0 = r5.A00
            java.io.File r0 = r0.A0F()
            java.io.File r16 = r4.A02(r0)
            boolean r0 = r16.exists()
            if (r0 != 0) goto L_0x004a
            r0 = 4
        L_0x0043:
            r2.A00 = r0
        L_0x0045:
            r10.countDown()
            goto L_0x0113
        L_0x004a:
            X.2px r1 = r5.A03
            java.lang.String r0 = r4.A0F
            X.39R r7 = r1.A01(r0)
            r6 = 1
            if (r7 == 0) goto L_0x00d8
            byte[] r11 = r7.A08
            if (r11 == 0) goto L_0x00d8
            long r0 = r7.A00
            X.32B r12 = new X.32B
            r12.<init>(r11, r0)
            X.2sH r11 = r5.A02
            long r0 = r11.A0H()
            boolean r0 = X.AnonymousClass32B.A00(r12, r0)
            if (r0 == 0) goto L_0x00d8
            long r0 = r7.A00
            long r14 = r11.A0H()
            r11 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r0 = r0 + r11
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x00d8
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x00d8
            byte[] r13 = r7.A08
            long r0 = r7.A00
            java.lang.String r12 = r7.A04
            java.lang.String r11 = r7.A03
            java.lang.String r7 = r7.A02
            boolean r5 = r9.A0X(r8)
            r4.A08 = r13
            r4.A00 = r0
            r4.A04 = r12
            r4.A03 = r11
            r4.A02 = r7
            r4.A07 = r5
            r2.A00 = r6
            goto L_0x0045
        L_0x009d:
            int r0 = r8.A00
            long r0 = (long) r0
            r11 = 1048576(0x100000, double:5.180654E-318)
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x00d5
            r9 = 0
            X.32J r11 = X.AnonymousClass9VS.A00(r8, r9)
            if (r11 != 0) goto L_0x00b1
            r0 = 4
            goto L_0x0020
        L_0x00b1:
            X.33c r1 = r5.A06
            r0 = 1
            X.3QO r15 = r1.A03(r11, r0)
            java.lang.String r0 = "mms"
            r15.A0W = r0
            X.9eK r12 = new X.9eK
            r16 = r2
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r6
            r21 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r15.A04(r12, r9)
            r1.A0E(r15, r9)
            goto L_0x0025
        L_0x00d5:
            r0 = 2
            goto L_0x0020
        L_0x00d8:
            r12 = 0
            r0 = 0
            X.7iO r14 = new X.7iO
            r14.<init>(r6, r0, r6)
            X.38t r15 = X.C633138t.A0X
            android.net.Uri r11 = android.net.Uri.fromFile(r16)
            r16 = r12
            r17 = r12
            r19 = r0
            r20 = r0
            r13 = r12
            r21 = r6
            r18 = r0
            X.32J r0 = X.AnonymousClass32J.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.33c r7 = r5.A06
            X.3QO r1 = r7.A03(r0, r6)
            java.lang.String r0 = "mms"
            r1.A0W = r0
            X.9eH r13 = new X.9eH
            r14 = r4
            r15 = r1
            r16 = r2
            r17 = r5
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r1.A04(r13, r12)
            r7.A0E(r1, r12)
        L_0x0113:
            r10.await()     // Catch:{ InterruptedException -> 0x0117 }
            goto L_0x0122
        L_0x0117:
            r1 = move-exception
            java.lang.String r0 = "Payment Media upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0126 }
            r0 = 3
            r2.A01 = r0     // Catch:{ all -> 0x0126 }
            r2.A00 = r0     // Catch:{ all -> 0x0126 }
        L_0x0122:
            r3.A05(r2)
            return
        L_0x0126:
            r0 = move-exception
            r3.A05(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9k5.run():void");
    }

    public /* synthetic */ AnonymousClass9k5(AnonymousClass3XA r1, AnonymousClass39R r2, C95814uZ r3, UserJid userJid, AnonymousClass9VS r5, C624134x r6, AnonymousClass39M r7, Integer num) {
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = userJid;
        this.A05 = r6;
        this.A07 = num;
        this.A01 = r2;
        this.A00 = r1;
    }
}
