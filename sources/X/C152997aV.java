package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7aV  reason: invalid class name and case insensitive filesystem */
public class C152997aV {
    public C178838iB A00;
    public boolean A01;
    public boolean A02;
    public final Map A03 = AnonymousClass001.A0t();
    public final Set A04 = AnonymousClass002.A0K();

    public List A00(ViewGroup viewGroup) {
        HashSet A15 = AnonymousClass0x9.A15(this.A04);
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C187378x7) && A15.contains(Integer.valueOf(childAt.getId()))) {
                C18270x1.A1K(A0s, childAt.getId());
            }
        }
        return A0s;
    }

    public final void A01() {
        C178838iB r2 = this.A00;
        if (r2 != null) {
            new HashSet(this.A04);
            ChipGroup chipGroup = ((C170038Bp) r2).A00;
            C178808i8 r1 = chipGroup.A02;
            if (r1 != null) {
                chipGroup.A05.A00(chipGroup);
                ChipGroup chipGroup2 = ((C170008Bm) r1).A01;
                if (chipGroup2.A05.A02) {
                    chipGroup2.getCheckedChipId();
                    throw AnonymousClass001.A0g("onCheckedChanged");
                }
            }
        }
    }

    public final boolean A02(C187378x7 r6) {
        int i;
        int id = r6.getId();
        Set set = this.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            return false;
        }
        Map map = this.A03;
        if (!this.A02 || set.isEmpty()) {
            i = -1;
        } else {
            i = C18280x3.A05(set.iterator());
        }
        C187378x7 r0 = (C187378x7) AnonymousClass001.A0i(map, i);
        if (r0 != null) {
            A03(r0, false);
        }
        boolean add = set.add(valueOf);
        if (!r6.isChecked()) {
            r6.setChecked(true);
        }
        return add;
    }

    public final boolean A03(C187378x7 r6, boolean z) {
        int id = r6.getId();
        Set set = this.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            if (!z || set.size() != 1 || !set.contains(valueOf)) {
                boolean remove = set.remove(valueOf);
                if (r6.isChecked()) {
                    r6.setChecked(false);
                }
                return remove;
            }
            r6.setChecked(true);
        }
        return false;
    }
}
