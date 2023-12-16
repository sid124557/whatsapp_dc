package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.0ao  reason: invalid class name and case insensitive filesystem */
public class C07400ao implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ C003704e A01;

    public C07400ao(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, C003704e r2) {
        this.A01 = r2;
        this.A00 = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}
