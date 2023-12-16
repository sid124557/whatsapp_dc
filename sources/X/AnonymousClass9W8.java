package X;

/* renamed from: X.9W8  reason: invalid class name */
public class AnonymousClass9W8 implements C202989mw {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass9W8(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BS6(AnonymousClass34V r5) {
        if (this.A02 != 0) {
            ((AnonymousClass9RM) this.A01).A00(r5);
            return;
        }
        AnonymousClass9RT r3 = (AnonymousClass9RT) this.A01;
        if (r3.A01.compareAndSet(false, true)) {
            r3.A02.decrementAndGet();
            r3.A00.BS6(r5);
        }
    }

    public void BdD(String str) {
        if (this.A02 != 0) {
            AnonymousClass9SB r4 = (AnonymousClass9SB) this.A00;
            AnonymousClass9U5 r7 = r4.A03;
            AnonymousClass39V[] r2 = new AnonymousClass39V[4];
            AnonymousClass39V.A04("action", "pin-credential-check", r2);
            AnonymousClass39V.A05("token", str, r2);
            AnonymousClass39V.A06("credential-id", r4.A0A, r2);
            AnonymousClass39V.A07("device-id", r4.A09.A01(), r2);
            AnonymousClass36K A0U = C1899693i.A0U(r2);
            Object obj = this.A01;
            r7.A0G(new C203899oU(r4.A00, r4.A02, r4.A01, r4, obj, 23), A0U, "get", C625635p.A0L);
            return;
        }
        ((AnonymousClass9RT) this.A01).A00(0, str);
    }
}
