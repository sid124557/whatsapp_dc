package X;

import java.io.File;

/* renamed from: X.6kq  reason: invalid class name and case insensitive filesystem */
public class C135546kq extends AnonymousClass7N0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final int[] A05;

    public C135546kq(File file, String str, byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(file, str, bArr, z);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = z2;
        if (iArr == null || iArr.length < 2) {
            this.A05 = new int[0];
        } else {
            this.A05 = iArr;
        }
    }
}
