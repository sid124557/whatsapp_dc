package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.5AB  reason: invalid class name */
public final class AnonymousClass5AB {
    public static final Chip A00(Context context, C108875dh r5) {
        boolean A1U = C18270x1.A1U(context, r5);
        String A0l = C18290x4.A0l(context, r5.A02);
        if (r5.A05) {
            A0l = AnonymousClass000.A0X(" [Internal]", AnonymousClass000.A0l(A0l));
        }
        Chip chip = new Chip(context, (AttributeSet) null);
        chip.setText(A0l);
        chip.setClickable(A1U);
        int i = r5.A00;
        if (i != 0) {
            C97774zD.A01(context, chip, i, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        chip.setChipIconTintResource(R.color.f5nameremoved);
        AnonymousClass5Yj.A0B(context, chip, R.attr.f3nameremoved, R.color.f5nameremoved);
        chip.setChipBackgroundColorResource(AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        return chip;
    }
}
