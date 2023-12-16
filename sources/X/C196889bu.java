package X;

/* renamed from: X.9bu  reason: invalid class name and case insensitive filesystem */
public class C196889bu implements C202999mx {
    public final /* synthetic */ AnonymousClass9SB A00;
    public final /* synthetic */ C193849Qh A01;
    public final /* synthetic */ AnonymousClass9RM A02;

    public C196889bu(AnonymousClass9SB r1, C193849Qh r2, AnonymousClass9RM r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BS6(AnonymousClass34V r2) {
        this.A02.A00(r2);
    }

    public void BdL(String[] strArr) {
        AnonymousClass9SB r7 = this.A00;
        AnonymousClass9U5 r0 = r7.A03;
        AnonymousClass39V[] r4 = new AnonymousClass39V[4];
        char A0G = AnonymousClass39V.A0G("token", strArr[AnonymousClass39V.A0F("action", "reset-payment-pin", r4)], r4);
        AnonymousClass39V.A06("credential-id", r7.A0A, r4);
        AnonymousClass39V.A07("device-id", r7.A09.A01(), r4);
        AnonymousClass9V6 r1 = r7.A08;
        C193849Qh r8 = this.A01;
        AnonymousClass36K r12 = new AnonymousClass36K(r8.A01(AnonymousClass9V6.A01((Boolean) null, (Object) null, "RESET", strArr[A0G], (byte[]) null, new Object[0], C56612sH.A00(r1.A01))), "account", r4);
        AnonymousClass9RM r6 = this.A02;
        AnonymousClass9U5 r14 = r0;
        r14.A0G(new C203909oV(r7.A00, r7.A02, r7.A01, r6, r7, r8, 6), r12, "set", C625635p.A0L);
    }
}
