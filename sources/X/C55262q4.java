package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2q4  reason: invalid class name and case insensitive filesystem */
public class C55262q4 {
    public SharedPreferences A00;
    public C56612sH A01;
    public final C60152y5 A02;

    public final synchronized SharedPreferences A01() {
        if (this.A00 == null) {
            SharedPreferences A03 = this.A02.A03("companion_mode_prefs");
            this.A00 = A03;
            if (A03.contains("contacts_except_feature_flag")) {
                C18270x1.A0n(this.A00, "contacts_except_feature_flag");
            }
        }
        return this.A00;
    }

    public C55262q4(C56612sH r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static SharedPreferences.Editor A00(C55262q4 r0) {
        return r0.A01().edit();
    }

    public JSONObject A02() {
        String string = A01().getString("history_sync_companion_state", (String) null);
        try {
            if (!TextUtils.isEmpty(string)) {
                return AnonymousClass0x9.A1H(string);
            }
        } catch (JSONException unused) {
            C18260x0.A0r("syncd-shared-preferencecs/ Invalid JSON value:", string, AnonymousClass001.A0o());
        }
        return null;
    }

    public byte[] A03() {
        String string = A01().getString("adv_signed_identity", (String) null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 3);
        }
        return null;
    }
}
