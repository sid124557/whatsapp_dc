package X;

import java.util.Locale;

/* renamed from: X.9bN  reason: invalid class name */
public class AnonymousClass9bN implements AnonymousClass4EY {
    public int A00 = 0;
    public final /* synthetic */ C185728u9 A01;
    public final /* synthetic */ AnonymousClass9QG A02;

    public AnonymousClass9bN(C185728u9 r2, AnonymousClass9QG r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00() {
        int i = this.A00;
        AnonymousClass9QG r0 = this.A02;
        if (i < 3) {
            r0.A0B.A08(this);
            this.A00++;
            return;
        }
        C160757oG r3 = r0.A0E;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, i);
        r3.A05(String.format(locale, "AccountRecoveryNotification: sendGetPaymentMethods retry failed, attempts made: %d", objArr));
    }

    public void Ba4(AnonymousClass34V r3) {
        this.A02.A0E.A05("AccountRecoveryNotification: sendGetPaymentMethods request error");
        A00();
    }

    public void BaB(AnonymousClass34V r3) {
        this.A02.A0E.A05("AccountRecoveryNotification: sendGetPaymentMethods response error");
        A00();
    }

    public void BaC(AnonymousClass2Oi r4) {
        AnonymousClass9QG r2 = this.A02;
        r2.A0E.A06("AccountRecoveryNotification: sendGetPaymentMethods success");
        AnonymousClass9U4 r22 = r2.A0D;
        AnonymousClass8EA A03 = AnonymousClass9U4.A03(r22);
        if (A03 != null) {
            r22.A0J();
            if (A03.A06() != null) {
                r22.A0J();
                C166587yw A06 = A03.A06();
                if (A06 != null) {
                    C185728u9 r23 = this.A01;
                    r23.Brs(A06.A08);
                    r23.B1N((String) null, false);
                }
            }
        }
    }
}
