package X;

import android.content.Context;

/* renamed from: X.0Pi  reason: invalid class name */
public class AnonymousClass0Pi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ AnonymousClass84O A02;
    public final /* synthetic */ AnonymousClass84O A03;

    public AnonymousClass0Pi(Context context, C153427bI r2, AnonymousClass84O r3, AnonymousClass84O r4) {
        this.A03 = r3;
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r2;
    }

    public void A00() {
        AnonymousClass84O r1 = this.A03;
        C835248t A0L = r1.A0L(42);
        if (A0L != null) {
            AnonymousClass84O r3 = this.A02;
            C152057Xj r2 = new C152057Xj();
            r2.A04(r3, 0);
            C153427bI r12 = this.A01;
            r2.A04(r12, 1);
            C159377lj.A01(r12, r3, r2.A03(), A0L);
            return;
        }
        C835248t A0L2 = r1.A0L(35);
        if (A0L2 != null) {
            C159377lj.A01(this.A01, this.A02, new C152057Xj().A03(), A0L2);
        }
    }

    public void A01(int i) {
        C835248t A0L = this.A03.A0L(38);
        if (A0L != null) {
            AnonymousClass84O r4 = this.A02;
            C152057Xj r3 = new C152057Xj();
            r3.A04(r4, 0);
            C153427bI r2 = this.A01;
            r3.A04(r2, 1);
            r3.A04(Integer.valueOf((int) (((float) i) / AnonymousClass000.A0B(this.A00).density)), 2);
            C159377lj.A01(r2, r4, r3.A03(), A0L);
        }
    }

    public void A02(int i) {
        AnonymousClass84O r1 = this.A03;
        C835248t A0L = r1.A0L(43);
        if (A0L != null) {
            AnonymousClass84O r4 = this.A02;
            C152057Xj r3 = new C152057Xj();
            r3.A04(r4, 0);
            C153427bI r2 = this.A01;
            r3.A04(r2, 1);
            r3.A04(Integer.valueOf((int) (((float) i) / AnonymousClass000.A0B(this.A00).density)), 2);
            C159377lj.A01(r2, r4, r3.A03(), A0L);
            return;
        }
        C835248t A0L2 = r1.A0L(36);
        if (A0L2 != null) {
            C159377lj.A01(this.A01, this.A02, new C152057Xj().A03(), A0L2);
        }
    }
}
