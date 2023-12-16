package X;

/* renamed from: X.8Eo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C170798Eo implements C181868nT {
    public final /* synthetic */ C185018sv A00;
    public final /* synthetic */ C90524hb A01;
    public final /* synthetic */ C184108rG A02;

    public final void BZF(long j) {
        AnonymousClass7KJ r0;
        String str;
        String str2;
        C185018sv r1 = this.A00;
        C90524hb r3 = this.A01;
        C184108rG r4 = this.A02;
        C162457s7.A0J(r1, 0);
        C18260x0.A0Q(r3, r4);
        int i = r3.A06;
        if (i == -1) {
            i = r3.A05;
        }
        C109015dw BBi = r1.BBi(i);
        if (BBi != null) {
            C181828nP r12 = r3.A01;
            String str3 = null;
            if (r12 != null) {
                int i2 = r3.A06;
                if (i2 == -1) {
                    i2 = r3.A05;
                }
                r0 = r12.B5f(i2);
            } else {
                r0 = null;
            }
            int i3 = r3.A06;
            if (i3 == -1) {
                i3 = r3.A05;
            }
            if (r0 != null) {
                str3 = r0.A01;
                str = r0.A02;
                str2 = r0.A00;
            } else {
                str = null;
                str2 = null;
            }
            r4.BZG(BBi, str3, str, str2, i3, j);
        }
    }

    public /* synthetic */ C170798Eo(C185018sv r1, C90524hb r2, C184108rG r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
