package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0iR  reason: invalid class name and case insensitive filesystem */
public class C10740iR implements Runnable {
    public final /* synthetic */ C07190aT A00;

    public C10740iR(C07190aT r1) {
        this.A00 = r1;
    }

    public void run() {
        C07190aT r3 = this.A00;
        r3.A01();
        View view = r3.A07;
        if (view.isEnabled() && !view.isLongClickable() && r3.A03()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            r3.A03 = true;
        }
    }
}
