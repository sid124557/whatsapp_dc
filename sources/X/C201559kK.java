package X;

import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.9kK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201559kK implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CameraManager A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ AnonymousClass9SQ A05;
    public final /* synthetic */ C195079Vu A06;
    public final /* synthetic */ AnonymousClass9ZW A07;
    public final /* synthetic */ C203559nw A08;
    public final /* synthetic */ AnonymousClass9V5 A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ boolean A0B;

    public final Object call() {
        C195079Vu r3 = this.A06;
        AnonymousClass9V5 r6 = this.A09;
        CameraManager cameraManager = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        Integer num = this.A0A;
        CaptureRequest.Builder builder = this.A04;
        C203559nw r5 = this.A08;
        boolean z = this.A0B;
        C195079Vu.A00(cameraManager, builder, this.A05, r3, this.A07, r5, r6, num, i, i2, i3, z);
        return null;
    }

    public /* synthetic */ C201559kK(CameraManager cameraManager, CaptureRequest.Builder builder, AnonymousClass9SQ r3, C195079Vu r4, AnonymousClass9ZW r5, C203559nw r6, AnonymousClass9V5 r7, Integer num, int i, int i2, int i3, boolean z) {
        this.A06 = r4;
        this.A09 = r7;
        this.A03 = cameraManager;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A0A = num;
        this.A04 = builder;
        this.A08 = r6;
        this.A0B = z;
        this.A07 = r5;
        this.A05 = r3;
    }
}
