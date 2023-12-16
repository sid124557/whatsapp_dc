package X;

import com.whatsapp.util.Log;

/* renamed from: X.5XC  reason: invalid class name */
public final class AnonymousClass5XC {
    public static final AnonymousClass5ZC A09 = new AnonymousClass5ZC(20, 1000);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C614930z A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass4FV A08;

    public final void A00(int i, int i2) {
        if (i != 0) {
            C94594rb r1 = new C94594rb();
            r1.A01 = Integer.valueOf(i);
            r1.A00 = Integer.valueOf(i2);
            C94594rb.A00(this, r1);
            A01(r1);
            return;
        }
        Log.i("AccountSwitchingLogger/populateAndLogAccountSwitchingAction/action or source is invalid");
    }

    public AnonymousClass5XC(C614930z r1, C56612sH r2, AnonymousClass33p r3, AnonymousClass4FV r4) {
        C18260x0.A0c(r2, r4, r1, r3);
        this.A06 = r2;
        this.A08 = r4;
        this.A05 = r1;
        this.A07 = r3;
    }

    public final void A01(C94594rb r4) {
        Integer num;
        C18260x0.A1R(AnonymousClass001.A0o(), "AccountSwitchingLogger/", r4);
        Integer num2 = r4.A01;
        if (num2 == null || num2.intValue() != 3 || (num = r4.A00) == null || num.intValue() != 15) {
            this.A08.BhD(r4);
        } else {
            this.A08.Bh7(r4, A09, false);
        }
        this.A03 = 0;
        this.A04 = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }
}
