package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.9Zc  reason: invalid class name and case insensitive filesystem */
public class C195679Zc implements C203429ng {
    public final CameraExtensionSession A00;
    public final Executor A01;

    public static void A01(CameraDevice cameraDevice, C195739Zi r7, List list, Executor executor) {
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0s.add(new OutputConfiguration(((C193449Or) list.get(i)).A02));
        }
        cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(4, A0s, executor, new C1900893u(r7, executor)));
    }

    public int Ayh(CaptureRequest captureRequest, Handler handler, C203289nS r6) {
        return this.A00.capture(captureRequest, this.A01, new C1900793t(r6, this));
    }

    public int BnB(CaptureRequest captureRequest, Handler handler, C203289nS r6) {
        return this.A00.setRepeatingRequest(captureRequest, this.A01, new C1900793t(r6, this));
    }

    public void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            AnonymousClass9WT.A01("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }

    public C195679Zc(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }

    public void Avz() {
    }

    public boolean BHY() {
        return true;
    }
}
