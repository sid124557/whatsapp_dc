package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.5fj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110125fj implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ Toolbar A03;

    public final void onScrollChanged() {
        View view = this.A02;
        int i = this.A00;
        ColorDrawable colorDrawable = this.A01;
        Toolbar toolbar = this.A03;
        int scrollY = view.getScrollY();
        if (scrollY < 0) {
            scrollY = 0;
        }
        if (scrollY <= i || colorDrawable.getAlpha() != 255) {
            float f = 1.0f;
            if (scrollY < i) {
                f = ((float) scrollY) / ((float) i);
            }
            colorDrawable.setAlpha((int) (f * 255.0f));
            toolbar.invalidate();
        }
    }

    public /* synthetic */ C110125fj(ColorDrawable colorDrawable, View view, Toolbar toolbar, int i) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = colorDrawable;
        this.A03 = toolbar;
    }
}
