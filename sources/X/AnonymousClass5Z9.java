package X;

/* renamed from: X.5Z9  reason: invalid class name */
public final class AnonymousClass5Z9 {
    public Long A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass2M9 A03;
    public final AnonymousClass2X0 A04;
    public final C102215Hx A05 = new C102215Hx();
    public final C183538qC A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C120275yK(this));

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r3 == 11) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(java.lang.Integer r5) {
        /*
            r1 = 4
            r4 = 5
            if (r5 == 0) goto L_0x004b
            int r3 = r5.intValue()
            if (r3 == r4) goto L_0x0046
            r2 = 1
            if (r3 == r1) goto L_0x0016
            r0 = 10
            if (r3 == r0) goto L_0x0016
            r0 = 11
            r1 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            r0 = 3
            if (r1 == 0) goto L_0x001f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x001f:
            r1 = 2
            if (r3 == r0) goto L_0x0046
            r0 = 13
            if (r3 != r0) goto L_0x002b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L_0x002b:
            r0 = 7
            if (r3 == r0) goto L_0x0041
            r0 = 9
            if (r3 == r0) goto L_0x0041
            r0 = 12
            if (r3 == r0) goto L_0x0041
            r0 = 6
            if (r3 == r0) goto L_0x0041
            if (r3 == r1) goto L_0x0041
            if (r3 == r2) goto L_0x0041
            r0 = 8
            if (r3 != r0) goto L_0x004b
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Z9.A00(java.lang.Integer):java.lang.Integer");
    }

    public final void A03(C624134x r5, String str, long j) {
        String str2 = str;
        if (C162457s7.A0P(str, "success") || C162457s7.A0P(str, "request")) {
            str2 = null;
        }
        int i = 12;
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    i = 14;
                    break;
                }
                break;
            case 1095692943:
                if (str.equals("request")) {
                    i = 13;
                    break;
                }
                break;
        }
        A02(r5, Long.valueOf(j), str2, i);
    }

    public final C95044sW A01() {
        C95044sW r3 = new C95044sW();
        if (this.A00 == null) {
            AnonymousClass2M9 r2 = this.A03;
            if (r2.A00 == null) {
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
        }
        Long l = this.A03.A00;
        if (l == null) {
            l = this.A00;
        }
        r3.A08 = l;
        this.A00 = l;
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C624134x r12, java.lang.Long r13, java.lang.String r14, int r15) {
        /*
            r11 = this;
            X.5de r4 = r12.A0O
            r2 = 0
            if (r4 == 0) goto L_0x009c
            int r3 = r4.A00
            r1 = 1
            if (r3 == 0) goto L_0x0096
            r0 = 1
            r1 = 3
            if (r3 == r0) goto L_0x0096
            r1 = 2
            if (r3 == r1) goto L_0x0096
            r9 = 0
        L_0x0012:
            boolean r7 = r4.A03
        L_0x0014:
            byte r4 = r12.A1I
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r3 = 1
            if (r0 == 0) goto L_0x0094
            r1 = 2
            if (r4 == 0) goto L_0x0029
            r0 = 3
            r1 = 4
            if (r4 == r0) goto L_0x0029
            r0 = 13
            if (r4 != r0) goto L_0x008d
            r1 = 5
        L_0x0029:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x002d:
            X.2X0 r0 = r11.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0068
            X.4sW r1 = r11.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A03 = r0
            X.2z0 r0 = r12.A1J
            java.lang.String r0 = r0.A01
            r1.A09 = r0
            int r0 = r12.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = A00(r0)
            r1.A02 = r0
            r1.A01 = r8
            r1.A0A = r14
            r1.A05 = r13
            int r0 = r12.A0B
            if (r0 == 0) goto L_0x005f
            java.lang.Long r2 = X.AnonymousClass0x9.A0m(r0)
        L_0x005f:
            r1.A06 = r2
            r1.A04 = r9
            X.4FV r0 = r11.A02
            r0.BhB(r1)
        L_0x0068:
            X.66R r0 = r11.A07
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x0102
            X.8qC r0 = r11.A06
            java.lang.Object r5 = r0.get()
            X.5OQ r5 = (X.AnonymousClass5OQ) r5
            X.2z0 r0 = r12.A1J
            java.lang.String r1 = r0.A01
            X.C162457s7.A0C(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x0102
            long r2 = r0.longValue()
            r4 = 0
            goto L_0x00a0
        L_0x008d:
            if (r4 != r3) goto L_0x0094
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x002d
        L_0x0094:
            r8 = 0
            goto L_0x002d
        L_0x0096:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto L_0x0012
        L_0x009c:
            r9 = r2
            r7 = 0
            goto L_0x0014
        L_0x00a0:
            X.66s r6 = r5.A03     // Catch:{ IllegalArgumentException -> 0x00f8 }
            java.lang.String r0 = "status_id"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r8 == 0) goto L_0x00b4
            java.lang.String r1 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r1 == 0) goto L_0x00b4
            java.lang.String r0 = "content_type"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x00f8 }
        L_0x00b4:
            if (r10 == 0) goto L_0x00bf
            java.lang.String r0 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r0 == 0) goto L_0x00bf
            r6.flowMarkPoint(r2, r0)     // Catch:{ IllegalArgumentException -> 0x00f8 }
        L_0x00bf:
            java.lang.String r8 = "is_fb_auto_crossposting_enabled_end"
            X.2rK r1 = r5.A04     // Catch:{ IllegalArgumentException -> 0x00f8 }
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ IllegalArgumentException -> 0x00f8 }
            boolean r0 = X.C86624Kv.A1Y(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            r6.flowAnnotate((long) r2, (java.lang.String) r8, (boolean) r0)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r9 == 0) goto L_0x00d9
            java.lang.String r1 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "status_privacy_type"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x00f8 }
        L_0x00d9:
            java.lang.String r0 = "is_fb_crosspost"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (boolean) r7)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            if (r10 == 0) goto L_0x0102
            int r1 = r10.intValue()     // Catch:{ IllegalArgumentException -> 0x00f8 }
            r0 = 14
            if (r1 != r0) goto L_0x00ee
            r6.flowEndSuccess(r2)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            r5.A00 = r4     // Catch:{ IllegalArgumentException -> 0x00f8 }
            return
        L_0x00ee:
            r0 = 12
            if (r1 != r0) goto L_0x0102
            r6.flowEndFail(r2, r14, r4)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            r5.A00 = r4     // Catch:{ IllegalArgumentException -> 0x00f8 }
            return
        L_0x00f8:
            r0 = move-exception
            X.66s r1 = r5.A03
            java.lang.String r0 = r0.getMessage()
            r1.flowEndFail(r2, r0, r4)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Z9.A02(X.34x, java.lang.Long, java.lang.String, int):void");
    }

    public AnonymousClass5Z9(AnonymousClass1VX r2, AnonymousClass4FV r3, AnonymousClass2M9 r4, AnonymousClass2X0 r5, C183538qC r6) {
        C18260x0.A0d(r2, r3, r4, r6);
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r6;
    }
}
