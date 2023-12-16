package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Zj  reason: invalid class name and case insensitive filesystem */
public class C45272Zj {
    public JSONObject A00;
    public final C55682qk A01;
    public final C54292oU A02;

    public String A00(String str) {
        try {
            JSONObject jSONObject = this.A00;
            if (jSONObject == null) {
                InputStream open = this.A02.A00.getAssets().open("whatsapp-schema-persist-ids.json");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                open.close();
                jSONObject = AnonymousClass0x7.A12(DefaultCrypto.UTF_8, bArr);
                this.A00 = jSONObject;
            }
            return jSONObject.getJSONObject("data").getString(str);
        } catch (IOException | JSONException e) {
            StringBuilder A0A = C18330xA.A0A("Unable to get persisted ID");
            A0A.append(". is JSONException? ");
            this.A01.A0A("JSONPersistedQueryProvider", false, C18300x5.A0m(A0A, e instanceof JSONException));
            return null;
        }
    }

    public C45272Zj(C55682qk r1, C54292oU r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
