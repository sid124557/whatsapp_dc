package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7d8  reason: invalid class name and case insensitive filesystem */
public class C154417d8 implements View.OnTouchListener {
    public final int A00;

    public C154417d8(int i) {
        this.A00 = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return true;
        }
        return false;
    }
}
