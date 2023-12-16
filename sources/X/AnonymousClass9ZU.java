package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.9ZU  reason: invalid class name */
public class AnonymousClass9ZU implements C202349ls {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C194549Tj A01;
    public final /* synthetic */ AnonymousClass9ZW A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public AnonymousClass9ZU(CaptureRequest.Builder builder, C194549Tj r2, AnonymousClass9ZW r3, float[] fArr, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    public void BTh(boolean z) {
        C192379Jm r1;
        C194549Tj r5 = this.A01;
        boolean z2 = r5.A09;
        AnonymousClass9ZW r7 = this.A02;
        if (z2) {
            r5.A04(r7);
        } else {
            r7.A07 = null;
        }
        if (z) {
            r1 = C192379Jm.SUCCESS;
        } else {
            r1 = C192379Jm.FAILED;
        }
        r5.A03(r1, this.A04);
        if (!r5.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j = 4000;
            if (number == null || number.intValue() != 1) {
                if (!this.A03) {
                    j = 2000;
                }
                r5.A02(builder, r7, j);
                return;
            }
            if (!this.A03) {
                j = 2000;
            }
            synchronized (r5) {
                C204479pQ r4 = new C204479pQ(builder, r5, r7, 2);
                r5.A00();
                r5.A08 = r5.A0B.A02("monitor_auto_exposure", r4, j);
            }
        }
    }
}
