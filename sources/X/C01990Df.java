package X;

/* renamed from: X.0Df  reason: invalid class name and case insensitive filesystem */
public class C01990Df extends C10350hn implements C188058yF {
    public final C188058yF A00;
    public final C161767qP A01;

    public C182928pD A04() {
        return this.A00;
    }

    public void A05() {
        this.A01.A09(this);
    }

    public void BSG(String str, int i, int i2) {
        Long A012 = this.A00.A01();
        if ((i == 500 || i == 3) && A012 != null) {
            this.A01.Bkn(new C11350jV(this), "DeleteAccountHandler/onError", A012.longValue());
            return;
        }
        this.A00.BSG(str, i, i2);
    }

    public void onSuccess() {
        this.A00.A02();
        this.A00.onSuccess();
    }

    public C01990Df(C188058yF r1, C161767qP r2, C60902zM r3, AnonymousClass4FS r4) {
        super(r3, r4);
        this.A01 = r2;
        this.A00 = r1;
    }
}
