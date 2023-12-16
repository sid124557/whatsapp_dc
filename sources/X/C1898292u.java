package X;

import android.hardware.Camera;

/* renamed from: X.92u  reason: invalid class name and case insensitive filesystem */
public class C1898292u implements Camera.PreviewCallback {
    public Object A00;
    public final int A01;

    public C1898292u(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.A01 != 0) {
            AnonymousClass6EW r3 = (AnonymousClass6EW) this.A00;
            r3.A05.post(new C70133a0(r3, 41, bArr));
            return;
        }
        ((C132906gD) this.A00).A0I.A01("cameraView1");
    }
}
