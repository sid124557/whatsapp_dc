package X;

/* renamed from: X.2YU  reason: invalid class name */
public class AnonymousClass2YU {
    public final String A00;
    public final String A01;

    public AnonymousClass2YU(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EncFileInfo{remotePath='");
        char A012 = C18300x5.A01(this.A01, A0o);
        A0o.append(", ivBase64='");
        A0o.append(this.A00);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
