package X;

/* renamed from: X.9Rr  reason: invalid class name and case insensitive filesystem */
public class C194129Rr {
    public final /* synthetic */ C195639Yw A00;
    public final /* synthetic */ AnonymousClass9QB A01;
    public final /* synthetic */ AnonymousClass9QN A02;
    public final /* synthetic */ C202879mj A03;
    public final /* synthetic */ C192529Kl A04;
    public final /* synthetic */ C195349Xk A05;
    public final /* synthetic */ AnonymousClass32L A06;

    public C194129Rr(C195639Yw r1, AnonymousClass9QB r2, AnonymousClass9QN r3, C202879mj r4, C192529Kl r5, C195349Xk r6, AnonymousClass32L r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void A00(AnonymousClass9SI r9, Exception exc) {
        if (exc != null) {
            C195639Yw.A01(this.A00, this.A03, this.A05, this.A06, exc);
            return;
        }
        AnonymousClass9QB r2 = this.A01;
        r2.A00 = r9;
        r2.A05 = true;
        if (r2.A04 && r2.A06) {
            C195639Yw r1 = this.A00;
            C195349Xk r6 = this.A05;
            C192529Kl r5 = this.A04;
            C195639Yw.A00(r1, r2, this.A02, this.A03, r5, r6, AnonymousClass000.A1W(r2.A02));
        }
    }
}
