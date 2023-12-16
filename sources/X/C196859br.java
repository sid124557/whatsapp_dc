package X;

/* renamed from: X.9br  reason: invalid class name and case insensitive filesystem */
public class C196859br implements C202989mw {
    public final C202699mR A00;
    public final C193849Qh A01;
    public final /* synthetic */ AnonymousClass9VB A02;

    public C196859br(C202699mR r1, AnonymousClass9VB r2, C193849Qh r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public void BS6(AnonymousClass34V r2) {
        this.A00.BaJ(r2);
    }

    public void BdD(String str) {
        AnonymousClass9VB r3 = this.A02;
        C193849Qh r6 = this.A01;
        C202699mR r2 = this.A00;
        r3.A08.A07("[Set PIN] called");
        AnonymousClass9V6 r5 = r3.A01;
        C191079Ay r15 = new C191079Ay(r2, r3, r6);
        String str2 = str;
        byte[] A012 = AnonymousClass9V6.A01((Boolean) null, (Object) null, "CREATE", str2, (byte[]) null, new Object[0], C56612sH.A00(r5.A01));
        AnonymousClass39V[] r32 = new AnonymousClass39V[1];
        AnonymousClass39V.A0B("action", "create-payment-pin", r32, 0);
        r5.A02.A0G(r15, new AnonymousClass36K(r6.A01(A012), "account", r32), "set", C625635p.A0L);
    }
}
