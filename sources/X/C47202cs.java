package X;

/* renamed from: X.2cs  reason: invalid class name and case insensitive filesystem */
public final class C47202cs {
    public final C55682qk A00;
    public final C66543Lv A01;
    public final C623334p A02;
    public final C72303dV A03;
    public final C56662sM A04;
    public final C66443Ll A05;
    public final AnonymousClass26R A06;
    public final AnonymousClass2RB A07;
    public final C59882xe A08;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C30601mi A00(X.C30461mU r14, X.C95814uZ r15, boolean r16) {
        /*
            r13 = this;
            long r8 = r14.A1L
            if (r15 == 0) goto L_0x0011
            X.34p r0 = r13.A02
            long r10 = r0.A05(r15)
        L_0x000a:
            X.3dV r0 = r13.A03
            X.4GK r6 = r0.get()
            goto L_0x0014
        L_0x0011:
            r10 = -1
            goto L_0x000a
        L_0x0014:
            X.3Ll r5 = r13.A05     // Catch:{ all -> 0x005d }
            X.C162457s7.A0H(r6)     // Catch:{ all -> 0x005d }
            r7 = 93
            r12 = r16
            android.database.Cursor r4 = r5.A03(r6, r7, r8, r10, r12)     // Catch:{ all -> 0x005d }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0056 }
            r3 = 0
            if (r0 == 0) goto L_0x004f
            java.util.HashMap r1 = X.AnonymousClass26E.A00(r4, r7)     // Catch:{ all -> 0x0056 }
            X.1mH r2 = r5.A05(r4, r1)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2 instanceof X.C30601mi     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "EventResponseMessageManager/getEventResponseMessageBySender unexpected fMessageAddOn "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x003e:
            X.1mi r2 = (X.C30601mi) r2     // Catch:{ all -> 0x0056 }
            X.34p r0 = r13.A02     // Catch:{ all -> 0x0056 }
            r2.A1y(r4, r0, r1)     // Catch:{ all -> 0x0056 }
            X.C30331mH.A04(r14, r2)     // Catch:{ all -> 0x0056 }
            r4.close()     // Catch:{ all -> 0x005d }
            r6.close()
            return r2
        L_0x004f:
            r4.close()     // Catch:{ all -> 0x005d }
            r6.close()
            return r3
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47202cs.A00(X.1mU, X.4uZ, boolean):X.1mi");
    }

    public C47202cs(C55682qk r1, C66543Lv r2, C623334p r3, C72303dV r4, C56662sM r5, C66443Ll r6, AnonymousClass26R r7, AnonymousClass2RB r8, C59882xe r9) {
        C18260x0.A0f(r3, r1, r5, r4, r6);
        C18260x0.A0W(r2, r9, r7);
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = r2;
        this.A08 = r9;
        this.A06 = r7;
        this.A07 = r8;
    }
}
