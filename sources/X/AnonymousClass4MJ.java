package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4MJ  reason: invalid class name */
public class AnonymousClass4MJ extends Handler {
    public final /* synthetic */ AnonymousClass5TA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MJ(Looper looper, AnonymousClass5TA r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r9 <= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r5 < r3) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r19) {
        /*
            r18 = this;
            r0 = r19
            int r1 = r0.what
            r15 = 1
            r0 = r18
            X.5TA r0 = r0.A00
            X.7DN r0 = r0.A05
            if (r1 != r15) goto L_0x002d
            X.5ZS r1 = r0.A00
            X.678 r0 = r1.A0C
            boolean r0 = r0.BHi()
            if (r0 == 0) goto L_0x002c
            X.678 r0 = r1.A0C
            boolean r0 = r0.BIf()
            if (r0 != 0) goto L_0x002c
            X.4ea r0 = r1.A0A
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.BHW()
            if (r0 != 0) goto L_0x002c
            r1.A0A()
        L_0x002c:
            return
        L_0x002d:
            X.5ZS r14 = r0.A00
            X.678 r0 = r14.A0C
            boolean r0 = r0.BIf()
            X.5TA r13 = r14.A0I
            if (r0 == 0) goto L_0x00ad
            java.io.File r2 = r14.A0L
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r13.A00
            long r5 = r5 - r0
            com.whatsapp.camera.recording.RecordingView r12 = r13.A01
            java.lang.String r1 = r13.A00(r5)
            android.widget.TextView r0 = r12.A00
            r0.setText(r1)
            r11 = 0
            if (r2 == 0) goto L_0x00ab
            long r9 = r2.length()
            long r7 = r13.A03
            r16 = 0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r2 = 1
            if (r0 > 0) goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            long r3 = r13.A02
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r2 != 0) goto L_0x00a4
            if (r0 != 0) goto L_0x00a4
            r2 = 0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x00a0
            r1 = 0
        L_0x0078:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            float r2 = (float) r5
            float r0 = (float) r3
            float r2 = r2 / r0
        L_0x007f:
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = java.lang.Math.max(r1, r2)
            float r0 = r0 * r3
            int r3 = (int) r0
            com.whatsapp.CircularProgressBar r0 = r12.A01
            r0.setProgress(r3)
        L_0x008c:
            r13.A01(r15, r15, r11)
            android.os.Handler r2 = r13.A04
            r0 = 50
            r2.sendEmptyMessageDelayed(r11, r0)
            X.5Y6 r0 = r14.A0E
            com.whatsapp.CircularProgressBar r0 = r0.A05
            if (r0 == 0) goto L_0x002c
            r0.setProgress(r3)
            return
        L_0x00a0:
            float r1 = (float) r9
            float r0 = (float) r7
            float r1 = r1 / r0
            goto L_0x0078
        L_0x00a4:
            X.7DN r0 = r13.A05
            X.5ZS r0 = r0.A00
            r0.A0O(r15)
        L_0x00ab:
            r3 = 0
            goto L_0x008c
        L_0x00ad:
            boolean r1 = r14.A0Q()
            r0 = 0
            r13.A01(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MJ.handleMessage(android.os.Message):void");
    }
}
