package X;

/* renamed from: X.1eN  reason: invalid class name and case insensitive filesystem */
public final class C27681eN extends AnonymousClass3PA {
    public final C56612sH A00;

    public C624134x A01(C50972j4 r8, AnonymousClass1ES r9, C624134x r10) {
        if (r10 instanceof C30391mN) {
            C30391mN r6 = (C30391mN) r10;
            boolean z = false;
            if (r6 != null) {
                if (r6.A01 * ((long) 1000) < this.A00.A0H()) {
                    z = true;
                }
                r6.A07 = z;
                return r10;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0T(r10, "Unexpected message type: ", A0o);
        throw AnonymousClass24W.A01(0, A0o.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27681eN(C56612sH r1, C66383Le r2) {
        super(r2);
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
    }
}
