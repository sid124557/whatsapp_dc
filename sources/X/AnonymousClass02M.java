package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.02M  reason: invalid class name */
public class AnonymousClass02M extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass09T A01;

    public AnonymousClass02M(AnonymousClass09T r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLongPress(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0049
            X.09T r3 = r5.A01
            android.view.View r1 = r3.A06(r6)
            if (r1 == 0) goto L_0x0049
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0K
            X.0Ua r2 = r0.A0H(r1)
            if (r2 == 0) goto L_0x0049
            X.0WG r4 = r3.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0K
            int r1 = r4.A01(r2, r0)
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0049
            r0 = 0
            int r1 = r6.getPointerId(r0)
            int r0 = r3.A09
            if (r1 != r0) goto L_0x0049
            int r0 = r6.findPointerIndex(r0)
            float r1 = r6.getX(r0)
            float r0 = r6.getY(r0)
            r3.A02 = r1
            r3.A03 = r0
            r0 = 0
            r3.A01 = r0
            r3.A00 = r0
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0049
            r0 = 2
            r3.A0A(r2, r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02M.onLongPress(android.view.MotionEvent):void");
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }
}
