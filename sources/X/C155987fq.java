package X;

import android.media.MediaCodec;

/* renamed from: X.7fq  reason: invalid class name and case insensitive filesystem */
public final class C155987fq {
    public final MediaCodec.CryptoInfo.Pattern A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    public final MediaCodec.CryptoInfo A01;

    public static /* synthetic */ void A00(C155987fq r2, int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = r2.A00;
        pattern.set(i, i2);
        r2.A01.setPattern(pattern);
    }

    public /* synthetic */ C155987fq(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
    }
}
