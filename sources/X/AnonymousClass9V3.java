package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9V3  reason: invalid class name */
public final class AnonymousClass9V3 {
    public C166557yt A00;
    public String A01;

    public AnonymousClass9V3(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A00 = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), "upiSequenceNumber");
                this.A01 = A1H.optString("status");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ id: ");
        A0o.append(this.A00);
        A0o.append(" status: ");
        C195009Vm.A03(A0o, this.A01);
        return AnonymousClass000.A0X("]", A0o);
    }

    public AnonymousClass9V3(AnonymousClass36K r5) {
        this.A00 = C1899693i.A0G(AnonymousClass3QD.A00(), r5.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null), "upiSequenceNumber");
        this.A01 = r5.A0r("status", (String) null);
    }
}
