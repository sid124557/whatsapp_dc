package X;

import java.util.List;

/* renamed from: X.2ly  reason: invalid class name and case insensitive filesystem */
public final class C52742ly {
    public final C53872no A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52742ly) {
                C52742ly r5 = (C52742ly) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A01, C18300x5.A04(this.A02)));
    }

    public C52742ly(C53872no r1, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostEligibilityCheckResult(enforcedEncryptedUniqueIdList=");
        A0o.append(this.A02);
        A0o.append(", crosspostedStateList=");
        A0o.append(this.A01);
        A0o.append(", purposeEncryptionParams=");
        return C18260x0.A04(this.A00, A0o);
    }
}
