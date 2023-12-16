package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.9ZW  reason: invalid class name */
public class AnonymousClass9ZW implements C203289nS, C202909mo {
    public static int A0J = 16;
    public static int A0K = 400;
    public static long A0L = 30000000;
    public static int A0M;
    public static boolean A0N;
    public static boolean A0O;
    public static final float[] A0P = new float[4];
    public static final int[] A0Q = new int[18];
    public int A00 = 0;
    public C192999Mo A01;
    public C193019Mq A02;
    public C201699ka A03;
    public C193039Ms A04;
    public AnonymousClass9Mt A05;
    public C193929Qt A06;
    public C202349ls A07;
    public C202359lt A08;
    public C203429ng A09;
    public Boolean A0A;
    public Integer A0B;
    public boolean A0C;
    public final C202369lu A0D;
    public final AnonymousClass9T9 A0E;
    public volatile int A0F = 0;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;

    public final void A00(C203429ng r5) {
        if (this.A0F == 1) {
            this.A0F = 0;
            this.A0A = Boolean.TRUE;
            this.A09 = r5;
            this.A0E.A01();
            C202359lt r1 = this.A08;
            if (r1 != null) {
                C195159Wi r12 = (C195159Wi) r1;
                int i = r12.A01;
                AnonymousClass9WQ r3 = (AnonymousClass9WQ) r12.A00;
                if (i == 0) {
                    AnonymousClass9WT.A00();
                    if (!r3.A0L.A00.isEmpty()) {
                        AnonymousClass9WU.A00(new C198709fM(r3));
                    }
                }
                r3.A0N.A07("handle_preview_started", new C204469pP((Object) r3, 13));
                return;
            }
            return;
        }
        throw AnonymousClass002.A0E("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    public final void A01(C203429ng r3) {
        if (this.A0F == 7) {
            this.A0F = 0;
            this.A0A = Boolean.TRUE;
            this.A09 = r3;
            this.A0E.A01();
            return;
        }
        throw AnonymousClass002.A0E("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public void Ay4() {
        this.A0E.A00();
    }

    public /* bridge */ /* synthetic */ Object BCH() {
        Boolean bool = this.A0A;
        if (bool == null) {
            throw AnonymousClass001.A0e("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A09;
        } else {
            throw this.A03;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:19|20|21|(1:23)|24|25|(1:27)|28|(2:31|(2:33|(1:35)(2:96|(2:98|99))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fe, code lost:
        if (r0 != 5) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010b, code lost:
        if (r7.intValue() != 4) goto L_0x010d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ IllegalArgumentException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOW(X.C202389lw r10, X.C203429ng r11) {
        /*
            r9 = this;
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x01f8
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x003a
            int r2 = r0.intValue()
            int r0 = r9.A00
            if (r2 == r0) goto L_0x003a
            r9.A00 = r2
            X.9Mt r0 = r9.A05
            if (r0 == 0) goto L_0x003a
            X.9pQ r1 = r0.A00
            java.lang.Object r4 = r1.A00
            X.9Tj r4 = (X.C194549Tj) r4
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x003a
            r0 = 1
            if (r2 != r0) goto L_0x003a
            java.lang.Object r3 = r1.A02
            android.hardware.camera2.CaptureRequest$Builder r3 = (android.hardware.camera2.CaptureRequest.Builder) r3
            java.lang.Object r2 = r1.A01
            X.9ZW r2 = (X.AnonymousClass9ZW) r2
            r0 = 0
            r4.A02(r3, r2, r0)
        L_0x003a:
            boolean r0 = r9.A0I
            if (r0 == 0) goto L_0x0084
            X.9Qt r0 = r9.A06
            if (r0 == 0) goto L_0x0084
            X.9VM r3 = r0.A01(r10)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Object r0 = r10.B3w(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x005b
            float[] r1 = A0P     // Catch:{ IllegalArgumentException -> 0x005b }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005b }
            X.9Mz r0 = X.AnonymousClass9VM.A0H     // Catch:{ IllegalArgumentException -> 0x005b }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x005b }
        L_0x005b:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.Object r0 = r10.B3w(r0)     // Catch:{ IllegalArgumentException -> 0x006f }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r0 == 0) goto L_0x006f
            int[] r1 = A0Q     // Catch:{ IllegalArgumentException -> 0x006f }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x006f }
            X.9Mz r0 = X.AnonymousClass9VM.A0I     // Catch:{ IllegalArgumentException -> 0x006f }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            X.9Ms r0 = r9.A04
            if (r0 == 0) goto L_0x0084
            X.9S3 r1 = r0.A00
            r1.A02 = r9
            X.9Vh r0 = r1.A04
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0151
            r1.A00()
        L_0x0084:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x008d
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            r10.B3w(r0)
        L_0x008d:
            X.9Mq r0 = r9.A02
            if (r0 == 0) goto L_0x00da
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r1 = r10.B3w(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r7 = r10.B3w(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r1 == 0) goto L_0x00da
            if (r7 == 0) goto L_0x00da
            boolean r0 = A0O
            r8 = 0
            long r1 = r1.longValue()
            if (r0 != 0) goto L_0x0134
            long r3 = A0L
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x014e
            int r1 = r7.intValue()
            int r0 = A0K
            if (r1 <= r0) goto L_0x014e
        L_0x00bc:
            r1 = 1
        L_0x00bd:
            boolean r0 = A0N
            if (r1 == r0) goto L_0x012d
            A0N = r1
            A0M = r8
            r1 = 0
        L_0x00c6:
            int r0 = A0J
            if (r1 < r0) goto L_0x00da
            X.9Mq r1 = r9.A02
            X.9fL r0 = new X.9fL
            r0.<init>(r1)
            X.AnonymousClass9WU.A00(r0)
            boolean r0 = A0N
            A0O = r0
            A0M = r8
        L_0x00da:
            X.9ls r0 = r9.A07
            r3 = 0
            r2 = 1
            r4 = 5
            r5 = 4
            if (r0 == 0) goto L_0x0111
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r7 = r10.B3w(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x0100
            X.9ls r6 = r9.A07
            if (r6 == 0) goto L_0x00f8
            int r1 = r7.intValue()
            if (r1 != r2) goto L_0x0119
            r9.A0C = r2
        L_0x00f8:
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x0100
            if (r0 != r4) goto L_0x0111
        L_0x0100:
            X.9ls r6 = r9.A07
            if (r6 == 0) goto L_0x0111
            if (r7 == 0) goto L_0x010d
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            r6.BTh(r0)
        L_0x0111:
            int r0 = r9.A0F
            if (r0 != r2) goto L_0x0160
            r9.A00(r11)
            return
        L_0x0119:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x00f8
            r0 = 2
            if (r1 != r0) goto L_0x0126
            r6.BTh(r2)
        L_0x0123:
            r9.A0C = r3
            goto L_0x00f8
        L_0x0126:
            r0 = 6
            if (r1 != r0) goto L_0x00f8
            r6.BTh(r3)
            goto L_0x0123
        L_0x012d:
            int r0 = A0M
            int r1 = r0 + 1
            A0M = r1
            goto L_0x00c6
        L_0x0134:
            double r3 = (double) r1
            long r5 = A0L
            double r1 = (double) r5
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 * r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014e
            int r0 = r7.intValue()
            double r3 = (double) r0
            int r0 = A0K
            double r1 = (double) r0
            double r1 = r1 * r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014e
            goto L_0x00bc
        L_0x014e:
            r1 = 0
            goto L_0x00bd
        L_0x0151:
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x0084
            X.9Vh r2 = r1.A04     // Catch:{ Exception -> 0x0084 }
            java.util.concurrent.Callable r1 = r1.A0A     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "onFrameCaptured"
            r2.A07(r0, r1)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0084
        L_0x0160:
            int r1 = r9.A0F
            r0 = 7
            if (r1 != r0) goto L_0x0169
            r9.A01(r11)
            return
        L_0x0169:
            int r0 = r9.A0F
            r1 = 2
            if (r0 != r1) goto L_0x0196
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x018a
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x018a
            if (r0 != r4) goto L_0x01f8
        L_0x018a:
            int r0 = r9.A0F
            if (r0 != r1) goto L_0x01f8
        L_0x018e:
            r9.A0F = r3
            X.9T9 r0 = r9.A0E
            r0.A01()
            return
        L_0x0196:
            int r1 = r9.A0F
            r0 = 3
            if (r1 != r0) goto L_0x01b0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
            if (r0 == 0) goto L_0x01ad
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x01f8
        L_0x01ad:
            r9.A0F = r5
            return
        L_0x01b0:
            int r0 = r9.A0F
            if (r0 != r5) goto L_0x01c7
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
            if (r0 == 0) goto L_0x018e
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x01f8
            goto L_0x018e
        L_0x01c7:
            int r0 = r9.A0F
            r1 = 6
            if (r0 != r4) goto L_0x01e1
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
            if (r0 == 0) goto L_0x01de
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x01f8
        L_0x01de:
            r9.A0F = r1
            return
        L_0x01e1:
            int r0 = r9.A0F
            if (r0 != r1) goto L_0x01f8
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.B3w(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
            if (r0 == 0) goto L_0x018e
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x01f8
            goto L_0x018e
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZW.BOW(X.9lw, X.9ng):void");
    }

    public void BOX(C202379lv r3, C203429ng r4) {
        if (!this.A0H) {
            return;
        }
        if (this.A0F == 1 || this.A0F == 7) {
            this.A0F = 0;
            this.A0A = Boolean.FALSE;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to start operation. Reason: ");
            this.A03 = new C201699ka(AnonymousClass000.A0h(A0o, r3.BBx()));
            if (this.A01 != null) {
                r3.BBx();
            }
            this.A0E.A01();
        }
    }

    public void BOY(CaptureRequest captureRequest, C203429ng r4, long j, long j2) {
        if (!this.A0H) {
            return;
        }
        if (this.A0F == 1) {
            A00(r4);
        } else if (this.A0F == 7) {
            A01(r4);
        }
    }

    public AnonymousClass9ZW() {
        AnonymousClass9UG r1 = new AnonymousClass9UG(this, 0);
        this.A0D = r1;
        this.A0H = true;
        AnonymousClass9T9 r0 = new AnonymousClass9T9();
        this.A0E = r0;
        r0.A01 = r1;
    }
}
