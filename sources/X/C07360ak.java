package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.0ak  reason: invalid class name and case insensitive filesystem */
public class C07360ak implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public C07360ak(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.A00;
        AnonymousClass001.A1D(switchPreference, switchPreference, z);
    }
}
