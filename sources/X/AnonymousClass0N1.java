package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0N1  reason: invalid class name */
public final class AnonymousClass0N1 {
    public final C14950qX A00;

    public boolean A00(MotionEvent motionEvent) {
        return ((C08090dJ) this.A00).A00.onTouchEvent(motionEvent);
    }

    public AnonymousClass0N1(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A00 = new C08090dJ(context, onGestureListener);
    }
}
