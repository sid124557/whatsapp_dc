package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.UUID;

/* renamed from: X.9XD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9XD implements Camera.ErrorCallback {
    public final /* synthetic */ AnonymousClass9ZR A00;

    public final void onError(int i, Camera camera) {
        String str;
        AnonymousClass9ZR r3 = this.A00;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
            } else if (i != 100) {
                str = AnonymousClass000.A0Y("Unknown error code: ", AnonymousClass001.A0o(), i);
            } else {
                str = "Camera server died. Camera resources will be released.";
            }
            z = true;
        } else {
            str = "Unknown error";
        }
        List list = r3.A0Q.A00;
        UUID uuid = r3.A0T.A03;
        Log.e("Camera1Device", str);
        r3.A0U.A05(new C201349jv(new C201689kZ(i, str), r3, list, uuid, z), uuid);
    }

    public /* synthetic */ AnonymousClass9XD(AnonymousClass9ZR r1) {
        this.A00 = r1;
    }
}
