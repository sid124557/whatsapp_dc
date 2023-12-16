package X;

/* renamed from: X.7UP  reason: invalid class name */
public final class AnonymousClass7UP {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C185598tw A07;

    public void A00(byte[] bArr, int i, int i2) {
        if (this.A04) {
            int i3 = this.A01;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.A06 = AnonymousClass000.A1T((bArr[i4] & 192) >> 6);
                this.A04 = false;
                return;
            }
            this.A01 = i3 + (i2 - i);
        }
    }

    public AnonymousClass7UP(C185598tw r1) {
        this.A07 = r1;
    }
}
