package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6EN  reason: invalid class name */
public class AnonymousClass6EN extends GestureDetector.SimpleOnGestureListener {
    public final AnonymousClass7DO A00;

    public AnonymousClass6EN(AnonymousClass7DO r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return true;
        }
        this.A00.A00.A00(f);
        return true;
    }
}
