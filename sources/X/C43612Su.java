package X;

/* renamed from: X.2Su  reason: invalid class name and case insensitive filesystem */
public final class C43612Su {
    public final int A00;
    public final C49862hD A01;
    public final AnonymousClass2O9 A02;
    public final AnonymousClass66R A03;
    public final C85424Ge A04;
    public final AnonymousClass4G0[] A05;
    public final Boolean[] A06;

    public C43612Su(C49862hD r3, AnonymousClass2O9 r4, C85424Ge r5) {
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r4;
        r3.A01();
        AnonymousClass2RG r0 = r3.A00;
        if (r0 == null) {
            throw C18270x1.A0S("metadata");
        }
        int i = r0.A00;
        this.A00 = i;
        int i2 = i + 1;
        this.A05 = new AnonymousClass4G0[i2];
        this.A06 = new Boolean[i2];
        this.A03 = C154517dI.A01(new C78583vF(this));
    }
}
