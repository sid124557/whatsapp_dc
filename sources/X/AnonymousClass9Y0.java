package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.9Y0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y0 implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1 || motionEvent.getY() >= 0.0f) {
            return false;
        }
        return true;
    }
}
