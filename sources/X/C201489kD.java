package X;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.9kD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201489kD implements Callable {
    public final /* synthetic */ AnonymousClass9ZS A00;
    public final /* synthetic */ C1900693s A01;
    public final /* synthetic */ String A02;

    public final Object call() {
        AnonymousClass9ZS r0 = this.A00;
        String str = this.A02;
        C1900693s r2 = this.A01;
        CameraManager cameraManager = r0.A0O;
        cameraManager.getClass();
        cameraManager.openCamera(str, r2, (Handler) null);
        return r2;
    }

    public /* synthetic */ C201489kD(AnonymousClass9ZS r1, C1900693s r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
