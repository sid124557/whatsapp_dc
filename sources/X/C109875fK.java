package X;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.5fK  reason: invalid class name and case insensitive filesystem */
public class C109875fK implements View.OnTouchListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Dialog A03;

    public C109875fK(Dialog dialog, Rect rect) {
        this.A03 = dialog;
        this.A00 = rect.left;
        this.A02 = rect.top;
        this.A01 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.A00 + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.A02 + findViewById.getTop();
        if (AnonymousClass4L0.A09((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (float) ((-this.A01) - 1);
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.A03.onTouchEvent(obtain);
    }
}
