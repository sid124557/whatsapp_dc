package X;

/* renamed from: X.7Vd  reason: invalid class name and case insensitive filesystem */
public final class C151527Vd {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C151527Vd)) {
            return false;
        }
        C151527Vd r7 = (C151527Vd) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C151527Vd(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
