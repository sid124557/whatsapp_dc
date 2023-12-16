package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;

/* renamed from: X.4zD  reason: invalid class name and case insensitive filesystem */
public abstract class C97774zD extends AnonymousClass6FQ {
    public C620733j A00;
    public AnonymousClass1VX A01;
    public final ChipGroup A02;

    public C97774zD(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ChipGroup chipGroup = new ChipGroup(context);
        this.A02 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(chipGroup);
        boolean z = this instanceof C97744zA;
        Resources resources = getResources();
        if (z) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
        } else {
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        }
        chipGroup.setChipSpacingHorizontal(getChipSpacingPx());
    }

    public static void A01(Context context, Chip chip, int i, int i2) {
        chip.setChipIcon(C107335b8.A07(context, C18310x6.A0G(context, i), i2));
        chip.setChipIconSize(AnonymousClass5YI.A01(context, 18.0f));
        chip.setChipStartPadding(AnonymousClass5YI.A01(context, 1.0f));
        chip.setTextStartPadding(AnonymousClass5YI.A01(context, 1.0f));
        chip.setIconStartPadding(AnonymousClass5YI.A01(context, 8.0f));
        chip.setIconEndPadding(AnonymousClass5YI.A00(context));
    }

    public static void A02(C97774zD r2) {
        C64333Db r1 = ((C88864av) ((C111685iW) r2.generatedComponent())).A0K;
        r2.A00 = (C620733j) r1.AbU.get();
        r2.A01 = (AnonymousClass1VX) r1.A07.get();
    }

    private int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2;
    }

    public int getListBackgroundColor() {
        return R.color.f5nameremoved;
    }
}
