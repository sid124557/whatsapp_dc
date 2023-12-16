package X;

import org.json.JSONObject;

/* renamed from: X.0IM  reason: invalid class name */
public final class AnonymousClass0IM {
    public static final boolean A00(String str) {
        C162457s7.A0J(str, 0);
        if (str.length() == 0) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
