package X;

import java.util.List;

/* renamed from: X.3Sy  reason: invalid class name and case insensitive filesystem */
public final class C68383Sy implements AnonymousClass4EZ {
    public final C29441ip A00;
    public final AnonymousClass31C A01;
    public final AnonymousClass5I2 A02;
    public final List A03;

    public void BQs(String str) {
        this.A02.A00.A0A.A02();
    }

    public void BdM(AnonymousClass36K r3, String str) {
        C69183Wa r1 = this.A02.A00;
        r1.A00 = null;
        r1.A0A.A02();
    }

    public C68383Sy(C29441ip r1, AnonymousClass31C r2, AnonymousClass5I2 r3, List list) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }

    public void BSN(AnonymousClass36K r6, String str) {
        Long A012;
        int A002 = C57492tj.A00(r6);
        if (A002 > 0) {
            AnonymousClass5I2 r2 = this.A02;
            C69183Wa r3 = r2.A00;
            C60902zM r1 = r3.A0A;
            if (A002 != 500 || (A012 = r1.A01()) == null) {
                r1.A02();
            } else {
                r3.A02(r2.A01, A012.longValue());
            }
        } else {
            this.A02.A00.A0A.A02();
        }
    }
}
