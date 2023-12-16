package X;

import com.whatsapp.R;

/* renamed from: X.7Y0  reason: invalid class name */
public final class AnonymousClass7Y0 {
    public final C150477Qw A00;
    public final String A01;

    public AnonymousClass7Y0(C150477Qw r2, String str) {
        C162457s7.A0J(str, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y0) {
                AnonymousClass7Y0 r5 = (AnonymousClass7Y0) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x2.A07(this.A01, 1664006315));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyMessage(templateRes=");
        A0o.append(R.string.f11nameremoved);
        A0o.append(", businessName=");
        A0o.append(this.A01);
        A0o.append(", postcodeType=");
        return C18260x0.A04(this.A00, A0o);
    }
}
