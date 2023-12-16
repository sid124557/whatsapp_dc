package X;

/* renamed from: X.7Xz  reason: invalid class name and case insensitive filesystem */
public final class C152207Xz {
    public final Object A00;
    public final String A01;

    public C152207Xz(String str, Object obj) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152207Xz) {
                C152207Xz r5 = (C152207Xz) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksTreeManagerVariableUpdate(variableIdentifier=");
        A0o.append(this.A01);
        A0o.append(", value=");
        return C18260x0.A04(this.A00, A0o);
    }
}
