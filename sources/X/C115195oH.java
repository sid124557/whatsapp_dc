package X;

/* renamed from: X.5oH  reason: invalid class name and case insensitive filesystem */
public final class C115195oH implements AnonymousClass65T {
    public final AnonymousClass1VX A00;

    public C115195oH(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public C622234e[] Bij() {
        int i;
        int i2;
        C622234e[] r2 = new C622234e[4];
        AnonymousClass1VX r3 = this.A00;
        r2[0] = new C622234e(C106505Zg.A01(r3));
        r2[1] = new C622234e(C106505Zg.A00(r3));
        String A0Q = r3.A0Q(3810);
        if (A0Q != null) {
            i = Integer.parseInt(A0Q);
        } else {
            i = 20601216;
        }
        r2[2] = new C622234e(i);
        Integer A06 = C829745q.A06(C56952sp.A08(r3, 6498));
        if (A06 != null) {
            i2 = A06.intValue();
        } else {
            i2 = 20610101;
        }
        r2[3] = new C622234e(i2);
        return r2;
    }
}
