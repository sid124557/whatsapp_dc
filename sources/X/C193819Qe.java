package X;

/* renamed from: X.9Qe  reason: invalid class name and case insensitive filesystem */
public class C193819Qe {
    public final /* synthetic */ AnonymousClass9ZV A00;

    public C193819Qe(AnonymousClass9ZV r1) {
        this.A00 = r1;
    }

    public void A00(C194829Uq r5) {
        AnonymousClass9T9 r0;
        if (r5.A04 == null && r5.A01 == null) {
            AnonymousClass9ZV r2 = this.A00;
            r2.A08 = Boolean.FALSE;
            r2.A06 = new C201699ka("Could not retrieve data from photo processor.");
            r0 = r2.A03;
        } else {
            AnonymousClass9ZV r3 = this.A00;
            r3.A08 = Boolean.TRUE;
            r3.A07 = r5;
            if (r3.A05) {
                C193929Qt r22 = r3.A01;
                if (r22.A01[((r22.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
            r0 = r3.A03;
        }
        r0.A01();
    }
}
