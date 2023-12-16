package X;

/* renamed from: X.0hn  reason: invalid class name and case insensitive filesystem */
public abstract class C10350hn implements C182928pD {
    public final C60902zM A00;
    public final AnonymousClass4FS A01;

    public abstract C182928pD A04();

    public abstract void A05();

    public void BSG(String str, int i, int i2) {
        Long A012 = this.A00.A01();
        if ((i == 500 || i == 3) && A012 != null) {
            this.A01.Bkn(new C11360jW(this), "HsmCommandHandler/onError", A012.longValue());
            return;
        }
        A04().BSG(str, i, i2);
    }

    public C10350hn(C60902zM r1, AnonymousClass4FS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
