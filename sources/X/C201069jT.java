package X;

/* renamed from: X.9jT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201069jT implements Runnable {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ C195109Vz A01;
    public final /* synthetic */ C1902094n A02;

    public final void run() {
        C1902094n r3 = this.A02;
        C195109Vz r1 = this.A01;
        C166587yw r0 = this.A00;
        if (r1 != null) {
            r1.A08 = "ACCEPT";
            r1.A09 = "PENDING";
        } else {
            if (r0 != null) {
                C624034w r2 = r3.A07;
                r2.A0H = r0.A0A;
                r2.A06 = r3.A03.A0H();
                r2.A02 = 401;
            }
            r3.A0B.A0S(new C199709h1(r3));
        }
        AnonymousClass9U4.A01(r3.A0G).A0d(r3.A07);
        r3.A0B.A0S(new C199709h1(r3));
    }

    public /* synthetic */ C201069jT(C166587yw r1, C195109Vz r2, C1902094n r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
