package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C22781Qb extends AnonymousClass2UV {
    public int A00;
    public String A01;
    public String A02;

    public C22781Qb(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C18260x0.A0q("ConversationSketchEvent/ generate256SHAHashID generating hash for: ", str, AnonymousClass001.A0o());
        try {
            String A06 = C627236i.A06(C18320x8.A1Z(AnonymousClass0x7.A0t().digest(str.getBytes(StandardCharsets.UTF_8)), 32));
            C18260x0.A0q("ConversationSketchEvent/generateIDHash hash=", A06, AnonymousClass001.A0o());
            return A06.toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            Log.e("ConversationSketchEvent/generateIDHash unable to create id because sha256 instance could not created.", e);
            return null;
        }
    }

    public boolean A04(String str) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A00 = A1H.optInt("seq_id", -1);
            this.A01 = A1H.optString("event_type", "unknown");
            this.A02 = A1H.optString("message_type", "unknown");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchEvent: fromJsonString threw: ", e);
            return false;
        }
    }
}
