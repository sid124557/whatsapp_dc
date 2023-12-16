package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.0aQ  reason: invalid class name and case insensitive filesystem */
public class C07160aQ implements View.OnTouchListener {
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;
    public boolean A02 = false;
    public final GestureDetector A03;
    public final ScaleGestureDetector A04;
    public final AnonymousClass0NT A05;
    public final AnonymousClass02N A06;

    public final boolean A00(MotionEvent motionEvent) {
        int i;
        if (!(this.A00 == Float.MAX_VALUE || this.A01 == Float.MAX_VALUE)) {
            if (motionEvent.getPointerCount() <= 1 || this.A06.A02(44) == null) {
                AnonymousClass02N r4 = this.A06;
                if ((r4.A03 || !r4.A02) && r4.A02(48) != null) {
                    return true;
                }
                if (AnonymousClass002.A00(motionEvent.getY(), this.A01) > Math.abs(motionEvent.getX() - this.A00)) {
                    if (r4.A02(38) == null) {
                        i = 42;
                    }
                } else if (r4.A02(40) == null) {
                    i = 41;
                }
                if (r4.A02(i) != null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r1 != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            android.view.ScaleGestureDetector r0 = r5.A04
            r0.onTouchEvent(r7)
            android.view.ViewParent r3 = r6.getParent()
            boolean r0 = r0.isInProgress()
            r2 = 1
            if (r0 == 0) goto L_0x007e
            X.02N r1 = r5.A06
            r0 = 44
            X.48t r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x007e
            if (r3 == 0) goto L_0x0021
            r3.requestDisallowInterceptTouchEvent(r2)
            r5.A02 = r2
        L_0x0021:
            r4 = 1
        L_0x0022:
            int r1 = r7.getActionMasked()
            if (r3 == 0) goto L_0x0074
            if (r1 == 0) goto L_0x0057
            if (r1 == r2) goto L_0x004e
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 != r0) goto L_0x0074
            X.02N r0 = r5.A06
            r0.A03(r7)
        L_0x0037:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0041
            r0 = 0
            r3.requestDisallowInterceptTouchEvent(r0)
            r5.A02 = r0
        L_0x0041:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r5.A01 = r0
            r5.A00 = r0
        L_0x0048:
            X.02N r1 = r5.A06
            r0 = 0
            r1.A02 = r0
            return r2
        L_0x004e:
            X.02N r1 = r5.A06
            r0 = 0
            r1.A03 = r0
            r1.A04(r7)
            goto L_0x0037
        L_0x0057:
            float r0 = r7.getX()
            r5.A00 = r0
            float r0 = r7.getY()
            r5.A01 = r0
            goto L_0x0078
        L_0x0064:
            boolean r1 = r5.A00(r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0076
            if (r1 != 0) goto L_0x0074
            r0 = 0
            r3.requestDisallowInterceptTouchEvent(r0)
            r5.A02 = r0
        L_0x0074:
            r2 = r4
            goto L_0x0048
        L_0x0076:
            if (r1 == 0) goto L_0x0074
        L_0x0078:
            r3.requestDisallowInterceptTouchEvent(r2)
            r5.A02 = r2
            goto L_0x0074
        L_0x007e:
            android.view.GestureDetector r0 = r5.A03
            boolean r4 = r0.onTouchEvent(r7)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07160aQ.A01(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass0NT r0 = this.A05;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        View view2 = r0.A01;
        obtain.transform(view2.getMatrix());
        obtain.offsetLocation((float) view2.getLeft(), (float) view2.getTop());
        try {
            return A01(view, obtain);
        } finally {
            obtain.recycle();
        }
    }

    public C07160aQ(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, AnonymousClass0NT r4, AnonymousClass02N r5) {
        this.A06 = r5;
        this.A03 = gestureDetector;
        this.A04 = scaleGestureDetector;
        this.A05 = r4;
    }
}
