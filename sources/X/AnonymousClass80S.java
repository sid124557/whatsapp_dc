package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.80S  reason: invalid class name */
public class AnonymousClass80S implements C16960uJ {
    public int A00 = -1;
    public final RecyclerView A01;
    public final AnonymousClass4XL A02;

    public void BOg(Object obj, int i, int i2) {
        this.A02.A01.A04(obj, i, i2);
    }

    public void BUd(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 > i) {
            this.A00 = i;
            this.A01.A0Z(0);
        }
        this.A02.A01.A02(i, i2);
    }

    public void BWn(int i, int i2) {
        this.A02.A01.A01(i, i2);
    }

    public void BZo(int i, int i2) {
        this.A02.A01.A03(i, i2);
    }

    public AnonymousClass80S(RecyclerView recyclerView, AnonymousClass4XL r3) {
        this.A02 = r3;
        this.A01 = recyclerView;
    }
}
