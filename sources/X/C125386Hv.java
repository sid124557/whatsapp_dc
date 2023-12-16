package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Hv  reason: invalid class name and case insensitive filesystem */
public final class C125386Hv extends C04580Ov {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C125386Hv(int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r8, RecyclerView recyclerView) {
        int i;
        int length;
        super.A03(rect, view, r8, recyclerView);
        int A002 = RecyclerView.A00(view);
        boolean z = this.A00;
        int width = recyclerView.getWidth();
        if (z) {
            int i2 = this.A01;
            length = C135736lA.A01.length;
            i = (width - (i2 * length)) / 2;
        } else {
            i = this.A02;
            length = C135736lA.A01.length;
            int i3 = ((width - (i * 2)) - (this.A03 * length)) / ((length * 2) - 2);
            rect.left = i3;
            rect.right = i3;
        }
        if (A002 == 0) {
            rect.left = i;
        } else if (A002 == length - 1) {
            rect.right = i;
        }
    }
}
