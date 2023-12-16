package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.1hp  reason: invalid class name and case insensitive filesystem */
public class C28821hp extends C61102zi {
    public final C48972fm A00;
    public final C614730x A01;

    public void A08(DeviceJid deviceJid) {
        C73523fe A002 = C614730x.A00(AnonymousClass36G.A03(deviceJid.userJid), this.A01);
        try {
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                ((C84994En) A03.next()).BUQ(deviceJid);
            }
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C28821hp(C48972fm r1, C614730x r2, C183538qC r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }
}
