package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.9Xt  reason: invalid class name and case insensitive filesystem */
public class C195429Xt implements GestureDetector.OnGestureListener {
    public final /* synthetic */ AnonymousClass9TN A00;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onFling(android.view.MotionEvent r10, android.view.MotionEvent r11, float r12, float r13) {
        /*
            r9 = this;
            r1 = 0
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.9Jw r8 = X.C192469Jw.RIGHT
        L_0x000b:
            X.9TN r5 = r9.A00
            X.9Jw r2 = X.C192469Jw.LEFT
            int r7 = r5.A05
            int r1 = r2.flag
            r0 = r7 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001f
            if (r8 == r2) goto L_0x0029
        L_0x001f:
            X.9Jw r2 = X.C192469Jw.RIGHT
            int r1 = r2.flag
            r0 = r7 & r1
            if (r0 != r1) goto L_0x0045
            if (r8 != r2) goto L_0x0045
        L_0x0029:
            r3 = 1
        L_0x002a:
            X.9Jw r2 = X.C192469Jw.DOWN
            int r1 = r2.flag
            r0 = r7 & r1
            if (r0 != r1) goto L_0x0034
            if (r8 == r2) goto L_0x003d
        L_0x0034:
            X.9Jw r1 = X.C192469Jw.UP
            int r0 = r1.flag
            r7 = r7 & r0
            if (r7 != r0) goto L_0x0043
            if (r8 != r1) goto L_0x0043
        L_0x003d:
            r0 = 1
        L_0x003e:
            if (r3 != 0) goto L_0x0054
            if (r0 != 0) goto L_0x0054
            return r4
        L_0x0043:
            r0 = 0
            goto L_0x003e
        L_0x0045:
            r3 = 0
            goto L_0x002a
        L_0x0047:
            X.9Jw r8 = X.C192469Jw.LEFT
            goto L_0x000b
        L_0x004a:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            X.9Jw r8 = X.C192469Jw.DOWN
            goto L_0x000b
        L_0x0051:
            X.9Jw r8 = X.C192469Jw.UP
            goto L_0x000b
        L_0x0054:
            X.9lz r1 = r5.A0D
            r11.getX()
            r11.getY()
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A0E = r0
            r1.A01()
            X.9Jh r0 = X.C192349Jh.AT_REST
            r5.A0E = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195429Xt.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public C195429Xt(AnonymousClass9TN r1) {
        this.A00 = r1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }
}
