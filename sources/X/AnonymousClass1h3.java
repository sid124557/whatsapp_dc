package X;

/* renamed from: X.1h3  reason: invalid class name */
public final class AnonymousClass1h3 extends AnonymousClass3D2 {
    public AnonymousClass4DF A00;
    public AnonymousClass4DF A01;
    public final C56982ss A02;
    public final C56982ss A03;
    public final C56652sL A04;
    public final C56652sL A05;
    public final C95804uY A06;
    public final C95804uY A07;
    public final C53942nv A08;
    public final C56842se A09;
    public final C157007hZ A0A;
    public final C162047r8 A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1h3(X.C56982ss r24, X.C56652sL r25, X.C49552gi r26, X.C95804uY r27, X.AnonymousClass4DF r28, X.AnonymousClass48L r29, X.C53942nv r30, X.C56842se r31, X.C162047r8 r32, X.AnonymousClass4FS r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            r23 = this;
            r12 = 1
            r2 = r33
            X.C162457s7.A0J(r2, r12)
            r0 = 3
            r5 = r29
            r3 = r31
            X.AnonymousClass0x2.A1A(r3, r0, r5)
            r8 = r24
            r7 = r25
            r4 = r30
            X.C18260x0.A0W(r4, r8, r7)
            r6 = r27
            if (r27 == 0) goto L_0x0067
            java.lang.String r1 = "JID"
        L_0x001d:
            r11 = 0
            X.7hZ r10 = new X.7hZ
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r13 = r36
            r14 = r12
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r23
            r9 = r26
            r0.<init>(r9, r5, r2)
            r0.A03 = r8
            r0.A04 = r7
            r0.A09 = r3
            r2 = r32
            r0.A0B = r2
            r0.A08 = r4
            r2 = r34
            r0.A0E = r2
            r0.A06 = r6
            r0.A0D = r1
            r0.A0A = r10
            r0.A0F = r13
            r3 = r28
            r0.A01 = r3
            r0.A02 = r8
            r0.A05 = r7
            r0.A0C = r2
            r0.A07 = r6
            r1 = r35
            r0.A0G = r1
            r0.A00 = r3
            return
        L_0x0067:
            java.lang.String r1 = "INVITE"
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1h3.<init>(X.2ss, X.2sL, X.2gi, X.4uY, X.4DF, X.48L, X.2nv, X.2se, X.7r8, X.4FS, java.lang.String, boolean, boolean):void");
    }

    public void A00() {
        AnonymousClass1RL A032;
        if (!this.A02) {
            if (this.A0G) {
                C95804uY r1 = this.A07;
                if (r1 != null) {
                    A032 = (AnonymousClass1RL) C56982ss.A00(this.A02, r1);
                } else {
                    C56652sL r12 = this.A05;
                    String str = this.A0C;
                    if (str == null) {
                        str = "";
                    }
                    A032 = r12.A03(str);
                }
                if (A032 != null) {
                    AnonymousClass4DF r13 = this.A00;
                    if (r13 != null) {
                        r13.BX8(A032.A0I());
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("GetNewsletterPreviewGraphqlHandler/Fetched newsletter ");
                    A0o.append(A032.A0H);
                    A0o.append('(');
                    C18280x3.A0u(A032.A0I(), A0o);
                    C18260x0.A1J(A0o, ") from local db");
                    return;
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("GetNewsletterPreviewGraphqlHandler/Newsletter not found in local db, will be fetching from network: ");
            C18260x0.A1J(A0o2, this.A0C);
            super.A00();
        }
    }

    public void cancel() {
        super.cancel();
        this.A01 = null;
        this.A00 = null;
    }
}
