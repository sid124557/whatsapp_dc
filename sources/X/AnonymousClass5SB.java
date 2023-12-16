package X;

/* renamed from: X.5SB  reason: invalid class name */
public final class AnonymousClass5SB {
    public final AnonymousClass5RQ A00;
    public final AnonymousClass5RQ A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SB) {
                AnonymousClass5SB r5 = (AnonymousClass5SB) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A07(this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public AnonymousClass5SB(AnonymousClass5RQ r1, AnonymousClass5RQ r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkedAccountMediaResponse(fbLinkedAccountMedia=");
        A0o.append(this.A00);
        A0o.append(", igLinkedAccountMedia=");
        A0o.append(this.A01);
        A0o.append(", igAccountName=");
        return C18260x0.A07(this.A02, A0o);
    }
}
