package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.6DG  reason: invalid class name */
public class AnonymousClass6DG extends CameraDevice.StateCallback {
    public final /* synthetic */ C138516qV A00;

    public AnonymousClass6DG(C138516qV r1) {
        this.A00 = r1;
    }

    public void onClosed(CameraDevice cameraDevice) {
        C138516qV r1 = this.A00;
        r1.A00 = 0;
        Log.i("voip/video/VoipCamera/ cameraDevice closed");
        if (r1.A07) {
            r1.A07 = false;
            if (r1.startOnCameraThread() != 0) {
                r1.cameraEventsDispatcher.A01();
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        C138516qV r1 = this.A00;
        if (cameraDevice == r1.A02) {
            Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
            r1.stopPeriodicCameraCallbackCheck();
            AnonymousClass7YV r3 = r1.cameraEventsDispatcher;
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((C185758uC) it.next()).BSW(r3.A01);
            }
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        Log.i("voip/video/VoipCamera/ camera opened");
        C138516qV r1 = this.A00;
        r1.A00 = 2;
        r1.A02 = cameraDevice;
        if (r1.videoPort != null && r1.A02() != 0) {
            r1.cameraEventsDispatcher.A01();
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        C18260x0.A0y("voip/video/VoipCamera/ cameraDevice error ", AnonymousClass001.A0o(), i);
        this.A00.cameraEventsDispatcher.A01();
    }
}
