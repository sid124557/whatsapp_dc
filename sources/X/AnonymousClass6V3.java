package X;

/* renamed from: X.6V3  reason: invalid class name */
public class AnonymousClass6V3 extends AnonymousClass8AF {
    public AnonymousClass6V4 A00 = new AnonymousClass6VG();
    public boolean A01 = false;
    public final AnonymousClass6V4 A02;

    public final /* bridge */ /* synthetic */ Object clone() {
        AnonymousClass6VF r1 = new AnonymousClass6VF((AnonymousClass70I) null);
        A00(this);
        r1.A01(this.A00);
        return r1;
    }

    public static void A00(AnonymousClass6V3 r3) {
        if (!r3.A01) {
            AnonymousClass6V4 r2 = r3.A00;
            C157357iA.A02.A00(r2.getClass()).Bu3(r2);
            r3.A01 = true;
        }
    }

    public final void A01(AnonymousClass6V4 r5) {
        if (this.A01) {
            AnonymousClass6VG r3 = new AnonymousClass6VG();
            C157357iA.A02.A00(r3.getClass()).Bu4(r3, this.A00);
            this.A00 = r3;
            this.A01 = false;
        }
        AnonymousClass6V4 r2 = this.A00;
        C157357iA.A02.A00(r2.getClass()).Bu4(r2, r5);
    }

    public final /* synthetic */ C187798xp Bu9() {
        return this.A02;
    }

    public AnonymousClass6V3(AnonymousClass6V4 r2) {
        this.A02 = r2;
    }
}
