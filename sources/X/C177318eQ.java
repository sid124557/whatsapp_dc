package X;

/* renamed from: X.8eQ  reason: invalid class name and case insensitive filesystem */
public class C177318eQ extends AnonymousClass8Qs {
    public static final int[] A04;
    public int A00;
    public int[] A01;
    public int[] A02;
    public int[] A03;

    static {
        int i;
        int[] iArr = new int[64];
        A04 = iArr;
        int i2 = 0;
        do {
            iArr[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
            i = 16;
        } while (i2 < 16);
        do {
            int i3 = i % 32;
            iArr[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
            i++;
        } while (i < 64);
    }

    public C184668sK Azm() {
        return new C177318eQ(this);
    }

    public String B4N() {
        return "SM3";
    }

    public int B74() {
        return 32;
    }

    public void Bjv(C184668sK r5) {
        C177318eQ r52 = (C177318eQ) r5;
        super.A0R(r52);
        int[] iArr = r52.A01;
        int[] iArr2 = this.A01;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = r52.A03;
        int[] iArr4 = this.A03;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.A00 = r52.A00;
    }

    public C177318eQ(C177318eQ r5) {
        super(r5);
        int[] iArr = new int[8];
        this.A01 = iArr;
        this.A03 = new int[16];
        this.A02 = new int[68];
        System.arraycopy(r5.A01, 0, iArr, 0, 8);
        int[] iArr2 = r5.A03;
        int[] iArr3 = this.A03;
        System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        this.A00 = r5.A00;
    }

    public int B24(byte[] bArr, int i) {
        A0Q();
        int[] iArr = this.A01;
        for (int A022 : iArr) {
            C161817qb.A02(bArr, A022, i);
            i += 4;
        }
        reset();
        return 32;
    }

    public void reset() {
        super.reset();
        int[] iArr = this.A01;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.A00 = 0;
    }

    public C177318eQ() {
        this.A01 = new int[8];
        this.A03 = new int[16];
        this.A02 = new int[68];
        reset();
    }
}
