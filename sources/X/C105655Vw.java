package X;

/* renamed from: X.5Vw  reason: invalid class name and case insensitive filesystem */
public class C105655Vw {
    public final C111095hX A00;
    public final C54292oU A01;

    public C105655Vw(C111095hX r1, C54292oU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(String str) {
        int length = str.length();
        if (length <= 96) {
            return str;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(str.substring(0, 64));
        A0o.append("…");
        return AnonymousClass000.A0X(str.substring(length - 32), A0o);
    }
}
