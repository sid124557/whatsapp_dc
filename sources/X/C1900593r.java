package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.93r  reason: invalid class name and case insensitive filesystem */
public class C1900593r extends CameraCaptureSession.StateCallback {
    public C195669Zb A00;
    public final /* synthetic */ C195739Zi A01;

    public C1900593r(C195739Zi r1) {
        this.A01 = r1;
    }

    public final C195669Zb A00(CameraCaptureSession cameraCaptureSession) {
        C195669Zb r1 = this.A00;
        if (r1 != null && r1.A00 == cameraCaptureSession) {
            return r1;
        }
        C195669Zb r12 = new C195669Zb(cameraCaptureSession);
        this.A00 = r12;
        return r12;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C195739Zi r2 = this.A01;
        A00(cameraCaptureSession);
        if (r2.A03 == 1) {
            r2.A03 = 0;
            r2.A05 = Boolean.FALSE;
            r2.A02.A01();
        }
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C195739Zi r3 = this.A01;
        C1899593h.A0q(r3, A00(cameraCaptureSession), r3.A03, 1);
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        C195739Zi r0 = this.A01;
        A00(cameraCaptureSession);
        AnonymousClass9Mu r1 = r0.A00;
        if (r1 != null) {
            r1.A00.A0N.A00(new AnonymousClass96k(), "camera_session_active", new C204469pP((Object) r1, 12));
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        C195739Zi r3 = this.A01;
        C1899593h.A0q(r3, A00(cameraCaptureSession), r3.A03, 2);
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        C195739Zi r3 = this.A01;
        C1899593h.A0q(r3, A00(cameraCaptureSession), r3.A03, 3);
    }
}
