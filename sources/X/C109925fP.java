package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.View;

/* renamed from: X.5fP  reason: invalid class name and case insensitive filesystem */
public class C109925fP implements View.OnTouchListener, View.OnLongClickListener {
    public PointF A00 = null;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03 = new Handler();
    public final /* synthetic */ View.OnTouchListener A04;
    public final /* synthetic */ C113245l7 A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ Runnable A07;

    public C109925fP(View.OnTouchListener onTouchListener, C113245l7 r3, Runnable runnable, Runnable runnable2) {
        this.A05 = r3;
        this.A06 = runnable;
        this.A04 = onTouchListener;
        this.A07 = runnable2;
    }

    public final boolean A00() {
        if (!this.A01) {
            return false;
        }
        this.A00 = null;
        this.A01 = false;
        this.A02 = false;
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A07.run();
        return true;
    }

    public boolean onLongClick(View view) {
        return A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r3 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r2) goto L_0x004b
            r0 = 2
            if (r3 == r0) goto L_0x0017
            r0 = 3
            if (r3 == r0) goto L_0x0057
        L_0x0010:
            android.view.View$OnTouchListener r0 = r5.A04
            boolean r0 = r0.onTouch(r6, r7)
            return r0
        L_0x0017:
            android.graphics.PointF r0 = r5.A00
            if (r0 == 0) goto L_0x0010
            X.5l7 r4 = r5.A05
            java.lang.Integer r0 = r4.A6A
            if (r0 == 0) goto L_0x0010
            float r2 = r7.getX()
            android.graphics.PointF r0 = r5.A00
            float r0 = r0.x
            float r2 = r2 - r0
            float r1 = r7.getY()
            android.graphics.PointF r0 = r5.A00
            float r0 = r0.y
            float r1 = r1 - r0
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r2 = r2 + r1
            double r0 = (double) r2
            double r2 = java.lang.Math.sqrt(r0)
            float r1 = (float) r2
            java.lang.Integer r0 = r4.A6A
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            r5.A00()
            goto L_0x0010
        L_0x004b:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0057
            r0 = 0
            r5.A02 = r0
            java.lang.Runnable r0 = r5.A06
            r0.run()
        L_0x0057:
            android.os.Handler r0 = r5.A03
            r0.removeCallbacksAndMessages(r1)
            goto L_0x0010
        L_0x005d:
            r5.A01 = r2
            X.5l7 r4 = r5.A05
            java.lang.Integer r0 = r4.A6A
            if (r0 == 0) goto L_0x0071
            float r1 = r7.getX()
            float r0 = r7.getY()
            android.graphics.PointF r1 = X.AnonymousClass4L0.A08(r1, r0)
        L_0x0071:
            r5.A00 = r1
            r5.A02 = r2
            android.os.Handler r3 = r5.A03
            r0 = 7
            X.5sE r2 = X.C117625sE.A00(r5, r0)
            X.1VX r1 = r4.A41
            r0 = 5348(0x14e4, float:7.494E-42)
            int r1 = r1.A0N(r0)
            r0 = 50
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 500(0x1f4, float:7.0E-43)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109925fP.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
