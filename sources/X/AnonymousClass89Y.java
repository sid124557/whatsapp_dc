package X;

import android.app.PendingIntent;
import android.os.IBinder;
import java.util.Map;

/* renamed from: X.89Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass89Y implements C180878lm {
    public final C148737Jn A00;
    public final AnonymousClass6TG A01;
    public final C126966Qc A02;
    public final AnonymousClass89Z A03;
    public final C155807fX A04;

    public final void AwC(Object obj, Object obj2) {
        C128586Wr r7;
        C126966Qc r3 = this.A02;
        AnonymousClass89Z r2 = this.A03;
        C155807fX r1 = this.A04;
        AnonymousClass6TG r9 = this.A01;
        C148737Jn r4 = this.A00;
        C128556Wo r8 = new C128556Wo(new AnonymousClass8B3(r3, r2, r1), (C152017Xf) obj2);
        r9.A01 = r3.A09;
        AnonymousClass7Ng r32 = ((AnonymousClass6RX) obj).A00;
        synchronized (r32) {
            AnonymousClass6RX r22 = ((C169668Ae) r32.A01).A00;
            r22.A04();
            C151557Vg r0 = r4.A01;
            if (r0 != null) {
                Map map = r32.A04;
                synchronized (map) {
                    r7 = (C128586Wr) map.get(r0);
                    if (r7 == null) {
                        r7 = new C128586Wr(r4);
                    }
                    map.put(r0, r7);
                }
                ((C187248wq) r22.A02()).BuH(new AnonymousClass6SR((PendingIntent) null, (IBinder) null, r7, r8, r9, 1));
            }
        }
    }

    public AnonymousClass89Y(C148737Jn r1, AnonymousClass6TG r2, C126966Qc r3, AnonymousClass89Z r4, C155807fX r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
    }
}
