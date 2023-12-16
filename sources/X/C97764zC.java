package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import com.whatsapp.search.SearchViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4zC  reason: invalid class name and case insensitive filesystem */
public class C97764zC extends C97774zD {
    public AnonymousClass5ZU A00;
    public AnonymousClass5Y0 A01;
    public boolean A02;

    public void A03() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A00 = C64333Db.A2t(A002);
            this.A01 = C64333Db.A4B(A002);
            this.A00 = C64333Db.A28(A002);
            this.A01 = C64333Db.A3o(A002);
        }
    }

    public void A04(SearchViewModel searchViewModel, List list) {
        ChipGroup chipGroup = this.A02;
        chipGroup.removeAllViews();
        int maxChipWidth = getMaxChipWidth();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (A0R != null) {
                Chip A0Q = C86654Ky.A0Q(this);
                C86624Kv.A0x(A0Q, -2);
                String A0H = this.A00.A0H(A0R);
                AnonymousClass0XH r1 = this.A00.A05().A01;
                A0Q.setText(C107345b9.A05(getContext(), this.A01, C18320x8.A0b(getResources(), r1.A03(r1.A00, A0H), new Object[1], 0, R.string.f11nameremoved)));
                A0Q.setId(R.id.search_contact_token);
                A0Q.setClickable(true);
                C634339f.A00(A0Q, searchViewModel, A0R, 24);
                AnonymousClass0x2.A0q(getContext(), A0Q, R.color.f5nameremoved);
                AnonymousClass5Yj.A0C(A0Q);
                C86664Kz.A1S(A0Q);
                if (maxChipWidth > 0) {
                    A0Q.setMaxWidth(maxChipWidth);
                }
                chipGroup.addView(A0Q);
            }
        }
    }

    public C97764zC(Context context) {
        super(context);
        A03();
        addOnLayoutChangeListener(new AnonymousClass691((Object) this, 10));
        C86604Kt.A0z(getContext(), this, AnonymousClass5Yj.A01(getContext()));
    }

    /* access modifiers changed from: private */
    public int getMaxChipWidth() {
        return (AnonymousClass000.A06(this, getWidth()) - this.A02.A00) / 2;
    }
}
