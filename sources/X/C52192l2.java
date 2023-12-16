package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.2l2  reason: invalid class name and case insensitive filesystem */
public class C52192l2 {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C60152y5 A02;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("triggered_block_prefs");
            this.A00 = sharedPreferences;
        }
        C626936e.A06(sharedPreferences);
        return sharedPreferences;
    }

    public C52192l2(C60152y5 r1) {
        this.A02 = r1;
    }

    public final JSONObject A01(C95814uZ r4) {
        String string = A00().getString(r4.getRawString(), (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AnonymousClass0x9.A1H(string);
    }

    public final void A02(C95814uZ r3, JSONObject jSONObject) {
        C18270x1.A0e(A00().edit(), jSONObject, r3.getRawString());
    }
}
