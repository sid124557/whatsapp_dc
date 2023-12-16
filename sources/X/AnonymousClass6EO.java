package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6EO  reason: invalid class name */
public class AnonymousClass6EO extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C181648n6 A00;
    public final /* synthetic */ C125406Hx A01;

    public AnonymousClass6EO(C181648n6 r1, C125406Hx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C181648n6 r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        return r0.Bcj();
    }
}
