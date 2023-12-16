package X;

import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4iI  reason: invalid class name and case insensitive filesystem */
public class C90774iI extends C90804iL {
    public void A07(C150417Qq r4) {
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_catalog);
        chip.setChipIconVisible(true);
        super.A07(r4);
        chip.setText(R.string.f11nameremoved);
        C18300x5.A13(chip.getContext(), chip, R.string.f11nameremoved);
        C109705f3.A00(chip, this, r4, 35);
    }

    public C90774iI(Chip chip, C185648u1 r2) {
        super(chip, r2);
    }
}
