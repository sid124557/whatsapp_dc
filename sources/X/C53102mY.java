package X;

import java.util.List;

/* renamed from: X.2mY  reason: invalid class name and case insensitive filesystem */
public final class C53102mY {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53102mY) {
                C53102mY r5 = (C53102mY) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A02, C18300x5.A04(this.A03))));
    }

    public C53102mY(List list, List list2, List list3, List list4) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        this.A00 = list4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestResult(enforcedEncryptedSuccessUniqueIds=");
        A0o.append(this.A03);
        A0o.append(", enforcedEncryptedFailureUnknownIds=");
        A0o.append(this.A02);
        A0o.append(", enforcedEncryptedFailureDuplicateIds=");
        A0o.append(this.A01);
        A0o.append(", enforcedEncryptedFailureAlreadySharedIds=");
        return C18260x0.A04(this.A00, A0o);
    }
}
