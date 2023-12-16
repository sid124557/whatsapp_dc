package X;

/* renamed from: X.9Qh  reason: invalid class name and case insensitive filesystem */
public class C193849Qh {
    public final C67993Rl A00;

    public AnonymousClass36K A01(byte[] bArr) {
        AnonymousClass39V[] r3 = new AnonymousClass39V[3];
        C67993Rl r2 = this.A00;
        AnonymousClass39V.A04("key-type", r2.A03, r3);
        AnonymousClass39V.A05("key-version", r2.A04, r3);
        AnonymousClass39V.A06("provider", r2.A05, r3);
        return new AnonymousClass36K("pin", C1899693i.A12(r2, bArr), r3);
    }

    public C193849Qh(C67993Rl r1) {
        this.A00 = r1;
    }

    public static void A00(C193849Qh r4, AnonymousClass9V6 r5, AnonymousClass4EZ r6, byte[] bArr, AnonymousClass39V[] r8) {
        r5.A02.A0G(r6, new AnonymousClass36K(r4.A01(bArr), "account", r8), "set", C625635p.A0L);
    }
}
