package X;

/* renamed from: X.5Re  reason: invalid class name and case insensitive filesystem */
public final class C104495Re {
    public int A00;
    public AnonymousClass4GP A01;

    public C104495Re(AnonymousClass4GP r2, int i) {
        C162457s7.A0J(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104495Re) {
                C104495Re r5 = (C104495Re) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewAllSubgroupsUiState(extraGroupsCount=");
        A0o.append(this.A00);
        A0o.append(", onClick=");
        return C18260x0.A04(this.A01, A0o);
    }
}
