package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0aP  reason: invalid class name and case insensitive filesystem */
public class C07150aP implements View.OnTouchListener {
    public final /* synthetic */ C07540bC A00;

    public C07150aP(C07540bC r1) {
        this.A00 = r1;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            C07540bC r2 = this.A00;
            PopupWindow popupWindow = r2.A0B;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
                return false;
            }
            r2.A0K.postDelayed(r2.A0O, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            C07540bC r0 = this.A00;
            r0.A0K.removeCallbacks(r0.A0O);
            return false;
        }
    }
}
