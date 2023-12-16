package X;

/* renamed from: X.2fH  reason: invalid class name and case insensitive filesystem */
public class C48672fH {
    public final C64773Ex A00;
    public final AnonymousClass332 A01;

    public AnonymousClass3ZH A00(C54742pD r3, String str) {
        try {
            AnonymousClass3ZH A07 = this.A00.A07(C106405Yw.A04(this.A01.A02(r3, str)));
            if (A07 != null) {
                return A07;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (AnonymousClass24P e) {
            throw new SecurityException(e);
        }
    }

    public String A01(C95814uZ r3, C54742pD r4) {
        return this.A01.A03(r4, r3.getRawString());
    }

    public C48672fH(C64773Ex r1, AnonymousClass332 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
