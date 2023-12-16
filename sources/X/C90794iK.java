package X;

import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4iK  reason: invalid class name and case insensitive filesystem */
public class C90794iK extends C90804iL {
    public final C620733j A00;

    public void A07(C150417Qq r4) {
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_location);
        chip.setChipIconVisible(true);
        super.A07(r4);
        boolean A03 = C106945aQ.A03(C620733j.A02(this.A00));
        int i = R.string.f11nameremoved;
        if (A03) {
            i = R.string.f11nameremoved;
        }
        chip.setText(i);
        C18300x5.A13(chip.getContext(), chip, i);
        C109705f3.A00(chip, this, r4, 34);
    }

    public C90794iK(Chip chip, C185648u1 r2, C620733j r3) {
        super(chip, r2);
        this.A00 = r3;
    }
}
