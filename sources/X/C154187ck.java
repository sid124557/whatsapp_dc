package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;

/* renamed from: X.7ck  reason: invalid class name and case insensitive filesystem */
public class C154187ck implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C154187ck(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final boolean A00(MotionEvent motionEvent, C154187ck r5) {
        ScaleGestureDetector scaleGestureDetector;
        C91234j9 r3 = (C91234j9) r5.A00;
        C105175Tw r2 = (C105175Tw) r5.A01;
        if (!r2.A0H || (scaleGestureDetector = r3.A01) == null || !scaleGestureDetector.onTouchEvent(motionEvent)) {
            if (!r2.A0P && !r2.A0Q) {
                return false;
            }
            r3.A0B(motionEvent, r3.A0D);
            return false;
        } else if (r2.A0P || r2.A0Q) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A02) {
            case 0:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                }
                return false;
            case 1:
                return A00(motionEvent, this);
            case 2:
                ((C185908uR) this.A01).Bff((View) this.A00, motionEvent);
                return false;
            case 3:
                ((C185908uR) this.A01).BZA((View) this.A00, motionEvent);
                return false;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                ((AnonymousClass0N1) this.A00).A00(motionEvent);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return false;
            default:
                ((AnonymousClass0N1) this.A01).A00(motionEvent);
                return true;
        }
    }
}
