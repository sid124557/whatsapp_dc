package X;

import android.media.MediaCodec;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7Pk  reason: invalid class name and case insensitive filesystem */
public final class C150147Pk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08;
    public final C155987fq A09;

    public C150147Pk() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A08 = cryptoInfo;
        this.A09 = Util.A00 >= 24 ? new C155987fq(cryptoInfo) : null;
    }
}
