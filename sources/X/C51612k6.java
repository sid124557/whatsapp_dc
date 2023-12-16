package X;

/* renamed from: X.2k6  reason: invalid class name and case insensitive filesystem */
public final class C51612k6 {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51612k6) {
                C51612k6 r8 = (C51612k6) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A02(this.A01), this.A00);
    }

    public C51612k6(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterEditMetaNode(newsletterOriginalMessageMs=");
        A0o.append(this.A01);
        A0o.append(", newsletterMessageEditMs=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
