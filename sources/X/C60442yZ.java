package X;

/* renamed from: X.2yZ  reason: invalid class name and case insensitive filesystem */
public final class C60442yZ {
    public final C56312rm A00;

    public final C60962zS A00() {
        C60962zS A002;
        C56312rm r1 = this.A00;
        if (!r1.A05() || (A002 = C385528d.A00(r1, r1.A00())) == null || (!C106585Zo.A00(A002.A05) && !C106585Zo.A01(A002.A02))) {
            return null;
        }
        return A002;
    }

    public final void A01(C60962zS r6) {
        if (r6 == null) {
            return;
        }
        if (C106585Zo.A00(r6.A05) || C106585Zo.A01(r6.A02)) {
            C56312rm r1 = this.A00;
            r1.A03(r6.A04);
            int i = r6.A01;
            C60152y5 r4 = r1.A01;
            C18270x1.A0h(C60152y5.A00(r4, "user_proxy_setting_pref"), "proxy_media_port", i);
            C18270x1.A0l(C60152y5.A00(r4, "user_proxy_setting_pref"), "proxy_use_tls", r6.A06);
        }
    }

    public C60442yZ(C56312rm r1) {
        this.A00 = r1;
    }
}
