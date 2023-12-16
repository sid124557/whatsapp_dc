package X;

/* renamed from: X.2fX  reason: invalid class name and case insensitive filesystem */
public class C48822fX {
    public final String A00;
    public final C52122kv A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C48822fX)) {
            return false;
        }
        C48822fX r4 = (C48822fX) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public C48822fX(String str, C52122kv r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
