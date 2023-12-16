package X;

/* renamed from: X.2mD  reason: invalid class name and case insensitive filesystem */
public final class C52892mD {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52892mD) {
                C52892mD r8 = (C52892mD) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || this.A00 != r8.A00 || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(((C18270x1.A00(this.A03) * 31) + AnonymousClass0x7.A07(this.A02)) * 31, this.A00), this.A01);
    }

    public C52892mD(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EvolvedAbout(textStatus=");
        A0o.append(this.A03);
        A0o.append(", emoji=");
        A0o.append(this.A02);
        A0o.append(", duration=");
        A0o.append(this.A00);
        A0o.append(", timestamp=");
        return C18270x1.A0U(A0o, this.A01);
    }
}
