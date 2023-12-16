package X;

/* renamed from: X.7jv  reason: invalid class name and case insensitive filesystem */
public final class C158407jv {
    public static final C158407jv A02 = new C158407jv(0, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158407jv.class != obj.getClass()) {
                return false;
            }
            C158407jv r7 = (C158407jv) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C158407jv(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[timeUs=");
        A0o.append(this.A01);
        A0o.append(", position=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }
}
