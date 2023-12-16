package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.93q  reason: invalid class name and case insensitive filesystem */
public class C1900493q extends CameraCaptureSession.CaptureCallback {
    public final AnonymousClass9ZY A00 = new AnonymousClass9ZY();
    public final AnonymousClass9ZZ A01 = new AnonymousClass9ZZ();
    public final C203289nS A02;
    public final /* synthetic */ C195669Zb A03;

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        CaptureRequest captureRequest2 = captureRequest;
        long j3 = j;
        long j4 = j2;
        super.onCaptureStarted(cameraCaptureSession, captureRequest2, j3, j4);
        this.A02.BOY(captureRequest2, this.A03, j3, j4);
    }

    public C1900493q(C195669Zb r2, C203289nS r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        AnonymousClass9ZZ r2 = this.A01;
        r2.A00 = totalCaptureResult;
        this.A02.BOW(r2, this.A03);
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        AnonymousClass9ZY r2 = this.A00;
        r2.A00 = captureFailure;
        this.A02.BOX(r2, this.A03);
    }
}
