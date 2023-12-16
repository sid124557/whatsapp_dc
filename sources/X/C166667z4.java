package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* renamed from: X.7z4  reason: invalid class name and case insensitive filesystem */
public abstract class C166667z4 implements TextWatcher {
    public void afterTextChanged(Editable editable) {
        if (this instanceof AnonymousClass6Z1) {
            AnonymousClass6Z1 r1 = (AnonymousClass6Z1) this;
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = r1.A00;
                chipTextInputComboView.A03.setText(ChipTextInputComboView.A00(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = r1.A00;
            String A00 = ChipTextInputComboView.A00(chipTextInputComboView2, editable);
            Chip chip = chipTextInputComboView2.A03;
            if (TextUtils.isEmpty(A00)) {
                A00 = ChipTextInputComboView.A00(chipTextInputComboView2, "00");
            }
            chip.setText(A00);
            return;
        }
        C153787c0 endIconDelegate = ((AnonymousClass6Z2) this).A00.getEndIconDelegate();
        if (endIconDelegate instanceof AnonymousClass6ZR) {
            AnonymousClass6ZR r3 = (AnonymousClass6ZR) endIconDelegate;
            if (r3.A03.isTouchExplorationEnabled() && r3.A04.getInputType() != 0 && !r3.A01.hasFocus()) {
                r3.A04.dismissDropDown();
            }
            r3.A04.post(new C172668Mf(r3, 40));
        } else if (endIconDelegate instanceof AnonymousClass6ZQ) {
            AnonymousClass6ZQ r32 = (AnonymousClass6ZQ) endIconDelegate;
            if (r32.A02.A0B == null) {
                r32.A09(r32.A0A());
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this instanceof AnonymousClass6Z2) {
            ((AnonymousClass6Z2) this).A00.getEndIconDelegate().A06(charSequence, i, i2, i3);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
