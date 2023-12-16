package X;

/* renamed from: X.2b7  reason: invalid class name and case insensitive filesystem */
public final class C46122b7 {
    public long A00;
    public AnonymousClass1XT A01;
    public final C56612sH A02;
    public final AnonymousClass4FV A03;

    public final void A00(int i) {
        AnonymousClass1XT r4 = this.A01;
        if (r4 != null) {
            r4.A00 = Integer.valueOf(i);
            if (this.A00 > 0 && (i == 0 || i == 1 || i == 2)) {
                r4.A01 = C18310x6.A0f(this.A02.A0H(), this.A00);
            }
            this.A03.BhD(r4);
            this.A01 = null;
        }
    }

    public C46122b7(C56612sH r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r1, r2);
        this.A02 = r1;
        this.A03 = r2;
    }
}
