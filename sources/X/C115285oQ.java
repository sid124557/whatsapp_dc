package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.5oQ  reason: invalid class name and case insensitive filesystem */
public class C115285oQ implements AnonymousClass4EZ {
    public final C69263Wi A00;
    public final AnonymousClass31C A01;
    public final AnonymousClass7LH A02;

    public void BQs(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.BkS(new C117205rY(this, (String) null, 0, 5));
    }

    public void BSN(AnonymousClass36K r6, String str) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.BkS(new C117205rY(this, (String) null, C57492tj.A01(r6), 5));
    }

    public void BdM(AnonymousClass36K r6, String str) {
        String str2;
        String str3;
        AnonymousClass36K A0l = r6.A0l("qr");
        if (A0l == null || !"contact".equals(A0l.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
            str2 = null;
            str3 = "sendGetContactQrCode/error: invalid response";
        } else {
            str2 = A0l.A0r("code", (String) null);
            if (str2 != null) {
                str3 = "sendGetContactQrCode/success";
            }
            str3 = "sendGetContactQrCode/error: invalid response";
        }
        Log.e(str3);
        this.A00.BkS(new C117205rY(this, str2, 0, 5));
    }

    public C115285oQ(C69263Wi r1, AnonymousClass31C r2, AnonymousClass7LH r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
