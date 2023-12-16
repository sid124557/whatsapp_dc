package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.9kF  reason: invalid class name and case insensitive filesystem */
public class C201509kF implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C194549Tj A01;
    public final /* synthetic */ AnonymousClass9ZW A02;
    public final /* synthetic */ C203429ng A03;

    public C201509kF(CaptureRequest.Builder builder, C194549Tj r2, AnonymousClass9ZW r3, C203429ng r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = builder;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        C203429ng r3 = this.A03;
        if (r3 == null || (builder = this.A00) == null) {
            return this.A02;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, AnonymousClass001.A0f());
        CaptureRequest build = builder.build();
        AnonymousClass9ZW r2 = this.A02;
        r3.Ayh(build, (Handler) null, r2);
        return r2;
    }
}
