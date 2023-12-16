package X;

/* renamed from: X.3Fr  reason: invalid class name and case insensitive filesystem */
public final class C64963Fr implements AnonymousClass664 {
    public final AnonymousClass7KQ A00;
    public final C56722sS A01;
    public final C55382qG A02;
    public final AnonymousClass4FV A03;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r8 = this;
            X.2sS r0 = r8.A01
            X.2m4 r3 = r0.A01
            X.1VX r2 = r3.A03
            r1 = 5459(0x1553, float:7.65E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x007a
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x008a
            r2 = 4
        L_0x0017:
            X.4FV r4 = r8.A03
            X.1Y5 r3 = new X.1Y5
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A00 = r0
            X.7KQ r0 = r8.A00
            X.66R r7 = r0.A02
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "bonsai_gen_ai_added_to_waitlist_timestamp_ms"
            long r5 = X.AnonymousClass0x2.A0A(r1, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 != 0) goto L_0x007d
        L_0x003e:
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "bonsai_gen_ai_feature_allowed_timestamp_ms"
            long r5 = X.AnonymousClass0x2.A0A(r1, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 != 0) goto L_0x007d
        L_0x0054:
            r0 = 0
        L_0x0055:
            r3.A02 = r0
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "bonsai_gen_ai_feature_allowed_timestamp_ms"
            long r5 = X.AnonymousClass0x2.A0A(r1, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x007b
            long r0 = X.C18290x4.A0B(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0075:
            r3.A01 = r0
            r4.BhD(r3)
        L_0x007a:
            return
        L_0x007b:
            r0 = 0
            goto L_0x0075
        L_0x007d:
            long r0 = r0.longValue()
            long r0 = X.C18290x4.A0B(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0055
        L_0x008a:
            X.2qG r0 = r8.A02
            X.21j r0 = r0.A01()
            int r1 = r0.ordinal()
            r0 = 0
            r2 = 1
            if (r1 == r0) goto L_0x0017
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x0017
            if (r1 != r2) goto L_0x00a1
            r2 = 3
            goto L_0x0017
        L_0x00a1:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64963Fr.BQV():void");
    }

    public C64963Fr(AnonymousClass7KQ r1, C56722sS r2, C55382qG r3, AnonymousClass4FV r4) {
        C18260x0.A0c(r2, r4, r3, r1);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public String BDW() {
        return "BonsaiWaitlistLogger";
    }
}
