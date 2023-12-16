package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2kx  reason: invalid class name and case insensitive filesystem */
public final class C52142kx {
    public String A00 = null;
    public String A01 = null;
    public List A02;

    public C52142kx() {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A02 = A0s;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52142kx) {
                C52142kx r5 = (C52142kx) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, ((C18270x1.A00(this.A00) * 31) + AnonymousClass0x7.A07(this.A01)) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Builder(searchabilityIntent=");
        A0o.append(this.A00);
        A0o.append(", searchabilityStatus=");
        A0o.append(this.A01);
        A0o.append(", issues=");
        A0o.append(this.A02);
        A0o.append(", isProfileEditDisabled=");
        return C18260x0.A0A(A0o, false);
    }
}
