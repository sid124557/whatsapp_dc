package X;

/* renamed from: X.2at  reason: invalid class name and case insensitive filesystem */
public class C45982at {
    public final AnonymousClass1VX A00;
    public final C66833My A01;
    public final C59302wh A02;
    public final C72173dI A03;

    public C45982at(AnonymousClass1VX r3, C66833My r4, C59302wh r5, AnonymousClass4FS r6) {
        this.A00 = r3;
        this.A03 = new C72173dI(r6, true);
        this.A02 = r5;
        this.A01 = r4;
    }

    public void A00(C614630w r4, Runnable runnable) {
        if (r4.A06()) {
            runnable.run();
        } else {
            this.A03.execute(new C70343aL(this, r4, runnable, 22));
        }
    }
}
