package X;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: X.0aj  reason: invalid class name and case insensitive filesystem */
public class C07350aj implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CheckBoxPreference A00;

    public C07350aj(CheckBoxPreference checkBoxPreference) {
        this.A00 = checkBoxPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBoxPreference checkBoxPreference = this.A00;
        AnonymousClass001.A1D(checkBoxPreference, checkBoxPreference, z);
    }
}
