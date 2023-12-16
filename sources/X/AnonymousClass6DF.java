package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Arrays;

/* renamed from: X.6DF  reason: invalid class name */
public class AnonymousClass6DF extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ C138516qV A02;

    public AnonymousClass6DF(CaptureRequest.Builder builder, Surface surface, C138516qV r3) {
        this.A02 = r3;
        this.A01 = surface;
        this.A00 = builder;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Surface surface = this.A01;
        if (!(surface == null || surface == this.A02.A04)) {
            surface.release();
        }
        C138516qV r1 = this.A02;
        r1.A08 = false;
        Log.i("voip/video/VoipCamera/ cameraDevice configure failed");
        r1.cameraEventsDispatcher.A01();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C138516qV r2 = this.A02;
        r2.A08 = false;
        Surface surface = this.A01;
        if (!(surface == null || surface == r2.A04)) {
            surface.release();
        }
        if (r2.A02 == null) {
            Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
            r2.cameraEventsDispatcher.A01();
            return;
        }
        Log.i("voip/video/VoipCamera/ cameraDevice configured");
        CaptureRequest.Builder builder = this.A00;
        builder.set(CaptureRequest.CONTROL_MODE, AnonymousClass001.A0f());
        builder.set(CaptureRequest.CONTROL_AF_MODE, C18290x4.A0a());
        builder.set(CaptureRequest.FLASH_MODE, 0);
        Range[] rangeArr = (Range[]) r2.A0B.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i = Integer.MIN_VALUE;
            Range range = null;
            for (Range range2 : rangeArr) {
                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(AnonymousClass6C8.A0C(range2) * 1000, AnonymousClass6C7.A05(range2) * 1000, r2.A0H.fps1000);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voip/video/VoipCamera/startOnCameraThread check fps [");
                A0o.append(range2.getLower());
                A0o.append(", ");
                A0o.append(range2.getUpper());
                C18260x0.A0y("], score: ", A0o, fpsRangeScore);
                if (fpsRangeScore > i) {
                    range = range2;
                    i = fpsRangeScore;
                }
            }
            if (range != null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                A0o2.append(range.getLower());
                A0o2.append(", ");
                A0o2.append(range.getUpper());
                A0o2.append("], score: ");
                A0o2.append(i);
                A0o2.append(", supported ranges : ");
                C18260x0.A1L(A0o2, Arrays.toString(rangeArr));
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, r2.cameraThreadHandler);
            r2.startPeriodicCameraCallbackCheck();
        } catch (CameraAccessException unused) {
            Log.i("voip/video/VoipCamera/ failed to start preview");
            r2.cameraEventsDispatcher.A01();
        }
    }
}
