package X;

import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;

/* renamed from: X.93u  reason: invalid class name and case insensitive filesystem */
public class C1900893u extends CameraExtensionSession.StateCallback {
    public C195679Zc A00;
    public final /* synthetic */ C195739Zi A01;
    public final /* synthetic */ Executor A02;

    public C1900893u(C195739Zi r1, Executor executor) {
        this.A01 = r1;
        this.A02 = executor;
    }

    public void onClosed(CameraExtensionSession cameraExtensionSession) {
        C195739Zi r3 = this.A01;
        Executor executor = this.A02;
        C195679Zc r2 = this.A00;
        if (r2 == null || r2.A00 != cameraExtensionSession) {
            r2 = new C195679Zc(cameraExtensionSession, executor);
            this.A00 = r2;
        }
        C1899593h.A0q(r3, r2, r3.A03, 2);
    }

    public void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        C195739Zi r2 = this.A01;
        Executor executor = this.A02;
        C195679Zc r0 = this.A00;
        if (r0 == null || r0.A00 != cameraExtensionSession) {
            this.A00 = new C195679Zc(cameraExtensionSession, executor);
        }
        if (r2.A03 == 1) {
            r2.A03 = 0;
            r2.A05 = Boolean.FALSE;
            r2.A02.A01();
        }
    }

    public void onConfigured(CameraExtensionSession cameraExtensionSession) {
        C195739Zi r3 = this.A01;
        Executor executor = this.A02;
        C195679Zc r2 = this.A00;
        if (r2 == null || r2.A00 != cameraExtensionSession) {
            r2 = new C195679Zc(cameraExtensionSession, executor);
            this.A00 = r2;
        }
        C1899593h.A0q(r3, r2, r3.A03, 1);
    }
}
