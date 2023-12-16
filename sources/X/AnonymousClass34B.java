package X;

/* renamed from: X.34B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34B {
    public static final C85564Gt A03(Object obj, AnonymousClass4C6 r7, AnonymousClass4C8 r8, C85154Fd r9) {
        C43002Qj A02 = A02(r8, 1);
        Object obj2 = obj;
        Object obj3 = obj;
        if (obj == null) {
            obj3 = AnonymousClass2C3.A01;
        }
        C832246p r6 = new C832246p(obj3);
        return new C72923eW(A00(obj2, A02.A01, r7, A02.A03, r6, r9), r6);
    }

    public static final C85474Gj A00(Object obj, C85494Gl r11, AnonymousClass4C6 r12, AnonymousClass4C8 r13, C85534Gq r14, C85154Fd r15) {
        AnonymousClass20D r3;
        C831046d r1;
        C85154Fd r9 = r15;
        if (C162457s7.A0P(r15, C58102ui.A00)) {
            r3 = AnonymousClass20D.DEFAULT;
        } else {
            r3 = AnonymousClass20D.UNDISPATCHED;
        }
        C74923oc r4 = new C74923oc(obj, (C84814Du) null, r13, r14, r9);
        C85494Gl A01 = AnonymousClass348.A01(r11, r12);
        if (r3 == AnonymousClass20D.LAZY) {
            r1 = new C831646j(A01, r4);
        } else {
            r1 = new C830445x(A01, true);
        }
        r1.A10(r1, r4, r3);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r4 == 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r11 != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r5 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C43002Qj A02(X.AnonymousClass4C8 r10, int r11) {
        /*
            int r0 = X.C58062ue.A00
            r3 = r11
            if (r11 >= r0) goto L_0x0006
            r3 = r0
        L_0x0006:
            int r3 = r3 - r11
            boolean r0 = r10 instanceof X.C72933eX
            if (r0 == 0) goto L_0x0052
            r2 = r10
            X.3eX r2 = (X.C72933eX) r2
            boolean r0 = r2 instanceof X.C832846v
            if (r0 == 0) goto L_0x003c
            r0 = r2
            X.46w r0 = (X.C832946w) r0
            X.4C8 r5 = r0.A00
            if (r5 == 0) goto L_0x0052
        L_0x0019:
            int r4 = r2.A00
            r0 = -3
            if (r4 == r0) goto L_0x002e
            r0 = -2
            if (r4 == r0) goto L_0x002e
            if (r4 == 0) goto L_0x002e
            r3 = r4
        L_0x0024:
            X.20l r1 = r2.A02
            X.4Gl r0 = r2.A01
            X.2Qj r2 = new X.2Qj
            r2.<init>(r0, r1, r5, r3)
            return r2
        L_0x002e:
            X.20l r1 = r2.A02
            X.20l r0 = X.C369720l.SUSPEND
            if (r1 != r0) goto L_0x0038
            if (r4 != 0) goto L_0x0024
        L_0x0036:
            r3 = 0
            goto L_0x0024
        L_0x0038:
            r3 = 1
            if (r11 == 0) goto L_0x0024
            goto L_0x0036
        L_0x003c:
            boolean r0 = r2 instanceof X.C833046x
            if (r0 == 0) goto L_0x0052
            r0 = r2
            X.46x r0 = (X.C833046x) r0
            X.4FH r8 = r0.A00
            boolean r10 = r0.A01
            X.3du r6 = X.C72553du.A00
            r9 = -3
            X.20l r7 = X.C369720l.SUSPEND
            X.46x r5 = new X.46x
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0019
        L_0x0052:
            X.20l r1 = X.C369720l.SUSPEND
            X.3du r0 = X.C72553du.A00
            X.2Qj r2 = new X.2Qj
            r2.<init>(r0, r1, r10, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34B.A02(X.4C8, int):X.2Qj");
    }

    public static final C85544Gr A01(AnonymousClass4C6 r6, AnonymousClass4C8 r7, C85154Fd r8, int i) {
        C43002Qj A02 = A02(r7, i);
        int i2 = A02.A00;
        C369720l r2 = A02.A02;
        if (i2 < 0) {
            throw AnonymousClass000.A0G("extraBufferCapacity cannot be negative, but was ", AnonymousClass001.A0o(), i2);
        } else if (i > 0 || i2 > 0 || r2 == C369720l.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            C832146o r5 = new C832146o(r2, i, i3);
            return new C72883eS(A00(C39222Bd.A00, A02.A01, r6, A02.A03, r5, r8), r5);
        } else {
            throw AnonymousClass000.A0E(r2, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", AnonymousClass001.A0o());
        }
    }
}
