package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5OP  reason: invalid class name */
public class AnonymousClass5OP {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;

    public JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            Integer num = this.A00;
            if (num != null) {
                A1G.put("click_link", num);
            }
            Integer num2 = this.A01;
            if (num2 != null) {
                A1G.put("permission_granted", num2);
            }
            Integer num3 = this.A02;
            if (num3 != null) {
                A1G.put("suggestion_accepted", num3);
            }
            Integer num4 = this.A04;
            if (num4 != null) {
                A1G.put("num_suggestions", num4);
            }
            Integer num5 = this.A03;
            if (num5 != null) {
                A1G.put("sim_number_invalid", num5);
            }
            String str = this.A05;
            if (str != null) {
                A1G.put("backup_token_source", str);
            }
            return A1G;
        } catch (JSONException e) {
            Log.e("ExistClientMetrics/toJSON exception: ", e);
            return null;
        }
    }
}
