package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: X.0ij  reason: invalid class name and case insensitive filesystem */
public class C10920ij implements Runnable {
    public final /* synthetic */ C07180aS A00;

    public C10920ij(C07180aS r1) {
        this.A00 = r1;
    }

    public void run() {
        C07180aS r7 = this.A00;
        if (r7.A03) {
            if (r7.A06) {
                r7.A06 = false;
                C04360Nx r5 = r7.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                r5.A06 = currentAnimationTimeMillis;
                r5.A07 = -1;
                r5.A05 = currentAnimationTimeMillis;
                r5.A00 = 0.5f;
            }
            C04360Nx r9 = r7.A0F;
            if ((r9.A07 <= 0 || AnimationUtils.currentAnimationTimeMillis() <= r9.A07 + ((long) r9.A02)) && r7.A02()) {
                if (r7.A05) {
                    r7.A05 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    r7.A0C.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (r9.A05 != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float A002 = r9.A00(currentAnimationTimeMillis2);
                    r9.A05 = currentAnimationTimeMillis2;
                    ListView listView = r7.A0E;
                    AnonymousClass0IJ.A00(listView, (int) (((float) (currentAnimationTimeMillis2 - r9.A05)) * ((-4.0f * A002 * A002) + (A002 * 4.0f)) * r9.A01));
                    AnonymousClass0YY.A07(r7.A0C, this);
                    return;
                }
                throw AnonymousClass002.A0E("Cannot compute scroll delta before calling start()");
            }
            r7.A03 = false;
        }
    }
}
