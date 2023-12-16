package X;

import java.util.List;

/* renamed from: X.5SO  reason: invalid class name */
public final class AnonymousClass5SO {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SO) {
                AnonymousClass5SO r5 = (AnonymousClass5SO) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || this.A03 != r5.A03 || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((C18300x5.A04(this.A01) + C18270x1.A00(this.A00)) * 31, this.A03), this.A02);
    }

    public AnonymousClass5SO(String str, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A00 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingData(inactiveAccounts=");
        A0o.append(this.A01);
        A0o.append(", paymentsOnboardedLid=");
        A0o.append(this.A00);
        A0o.append(", shownMeTabMenuItemToolTip=");
        A0o.append(this.A03);
        A0o.append(", isCompanionModeEnabled=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
