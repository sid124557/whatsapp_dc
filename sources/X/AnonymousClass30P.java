package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.30P  reason: invalid class name */
public class AnonymousClass30P {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public static final C633738z A00(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        AnonymousClass2SE r2 = new AnonymousClass2SE();
        r2.A00 = Boolean.valueOf(jSONObject.optBoolean("secure", false));
        r2.A01 = Long.valueOf(C18320x8.A06("expiry", jSONObject));
        r2.A02 = AnonymousClass355.A03("domain", jSONObject);
        r2.A03 = AnonymousClass355.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject);
        r2.A04 = AnonymousClass355.A03("path", jSONObject);
        r2.A05 = AnonymousClass355.A03("value", jSONObject);
        Boolean bool = r2.A00;
        C626936e.A06(bool);
        C162457s7.A0D(bool);
        boolean booleanValue = bool.booleanValue();
        Long l = r2.A01;
        C626936e.A06(l);
        long A032 = C18320x8.A03(l);
        String str = r2.A02;
        C626936e.A06(str);
        C162457s7.A0D(str);
        String str2 = r2.A03;
        C626936e.A06(str2);
        C162457s7.A0D(str2);
        String str3 = r2.A04;
        C626936e.A06(str3);
        C162457s7.A0D(str3);
        String str4 = r2.A05;
        C626936e.A06(str4);
        C162457s7.A0D(str4);
        return new C633738z(str, str2, str3, str4, C18290x4.A0o(C18300x5.A0C().authority(r2.A02).build()), A032, booleanValue);
    }

    public void A02(C60272yH r10, AnonymousClass4EI r11, C54662p5 r12) {
        ((C59532x4) this.A03.get()).A01(r10.A01, new AnonymousClass4HD(r10, r11, r11, this, r12, 1));
    }

    public void A03(C60272yH r10, AnonymousClass4EI r11, C54662p5 r12) {
        ((C59532x4) this.A03.get()).A01(r10.A01, new AnonymousClass4HD(r10, r11, r11, this, r12, 0));
    }

    public void A04(AnonymousClass4EI r12, C50912iy r13) {
        AnonymousClass4EI r2 = r12;
        AnonymousClass4EI r3 = r12;
        ((C59532x4) this.A03.get()).A01(r13, new AnonymousClass1VC(r2, r3, this, r13, (C54662p5) null, AnonymousClass0x7.A0f(), (String) null, (String) null, (String) null));
    }

    public void A05(AnonymousClass4EI r9, C50912iy r10, C54662p5 r11, Object obj) {
        ((C59532x4) this.A03.get()).A01(r10, new AnonymousClass1VB(r9, r9, this, r10, r11, obj));
    }

    public void A06(AnonymousClass4EI r9, C50912iy r10, C54662p5 r11, String str) {
        ((C59532x4) this.A03.get()).A01(r10, new AnonymousClass1VA(r9, r9, this, r10, r11, str));
    }

    public C60272yH A01(C50912iy r17) {
        String str;
        Long l;
        String str2;
        C633738z r5;
        Map A022 = ((AnonymousClass308) this.A00.get()).A02();
        C50912iy r4 = r17;
        C18260x0.A1R(AnonymousClass001.A0o(), "FBCredentialsStore/getFBIdentity/FbUserType: ", r4);
        if (A022.isEmpty()) {
            str = "FBCredentialsStore/getFBIdentity/fbUsers is empty";
        } else {
            String A0o = C18310x6.A0o(r4.A00, A022);
            if (A0o == null || A0o.isEmpty()) {
                str = "FBCredentialsStore/getFBIdentity/userCredentials is null";
            } else {
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(A0o);
                    long j = A1H.getLong("fbid");
                    String string = A1H.getString("password");
                    String string2 = A1H.getString("access_token");
                    long j2 = A1H.getLong("timestamp");
                    C633738z r6 = null;
                    if (A1H.has("ttl")) {
                        l = Long.valueOf(A1H.optLong("ttl"));
                    } else {
                        l = null;
                    }
                    if (A1H.has("analytics_claim")) {
                        str2 = A1H.optString("analytics_claim");
                    } else {
                        str2 = null;
                    }
                    C50912iy r7 = new C50912iy(A1H.getString("usertype"));
                    if (A1H.has("session_cookie_current_user")) {
                        r5 = A00(A1H.getJSONObject("session_cookie_current_user"));
                    } else {
                        r5 = null;
                    }
                    if (A1H.has("session_cookie_session_identifier")) {
                        r6 = A00(A1H.getJSONObject("session_cookie_session_identifier"));
                    }
                    return new C60272yH(r5, r6, r7, l, string, string2, str2, j, j2);
                } catch (JSONException e) {
                    Log.e("FBCredentialsStore/getFBIdentity/getJsonStringAsEntity/JSONException");
                    C626936e.A0A(e);
                    return null;
                }
            }
        }
        Log.i(str);
        return null;
    }

    public AnonymousClass30P(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        this.A02 = r1;
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }
}
