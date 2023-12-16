package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Gz  reason: invalid class name and case insensitive filesystem */
public class C65303Gz implements C837449p {
    public final /* synthetic */ C56222rd A00;

    public C65303Gz(C56222rd r1) {
        this.A00 = r1;
    }

    public void Bf8(UserJid userJid, Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            C44262Vh r2 = this.A00.A03;
            C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService/notifyDeviceRemoved ", A0R);
            C626936e.A0D(AnonymousClass0x9.A1P(A0R), "primary device should never be removed");
            C107285b3.A02(r2.A00, A0R, true);
        }
    }
}
