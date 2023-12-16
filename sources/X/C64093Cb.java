package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Cb  reason: invalid class name and case insensitive filesystem */
public final class C64093Cb implements C84994En, AnonymousClass4CK {
    public final C130066bK A00;
    public final UserJid A01;

    public void BNp(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        A00(userJid.getPrimaryDevice());
    }

    public void BTz(DeviceJid deviceJid, int i) {
        C162457s7.A0J(deviceJid, 0);
        A00(deviceJid);
    }

    public final void A00(DeviceJid deviceJid) {
        if (C162457s7.A0P(this.A01.getPrimaryDevice(), deviceJid)) {
            this.A00.A05((Object) null);
        }
    }

    public /* synthetic */ void BNs(UserJid userJid) {
    }

    public void BUQ(DeviceJid deviceJid) {
    }

    public C64093Cb(C130066bK r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }

    public void BUO(DeviceJid deviceJid) {
        A00(deviceJid);
    }

    public void BUP(DeviceJid deviceJid) {
        A00(deviceJid);
    }
}
