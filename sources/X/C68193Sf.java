package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Sf  reason: invalid class name and case insensitive filesystem */
public class C68193Sf implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final AnonymousClass4D0 A01;

    public void BQs(String str) {
    }

    public void BdM(AnonymousClass36K r18, String str) {
        AnonymousClass36K A0l = r18.A0l("linked_group");
        if (A0l != null) {
            List A0s = A0l.A0s("group");
            if (A0s.size() != 0) {
                AnonymousClass36K r2 = (AnonymousClass36K) C18290x4.A0k(A0s);
                UserJid A09 = AnonymousClass36K.A09(r2);
                long A04 = C615531h.A04(r2.A0r("creation", (String) null), 0) * 1000;
                String A0r = r2.A0r("subject", (String) null);
                long A02 = C615531h.A02(r2) * 1000;
                int i = 0;
                if (r2.A0l("default_sub_group") != null) {
                    i = 3;
                }
                String A0r2 = r2.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                if (A0r2 != null) {
                    boolean A0V = AnonymousClass36K.A0V(r2, "admin_request_required");
                    try {
                        C27991fJ A042 = C627336j.A04(A0r2);
                        Map A06 = AnonymousClass36J.A06(r2, this.A00);
                        this.A01.Bcw(A042, A09, AnonymousClass36J.A04(r2), A0r, A06, C615531h.A00(r2, A06), i, C57482ti.A00(r2), A04, A02, A0V);
                    } catch (AnonymousClass24P e) {
                        Log.e("GetSubgroupInfoProtocolCallbackonSuccess/invalid jid exception", e);
                    }
                }
            }
        }
    }

    public C68193Sf(C55682qk r1, AnonymousClass4D0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        this.A01.onError(C57492tj.A01(r3));
    }
}
