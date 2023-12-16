package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2td  reason: invalid class name and case insensitive filesystem */
public class C57432td implements View.OnTouchListener {
    public final int A00;

    public C57432td(int i) {
        this.A00 = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                return true;
            case 1:
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            default:
                view.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                view.getParent().getParent().requestDisallowInterceptTouchEvent(false);
                view.performClick();
                return false;
        }
    }
}
