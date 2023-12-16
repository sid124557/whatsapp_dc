package X;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1;
import com.whatsapp.util.Log;

/* renamed from: X.4MA  reason: invalid class name */
public final class AnonymousClass4MA extends MediaProjection.Callback {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C138506qU A01;

    public AnonymousClass4MA(Context context, C138506qU r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public void onCapturedContentResize(int i, int i2) {
        C138506qU r5 = this.A01;
        C158497k4 r1 = r5.A03;
        if (i != r1.A02 || i2 != r1.A01) {
            Context context = this.A00;
            if (i % 2 != 0) {
                i--;
            }
            if (i2 % 2 != 0) {
                i2--;
            }
            C616131n.A02((C85494Gl) null, new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(r5, new C158497k4(i, i2, AnonymousClass000.A0B(context).densityDpi), (C84814Du) null), AnonymousClass349.A02(AnonymousClass2C4.A00), (AnonymousClass20D) null, 3);
        }
    }

    public void onStop() {
        Log.d("ScreenShareCaptureDevice MediaProjection stopped, releasing VirtualDisplay");
        C138506qU r4 = this.A01;
        r4.A07 = true;
        r4.A0C.clearMediaProjectionHandle();
        AnonymousClass59E.A00(AnonymousClass59E.OTHER, r4.A0B);
        VirtualDisplay virtualDisplay = r4.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        r4.A00 = null;
        r4.stopPeriodicCameraCallbackCheck();
        C616131n.A02((C85494Gl) null, new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(r4, (C84814Du) null), AnonymousClass349.A02(r4.A0D), (AnonymousClass20D) null, 3);
    }
}
