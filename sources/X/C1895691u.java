package X;

import android.hardware.Camera;
import android.os.Handler;
import java.util.Objects;

/* renamed from: X.91u  reason: invalid class name and case insensitive filesystem */
public class C1895691u implements Camera.AutoFocusCallback {
    public Object A00;
    public final int A01;

    public C1895691u(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.A01 != 0) {
            C18260x0.A1D("qrview/onAutoFocus ", AnonymousClass001.A0o(), z);
            AnonymousClass6EW r4 = (AnonymousClass6EW) this.A00;
            Handler handler = r4.A04;
            Runnable runnable = r4.A0N;
            if (handler != null) {
                handler.postDelayed(runnable, 2000);
            } else {
                r4.postDelayed(runnable, 2000);
            }
        } else {
            C18260x0.A1D("cameraview/on-auto-focus ", AnonymousClass001.A0o(), z);
            C185898uQ r0 = ((C132906gD) this.A00).A0F;
            Objects.requireNonNull(r0);
            r0.BN4(z);
        }
    }
}
