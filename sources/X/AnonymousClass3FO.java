package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3FO  reason: invalid class name */
public class AnonymousClass3FO implements AnonymousClass4E8 {
    public C56612sH A00;
    public final C52192l2 A01;

    public void BQW() {
        SharedPreferences sharedPreferences;
        C52192l2 r9 = this.A01;
        long A0H = this.A00.A0H();
        synchronized (r9) {
            sharedPreferences = r9.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r9.A02.A03("triggered_block_prefs_purge_ts");
                r9.A01 = sharedPreferences;
            }
            C626936e.A06(sharedPreferences);
        }
        if (A0H >= sharedPreferences.getLong("tb_purge_last_ts", 0) + 86400000) {
            if (!sharedPreferences.edit().putLong("tb_purge_last_ts", A0H).commit()) {
                Log.w("triggered-block/purgeIfNeeded unable to commit last purge ts.");
            }
            try {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0q = AnonymousClass000.A0q(r9.A00().getAll());
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    Object key = A0w.getKey();
                    String A12 = AnonymousClass0x9.A12(A0w);
                    if (!TextUtils.isEmpty(A12)) {
                        JSONObject A1H = AnonymousClass0x9.A1H(A12);
                        if (!A1H.has("tb_expired_ts") || A0H >= A1H.getLong("tb_expired_ts")) {
                            if (A1H.has("tb_last_action_ts")) {
                                if (A1H.has("tb_cooldown") && A0H < A1H.getLong("tb_last_action_ts") + A1H.getLong("tb_cooldown")) {
                                }
                            }
                            if (A1H.has("tb_last_action_ts") && !A1H.has("tb_cooldown") && A0H < A1H.getLong("tb_last_action_ts") + 31536000000L) {
                            }
                        }
                    }
                    A0s.add(key);
                }
                SharedPreferences.Editor edit = r9.A00().edit();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    edit.remove(AnonymousClass001.A0m(it));
                }
                if (!edit.commit()) {
                    Log.w("triggered-block/purge unable to commit after purge.");
                }
                A0s.size();
            } catch (JSONException unused) {
            }
        }
    }

    public AnonymousClass3FO(C52192l2 r1) {
        this.A01 = r1;
    }

    public String BDW() {
        return "TriggeredBlockSharedPreferencesDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
