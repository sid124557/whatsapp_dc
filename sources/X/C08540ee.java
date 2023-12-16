package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.0ee  reason: invalid class name and case insensitive filesystem */
public class C08540ee implements C16020sL {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public void A00(RecyclerView recyclerView, boolean z) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C06440Xs r3 = recyclerView.A0S;
        AnonymousClass0R6 r1 = recyclerView.A0N;
        if (r1 != null && r3 != null) {
            if (z) {
                if (recyclerView.A0J.A04.size() <= 0) {
                    r3.A0p(this, r1.A0G());
                }
            } else if (!recyclerView.A0z()) {
                r3.A0q(this, recyclerView.A0y, this.A01, this.A02);
            }
            int i = this.A00;
            if (i > r3.A02) {
                r3.A02 = i;
                r3.A0C = z;
                recyclerView.A0w.A04();
            }
        }
    }

    public void Awj(int i, int i2) {
        if (i2 >= 0) {
            int i3 = this.A00 * 2;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 2)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
            return;
        }
        throw AnonymousClass001.A0c("Pixel distance must be non-negative");
    }
}
