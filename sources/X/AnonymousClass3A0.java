package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3A0  reason: invalid class name */
public final class AnonymousClass3A0 implements View.OnTouchListener {
    public long A00;
    public long A01;
    public final C56612sH A02;

    public AnonymousClass3A0(C56612sH r2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C162457s7.A0J(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.A00 = SystemClock.elapsedRealtime();
            return false;
        }
    }
}
