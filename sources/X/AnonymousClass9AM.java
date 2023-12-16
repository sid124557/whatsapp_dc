package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9AM  reason: invalid class name */
public class AnonymousClass9AM extends AnonymousClass9OC {
    public final C69263Wi A00;
    public final C54292oU A01;
    public final C40602Ha A02;
    public final C197109ca A03;
    public final C160757oG A04 = C160757oG.A00("IndiaUpiRegisterAliasAction", "network", "COMMON");
    public final C194259Se A05;

    public AnonymousClass9AM(C69263Wi r4, C54292oU r5, AnonymousClass9U1 r6, C40602Ha r7, AnonymousClass9U5 r8, C197109ca r9, C194259Se r10) {
        super(r6.A04, r8);
        this.A01 = r5;
        this.A00 = r4;
        this.A05 = r10;
        this.A02 = r7;
        this.A03 = r9;
    }

    public static /* synthetic */ void A00(AnonymousClass34V r2, AnonymousClass9AM r3, String str) {
        C197109ca r1;
        int i;
        if (str.equalsIgnoreCase("add")) {
            r1 = r3.A03;
            i = 22;
        } else if (str.equalsIgnoreCase("port")) {
            r1 = r3.A03;
            i = 24;
        } else {
            return;
        }
        r1.BK0(r2, i);
    }

    public void A01(C166557yt r16, C166557yt r17, C202619mJ r18, String str, String str2, String str3) {
        Log.i("PAY: registerAlias called");
        C153607bd r5 = this.A00;
        r5.A03("register-alias");
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("alias_value", C166557yt.A00(r17), A0s);
        AnonymousClass39V.A03("alias_type", str2, A0s);
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            AnonymousClass39V.A03("vpa_id", str4, A0s);
        }
        C166557yt r1 = r16;
        if (!C161527pr.A02(r1)) {
            AnonymousClass39V.A03("vpa", (String) r1.A00, A0s);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "register-alias", A0s2);
        AnonymousClass39V.A03("device_id", this.A05.A01(), A0s2);
        String str5 = str3;
        AnonymousClass39V.A03("op", str5, A0s2);
        this.A01.A0G(new AnonymousClass9AU(this.A01.A00, this.A00, this.A02, r5, r18, this, str5), new AnonymousClass36K(AnonymousClass36K.A0I("alias", C18300x5.A1Z(A0s, 0)), "account", C18300x5.A1Z(A0s2, 0)), "set", 0);
    }
}
