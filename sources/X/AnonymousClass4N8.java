package X;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.4N8  reason: invalid class name */
public class AnonymousClass4N8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C113245l7 A00;

    public AnonymousClass4N8(C113245l7 r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C113245l7 r5 = this.A00;
        if (C86634Kw.A1X(r5.A4P) && Math.abs(f) < Math.abs(f2) && f2 < 0.0f) {
            C93894pW r4 = r5.A34.A03;
            C624134x A0G = r5.A3B.A0G();
            if (A0G != null) {
                AnonymousClass5KV r1 = r5.A2c;
                C162457s7.A0J(motionEvent, 0);
                FrameLayout frameLayout = r1.A04;
                AnonymousClass66R r12 = r1.A06;
                frameLayout.getGlobalVisibleRect((Rect) r12.getValue());
                if (((Rect) r12.getValue()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && r4.A00(A0G)) {
                    r4.A01(r5, A0G);
                    return true;
                }
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
