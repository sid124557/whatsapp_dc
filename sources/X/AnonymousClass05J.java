package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: X.05J  reason: invalid class name */
public abstract class AnonymousClass05J extends AnonymousClass0R7 {
    public ArrayList A00 = AnonymousClass001.A0s();

    public abstract void A0N();

    public static void A00(ConstraintLayout constraintLayout) {
        constraintLayout.A06 = new SparseArray();
        constraintLayout.A0D = new ArrayList(4);
        constraintLayout.A08 = new AnonymousClass05P();
    }

    public void A09() {
        this.A00.clear();
        super.A09();
    }

    public void A0C(AnonymousClass0M1 r4) {
        super.A0C(r4);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0R7) this.A00.get(i)).A0C(r4);
        }
    }
}
