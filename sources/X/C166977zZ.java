package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.7zZ  reason: invalid class name and case insensitive filesystem */
public class C166977zZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C108145cU A01;
    public final /* synthetic */ Float A02;

    public C166977zZ(View view, C108145cU r2, Float f) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = f;
    }

    public void onGlobalLayout() {
        View view = this.A00;
        C86604Kt.A1G(view, this);
        this.A01.A0N(this.A02, view.getMeasuredHeight(), false);
    }
}
