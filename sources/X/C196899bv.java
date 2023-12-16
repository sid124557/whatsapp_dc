package X;

/* renamed from: X.9bv  reason: invalid class name and case insensitive filesystem */
public class C196899bv implements C202999mx {
    public final C202699mR A00;
    public final C193849Qh A01;
    public final /* synthetic */ AnonymousClass9VB A02;

    public C196899bv(C202699mR r1, AnonymousClass9VB r2, C193849Qh r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public void BS6(AnonymousClass34V r2) {
        this.A00.BaJ(r2);
    }

    public void BdL(String[] strArr) {
        AnonymousClass9VB r1 = this.A02;
        C193849Qh r5 = this.A01;
        String str = strArr[0];
        String str2 = strArr[1];
        C202699mR r0 = this.A00;
        AnonymousClass9V6 r6 = r1.A01;
        C191069Ax r4 = new C191069Ax(r0, r1, r5);
        byte[] A012 = AnonymousClass9V6.A01(Boolean.TRUE, str, "CHANGE", str2, (byte[]) null, new Object[0], C56612sH.A00(r6.A01));
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        AnonymousClass39V.A0B("action", "change-payment-pin", r2, 0);
        C193849Qh.A00(r5, r6, r4, A012, r2);
    }
}
