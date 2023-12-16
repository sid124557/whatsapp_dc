package X;

/* renamed from: X.5Rf  reason: invalid class name and case insensitive filesystem */
public final class C104505Rf {
    public AnonymousClass4GP A00;
    public boolean A01;

    public C104505Rf(AnonymousClass4GP r2, boolean z) {
        C162457s7.A0J(r2, 2);
        this.A01 = z;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104505Rf) {
                C104505Rf r5 = (C104505Rf) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x9.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewArchivedSubgroupsUiState(expanded=");
        A0o.append(this.A01);
        A0o.append(", onClick=");
        return C18260x0.A04(this.A00, A0o);
    }
}
