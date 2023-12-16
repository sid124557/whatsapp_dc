package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.7kb  reason: invalid class name and case insensitive filesystem */
public final class C158817kb {
    public static final C158817kb A06 = new C158817kb(1033, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C158817kb A07 = new C158817kb(4201, ZipDecompressor.UNZIP_BUFFER_SIZE);
    public static final C158817kb A08;
    public static final C158817kb A09;
    public static final C158817kb A0A = new C158817kb(19, 16);
    public static final C158817kb A0B;
    public static final C158817kb A0C;
    public static final C158817kb A0D = new C158817kb(285, 256);
    public final int A00;
    public final int A01;
    public final C153377bD A02;
    public final C153377bD A03;
    public final int[] A04;
    public final int[] A05;

    static {
        C158817kb r3 = new C158817kb(67, 64);
        A08 = r3;
        C158817kb r0 = new C158817kb(301, 256);
        A0B = r0;
        A09 = r0;
        A0C = r3;
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A04[(this.A01 - this.A05[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A04;
        int[] iArr2 = this.A05;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A01 - 1)];
    }

    public String toString() {
        StringBuilder A0A2 = C18330xA.A0A("GF(0x");
        AnonymousClass001.A1N(A0A2, this.A00);
        A0A2.append(',');
        return C18260x0.A09(A0A2, this.A01);
    }

    public C158817kb(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        int[] iArr = new int[i2];
        this.A04 = iArr;
        int[] iArr2 = new int[i2];
        this.A05 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 <<= 1;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A03 = new C153377bD(this, new int[]{0});
        this.A02 = new C153377bD(this, new int[]{1});
    }
}
