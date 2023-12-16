package X;

import java.util.Random;

/* renamed from: X.5Sj  reason: invalid class name and case insensitive filesystem */
public class C104795Sj {
    public Integer A00 = null;
    public String A01;
    public Random A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;

    public void A01(int i, long j, long j2) {
        Integer num;
        if (i == 1 || (num = this.A00) == null || num.intValue() != 4) {
            C95074sa r1 = new C95074sa();
            r1.A01 = 4;
            r1.A06 = Long.valueOf(j);
            r1.A08 = Long.valueOf(j2);
            r1.A04 = Integer.valueOf(i);
            A02(r1);
        }
    }

    public void A00(int i) {
        C95074sa r1 = new C95074sa();
        r1.A01 = Integer.valueOf(i);
        r1.A03 = C18290x4.A0Z();
        A02(r1);
    }

    public C104795Sj(AnonymousClass1VX r2, AnonymousClass4FV r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public final void A02(C95074sa r2) {
        r2.A02 = C18290x4.A0Z();
        r2.A0A = this.A01;
        this.A04.BhD(r2);
        this.A00 = r2.A01;
    }
}
