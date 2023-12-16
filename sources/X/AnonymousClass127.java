package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.127  reason: invalid class name */
public class AnonymousClass127 extends C04580Ov {
    public final int A00;
    public final C620733j A01;

    public AnonymousClass127(C620733j r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r10, RecyclerView recyclerView) {
        AnonymousClass09X r2 = (AnonymousClass09X) view.getLayoutParams();
        int i = r2.A01;
        int i2 = ((GridLayoutManager) recyclerView.getLayoutManager()).A00;
        int i3 = r2.A00;
        if (i == i2 || i2 == 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i4 = i2 / i;
        int i5 = i3 / i;
        rect.top = 0;
        int i6 = this.A00;
        rect.bottom = i6;
        float f = (float) i6;
        float f2 = (float) i4;
        int floor = (int) Math.floor((double) ((((float) i5) * f) / f2));
        int ceil = (int) Math.ceil((double) ((f * ((float) ((i4 - i5) - 1))) / f2));
        if (this.A01.A05().A06) {
            rect.left = ceil;
            rect.right = floor;
            return;
        }
        rect.left = floor;
        rect.right = ceil;
    }
}
