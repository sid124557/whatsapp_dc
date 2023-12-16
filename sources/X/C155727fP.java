package X;

/* renamed from: X.7fP  reason: invalid class name and case insensitive filesystem */
public final class C155727fP {
    public final String A00;

    public static C155727fP A00(C161467pi r5) {
        String str;
        int A02 = C161467pi.A02(r5, 2);
        int i = A02 >> 1;
        int A0C = ((r5.A0C() >> 3) & 31) | ((A02 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        String str2 = ".0";
        A0l.append(str2);
        A0l.append(i);
        if (A0C >= 10) {
            str2 = ".";
        }
        return new C155727fP(AnonymousClass000.A0Y(str2, A0l, A0C));
    }

    public C155727fP(String str) {
        this.A00 = str;
    }
}
