package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Hq  reason: invalid class name */
public final class AnonymousClass6Hq extends C04580Ov {
    public final /* synthetic */ C150137Pj A00;

    public void A03(Rect rect, View view, AnonymousClass0Q1 r9, RecyclerView recyclerView) {
        C162457s7.A0J(rect, 0);
        C18260x0.A0Q(view, recyclerView);
        C150137Pj r5 = this.A00;
        if (r5.A00 != 0) {
            int A002 = RecyclerView.A00(view);
            int i = r5.A00;
            int i2 = A002 % i;
            int i3 = (r5.A03 - (r5.A04 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A002 < i) {
                rect.top = r5.A01;
            }
            rect.bottom = r5.A01;
        }
    }

    public AnonymousClass6Hq(C150137Pj r1) {
        this.A00 = r1;
    }
}
