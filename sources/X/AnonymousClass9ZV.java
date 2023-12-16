package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;

/* renamed from: X.9ZV  reason: invalid class name */
public class AnonymousClass9ZV implements C203289nS, C202909mo {
    public static final float[] A09 = new float[4];
    public static final int[] A0A = new int[18];
    public Long A00;
    public final C193929Qt A01;
    public final C202369lu A02;
    public final AnonymousClass9T9 A03;
    public final C193819Qe A04 = new C193819Qe(this);
    public final boolean A05;
    public volatile C201699ka A06 = new C201699ka("Uninitialized exception.");
    public volatile C194829Uq A07;
    public volatile Boolean A08;

    public void Ay4() {
        this.A03.A00();
    }

    public /* bridge */ /* synthetic */ Object BCH() {
        if (this.A08 == null) {
            throw AnonymousClass001.A0e("Photo capture operation hasn't completed yet.");
        } else if (this.A08.booleanValue()) {
            C194829Uq r1 = this.A07;
            if (r1 != null && (r1.A04 != null || r1.A01 != null)) {
                return r1;
            }
            throw AnonymousClass001.A0e("Photo capture data is null.");
        } else {
            throw this.A06;
        }
    }

    public AnonymousClass9ZV(boolean z) {
        AnonymousClass9UG r0 = new AnonymousClass9UG(this, 2);
        this.A02 = r0;
        this.A05 = z;
        AnonymousClass9T9 r2 = new AnonymousClass9T9();
        this.A03 = r2;
        r2.A01 = r0;
        r2.A02(10000);
        this.A01 = new C193929Qt();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOW(X.C202389lw r5, X.C203429ng r6) {
        /*
            r4 = this;
            X.9VK r3 = X.AnonymousClass9VK.A00()
            r2 = 6
            long r0 = r3.A02
            r3.A02(r2, r0)
            X.9Qt r0 = r4.A01
            X.9VM r3 = r0.A01(r5)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object r0 = r5.B3w(r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r0 == 0) goto L_0x0025
            float[] r1 = A09     // Catch:{ IllegalArgumentException -> 0x0025 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.9Mz r0 = X.AnonymousClass9VM.A0H     // Catch:{ IllegalArgumentException -> 0x0025 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0025 }
        L_0x0025:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.Object r0 = r5.B3w(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            int[] r1 = A0A     // Catch:{ IllegalArgumentException -> 0x0039 }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.9Mz r0 = X.AnonymousClass9VM.A0I     // Catch:{ IllegalArgumentException -> 0x0039 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r5.B3w(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A00 = r0
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.9T9 r0 = r4.A03
            r0.A01()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZV.BOW(X.9lw, X.9ng):void");
    }

    public void BOY(CaptureRequest captureRequest, C203429ng r5, long j, long j2) {
        AnonymousClass9VK.A00().A02 = SystemClock.elapsedRealtime();
    }

    public void BOX(C202379lv r1, C203429ng r2) {
    }
}
