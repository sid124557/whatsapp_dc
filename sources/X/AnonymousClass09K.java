package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.09K  reason: invalid class name */
public class AnonymousClass09K extends C04640Qa {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass09K(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A03(int i, int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0t((String) null);
        C08520ec r3 = recyclerView.A0J;
        if (i == i2) {
            return;
        }
        if (i3 == 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.BLo((Object) null, 8, i, i2));
            r3.A00 |= 8;
            if (arrayList.size() == 1) {
                A08();
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Moving more than 1 item is not supported yet");
    }

    public void A04(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0t((String) null);
        C08520ec r3 = recyclerView.A0J;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.BLo(obj, 4, i, i2));
            r3.A00 |= 4;
            if (arrayList.size() == 1) {
                A08();
            }
        }
    }

    public void A05() {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0t((String) null);
        recyclerView.A0y.A0C = true;
        recyclerView.A0v(true);
        if (recyclerView.A0J.A04.size() <= 0) {
            recyclerView.requestLayout();
        }
    }

    public void A06(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0t((String) null);
        C08520ec r3 = recyclerView.A0J;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.BLo((Object) null, 1, i, i2));
            r3.A00 |= 1;
            if (arrayList.size() == 1) {
                A08();
            }
        }
    }

    public void A07(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0t((String) null);
        C08520ec r3 = recyclerView.A0J;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.BLo((Object) null, 2, i, i2));
            r3.A00 |= 2;
            if (arrayList.size() == 1) {
                A08();
            }
        }
    }

    public void A08() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0h || !recyclerView.A0j) {
            recyclerView.A0c = true;
            recyclerView.requestLayout();
            return;
        }
        AnonymousClass0YY.A07(recyclerView, recyclerView.A12);
    }
}
