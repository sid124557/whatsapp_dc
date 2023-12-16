package X;

import android.media.audiofx.Visualizer;

/* renamed from: X.5cb  reason: invalid class name and case insensitive filesystem */
public class C108195cb implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ C116095pj A00;

    public C108195cb(C116095pj r1) {
        this.A00 = r1;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        C182288oA r0 = this.A00.A0K;
        if (r0 != null) {
            r0.Bfj(bArr);
        }
    }

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }
}
