package X;

/* renamed from: X.2hZ  reason: invalid class name and case insensitive filesystem */
public class C50062hZ {
    public final C69263Wi A00;
    public final AnonymousClass3N0 A01;
    public final C44382Vv A02;
    public final C29431io A03;
    public final C620333f A04;
    public final AnonymousClass1VX A05;
    public final C72173dI A06;

    public void A00(C624134x r9, Runnable runnable, byte b) {
        C624134x r3 = r9;
        boolean A012 = this.A02.A00().A01(r9.A1J.A00);
        byte b2 = b;
        Runnable runnable2 = runnable;
        if (AnonymousClass3N0.A00(r9, b)) {
            this.A06.execute(new C71673cU((Object) this, (Object) r3, (Object) runnable2, (int) b2, 1, A012));
        } else {
            A01(r3, runnable2, b2, false, A012);
        }
    }

    public final void A01(C624134x r10, Runnable runnable, byte b, boolean z, boolean z2) {
        this.A00.A0S(new C71673cU((Object) this, (Object) runnable, (Object) r10, (int) b, 0, z));
        if (z2) {
            this.A06.execute(new C71733ca((Object) r10, (Object) this, (int) b, 10));
        }
    }

    public C50062hZ(C69263Wi r3, AnonymousClass3N0 r4, C44382Vv r5, C29431io r6, C620333f r7, AnonymousClass1VX r8, AnonymousClass4FS r9) {
        this.A05 = r8;
        this.A00 = r3;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = r5;
        this.A06 = new C72173dI(r9, true);
        this.A01 = r4;
    }
}
