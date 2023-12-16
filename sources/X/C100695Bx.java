package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.CircularRevealView;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5Bx  reason: invalid class name and case insensitive filesystem */
public class C100695Bx implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C100695Bx(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public static final boolean A00(MotionEvent motionEvent, View view, C100695Bx r11) {
        AnonymousClass51x r4 = (AnonymousClass51x) r11.A00;
        PointF pointF = (PointF) r11.A01;
        AtomicLong atomicLong = (AtomicLong) r11.A02;
        if (r4.A00.A0O != 4) {
            return false;
        }
        r4.A08();
        if (motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (r4.A08() instanceof C985651j) {
                    C985651j r8 = (C985651j) r4.A08();
                    boolean A0C = r8.A0C(motionEvent.getX(), motionEvent.getY(), false);
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    Rect A0N = AnonymousClass001.A0N();
                    View view2 = r8.A01;
                    if (view2 != null) {
                        view2.getGlobalVisibleRect(A0N);
                    }
                    if (A0N.contains((int) x, (int) y)) {
                        return false;
                    }
                    if (A0C) {
                        return true;
                    }
                }
                pointF.set(motionEvent.getX(), motionEvent.getY());
                atomicLong.set(SystemClock.elapsedRealtime());
                r4.A0B();
                Handler handler = r4.A09;
                Runnable runnable = r4.A0c;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 500);
            } else if (action == 1) {
                if (r4.A08() instanceof C985651j) {
                    C985651j r6 = (C985651j) r4.A08();
                    boolean A0C2 = r6.A0C(motionEvent.getX(), motionEvent.getY(), true);
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    Rect A0N2 = AnonymousClass001.A0N();
                    View view3 = r6.A01;
                    if (view3 != null) {
                        view3.getGlobalVisibleRect(A0N2);
                    }
                    boolean contains = A0N2.contains((int) x2, (int) y2);
                    if (A0C2 || contains) {
                        return true;
                    }
                }
                pointF.set(motionEvent.getX(), motionEvent.getY());
                r4.A0C();
                view.performClick();
            }
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        r4.A0C();
        r4.A0F();
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A03 != 0) {
            return A00(motionEvent, view, this);
        }
        AnonymousClass4Rp r3 = (AnonymousClass4Rp) this.A00;
        if (motionEvent.getAction() != 4) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            float y = motionEvent.getY();
            FrameLayout frameLayout = r3.A08;
            if (y >= ((float) frameLayout.getTop()) && motionEvent.getY() <= ((float) frameLayout.getBottom())) {
                float x = motionEvent.getX();
                CircularRevealView circularRevealView = r3.A0B;
                if (x >= ((float) circularRevealView.getLeft()) && motionEvent.getX() <= ((float) circularRevealView.getRight())) {
                    return false;
                }
            }
        }
        r3.dismiss();
        return true;
    }
}
