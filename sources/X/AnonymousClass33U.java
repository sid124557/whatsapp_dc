package X;

/* renamed from: X.33U  reason: invalid class name */
public class AnonymousClass33U {
    public final C84384Cd A00;
    public final C46352bU A01;
    public final C56982ss A02;
    public final C56892sj A03;
    public final AnonymousClass4FV A04;
    public final String A05 = C18280x3.A0Y();

    public static Integer A00(int i) {
        if (i != 1) {
            if (i == 3) {
                return 4;
            }
            int i2 = 5;
            if (i != 4) {
                if (i == 5) {
                    return AnonymousClass0x7.A0g();
                }
                i2 = 6;
                if (i != 6) {
                    if (i == 9) {
                        return 1;
                    }
                    if (i != 10) {
                        return null;
                    }
                }
            }
            return Integer.valueOf(i2);
        }
        return C18280x3.A0S();
    }

    public static final Integer A01(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public void A02(int i, int i2, int i3) {
        C46352bU r0 = this.A01;
        String A002 = r0.A00();
        Integer num = r0.A02;
        if (i > 0) {
            A08(C18290x4.A0c(), Integer.valueOf(i3), num, AnonymousClass0x9.A0m(i), A002);
        }
        if (i2 > 0) {
            A08(C18290x4.A0d(), Integer.valueOf(i3), num, AnonymousClass0x9.A0m(i2), A002);
        }
        A08(AnonymousClass0x7.A0g(), Integer.valueOf(i3), num, (Long) null, A002);
    }

    public void A07(C27991fJ r4, int i) {
        AnonymousClass1YC r1 = new AnonymousClass1YC();
        r1.A02 = r4.user;
        r1.A01 = 1;
        r1.A00 = Integer.valueOf(i);
        this.A04.BhD(r1);
    }

    public void A08(Integer num, Integer num2, Integer num3, Long l, String str) {
        C24931Zh r1 = new C24931Zh();
        r1.A04 = str;
        r1.A01 = num2;
        r1.A02 = num3;
        r1.A00 = num;
        r1.A03 = l;
        r1.A05 = null;
        this.A04.BhA(r1);
    }

    public final void A03(int i, int i2, int i3) {
        C24961Zk r1 = new C24961Zk();
        r1.A05 = this.A05;
        r1.A00 = Integer.valueOf(i);
        r1.A03 = Integer.valueOf(i3);
        r1.A01 = Integer.valueOf(i2);
        this.A04.BhD(r1);
    }

    public final void A04(int i, int i2, long j, int i3) {
        C24961Zk r1 = new C24961Zk();
        r1.A05 = this.A05;
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A03 = Integer.valueOf(i3);
        r1.A04 = Long.valueOf(j);
        this.A04.BhD(r1);
    }

    public AnonymousClass33U(C84384Cd r2, C46352bU r3, C56982ss r4, C56892sj r5, AnonymousClass4FV r6) {
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public void A05(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A04(11, A002.intValue(), j, A012.intValue());
        }
    }

    public void A06(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A04(10, A002.intValue(), j, A012.intValue());
        }
    }
}
