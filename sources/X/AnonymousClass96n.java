package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;

/* renamed from: X.96n  reason: invalid class name */
public class AnonymousClass96n extends AnonymousClass9SG {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ AnonymousClass9SG A01;
    public final /* synthetic */ AnonymousClass9SA A02;
    public final /* synthetic */ AnonymousClass9ZW A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass96n(CaptureRequest.Builder builder, AnonymousClass9SG r2, AnonymousClass9SA r3, AnonymousClass9ZW r4, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = builder;
        this.A03 = r4;
        this.A04 = z;
    }

    public void A00(Exception exc) {
        this.A01.A00(exc);
        this.A02.A0A.A00((AnonymousClass9SG) null, "restart_preview_video_recording_failed", new C201529kH(this.A00, this, this.A03, this.A04));
    }

    public /* bridge */ /* synthetic */ void A01(Object obj) {
        this.A02.A00 = SystemClock.elapsedRealtime();
        this.A01.A01(obj);
    }
}
