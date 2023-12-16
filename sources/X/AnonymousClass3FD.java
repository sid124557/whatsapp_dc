package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FD implements C836549g {
    public final /* synthetic */ C56222rd A00;

    public final void BNB(List list) {
        C56222rd r3 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            if (A0R != null) {
                r3.A04.A03.remove(A0R);
                r3.A03.A00(A0R);
            }
        }
    }

    public /* synthetic */ AnonymousClass3FD(C56222rd r1) {
        this.A00 = r1;
    }
}
