package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4Wd  reason: invalid class name and case insensitive filesystem */
public class C87794Wd extends AnonymousClass0R6 {
    public final AnonymousClass5EY A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D;
        int i2;
        if (i == 1) {
            A0D = C86604Kt.A0D(viewGroup);
            i2 = R.layout.f8nameremoved;
        } else if (i == 2) {
            return new C90834iO((Chip) AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A00.A00.A01.ABa());
        } else if (i == 3) {
            A0D = C86604Kt.A0D(viewGroup);
            i2 = R.layout.f8nameremoved;
        } else {
            throw C86604Kt.A0h("SearchHistoryItemAdapter/onCreateViewHolder unhandled view type: ", AnonymousClass001.A0o(), i);
        }
        return new C90824iN(AnonymousClass001.A0R(A0D, viewGroup, i2));
    }

    public int A0G() {
        throw AnonymousClass001.A0g("size");
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C88484Yx r22 = (C88484Yx) r2;
        if (r22 instanceof C90834iO) {
            ((C90834iO) r22).A01.A00();
        }
        throw AnonymousClass001.A0g("get");
    }

    public int getItemViewType(int i) {
        throw AnonymousClass001.A0g("get");
    }

    public C87794Wd(AnonymousClass5EY r1) {
        this.A00 = r1;
    }
}
