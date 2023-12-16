package X;

import android.content.Context;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import com.whatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4zB  reason: invalid class name and case insensitive filesystem */
public class C97754zB extends C97774zD {
    public boolean A00;

    public void A03() {
        if (!this.A00) {
            this.A00 = true;
            C97774zD.A02(this);
        }
    }

    public void A04(SparseIntArray sparseIntArray, SearchViewModel searchViewModel) {
        ChipGroup chipGroup = this.A02;
        chipGroup.removeAllViews();
        ArrayList A0s = AnonymousClass001.A0s();
        boolean z = false;
        for (int i = 0; i < sparseIntArray.size(); i++) {
            if (sparseIntArray.keyAt(i) != 0) {
                AnonymousClass0x2.A1F(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)), A0s);
            }
        }
        C86614Ku.A1U(A0s, 52);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            int A03 = C18280x3.A03((Pair) it.next());
            C149937Om r8 = (C149937Om) AnonymousClass5VL.A00(this.A01).get(A03);
            if (r8 != null) {
                Chip A0Q = C86654Ky.A0Q(this);
                A0Q.setText(r8.A05);
                A0Q.setClickable(true);
                C109695f2.A00(A0Q, searchViewModel, A03, 16);
                AnonymousClass5VL.A01(getContext(), A0Q, this.A01, A03, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                A0Q.setChipIconTintResource(R.color.f5nameremoved);
                AnonymousClass5Yj.A08(getContext(), getContext(), A0Q, R.attr.f3nameremoved, R.color.f5nameremoved);
                AnonymousClass5Yj.A0C(A0Q);
                A0Q.setId(r8.A04);
                chipGroup.addView(A0Q);
            }
        }
        if (sparseIntArray.get(0) == 1) {
            z = true;
        }
        setBackground(z);
    }

    public C97754zB(Context context) {
        super(context);
        A03();
        C86614Ku.A1E(this, -1, -2);
    }

    private void setBackground(boolean z) {
        int A01;
        Context context = getContext();
        if (z) {
            A01 = R.color.f5nameremoved;
        } else {
            A01 = AnonymousClass5Yj.A01(getContext());
        }
        C86604Kt.A0z(context, this, A01);
    }
}
