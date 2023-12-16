package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.8Ob  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173038Ob implements Callable {
    public final /* synthetic */ AnonymousClass646 A00;
    public final /* synthetic */ C106005Xg A01;
    public final /* synthetic */ VoipPhysicalCamera A02;

    public final Object call() {
        return Integer.valueOf(this.A02.enableAREffectOnCameraThread(this.A01, this.A00));
    }

    public /* synthetic */ C173038Ob(AnonymousClass646 r1, C106005Xg r2, VoipPhysicalCamera voipPhysicalCamera) {
        this.A02 = voipPhysicalCamera;
        this.A01 = r2;
        this.A00 = r1;
    }
}
