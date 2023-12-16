package X;

/* renamed from: X.9j8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200859j8 implements Runnable {
    public final /* synthetic */ AnonymousClass3XA A00;
    public final /* synthetic */ C194569Tl A01;
    public final /* synthetic */ String A02;

    public final void run() {
        C194569Tl r0 = this.A01;
        String str = this.A02;
        AnonymousClass3XA r2 = this.A00;
        C166587yw A08 = r0.A01.A08(str);
        if (A08 != null) {
            r2.A05(A08);
        } else {
            r2.A06(AnonymousClass002.A0E(AnonymousClass000.A0V("Payments: failed to read payment method from credId: ", str, AnonymousClass001.A0o())));
        }
    }

    public /* synthetic */ C200859j8(AnonymousClass3XA r1, C194569Tl r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }
}
