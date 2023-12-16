package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7Sx  reason: invalid class name and case insensitive filesystem */
public class C150967Sx {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public C150967Sx(Integer num, List list, boolean z) {
        this.A01 = list;
        this.A00 = num;
        this.A02 = z;
    }

    public JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        if (this.A02) {
            A1G.put("has_catalog", 1);
        }
        Integer num = this.A00;
        if (num != null) {
            A1G.put("opening_hours", num);
        }
        List list = this.A01;
        if (list != null) {
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (int i = 0; i < list.size(); i++) {
                A1F.put(list.get(i));
            }
            A1G.put("subcategories", A1F);
        }
        if (A1G.length() == 0) {
            return null;
        }
        return A1G;
    }
}
