package X;

/* renamed from: X.8eX  reason: invalid class name and case insensitive filesystem */
public class C177388eX extends C173608Qw {
    public C184668sK Azm() {
        return new C177388eX(this);
    }

    public String B4N() {
        return "SHA-512";
    }

    public int B74() {
        return 64;
    }

    public void Bjv(C184668sK r1) {
        A04((C173608Qw) r1);
    }

    public int B24(byte[] bArr, int i) {
        C173608Qw.A02(this, bArr, i);
        C161817qb.A03(bArr, i + 48, this.A08);
        C161817qb.A03(bArr, i + 56, this.A09);
        reset();
        return 64;
    }

    public void reset() {
        super.reset();
        this.A02 = 7640891576956012808L;
        this.A03 = -4942790177534073029L;
        this.A04 = 4354685564936845355L;
        this.A05 = -6534734903238641935L;
        this.A06 = 5840696475078001361L;
        this.A07 = -7276294671716946913L;
        this.A08 = 2270897969802886507L;
        this.A09 = 6620516959819538809L;
    }

    public C177388eX(C177388eX r1) {
        super(r1);
    }

    public C177388eX() {
    }
}
