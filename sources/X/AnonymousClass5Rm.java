package X;

/* renamed from: X.5Rm  reason: invalid class name */
public final class AnonymousClass5Rm {
    public final AnonymousClass7HU A00;
    public final AnonymousClass3ZH A01;

    public AnonymousClass5Rm(AnonymousClass7HU r2, AnonymousClass3ZH r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Rm) {
                AnonymousClass5Rm r5 = (AnonymousClass5Rm) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupParticipantContactAndName(contact=");
        A0o.append(this.A01);
        A0o.append(", displayNameAndType=");
        return C18260x0.A04(this.A00, A0o);
    }
}
