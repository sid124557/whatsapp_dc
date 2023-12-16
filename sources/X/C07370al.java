package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: X.0al  reason: invalid class name and case insensitive filesystem */
public class C07370al implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreferenceCompat A00;

    public C07370al(SwitchPreferenceCompat switchPreferenceCompat) {
        this.A00 = switchPreferenceCompat;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = this.A00;
        AnonymousClass001.A1D(switchPreferenceCompat, switchPreferenceCompat, z);
    }
}
