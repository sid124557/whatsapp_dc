package X;

import com.whatsapp.settings.SettingsChat;

/* renamed from: X.3Ua  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68663Ua implements C183068pR {
    public final /* synthetic */ C24971Zl A00;
    public final /* synthetic */ SettingsChat A01;

    public final void BVj(int i) {
        SettingsChat settingsChat = this.A01;
        C24971Zl r1 = this.A00;
        if (i == 0) {
            settingsChat.A76();
        }
        r1.A03 = Integer.valueOf(C06550Ye.A00(i));
        r1.A01 = C18290x4.A0b();
        r1.A00 = Boolean.FALSE;
        settingsChat.A09.BhD(r1);
    }

    public /* synthetic */ C68663Ua(C24971Zl r1, SettingsChat settingsChat) {
        this.A01 = settingsChat;
        this.A00 = r1;
    }
}
