package X;

import android.os.Handler;

/* renamed from: X.3Zw  reason: invalid class name and case insensitive filesystem */
public class C70093Zw implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70093Zw(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C70093Zw(obj, i, obj2));
    }

    public static void A01(AnonymousClass4GK r1, Object obj, Object obj2, int i) {
        r1.B25(new C70093Zw(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d5, code lost:
        if (r6 != -1) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04da, code lost:
        r0.sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d5, code lost:
        X.C626936e.A02(r10.A05.A01);
        r4 = r12.A1J;
        r9 = r10.A0A.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r8 = r9.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r3 = r10.A0B;
        r7 = r3.A00(r4).iterator();
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05f7, code lost:
        if (r7.hasNext() == false) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05f9, code lost:
        r5 = (X.C52872mB) r7.next();
        X.C18260x0.A1R(X.AnonymousClass001.A0o(), "MessageStatusStore/applyingorphanedreceipt/receipt=", r5);
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x060a, code lost:
        if (r1 == null) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0612, code lost:
        if (X.C627336j.A0K(r4.A00) == false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x061c, code lost:
        if (r1.equals(r12.A0n()) != false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x061f, code lost:
        r13 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0624, code lost:
        if (r13 != 17) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x062c, code lost:
        if (r10.A0H.A05(r12) == false) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x062e, code lost:
        r10.A0I.A0D(r12, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0633, code lost:
        r10.A04(r5.A02, r12, r13, r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x063e, code lost:
        if (X.AnonymousClass300.A00(r4, r13) == false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0643, code lost:
        if (r13 != 18) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0645, code lost:
        r10.A0J.A04(java.util.Collections.singleton(r12), true);
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0651, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0653, code lost:
        r3.A01(r4);
        r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x065c, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x065f, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0661, code lost:
        r10.A02(java.util.Collections.singletonList(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0668, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0669, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x066e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0673, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0677, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0690, code lost:
        r4.post(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0693, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06fe, code lost:
        r1.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0701, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x075e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x075f, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0762, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0763, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0764, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0785, code lost:
        r0.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0788, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07be, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07c1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07c3, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r5.A03.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015b, code lost:
        r3 = new X.C70093Zw(r2, r0, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x075e A[ExcHandler: Error | RuntimeException (r1v7 'e' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r43 = this;
            r3 = r43
            int r0 = r3.A02
            switch(r0) {
                case 1: goto L_0x0025;
                case 2: goto L_0x0007;
                case 3: goto L_0x0137;
                case 4: goto L_0x0143;
                case 5: goto L_0x014f;
                case 6: goto L_0x0007;
                case 7: goto L_0x0162;
                case 8: goto L_0x016e;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x018a;
                case 12: goto L_0x01a0;
                case 13: goto L_0x0200;
                case 14: goto L_0x0214;
                case 15: goto L_0x0307;
                case 16: goto L_0x0323;
                case 17: goto L_0x033f;
                case 18: goto L_0x035b;
                case 19: goto L_0x0388;
                case 20: goto L_0x017a;
                case 21: goto L_0x0394;
                case 22: goto L_0x04a3;
                case 23: goto L_0x04ed;
                case 24: goto L_0x04fb;
                case 25: goto L_0x0507;
                case 26: goto L_0x0529;
                case 27: goto L_0x0538;
                case 28: goto L_0x04fb;
                case 29: goto L_0x057e;
                case 30: goto L_0x05a3;
                case 31: goto L_0x05a3;
                case 32: goto L_0x05b4;
                case 33: goto L_0x05cb;
                case 34: goto L_0x067d;
                case 35: goto L_0x0694;
                case 36: goto L_0x06a5;
                case 37: goto L_0x06b6;
                case 38: goto L_0x06c7;
                case 39: goto L_0x06d7;
                case 40: goto L_0x06e5;
                case 41: goto L_0x06f2;
                case 42: goto L_0x0702;
                case 43: goto L_0x072a;
                case 44: goto L_0x073c;
                case 45: goto L_0x076d;
                case 46: goto L_0x077b;
                case 47: goto L_0x0789;
                case 48: goto L_0x079e;
                case 49: goto L_0x079e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.2sW r0 = (X.C56762sW) r0
            java.lang.Object r2 = r3.A01
            X.3ZF r2 = (X.AnonymousClass3ZF) r2
            X.1iI r0 = r0.A0N
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r1.next()
            X.4F0 r0 = (X.AnonymousClass4F0) r0
            r0.BO6(r2)
            goto L_0x0015
        L_0x0025:
            java.lang.Object r10 = r3.A00
            X.2sW r10 = (X.C56762sW) r10
            java.lang.Object r9 = r3.A01
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r10.A0P
            r42 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r42.writeLock()
            r0.lock()
            java.util.Iterator r16 = r9.iterator()     // Catch:{ all -> 0x0132 }
        L_0x0040:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0123
            java.lang.Object r7 = r16.next()     // Catch:{ all -> 0x0132 }
            X.3ZF r7 = (X.AnonymousClass3ZF) r7     // Catch:{ all -> 0x0132 }
            boolean r0 = r7.A0F     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x00dd
            X.1mG r1 = r7.A0D     // Catch:{ all -> 0x0132 }
            boolean r0 = r1 instanceof X.C30701ms     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x00d8
            X.2rS r6 = r10.A08     // Catch:{ all -> 0x0132 }
            boolean r1 = X.AnonymousClass000.A1W(r1)
            java.lang.String r0 = "not a legacy/v1 call log"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x0132 }
            java.util.List r0 = r7.A08()     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r5 = X.AnonymousClass000.A0p(r0)     // Catch:{ all -> 0x0132 }
            java.util.Iterator r2 = X.AnonymousClass3ZF.A01(r7)     // Catch:{ all -> 0x0132 }
        L_0x006e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0132 }
            X.3ZE r0 = (X.AnonymousClass3ZE) r0     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.UserJid r1 = r0.A02     // Catch:{ all -> 0x0132 }
            int r0 = r0.A00     // Catch:{ all -> 0x0132 }
            X.AnonymousClass3ZE.A00(r1, r5, r0)     // Catch:{ all -> 0x0132 }
            goto L_0x006e
        L_0x0082:
            X.39J r0 = r7.A0E     // Catch:{ all -> 0x0132 }
            r22 = r0
            long r2 = r7.A0B     // Catch:{ all -> 0x0132 }
            boolean r0 = r7.A0L     // Catch:{ all -> 0x0132 }
            r20 = r0
            int r0 = r7.A01     // Catch:{ all -> 0x0132 }
            r19 = r0
            int r0 = r7.A00     // Catch:{ all -> 0x0132 }
            r17 = r0
            X.22I r23 = r7.A07()     // Catch:{ all -> 0x0132 }
            long r0 = r7.A03     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.GroupJid r15 = r7.A05     // Catch:{ all -> 0x0132 }
            boolean r14 = r7.A0K     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.DeviceJid r13 = r7.A0C     // Catch:{ all -> 0x0132 }
            java.lang.String r12 = r7.A08     // Catch:{ all -> 0x0132 }
            r7.A0A()     // Catch:{ all -> 0x0132 }
            int r11 = r7.A02     // Catch:{ all -> 0x0132 }
            r18 = 0
            r32 = -1
            r31 = 0
            X.3ZF r4 = new X.3ZF     // Catch:{ all -> 0x0132 }
            r24 = r18
            r25 = r18
            r40 = r31
            r21 = r18
            r26 = r12
            r27 = r5
            r28 = r19
            r29 = r17
            r30 = r11
            r34 = r2
            r36 = r0
            r38 = r20
            r39 = r31
            r41 = r14
            r17 = r4
            r19 = r13
            r20 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0132 }
            r6.A06(r4)     // Catch:{ all -> 0x0132 }
            goto L_0x00dd
        L_0x00d8:
            X.2rS r0 = r10.A08     // Catch:{ all -> 0x0132 }
            r0.A06(r7)     // Catch:{ all -> 0x0132 }
        L_0x00dd:
            X.2f1 r0 = r10.A00     // Catch:{ all -> 0x0132 }
            r0.A01(r7)     // Catch:{ all -> 0x0132 }
            X.1VX r0 = r10.A0J     // Catch:{ all -> 0x0132 }
            boolean r0 = X.C627436k.A0G(r0)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0132 }
            X.39J r5 = r7.A0E     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.UserJid r0 = r5.A01     // Catch:{ all -> 0x0132 }
            r1.add(r0)     // Catch:{ all -> 0x0132 }
            java.util.Set r0 = r7.A09()     // Catch:{ all -> 0x0132 }
            r1.addAll(r0)     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.GroupJid r0 = r7.A05     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0103
            r1.add(r0)     // Catch:{ all -> 0x0132 }
        L_0x0103:
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x0132 }
        L_0x0107:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0040
            X.4uZ r3 = X.C18300x5.A0P(r4)     // Catch:{ all -> 0x0132 }
            X.2pF r2 = r10.A0D     // Catch:{ all -> 0x0132 }
            boolean r1 = r5.A03     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = X.C627436k.A07(r0)     // Catch:{ all -> 0x0132 }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r3, r0, r1)     // Catch:{ all -> 0x0132 }
            r2.A03(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0107
        L_0x0123:
            X.2hU r0 = r10.A0C     // Catch:{ all -> 0x0132 }
            android.os.Handler r2 = r0.A01     // Catch:{ all -> 0x0132 }
            r1 = 0
            X.3aL r0 = new X.3aL     // Catch:{ all -> 0x0132 }
            r0.<init>(r10, r8, r9, r1)     // Catch:{ all -> 0x0132 }
            r2.post(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0726
        L_0x0132:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r42)
            throw r0
        L_0x0137:
            java.lang.Object r1 = r3.A00
            X.2sW r1 = (X.C56762sW) r1
            java.lang.Object r0 = r3.A01
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            r1.A0A(r0)
            return
        L_0x0143:
            java.lang.Object r2 = r3.A00
            X.2sW r2 = (X.C56762sW) r2
            java.lang.Object r1 = r3.A01
            X.2hU r0 = r2.A0C
            android.os.Handler r4 = r0.A02
            r0 = 6
            goto L_0x015b
        L_0x014f:
            java.lang.Object r2 = r3.A00
            X.2sW r2 = (X.C56762sW) r2
            java.lang.Object r1 = r3.A01
            X.2hU r0 = r2.A0C
            android.os.Handler r4 = r0.A02
            r0 = 10
        L_0x015b:
            X.3Zw r3 = new X.3Zw
            r3.<init>(r2, r0, r1)
            goto L_0x0690
        L_0x0162:
            java.lang.Object r1 = r3.A00
            X.2sW r1 = (X.C56762sW) r1
            java.lang.Object r0 = r3.A01
            X.39J r0 = (X.AnonymousClass39J) r0
            r1.A05(r0)
            return
        L_0x016e:
            java.lang.Object r1 = r3.A00
            X.2sW r1 = (X.C56762sW) r1
            java.lang.Object r0 = r3.A01
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            r1.A08(r0)
            return
        L_0x017a:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            X.5rC r0 = r0.A03
            r0.A04()
            java.lang.String r0 = "afterRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r0)
            throw r1
        L_0x018a:
            java.lang.Object r2 = r3.A00
            X.2h6 r2 = (X.C49792h6) r2
            java.lang.Object r1 = r3.A01
            X.31A r1 = (X.AnonymousClass31A) r1
            X.2sm r0 = r2.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0198, Error | RuntimeException -> 0x075e }
            r0.A0F(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0198, Error | RuntimeException -> 0x075e }
            return
        L_0x0198:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r2.A03
            goto L_0x0769
        L_0x01a0:
            java.lang.Object r0 = r3.A00
            X.2sA r0 = (X.C56542sA) r0
            java.lang.Object r6 = r3.A01
            X.31A r6 = (X.AnonymousClass31A) r6
            X.8qC r0 = r0.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.2sm r5 = r0.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/reset-show-group-description "
            r1.append(r0)
            X.4uZ r4 = r6.A0q
            X.C18260x0.A0o(r4, r1)
            X.3dV r0 = r5.A06     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f8, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            X.4Fq r3 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f8, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            monitor-enter(r6)     // Catch:{ all -> 0x01ee }
            android.content.ContentValues r2 = X.C18280x3.A09()     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "show_group_description"
            boolean r0 = r6.A0p     // Catch:{ all -> 0x01eb }
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r2, r1, r0)     // Catch:{ all -> 0x01eb }
            monitor-exit(r6)     // Catch:{ all -> 0x01ee }
            int r0 = r5.A04(r2, r6)     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "msgstore/reset-show-group-description/did not update "
            X.C18260x0.A1Q(r1, r0, r4)     // Catch:{ all -> 0x01ee }
        L_0x01e7:
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f8, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            return
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01f3 }
            goto L_0x01f7
        L_0x01f3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f8, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
        L_0x01f7:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01f8, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
        L_0x01f8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r5.A05
            goto L_0x0769
        L_0x0200:
            java.lang.Object r0 = r3.A00
            X.2sA r0 = (X.C56542sA) r0
            java.lang.Object r1 = r3.A01
            X.31A r1 = (X.AnonymousClass31A) r1
            X.8qC r0 = r0.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.2sm r0 = r0.A0C
            r0.A0J(r1)
            return
        L_0x0214:
            java.lang.Object r7 = r3.A00
            X.2sA r7 = (X.C56542sA) r7
            java.lang.Object r6 = r3.A01
            X.34x r6 = (X.C624134x) r6
            X.2z0 r0 = r6.A1J
            X.4uZ r5 = r0.A00
            X.2ss r0 = r7.A00
            r8 = 0
            X.31A r4 = r0.A0A(r5, r8)
            if (r4 == 0) goto L_0x0729
            long r2 = r4.A0U
            long r0 = r6.A1L
            r9 = 1
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r13 = X.AnonymousClass000.A1T(r10)
            long r2 = r4.A0N
            long r0 = r6.A1L
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1T(r10)
            if (r13 != 0) goto L_0x0243
            if (r12 != 0) goto L_0x0243
            return
        L_0x0243:
            long r2 = r6.A1M
            long r0 = r4.A0Q
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0296
            X.8qC r0 = r7.A02
            X.2UO r0 = X.C18310x6.A0Q(r0)
            X.3dV r0 = r0.A0G
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x028e }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x028e }
            java.lang.String r3 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND sort_id > ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x028e }
            long r0 = r4.A0W     // Catch:{ all -> 0x028e }
            X.C18280x3.A1R(r2, r8, r0)     // Catch:{ all -> 0x028e }
            long r0 = r4.A0Q     // Catch:{ all -> 0x028e }
            X.C18280x3.A1R(r2, r9, r0)     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "GET_UNREAD_MESSAGES_COUNT_FOR_CHAT"
            android.database.Cursor r2 = r10.A0E(r3, r0, r2)     // Catch:{ all -> 0x028e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x027e
            int r0 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0282 }
            r4.A08 = r0     // Catch:{ all -> 0x0282 }
        L_0x027e:
            r2.close()     // Catch:{ all -> 0x028e }
            goto L_0x0293
        L_0x0282:
            r1 = move-exception
            if (r2 == 0) goto L_0x028d
            r2.close()     // Catch:{ all -> 0x0289 }
            goto L_0x028d
        L_0x0289:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x028e }
        L_0x028d:
            throw r1     // Catch:{ all -> 0x028e }
        L_0x028e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0678 }
            throw r1
        L_0x0293:
            r11.close()
        L_0x0296:
            X.8qC r7 = r7.A02
            X.2UO r0 = X.C18310x6.A0Q(r7)
            X.2rt r0 = r0.A0I
            long r0 = r0.A02(r5)
            X.2UO r2 = X.C18310x6.A0Q(r7)
            X.2rr r2 = r2.A0J
            long r2 = r2.A06(r5)
            r10 = 1
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0305
            X.2UO r8 = X.C18310x6.A0Q(r7)
            X.2qz r8 = r8.A0T
            X.34x r10 = X.C55122pp.A00(r8, r0)
        L_0x02bc:
            X.2UO r8 = X.C18310x6.A0Q(r7)
            X.2sm r8 = r8.A0C
            X.2ss r8 = r8.A02
            X.31A r8 = X.C56982ss.A00(r8, r5)
            if (r8 == 0) goto L_0x02da
            if (r13 == 0) goto L_0x02d2
            r8.A0U = r0
            r8.A0V = r2
            r8.A0d = r10
        L_0x02d2:
            if (r12 == 0) goto L_0x02da
            r8.A0N = r0
            r8.A0O = r2
            r8.A0c = r10
        L_0x02da:
            long r0 = r4.A0H
            long r2 = r6.A1M
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02e6
            r0 = -9223372036854775808
            r4.A0H = r0
        L_0x02e6:
            X.2UO r0 = X.C18310x6.A0Q(r7)
            X.2sm r0 = r0.A0C
            boolean r0 = r0.A0O(r4)
            if (r0 != 0) goto L_0x02fb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatManager/refresh/chatpreview/update/insert failed gid="
            X.C18260x0.A1Q(r1, r0, r5)
        L_0x02fb:
            X.2UO r0 = X.C18310x6.A0Q(r7)
            X.1hu r0 = r0.A0B
            r0.A0A(r5, r9)
            return
        L_0x0305:
            r10 = 0
            goto L_0x02bc
        L_0x0307:
            java.lang.Object r0 = r3.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r3.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0313:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLh(r2)
            goto L_0x0313
        L_0x0323:
            java.lang.Object r0 = r3.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r3.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x032f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLg(r2)
            goto L_0x032f
        L_0x033f:
            java.lang.Object r0 = r3.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r2 = r3.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x034b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r1.next()
            X.4FD r0 = (X.AnonymousClass4FD) r0
            r0.BLc(r2)
            goto L_0x034b
        L_0x035b:
            java.lang.Object r4 = r3.A00
            X.3Lv r4 = (X.C66543Lv) r4
            java.lang.Object r3 = r3.A01
            X.34x r3 = (X.C624134x) r3
            X.2z0 r0 = r3.A1J
            X.4uZ r2 = r0.A00
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x0378
            X.2sj r1 = r4.A0p
            r0 = r2
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x037c
        L_0x0378:
            r0 = 0
            r4.A0r(r2, r0)
        L_0x037c:
            X.2hU r0 = r4.A0q
            android.os.Handler r1 = r0.A02
            r0 = 13
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r3)
            goto L_0x04da
        L_0x0388:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r12 = r3.A01
            X.34x r12 = (X.C624134x) r12
            X.300 r10 = r0.A00
            goto L_0x05d5
        L_0x0394:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r5 = r3.A01
            X.34x r5 = (X.C624134x) r5
            X.313 r3 = r0.A0g
            r1 = 512(0x200, float:7.175E-43)
            int r0 = r5.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.1VX r2 = r3.A0A
            if (r0 != 0) goto L_0x03f0
            r1 = 2714(0xa9a, float:3.803E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0729
            X.2z0 r0 = r5.A1J
            X.4uZ r8 = r0.A00
            if (r8 == 0) goto L_0x0729
            java.lang.String r4 = r8.getRawString()
            X.2GG r1 = r3.A09
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            java.lang.Object r0 = r0.get(r4)
            X.2yh r0 = (X.C60522yh) r0
            if (r0 == 0) goto L_0x03e6
            long r6 = r0.A01
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03e6
        L_0x03d7:
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0729
            java.lang.String r1 = r8.getRawString()
            r0 = 0
            r3.A05(r0, r1, r4)
            return
        L_0x03e6:
            X.2yh r0 = r3.A03(r4)
            r3.A06(r0, r4)
            long r6 = r0.A01
            goto L_0x03d7
        L_0x03f0:
            r1 = 2561(0xa01, float:3.589E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0729
            X.2z0 r7 = r5.A1J
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0729
            byte[] r6 = X.AnonymousClass313.A0D
            byte r4 = r5.A1I
            int r2 = r6.length
            r1 = 0
        L_0x0406:
            if (r1 >= r2) goto L_0x0729
            byte r0 = r6[r1]
            if (r0 != r4) goto L_0x049f
            X.4uZ r4 = r7.A00
            if (r4 == 0) goto L_0x0729
            X.2ss r0 = r3.A02
            X.31A r6 = X.C56982ss.A00(r0, r4)
            if (r6 == 0) goto L_0x0729
            X.1aQ r2 = new X.1aQ
            r2.<init>()
            X.5ZC r0 = r2.samplingRate
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0729
            X.30N r1 = r3.A0C
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = r1.A04(r0)
            r2.A07 = r0
            X.3Z2 r0 = r6.A0b
            int r0 = r0.expiration
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A05 = r0
            int r0 = r5.A05
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A03 = r0
            boolean r1 = X.C627336j.A0K(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            if (r1 == 0) goto L_0x0498
            X.2sj r0 = r3.A03
            r1 = r4
            X.1fL r1 = (X.C28011fL) r1
            X.33h r0 = r0.A09
            int r0 = r0.A03(r1)
            int r0 = X.AnonymousClass36M.A04(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.4uZ r1 = r5.A0n()
            if (r1 == 0) goto L_0x047a
            X.3Ex r0 = r3.A00
            X.3ZH r0 = r0.A07(r1)
        L_0x0470:
            if (r0 == 0) goto L_0x047a
            int r0 = r0.A01
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A04 = r0
        L_0x047a:
            X.2rR r0 = r3.A07
            java.lang.Integer r0 = r0.A05()
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r2.A06 = r0
            X.2rt r0 = r3.A05
            boolean r0 = r0.A07(r4)
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            r2.A01 = r0
            X.4FV r0 = r3.A0B
            r0.BhD(r2)
            return
        L_0x0498:
            X.3Ex r0 = r3.A00
            X.3ZH r0 = r0.A07(r4)
            goto L_0x0470
        L_0x049f:
            int r1 = r1 + 1
            goto L_0x0406
        L_0x04a3:
            java.lang.Object r5 = r3.A00
            X.3Lv r5 = (X.C66543Lv) r5
            java.lang.Object r4 = r3.A01
            X.34x r4 = (X.C624134x) r4
            X.3Lg r1 = r5.A1M
            X.34x r0 = r4.A0w()
            if (r0 == 0) goto L_0x0729
            X.3dV r0 = r1.A0D
            X.4Fq r3 = r0.A04()
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x04e8 }
            r0 = 1
            r1.A03(r4, r0)     // Catch:{ all -> 0x04de }
            r2.A00()     // Catch:{ all -> 0x04de }
            r0 = 46
            A01(r3, r1, r4, r0)     // Catch:{ all -> 0x04de }
            r2.close()     // Catch:{ all -> 0x04e8 }
            r3.close()
            X.2hU r0 = r5.A0q
            android.os.Handler r3 = r0.A02
            r2 = -1
            r1 = 0
            r0 = 2
            android.os.Message r0 = android.os.Message.obtain(r3, r0, r2, r1, r4)
        L_0x04da:
            r0.sendToTarget()
            return
        L_0x04de:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x04e3 }
            goto L_0x04e7
        L_0x04e3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04e8 }
        L_0x04e7:
            throw r1     // Catch:{ all -> 0x04e8 }
        L_0x04e8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0678 }
            throw r1
        L_0x04ed:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1io r0 = r0.A14
            r0.A08(r1)
            return
        L_0x04fb:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r1 = r3.A01
            X.34x r1 = (X.C624134x) r1
            X.2pF r0 = r0.A0y
            goto L_0x0785
        L_0x0507:
            java.lang.Object r4 = r3.A00
            X.3Lv r4 = (X.C66543Lv) r4
            java.lang.Object r0 = r3.A01
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0513:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0729
            X.4uZ r2 = X.C18300x5.A0P(r3)
            X.1hu r1 = r4.A0U
            r0 = 0
            r1.A0A(r2, r0)
            X.1io r0 = r4.A14
            r0.A09(r2)
            goto L_0x0513
        L_0x0529:
            java.lang.Object r0 = r3.A00
            X.3Lv r0 = (X.C66543Lv) r0
            java.lang.Object r2 = r3.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1io r1 = r0.A14
            r0 = 0
            r1.A0F(r2, r0)
            return
        L_0x0538:
            java.lang.Object r5 = r3.A00
            X.3Lv r5 = (X.C66543Lv) r5
            java.lang.Object r0 = r3.A01
            X.2Ty r0 = (X.C43912Ty) r0
            java.util.List r0 = r0.A09
            java.util.ArrayList r4 = X.C162197rQ.newArrayList()
            java.util.Iterator r3 = r0.iterator()
        L_0x054a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0562
            long r1 = X.C18270x1.A02(r3)
            X.2qz r0 = r5.A2D     // Catch:{ all -> 0x0560 }
            X.34x r0 = X.C55122pp.A00(r0, r1)     // Catch:{ all -> 0x0560 }
            if (r0 == 0) goto L_0x054a
            r4.add(r0)
            goto L_0x054a
        L_0x0560:
            r1 = move-exception
            throw r1
        L_0x0562:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0729
            X.1io r2 = r5.A14
            java.lang.String r0 = "MessageObservers/notifyMessagesUndeleted"
            java.util.Iterator r1 = X.C61102zi.A04(r2, r0)
        L_0x0570:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0729
            X.4FW r0 = X.C29431io.A00(r2, r1)
            r0.BWj(r4)
            goto L_0x0570
        L_0x057e:
            java.lang.Object r2 = r3.A00
            X.30G r2 = (X.AnonymousClass30G) r2
            java.lang.Object r1 = r3.A01
            X.3ST r1 = (X.AnonymousClass3ST) r1
            X.2z0 r6 = X.AnonymousClass3ST.A00(r1)
            com.whatsapp.jid.Jid r0 = r1.A0E
            X.4uZ r4 = X.C627336j.A02(r0)
            long r11 = r1.A16
            r9 = 1
            r5 = 0
            int r10 = r1.BCI()
            X.2TJ r3 = new X.2TJ
            r8 = r5
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.A02(r3)
            return
        L_0x05a3:
            java.lang.Object r1 = r3.A00
            X.30G r1 = (X.AnonymousClass30G) r1
            java.lang.Object r0 = r3.A01
            X.1io r2 = r1.A0M
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r2.A0F(r1, r0)
            return
        L_0x05b4:
            java.lang.Object r4 = r3.A00
            X.30G r4 = (X.AnonymousClass30G) r4
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r4.A0M
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            r1.A08(r0)
            X.2pF r0 = r4.A0I
            r0.A02(r2)
            return
        L_0x05cb:
            java.lang.Object r0 = r3.A00
            X.2qj r0 = (X.C55672qj) r0
            java.lang.Object r12 = r3.A01
            X.34x r12 = (X.C624134x) r12
            X.300 r10 = r0.A0L
        L_0x05d5:
            X.2m9 r0 = r10.A05
            android.os.Handler r0 = r0.A01
            X.C626936e.A02(r0)
            X.2z0 r4 = r12.A1J
            X.3dV r0 = r10.A0A
            X.4Fq r9 = r0.A04()
            X.3Yo r8 = r9.Axl()     // Catch:{ all -> 0x0673 }
            X.2gd r3 = r10.A0B     // Catch:{ all -> 0x0669 }
            java.util.List r0 = r3.A00(r4)     // Catch:{ all -> 0x0669 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0669 }
            r6 = 0
        L_0x05f3:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0669 }
            if (r0 == 0) goto L_0x0653
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x0669 }
            X.2mB r5 = (X.C52872mB) r5     // Catch:{ all -> 0x0669 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0669 }
            java.lang.String r0 = "MessageStatusStore/applyingorphanedreceipt/receipt="
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x0669 }
            com.whatsapp.jid.UserJid r1 = r5.A03     // Catch:{ all -> 0x0669 }
            if (r1 == 0) goto L_0x061f
            X.4uZ r0 = r4.A00     // Catch:{ all -> 0x0669 }
            boolean r0 = X.C627336j.A0K(r0)     // Catch:{ all -> 0x0669 }
            if (r0 == 0) goto L_0x061f
            X.4uZ r0 = r12.A0n()     // Catch:{ all -> 0x0669 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0669 }
            if (r0 != 0) goto L_0x061f
            goto L_0x05f3
        L_0x061f:
            int r13 = r5.A00     // Catch:{ all -> 0x0669 }
            r0 = 17
            r2 = 1
            if (r13 != r0) goto L_0x0641
            X.2r4 r0 = r10.A0H     // Catch:{ all -> 0x0669 }
            boolean r0 = r0.A05(r12)     // Catch:{ all -> 0x0669 }
            if (r0 == 0) goto L_0x0633
            X.33Y r0 = r10.A0I     // Catch:{ all -> 0x0669 }
            r0.A0D(r12, r2)     // Catch:{ all -> 0x0669 }
        L_0x0633:
            com.whatsapp.jid.DeviceJid r11 = r5.A02     // Catch:{ all -> 0x0669 }
            long r14 = r5.A01     // Catch:{ all -> 0x0669 }
            r10.A04(r11, r12, r13, r14)     // Catch:{ all -> 0x0669 }
            boolean r0 = X.AnonymousClass300.A00(r4, r13)     // Catch:{ all -> 0x0669 }
            if (r0 == 0) goto L_0x05f3
            goto L_0x0651
        L_0x0641:
            r0 = 18
            if (r13 != r0) goto L_0x0633
            X.33S r1 = r10.A0J     // Catch:{ all -> 0x0669 }
            java.util.Set r0 = java.util.Collections.singleton(r12)     // Catch:{ all -> 0x0669 }
            r1.A04(r0, r2)     // Catch:{ all -> 0x0669 }
            r13 = 8
            goto L_0x0633
        L_0x0651:
            r6 = 1
            goto L_0x05f3
        L_0x0653:
            r3.A01(r4)     // Catch:{ all -> 0x0669 }
            r8.A00()     // Catch:{ all -> 0x0669 }
            r8.close()     // Catch:{ all -> 0x0673 }
            r9.close()
            if (r6 == 0) goto L_0x0729
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r10.A02(r0)
            return
        L_0x0669:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x066e }
            goto L_0x0672
        L_0x066e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0673 }
        L_0x0672:
            throw r1     // Catch:{ all -> 0x0673 }
        L_0x0673:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0678 }
            throw r1
        L_0x0678:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x067d:
            java.lang.Object r0 = r3.A00
            X.2qj r0 = (X.C55672qj) r0
            java.lang.Object r2 = r3.A01
            X.33b r1 = r0.A0Y
            android.os.Handler r4 = r1.A03()
            r0 = 23
            X.3Zz r3 = new X.3Zz
            r3.<init>(r1, r0, r2)
        L_0x0690:
            r4.post(r3)
            return
        L_0x0694:
            java.lang.Object r4 = r3.A00
            X.2pj r4 = (X.C55062pj) r4
            java.lang.Object r0 = r3.A01
            long r2 = X.C18310x6.A0B(r0)
            r1 = 0
            X.3bj r0 = r4.A07
            r4.A01(r0, r2, r1)
            return
        L_0x06a5:
            java.lang.Object r0 = r3.A00
            X.2gc r0 = (X.C49492gc) r0
            java.lang.Object r1 = r3.A01
            java.util.Map r0 = r0.A02
            monitor-enter(r0)
            r0.remove(r1)     // Catch:{ all -> 0x06b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x06b3 }
            return
        L_0x06b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x06b3 }
            throw r1
        L_0x06b6:
            java.lang.Object r0 = r3.A00
            X.2gc r0 = (X.C49492gc) r0
            java.lang.Object r1 = r3.A01
            java.util.Map r0 = r0.A02
            monitor-enter(r0)
            r0.remove(r1)     // Catch:{ all -> 0x06c4 }
            monitor-exit(r0)     // Catch:{ all -> 0x06c4 }
            return
        L_0x06c4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x06c4 }
            throw r1
        L_0x06c7:
            java.lang.Object r1 = r3.A00
            X.2sj r1 = (X.C56892sj) r1
            java.lang.Object r0 = r3.A01
            X.1iV r1 = r1.A0F
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A08(r0)
            return
        L_0x06d7:
            java.lang.Object r0 = r3.A00
            X.3DW r0 = (X.AnonymousClass3DW) r0
            java.lang.Object r1 = r3.A01
            X.5ZM r1 = (X.AnonymousClass5ZM) r1
            X.4FS r0 = r0.A0O
            X.C18270x1.A0w(r1, r0)
            return
        L_0x06e5:
            java.lang.Object r0 = r3.A00
            X.2nN r0 = (X.C53612nN) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A04
            r0 = 40
            goto L_0x06fe
        L_0x06f2:
            java.lang.Object r0 = r3.A00
            X.2nN r0 = (X.C53612nN) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A04
            r0 = 39
        L_0x06fe:
            r1.A0C(r2, r0)
            return
        L_0x0702:
            java.lang.Object r5 = r3.A00
            X.2sJ r5 = (X.C56632sJ) r5
            java.lang.Object r0 = r3.A01
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x070e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.String r0 = X.AnonymousClass001.A0m(r4)
            long r2 = java.lang.Long.parseLong(r0)
            X.0Qw r1 = r5.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A05(r0)
            goto L_0x070e
        L_0x0726:
            X.AnonymousClass0x7.A1M(r42)
        L_0x0729:
            return
        L_0x072a:
            java.lang.Object r0 = r3.A00
            X.300 r0 = (X.AnonymousClass300) r0
            java.lang.Object r1 = r3.A01
            X.34x r1 = (X.C624134x) r1
            X.2o2 r0 = r0.A0D
            X.2z0 r1 = r1.A1J
            X.0Qw r0 = r0.A00
            r0.A05(r1)
            return
        L_0x073c:
            java.lang.Object r5 = r3.A00
            X.2Nm r5 = (X.C42282Nm) r5
            java.lang.Object r4 = r3.A01
            X.31A r4 = (X.AnonymousClass31A) r4
            X.2sm r3 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            android.content.ContentValues r2 = X.C18280x3.A09()     // Catch:{ all -> 0x075b }
            java.lang.String r1 = "has_new_community_admin_dialog_been_acknowledged"
            boolean r0 = r4.A0k     // Catch:{ all -> 0x075b }
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r2, r1, r0)     // Catch:{ all -> 0x075b }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            r3.A04(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            return
        L_0x075b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0763, Error | RuntimeException -> 0x075e, Error | RuntimeException -> 0x075e }
        L_0x075e:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0763:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r5.A02
        L_0x0769:
            r0.A04()
            return
        L_0x076d:
            java.lang.Object r0 = r3.A00
            X.2ow r0 = (X.C54572ow) r0
            java.lang.Object r1 = r3.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.2pF r0 = r0.A01
            r0.A01(r1)
            return
        L_0x077b:
            java.lang.Object r0 = r3.A00
            X.3Lg r0 = (X.C66393Lg) r0
            java.lang.Object r1 = r3.A01
            X.34x r1 = (X.C624134x) r1
            X.2pF r0 = r0.A0C
        L_0x0785:
            r0.A02(r1)
            return
        L_0x0789:
            java.lang.Object r2 = r3.A00
            X.2o2 r2 = (X.C54012o2) r2
            java.lang.Object r0 = r3.A01
            X.34x r0 = (X.C624134x) r0
            X.2z0 r1 = r0.A1J
            X.0Qw r0 = r2.A00
            r0.A05(r1)
            java.util.Set r0 = r2.A0B
            r0.add(r1)
            return
        L_0x079e:
            java.lang.Object r5 = r3.A00
            X.2Pw r5 = (X.C42882Pw) r5
            java.lang.Object r4 = r3.A01
            X.31A r4 = (X.AnonymousClass31A) r4
            X.2sm r3 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
            android.content.ContentValues r2 = X.C18280x3.A09()     // Catch:{ all -> 0x07ba }
            java.lang.String r1 = "spam_detection"
            int r0 = r4.A04     // Catch:{ all -> 0x07ba }
            X.C18270x1.A0b(r2, r1, r0)     // Catch:{ all -> 0x07ba }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
            r3.A04(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
            return
        L_0x07ba:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x07c2, Error | RuntimeException -> 0x07bd }
        L_0x07bd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x07c2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r5.A03
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70093Zw.run():void");
    }
}
