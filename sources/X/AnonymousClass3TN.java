package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.3TN  reason: invalid class name */
public class AnonymousClass3TN implements AnonymousClass4EZ {
    public C129526aS A00;
    public final C84494Co A01;
    public final AnonymousClass31C A02;
    public final String A03;

    public void BQs(String str) {
        Log.d("deviceRemoveRequest/onDeliveryFailure");
        this.A01.BS2(this.A00, -1);
    }

    public void BdM(AnonymousClass36K r3, String str) {
        Log.d("deviceRemoveRequest/onSuccess");
        this.A01.Bd1(this.A00);
    }

    public AnonymousClass3TN(C84494Co r1, AnonymousClass31C r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        this.A00 = C129526aS.of(deviceJid);
        AnonymousClass31C r7 = this.A02;
        String A032 = r7.A03();
        String str = this.A03;
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        C626936e.A06(deviceJid);
        r2[0] = new AnonymousClass39V((Jid) deviceJid, "jid");
        boolean A0G = AnonymousClass39V.A0G("reason", str, r2);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("remove-companion-device", r2);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, A0G ? 1 : 0);
        AnonymousClass39V.A0B("xmlns", "md", A1W, 2);
        boolean A0K = r7.A0K(this, AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W), A032, 237, 32000);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceRemoveRequestProtocolHelper/sendRemoveDeviceRequest success: ");
        A0o.append(A0K);
        A0o.append("; reason=");
        A0o.append(str);
        C18260x0.A1R(A0o, "; jid=", deviceJid);
        if (!A0K) {
            this.A01.BS2(this.A00, -1);
        }
    }

    public void BSN(AnonymousClass36K r4, String str) {
        int A012 = C57492tj.A01(r4);
        C18260x0.A0w("deviceRemoveRequest/onError :", AnonymousClass001.A0o(), A012);
        this.A01.BS2(this.A00, A012);
    }
}
