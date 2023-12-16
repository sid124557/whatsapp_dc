package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4XV  reason: invalid class name */
public class AnonymousClass4XV extends C04580Ov {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public AnonymousClass4XV(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A002 == this.A02 - 1) {
            rect.set(0, 0, 0, this.A00);
        }
    }
}
