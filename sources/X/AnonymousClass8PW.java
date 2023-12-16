package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8PW  reason: invalid class name */
public class AnonymousClass8PW implements C185178tD {
    public final C59362wn A00;

    public C160417nb Br2(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            List A002 = this.A00.A00(A1H.getJSONArray("session_cookies"));
            JSONObject jSONObject = A1H.getJSONObject("profile");
            return new C160417nb(A1H.getString("access_token"), A002, new C158077jO(jSONObject.getString("uid"), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.getString("profile_pic_url")));
        } catch (JSONException e) {
            throw new AnonymousClass8RZ(e);
        }
    }

    public AnonymousClass7X5 Br4(Cursor cursor, C142416xA r13) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            JSONObject jSONObject = A1H.getJSONObject("profile");
            List A002 = this.A00.A00(A1H.optJSONArray("session_cookies"));
            return new AnonymousClass7X5(jSONObject.getString("uid"), A1H.getString("access_token"), "FACEBOOK", A002, new AnonymousClass8TT(this, jSONObject), C142706xd.FACEBOOK_LITE, r13);
        } catch (JSONException e) {
            throw new AnonymousClass8RZ(e);
        }
    }

    public /* synthetic */ C160417nb Br3(Cursor cursor) {
        return null;
    }

    public AnonymousClass8PW(C59362wn r1) {
        this.A00 = r1;
    }
}
