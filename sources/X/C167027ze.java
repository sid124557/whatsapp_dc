package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

/* renamed from: X.7ze  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C167027ze implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ LinearLayout A01;
    public final /* synthetic */ RelativeLayout A02;
    public final /* synthetic */ ScrollView A03;

    public final void onScrollChanged() {
        RelativeLayout relativeLayout = this.A02;
        ScrollView scrollView = this.A03;
        float f = this.A00;
        LinearLayout linearLayout = this.A01;
        C162457s7.A0J(relativeLayout, 0);
        C162457s7.A0J(linearLayout, 3);
        float f2 = 0.0f;
        if (scrollView.canScrollVertically(-1)) {
            f2 = f;
        }
        AnonymousClass0YZ.A0B(relativeLayout, f2);
        if (!scrollView.canScrollVertically(1)) {
            f = 0.0f;
        }
        AnonymousClass0YZ.A0B(linearLayout, f);
    }

    public /* synthetic */ C167027ze(LinearLayout linearLayout, RelativeLayout relativeLayout, ScrollView scrollView, float f) {
        this.A02 = relativeLayout;
        this.A03 = scrollView;
        this.A00 = f;
        this.A01 = linearLayout;
    }
}
