package X;

import android.graphics.Point;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.whatsapp.WaEditText;

/* renamed from: X.5Bt  reason: invalid class name and case insensitive filesystem */
public class C100655Bt implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C100655Bt(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        switch (this.A02) {
            case 0:
                AnonymousClass5ZF r4 = (AnonymousClass5ZF) this.A00;
                Handler handler = (Handler) this.A01;
                int action = motionEvent.getAction();
                if (action == 0) {
                    AnonymousClass4CE r0 = r4.A02;
                    if (r0 == null) {
                        return true;
                    }
                    r0.BNH();
                    handler.sendEmptyMessageDelayed(0, (long) AnonymousClass5ZF.A0Z);
                    return true;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    handler.removeMessages(0);
                    return true;
                }
            case 1:
                C89214c6 r42 = (C89214c6) this.A00;
                if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int[] A1Z = C86664Kz.A1Z();
                view.getLocationOnScreen(A1Z);
                Point point = new Point(((int) x) + A1Z[0], ((int) y) + A1Z[1]);
                WaEditText waEditText = r42.A05;
                if (waEditText != null && waEditText.isShown() && AnonymousClass4Rn.A01(point, waEditText) && waEditText.A08(point)) {
                    r42.A06(waEditText);
                    return true;
                } else if (motionEvent.getY() < 0.0f) {
                    return true;
                } else {
                    return false;
                }
            case 2:
                AnonymousClass4Rl r2 = (AnonymousClass4Rl) this.A00;
                View view2 = (View) this.A01;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                float x2 = motionEvent.getX();
                C94024pj r43 = r2.A02;
                if (x2 >= ((float) r43.getLeft()) && motionEvent.getX() <= ((float) r43.getRight()) && motionEvent.getY() >= ((float) view2.getTop()) && motionEvent.getY() <= ((float) view2.getBottom())) {
                    return false;
                }
                r2.dismiss();
                return true;
            case 3:
                ((C112875kW) this.A01).BZA(((C113245l7) this.A00).A0e, motionEvent);
                return false;
            case 4:
                C105395Ut r44 = (C105395Ut) this.A00;
                View view3 = (View) this.A01;
                C162457s7.A0J(motionEvent, 3);
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    r44.A05();
                    return true;
                } else if (action2 == 1) {
                    view3.performClick();
                    return false;
                } else if (action2 != 3) {
                    return false;
                } else {
                    r44.A06();
                    return false;
                }
            default:
                AnonymousClass52B r1 = (AnonymousClass52B) this.A00;
                C05570Ua r3 = (C05570Ua) this.A01;
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                AnonymousClass09T r45 = r1.A00.A01;
                if (!AnonymousClass000.A1S(r45.A0H.A01(r3, r45.A0K) & 16711680)) {
                    str = "Start drag has been called but dragging is not enabled";
                } else if (r3.A0H.getParent() != r45.A0K) {
                    str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
                } else {
                    VelocityTracker velocityTracker = r45.A0E;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    r45.A0E = VelocityTracker.obtain();
                    r45.A01 = 0.0f;
                    r45.A00 = 0.0f;
                    r45.A0A(r3, 2);
                    return false;
                }
                Log.e("ItemTouchHelper", str);
                return false;
        }
    }
}
