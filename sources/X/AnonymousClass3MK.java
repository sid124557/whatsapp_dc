package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3MK  reason: invalid class name */
public final class AnonymousClass3MK implements AnonymousClass4EH {
    public final /* synthetic */ AnonymousClass4EJ A00;
    public final /* synthetic */ C84754Do A01;
    public final /* synthetic */ AnonymousClass3MY A02;
    public final /* synthetic */ PrivateKey A03;

    public AnonymousClass3MK(AnonymousClass4EJ r1, C84754Do r2, AnonymousClass3MY r3, PrivateKey privateKey) {
        this.A03 = privateKey;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BQp() {
        this.A00.BQp();
    }

    public void BS9(AnonymousClass24F r2) {
        this.A01.BS9(r2);
    }

    public void BdS(AnonymousClass2Q4 r3, Integer num) {
        JSONObject jSONObject;
        if (r3 != null) {
            try {
                PrivateKey privateKey = this.A03;
                if (privateKey != null) {
                    jSONObject = C50672ia.A01(r3, this.A02.A01, privateKey);
                    this.A01.BdI(jSONObject);
                }
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                this.A00.BSB(e);
                return;
            }
        }
        jSONObject = null;
        this.A01.BdI(jSONObject);
    }
}
