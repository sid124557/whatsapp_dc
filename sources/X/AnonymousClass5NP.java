package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.5NP  reason: invalid class name */
public final class AnonymousClass5NP {
    public final Activity A00;
    public final NestedScrollView A01;
    public final C44792Xm A02;

    public final void A00() {
        NestedScrollView nestedScrollView = this.A01;
        if (nestedScrollView.getLayoutParams().height != -1) {
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = -1;
            nestedScrollView.setLayoutParams(layoutParams2);
            nestedScrollView.post(new C69973Zj(this, 7));
        }
    }

    public AnonymousClass5NP(Activity activity, View view, C44792Xm r4) {
        this.A00 = activity;
        this.A02 = r4;
        this.A01 = (NestedScrollView) C18280x3.A0E(view, R.id.scroll_view);
    }
}
