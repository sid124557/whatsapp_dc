package X;

import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8PX  reason: invalid class name */
public class AnonymousClass8PX implements C185178tD {
    public final C59362wn A00;

    public C160417nb Br3(Cursor cursor) {
        C142426xB r3;
        C142426xB r2;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            Log.d("FacebookSsoTransformer", string);
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            String optString = A1H.optString("userId");
            String optString2 = A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString3 = A1H.optString("profilePicUrl");
            String optString4 = A1H.optString("accessToken");
            String optString5 = A1H.optString("sso_settings");
            C158077jO r5 = new C158077jO(optString, optString2, optString3);
            List A002 = this.A00.A00(A1H.optJSONArray("session_cookies"));
            if (optString5 != null) {
                if (!optString5.isEmpty()) {
                    JSONObject A1H2 = AnonymousClass0x9.A1H(optString5);
                    long currentTimeMillis = System.currentTimeMillis();
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    long optLong = A1H2.optLong("timestamp", currentTimeMillis);
                    Long valueOf2 = Long.valueOf(optLong);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Current Time: ");
                    A0o.append(valueOf);
                    Log.d("FacebookSsoTransformer", AnonymousClass000.A0P(valueOf2, ", last updated timestamp: ", A0o));
                    if (currentTimeMillis - optLong <= TimeUnit.DAYS.toMillis(45)) {
                        JSONObject optJSONObject = A1H2.optJSONObject("sso_eligibility");
                        if (optJSONObject != null) {
                            String valueOf3 = String.valueOf(C140906ui.A00.value);
                            r3 = C142426xB.FXAccountItemEligibilityNoData;
                            r2 = C142426xB.valueOf(optJSONObject.optString(valueOf3, String.valueOf(r3.value)));
                        } else {
                            r2 = C142426xB.FXAccountItemEligibilityNoData;
                            r3 = r2;
                        }
                    } else {
                        r2 = C142426xB.FXAccountItemEligibilityNoData;
                        r3 = r2;
                    }
                    JSONObject optJSONObject2 = A1H2.optJSONObject("nta_eligibility");
                    if (optJSONObject2 != null) {
                        r3 = C142426xB.valueOf(optJSONObject2.optString(String.valueOf(C140906ui.A00.value), String.valueOf(r3.value)));
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("SSO Eligibility: ");
                    A0o2.append(r2.value);
                    A0o2.append(", NTA Eligibility: ");
                    Log.d("FacebookSSOTransformer", AnonymousClass000.A0h(A0o2, r3.value));
                    return new C160417nb(optString4, A002, r5, new C148377Id(r2, r3));
                }
            }
            r2 = C142426xB.FXAccountItemEligibilityNoData;
            r3 = r2;
            StringBuilder A0o22 = AnonymousClass001.A0o();
            A0o22.append("SSO Eligibility: ");
            A0o22.append(r2.value);
            A0o22.append(", NTA Eligibility: ");
            Log.d("FacebookSSOTransformer", AnonymousClass000.A0h(A0o22, r3.value));
            return new C160417nb(optString4, A002, r5, new C148377Id(r2, r3));
        } catch (JSONException e) {
            throw new AnonymousClass8RZ(e);
        } catch (JSONException e2) {
            throw new AnonymousClass8RZ(e2);
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
            return new AnonymousClass7X5(jSONObject.getString("uid"), A1H.getString("access_token"), "FACEBOOK", A002, new AnonymousClass8TU(this, jSONObject), C142706xd.FACEBOOK, r13);
        } catch (JSONException e) {
            throw new AnonymousClass8RZ(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        return new X.C160417nb(r6.getString("access_token"), (java.util.List) null, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160417nb Br2(android.database.Cursor r8) {
        /*
            r7 = this;
            java.lang.String r5 = "access_token"
            r0 = 1
            java.lang.String r0 = r8.getString(r0)     // Catch:{ JSONException -> 0x004c }
            r4 = 0
            if (r0 != 0) goto L_0x000b
            return r4
        L_0x000b:
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "profile"
            org.json.JSONObject r3 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "uid"
            java.lang.String r2 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "name"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "pic_square"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            X.7jO r3 = new X.7jO     // Catch:{ JSONException -> 0x004c }
            r3.<init>(r2, r1, r0)     // Catch:{ JSONException -> 0x004c }
            X.2wn r1 = r7.A00     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = "session_cookies"
            org.json.JSONArray r0 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x0042 }
            java.util.List r2 = r1.A00(r0)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = r6.getString(r5)     // Catch:{ JSONException -> 0x0042 }
            X.7nb r1 = new X.7nb     // Catch:{ JSONException -> 0x0042 }
            r1.<init>(r0, r2, r3)     // Catch:{ JSONException -> 0x0042 }
            return r1
        L_0x0042:
            java.lang.String r0 = r6.getString(r5)     // Catch:{ JSONException -> 0x004c }
            X.7nb r1 = new X.7nb     // Catch:{ JSONException -> 0x004c }
            r1.<init>(r0, r4, r3)     // Catch:{ JSONException -> 0x004c }
            return r1
        L_0x004c:
            r1 = move-exception
            X.8RZ r0 = new X.8RZ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PX.Br2(android.database.Cursor):X.7nb");
    }

    public AnonymousClass8PX(C59362wn r1) {
        this.A00 = r1;
    }
}
