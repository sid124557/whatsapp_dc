package X;

/* renamed from: X.7ho  reason: invalid class name and case insensitive filesystem */
public abstract class C157147ho {
    public final int A00;

    public String toString() {
        return A00(this.A00);
    }

    public C157147ho(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("");
        A0o.append((char) ((i >> 24) & 255));
        A0o.append((char) ((i >> 16) & 255));
        A0o.append((char) ((i >> 8) & 255));
        return AnonymousClass001.A0j(A0o, (char) (i & 255));
    }
}
