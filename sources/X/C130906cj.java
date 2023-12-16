package X;

/* renamed from: X.6cj  reason: invalid class name and case insensitive filesystem */
public final class C130906cj extends C152847aG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public C130906cj(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw AnonymousClass001.A0c("Crop rectangle does not fit within image data.");
        }
        this.A04 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
