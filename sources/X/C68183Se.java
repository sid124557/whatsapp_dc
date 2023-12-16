package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Se  reason: invalid class name and case insensitive filesystem */
public final class C68183Se implements AnonymousClass4EZ {
    public final AnonymousClass2JH A00;
    public final AnonymousClass31C A01;

    public C68183Se(AnonymousClass2JH r2, AnonymousClass31C r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void BdM(AnonymousClass36K r5, String str) {
        Map map;
        C162457s7.A0J(r5, 1);
        AnonymousClass36K A0j = r5.A0j();
        C162457s7.A0D(A0j);
        AnonymousClass36K.A0N(A0j, "privacy");
        AnonymousClass36K[] r0 = A0j.A03;
        if (r0 != null) {
            AnonymousClass4C5 A05 = C829345m.A05(AnonymousClass457.A00, C829345m.A05(new C822542w(A0j), new C626335w(new C175698Zj(0, r0.length - 1), 1)));
            LinkedHashMap A0r = C18320x8.A0r();
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                AnonymousClass3Z6.A0A(A0r, it);
            }
            map = C73813g7.A0C(A0r);
        } else {
            map = C72043d5.A00();
        }
        AnonymousClass2JH r2 = this.A00;
        C46112b6 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(3);
        }
        r2.A01.A04(map);
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("PrivacySettingsProtocolHelper/onError");
    }

    public void BQs(String str) {
        C18260x0.A0t("PrivacySettingsProtocolHelper/onDeliveryFailure iqId=", str, C18270x1.A0X(str));
    }
}
