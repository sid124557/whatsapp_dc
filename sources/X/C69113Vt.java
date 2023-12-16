package X;

/* renamed from: X.3Vt  reason: invalid class name and case insensitive filesystem */
public final class C69113Vt implements AnonymousClass4GG {
    public final C183538qC A00;

    public C69113Vt(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BhW(C624134x r6, C378824k r7) {
        String str;
        String str2;
        C162457s7.A0J(r6, 0);
        if ((r6.A1P & 4) == 4 || !((str2 = r6.A15) == null || str2.length() == 0)) {
            C624034w A0H = ((AnonymousClass36F) this.A00.get()).A0H(r6.A1J.A01, r6.A15, r6.A1L);
            r6.A0P = A0H;
            if (A0H == null || (str = A0H.A0K) == null) {
                str = "UNSET";
            }
            r6.A15 = str;
            if (r7 != null) {
                throw C18260x0.A02(C69113Vt.class);
            }
        }
    }
}
