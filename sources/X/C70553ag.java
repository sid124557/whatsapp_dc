package X;

/* renamed from: X.3ag  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70553ag implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C66723Mn A03;
    public final /* synthetic */ byte[] A04;

    public final void run() {
        C66723Mn r5 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        byte[] bArr = this.A04;
        int i3 = this.A02;
        if (i == 1) {
            if (r5.A0B()) {
                r5.A05.A04(bArr, i2, i3);
                r5.A05.A03((Integer) null);
                r5.A02();
            }
        } else if (r5.A09()) {
            r5.A06.A04(bArr, i2, i3);
            r5.A06.A03((Integer) null);
            r5.A08(false, i2);
            r5.A01.A02();
        }
    }

    public /* synthetic */ C70553ag(C66723Mn r1, byte[] bArr, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = i3;
    }
}
