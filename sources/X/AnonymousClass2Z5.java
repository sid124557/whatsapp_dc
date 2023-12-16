package X;

/* renamed from: X.2Z5  reason: invalid class name */
public final class AnonymousClass2Z5 {
    public final AnonymousClass30P A00;
    public final C49292gI A01;

    public final void A00(AnonymousClass4EJ r6) {
        C49292gI r1 = this.A01;
        if (C56612sH.A02(r1.A01) > AnonymousClass0x2.A0B(r1.A00(), "pref_ping_validity_time")) {
            AnonymousClass30P r3 = this.A00;
            C60272yH A012 = r3.A01(AnonymousClass2BX.A00);
            if (A012 == null) {
                C18320x8.A1C(r6, "user does not exist");
            } else {
                r3.A02(A012, new C85974Ii(r6, 6), C54662p5.A00());
            }
        } else {
            r6.Bd3(this.A00.A01(AnonymousClass2BX.A00));
        }
    }

    public AnonymousClass2Z5(AnonymousClass30P r1, C49292gI r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
