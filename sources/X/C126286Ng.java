package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.6Ng  reason: invalid class name and case insensitive filesystem */
public class C126286Ng extends C150297Qb implements C180558lG {
    public final C150297Qb A00;
    public final String A01;

    public JSONObject Bqp() {
        JSONObject Bqp = ((C180558lG) this.A00).Bqp();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            Bqp.put("feature_name", str);
        }
        return Bqp;
    }

    public C126286Ng(C150297Qb r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
