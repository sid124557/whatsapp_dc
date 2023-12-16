package X;

/* renamed from: X.2h8  reason: invalid class name and case insensitive filesystem */
public class C49812h8 {
    public AnonymousClass1RB A00;
    public final C55682qk A01;
    public final C54292oU A02;
    public final C60972zT A03;
    public final C45932ao A04;

    public synchronized AnonymousClass1RB A00() {
        AnonymousClass1RB r4;
        r4 = this.A00;
        if (r4 == null) {
            C54292oU r3 = this.A02;
            r4 = new AnonymousClass1RB(this.A01, r3, this.A03, this.A04);
            this.A00 = r4;
        }
        return r4;
    }

    public synchronized void A01() {
        AnonymousClass1RB r0 = this.A00;
        if (r0 != null) {
            r0.A0E();
            this.A00.close();
            this.A00 = null;
        }
    }

    public C49812h8(C55682qk r1, C54292oU r2, C60972zT r3, C45932ao r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }
}
