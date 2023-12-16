package X;

import android.view.ViewParent;

/* renamed from: X.0iQ  reason: invalid class name and case insensitive filesystem */
public class C10730iQ implements Runnable {
    public final /* synthetic */ C07190aT A00;

    public C10730iQ(C07190aT r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
