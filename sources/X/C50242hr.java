package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.2hr  reason: invalid class name and case insensitive filesystem */
public class C50242hr {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C50242hr r7 = (C50242hr) obj;
            if (this.A01 != r7.A01 || this.A00 != r7.A00 || !this.A05.equals(r7.A05) || !this.A07.equals(r7.A07) || !this.A04.equals(r7.A04) || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03) || !this.A06.equals(r7.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A05;
        objArr[1] = this.A07;
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        objArr[4] = this.A03;
        objArr[5] = this.A06;
        objArr[6] = Long.valueOf(this.A01);
        C18310x6.A1V(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C50242hr(JSONObject jSONObject) {
        this.A05 = jSONObject.optString("source", (String) null);
        this.A07 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        this.A04 = jSONObject.optString("severity", (String) null);
        this.A02 = jSONObject.optString("notificationType", (String) null);
        this.A03 = jSONObject.optString("policyUrl", (String) null);
        this.A06 = jSONObject.optString("status", (String) null);
        this.A01 = C18320x8.A06("bannerNotificationTimeStamp", jSONObject);
        this.A00 = jSONObject.optInt("priority", -1);
    }
}
