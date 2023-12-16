package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3CZ  reason: invalid class name */
public class AnonymousClass3CZ implements C84994En {
    public final /* synthetic */ C56222rd A00;

    public AnonymousClass3CZ(C56222rd r1) {
        this.A00 = r1;
    }

    public void BUO(DeviceJid deviceJid) {
    }

    public void BUP(DeviceJid deviceJid) {
        C44262Vh r2 = this.A00.A03;
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService/notifyDeviceIdentityChanged ", deviceJid);
        C107285b3.A02(r2.A00, deviceJid, false);
    }

    public void BUQ(DeviceJid deviceJid) {
        C44262Vh r2 = this.A00.A03;
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService/notifyDeviceIdentityDeleted ", deviceJid);
        C107285b3.A02(r2.A00, deviceJid, true);
    }

    public void BTz(DeviceJid deviceJid, int i) {
    }
}
