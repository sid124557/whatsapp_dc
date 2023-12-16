package X;

import android.hardware.Camera;
import android.os.Handler;
import java.util.Objects;
import org.pjsip.PjCamera;

/* renamed from: X.91c  reason: invalid class name and case insensitive filesystem */
public class C1893891c implements Camera.ErrorCallback {
    public Object A00;
    public final int A01;

    public C1893891c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i, Camera camera) {
        switch (this.A01) {
            case 0:
                C132906gD r3 = (C132906gD) this.A00;
                synchronized (r3) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("cameraview/start-camera camera error:");
                    A0o.append(i);
                    A0o.append(" takingpicture:");
                    A0o.append(r3.A0R);
                    A0o.append(" recording:");
                    A0o.append(r3.A0P);
                    A0o.append(" inpreview:");
                    A0o.append(r3.A0M);
                    AnonymousClass0x2.A19(A0o);
                    if (i == 100) {
                        r3.A09();
                        Handler handler = r3.A09;
                        Objects.requireNonNull(handler);
                        handler.post(new C117695sL((Object) r3, 49));
                    } else if (i == 2) {
                        Camera camera2 = r3.A07;
                        if (camera2 != null) {
                            camera2.release();
                        }
                        r3.A07 = null;
                        r3.A0B(new Exception("CameraCustomException: Camera error evicted"), i);
                    }
                }
                return;
            case 1:
                AnonymousClass6EW r32 = (AnonymousClass6EW) this.A00;
                C18260x0.A0z("qrview/startcamera camera error:", AnonymousClass001.A0o(), i);
                if (i == 100) {
                    r32.A04.post(new C70033Zp(r32, 2));
                    r32.A04.post(new C70033Zp(r32, 0));
                    return;
                } else if (i == 2) {
                    r32.A03 = null;
                    r32.A00(i);
                    return;
                } else {
                    return;
                }
            default:
                ((PjCamera) this.A00).lambda$startOnCameraThread$0(i, camera);
                return;
        }
    }
}
