package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;
import org.pjsip.PjCamera;

/* renamed from: X.91H  reason: invalid class name */
public class AnonymousClass91H implements Callable {
    public Object A00;
    public final int A01;

    public AnonymousClass91H(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static Object A00(VoipPhysicalCamera voipPhysicalCamera, int i) {
        return voipPhysicalCamera.syncRunOnCameraThread(new AnonymousClass91H(voipPhysicalCamera, i), -100);
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        switch (this.A01) {
            case 0:
                C172208Kc r5 = (C172208Kc) this.A00;
                synchronized (r5) {
                    if (r5.A04 != null) {
                        while (r5.A03 > r5.A01) {
                            r5.A06(C18310x6.A0q(AnonymousClass001.A0w(AnonymousClass001.A0u(r5.A0B))));
                        }
                        if (r5.A07()) {
                            r5.A05();
                            r5.A00 = 0;
                        }
                    }
                }
                return null;
            case 2:
                return ((AnonymousClass1I8) this.A00).A07();
            case 3:
                C172228Ke r1 = (C172228Ke) this.A00;
                synchronized (r1) {
                    if (r1.A03 != null) {
                        r1.A0A();
                        if (r1.A0C()) {
                            r1.A0B();
                            r1.A00 = 0;
                        }
                    }
                }
                return null;
            case 4:
                AnonymousClass8KC r2 = (AnonymousClass8KC) this.A00;
                if (r2.A04 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("voip/CoreVideoPort/ releasing surface texture holder for ");
                    C18260x0.A0o(r2.A0F, A0o);
                    r2.A04.A00();
                    C626936e.A03(r2.A0B);
                    r2.A04 = null;
                }
                i = 0;
                break;
            case 5:
                ((AnonymousClass8KC) this.A00).A07();
                i = 0;
                break;
            case 6:
                return Boolean.valueOf(((AnonymousClass8KC) this.A00).A0E());
            case 7:
                AnonymousClass8KC r12 = (AnonymousClass8KC) this.A00;
                if (r12.A0E()) {
                    i = r12.A05(AnonymousClass8KC.A0N);
                    break;
                } else {
                    i = -6;
                    break;
                }
            case 8:
                AnonymousClass8KC r13 = (AnonymousClass8KC) this.A00;
                try {
                    AnonymousClass7X0 r6 = r13.A04;
                    if (r6 != null) {
                        return r6;
                    }
                    AnonymousClass7X0 r62 = new AnonymousClass7X0();
                    if (r62.A00 == 0) {
                        Log.e("voip/video/SurfaceTextureHolder/createSurfaceTexture, failed to generate gl texture");
                        r62.A00();
                        r62 = null;
                    }
                    r13.A04 = r62;
                    return r62;
                } catch (RuntimeException e) {
                    Log.e((Throwable) e);
                    return null;
                }
            case 9:
                ((AnonymousClass8KC) this.A00).A08();
                i = 0;
                break;
            case 10:
                i = 0;
                ((AnonymousClass8KC) this.A00).A0M = false;
                break;
            case 11:
                i = ((AnonymousClass8KC) this.A00).A01();
                break;
            case 13:
                return ((C140326tY) this.A00).A00();
            case 14:
                ((C138516qV) this.A00).A03();
                i = 0;
                break;
            case 15:
                i = ((VoipPhysicalCamera) this.A00).disableAREffectOnCameraThread();
                break;
            case 16:
                i = ((VoipPhysicalCamera) this.A00).startOnCameraThread();
                break;
            case 17:
                return ((VoipPhysicalCamera) this.A00).lambda$stop$5();
            case 18:
                i = ((PjCamera) this.A00).updatePreviewOrientationOnCameraThread();
                break;
            default:
                return this.A00;
        }
        return Integer.valueOf(i);
    }
}
