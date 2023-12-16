package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.4NB  reason: invalid class name */
public class AnonymousClass4NB extends OrientationEventListener {
    public int A00 = -1;
    public final AnonymousClass7DK A01;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r14 >= 300) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r14) {
        /*
            r13 = this;
            r1 = -1
            if (r14 == r1) goto L_0x00a5
            r0 = 330(0x14a, float:4.62E-43)
            if (r14 >= r0) goto L_0x00e4
            r0 = 30
            if (r14 < r0) goto L_0x00e4
            r0 = 60
            if (r14 < r0) goto L_0x00e1
            r0 = 120(0x78, float:1.68E-43)
            if (r14 >= r0) goto L_0x00cd
            r4 = 1
        L_0x0014:
            int r0 = r13.A00
            if (r4 == r0) goto L_0x00a5
            if (r4 == r1) goto L_0x00a5
            r13.A00 = r4
            X.7DK r0 = r13.A01
            X.5ZS r2 = r0.A00
            X.4ea r0 = r2.A0A
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r2.A0Q()
            if (r0 != 0) goto L_0x00a5
            X.5Y6 r3 = r2.A0E
            int r0 = r3.A02
            int r1 = X.C86654Ky.A00(r0)
            int r5 = X.C86654Ky.A00(r4)
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != 0) goto L_0x00c5
            if (r5 != r0) goto L_0x003e
            r1 = 360(0x168, float:5.04E-43)
        L_0x003e:
            float r7 = (float) r1
            float r8 = (float) r5
            r9 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r6 = new android.view.animation.RotateAnimation
            r11 = r9
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r6.setInterpolator(r0)
            r0 = 100
            r6.setDuration(r0)
            r6.setFillAfter(r9)
            com.whatsapp.WaImageView r0 = r3.A0G
            r0.startAnimation(r6)
            com.whatsapp.WaImageView r0 = r3.A0J
            r0.startAnimation(r6)
            X.7KW r0 = r3.A06
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006f
            com.whatsapp.WaImageView r0 = r3.A0H
            r0.startAnimation(r6)
        L_0x006f:
            android.view.View r1 = r3.A0C
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x007a
            r1.startAnimation(r6)
        L_0x007a:
            r3.A00 = r5
            r3.A02 = r4
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x00bc
            r3.A07 = r9
        L_0x0084:
            X.5TA r0 = r2.A0I
            com.whatsapp.camera.recording.RecordingView r5 = r0.A01
            int r0 = X.C86654Ky.A00(r4)
            float r0 = (float) r0
            r5.setRotation(r0)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.02c r3 = (X.C001702c) r3
            r2 = -1
            r1 = 0
            if (r4 != r9) goto L_0x00a6
            r3.A0T = r1
            r3.A0p = r1
            r3.A0l = r2
        L_0x00a0:
            r3.A0B = r1
        L_0x00a2:
            r5.setLayoutParams(r3)
        L_0x00a5:
            return
        L_0x00a6:
            r0 = 3
            if (r4 != r0) goto L_0x00b0
            r3.A0T = r2
            r3.A0p = r1
            r3.A0l = r1
            goto L_0x00a0
        L_0x00b0:
            r3.A0T = r1
            r0 = 2131428483(0x7f0b0483, float:1.8478612E38)
            r3.A0p = r0
            r3.A0l = r1
            r3.A0B = r2
            goto L_0x00a2
        L_0x00bc:
            if (r4 == r9) goto L_0x00c1
            r0 = 3
            if (r4 != r0) goto L_0x0084
        L_0x00c1:
            r2.A09()
            goto L_0x0084
        L_0x00c5:
            if (r1 != r0) goto L_0x003e
            if (r5 != 0) goto L_0x003e
            r5 = 360(0x168, float:5.04E-43)
            goto L_0x003e
        L_0x00cd:
            r0 = 150(0x96, float:2.1E-43)
            if (r14 < r0) goto L_0x00e1
            r0 = 210(0xd2, float:2.94E-43)
            if (r14 >= r0) goto L_0x00d8
            r4 = 2
            goto L_0x0014
        L_0x00d8:
            r0 = 240(0xf0, float:3.36E-43)
            if (r14 < r0) goto L_0x00e1
            r0 = 300(0x12c, float:4.2E-43)
            r4 = 3
            if (r14 < r0) goto L_0x0014
        L_0x00e1:
            r4 = -1
            goto L_0x0014
        L_0x00e4:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NB.onOrientationChanged(int):void");
    }

    public AnonymousClass4NB(Context context, AnonymousClass7DK r3) {
        super(context);
        this.A01 = r3;
    }
}
