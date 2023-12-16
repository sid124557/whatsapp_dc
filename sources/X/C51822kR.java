package X;

/* renamed from: X.2kR  reason: invalid class name and case insensitive filesystem */
public final class C51822kR {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51822kR) {
                C51822kR r5 = (C51822kR) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, this.A00 * 31);
    }

    public C51822kR(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CtwaConversionData(ctwaConversionSource=");
        A0o.append(this.A00);
        A0o.append(", ctwaConversionData=");
        return C18260x0.A07(this.A01, A0o);
    }
}
