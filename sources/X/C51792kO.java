package X;

/* renamed from: X.2kO  reason: invalid class name and case insensitive filesystem */
public class C51792kO {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51792kO)) {
            return false;
        }
        C51792kO r4 = (C51792kO) obj;
        return this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return ((this.A01.hashCode() + 31) * 31) + this.A00;
    }

    public C51792kO(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FileDownloadToken{reportType=");
        A0o.append(this.A00);
        A0o.append(", fileHash='");
        C18320x8.A1M(A0o, this.A01);
        return AnonymousClass000.A0d(A0o);
    }
}
