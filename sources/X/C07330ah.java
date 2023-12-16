package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.0ah  reason: invalid class name and case insensitive filesystem */
public class C07330ah implements AbsListView.OnScrollListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C06200Wq A02;

    public C07330ah(View view, View view2, C06200Wq r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C06200Wq.A01(absListView, this.A01, this.A00);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
