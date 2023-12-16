package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4XT  reason: invalid class name */
public final class AnonymousClass4XT extends C04580Ov {
    public final int A00;
    public final C620733j A01;

    public AnonymousClass4XT(C620733j r2, int i) {
        C162457s7.A0J(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r5, RecyclerView recyclerView) {
        C162457s7.A0J(rect, 0);
        C18260x0.A0Q(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            rect.left = 0;
        } else if (C620733j.A04(this.A01)) {
            rect.left = this.A00;
        } else {
            rect.left = 0;
            rect.right = this.A00;
            return;
        }
        rect.right = 0;
    }
}
