package X;

/* renamed from: X.9Rb  reason: invalid class name and case insensitive filesystem */
public class C193969Rb {
    public final AnonymousClass36F A00;
    public final C620933l A01;
    public final C1907099n A02;
    public final AnonymousClass4FS A03;

    public boolean A00() {
        if (this.A02.A02.A0X(2055)) {
            C620933l r2 = this.A01;
            if (r2.A03().contains("payments_has_unseen_requests")) {
                boolean z = r2.A03().getBoolean("payments_has_unseen_requests", false);
                if (Boolean.valueOf(z) != null) {
                    return z;
                }
            }
            this.A03.BkM(new C199769hD(this));
        }
        return false;
    }

    public C193969Rb(AnonymousClass36F r1, C620933l r2, C1907099n r3, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
