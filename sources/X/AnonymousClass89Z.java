package X;

import android.app.PendingIntent;
import android.os.IBinder;
import java.util.Map;

/* renamed from: X.89Z  reason: invalid class name */
public final class AnonymousClass89Z implements C180878lm {
    public boolean A00;
    public final /* synthetic */ C148737Jn A01;
    public final /* synthetic */ C126966Qc A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass89Z(C148737Jn r1, C126966Qc r2) {
        this();
        this.A02 = r2;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void AwC(Object obj, Object obj2) {
        AnonymousClass6RX r10 = (AnonymousClass6RX) obj;
        C152017Xf r11 = (C152017Xf) obj2;
        if (this.A00) {
            C128546Wn r6 = new C128546Wn(r11);
            try {
                C151557Vg r3 = this.A01.A01;
                if (r3 != null) {
                    AnonymousClass7Ng r1 = r10.A00;
                    AnonymousClass6RX r2 = ((C169668Ae) r1.A01).A00;
                    r2.A04();
                    Map map = r1.A04;
                    synchronized (map) {
                        C128586Wr r5 = (C128586Wr) map.remove(r3);
                        if (r5 != null) {
                            synchronized (r5) {
                                C148737Jn r0 = r5.A00;
                                r0.A02 = null;
                                r0.A01 = null;
                            }
                            ((C187248wq) r2.A02()).BuH(new AnonymousClass6SR((PendingIntent) null, (IBinder) null, r5, r6, (AnonymousClass6TG) null, 2));
                        }
                    }
                }
            } catch (RuntimeException e) {
                r11.A01(e);
            }
        }
    }

    public AnonymousClass89Z() {
        this.A00 = true;
    }
}
