package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3TM  reason: invalid class name */
public class AnonymousClass3TM implements AnonymousClass4EZ {
    public final C57162tC A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass31C A02;
    public final AnonymousClass4BD A03;

    public final void A00(int i) {
        this.A03.BaL(new C43242Ri((UserJid) null, (String) null, (String) null, -1, i));
    }

    public void BQs(String str) {
        Log.e("GetUserByCustomUrlProtocol/onDeliveryFailure");
        A00(408);
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("GetUserByCustomUrlProtocol/onError");
        A00(C57492tj.A01(r2));
    }

    public void BdM(AnonymousClass36K r9, String str) {
        UserJid A08;
        Log.e("GetUserByCustomUrlProtocol/onSuccess");
        AnonymousClass36K A0l = r9.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (A0l == null || (A08 = AnonymousClass32Y.A08(A0l.A0r("jid", (String) null))) == null) {
            A00(0);
            return;
        }
        int i = 2;
        if (this.A01.A0Y(C58422vE.A02, 1849)) {
            i = 3;
        }
        this.A03.BaL(new C43242Ri(A08, (String) null, (String) null, i, 0));
    }

    public AnonymousClass3TM(C57162tC r1, AnonymousClass1VX r2, AnonymousClass31C r3, AnonymousClass4BD r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
