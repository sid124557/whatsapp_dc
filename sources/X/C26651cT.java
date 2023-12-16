package X;

/* renamed from: X.1cT  reason: invalid class name and case insensitive filesystem */
public final class C26651cT extends C27711eQ {
    public final AnonymousClass3PY A00;

    public C624134x A01(C50972j4 r5, AnonymousClass1ES r6, C624134x r7) {
        AnonymousClass4DU r2;
        int intValue;
        int i;
        super.A01(r5, r6, r7);
        if (!(r7 instanceof AnonymousClass4DU) || (r2 = (AnonymousClass4DU) r7) == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0T(r7, "Unsupported message type ", A0o);
            throw AnonymousClass24W.A01(0, A0o.toString());
        }
        boolean z = r7.A1J.A02;
        Integer A01 = AnonymousClass3PY.A01(r6);
        if (z) {
            if (A01 != null) {
                intValue = A01.intValue();
                i = 8;
            }
            return r7;
        }
        if (A01 != null) {
            intValue = A01.intValue();
            i = 9;
        }
        return r7;
        if (intValue == i) {
            r2.Bno(1);
        }
        return r7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26651cT(C55682qk r1, AnonymousClass310 r2, C66383Le r3, AnonymousClass3PY r4) {
        super(r1, r2, r3);
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r4;
    }
}
