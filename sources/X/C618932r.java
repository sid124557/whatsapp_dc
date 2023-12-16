package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32r  reason: invalid class name and case insensitive filesystem */
public final class C618932r {
    public final DeviceJid A01(UserJid userJid, int i) {
        String server;
        C162457s7.A0J(userJid, 0);
        boolean z = userJid instanceof C27981fH;
        if (!AnonymousClass000.A1U(i, 99)) {
            server = userJid.getServer();
        } else if (z) {
            server = "hosted.lid";
        } else {
            server = "hosted";
        }
        String str = userJid.user;
        int agent = userJid.getAgent();
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('.');
        A0l.append(agent);
        A0l.append(':');
        A0l.append(i);
        DeviceJid A02 = A02(AnonymousClass0x2.A0e(server, A0l, '@'));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceJid/getFromUserJidAndDeviceId: ");
        A0o.append(i);
        C18260x0.A1P(A0o, " translates to ", A02);
        return A02;
    }

    public static final DeviceJid A00(UserJid userJid) {
        if (userJid != null) {
            return userJid.getPrimaryDevice();
        }
        return null;
    }

    public final DeviceJid A02(String str) {
        Jid A01 = AnonymousClass32W.A01(str);
        if (A01 instanceof DeviceJid) {
            return (DeviceJid) A01;
        }
        if (A01 instanceof UserJid) {
            DeviceJid A00 = A00((UserJid) A01);
            if (A00 != null) {
                return A00;
            }
            throw AnonymousClass24P.A00(str);
        }
        throw AnonymousClass24P.A00(str);
    }
}
