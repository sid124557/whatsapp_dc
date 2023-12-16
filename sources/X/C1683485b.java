package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* renamed from: X.85b  reason: invalid class name and case insensitive filesystem */
public class C1683485b implements C186208uv {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    public void AzR(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    public boolean BJ1() {
        return this.A03;
    }

    public void Bll(MediaFormat mediaFormat) {
        this.A00 = this.A02.addTrack(mediaFormat);
    }

    public void Bml(int i) {
        this.A02.setOrientationHint(i);
    }

    public void Bnl(MediaFormat mediaFormat) {
        this.A01 = this.A02.addTrack(mediaFormat);
    }

    public void Bse(C184848se r5) {
        this.A02.writeSampleData(this.A00, r5.B50(), r5.B4v());
    }

    public void Bsl(C184848se r5) {
        this.A02.writeSampleData(this.A01, r5.B50(), r5.B4v());
    }

    public void start() {
        this.A02.start();
        this.A03 = true;
    }

    public void stop() {
        this.A02.stop();
        this.A03 = false;
        this.A02.release();
    }
}
