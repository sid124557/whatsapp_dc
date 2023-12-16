package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.9SA  reason: invalid class name */
public class AnonymousClass9SA {
    public long A00;
    public C194559Tk A01;
    public C194549Tj A02;
    public AnonymousClass9WQ A03;
    public AnonymousClass96t A04;
    public C203589nz A05;
    public C194899Ux A06;
    public AnonymousClass9VT A07;
    public final C194609Ts A08;
    public final AnonymousClass9T1 A09;
    public final C194959Vh A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public Exception A00() {
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        C194559Tk r0 = this.A01;
        if (r0 != null) {
            try {
                r0.A03();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A01 = null;
        } else {
            e = null;
        }
        AnonymousClass9WQ r02 = this.A03;
        if (r02 != null) {
            AnonymousClass9T1 r1 = r02.A0H;
            r1.A01("Can only stop video recording on the Optic thread");
            r1.A01("Can only check if the prepared on the Optic thread");
        }
        this.A07 = null;
        this.A0D = false;
        return e;
    }

    public AnonymousClass9SA(C194609Ts r2, C194959Vh r3) {
        this.A0A = r3;
        this.A08 = r2;
        this.A09 = new AnonymousClass9T1(r3);
    }
}
