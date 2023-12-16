package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsPasskeys;
import com.whatsapp.settings.SettingsPasskeysDisabledFragment;
import com.whatsapp.settings.SettingsPasskeysEnabledFragment;

/* renamed from: X.43H  reason: invalid class name */
public final class AnonymousClass43H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SettingsPasskeys this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43H(SettingsPasskeys settingsPasskeys) {
        super(1);
        this.this$0 = settingsPasskeys;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C08310eF settingsPasskeysDisabledFragment;
        Boolean bool = (Boolean) obj;
        C18260x0.A1R(AnonymousClass001.A0o(), "SettingsPasskeys/updated passkeyExists from view model: ", bool);
        C162457s7.A0H(bool);
        if (bool.booleanValue()) {
            settingsPasskeysDisabledFragment = new SettingsPasskeysEnabledFragment();
        } else {
            settingsPasskeysDisabledFragment = new SettingsPasskeysDisabledFragment();
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this.this$0);
        A0J.A0A(settingsPasskeysDisabledFragment, R.id.settings_passkeys_fragment);
        A0J.A01();
        return C59022wD.A00;
    }
}
