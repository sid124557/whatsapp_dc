package X;

/* renamed from: X.9VT  reason: invalid class name */
public class AnonymousClass9VT {
    public static final C1904696w A0F = new C1904696w(5);
    public static final C1904696w A0G = new C1904696w(3);
    public static final C1904696w A0H = new C1904696w(2);
    public static final C1904696w A0I = new C1904696w(4);
    public static final AnonymousClass9N3 A0J = new AnonymousClass9N3(7);
    public static final AnonymousClass9N3 A0K = new AnonymousClass9N3(0);
    public static final AnonymousClass9N3 A0L = new AnonymousClass9N3(6);
    public static final AnonymousClass9N3 A0M = new AnonymousClass9N3(17);
    public static final AnonymousClass9N3 A0N = new AnonymousClass9N3(12);
    public static final AnonymousClass9N3 A0O = new AnonymousClass9N3(13);
    public static final AnonymousClass9N3 A0P = new AnonymousClass9N3(14);
    public static final AnonymousClass9N3 A0Q = new AnonymousClass9N3(15);
    public static final AnonymousClass9N3 A0R = new AnonymousClass9N3(8);
    public static final String A0S = AnonymousClass9KW.class.getSimpleName();
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final boolean A0E;

    public Object A00(C1904696w r4) {
        int i;
        int i2 = r4.A00;
        if (i2 == 2) {
            i = this.A07;
        } else if (i2 == 3) {
            i = this.A06;
        } else if (i2 == 4) {
            i = this.A08;
        } else if (i2 == 5) {
            i = this.A05;
        } else {
            throw C1899593h.A0Y("Invalid required video capture result key: ", AnonymousClass001.A0o(), i2);
        }
        return Integer.valueOf(i);
    }

    public Object A01(AnonymousClass9N3 r4) {
        long j;
        int i = r4.A00;
        if (i == 0) {
            return this.A0D;
        }
        if (i == 1) {
            return null;
        }
        switch (i) {
            case 6:
                return Boolean.valueOf(this.A0E);
            case 7:
                return Integer.valueOf(this.A04);
            case 8:
                return Integer.valueOf(this.A09);
            case 9:
                return this.A0A;
            case 10:
                return this.A0B;
            case 11:
                return this.A0C;
            case 12:
                j = this.A00;
                break;
            case 13:
                j = this.A01;
                break;
            case 14:
                j = this.A02;
                break;
            case 15:
                j = this.A03;
                break;
            case 16:
            case 17:
                return null;
            default:
                throw C1899593h.A0Y("Invalid required video capture result key: ", AnonymousClass001.A0o(), i);
        }
        return Long.valueOf(j);
    }

    public void A02(AnonymousClass9N3 r6, Object obj) {
        String str;
        String str2;
        switch (r6.A00) {
            case 12:
                if (this.A00 != -1) {
                    str = A0S;
                    str2 = "Start request time was already set, cannot set it again";
                    break;
                } else {
                    this.A00 = C18310x6.A0B(obj);
                    return;
                }
            case 13:
                if (this.A01 != -1) {
                    str = A0S;
                    str2 = "Start time was already set, cannot set it again";
                    break;
                } else {
                    this.A01 = C18310x6.A0B(obj);
                    return;
                }
            case 14:
                if (this.A02 != -1) {
                    str = A0S;
                    str2 = "Stop request time was already set, cannot set it again";
                    break;
                } else {
                    this.A02 = C18310x6.A0B(obj);
                    return;
                }
            default:
                if (this.A03 != -1) {
                    str = A0S;
                    str2 = "Stop time was already set, cannot set it again";
                    break;
                } else {
                    this.A03 = C18310x6.A0B(obj);
                    return;
                }
        }
        AnonymousClass9WT.A01(str, str2);
    }

    public AnonymousClass9VT(AnonymousClass9S5 r3) {
        String str = r3.A0B;
        if (str == null) {
            throw AnonymousClass001.A0c("one of file path or FileDescriptor must be set");
        }
        this.A0D = str;
        this.A07 = r3.A03;
        this.A06 = r3.A02;
        this.A08 = r3.A04;
        this.A05 = r3.A01;
        this.A0E = true;
        this.A04 = r3.A00;
        this.A09 = r3.A05;
        this.A0A = r3.A08;
        this.A0B = r3.A09;
        this.A0C = r3.A0A;
        this.A00 = r3.A06;
        this.A01 = r3.A07;
        this.A02 = -1;
        this.A03 = -1;
    }
}
