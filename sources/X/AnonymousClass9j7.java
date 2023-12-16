package X;

import android.hardware.Camera;
import android.media.MediaRecorder;
import com.whatsapp.util.Log;

/* renamed from: X.9j7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9j7 implements Runnable {
    public final /* synthetic */ AnonymousClass7H5 A00;
    public final /* synthetic */ C196179aQ A01;
    public final /* synthetic */ C44232Ve A02;

    public final void run() {
        C196179aQ r4 = this.A01;
        AnonymousClass7H5 r3 = this.A00;
        C44232Ve r2 = this.A02;
        r4.A0C = true;
        try {
            MediaRecorder mediaRecorder = r4.A04;
            C626936e.A06(mediaRecorder);
            mediaRecorder.stop();
        } catch (RuntimeException e) {
            Log.w("WaBloksCameraViewBinder/stop-video-capture ", e);
        }
        C196189aR.A02(r4);
        Camera camera = r4.A03;
        if (camera != null) {
            camera.lock();
        }
        r4.A0B = false;
        C196189aR.A01(r3, r4, r2);
    }

    public /* synthetic */ AnonymousClass9j7(AnonymousClass7H5 r1, C196179aQ r2, C44232Ve r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
