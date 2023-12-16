package X;

import java.util.List;

/* renamed from: X.2mx  reason: invalid class name and case insensitive filesystem */
public final class C53352mx {
    public final C53862nn A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53352mx) {
                C53352mx r5 = (C53352mx) obj;
                if (this.A04 != r5.A04 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A02, AnonymousClass0x9.A04(this.A04)))) + AnonymousClass000.A07(this.A00);
    }

    public C53352mx(C53862nn r1, List list, List list2, List list3, boolean z) {
        this.A04 = z;
        this.A02 = list;
        this.A01 = list2;
        this.A03 = list3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EligibilityCheckResult(isAccountLinked=");
        A0o.append(this.A04);
        A0o.append(", destinationList=");
        A0o.append(this.A02);
        A0o.append(", crosspostedStateList=");
        A0o.append(this.A01);
        A0o.append(", uniqueIdList=");
        A0o.append(this.A03);
        A0o.append(", purposeEncryptionParams=");
        return C18260x0.A04(this.A00, A0o);
    }
}
