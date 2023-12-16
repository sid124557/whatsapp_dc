package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.9kH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201529kH implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ AnonymousClass96n A01;
    public final /* synthetic */ AnonymousClass9ZW A02;
    public final /* synthetic */ boolean A03;

    public final Object call() {
        AnonymousClass96n r0 = this.A01;
        CaptureRequest.Builder builder = this.A00;
        AnonymousClass9ZW r3 = this.A02;
        boolean z = this.A03;
        AnonymousClass9SA r1 = r0.A02;
        r1.A00();
        C194549Tj r02 = r1.A02;
        if (r02 != null) {
            r02.A01(builder, r3);
        }
        AnonymousClass9WQ r12 = r1.A03;
        if (r12 == null) {
            return null;
        }
        r12.A09(z, true);
        return null;
    }

    public /* synthetic */ C201529kH(CaptureRequest.Builder builder, AnonymousClass96n r2, AnonymousClass9ZW r3, boolean z) {
        this.A01 = r2;
        this.A00 = builder;
        this.A02 = r3;
        this.A03 = z;
    }
}
