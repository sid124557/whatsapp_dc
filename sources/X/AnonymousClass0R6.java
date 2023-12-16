package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0R6  reason: invalid class name */
public abstract class AnonymousClass0R6 {
    public boolean A00 = false;
    public final C000900r A01 = new C000900r();

    public abstract int A0G();

    public abstract void BNf(C05570Ua r1, int i);

    public abstract C05570Ua BQR(ViewGroup viewGroup, int i);

    public final C05570Ua A04(ViewGroup viewGroup, int i) {
        try {
            AnonymousClass0RZ.A01("RV CreateView");
            C05570Ua BQR = BQR(viewGroup, i);
            if (BQR.A0H.getParent() == null) {
                BQR.A02 = i;
                return BQR;
            }
            throw AnonymousClass001.A0e("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            AnonymousClass0RZ.A00();
        }
    }

    public final void A05() {
        this.A01.A00();
    }

    public final void A06(int i) {
        this.A01.A04((Object) null, i, 1);
    }

    public final void A07(int i) {
        this.A01.A02(i, 1);
    }

    public final void A08(int i) {
        this.A01.A03(i, 1);
    }

    public final void A09(int i, int i2) {
        this.A01.A04((Object) null, i, i2);
    }

    public void A0E(boolean z) {
        if (!this.A01.A05()) {
            this.A00 = z;
            return;
        }
        throw AnonymousClass001.A0e("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void BiZ(C04640Qa r2) {
        this.A01.registerObserver(r2);
    }

    public long A0B(int i) {
        return -1;
    }

    public void A0C(RecyclerView recyclerView) {
    }

    public void A0D(RecyclerView recyclerView) {
    }

    public boolean A0F(C05570Ua r2) {
        return false;
    }

    public void A0H(C05570Ua r1) {
    }

    public void A0I(C05570Ua r1) {
    }

    public void A0J(C05570Ua r1) {
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void A0A(C05570Ua r1, List list, int i) {
        BNf(r1, i);
    }
}
