package X;

import com.whatsapp.voipcalling.Voip;
import org.json.JSONObject;

/* renamed from: X.4uU  reason: invalid class name and case insensitive filesystem */
public class C95774uU extends AnonymousClass5YV {
    public final C106645Zu A00;
    public final C112515jr A01;
    public final AnonymousClass332 A02;

    public String A00(C54742pD r3, JSONObject jSONObject) {
        if (!this.A02.A02(r3, jSONObject.getJSONObject("payload").getString("call_id")).equals(Voip.getCurrentCallId())) {
            return AnonymousClass5YV.A02(17, "There is no call with that call id");
        }
        this.A01.A00(this.A00);
        return AnonymousClass5YV.A03((Object) null);
    }

    public C95774uU(C106645Zu r1, C112515jr r2, AnonymousClass332 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
