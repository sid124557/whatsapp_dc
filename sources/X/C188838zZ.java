package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8zZ  reason: invalid class name and case insensitive filesystem */
public class C188838zZ extends C04580Ov {
    public int A00;
    public Object A01;
    public final int A02;

    public C188838zZ(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r6, RecyclerView recyclerView) {
        int i = this.A02;
        int i2 = this.A00;
        if (2 - i != 0) {
            rect.set(0, i2, i2, i2);
        } else {
            rect.set(0, 0, i2, 0);
        }
    }
}
