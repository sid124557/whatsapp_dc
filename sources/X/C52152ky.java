package X;

/* renamed from: X.2ky  reason: invalid class name and case insensitive filesystem */
public class C52152ky {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C52152ky)) {
            return false;
        }
        C52152ky r7 = (C52152ky) obj;
        if (this.A02.equals(r7.A02) && this.A00 == r7.A00 && this.A01 == r7.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A09 = C18310x6.A09(this.A02);
        int i = this.A00;
        return AnonymousClass0x2.A00((A09 + (i ^ (i >>> 32))) * 31, this.A01);
    }

    public C52152ky(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append(":");
        A0o.append(this.A00);
        A0o.append(":");
        A0o.append(this.A01);
        return AnonymousClass000.A0X(";", A0o);
    }
}
