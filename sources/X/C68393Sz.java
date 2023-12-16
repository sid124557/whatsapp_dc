package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.3Sz  reason: invalid class name and case insensitive filesystem */
public class C68393Sz implements AnonymousClass4EZ {
    public final C56962sq A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass31C A03;
    public final C46112b6 A04;

    public void BdM(AnonymousClass36K r9, String str) {
        AnonymousClass36K A0l = r9.A0l("list");
        if (A0l != null) {
            HashSet A0K = AnonymousClass002.A0K();
            HashMap A0t = AnonymousClass001.A0t();
            String A0L = AnonymousClass36K.A0L(A0l, "dhash");
            AnonymousClass36K[] r4 = A0l.A03;
            if (r4 != null) {
                for (AnonymousClass36K r1 : r4) {
                    AnonymousClass36K.A0N(r1, "item");
                    Jid A06 = AnonymousClass36K.A06(r1);
                    String A0L2 = AnonymousClass36K.A0L(r1, "display_name");
                    if (!C107575bX.A0F(A0L2) && (A06 instanceof C27981fH)) {
                        A0t.put(A06, A0L2);
                    }
                    A0K.add(A06);
                }
            }
            this.A00.A0L(A0L, A0t, A0K);
        } else {
            Log.d("getblocklistprotocolhelper/handleSuccessResponseV2/hash matched.");
            C18270x1.A0i(C18270x1.A03(this.A02), "block_list_receive_time", this.A01.A0H());
        }
        C46112b6 r12 = this.A04;
        if (r12 != null) {
            r12.A00(4);
        }
    }

    public C68393Sz(C56962sq r1, C56612sH r2, AnonymousClass33p r3, AnonymousClass31C r4, C46112b6 r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void BQs(String str) {
        C18260x0.A0s("getblocklistprotocolhelper/onDeliveryFailure iq=", str, AnonymousClass001.A0o());
    }

    public void BSN(AnonymousClass36K r4, String str) {
        int A012 = C57492tj.A01(r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("getblocklistprotocolhelper/onError, iq=");
        A0o.append(str);
        C18260x0.A0y("; errorCode=", A0o, A012);
    }
}
