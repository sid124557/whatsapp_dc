package X;

import android.widget.CheckBox;
import com.whatsapp.WaEditText;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;

/* renamed from: X.3AY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AY implements C15930sC {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ SettingsSetupUserProxyActivity A02;
    public final /* synthetic */ boolean A03;

    public final void BOf(Object obj) {
        int intValue;
        String str;
        String str2;
        int i;
        WaEditText waEditText = this.A01;
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.A02;
        CheckBox checkBox = this.A00;
        boolean z = this.A03;
        Integer A06 = C829745q.A06(String.valueOf(waEditText.getText()));
        if (A06 == null) {
            C55682qk r2 = settingsSetupUserProxyActivity.A03;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("input: ");
            A0o.append(waEditText.getText());
            r2.A0A("unblocking/changeport failed to parse port as int", false, AnonymousClass000.A0X(". Verify whether this is a pattern for this locale or device or android version.", A0o));
            return;
        }
        boolean isChecked = checkBox.isChecked();
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) settingsSetupUserProxyActivity.A05.getValue();
        if (z) {
            i = A06.intValue();
            C60962zS A0D = settingsSetupUserProxyViewModel.A0D();
            str = A0D.A02;
            str2 = A0D.A05;
            intValue = A0D.A00;
            isChecked = A0D.A06;
        } else {
            intValue = A06.intValue();
            C60962zS A0D2 = settingsSetupUserProxyViewModel.A0D();
            str = A0D2.A02;
            str2 = A0D2.A05;
            i = A0D2.A01;
        }
        settingsSetupUserProxyViewModel.A0E(new C60962zS(str, str2, intValue, i, isChecked));
    }

    public /* synthetic */ AnonymousClass3AY(CheckBox checkBox, WaEditText waEditText, SettingsSetupUserProxyActivity settingsSetupUserProxyActivity, boolean z) {
        this.A01 = waEditText;
        this.A02 = settingsSetupUserProxyActivity;
        this.A00 = checkBox;
        this.A03 = z;
    }
}
