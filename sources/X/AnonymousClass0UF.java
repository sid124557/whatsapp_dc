package X;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0UF  reason: invalid class name */
public final class AnonymousClass0UF {
    public final long A00;
    public final long A01;
    public final AnonymousClass0WN A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0UF.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0UF r7 = (AnonymousClass0UF) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Long.valueOf(this.A00), Long.valueOf(this.A01)});
    }

    public static AnonymousClass0UF A00(AnonymousClass0WN r14, String str) {
        AnonymousClass0WN r9 = r14;
        String str2 = str;
        try {
            String A022 = r14.A02(str);
            if (A022 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(A022);
                    String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String optString2 = jSONObject.optString("md5Hash");
                    long optLong = jSONObject.optLong("sizeBytes");
                    String optString3 = jSONObject.optString("updateTime");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                        Time time = new Time();
                        time.parse3339(optString3);
                        return new AnonymousClass0UF(r9, optString, optString2, optLong, time.toMillis(true));
                    }
                } catch (TimeFormatException | JSONException e) {
                    Log.e(AnonymousClass000.A0U("gdrive/file-metadata/failed to parse metadata \"", A022, "\"", AnonymousClass001.A0o()), e);
                    return null;
                }
            }
        } catch (Exception e2) {
            Log.e(AnonymousClass000.A0U("gdrive/file-metadata/failed to parse metadata \"", str2, "\"", AnonymousClass001.A0o()), e2);
        }
        return null;
    }

    public String A01() {
        AnonymousClass0WN r4 = this.A02;
        if (!r4.A0G()) {
            return null;
        }
        try {
            Time time = new Time();
            time.set(this.A01);
            return r4.A03(new JSONObject().put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A04).put("md5Hash", this.A03).put("sizeBytes", this.A00).put("updateTime", time.format3339(false)).toString());
        } catch (JSONException e) {
            Log.e("gdrive/file-metadata/failed to create metadata", e);
            return null;
        }
    }

    public AnonymousClass0UF(AnonymousClass0WN r1, String str, String str2, long j, long j2) {
        this.A02 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FileMetadata{name='");
        A0o.append(this.A04);
        A0o.append('\'');
        A0o.append(", md5Hash='");
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", sizeBytes=");
        A0o.append(this.A00);
        A0o.append(", updateTime=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }
}
