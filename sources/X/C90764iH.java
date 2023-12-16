package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.4iH  reason: invalid class name and case insensitive filesystem */
public class C90764iH extends C90804iL {
    public void A07(C150417Qq r8) {
        String string;
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_cat);
        super.A07(r8);
        Set set = ((C132616fg) r8).A00;
        if (set.size() == 0) {
            chip.setText(R.string.f11nameremoved);
        } else {
            if (set.size() == 1) {
                string = ((C166447yh) set.iterator().next()).A01;
            } else {
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, set.size());
                string = context.getString(R.string.f11nameremoved, objArr);
            }
            chip.setText(string);
        }
        chip.setCloseIconVisible(true);
        C18300x5.A13(chip.getContext(), chip, R.string.f11nameremoved);
        C18290x4.A1H(chip, this, 46);
        chip.setOnCloseIconClickListener(new C109425eb(this, 47));
    }

    public C90764iH(Chip chip, C185648u1 r2) {
        super(chip, r2);
    }
}
