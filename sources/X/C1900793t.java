package X;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.93t  reason: invalid class name and case insensitive filesystem */
public class C1900793t extends CameraExtensionSession.ExtensionCaptureCallback {
    public C203289nS A00;
    public final AnonymousClass9ZX A01 = new AnonymousClass9ZX();
    public final C195659Za A02 = new C195659Za();
    public final /* synthetic */ C195679Zc A03;

    public C1900793t(C203289nS r2, C195679Zc r3) {
        this.A03 = r3;
        this.A00 = r2;
    }

    public void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        C203289nS r2 = this.A00;
        if (r2 != null) {
            r2.BOX(this.A01, this.A03);
        }
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C195659Za r2 = this.A02;
        r2.A00 = totalCaptureResult;
        C203289nS r1 = this.A00;
        if (r1 != null) {
            r1.BOW(r2, this.A03);
        }
    }

    public void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        C203289nS r2 = this.A00;
        if (r2 != null) {
            r2.BOW(this.A02, this.A03);
        }
    }

    public void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        C203289nS r0 = this.A00;
        if (r0 != null) {
            r0.BOY(captureRequest, this.A03, j, 0);
        }
    }
}
