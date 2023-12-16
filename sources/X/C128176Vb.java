package X;

/* renamed from: X.6Vb  reason: invalid class name and case insensitive filesystem */
public class C128176Vb extends AnonymousClass8AY {
    public C128166Va A00;
    public boolean A01 = false;
    public final C128166Va A02;

    public void A00() {
        if (this.A01) {
            C128166Va r2 = (C128166Va) this.A00.A06(4);
            AnonymousClass6C8.A0Y(r2).Btq(r2, this.A00);
            this.A00 = r2;
            this.A01 = false;
        }
    }

    public final /* synthetic */ C187818xr Btj() {
        return this.A02;
    }

    public /* synthetic */ C187818xr Btk() {
        if (!this.A01) {
            C128166Va r1 = this.A00;
            AnonymousClass6C8.A0Y(r1).Btp(r1);
            this.A01 = true;
        }
        return this.A00;
    }

    public /* synthetic */ Object clone() {
        C128176Vb r3 = (C128176Vb) this.A02.A06(5);
        r3.A00();
        C128166Va r1 = r3.A00;
        AnonymousClass6C8.A0Y(r1).Btq(r1, (C128166Va) Btk());
        return r3;
    }

    public C128176Vb(C128166Va r2) {
        this.A02 = r2;
        this.A00 = (C128166Va) r2.A06(4);
    }
}
