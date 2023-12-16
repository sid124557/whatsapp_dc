package X;

import java.util.List;

/* renamed from: X.5QF  reason: invalid class name */
public final class AnonymousClass5QF {
    public final C56892sj A00;
    public final C56112rR A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass30N A03;

    public final void A00(int i, int i2) {
        AnonymousClass1XD r1 = new AnonymousClass1XD();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        this.A02.BhD(r1);
    }

    public final void A01(List list, int i, int i2, int i3, int i4, int i5) {
        long j;
        C94854sB r3 = new C94854sB();
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 6) {
            i6 = 2;
        }
        r3.A00 = Integer.valueOf(i6);
        r3.A01 = Integer.valueOf(i);
        if (i2 == -1) {
            j = 0;
        } else {
            j = (long) i2;
        }
        r3.A03 = Long.valueOf(j);
        if (list != null) {
            r3.A02 = AnonymousClass0x9.A0m(list.size());
            int i7 = 0;
            for (Object obj : list) {
                if (obj instanceof C27991fJ) {
                    i7++;
                }
            }
            r3.A04 = AnonymousClass0x9.A0m(i7);
            r3.A06 = AnonymousClass0x9.A0m(i4);
            r3.A05 = AnonymousClass0x9.A0m(i3);
        }
        this.A02.BhD(r3);
    }

    public AnonymousClass5QF(C56892sj r1, C56112rR r2, AnonymousClass4FV r3, AnonymousClass30N r4) {
        C18260x0.A0c(r3, r4, r1, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
