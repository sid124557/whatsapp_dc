package X;

/* renamed from: X.2pP  reason: invalid class name and case insensitive filesystem */
public final class C54862pP {
    public final AnonymousClass7KQ A00;
    public final C44242Vf A01;
    public final AnonymousClass2F1 A02;
    public final C44682Xb A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C76893sW(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new C76903sX(this));

    public C54862pP(AnonymousClass7KQ r2, C44242Vf r3, AnonymousClass2F1 r4, C44682Xb r5) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final boolean A00() {
        return AnonymousClass000.A1Y(((C54282oT) this.A04.getValue()).A00(), AnonymousClass21Y.A02);
    }

    public final boolean A01() {
        return AnonymousClass000.A1Y(((C54282oT) this.A05.getValue()).A00(), AnonymousClass21Y.A02);
    }

    public final boolean A02() {
        if (A00() || A01()) {
            return true;
        }
        return false;
    }
}
