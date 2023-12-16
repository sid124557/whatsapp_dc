package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2qt  reason: invalid class name and case insensitive filesystem */
public class C55772qt {
    public SharedPreferences A00;
    public final C60152y5 A01;
    public final TreeMap A02 = new TreeMap();

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("user_notice_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public TreeMap A03() {
        String A0Z;
        TreeMap treeMap = this.A02;
        if (treeMap.isEmpty() && (A0Z = C18280x3.A0Z(A01(), "user_notices")) != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    treeMap.put(Integer.valueOf(A0m), C622234e.A00(AnonymousClass0x9.A1H(A1H.get(A0m).toString())));
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return treeMap;
    }

    public C55772qt(C60152y5 r2) {
        this.A01 = r2;
    }

    public static SharedPreferences.Editor A00(C55772qt r1) {
        return r1.A01().edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp");
    }

    public C622234e A02() {
        SharedPreferences A012 = A01();
        int i = A012.getInt("current_user_notice_id", -1);
        if (i == -1) {
            return null;
        }
        return new C622234e(i, A012.getInt("current_user_notice_stage", 0), A012.getInt("current_user_notice_version", 0), AnonymousClass0x2.A0B(A012, "current_user_notice_stage_timestamp"), 0);
    }

    public void A04(C622234e r6) {
        SharedPreferences.Editor edit = A01().edit();
        int i = r6.A01;
        C18270x1.A0h(edit.putInt("current_user_notice_id", i).putInt("current_user_notice_stage", r6.A00).putLong("current_user_notice_stage_timestamp", r6.A04), "current_user_notice_version", r6.A03);
        TreeMap A03 = A03();
        AnonymousClass0x2.A1H(r6, A03, i);
        A05(AnonymousClass002.A0J(A03.values()));
    }

    public void A05(List list) {
        HashMap A0t = AnonymousClass001.A0t();
        TreeMap treeMap = this.A02;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C622234e r3 = (C622234e) it.next();
            JSONObject A012 = C622234e.A01(r3);
            if (A012 != null) {
                int i = r3.A01;
                A0t.put(String.valueOf(i), A012.toString());
                AnonymousClass0x2.A1H(r3, treeMap, i);
            }
        }
        C18270x1.A0j(A01().edit(), "user_notices", C18280x3.A0d(A0t));
    }
}
