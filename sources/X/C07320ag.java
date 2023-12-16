package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.0ag  reason: invalid class name and case insensitive filesystem */
public class C07320ag implements AbsListView.OnScrollListener {
    public final /* synthetic */ C07540bC A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C07540bC r3 = this.A00;
            PopupWindow popupWindow = r3.A0B;
            if (popupWindow.getInputMethodMode() != 2 && popupWindow.getContentView() != null) {
                Handler handler = r3.A0K;
                C10770iU r0 = r3.A0O;
                handler.removeCallbacks(r0);
                r0.run();
            }
        }
    }

    public C07320ag(C07540bC r1) {
        this.A00 = r1;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
