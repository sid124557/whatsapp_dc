package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: X.0Wc  reason: invalid class name and case insensitive filesystem */
public class C06070Wc {
    public static ColorStateList A00(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode A01(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void A02(ColorStateList colorStateList, CompoundButton compoundButton) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void A03(PorterDuff.Mode mode, CompoundButton compoundButton) {
        compoundButton.setButtonTintMode(mode);
    }
}
