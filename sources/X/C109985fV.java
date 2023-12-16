package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.5fV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109985fV implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FrameLayout.LayoutParams A01;
    public final /* synthetic */ HomePlaceholderActivity.HomePlaceholderView A02;
    public final /* synthetic */ HomePlaceholderActivity A03;

    public final void onGlobalLayout() {
        HomePlaceholderActivity homePlaceholderActivity = this.A03;
        int i = this.A00;
        FrameLayout.LayoutParams layoutParams = this.A01;
        HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = this.A02;
        C162457s7.A0J(layoutParams, 2);
        Rect A0N = AnonymousClass001.A0N();
        homePlaceholderActivity.getWindow().findViewById(16908290).getWindowVisibleDisplayFrame(A0N);
        int height = A0N.height() + i;
        C18260x0.A0w("currentContainerHeight ", AnonymousClass001.A0o(), height);
        if (height != homePlaceholderActivity.A00) {
            layoutParams.height = height;
            homePlaceholderView.requestLayout();
            homePlaceholderActivity.A00 = height;
        }
    }

    public /* synthetic */ C109985fV(FrameLayout.LayoutParams layoutParams, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, HomePlaceholderActivity homePlaceholderActivity, int i) {
        this.A03 = homePlaceholderActivity;
        this.A00 = i;
        this.A01 = layoutParams;
        this.A02 = homePlaceholderView;
    }
}
