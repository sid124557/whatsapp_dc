package X;

/* renamed from: X.2cd  reason: invalid class name and case insensitive filesystem */
public class C47052cd {
    public int A00 = 0;
    public long A01;
    public String A02;
    public boolean A03;
    public final C56612sH A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass5ZC A06;

    public C47052cd(C56612sH r3, AnonymousClass4FV r4) {
        AnonymousClass5ZC r1 = AnonymousClass3ZG.DEFAULT_SAMPLING_RATE;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r1;
    }

    public final void A00(int i) {
        C24701Yk r4 = new C24701Yk();
        C626936e.A0D(AnonymousClass000.A1W(this.A02), "RevokeUiActionWamEventLogger/logNextEvent: A session must be started before logging.");
        r4.A02 = this.A02;
        r4.A00 = Integer.valueOf(i);
        long A0H = this.A04.A0H();
        r4.A01 = C18310x6.A0f(A0H, this.A01);
        this.A01 = A0H;
        this.A05.BhA(r4);
    }
}
