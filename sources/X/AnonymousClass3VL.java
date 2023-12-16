package X;

/* renamed from: X.3VL  reason: invalid class name */
public final class AnonymousClass3VL implements AnonymousClass4BS, AnonymousClass4BT, AnonymousClass4BU, AnonymousClass4G2 {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public void B3F(C624134x r2) {
        C162457s7.A0J(r2, 0);
        ((C55762qs) this.A02.get()).A03((C30391mN) r2);
    }

    public void BGd(C624134x r6) {
        long A012;
        C30391mN r2;
        C162457s7.A0J(r6, 0);
        C30391mN r62 = (C30391mN) r6;
        if (!r62.A07) {
            AnonymousClass2z0 r4 = r62.A1J;
            boolean z = r4.A02;
            C55762qs r22 = (C55762qs) this.A02.get();
            C27991fJ r1 = r62.A02;
            if (!z) {
                A012 = r22.A00(r1, r62.A03);
            } else {
                A012 = r22.A01(r1, AnonymousClass32Y.A05(r4.A00));
            }
            if (!(A012 == -1 || (r2 = (C30391mN) C55122pp.A00((C55832qz) this.A01.get(), A012)) == null)) {
                r2.A07 = true;
                AnonymousClass0x9.A0M(this.A00).A0b(r2, 21);
            }
        }
        ((C55762qs) this.A02.get()).A04(r62);
    }

    public void BrV(C624134x r2) {
        C162457s7.A0J(r2, 0);
        ((C55762qs) this.A02.get()).A04((C30391mN) r2);
    }

    public AnonymousClass3VL(C183538qC r1, C183538qC r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
