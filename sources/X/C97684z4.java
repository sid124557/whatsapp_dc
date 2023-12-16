package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4z4  reason: invalid class name and case insensitive filesystem */
public class C97684z4 extends C150607Rl {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;

    public C97684z4(int i) {
        super(i);
    }

    public JSONObject A00() {
        JSONObject A002 = super.A00();
        try {
            Boolean bool = this.A00;
            if (bool != null) {
                A002.put("flash_call_end_success", bool);
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A002.put("no_flash_call_id_received", bool2);
            }
            Boolean bool3 = this.A01;
            if (bool3 != null) {
                A002.put("invalid_flash_call_received", bool3);
            }
        } catch (JSONException unused) {
        }
        return A002;
    }
}
