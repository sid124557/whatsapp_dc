package X;

/* renamed from: X.2f1  reason: invalid class name and case insensitive filesystem */
public class C48512f1 {
    public final C04840Qw A00 = new C04840Qw(1000);
    public final C04840Qw A01 = new C04840Qw(1000);

    public void A00(AnonymousClass3ZF r4) {
        C04840Qw r2 = this.A01;
        synchronized (r2) {
            r2.A08(Long.valueOf(r4.A05()), r4);
        }
        C04840Qw r1 = this.A00;
        synchronized (r1) {
            r1.A08(r4.A0E, r4);
        }
    }

    public void A01(AnonymousClass3ZF r4) {
        C04840Qw r2 = this.A01;
        synchronized (r2) {
            r2.A05(Long.valueOf(r4.A05()));
        }
        C04840Qw r1 = this.A00;
        synchronized (r1) {
            r1.A05(r4.A0E);
        }
    }
}
