package X;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;

/* renamed from: X.9Yt  reason: invalid class name and case insensitive filesystem */
public class C195609Yt implements TouchServiceImpl.HitTestCallback {
    public final /* synthetic */ C194379Sq A00;

    public C195609Yt(C194379Sq r1) {
        this.A00 = r1;
    }

    public void hitTestResult(long j, boolean z) {
        this.A00.A03.post(new AnonymousClass9j0(this, j, z));
    }
}
