package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9AE  reason: invalid class name */
public class AnonymousClass9AE extends AnonymousClass9OC {
    public final Context A00;
    public final C69263Wi A01;
    public final C40602Ha A02;
    public final C197109ca A03;
    public final C160757oG A04 = C160757oG.A00("IndiaUpiDeregisterMapperActions", "network", "COMMON");
    public final C194259Se A05;

    public AnonymousClass9AE(Context context, C69263Wi r5, AnonymousClass9U1 r6, C40602Ha r7, AnonymousClass9U5 r8, C197109ca r9, C194259Se r10) {
        super(r6.A04, r8);
        this.A00 = context;
        this.A01 = r5;
        this.A05 = r10;
        this.A02 = r7;
        this.A03 = r9;
    }

    public void A00(C166557yt r17, C166157yE r18, C150597Rk r19, String str) {
        Log.i("PAY: deregisterAlias called");
        ArrayList A0s = AnonymousClass001.A0s();
        C166157yE r5 = r18;
        AnonymousClass39V.A03("alias_id", r5.A01, A0s);
        AnonymousClass39V.A03("alias_value", (String) r5.A00.A00, A0s);
        AnonymousClass39V.A03("alias_type", r5.A03, A0s);
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass39V.A03("vpa_id", str2, A0s);
        }
        AnonymousClass39V.A03("vpa", (String) r17.A00, A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "deregister-alias", A0s2);
        AnonymousClass39V.A03("device_id", this.A05.A01(), A0s2);
        C153607bd A022 = AnonymousClass9OC.A02(this, "deregister-alias");
        this.A01.A0G(new C203939oY(this.A00, this.A01, r5, this.A02, A022, this, r19), new AnonymousClass36K(AnonymousClass36K.A0I("alias", C18300x5.A1Z(A0s, 0)), "account", C18300x5.A1Z(A0s2, 0)), "set", 0);
    }
}
