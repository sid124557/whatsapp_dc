package X;

import android.content.Context;

/* renamed from: X.6Ks  reason: invalid class name and case insensitive filesystem */
public class C126106Ks extends C151347Uj {
    public boolean A00 = true;
    public final C157817iv A01;
    public final long[] A02;
    public final long[] A03;

    public static void A00(C126026Kk r4, long[] jArr, int i) {
        r4.mobileBytesTx += jArr[i | 3];
        r4.mobileBytesRx += jArr[i | 2];
        r4.wifiBytesTx += jArr[i | 1];
        r4.wifiBytesRx += jArr[i];
    }

    public C126106Ks(Context context) {
        this.A01 = C157817iv.A00(context);
        this.A02 = new long[8];
        this.A03 = new long[8];
    }
}
