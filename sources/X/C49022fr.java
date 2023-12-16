package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2fr  reason: invalid class name and case insensitive filesystem */
public class C49022fr {
    public final C621133n A00;
    public final C66463Ln A01;
    public final AnonymousClass318 A02;

    public void A01(UserJid userJid) {
        Set A0D = this.A02.A0D(userJid);
        Map A002 = A00(A0D);
        ArrayList A0J = AnonymousClass002.A0J(A0D);
        A0J.removeAll(A002.keySet());
        if (!A0J.isEmpty()) {
            this.A01.A01(A0J);
        }
    }

    public C49022fr(C621133n r1, C66463Ln r2, AnonymousClass318 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Map A00(Iterable iterable) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = AnonymousClass0x7.A0R(it);
            C47932e4 A08 = this.A00.A08(AnonymousClass36G.A02(A0R));
            if (A08 != null) {
                A0t.put(A0R, A08);
            }
        }
        return A0t;
    }
}
