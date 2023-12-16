package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rU  reason: invalid class name and case insensitive filesystem */
public class C56142rU {
    public final SharedPreferences A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass1VW A03;
    public final C28811ho A04;
    public final AnonymousClass2GP A05;
    public final C56952sp A06;
    public final AnonymousClass4AF A07;
    public final C60152y5 A08;
    public final C183538qC A09;

    public synchronized long A00() {
        return AnonymousClass0x2.A0B(this.A00, "ab_props:sys:last_refresh_time");
    }

    public synchronized String A01() {
        String str;
        Set<String> stringSet = this.A00.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
        if (stringSet == null) {
            str = "";
        } else {
            str = TextUtils.join(",", stringSet);
        }
        return str;
    }

    public synchronized void A02() {
        AnonymousClass1VW r0 = this.A03;
        r0.A0U();
        C18270x1.A0m(r0.A0Z());
    }

    public synchronized void A03(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i);
        edit.apply();
    }

    public synchronized void A04(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:last_error_code", i);
        edit.apply();
    }

    public synchronized void A05(String str) {
        Log.i("CheckIfReinstalledTask/updatePreChatdABProps");
        A02();
        if (TextUtils.isEmpty(str)) {
            Log.i("CheckIfReinstalledTask/updatePreChatdABProps/empty expConfigs");
        } else {
            try {
                SharedPreferences.Editor edit = this.A03.A0Z().edit();
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        A06(edit, jSONObject.getString("config_value"), Integer.parseInt(jSONObject.getString("config_code")));
                    }
                }
                edit.apply();
            } catch (JSONException e) {
                Log.e("ABPropsManager/updatePreChatdABProps/update abprop configs failed", e);
            }
        }
        return;
    }

    public C56142rU(C56612sH r2, C54292oU r3, AnonymousClass1VW r4, C28811ho r5, AnonymousClass2GP r6, C56952sp r7, AnonymousClass4AF r8, C60152y5 r9, C183538qC r10) {
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r9.A03("ab-props");
        this.A08 = r9;
        this.A09 = r10;
    }

    public final boolean A06(SharedPreferences.Editor editor, String str, int i) {
        AnonymousClass8OQ r0;
        AnonymousClass8OQ r02;
        AnonymousClass8OQ r03;
        AnonymousClass8OQ r04;
        AnonymousClass8OQ r05;
        if (!TextUtils.isEmpty(str)) {
            String num = Integer.toString(i);
            try {
                C56952sp r4 = this.A06;
                boolean z = r4 instanceof AnonymousClass1VX;
                if (z) {
                    r0 = ((AnonymousClass1VX) r4).A00;
                } else {
                    r0 = ((AnonymousClass1VW) r4).A00.A00;
                }
                Integer valueOf = Integer.valueOf(i);
                if (r0.containsKey(valueOf)) {
                    editor.putBoolean(num, AnonymousClass000.A1S(Integer.parseInt(str)));
                    return true;
                }
                if (z) {
                    r02 = ((AnonymousClass1VX) r4).A02;
                } else {
                    r02 = ((AnonymousClass1VW) r4).A00.A02;
                }
                if (r02.containsKey(valueOf)) {
                    editor.putInt(num, Integer.parseInt(str));
                    return true;
                }
                if (z) {
                    r03 = ((AnonymousClass1VX) r4).A01;
                } else {
                    r03 = ((AnonymousClass1VW) r4).A00.A01;
                }
                if (r03.containsKey(valueOf)) {
                    editor.putFloat(num, Float.parseFloat(str));
                    return true;
                }
                if (z) {
                    r04 = ((AnonymousClass1VX) r4).A04;
                } else {
                    r04 = ((AnonymousClass1VW) r4).A00.A04;
                }
                if (!r04.containsKey(valueOf)) {
                    if (z) {
                        r05 = ((AnonymousClass1VX) r4).A03;
                    } else {
                        r05 = ((AnonymousClass1VW) r4).A00.A03;
                    }
                    if (r05.containsKey(valueOf)) {
                        new JSONObject(str);
                    }
                }
                editor.putString(num, str);
                return true;
            } catch (NumberFormatException | JSONException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ABPropsManager/invalid format for config; configCode=");
                A0o.append(i);
                C18260x0.A0u("; value=", str, A0o, e);
            }
        }
        return false;
    }
}
