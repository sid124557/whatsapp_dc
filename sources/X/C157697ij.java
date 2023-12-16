package X;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.7ij  reason: invalid class name and case insensitive filesystem */
public final class C157697ij {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C166637z1 A07;
    public final C187048wM[] A08;

    public final AudioTrack A00(AnonymousClass80g r4, int i) {
        AudioFormat A0U = AnonymousClass6C8.A0U(this.A06, this.A02, this.A03);
        C1463379w r0 = r4.A00;
        if (r0 == null) {
            r0 = new C1463379w(r4);
            r4.A00 = r0;
        }
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(r0.A00).setAudioFormat(A0U);
        boolean z = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z = false;
        }
        return sessionId.setOffloadedPlayback(z).build();
    }

    public C157697ij(C166637z1 r1, C187048wM[] r2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A07 = r1;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A08 = r2;
    }
}
