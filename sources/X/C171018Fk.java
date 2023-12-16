package X;

import android.hardware.Camera;

/* renamed from: X.8Fk  reason: invalid class name and case insensitive filesystem */
public class C171018Fk implements C182108ns {
    public final AnonymousClass7KX A00 = new AnonymousClass7KX();
    public final /* synthetic */ C132906gD A01;

    public synchronized AnonymousClass7KX B3t() {
        AnonymousClass7KX r4;
        r4 = this.A00;
        byte[] bArr = r4.A02;
        if (bArr != null) {
            C132906gD r2 = this.A01;
            Camera camera = r2.A07;
            if (camera != null && !r2.A0R && bArr == r2.A0S) {
                camera.addCallbackBuffer(bArr);
            }
            r4.A02 = null;
        }
        while (r4.A02 == null) {
            wait();
        }
        return r4;
    }

    public C171018Fk(C132906gD r2) {
        this.A01 = r2;
    }
}
