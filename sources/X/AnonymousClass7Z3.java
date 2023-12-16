package X;

/* renamed from: X.7Z3  reason: invalid class name */
public final class AnonymousClass7Z3 {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass7Z3.class != obj.getClass()) {
                return false;
            }
            AnonymousClass7Z3 r7 = (AnonymousClass7Z3) obj;
            if (!(this.A02 == r7.A02 && this.A01 == r7.A01 && this.A03.equals(r7.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A08 = AnonymousClass0x7.A08(this.A03, (AnonymousClass6C8.A04((int) this.A02) + ((int) this.A01)) * 31);
        this.A00 = A08;
        return A08;
    }

    public AnonymousClass7Z3(long j, String str, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RangedUri(referenceUri=");
        A0o.append(this.A03);
        A0o.append(", start=");
        A0o.append(this.A02);
        A0o.append(", length=");
        A0o.append(this.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
