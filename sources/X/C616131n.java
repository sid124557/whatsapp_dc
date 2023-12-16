package X;

/* renamed from: X.31n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C616131n {
    public static /* synthetic */ C85474Gj A02(C85494Gl r2, AnonymousClass4GR r3, AnonymousClass4C6 r4, AnonymousClass20D r5, int i) {
        C831046d r1;
        if ((i & 1) != 0) {
            r2 = C72553du.A00;
        }
        if ((i & 2) != 0) {
            r5 = AnonymousClass20D.DEFAULT;
        }
        C85494Gl A01 = AnonymousClass348.A01(r2, r4);
        if (r5 == AnonymousClass20D.LAZY) {
            r1 = new C831646j(A01, r3);
        } else {
            r1 = new C830445x(A01, true);
        }
        r1.A10(r1, r3, r5);
        return r1;
    }

    public static final Object A00(C84814Du r5, C85494Gl r6, AnonymousClass4GR r7) {
        C85494Gl A00;
        C85494Gl B5w = r5.B5w();
        if (!AnonymousClass001.A1Z(r6.fold(Boolean.FALSE, C828145a.A00))) {
            A00 = B5w.plus(r6);
        } else {
            A00 = AnonymousClass348.A00(B5w, r6, false);
        }
        AnonymousClass34A.A02(A00);
        if (A00 == B5w) {
            C830645z r0 = new C830645z(r5, A00);
            return AnonymousClass2AU.A00(r0, r7, r0);
        }
        C72513dq r02 = AnonymousClass4GY.A00;
        if (C162457s7.A0P(A00.get(r02), B5w.get(r02))) {
            AnonymousClass476 r3 = new AnonymousClass476(r5, A00);
            C85494Gl B5w2 = r3.B5w();
            Object A002 = AnonymousClass34N.A00((Object) null, B5w2);
            try {
                return AnonymousClass2AU.A00(r3, r7, r3);
            } finally {
                AnonymousClass34N.A01(A002, B5w2);
            }
        } else {
            AnonymousClass477 r2 = new AnonymousClass477(r5, A00);
            try {
                C58082ug.A00(C59022wD.A00, C57702u4.A01(C57702u4.A00(r2, r2, r7)));
                return r2.A12();
            } catch (Throwable th) {
                AnonymousClass3Z0.A02(th, r2);
                throw th;
            }
        }
    }

    public static final C85464Gi A01(C85494Gl r1, AnonymousClass4GR r2, AnonymousClass4C6 r3, AnonymousClass20D r4) {
        AnonymousClass460 r0 = new AnonymousClass460(AnonymousClass348.A01(r1, r3));
        r0.A10(r0, r2, r4);
        return r0;
    }
}
