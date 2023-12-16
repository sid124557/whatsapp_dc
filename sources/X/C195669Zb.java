package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.9Zb  reason: invalid class name and case insensitive filesystem */
public class C195669Zb implements C203429ng {
    public final CameraCaptureSession A00;

    public int Ayh(CaptureRequest captureRequest, Handler handler, C203289nS r6) {
        C1900493q r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (r6 != null) {
            r0 = new C1900493q(this, r6);
        } else {
            r0 = null;
        }
        return cameraCaptureSession.capture(captureRequest, r0, (Handler) null);
    }

    public int BnB(CaptureRequest captureRequest, Handler handler, C203289nS r6) {
        C1900493q r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (r6 != null) {
            r0 = new C1900493q(this, r6);
        } else {
            r0 = null;
        }
        return cameraCaptureSession.setRepeatingRequest(captureRequest, r0, (Handler) null);
    }

    public static void A00(CameraDevice cameraDevice, C195739Zi r10, List list, Executor executor) {
        long j;
        C1900593r r6 = new C1900593r(r10);
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C193449Or r8 = (C193449Or) list.get(i);
            OutputConfiguration outputConfiguration = new OutputConfiguration(r8.A02);
            outputConfiguration.setStreamUseCase(r8.A01);
            if (r8.A00 != 1) {
                j = 1;
            } else {
                j = 2;
            }
            outputConfiguration.setDynamicRangeProfile(j);
            A0s.add(outputConfiguration);
        }
        List emptyList = Collections.emptyList();
        int size2 = emptyList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A0s.add(new OutputConfiguration((Surface) emptyList.get(i2)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, A0s, executor, r6));
    }

    public void Avz() {
        this.A00.abortCaptures();
    }

    public void close() {
        this.A00.close();
    }

    public C195669Zb(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }

    public static void A01(CameraDevice cameraDevice, C195739Zi r5, List list, Executor executor, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0s.add(((C193449Or) list.get(i)).A02);
        }
        if (Build.VERSION.SDK_INT < 33 || !z) {
            cameraDevice.createCaptureSession(A0s, new C1900593r(r5), (Handler) null);
        } else {
            A00(cameraDevice, r5, list, executor);
        }
    }

    public boolean BHY() {
        return false;
    }
}
