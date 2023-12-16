package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3SX  reason: invalid class name */
public class AnonymousClass3SX implements AnonymousClass4EZ {
    public final AnonymousClass2GY A00;

    public void BQs(String str) {
        C61022zZ.A00(this.A00.A00, -2);
    }

    public AnonymousClass3SX(AnonymousClass2GY r1) {
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C61022zZ.A00(this.A00.A00, C57492tj.A01(r3));
    }

    public void BdM(AnonymousClass36K r7, String str) {
        AnonymousClass36K A0l;
        if (!(AnonymousClass36K.A07(r7) == null || (A0l = r7.A0l("unlink")) == null)) {
            List A0s = A0l.A0s("group");
            if (A0s.size() != 0) {
                HashSet A0K = AnonymousClass002.A0K();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(it);
                    Jid A0g = A0Y.A0g(GroupJid.class, "jid");
                    if (A0g != null) {
                        AnonymousClass0x2.A1F(A0g, Integer.valueOf(A0Y.A0b("error", -1)), A0K);
                    }
                }
                AnonymousClass2GY r3 = this.A00;
                C89654ea r2 = r3.A00.A00;
                if (r2 != null) {
                    r2.runOnUiThread(new C70103Zx(r3, 32, A0K));
                    return;
                }
                return;
            }
        }
        C61022zZ.A00(this.A00.A00, -3);
    }
}
