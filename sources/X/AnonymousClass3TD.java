package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.3TD  reason: invalid class name */
public class AnonymousClass3TD implements AnonymousClass4EZ {
    public final AnonymousClass31C A00;

    public void A00(String str, String str2) {
        AnonymousClass31C r9 = this.A00;
        String A03 = r9.A03();
        C135206kI r2 = C135206kI.A00;
        byte[] bytes = str.getBytes();
        C35381wm r7 = new C35381wm(A03, 22);
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "md");
        C56052rL.A06(r2, A01, "to");
        C56052rL A04 = C56052rL.A04("link_code_companion_reg");
        C56052rL.A0D(A04, "stage", "refresh_code");
        A04.A0K(str2, "force_manual_refresh", C35621xA.A00);
        C56052rL A042 = C56052rL.A04("link_code_pairing_ref");
        C626836d.A0H(bytes, -9007199254740991L, 9007199254740991L);
        C56052rL.A09(A042, A04, bytes);
        r9.A0D(this, C41032Ir.A03(A04, A01, r7), A03, 372, 120000);
    }

    public void BQs(String str) {
        Log.w("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq onDeliveryFailure");
    }

    public void BdM(AnonymousClass36K r2, String str) {
        Log.d("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq success");
    }

    public AnonymousClass3TD(AnonymousClass31C r1) {
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r4, String str) {
        String str2;
        Pair A02 = C57492tj.A02(r4);
        if (A02 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq error code=");
            A0o.append(A02.first);
            A0o.append("; text=");
            str2 = AnonymousClass000.A0X((String) A02.second, A0o);
        } else {
            str2 = "LinkCodeRefreshCodeProtocolHelper/sendRefreshCodeIq unknown code";
        }
        Log.e(str2);
    }
}
