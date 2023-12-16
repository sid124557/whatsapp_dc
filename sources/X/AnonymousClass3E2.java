package X;

/* renamed from: X.3E2  reason: invalid class name */
public final class AnonymousClass3E2 implements AnonymousClass49B {
    public final /* synthetic */ C49382gR A00;
    public final /* synthetic */ AnonymousClass39C A01;
    public final /* synthetic */ AnonymousClass3EF A02;
    public final /* synthetic */ String A03;

    public AnonymousClass3E2(C49382gR r1, AnonymousClass39C r2, AnonymousClass3EF r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BLH() {
        AnonymousClass3EF r3 = this.A02;
        String str = this.A03;
        C61252zx A002 = r3.A00(str);
        if (A002 == null) {
            this.A00.A00(AnonymousClass001.A0e("Bloks metadata should be provided"));
            return;
        }
        r3.A01.BkS(new C71613cO(A002, r3, this.A00, this.A01, str, 11));
    }
}
