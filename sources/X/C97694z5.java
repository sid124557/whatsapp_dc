package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4z5  reason: invalid class name and case insensitive filesystem */
public class C97694z5 extends C150607Rl {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;

    public C97694z5(int i) {
        super(i);
    }

    public JSONObject A00() {
        JSONObject A002 = super.A00();
        try {
            Integer num = this.A03;
            if (num != null) {
                A002.put("is_sim_number", num);
            }
            Boolean bool = this.A01;
            if (bool != null) {
                A002.put("is_sim_absent", bool);
            }
            Boolean bool2 = this.A00;
            if (bool2 != null) {
                A002.put("is_permission_granted", bool2);
            }
            Boolean bool3 = this.A02;
            if (bool3 != null) {
                A002.put("isUserChoosingToMigrateFromConsumerAppDirectly", bool3);
            }
        } catch (JSONException unused) {
        }
        return A002;
    }
}
