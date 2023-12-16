package X;

/* renamed from: X.9k4  reason: invalid class name */
public class AnonymousClass9k4 implements Runnable {
    public final /* synthetic */ C195639Yw A00;
    public final /* synthetic */ AnonymousClass9QB A01;
    public final /* synthetic */ AnonymousClass9QN A02;
    public final /* synthetic */ C202879mj A03;
    public final /* synthetic */ C192529Kl A04;
    public final /* synthetic */ C195349Xk A05;
    public final /* synthetic */ AnonymousClass32L A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass9k4(C195639Yw r1, AnonymousClass9QB r2, AnonymousClass9QN r3, C202879mj r4, C192529Kl r5, C195349Xk r6, AnonymousClass32L r7, boolean z) {
        this.A00 = r1;
        this.A07 = z;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void run() {
        AnonymousClass32L r6;
        C194509Te r5;
        if (!this.A07) {
            r5 = null;
            r6 = this.A06;
            if (!r6.A02) {
                C195639Yw.A01(this.A00, this.A03, this.A05, r6, AnonymousClass001.A0e("Non prefetch request should have effect available."));
                return;
            }
        } else {
            AnonymousClass9QB r1 = this.A01;
            AnonymousClass9SI r7 = r1.A00;
            AnonymousClass9QT r4 = r1.A01;
            if (r4 == null) {
                r4 = new AnonymousClass9QT(AnonymousClass001.A0t());
            }
            C193219Np r3 = r1.A02;
            r6 = this.A06;
            String str = r6.A01;
            String str2 = r6.A00;
            r5 = new C194509Te(r7, r4);
            if (r3 != null) {
                r5.A04.add(r3);
            }
            r5.A01 = str;
            r5.A02 = str2;
        }
        C195639Yw r42 = this.A00;
        r42.A06.A01(this.A01.A08, (AnonymousClass9KQ) null, r6, true);
        C89984fb r43 = r42.A07;
        if (!r43.A07(r6)) {
            r43.A04(r43.A06(r6), "effect_fetched", r6.A00);
        }
        this.A03.onSuccess(r5);
    }
}
