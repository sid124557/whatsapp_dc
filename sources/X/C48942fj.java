package X;

/* renamed from: X.2fj  reason: invalid class name and case insensitive filesystem */
public class C48942fj {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;

    public synchronized void A01(String str) {
        AnonymousClass33p r2 = this.A01;
        C60172y7 A002 = C60172y7.A00(C18280x3.A0Z(AnonymousClass0x2.A0F(r2), "companion_reg_with_link_code_companion_hello_info_json"));
        if (A002 != null && A002.A02.equals(str)) {
            C18260x0.A0K(r2, "companion_reg_with_link_code_companion_hello_info_json");
        }
    }

    public C60172y7 A00() {
        C60172y7 A002 = C60172y7.A00(C18280x3.A0Z(AnonymousClass0x2.A0F(this.A01), "companion_reg_with_link_code_companion_hello_info_json"));
        if (A002 == null || A002.A00 < this.A00.A0H()) {
            return null;
        }
        return A002;
    }

    public C48942fj(C56612sH r1, AnonymousClass33p r2, AnonymousClass1VX r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
