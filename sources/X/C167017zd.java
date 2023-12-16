package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: X.7zd  reason: invalid class name and case insensitive filesystem */
public class C167017zd implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C178828iA A02;
    public final /* synthetic */ ExpandableBehavior A03;

    public C167017zd(View view, C178828iA r2, ExpandableBehavior expandableBehavior, int i) {
        this.A03 = expandableBehavior;
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A01;
        AnonymousClass0x7.A16(view, this);
        ExpandableBehavior expandableBehavior = this.A03;
        if (expandableBehavior.A00 == this.A00) {
            C178828iA r0 = this.A02;
            expandableBehavior.A0K((View) r0, view, ((AnonymousClass6Z3) r0).A0F.A01, false);
        }
        return false;
    }
}
