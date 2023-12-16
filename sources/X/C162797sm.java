package X;

import android.hardware.Camera;
import com.whatsapp.util.Log;

/* renamed from: X.7sm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162797sm implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass5PM A00;
    public final /* synthetic */ C132906gD A01;

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C132906gD r4 = this.A01;
        AnonymousClass5PM r3 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/take-picture taken ");
        C18260x0.A1V(A0o, r4.A0N);
        try {
            r4.A07.stopPreview();
            r4.A0M = false;
        } catch (Exception e) {
            Log.w("cameraview/take-picture error stopping camera preview", e);
        }
        r4.A0R = false;
        r4.A0T.post(new C70323aJ(r4, r3, bArr, 19));
    }

    public /* synthetic */ C162797sm(AnonymousClass5PM r1, C132906gD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
