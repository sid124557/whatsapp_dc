package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.1I8  reason: invalid class name */
public abstract class AnonymousClass1I8 extends AnonymousClass3XA implements Runnable, AnonymousClass495 {
    public final AnonymousClass3XB A00 = AnonymousClass3XB.A00();
    public final CountDownLatch A01 = C18290x4.A14();
    public final FutureTask A02 = new C73503fb(this, new AnonymousClass91H(this, 2));

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(3:136|(2:138|139)|154)|140|141|(3:143|369|152)(2:149|150)|153) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:223|224|225|226|227|638|228) */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04a0, code lost:
        if (r24 != false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x058c, code lost:
        if (((X.C135406kc) r2).A01 != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0626, code lost:
        if (r4.A01 != false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        if (r1 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x035f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:226:0x0597 */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0365 A[Catch:{ all -> 0x0add, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376 A[SYNTHETIC, Splitter:B:149:0x0376] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0a52 A[Catch:{ all -> 0x0add, all -> 0x0b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0a99  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0ab1  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0abe  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0b69  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:226:0x0597=Splitter:B:226:0x0597, B:347:0x07bb=Splitter:B:347:0x07bb, B:121:0x030c=Splitter:B:121:0x030c, B:342:0x079e=Splitter:B:342:0x079e, B:140:0x035f=Splitter:B:140:0x035f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07() {
        /*
            r45 = this;
            r0 = r45
            boolean r1 = r0 instanceof X.AnonymousClass1I6
            if (r1 == 0) goto L_0x0039
            X.1I6 r0 = (X.AnonymousClass1I6) r0
            X.2dE r1 = r0.A00
            java.lang.Boolean r3 = r1.A00()
            java.lang.ref.WeakReference r1 = r0.A01
            if (r1 == 0) goto L_0x0038
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0038
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r0.equals(r3)
            java.lang.Object r4 = r1.get()
            X.48J r4 = (X.AnonymousClass48J) r4
            X.4el r4 = (X.C89704el) r4
            java.lang.String r0 = "fpm/ChatTransferActivity/downloaded-lottie-on-demand"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r2 = r4.A04
            r0 = 21
            X.3Zo r1 = new X.3Zo
            r1.<init>(r4, r0)
            java.lang.String r0 = "fpm/ChatTransferActivity/lottie"
            r2.BkQ(r1, r0)
        L_0x0038:
            return r3
        L_0x0039:
            boolean r1 = r0 instanceof X.AnonymousClass1I5
            if (r1 == 0) goto L_0x0b94
            X.1I5 r0 = (X.AnonymousClass1I5) r0
            boolean r1 = r0 instanceof X.AnonymousClass1g5
            if (r1 == 0) goto L_0x0110
            X.1g5 r0 = (X.AnonymousClass1g5) r0
            X.34l r2 = r0.A0a
            X.2zt r3 = r0.A0V
            X.2UD r5 = r3.A02
            X.38t r4 = r5.A06
            java.io.File r6 = r5.A07
            X.C626936e.A06(r6)
            boolean r1 = r0.A0E()
            boolean r1 = r2.A08(r4, r6, r1)
            if (r1 != 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unable to send media; media valid check failed."
            r1.append(r0)
            X.C18260x0.A0n(r3, r1)
            r0 = 5
        L_0x006a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x006f:
            X.C626936e.A06(r6)
            boolean r1 = r0.A0E()
            java.lang.String r2 = r2.A07(r4, r6, r1)
            if (r2 == 0) goto L_0x0082
            X.2sV r1 = r0.A0X
            monitor-enter(r1)
            r1.A0B = r2     // Catch:{ all -> 0x0ada }
            monitor-exit(r1)
        L_0x0082:
            X.2y5 r2 = r0.A0d
            X.3Dh r1 = r0.A08
            X.C107655bf.A0Z(r1, r2)
            r0.A0B()
            X.1i8 r1 = r0.A0f
            r1.A0D()
            X.5LI r2 = r1.A0B()
            X.2sH r1 = r0.A0I
            java.lang.String r8 = X.C57552tp.A00(r1, r2)
            if (r2 == 0) goto L_0x010c
            if (r8 == 0) goto L_0x010c
            int r9 = X.C387729e.A00(r4)
            X.C626936e.A06(r6)
            java.lang.String r6 = r6.getPath()
            java.lang.String r2 = r5.A0A
            X.38t r1 = X.C633138t.A0Z
            if (r4 != r1) goto L_0x00dc
            r10 = 3
        L_0x00b1:
            boolean r1 = r3.A02()
            r11 = r1 ^ 1
            java.lang.String r7 = r3.toString()
            X.7U7 r5 = new X.7U7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.2JB r1 = r0.A00
            X.2PI r2 = new X.2PI
            r2.<init>(r0, r1)
            r1 = 1
            X.90E r0 = new X.90E
            r0.<init>(r5, r2, r2, r1)
            r2.A00 = r0
            java.lang.Object r0 = X.C105935Wz.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0108
            int r0 = r0.intValue()
            goto L_0x006a
        L_0x00dc:
            X.38t r1 = X.C633138t.A08
            if (r4 != r1) goto L_0x00e2
            r10 = 6
            goto L_0x00b1
        L_0x00e2:
            int r1 = r2.hashCode()
            switch(r1) {
                case -786681338: goto L_0x00eb;
                case 108243: goto L_0x00f4;
                case 1312630381: goto L_0x00fd;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            r10 = -1
            goto L_0x00b1
        L_0x00eb:
            java.lang.String r1 = "payment"
            boolean r1 = r2.equals(r1)
            r10 = 2
            goto L_0x0105
        L_0x00f4:
            java.lang.String r1 = "mms"
            boolean r1 = r2.equals(r1)
            r10 = 0
            goto L_0x0105
        L_0x00fd:
            java.lang.String r1 = "optimistic"
            boolean r1 = r2.equals(r1)
            r10 = 1
        L_0x0105:
            if (r1 != 0) goto L_0x00b1
            goto L_0x00e9
        L_0x0108:
            r0 = 23
            goto L_0x006a
        L_0x010c:
            r0 = 33
            goto L_0x006a
        L_0x0110:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "mediaupload/call request="
            r3.append(r1)
            boolean r1 = r0 instanceof X.AnonymousClass1g6
            r23 = r1
            X.2zt r2 = r0.A0V
            r3.append(r2)
            java.lang.String r1 = ", this="
            X.C18260x0.A1P(r3, r1, r0)
            X.5LM r1 = r2.A01     // Catch:{ all -> 0x0b2c }
            r44 = r1
            long r5 = r1.A09     // Catch:{ all -> 0x0b2c }
            r3 = 0
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x013b
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0b2c }
            r1 = r44
            r1.A09 = r3     // Catch:{ all -> 0x0b2c }
        L_0x013b:
            X.2UL r7 = r0.A0Y     // Catch:{ all -> 0x0b2c }
            X.2y3 r1 = r0.A0T     // Catch:{ all -> 0x0b2c }
            r43 = r1
            r6 = 0
            java.lang.Float r1 = r1.A01(r6)     // Catch:{ all -> 0x0b2c }
            r7.A05 = r1     // Catch:{ all -> 0x0b2c }
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0b2c }
            r7.A04 = r1     // Catch:{ all -> 0x0b2c }
            boolean r1 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0b2c }
            r7.A03 = r1     // Catch:{ all -> 0x0b2c }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0b2c }
            X.2sH r1 = r0.A0I     // Catch:{ all -> 0x0b2c }
            java.lang.Long r1 = X.C56612sH.A09(r1)     // Catch:{ all -> 0x0b2c }
            r7.A0I = r1     // Catch:{ all -> 0x0b2c }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0b2c }
            X.1i8 r8 = r0.A0f     // Catch:{ all -> 0x0b2c }
            r8.A0D()     // Catch:{ all -> 0x0b2c }
            boolean r1 = r0 instanceof X.AnonymousClass1g4     // Catch:{ all -> 0x0b2c }
            if (r1 == 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r15 = 0
            goto L_0x0175
        L_0x0174:
            r15 = 1
        L_0x0175:
            if (r15 == 0) goto L_0x01cd
            X.2UD r1 = r2.A02     // Catch:{ all -> 0x0b2c }
            X.38t r3 = r1.A06     // Catch:{ all -> 0x0b2c }
            r42 = r3
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x0b2c }
            r33 = r3
            r34 = 0
            X.5LI r31 = r8.A0B()     // Catch:{ all -> 0x0b2c }
            X.2sH r14 = r8.A07     // Catch:{ all -> 0x0b2c }
            X.1VX r13 = r8.A08     // Catch:{ all -> 0x0b2c }
            X.7VN r12 = r8.A0H     // Catch:{ all -> 0x0b2c }
            X.2qk r11 = r8.A05     // Catch:{ all -> 0x0b2c }
            X.1im r10 = r8.A06     // Catch:{ all -> 0x0b2c }
            X.2rm r9 = r8.A0D     // Catch:{ all -> 0x0b2c }
            X.2p6 r5 = r8.A09     // Catch:{ all -> 0x0b2c }
            long r3 = r8.A03     // Catch:{ all -> 0x0b2c }
            r40 = 1
            r37 = r6
            r41 = r6
            r26 = r14
            r27 = r13
            r28 = r5
            r29 = r9
            r30 = r8
            r32 = r12
            r35 = r34
            r36 = r6
            r38 = r3
            r24 = r11
            r25 = r10
            X.3UQ r5 = X.AnonymousClass3UQ.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41)     // Catch:{ all -> 0x0b2c }
            X.7US r9 = r5.A02     // Catch:{ all -> 0x0b2c }
            if (r9 == 0) goto L_0x01c5
            java.lang.String r5 = "RouteSelector/newTransfer Use static route supplier for express path upload"
            com.whatsapp.util.Log.d((java.lang.String) r5)     // Catch:{ all -> 0x0b2c }
            X.6oz r5 = new X.6oz     // Catch:{ all -> 0x0b2c }
            r5.<init>(r9, r3)     // Catch:{ all -> 0x0b2c }
        L_0x01c5:
            X.2YO r22 = new X.2YO     // Catch:{ all -> 0x0b2c }
            r3 = r22
            r3.<init>(r5)     // Catch:{ all -> 0x0b2c }
            goto L_0x01e0
        L_0x01cd:
            X.2UD r1 = r2.A02     // Catch:{ all -> 0x0b2c }
            X.38t r3 = r1.A06     // Catch:{ all -> 0x0b2c }
            r42 = r3
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x0b2c }
            r33 = r3
            r10 = 0
            r13 = r6
            r9 = r3
            r11 = r10
            r12 = r6
            X.2YO r22 = r8.A09(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0b2c }
        L_0x01e0:
            long r3 = X.AnonymousClass0x7.A0E(r16)     // Catch:{ all -> 0x0b2c }
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            r7.A0H = r5     // Catch:{ all -> 0x0b2c }
            r5 = r22
            X.8to r5 = r5.A00     // Catch:{ all -> 0x0b2c }
            X.7US r9 = r5.B6Y()     // Catch:{ all -> 0x0b2c }
            r5 = 33
            if (r9 != 0) goto L_0x0205
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/getselectedroute/failed; request="
            X.C18260x0.A1Q(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a79
        L_0x0205:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r5 = "mediaupload/getselectedroute/took "
            r9.append(r5)     // Catch:{ all -> 0x0b2c }
            r9.append(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "ms to get route; request="
            X.C18260x0.A1P(r9, r3, r2)     // Catch:{ all -> 0x0b2c }
            if (r15 == 0) goto L_0x0238
            r3 = r22
            X.8to r3 = r3.A00     // Catch:{ all -> 0x0b2c }
            X.7US r3 = r3.B6Y()     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = "fallback"
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0238
            java.lang.String r3 = "mediaUpload/call No primary host for express path upload"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            r3 = 27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a79
        L_0x0238:
            r3 = r22
            r0.A01 = r3     // Catch:{ all -> 0x0b2c }
            r0.A08()     // Catch:{ all -> 0x0b2c }
            X.2sV r5 = r0.A0X     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            X.7Hs r3 = r5.A01     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0252
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            X.7Hs r3 = r5.A01     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            X.7Ht r14 = r3.A01     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            X.7Hs r3 = r5.A01     // Catch:{ all -> 0x0b29 }
            goto L_0x0524
        L_0x0252:
            X.7L3 r10 = r0.A0W     // Catch:{ all -> 0x0b2c }
            X.8rZ r3 = r0.A0L     // Catch:{ all -> 0x0b2c }
            r30 = r3
            boolean r12 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            boolean r9 = X.C18320x8.A1V(r30)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r1.A0D     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x0297
            X.34l r11 = r10.A02     // Catch:{ all -> 0x0b2c }
            java.io.File r3 = r1.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x0b2c }
            java.security.MessageDigest r10 = X.AnonymousClass0x7.A0t()     // Catch:{ all -> 0x0b2c }
            java.io.InputStream r3 = r11.A06(r2, r3)     // Catch:{ all -> 0x0b2c }
            X.6tY r4 = new X.6tY     // Catch:{ all -> 0x0b2c }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x0b2c }
            r3 = 0
            X.8KT r10 = new X.8KT     // Catch:{ all -> 0x0b2c }
            r10.<init>(r4, r4, r3, r11)     // Catch:{ all -> 0x0b2c }
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x0afe }
        L_0x0282:
            X.6tY r3 = r10.A00     // Catch:{ all -> 0x0afe }
            int r3 = r3.read(r4)     // Catch:{ all -> 0x0afe }
            if (r3 >= 0) goto L_0x0282
            X.6tY r3 = r10.A02     // Catch:{ all -> 0x0afe }
            java.lang.String r3 = r3.A00()     // Catch:{ all -> 0x0afe }
            X.7SM r12 = new X.7SM     // Catch:{ all -> 0x0afe }
            r12.<init>(r3, r6)     // Catch:{ all -> 0x0afe }
            goto L_0x04ed
        L_0x0297:
            X.32B r11 = r5.A00()     // Catch:{ all -> 0x0b2c }
            r24 = 1
            if (r11 == 0) goto L_0x02d5
            boolean r3 = r2.A02()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x02c2
            int r4 = r2.A00()     // Catch:{ all -> 0x0b2c }
            r3 = 3
            if (r4 == r3) goto L_0x02b8
            X.2sH r3 = r10.A00     // Catch:{ all -> 0x0b2c }
            long r3 = r3.A0H()     // Catch:{ all -> 0x0b2c }
            boolean r3 = X.AnonymousClass32B.A00(r11, r3)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x02c2
        L_0x02b8:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/reuse key from message contents; request="
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            goto L_0x02d8
        L_0x02c2:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/key expired; request="
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r3 = 0
            r5.A00 = r3     // Catch:{ all -> 0x0b26 }
            r5.A08 = r3     // Catch:{ all -> 0x0b26 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            r29 = 2
            goto L_0x02da
        L_0x02d5:
            r29 = 1
            goto L_0x02da
        L_0x02d8:
            r29 = 3
        L_0x02da:
            if (r12 == 0) goto L_0x0327
            X.34l r4 = r10.A02     // Catch:{ all -> 0x0b2c }
            r3 = 32
            byte[] r3 = X.AnonymousClass29O.A01(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = X.C18290x4.A0t(r3)     // Catch:{ all -> 0x0b2c }
            X.7SM r14 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r14.<init>(r3, r6)     // Catch:{ all -> 0x0b2c }
            r3 = 32
            byte[] r3 = X.AnonymousClass29O.A01(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = X.C18290x4.A0t(r3)     // Catch:{ all -> 0x0b2c }
            X.7SM r13 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r13.<init>(r3, r6)     // Catch:{ all -> 0x0b2c }
            r3 = 32
            byte[] r12 = new byte[r3]     // Catch:{ all -> 0x0b2c }
            monitor-enter(r4)     // Catch:{ all -> 0x0b2c }
            java.security.SecureRandom r3 = r4.A00     // Catch:{ all -> 0x0add }
            if (r3 != 0) goto L_0x030c
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x0add }
            r3.<init>()     // Catch:{ all -> 0x0add }
            r4.A00 = r3     // Catch:{ all -> 0x0add }
        L_0x030c:
            monitor-exit(r4)     // Catch:{ all -> 0x0b2c }
            r3.nextBytes(r12)     // Catch:{ all -> 0x0b2c }
            X.2sH r3 = r4.A02     // Catch:{ all -> 0x0b2c }
            long r3 = r3.A0H()     // Catch:{ all -> 0x0b2c }
            X.32B r11 = new X.32B     // Catch:{ all -> 0x0b2c }
            r11.<init>(r12, r3)     // Catch:{ all -> 0x0b2c }
            X.7Ht r3 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r3.<init>(r11, r9)     // Catch:{ all -> 0x0b2c }
            X.7L5 r4 = new X.7L5     // Catch:{ all -> 0x0b2c }
            r4.<init>(r14, r13, r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x03bb
        L_0x0327:
            int r3 = r1.A01     // Catch:{ all -> 0x0b2c }
            boolean r13 = X.AnonymousClass001.A1X(r3, r9)
            X.34l r11 = r10.A02     // Catch:{ all -> 0x0b2c }
            r2.A01()     // Catch:{ all -> 0x0b2c }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0b2c }
            java.io.File r4 = r1.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0b08
            if (r13 == 0) goto L_0x035f
            java.lang.String r3 = r5.A06()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x035f
            java.lang.String r3 = r5.A05()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x035f
            X.32B r3 = r5.A00()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x035f
            java.lang.String r3 = r5.A05()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x039b
            android.util.Base64.decode(r3, r6)     // Catch:{ IllegalArgumentException -> 0x035f }
            goto L_0x039b
        L_0x035f:
            X.32B r3 = r5.A00()     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x0376
            r3 = 32
            byte[] r13 = new byte[r3]     // Catch:{ all -> 0x0b2c }
            monitor-enter(r11)     // Catch:{ all -> 0x0b2c }
            java.security.SecureRandom r3 = r11.A00     // Catch:{ all -> 0x0ae0 }
            if (r3 != 0) goto L_0x0380
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x0ae0 }
            r3.<init>()     // Catch:{ all -> 0x0ae0 }
            r11.A00 = r3     // Catch:{ all -> 0x0ae0 }
            goto L_0x0380
        L_0x0376:
            X.32B r3 = r5.A00()     // Catch:{ all -> 0x0b2c }
            X.7Ht r4 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r4.<init>(r3, r6)     // Catch:{ all -> 0x0b2c }
            goto L_0x0394
        L_0x0380:
            monitor-exit(r11)     // Catch:{ all -> 0x0b2c }
            r3.nextBytes(r13)     // Catch:{ all -> 0x0b2c }
            X.2sH r3 = r11.A02     // Catch:{ all -> 0x0b2c }
            long r3 = r3.A0H()     // Catch:{ all -> 0x0b2c }
            X.32B r12 = new X.32B     // Catch:{ all -> 0x0b2c }
            r12.<init>(r13, r3)     // Catch:{ all -> 0x0b2c }
            X.7Ht r4 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r4.<init>(r12, r9)     // Catch:{ all -> 0x0b2c }
        L_0x0394:
            r3 = r30
            X.7L5 r4 = r11.A05(r3, r2, r4)     // Catch:{ all -> 0x0b2c }
            goto L_0x03bb
        L_0x039b:
            java.lang.String r3 = r5.A06()     // Catch:{ all -> 0x0b2c }
            X.7SM r12 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r12.<init>(r3, r9)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r5.A05()     // Catch:{ all -> 0x0b2c }
            X.7SM r11 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r11.<init>(r3, r9)     // Catch:{ all -> 0x0b2c }
            X.32B r4 = r5.A00()     // Catch:{ all -> 0x0b2c }
            X.7Ht r3 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0b2c }
            X.7L5 r4 = new X.7L5     // Catch:{ all -> 0x0b2c }
            r4.<init>(r12, r11, r3)     // Catch:{ all -> 0x0b2c }
        L_0x03bb:
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x0b2c }
            X.7SM r3 = r4.A01     // Catch:{ all -> 0x0b2c }
            r28 = r3
            X.C162457s7.A0C(r28)     // Catch:{ all -> 0x0b2c }
            X.7SM r13 = r4.A00     // Catch:{ all -> 0x0b2c }
            X.C162457s7.A0C(r13)     // Catch:{ all -> 0x0b2c }
            X.7Ht r3 = r4.A02     // Catch:{ all -> 0x0b2c }
            r21 = r3
            X.C162457s7.A0C(r21)     // Catch:{ all -> 0x0b2c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/computed hashes; plaintext="
            r4.append(r3)     // Catch:{ all -> 0x0b2c }
            r3 = r28
            r4.append(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "; encrypted="
            r4.append(r3)     // Catch:{ all -> 0x0b2c }
            r4.append(r13)     // Catch:{ all -> 0x0b2c }
            java.lang.String r20 = "; request="
            r3 = r20
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            r3 = r28
            java.lang.String r15 = r3.A00     // Catch:{ all -> 0x0b2c }
            r3 = r42
            byte r4 = r3.A00     // Catch:{ all -> 0x0b2c }
            if (r15 == 0) goto L_0x04a5
            X.319 r3 = r10.A01     // Catch:{ all -> 0x0b2c }
            r27 = r3
            X.2S8 r11 = r3.A0A(r15, r4, r9)     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x04a5
            r3 = r21
            boolean r3 = r3.A01     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a7
            X.33C r12 = r11.A02     // Catch:{ all -> 0x0b2c }
            long r3 = r11.A01     // Catch:{ all -> 0x0b2c }
            r25 = r3
            byte[] r3 = r12.A0W     // Catch:{ all -> 0x0b2c }
            r14 = r3
            long r3 = r12.A0B     // Catch:{ all -> 0x0b2c }
            r18 = r3
            if (r14 != 0) goto L_0x0418
            goto L_0x0428
        L_0x0418:
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 > 0) goto L_0x0420
            r18 = r25
        L_0x0420:
            X.32B r12 = new X.32B     // Catch:{ all -> 0x0b2c }
            r3 = r18
            r12.<init>(r14, r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0429
        L_0x0428:
            r12 = 0
        L_0x0429:
            if (r12 == 0) goto L_0x04a7
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/found matching key for encryptedHash="
            r4.append(r3)     // Catch:{ all -> 0x0b2c }
            r4.append(r13)     // Catch:{ all -> 0x0b2c }
            r3 = r20
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r11.A03     // Catch:{ all -> 0x0b2c }
            r16 = r3
            X.C162457s7.A0C(r16)     // Catch:{ all -> 0x0b2c }
            byte[] r14 = r12.A01     // Catch:{ all -> 0x0b2c }
            X.C162457s7.A0C(r14)     // Catch:{ all -> 0x0b2c }
            r4 = r27
            X.2z0 r9 = r4.A0B(r15, r3, r14, r9)     // Catch:{ all -> 0x0b2c }
            if (r9 == 0) goto L_0x0479
            X.4uZ r3 = r9.A00     // Catch:{ all -> 0x0b2c }
            boolean r3 = r3 instanceof X.C135166kE     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0479
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/match an older message, but was uploaded as a status, message key = "
            X.C18260x0.A1P(r4, r3, r9)     // Catch:{ all -> 0x0b2c }
        L_0x045f:
            boolean r3 = r2.A02()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a0
            int r4 = r2.A00()     // Catch:{ all -> 0x0b2c }
            r3 = 3
            if (r4 == r3) goto L_0x047c
            X.2sH r3 = r10.A00     // Catch:{ all -> 0x0b2c }
            long r9 = r3.A0H()     // Catch:{ all -> 0x0b2c }
            boolean r3 = X.AnonymousClass32B.A00(r12, r9)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a0
            goto L_0x047c
        L_0x0479:
            r24 = 0
            goto L_0x045f
        L_0x047c:
            if (r24 != 0) goto L_0x04a2
            X.7SM r13 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r3 = r16
            r13.<init>(r3, r6)     // Catch:{ all -> 0x0b2c }
            X.7Ht r21 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r3 = r21
            r3.<init>(r12, r6)     // Catch:{ all -> 0x0b2c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/reuse key from matching older message; new encrypted="
            r4.append(r3)     // Catch:{ all -> 0x0b2c }
            r4.append(r13)     // Catch:{ all -> 0x0b2c }
            r3 = r20
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            r29 = 3
            goto L_0x04a7
        L_0x04a0:
            if (r24 == 0) goto L_0x04a7
        L_0x04a2:
            r29 = 4
            goto L_0x04a7
        L_0x04a5:
            r9 = 0
            goto L_0x04d4
        L_0x04a7:
            X.33C r4 = r11.A02     // Catch:{ all -> 0x0b2c }
            java.io.File r9 = r1.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r9)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.A0R     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a5
            java.io.File r3 = r4.A0F     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a5
            boolean r3 = r3.isAbsolute()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a5
            java.io.File r3 = r4.A0F     // Catch:{ all -> 0x0b2c }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x04a5
            java.io.File r3 = r4.A0F     // Catch:{ all -> 0x0b2c }
            long r11 = r3.length()     // Catch:{ all -> 0x0b2c }
            long r9 = r9.length()     // Catch:{ all -> 0x0b2c }
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x04a5
            java.io.File r9 = r4.A0F     // Catch:{ all -> 0x0b2c }
        L_0x04d4:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "MediaKeyGen/matched media lookup finished; request="
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            X.7Nw r10 = new X.7Nw     // Catch:{ all -> 0x0b2c }
            r24 = r10
            r25 = r28
            r26 = r13
            r27 = r21
            r28 = r9
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0b2c }
            goto L_0x0506
        L_0x04ed:
            r10.close()     // Catch:{ all -> 0x0b2c }
            r11 = 0
            X.7SM r4 = new X.7SM     // Catch:{ all -> 0x0b2c }
            r4.<init>(r11, r6)     // Catch:{ all -> 0x0b2c }
            X.7Ht r3 = new X.7Ht     // Catch:{ all -> 0x0b2c }
            r3.<init>(r11, r9)     // Catch:{ all -> 0x0b2c }
            X.7Nw r10 = new X.7Nw     // Catch:{ all -> 0x0b2c }
            r13 = r4
            r14 = r3
            r15 = r11
            r16 = r9
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0b2c }
        L_0x0506:
            X.3XB r9 = r0.A0E     // Catch:{ all -> 0x0b2c }
            X.7Ht r14 = r10.A03     // Catch:{ all -> 0x0b2c }
            int r4 = r10.A00     // Catch:{ all -> 0x0b2c }
            X.7Hs r3 = new X.7Hs     // Catch:{ all -> 0x0b2c }
            r3.<init>(r14, r4)     // Catch:{ all -> 0x0b2c }
            r9.A05(r3)     // Catch:{ all -> 0x0b2c }
            X.3XB r3 = r0.A0F     // Catch:{ all -> 0x0b2c }
            r3.A05(r10)     // Catch:{ all -> 0x0b2c }
            X.7SM r9 = r10.A02     // Catch:{ all -> 0x0b2c }
            X.7SM r3 = r10.A01     // Catch:{ all -> 0x0b2c }
            r37 = r3
            java.io.File r3 = r10.A04     // Catch:{ all -> 0x0b2c }
            r0.A03 = r3     // Catch:{ all -> 0x0b2c }
            goto L_0x0537
        L_0x0524:
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            int r4 = r3.A00     // Catch:{ all -> 0x0b2c }
            X.34l r9 = r0.A0a     // Catch:{ all -> 0x0b2c }
            X.8rZ r3 = r0.A0L     // Catch:{ all -> 0x0b2c }
            r30 = r3
            X.7L5 r3 = r9.A05(r3, r2, r14)     // Catch:{ all -> 0x0b2c }
            X.7SM r9 = r3.A01     // Catch:{ all -> 0x0b2c }
            X.7SM r3 = r3.A00     // Catch:{ all -> 0x0b2c }
            r37 = r3
        L_0x0537:
            java.lang.String r3 = r9.A00     // Catch:{ all -> 0x0b2c }
            r36 = r3
            r5.A0A(r3)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r9.A01     // Catch:{ all -> 0x0b2c }
            r21 = r3
            r0.A08()     // Catch:{ all -> 0x0b2c }
            r3 = r44
            int r3 = r3.A00     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x054f
            r3 = r44
            r3.A00 = r4     // Catch:{ all -> 0x0b2c }
        L_0x054f:
            r3 = r37
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x0b2c }
            r5.A09(r3)     // Catch:{ all -> 0x0b2c }
            r0.A04 = r3     // Catch:{ all -> 0x0b2c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/matched media lookup finished; request="
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            r0.A08()     // Catch:{ all -> 0x0b2c }
            boolean r3 = r1.A0E     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x05a4
            int r4 = r2.A00()     // Catch:{ all -> 0x0b2c }
            r3 = 3
            boolean r3 = X.AnonymousClass000.A1U(r4, r3)
            if (r3 != 0) goto L_0x05a4
            java.lang.String r3 = "mediaupload ignoring upload for self-thread messages, possibly no paired devices"
            com.whatsapp.util.Log.d((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x059e
        L_0x057e:
            if (r23 == 0) goto L_0x058e
            boolean r3 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x058e
            r3 = r2
            X.6kc r3 = (X.C135406kc) r3     // Catch:{ all -> 0x0b2c }
            boolean r4 = r3.A01     // Catch:{ all -> 0x0b2c }
            r3 = 1
            if (r4 == 0) goto L_0x058f
        L_0x058e:
            r3 = 0
        L_0x058f:
            if (r3 == 0) goto L_0x059e
            r3 = 100
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0597 }
            goto L_0x059a
        L_0x0597:
            X.C18300x5.A11()     // Catch:{ all -> 0x0b2c }
        L_0x059a:
            r0.A08()     // Catch:{ all -> 0x0b2c }
            goto L_0x057e
        L_0x059e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x05a4:
            X.34l r11 = r0.A0a     // Catch:{ all -> 0x0b2c }
            java.io.File r10 = r1.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            boolean r4 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            r3 = r42
            boolean r3 = r11.A08(r3, r10, r4)     // Catch:{ all -> 0x0b2c }
            r9 = 5
            if (r3 != 0) goto L_0x05c8
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "unable to send media; was not eligible for encryption but must be encrypted; request="
            X.C18260x0.A1Q(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x05c8:
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            boolean r4 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            r3 = r42
            java.lang.String r3 = r11.A07(r3, r10, r4)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x05db
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0B = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x05db:
            X.32B r13 = r14.A00     // Catch:{ all -> 0x0b2c }
            if (r13 == 0) goto L_0x05f4
            byte[] r4 = r13.A01     // Catch:{ all -> 0x0b2c }
        L_0x05e1:
            X.8oI r3 = r0.A0K     // Catch:{ all -> 0x0b2c }
            X.2Na r9 = r3.B1Z(r4)     // Catch:{ all -> 0x0b2c }
            r3 = r30
            X.8oJ r20 = r3.B7L(r4)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r2.A02()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0611
            goto L_0x05f7
        L_0x05f4:
            byte[] r4 = X.AnonymousClass1I5.A0k     // Catch:{ all -> 0x0b2c }
            goto L_0x05e1
        L_0x05f7:
            if (r13 != 0) goto L_0x0601
            r3 = 30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x0601:
            byte[] r12 = r9.A00     // Catch:{ all -> 0x0b2c }
            byte[] r4 = r9.A02     // Catch:{ all -> 0x0b2c }
            byte[] r3 = r9.A01     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A00 = r13     // Catch:{ all -> 0x0b29 }
            r5.A0I = r12     // Catch:{ all -> 0x0b29 }
            r5.A0K = r4     // Catch:{ all -> 0x0b29 }
            r5.A0L = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0611:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/key derivation done; request="
            X.C18260x0.A1P(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            r0.A08()     // Catch:{ all -> 0x0b2c }
            X.7iO r4 = r2.A03     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.A02     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0628
            boolean r4 = r4.A01     // Catch:{ all -> 0x0b2c }
            r3 = 1
            if (r4 == 0) goto L_0x0629
        L_0x0628:
            r3 = 0
        L_0x0629:
            if (r3 == 0) goto L_0x062c
            goto L_0x062f
        L_0x062c:
            r19 = 0
            goto L_0x0632
        L_0x062f:
            java.lang.String r19 = "status"
        L_0x0632:
            r3 = r44
            java.lang.String r4 = r3.A0D     // Catch:{ all -> 0x0b2c }
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 == 0) goto L_0x065a
            java.util.UUID r3 = java.util.UUID.fromString(r4)     // Catch:{ all -> 0x0b2c }
            long r15 = r3.getMostSignificantBits()     // Catch:{ all -> 0x0b2c }
            long r15 = r15 & r17
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0b2c }
        L_0x064b:
            X.2gm r3 = r0.A0U     // Catch:{ all -> 0x0b2c }
            java.util.List r12 = r1.A0B     // Catch:{ all -> 0x0b2c }
            java.util.List r3 = r3.A00(r12)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x065f
            goto L_0x065c
        L_0x065a:
            r15 = 0
            goto L_0x064b
        L_0x065c:
            if (r4 == 0) goto L_0x065f
            goto L_0x0661
        L_0x065f:
            r12 = 0
            goto L_0x066f
        L_0x0661:
            java.util.UUID r3 = java.util.UUID.fromString(r4)     // Catch:{ all -> 0x0b2c }
            long r3 = r3.getLeastSignificantBits()     // Catch:{ all -> 0x0b2c }
            long r3 = r3 & r17
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0b2c }
        L_0x066f:
            boolean r3 = r2.A02()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x06cc
            java.lang.String r3 = r0.A04     // Catch:{ all -> 0x0b2c }
            r16 = r3
        L_0x0679:
            X.2iJ r4 = new X.2iJ     // Catch:{ all -> 0x0b2c }
            r4.<init>()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r1.A0A     // Catch:{ all -> 0x0b2c }
            r4.A06 = r3     // Catch:{ all -> 0x0b2c }
            X.2H2 r3 = r0.A0S     // Catch:{ all -> 0x0b2c }
            r4.A01 = r3     // Catch:{ all -> 0x0b2c }
            r3 = r16
            r4.A08 = r3     // Catch:{ all -> 0x0b2c }
            r3 = r33
            r4.A07 = r3     // Catch:{ all -> 0x0b2c }
            boolean r3 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            r4.A0A = r3     // Catch:{ all -> 0x0b2c }
            r3 = r19
            r4.A09 = r3     // Catch:{ all -> 0x0b2c }
            r4.A02 = r15     // Catch:{ all -> 0x0b2c }
            r4.A03 = r12     // Catch:{ all -> 0x0b2c }
            boolean r3 = r1.A0G     // Catch:{ all -> 0x0b2c }
            r4.A0B = r3     // Catch:{ all -> 0x0b2c }
            X.1qP r17 = r4.A01()     // Catch:{ all -> 0x0b2c }
            r3 = r17
            r0.A02 = r3     // Catch:{ all -> 0x0b2c }
            r0.A08()     // Catch:{ all -> 0x0b2c }
            r3 = 6
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/uploading with "
            r12.append(r3)     // Catch:{ all -> 0x0b2c }
            boolean r14 = r14.A01     // Catch:{ all -> 0x0b2c }
            if (r14 == 0) goto L_0x06c8
            java.lang.String r3 = "new"
        L_0x06bf:
            r12.append(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = " key; timestamp="
            r12.append(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x06cf
        L_0x06c8:
            java.lang.String r3 = "reused"
            goto L_0x06bf
        L_0x06cc:
            r16 = r36
            goto L_0x0679
        L_0x06cf:
            if (r13 == 0) goto L_0x06d2
            goto L_0x06d6
        L_0x06d2:
            java.lang.String r3 = "no-mediakey-timestamp"
            goto L_0x06dc
        L_0x06d6:
            long r3 = r13.A00     // Catch:{ all -> 0x0b2c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0b2c }
        L_0x06dc:
            r12.append(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "; request="
            X.C18260x0.A1P(r12, r3, r2)     // Catch:{ all -> 0x0b2c }
            if (r14 == 0) goto L_0x06ec
            r3 = 0
            r0.A00 = r3     // Catch:{ all -> 0x0b2c }
            r12 = 0
            goto L_0x071b
        L_0x06ec:
            java.lang.String r12 = r0.A04     // Catch:{ all -> 0x0b2c }
            r4 = r22
            r3 = r17
            X.5KH r12 = r0.A09(r4, r3, r12)     // Catch:{ all -> 0x0b2c }
            X.5Ie r3 = r12.A02     // Catch:{ all -> 0x0b2c }
            r7.A01 = r3     // Catch:{ all -> 0x0b2c }
            X.2WV r4 = r0.A0R     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r12.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r4.A00(r3, r6)     // Catch:{ all -> 0x0b2c }
            r5.A08(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r12.A04     // Catch:{ all -> 0x0b2c }
            r5.A0B(r3)     // Catch:{ all -> 0x0b2c }
            int r3 = r12.A01     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0714
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x0714:
            int r3 = r12.A00     // Catch:{ all -> 0x0b2c }
            long r3 = (long) r3     // Catch:{ all -> 0x0b2c }
            r0.A00 = r3     // Catch:{ all -> 0x0b2c }
            boolean r12 = r12.A05     // Catch:{ all -> 0x0b2c }
        L_0x071b:
            r0.A08()     // Catch:{ all -> 0x0b2c }
            X.2y5 r4 = r0.A0d     // Catch:{ all -> 0x0b2c }
            X.3Dh r3 = r0.A08     // Catch:{ all -> 0x0b2c }
            X.C107655bf.A0Z(r3, r4)     // Catch:{ all -> 0x0b2c }
            r0.A0B()     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x07c3
            boolean r3 = r0.A0F()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x07b8
            X.319 r12 = r0.A0M     // Catch:{ all -> 0x0b2c }
            java.lang.String r8 = r0.A04     // Catch:{ all -> 0x0b2c }
            X.32B r3 = r5.A00()     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x0b2c }
            byte[] r4 = r3.A01     // Catch:{ all -> 0x0b2c }
            r3 = r36
            X.2z0 r6 = r12.A0B(r3, r8, r4, r6)     // Catch:{ all -> 0x0b2c }
            if (r6 == 0) goto L_0x074c
            X.2h7 r3 = r0.A0N     // Catch:{ all -> 0x0b2c }
            X.2Lt r4 = r3.A00(r6)     // Catch:{ all -> 0x0b2c }
            goto L_0x074d
        L_0x074c:
            r4 = 0
        L_0x074d:
            if (r4 == 0) goto L_0x0773
            byte[] r3 = r4.A00     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0773
            int r3 = r3.length     // Catch:{ all -> 0x0b2c }
            if (r3 <= 0) goto L_0x0773
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A02 = r4     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            int[] r3 = r4.A01     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x07b8
            X.2qz r3 = r11.A03     // Catch:{ all -> 0x0b2c }
            X.34x r3 = r3.A05(r6)     // Catch:{ all -> 0x0b2c }
            X.1mV r3 = (X.C30471mV) r3     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x07b8
            X.33C r3 = X.C30471mV.A00(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.A0L     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0D = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            goto L_0x07b8
        L_0x0773:
            int[] r6 = r1.A0H     // Catch:{ all -> 0x0b2c }
            if (r6 == 0) goto L_0x079e
            int r3 = r6.length     // Catch:{ all -> 0x0b2c }
            if (r3 <= 0) goto L_0x079e
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            r3 = r20
            X.8KT r4 = r11.A03(r3, r10, r6)     // Catch:{ all -> 0x0b2c }
            X.6tY r3 = r4.A00     // Catch:{ all -> 0x0af4 }
            X.1Qh r8 = new X.1Qh     // Catch:{ IOException -> 0x0aed }
            r8.<init>(r9, r3, r6)     // Catch:{ IOException -> 0x0aed }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r3]     // Catch:{ all -> 0x0ae3 }
        L_0x078e:
            int r3 = r8.read(r6)     // Catch:{ all -> 0x0ae3 }
            if (r3 >= 0) goto L_0x078e
            X.7Rc r12 = r8.A04     // Catch:{ all -> 0x0ae3 }
            r8.close()     // Catch:{ IOException -> 0x0aed }
            X.7N1 r8 = r4.A00()     // Catch:{ all -> 0x0af4 }
            goto L_0x07bb
        L_0x079e:
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            java.io.InputStream r4 = r11.A06(r2, r10)     // Catch:{ all -> 0x0b2c }
            r3 = r20
            X.8KT r4 = r11.A04(r3, r4)     // Catch:{ all -> 0x0b2c }
            X.6tY r6 = r4.A00     // Catch:{ all -> 0x0af4 }
            r3 = 65536(0x10000, float:9.18355E-41)
            X.7Rc r12 = X.C622934l.A01(r9, r6, r3)     // Catch:{ all -> 0x0af4 }
            X.7N1 r8 = r4.A00()     // Catch:{ all -> 0x0af4 }
            goto L_0x07bb
        L_0x07b8:
            r8 = 0
            r12 = 0
            goto L_0x07be
        L_0x07bb:
            r4.close()     // Catch:{ all -> 0x0b2c }
        L_0x07be:
            r3 = 1
            r0.A06 = r3     // Catch:{ all -> 0x0b2c }
            goto L_0x0975
        L_0x07c3:
            boolean r3 = r0.A0h     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x07cf
            r3 = 1
            r0.A0j = r3     // Catch:{ all -> 0x0b2c }
            X.65W r3 = r0.A0e     // Catch:{ all -> 0x0b2c }
            r8.A06(r3)     // Catch:{ all -> 0x0b2c }
        L_0x07cf:
            X.5KI r3 = r0.A0Z     // Catch:{ all -> 0x0b2c }
            java.lang.String r33 = r2.toString()     // Catch:{ all -> 0x0b2c }
            java.util.concurrent.atomic.AtomicReference r4 = r0.A05     // Catch:{ all -> 0x0b2c }
            r34 = r4
            int[] r14 = r1.A0H     // Catch:{ all -> 0x0b2c }
            X.1VX r13 = r3.A02     // Catch:{ all -> 0x0b2c }
            X.2zJ r12 = r3.A01     // Catch:{ all -> 0x0b2c }
            X.2rm r8 = r3.A05     // Catch:{ all -> 0x0b2c }
            X.2p6 r6 = r3.A04     // Catch:{ all -> 0x0b2c }
            X.2cX r4 = r3.A03     // Catch:{ all -> 0x0b2c }
            X.2tC r3 = r3.A00     // Catch:{ all -> 0x0b2c }
            X.2U2 r24 = new X.2U2     // Catch:{ all -> 0x0b2c }
            r25 = r3
            r26 = r12
            r27 = r13
            r28 = r4
            r29 = r6
            r30 = r0
            r31 = r7
            r32 = r8
            r35 = r14
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0b2c }
            X.3QF r4 = new X.3QF     // Catch:{ all -> 0x0b2c }
            r25 = r4
            r26 = r9
            r27 = r20
            r28 = r22
            r29 = r0
            r30 = r24
            r31 = r17
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0b2c }
            r3 = r22
            java.lang.Object r4 = r3.A00(r4)     // Catch:{ all -> 0x0b2c }
            X.7PE r4 = (X.AnonymousClass7PE) r4     // Catch:{ all -> 0x0b2c }
            if (r4 != 0) goto L_0x0828
            java.lang.String r3 = "mediaupload/failed-network; no routes to upload"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            r3 = 33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x0828:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/transfer completed; result = "
            r8.append(r3)     // Catch:{ all -> 0x0b2c }
            int r6 = r4.A05     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = X.C154357d2.A00(r6)     // Catch:{ all -> 0x0b2c }
            r8.append(r3)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "; cancelled = "
            r8.append(r3)     // Catch:{ all -> 0x0b2c }
            java.util.concurrent.FutureTask r3 = r0.A02     // Catch:{ all -> 0x0b2c }
            r24 = r3
            boolean r3 = r24.isCancelled()     // Catch:{ all -> 0x0b2c }
            X.C18260x0.A1V(r8, r3)     // Catch:{ all -> 0x0b2c }
            r8 = 17
            if (r6 != r8) goto L_0x085d
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = "mediaupload/failed-network; request="
            X.C18260x0.A1Q(r4, r3, r2)     // Catch:{ all -> 0x0b2c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x085d:
            X.7N1 r8 = r4.A02     // Catch:{ all -> 0x0b2c }
            X.7L4 r3 = r4.A01     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0866
            X.7Rc r12 = r3.A00     // Catch:{ all -> 0x0b2c }
            goto L_0x0867
        L_0x0866:
            r12 = 0
        L_0x0867:
            if (r23 == 0) goto L_0x08c5
            r3 = r0
            X.1g6 r3 = (X.AnonymousClass1g6) r3     // Catch:{ all -> 0x0b2c }
            r19 = r3
            X.2zt r3 = r3.A0V     // Catch:{ all -> 0x0b2c }
            r14 = r3
            r3 = r14
            X.6kc r3 = (X.C135406kc) r3     // Catch:{ all -> 0x0b2c }
            r18 = r3
            boolean r3 = r3.A01     // Catch:{ all -> 0x0b2c }
            r13 = r3
            java.lang.String r3 = "Cannot calculate final hash before recording finished"
            X.C626936e.A0D(r13, r3)     // Catch:{ all -> 0x0b2c }
            r3 = r19
            java.lang.String r13 = r3.A00     // Catch:{ all -> 0x0b2c }
            if (r13 != 0) goto L_0x08c7
            X.34l r3 = r3.A0a     // Catch:{ all -> 0x0b2c }
            r13 = r3
            X.2UD r3 = r14.A02     // Catch:{ all -> 0x0b2c }
            java.io.File r3 = r3.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x0b2c }
            r15 = r20
            r14 = r13
            r13 = r3
            r3 = r18
            X.8KT r16 = r14.A02(r15, r3, r13)     // Catch:{ all -> 0x0b2c }
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r13 = new byte[r3]     // Catch:{ all -> 0x0af9 }
        L_0x089c:
            r3 = r16
            X.6tY r3 = r3.A00     // Catch:{ IOException -> 0x08a7 }
            int r3 = r3.read(r13)     // Catch:{ IOException -> 0x08a7 }
            if (r3 < 0) goto L_0x08b7
            goto L_0x089c
        L_0x08a7:
            r15 = move-exception
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0af9 }
            java.lang.String r13 = "IOException while computing ciphertext sha-256; skipping duplicate detection; request="
            r3 = r18
            java.lang.String r13 = X.AnonymousClass000.A0P(r3, r13, r14)     // Catch:{ all -> 0x0af9 }
            com.whatsapp.util.Log.w(r13, r15)     // Catch:{ all -> 0x0af9 }
        L_0x08b7:
            X.7N1 r3 = r16.A00()     // Catch:{ all -> 0x0af9 }
            java.lang.String r13 = r3.A00     // Catch:{ all -> 0x0af9 }
            r16.close()     // Catch:{ all -> 0x0b2c }
            r3 = r19
            r3.A00 = r13     // Catch:{ all -> 0x0b2c }
            goto L_0x08c7
        L_0x08c5:
            java.lang.String r13 = r0.A04     // Catch:{ all -> 0x0b2c }
        L_0x08c7:
            if (r13 != 0) goto L_0x08d7
            boolean r3 = r2.A02()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x08d7
            r3 = 37
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x08d7:
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0915
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0b2c }
            r5.A0B(r3)     // Catch:{ all -> 0x0b2c }
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A07 = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            X.2WV r15 = r0.A0R     // Catch:{ all -> 0x0b2c }
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r14 = r3.A00     // Catch:{ all -> 0x0b2c }
            r3 = 1
            java.lang.String r3 = r15.A00(r14, r3)     // Catch:{ all -> 0x0b2c }
            r5.A08(r3)     // Catch:{ all -> 0x0b2c }
            r5.A09(r13)     // Catch:{ all -> 0x0b2c }
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.A03     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0A = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A06 = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            X.7Ol r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0E = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.A04     // Catch:{ all -> 0x0b2c }
            r0.A06 = r3     // Catch:{ all -> 0x0b2c }
        L_0x0915:
            boolean r3 = r0.A0E()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0976
            java.lang.Object r3 = r34.get()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0976
            X.2qk r3 = r0.A07     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            java.lang.String r3 = X.C615131b.A00(r3, r10)     // Catch:{ all -> 0x0b2c }
            r5.A0A(r3)     // Catch:{ all -> 0x0b2c }
            if (r6 != 0) goto L_0x0976
            boolean r3 = r24.isCancelled()     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x0976
            java.lang.String r3 = "MediaUpload/call Sending streaming finalize request"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            X.5If r14 = r0.A0c     // Catch:{ all -> 0x0b2c }
            X.3QE r4 = new X.3QE     // Catch:{ all -> 0x0b2c }
            r3 = r17
            r4.<init>(r14, r3, r13)     // Catch:{ all -> 0x0b2c }
            r3 = r22
            java.lang.Object r4 = r3.A00(r4)     // Catch:{ all -> 0x0b2c }
            X.5Ju r4 = (X.C102665Ju) r4     // Catch:{ all -> 0x0b2c }
            if (r4 != 0) goto L_0x0952
            X.5Ju r4 = new X.5Ju     // Catch:{ all -> 0x0b2c }
            r4.<init>()     // Catch:{ all -> 0x0b2c }
        L_0x0952:
            X.5Jt r3 = r4.A01     // Catch:{ all -> 0x0b2c }
            r7.A00 = r3     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.A04     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x096f
            java.lang.String r3 = r4.A03     // Catch:{ all -> 0x0b2c }
            r5.A0B(r3)     // Catch:{ all -> 0x0b2c }
            X.2WV r14 = r0.A0R     // Catch:{ all -> 0x0b2c }
            java.lang.String r4 = r4.A02     // Catch:{ all -> 0x0b2c }
            r3 = 1
            java.lang.String r3 = r14.A00(r4, r3)     // Catch:{ all -> 0x0b2c }
            r5.A08(r3)     // Catch:{ all -> 0x0b2c }
            r5.A09(r13)     // Catch:{ all -> 0x0b2c }
            goto L_0x0976
        L_0x096f:
            java.lang.Integer r3 = X.C18300x5.A0Z()     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x0975:
            r6 = 0
        L_0x0976:
            if (r6 != 0) goto L_0x09d6
            if (r8 == 0) goto L_0x09d6
            java.lang.String r4 = r8.A00     // Catch:{ all -> 0x0b2c }
            r3 = r37
            boolean r3 = r3.A01     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0994
            java.lang.String r3 = r0.A04     // Catch:{ all -> 0x0b2c }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x0994
            java.lang.String r3 = "mediaupload/optimistic-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            r5.A09(r4)     // Catch:{ all -> 0x0b2c }
            r13 = 1
            goto L_0x0995
        L_0x0994:
            r13 = 0
        L_0x0995:
            java.lang.String r4 = r8.A02     // Catch:{ all -> 0x0b2c }
            if (r21 == 0) goto L_0x09aa
            r3 = r36
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0b2c }
            if (r3 != 0) goto L_0x09aa
            java.lang.String r3 = "mediaupload/optimistic-plaintext-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0b2c }
            r5.A0A(r4)     // Catch:{ all -> 0x0b2c }
            r13 = 1
        L_0x09aa:
            if (r13 == 0) goto L_0x09b4
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a66
        L_0x09b4:
            boolean r3 = r0.A0F()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x09d0
            if (r12 == 0) goto L_0x09d0
            byte[] r12 = r12.A00()     // Catch:{ all -> 0x0b2c }
            if (r12 == 0) goto L_0x09d0
            int r3 = r12.length     // Catch:{ all -> 0x0b2c }
            if (r3 <= 0) goto L_0x09d0
            int[] r4 = r1.A0H     // Catch:{ all -> 0x0b2c }
            X.2Lt r3 = new X.2Lt     // Catch:{ all -> 0x0b2c }
            r3.<init>(r12, r4)     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A02 = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x09d0:
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x0b2c }
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0D = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x09d6:
            int r4 = r1.A00     // Catch:{ all -> 0x0b2c }
            if (r4 <= 0) goto L_0x0a0f
            boolean r3 = X.AnonymousClass36O.A06(r42)     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0a0f
            X.C626936e.A06(r10)     // Catch:{ all -> 0x0b2c }
            long r3 = (long) r4     // Catch:{ all -> 0x0b2c }
            r12 = 15
            long r3 = r3 + r12
            r12 = 16
            long r3 = r3 / r12
            long r3 = r3 * r12
            int r8 = (int) r3     // Catch:{ all -> 0x0b2c }
            java.io.InputStream r4 = r11.A06(r2, r10)     // Catch:{ all -> 0x0b2c }
            r3 = r20
            X.8KT r10 = r11.A04(r3, r4)     // Catch:{ all -> 0x0b2c }
            X.6tY r12 = r10.A00     // Catch:{ all -> 0x0afe }
            long r3 = (long) r8     // Catch:{ all -> 0x0afe }
            X.6uL r11 = new X.6uL     // Catch:{ all -> 0x0afe }
            r11.<init>(r12, r3)     // Catch:{ all -> 0x0afe }
            X.7Rc r3 = X.C622934l.A01(r9, r11, r8)     // Catch:{ all -> 0x0afe }
            byte[] r3 = r3.A00()     // Catch:{ all -> 0x0afe }
            r10.close()     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0a0f
            monitor-enter(r5)     // Catch:{ all -> 0x0b2c }
            r5.A0J = r3     // Catch:{ all -> 0x0b29 }
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0a0f:
            r3 = 5
            if (r6 == r3) goto L_0x0a26
            r3 = 21
            if (r6 == r3) goto L_0x0a26
            r3 = 35
            if (r6 == r3) goto L_0x0a26
            r3 = 36
            if (r6 == r3) goto L_0x0a26
            r3 = 24
            if (r6 == r3) goto L_0x0a26
            r3 = 34
            if (r6 != r3) goto L_0x0a2d
        L_0x0a26:
            r3 = 0
            r5.A09(r3)     // Catch:{ all -> 0x0b2c }
            r5.A0A(r3)     // Catch:{ all -> 0x0b2c }
        L_0x0a2d:
            r0.A08()     // Catch:{ all -> 0x0b2c }
            if (r6 != 0) goto L_0x0a62
            java.lang.Long r11 = r7.A08     // Catch:{ all -> 0x0b2c }
            if (r11 == 0) goto L_0x0a62
            java.lang.Long r4 = r7.A0F     // Catch:{ all -> 0x0b2c }
            if (r4 == 0) goto L_0x0a4f
            java.lang.Long r3 = r7.A0E     // Catch:{ all -> 0x0b2c }
            if (r3 == 0) goto L_0x0a4f
            long r8 = r3.longValue()     // Catch:{ all -> 0x0b2c }
            long r3 = r4.longValue()     // Catch:{ all -> 0x0b2c }
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0a4f
            java.lang.Long r3 = X.C18310x6.A0f(r8, r3)     // Catch:{ all -> 0x0b2c }
            goto L_0x0a50
        L_0x0a4f:
            r3 = 0
        L_0x0a50:
            if (r3 == 0) goto L_0x0a62
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b2c }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0b2c }
            r10 = 0
            r8 = r43
            r9 = r42
            r8.A02(r9, r10, r11, r13)     // Catch:{ all -> 0x0b2c }
        L_0x0a62:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b2c }
        L_0x0a66:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r4 = r1.A07
            X.C626936e.A06(r4)
            long r1 = r4.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.A0C = r1
            goto L_0x0a8d
        L_0x0a79:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r4 = r1.A07
            X.C626936e.A06(r4)
            long r1 = r4.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.A0C = r1
            X.2sV r5 = r0.A0X
        L_0x0a8d:
            java.lang.Integer r1 = r5.A01()
            if (r1 == 0) goto L_0x0abe
            java.lang.Integer r1 = r5.A02()
            if (r1 == 0) goto L_0x0abe
            java.lang.Integer r1 = r5.A01()
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r7.A0B = r1
            java.lang.Integer r1 = r5.A02()
        L_0x0aa7:
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r7.A0D = r1
        L_0x0aad:
            X.2YO r0 = r0.A01
            if (r0 == 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r7.A0G = r0
            return r3
        L_0x0abe:
            boolean r1 = X.AnonymousClass36O.A04(r42)
            if (r1 == 0) goto L_0x0aad
            X.C626936e.A06(r4)
            android.util.Pair r2 = X.C107655bf.A0L(r4)
            java.lang.Object r1 = r2.first
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r7.A0B = r1
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            goto L_0x0aa7
        L_0x0ada:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0add:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0b2c }
            goto L_0x0b28
        L_0x0ae0:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0b2c }
            goto L_0x0b28
        L_0x0ae3:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x0ae8 }
            goto L_0x0aec
        L_0x0ae8:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ IOException -> 0x0aed }
        L_0x0aec:
            throw r3     // Catch:{ IOException -> 0x0aed }
        L_0x0aed:
            r3 = move-exception
            java.lang.String r1 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x0af4 }
            throw r3     // Catch:{ all -> 0x0af4 }
        L_0x0af4:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x0b03 }
            goto L_0x0b28
        L_0x0af9:
            r3 = move-exception
            r16.close()     // Catch:{ all -> 0x0b03 }
            goto L_0x0b28
        L_0x0afe:
            r3 = move-exception
            r10.close()     // Catch:{ all -> 0x0b03 }
            goto L_0x0b28
        L_0x0b03:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ all -> 0x0b2c }
            goto L_0x0b28
        L_0x0b08:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r1 = "mediaupload/hash-calculate/file not found; message.key="
            X.C18260x0.A0r(r1, r12, r3)     // Catch:{ all -> 0x0b2c }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b2c }
            java.lang.String r1 = "File not found: "
            r3.append(r1)     // Catch:{ all -> 0x0b2c }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x0b2c }
            java.lang.String r1 = X.AnonymousClass000.A0R(r4, r3)     // Catch:{ all -> 0x0b2c }
            java.io.FileNotFoundException r3 = X.C18330xA.A05(r1)     // Catch:{ all -> 0x0b2c }
            goto L_0x0b28
        L_0x0b26:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
        L_0x0b28:
            throw r3     // Catch:{ all -> 0x0b2c }
        L_0x0b29:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0b2c }
            throw r1     // Catch:{ all -> 0x0b2c }
        L_0x0b2c:
            r6 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            X.2UL r3 = r0.A0Y
            X.2UD r5 = r2.A02
            java.io.File r4 = r5.A07
            X.C626936e.A06(r4)
            long r1 = r4.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A0C = r1
            X.2sV r2 = r0.A0X
            java.lang.Integer r1 = r2.A01()
            if (r1 == 0) goto L_0x0b76
            java.lang.Integer r1 = r2.A02()
            if (r1 == 0) goto L_0x0b76
            java.lang.Integer r1 = r2.A01()
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r3.A0B = r1
            java.lang.Integer r1 = r2.A02()
        L_0x0b5f:
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r3.A0D = r1
        L_0x0b65:
            X.2YO r0 = r0.A01
            if (r0 == 0) goto L_0x0b75
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r3.A0G = r0
        L_0x0b75:
            throw r6
        L_0x0b76:
            X.38t r1 = r5.A06
            boolean r1 = X.AnonymousClass36O.A04(r1)
            if (r1 == 0) goto L_0x0b65
            X.C626936e.A06(r4)
            android.util.Pair r2 = X.C107655bf.A0L(r4)
            java.lang.Object r1 = r2.first
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r1 = X.C18280x3.A0U(r1)
            r3.A0B = r1
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            goto L_0x0b5f
        L_0x0b94:
            boolean r1 = r0 instanceof X.AnonymousClass1I4
            if (r1 == 0) goto L_0x0c62
            X.1I4 r0 = (X.AnonymousClass1I4) r0
            java.util.Collection r1 = r0.A00
            java.util.Iterator r12 = r1.iterator()
        L_0x0ba0:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0c5f
            X.1mV r7 = X.C18320x8.A0S(r12)
            X.2re r6 = r0.A02
            boolean r5 = r0.A01
            int r2 = r7.A0D
            r1 = 1
            if (r2 == r1) goto L_0x0bc7
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "mediajobmanager/trycancelmessageandmediajob "
            X.C624134x.A0S(r7, r1, r2)
            java.lang.String r1 = " status:"
            r2.append(r1)
            int r1 = r7.A0D
            X.C18260x0.A1G(r2, r1)
            goto L_0x0ba0
        L_0x0bc7:
            X.30M r8 = r6.A00(r7)
            if (r8 == 0) goto L_0x0ba0
            X.3QO r4 = r6.A01(r8)
            if (r4 == 0) goto L_0x0ba0
            X.1fj r1 = r6.A0K
            java.lang.Runnable r1 = r1.A01(r4)
            X.1I5 r1 = (X.AnonymousClass1I5) r1
            if (r1 == 0) goto L_0x0be6
            X.32i r3 = r6.A0E
            X.2sV r2 = r1.A0X
            X.33C r1 = r7.A01
            r3.A02(r1, r2, r7)
        L_0x0be6:
            java.lang.Object r2 = r4.A0T
            monitor-enter(r2)
            X.2z0 r1 = r7.A1J     // Catch:{ all -> 0x0c5c }
            r8.A03(r1)     // Catch:{ all -> 0x0c5c }
            java.util.concurrent.CopyOnWriteArrayList r1 = r8.A02     // Catch:{ all -> 0x0c5c }
            int r1 = r1.size()     // Catch:{ all -> 0x0c5c }
            if (r1 != 0) goto L_0x0bfa
            r1 = 0
            r6.A02(r8, r1)     // Catch:{ all -> 0x0c5c }
        L_0x0bfa:
            monitor-exit(r2)     // Catch:{ all -> 0x0c5c }
            java.lang.Object r3 = r6.A0T
            monitor-enter(r3)
            java.util.WeakHashMap r1 = r6.A0U     // Catch:{ all -> 0x0c59 }
            java.util.Iterator r11 = X.AnonymousClass001.A0u(r1)     // Catch:{ all -> 0x0c59 }
            r10 = 0
        L_0x0c05:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0c59 }
            if (r1 == 0) goto L_0x0c3c
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r11)     // Catch:{ all -> 0x0c59 }
            java.lang.Object r8 = r9.getKey()     // Catch:{ all -> 0x0c59 }
            X.30M r8 = (X.AnonymousClass30M) r8     // Catch:{ all -> 0x0c59 }
            monitor-enter(r8)     // Catch:{ all -> 0x0c59 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r8.A02     // Catch:{ all -> 0x0c56 }
            int r1 = r1.size()     // Catch:{ all -> 0x0c56 }
            boolean r2 = X.AnonymousClass000.A1T(r1)
            monitor-exit(r8)     // Catch:{ all -> 0x0c59 }
            r1 = 0
            if (r2 != 0) goto L_0x0c25
            r1 = 1
        L_0x0c25:
            X.C626936e.A0C(r1)     // Catch:{ all -> 0x0c59 }
            java.lang.Object r1 = r9.getValue()     // Catch:{ all -> 0x0c59 }
            if (r1 != r4) goto L_0x0c05
            java.lang.Object r1 = r9.getKey()     // Catch:{ all -> 0x0c59 }
            X.30M r1 = (X.AnonymousClass30M) r1     // Catch:{ all -> 0x0c59 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A02     // Catch:{ all -> 0x0c59 }
            int r1 = r1.size()     // Catch:{ all -> 0x0c59 }
            int r10 = r10 + r1
            goto L_0x0c05
        L_0x0c3c:
            monitor-exit(r3)     // Catch:{ all -> 0x0c59 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r10 != 0) goto L_0x0c4f
            java.lang.String r1 = "app/mediajobmanager/tryCancelMessageAndMediaJob remove mediaJob jobId="
            X.C18260x0.A1P(r2, r1, r4)
            X.33c r1 = r6.A0D
            r1.A0F(r4, r5)
            goto L_0x0ba0
        L_0x0c4f:
            java.lang.String r1 = "mediajobmanager/cancelled message, but not job: "
            X.C18260x0.A1P(r2, r1, r7)
            goto L_0x0ba0
        L_0x0c56:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0c59 }
            throw r0     // Catch:{ all -> 0x0c59 }
        L_0x0c59:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0c59 }
            throw r0
        L_0x0c5c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0c5c }
            throw r0
        L_0x0c5f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0c62:
            X.1I3 r0 = (X.AnonymousClass1I3) r0
            X.2qk r2 = r0.A00
            X.2eF r1 = r0.A01
            X.1mV r0 = r0.A02
            android.net.Uri r0 = com.whatsapp.contentprovider.MediaProvider.A05(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I8.A07():java.lang.Object");
    }

    public void A08() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    public void cancel() {
        this.A02.cancel(true);
    }

    public void run() {
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    C18300x5.A11();
                }
                Object obj = futureTask.get();
                C626936e.A06(obj);
                A05(obj);
            } catch (InterruptedException | CancellationException e) {
                e = e;
                A06(e);
            } catch (ExecutionException e2) {
                e = e2.getCause();
                A06(e);
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    C18300x5.A11();
                }
                Object obj2 = this.A02.get();
                C626936e.A06(obj2);
                A05(obj2);
                throw th;
            } catch (InterruptedException | CancellationException e3) {
                e = e3;
                A06(e);
                throw th;
            } catch (ExecutionException e4) {
                e = e4.getCause();
                A06(e);
                throw th;
            }
        }
    }

    public void A02() {
        super.A02();
        this.A00.A02();
    }
}
