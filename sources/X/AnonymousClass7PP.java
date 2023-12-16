package X;

import android.media.MediaCodec;

/* renamed from: X.7PP  reason: invalid class name */
public final class AnonymousClass7PP {
    public int A00;
    public int A01;
    public byte[] A02;
    public byte[] A03;
    public int[] A04;
    public int[] A05;
    public final MediaCodec.CryptoInfo A06;
    public final C156027fu A07;

    public AnonymousClass7PP() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A06 = cryptoInfo;
        this.A07 = C162387ry.A01 >= 24 ? new C156027fu(cryptoInfo) : null;
    }
}
