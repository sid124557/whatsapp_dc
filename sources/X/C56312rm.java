package X;

/* renamed from: X.2rm  reason: invalid class name and case insensitive filesystem */
public final class C56312rm {
    public final AnonymousClass1VX A00;
    public final C60152y5 A01;

    public final String A00() {
        return C18280x3.A0Z(this.A01.A03("user_proxy_setting_pref"), "proxy_ip_address");
    }

    public final void A01(int i) {
        C18270x1.A0h(C60152y5.A00(this.A01, "user_proxy_setting_pref"), "proxy_media_connection_status", i);
    }

    public final void A02(int i) {
        C18270x1.A0h(C60152y5.A00(this.A01, "user_proxy_setting_pref"), "proxy_connection_status", i);
    }

    public final void A03(String str) {
        C18270x1.A0j(C60152y5.A00(this.A01, "user_proxy_setting_pref"), "proxy_ip_address", str);
    }

    public final void A04(boolean z) {
        C18270x1.A0l(C60152y5.A00(this.A01, "user_proxy_setting_pref"), "proxy_enabled", z);
    }

    public final boolean A05() {
        if (!this.A01.A03("user_proxy_setting_pref").getBoolean("proxy_enabled", false)) {
            return false;
        }
        AnonymousClass1VX r2 = this.A00;
        if (r2.A0Y(C58422vE.A02, 2784) || r2.A0Y(C58422vE.A01, 3641)) {
            return true;
        }
        return false;
    }

    public C56312rm(AnonymousClass1VX r1, C60152y5 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A06() {
        if (!A05() || !C106585Zo.A01(A00())) {
            return false;
        }
        return true;
    }
}
