package X;

/* renamed from: X.3GK  reason: invalid class name */
public final class AnonymousClass3GK implements C836849j {
    public final AnonymousClass33p A00;
    public final C49842hB A01;

    public AnonymousClass3GK(AnonymousClass33p r2, C49842hB r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void BYP(C134256ih r4) {
        int i;
        C162457s7.A0J(r4, 0);
        if (this.A01.A00()) {
            AnonymousClass33p r2 = this.A00;
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r2), "settings_verification_email_address");
            if (A0Z == null || A0Z.length() == 0) {
                i = 1;
            } else {
                int i2 = 2;
                if (C18280x3.A1W(AnonymousClass0x2.A0F(r2), "settings_verification_email_address_verified")) {
                    i2 = 3;
                }
                i = Integer.valueOf(i2);
            }
        } else {
            i = null;
        }
        r4.A0e = i;
    }
}
