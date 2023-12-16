package X;

/* renamed from: X.7nC  reason: invalid class name and case insensitive filesystem */
public abstract class C160197nC {
    public final int A00;

    static {
        int length = "xml ".length();
        C159197lM.A01(AnonymousClass6C8.A1P(length, 4));
        for (int i = 0; i < length; i++) {
            "xml ".charAt(i);
        }
    }

    public String toString() {
        return A00(this.A00);
    }

    public C160197nC(int i) {
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
