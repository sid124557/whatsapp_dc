package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.2tT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57332tT {
    public static boolean A03(JSONObject jSONObject, Object[] objArr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, objArr);
        return A02(hashSet, jSONObject);
    }

    public static String A00(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
            return null;
        }
        return optString;
    }

    public static boolean A01(String str, JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, new String[]{str});
        return A02(hashSet, jSONObject);
    }

    public static boolean A02(Set set, JSONObject jSONObject) {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (!jSONObject.has(A0m)) {
                A0K.add(A0m);
            }
        }
        return A0K.isEmpty();
    }
}
