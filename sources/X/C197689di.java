package X;

/* renamed from: X.9di  reason: invalid class name and case insensitive filesystem */
public final class C197689di implements AnonymousClass4DR {
    public final AnonymousClass5ZR A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass9U4 A03;
    public final AnonymousClass3UD A04;

    /* JADX WARNING: type inference failed for: r1v10, types: [X.7yw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object Bk2(java.lang.Enum r5, java.lang.Object r6, java.util.Map r7) {
        /*
            r4 = this;
            X.9Uc r6 = (X.C194689Uc) r6
            X.9KH r5 = (X.AnonymousClass9KH) r5
            r2 = 0
            boolean r0 = X.AnonymousClass0x2.A1Y(r6, r5)
            int r1 = r5.ordinal()
            if (r1 == r2) goto L_0x0083
            if (r1 == r0) goto L_0x0075
            r0 = 2
            r2 = 0
            if (r1 == r0) goto L_0x0046
            r0 = 3
            if (r1 == r0) goto L_0x0040
            r0 = 5
            if (r1 != r0) goto L_0x0074
            if (r7 == 0) goto L_0x003e
            java.lang.String r0 = "credential_id"
            java.lang.Object r1 = r7.get(r0)
        L_0x0023:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0074
            X.9U4 r0 = r4.A03
            X.7yw r1 = X.AnonymousClass9U4.A02(r0, r1)
            boolean r0 = r1 instanceof X.C133736hr
            if (r0 == 0) goto L_0x0038
            r2 = r1
            X.6hr r2 = (X.C133736hr) r2
        L_0x0038:
            X.9At r0 = new X.9At
            r0.<init>(r2)
            return r0
        L_0x003e:
            r1 = r2
            goto L_0x0023
        L_0x0040:
            X.9As r2 = new X.9As
            r2.<init>()
            return r2
        L_0x0046:
            if (r7 == 0) goto L_0x0072
            java.lang.String r0 = "check_location"
            java.lang.Object r1 = r7.get(r0)
        L_0x004e:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0053
            r1 = r2
        L_0x0053:
            java.lang.String r3 = "pinEntry"
            boolean r0 = X.C162457s7.A0P(r1, r3)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "onboarding"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0063:
            X.1VX r2 = r4.A01
            X.4FV r1 = r4.A02
            X.3UD r0 = r4.A04
            boolean r0 = X.AnonymousClass9UE.A00(r2, r1, r0, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0072:
            r1 = r2
            goto L_0x004e
        L_0x0074:
            return r2
        L_0x0075:
            X.5ZR r0 = r4.A00
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0080
            java.lang.String r2 = "GRANTED"
            return r2
        L_0x0080:
            java.lang.String r2 = "NOT_GRANTED"
            return r2
        L_0x0083:
            java.lang.String r2 = r6.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197689di.Bk2(java.lang.Enum, java.lang.Object, java.util.Map):java.lang.Object");
    }

    public C197689di(AnonymousClass5ZR r1, AnonymousClass1VX r2, AnonymousClass4FV r3, AnonymousClass9U4 r4, AnonymousClass3UD r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
    }

    public Class B3E() {
        return AnonymousClass9KH.class;
    }
}
