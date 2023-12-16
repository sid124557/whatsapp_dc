package X;

/* renamed from: X.9gy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199679gy implements Runnable {
    public final /* synthetic */ C1902094n A00;

    public final void run() {
        AnonymousClass9W2 r0;
        C195109Vz r1;
        C1902094n r2 = this.A00;
        C624034w r3 = r2.A07;
        AnonymousClass1S4 r12 = r3.A0A;
        if (!(r12 instanceof AnonymousClass99L) || (r0 = ((AnonymousClass99L) r12).A0G) == null || (r1 = r0.A0C) == null) {
            AnonymousClass9U4.A01(r2.A0G).A0b(r3.A0K, 40, 15, r3.A05, r3.A06);
        } else {
            r1.A08 = "REJECT";
            r1.A09 = "SUCCESS";
            AnonymousClass9U4.A01(r2.A0G).A0d(r3);
        }
        r2.A0B.A0S(new C199659gw(r2));
    }

    public /* synthetic */ C199679gy(C1902094n r1) {
        this.A00 = r1;
    }
}
