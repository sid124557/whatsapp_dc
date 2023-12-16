package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9kG  reason: invalid class name and case insensitive filesystem */
public class C201519kG implements Callable {
    public final /* synthetic */ AnonymousClass9WQ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C201519kG(AnonymousClass9WQ r1, List list, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = list;
        this.A03 = z2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass9WQ r3 = this.A00;
        C04890Rb.A01(r3.A01, "CameraDevice should not be null for createCaptureSession!");
        C04890Rb.A01(r3.A0B, "mPreviewSetupDelegate should not be null for createCaptureSession!");
        C13660nX r4 = new C13660nX(r3.A0N.A02);
        if (this.A02) {
            CameraDevice cameraDevice = r3.A01;
            List list = this.A01;
            C195739Zi r32 = r3.A0K;
            C195679Zc.A01(cameraDevice, r32, list, r4);
            return r32;
        }
        CameraDevice cameraDevice2 = r3.A01;
        List list2 = this.A01;
        boolean z = this.A03;
        C195739Zi r33 = r3.A0K;
        C195669Zb.A01(cameraDevice2, r33, list2, r4, z);
        return r33;
    }
}
