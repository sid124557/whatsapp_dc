package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3EL  reason: invalid class name */
public final class AnonymousClass3EL implements AnonymousClass4E1 {
    public static final AnonymousClass3EL A00 = new AnonymousClass3EL();

    public /* bridge */ /* synthetic */ Object B3a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        List A01 = AnonymousClass31K.A01(AnonymousClass3EN.A00, jSONObject.optJSONArray("bots"));
        if (optString == null || optString2 == null) {
            return null;
        }
        return new AnonymousClass2l5(optString, optString2, A01);
    }

    public /* bridge */ /* synthetic */ Object B3b(Object obj) {
        C35021wC r5 = (C35021wC) obj;
        C162457s7.A0J(r5, 0);
        String str = r5.A00;
        String str2 = r5.A01;
        List A002 = AnonymousClass31K.A00(AnonymousClass3EN.A00, r5.A02);
        if (str == null || str2 == null) {
            return null;
        }
        return new AnonymousClass2l5(str, str2, A002);
    }

    public /* bridge */ /* synthetic */ JSONObject Bqt(Object obj) {
        AnonymousClass2l5 r4 = (AnonymousClass2l5) obj;
        JSONObject A0l = AnonymousClass0x2.A0l(r4);
        A0l.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
        A0l.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
        A0l.put("bots", AnonymousClass31K.A02(AnonymousClass3EN.A00, r4.A02));
        return A0l;
    }
}
