package X;

/* renamed from: X.5SR  reason: invalid class name */
public final class AnonymousClass5SR {
    public final int A00;
    public final AnonymousClass20T A01;
    public final C27991fJ A02;
    public final AnonymousClass4GQ A03;

    public AnonymousClass5SR(AnonymousClass20T r2, C27991fJ r3, AnonymousClass4GQ r4, int i) {
        C18270x1.A11(r3, 1, r2);
        this.A02 = r3;
        this.A00 = i;
        this.A03 = r4;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SR) {
                AnonymousClass5SR r5 = (AnonymousClass5SR) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A03, (C18300x5.A04(this.A02) + this.A00) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MemberSuggestedGroupsUiState(parentJid=");
        A0o.append(this.A02);
        A0o.append(", suggestedGroupsCount=");
        A0o.append(this.A00);
        A0o.append(", onClick=");
        A0o.append(this.A03);
        A0o.append(", viewMode=");
        return C18260x0.A04(this.A01, A0o);
    }
}
