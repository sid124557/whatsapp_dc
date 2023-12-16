package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.7kw  reason: invalid class name and case insensitive filesystem */
public final class C159007kw {
    public final Bundle A00;

    public static String A00(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean A01(Bundle bundle) {
        String str = "gcm.n.e";
        if (!"1".equals(bundle.getString(str))) {
            if (str.startsWith("gcm.n.")) {
                str = str.replace("gcm.n.", "gcm.notification.");
            }
            if (!"1".equals(bundle.getString(str))) {
                String str2 = "gcm.n.icon";
                if (bundle.getString(str2) == null) {
                    if (str2.startsWith("gcm.n.")) {
                        str2 = str2.replace("gcm.n.", "gcm.notification.");
                    }
                    if (bundle.getString(str2) != null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final Bundle A02() {
        Bundle bundle = this.A00;
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (!A0m.startsWith("google.c.a.") && !A0m.equals("from")) {
                bundle2.remove(A0m);
            }
        }
        return bundle2;
    }

    public final String A05(String str) {
        Bundle bundle = this.A00;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public C159007kw(Bundle bundle) {
        this.A00 = new Bundle(bundle);
    }

    public final Integer A03(String str) {
        String A05 = A05(str);
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A05));
        } catch (NumberFormatException unused) {
            String A002 = A00(str);
            StringBuilder A0q = AnonymousClass6C7.A0q(A05, AnonymousClass6C7.A06(A002) + 38);
            A0q.append("Couldn't parse value of ");
            C18310x6.A1O(A0q, A002);
            A0q.append(A05);
            Log.w("NotificationParams", AnonymousClass000.A0X(") into an int", A0q));
            return null;
        }
    }

    public final String A04(Resources resources, String str, String str2) {
        String[] strArr;
        String A05 = A05(str2);
        if (!TextUtils.isEmpty(A05)) {
            return A05;
        }
        String valueOf = String.valueOf(str2);
        int length = "_loc_key".length();
        String A052 = A05(AnonymousClass6C7.A0k(valueOf, "_loc_key", length));
        if (!TextUtils.isEmpty(A052)) {
            int identifier = resources.getIdentifier(A052, "string", str);
            if (identifier == 0) {
                String A002 = A00(AnonymousClass6C7.A0k(String.valueOf(str2), "_loc_key", length));
                StringBuilder A0q = AnonymousClass6C7.A0q(str2, AnonymousClass6C7.A06(A002) + 49);
                A0q.append(A002);
                A0q.append(" resource not found: ");
                AnonymousClass6C7.A1F(str2, " Default value will be used.", "NotificationParams", A0q);
            } else {
                JSONArray A06 = A06(AnonymousClass6C7.A0k(String.valueOf(str2), "_loc_args", "_loc_args".length()));
                if (A06 == null) {
                    strArr = null;
                } else {
                    int length2 = A06.length();
                    strArr = new String[length2];
                    for (int i = 0; i < length2; i++) {
                        strArr[i] = A06.optString(i);
                    }
                }
                if (strArr == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, strArr);
                } catch (MissingFormatArgumentException e) {
                    String A003 = A00(str2);
                    String arrays = Arrays.toString(strArr);
                    StringBuilder A0q2 = AnonymousClass6C7.A0q(arrays, AnonymousClass6C7.A06(A003) + 58);
                    A0q2.append("Missing format argument for ");
                    A0q2.append(A003);
                    Log.w("NotificationParams", AnonymousClass000.A0U(": ", arrays, " Default value will be used.", A0q2), e);
                    return null;
                }
            }
        }
        return null;
    }

    public final JSONArray A06(String str) {
        String A05 = A05(str);
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        try {
            return new JSONArray(A05);
        } catch (JSONException unused) {
            String A002 = A00(str);
            StringBuilder A0q = AnonymousClass6C7.A0q(A05, AnonymousClass6C7.A06(A002) + 50);
            A0q.append("Malformed JSON for key ");
            A0q.append(A002);
            A0q.append(": ");
            A0q.append(A05);
            Log.w("NotificationParams", AnonymousClass000.A0X(", falling back to default", A0q));
            return null;
        }
    }

    public final boolean A07(String str) {
        String A05 = A05(str);
        if ("1".equals(A05) || Boolean.parseBoolean(A05)) {
            return true;
        }
        return false;
    }
}
