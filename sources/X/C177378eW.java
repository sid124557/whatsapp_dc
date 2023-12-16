package X;

/* renamed from: X.8eW  reason: invalid class name and case insensitive filesystem */
public class C177378eW extends C173608Qw {
    public C184668sK Azm() {
        return new C177378eW(this);
    }

    public String B4N() {
        return "SHA-384";
    }

    public int B74() {
        return 48;
    }

    public void Bjv(C184668sK r1) {
        super.A04((C173608Qw) r1);
    }

    public int B24(byte[] bArr, int i) {
        C173608Qw.A02(this, bArr, i);
        reset();
        return 48;
    }

    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A08 = -2662702644619276377L;
        this.A09 = 5167115440072839076L;
    }

    public C177378eW(C177378eW r1) {
        super(r1);
    }

    public C177378eW() {
    }
}
