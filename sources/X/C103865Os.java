package X;

/* renamed from: X.5Os  reason: invalid class name and case insensitive filesystem */
public final class C103865Os {
    public final C56982ss A00;
    public final C56652sL A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass31C A03;
    public final AnonymousClass5UP A04;
    public final C56842se A05;
    public final AnonymousClass4FS A06;
    public volatile C95804uY A07;
    public volatile Runnable A08;

    public final synchronized void A00() {
        this.A07 = null;
        Runnable runnable = this.A08;
        if (runnable != null) {
            this.A06.BjN(runnable);
        }
        this.A08 = null;
    }

    public C103865Os(C56982ss r1, C56652sL r2, AnonymousClass1VX r3, AnonymousClass31C r4, AnonymousClass5UP r5, C56842se r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r3, r7, r1, r4, r2);
        C18260x0.A0U(r5, r6);
        this.A02 = r3;
        this.A06 = r7;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }
}
