package X;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.6Il  reason: invalid class name and case insensitive filesystem */
public final class C125546Il extends C05570Ua {
    public final float A00;
    public final Resources A01;
    public final Chip A02;
    public final C151167Tr A03;

    public C125546Il(View view, C151167Tr r4) {
        super(view);
        this.A03 = r4;
        Chip chip = (Chip) view;
        this.A02 = chip;
        Resources A0G = C18290x4.A0G(chip);
        this.A01 = A0G;
        float A012 = C86664Kz.A01(A0G, R.dimen.f6nameremoved);
        this.A00 = A012;
        chip.setChipIconSize(A012);
    }
}
