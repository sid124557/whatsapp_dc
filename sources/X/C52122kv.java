package X;

/* renamed from: X.2kv  reason: invalid class name and case insensitive filesystem */
public class C52122kv {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C52122kv)) {
            return false;
        }
        C52122kv r4 = (C52122kv) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public C52122kv(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18290x4.A1R(A0o, this.A01);
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
