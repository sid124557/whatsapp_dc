package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.9TN  reason: invalid class name */
public class AnonymousClass9TN {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public int A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public int A08;
    public Context A09;
    public GestureDetector A0A;
    public VelocityTracker A0B = null;
    public C202079lL A0C = null;
    public C202419lz A0D = null;
    public C192349Jh A0E = C192349Jh.AT_REST;
    public C202429m0 A0F = null;
    public C192469Jw A0G = null;
    public boolean A0H;

    public void A00() {
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = C192349Jh.CANCELED;
        VelocityTracker velocityTracker = this.A0B;
        this.A0B = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    public final void A01() {
        if (!this.A0H) {
            Context context = this.A09;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                this.A04 = scaledPagingTouchSlop;
                this.A08 = scaledTouchSlop;
                this.A07 = scaledMinimumFlingVelocity;
                this.A06 = scaledMaximumFlingVelocity;
                this.A0H = true;
                this.A0H = true;
                this.A09 = null;
                return;
            }
            throw AnonymousClass001.A0e("Init Context must not be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 != r5) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0124, code lost:
        if (r1 != r0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0126, code lost:
        r11.A0D.BRd(r6, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.view.MotionEvent r12) {
        /*
            r11 = this;
            X.9lz r0 = r11.A0D
            r5 = 0
            if (r0 == 0) goto L_0x00f0
            int r0 = r11.A05
            if (r0 <= 0) goto L_0x00f0
            int r1 = r12.getAction()
            float r4 = r12.getX()
            float r3 = r12.getY()
            r0 = 1
            if (r1 == 0) goto L_0x00c8
            if (r1 == r0) goto L_0x0094
            r0 = 2
            if (r1 == r0) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0094
        L_0x0020:
            X.9Jh r1 = r11.A0E
            X.9Jh r0 = X.C192349Jh.DRAGGING
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
        L_0x0028:
            return r0
        L_0x0029:
            X.9Jh r1 = r11.A0E
            X.9Jh r0 = X.C192349Jh.CANCELED
            if (r1 == r0) goto L_0x0020
            X.9Jh r5 = X.C192349Jh.DRAGGING
            if (r1 == r5) goto L_0x0020
            r11.A01()
            int r10 = r11.A04
            r11.A01()
            int r9 = r11.A08
            float r0 = r11.A00
            float r0 = r4 - r0
            int r8 = (int) r0
            float r0 = r11.A01
            float r0 = r3 - r0
            int r7 = (int) r0
            int r6 = java.lang.Math.abs(r8)
            int r2 = java.lang.Math.abs(r7)
            float r1 = r11.A02
            float r0 = (float) r8
            float r1 = r1 + r0
            r11.A02 = r1
            float r1 = r11.A03
            float r0 = (float) r7
            float r1 = r1 + r0
            r11.A03 = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 <= r9) goto L_0x007d
            if (r7 >= 0) goto L_0x0078
            X.9Jw r6 = X.C192469Jw.UP
        L_0x0063:
            int r1 = r11.A05
            int r0 = r6.flag
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0090
            r11.A00 = r4
            r11.A01 = r3
            r11.A0G = r6
            X.9Jh r0 = r11.A0E
            r11.A0E = r5
            if (r0 == r5) goto L_0x0020
            goto L_0x0126
        L_0x0078:
            if (r7 <= 0) goto L_0x0090
            X.9Jw r6 = X.C192469Jw.DOWN
            goto L_0x0063
        L_0x007d:
            if (r6 <= r10) goto L_0x0020
            float r1 = (float) r6
            float r1 = r1 * r0
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            if (r8 >= 0) goto L_0x008b
            X.9Jw r6 = X.C192469Jw.LEFT
            goto L_0x0063
        L_0x008b:
            if (r8 <= 0) goto L_0x0090
            X.9Jw r6 = X.C192469Jw.RIGHT
            goto L_0x0063
        L_0x0090:
            r11.A00()
            goto L_0x0020
        L_0x0094:
            X.9m0 r0 = r11.A0F
            if (r0 == 0) goto L_0x0020
            X.9Jh r1 = r11.A0E
            X.9Jh r0 = X.C192349Jh.CANCELED
            if (r1 == r0) goto L_0x0020
            X.9Jh r0 = X.C192349Jh.DRAGGING
            if (r1 == r0) goto L_0x0020
            r11.A01()
            int r1 = r11.A08
            float r0 = r11.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r11.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.9m0 r0 = r11.A0F
            boolean r0 = r0.Bdy(r4, r3)
            if (r0 != 0) goto L_0x0028
            r11.A00()
            return r0
        L_0x00c8:
            X.9Jh r0 = X.C192349Jh.DECIDING
            r11.A0E = r0
            r0 = 0
            r11.A02 = r0
            r11.A03 = r0
            X.9lL r2 = r11.A0C
            if (r2 == 0) goto L_0x00f1
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r0 = r3 - r0
            float r1 = java.lang.Math.abs(r0)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            r11.A00()
        L_0x00f0:
            return r5
        L_0x00f1:
            r11.A00 = r4
            r11.A01 = r3
            X.9lL r0 = r11.A0C
            if (r0 == 0) goto L_0x0020
            X.9Jw r6 = r11.A0G
            if (r6 != 0) goto L_0x0118
            X.9Jw r6 = X.C192469Jw.RIGHT
            int r2 = r11.A05
            int r1 = r6.flag
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0118
            X.9Jw r6 = X.C192469Jw.DOWN
            int r1 = r6.flag
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0118
            X.9Jw r6 = X.C192469Jw.UP
            int r0 = r6.flag
            r2 = r2 & r0
            if (r2 == r0) goto L_0x0118
            X.9Jw r6 = X.C192469Jw.LEFT
        L_0x0118:
            r11.A00 = r4
            r11.A01 = r3
            r11.A0G = r6
            X.9Jh r1 = r11.A0E
            X.9Jh r0 = X.C192349Jh.DRAGGING
            r11.A0E = r0
            if (r1 == r0) goto L_0x0020
        L_0x0126:
            X.9lz r0 = r11.A0D
            r0.BRd(r6, r4, r3)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TN.A02(android.view.MotionEvent):boolean");
    }

    public AnonymousClass9TN(Context context) {
        this.A0A = new GestureDetector(context, new C195429Xt(this));
        this.A09 = context;
    }
}
