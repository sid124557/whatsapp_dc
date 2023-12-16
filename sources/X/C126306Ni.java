package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.6Ni  reason: invalid class name and case insensitive filesystem */
public final class C126306Ni extends C150297Qb implements C180558lG {
    public static final C126306Ni A00 = new C126306Ni();

    public int hashCode() {
        return Arrays.hashCode(new boolean[]{false, false, false, false});
    }

    public boolean equals(Object obj) {
        if (obj instanceof C126306Ni) {
            return true;
        }
        return false;
    }

    public JSONObject Bqp() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("is_user_scoped", false);
        A1G.put("keep_data_between_sessions", false);
        A1G.put("userid_in_path", false);
        A1G.put("keep_data_on_account_removal", false);
        return A1G;
    }
}
