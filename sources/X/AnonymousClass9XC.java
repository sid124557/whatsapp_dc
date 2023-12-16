package X;

import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.9XC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9XC implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ C202329lq A01;
    public final /* synthetic */ C194349Sn A02;

    public final void onAutoFocus(boolean z, Camera camera) {
        C192379Jm r1;
        C194349Sn r4 = this.A02;
        Point point = this.A00;
        C202329lq r2 = this.A01;
        r4.A07 = z;
        r4.A08 = false;
        if (r4.A0A) {
            r4.A04 = false;
        }
        if (z) {
            r1 = C192379Jm.SUCCESS;
        } else {
            r1 = C192379Jm.FAILED;
        }
        r4.A00(point, r1, r4.A02);
        r4.A00(point, r1, r2);
    }

    public /* synthetic */ AnonymousClass9XC(Point point, C202329lq r2, C194349Sn r3) {
        this.A02 = r3;
        this.A00 = point;
        this.A01 = r2;
    }
}
