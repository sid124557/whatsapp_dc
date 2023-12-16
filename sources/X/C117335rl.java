package X;

/* renamed from: X.5rl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117335rl implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C113105kt A02;
    public final /* synthetic */ C30721mu A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r2 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.5kt r5 = r0.A02
            X.1mu r7 = r0.A03
            int r8 = r0.A00
            boolean r10 = r0.A04
            int r9 = r0.A01
            r4 = 0
            X.8qC r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.5Hi r1 = (X.C102065Hi) r1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SequentialMessageController/getSequentialMessage + previousMessage="
            X.2z0 r2 = X.C624134x.A08(r7, r0, r3)
            java.lang.String r0 = r2.A01
            X.C18260x0.A1J(r3, r0)
            X.4uZ r12 = r2.A00
            if (r12 == 0) goto L_0x007b
            X.3Lv r11 = r1.A00
            long r14 = r7.A1L
            r2 = 1
            long r14 = r14 + r2
            r13 = 1
            r18 = 0
            r16 = -1
            X.2Ni r0 = r11.A0B(r12, r13, r14, r16, r18)
            android.database.Cursor r2 = r0.A00
            if (r2 == 0) goto L_0x0064
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0064
            X.2qz r0 = r1.A01     // Catch:{ all -> 0x006a }
            X.34x r6 = r0.A03(r2)     // Catch:{ all -> 0x006a }
            boolean r0 = r6 instanceof X.C30721mu     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "SequentialMessageController/getSequentialMessage next message is not audio"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006a }
            goto L_0x0078
        L_0x0052:
            X.2z0 r0 = r6.A1J     // Catch:{ all -> 0x006a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x007d
            r0 = r6
            X.1mu r0 = (X.C30721mu) r0     // Catch:{ all -> 0x006a }
            X.33C r0 = X.C30471mV.A00(r0)     // Catch:{ all -> 0x006a }
            boolean r0 = r0.A0R     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x007d
            goto L_0x0078
        L_0x0064:
            java.lang.String r0 = "SequentialMessageController/getSequentialMessage no more messages"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x006a }
            goto L_0x0076
        L_0x006a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ all -> 0x0071 }
            throw r1
        L_0x0071:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0075:
            throw r1
        L_0x0076:
            if (r2 == 0) goto L_0x007b
        L_0x0078:
            r2.close()
        L_0x007b:
            r6 = r4
            goto L_0x0080
        L_0x007d:
            r2.close()
        L_0x0080:
            X.3Wi r0 = r5.A01
            X.5rq r4 = new X.5rq
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A0S(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117335rl.run():void");
    }

    public /* synthetic */ C117335rl(C113105kt r1, C30721mu r2, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
    }
}
