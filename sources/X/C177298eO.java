package X;

/* renamed from: X.8eO  reason: invalid class name and case insensitive filesystem */
public class C177298eO extends AnonymousClass8QG {
    public static final byte[] A04 = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    public long A00 = 0;
    public AnonymousClass8QN A01;
    public boolean A02;
    public final C177278eM A03;

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A03.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public String B4N() {
        String B4N = this.A03.B4N();
        StringBuilder A0o = AnonymousClass001.A0o();
        int indexOf = B4N.indexOf(47);
        A0o.append(AnonymousClass0x7.A0r(B4N, indexOf));
        A0o.append("/G");
        return AnonymousClass000.A0X(AnonymousClass6C9.A0c(indexOf, B4N), A0o);
    }

    public int B4g() {
        return this.A03.A00;
    }

    public void BFw(C834748n r3, boolean z) {
        this.A00 = 0;
        this.A03.BFw(r3, z);
        this.A02 = z;
        if (r3 instanceof AnonymousClass8QP) {
            r3 = ((AnonymousClass8QP) r3).A00;
        }
        if (r3 instanceof AnonymousClass8QJ) {
            r3 = ((AnonymousClass8QJ) r3).A01;
        }
        if (r3 instanceof AnonymousClass8QH) {
            r3 = null;
        }
        this.A01 = (AnonymousClass8QN) r3;
    }

    public void reset() {
        this.A00 = 0;
        this.A03.reset();
    }

    public C177298eO(C185768uD r3) {
        super(r3);
        this.A03 = new C177278eM(r3, r3.B4g() * 8);
    }
}
