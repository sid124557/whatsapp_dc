package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4iL  reason: invalid class name and case insensitive filesystem */
public class C90804iL extends AnonymousClass6J2 {
    public final Chip A00;

    public void A07(C150417Qq r6) {
        Chip chip = this.A00;
        Context context = chip.getContext();
        boolean A002 = r6.A00();
        AnonymousClass0x2.A0q(context, chip, C86614Ku.A04(context, A002 ? 1 : 0));
        Context context2 = chip.getContext();
        int i = R.attr.f3nameremoved;
        int i2 = R.color.f5nameremoved;
        if (A002) {
            i = R.attr.f3nameremoved;
            i2 = R.color.f5nameremoved;
        }
        chip.setChipBackgroundColorResource(AnonymousClass5Yj.A02(context2, i, i2));
        chip.setCloseIconTintResource(C86614Ku.A04(chip.getContext(), A002));
        chip.setCloseIconVisible(false);
        chip.A06.A0R((ColorStateList) null);
        chip.setChipIconTintResource(C86614Ku.A04(chip.getContext(), A002));
        chip.setChipIconSize(C86664Kz.A01(C18290x4.A0G(chip), R.dimen.f6nameremoved));
    }

    public C90804iL(Chip chip, C185648u1 r2) {
        super(chip, r2);
        this.A00 = chip;
    }
}
