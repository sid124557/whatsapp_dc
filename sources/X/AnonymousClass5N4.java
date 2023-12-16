package X;

/* renamed from: X.5N4  reason: invalid class name */
public final class AnonymousClass5N4 {
    public final C29441ip A00;
    public final C186568vZ A01;

    public final String A00() {
        int A002 = C60132y3.A00(this.A00.A0A());
        if (A002 == 0) {
            return "2G";
        }
        if (A002 == 1) {
            return "3G";
        }
        if (A002 == 2) {
            return "4G";
        }
        if (A002 == 3) {
            return "5G";
        }
        if (A002 != 4) {
            return "UNKNOWN";
        }
        return "WIFI";
    }

    public AnonymousClass5N4(C29441ip r1, C186568vZ r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
