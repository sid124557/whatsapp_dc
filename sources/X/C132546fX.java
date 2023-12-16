package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6fX  reason: invalid class name and case insensitive filesystem */
public class C132546fX extends AnonymousClass7H7 {
    public final List A00;

    public C132546fX(List list) {
        super("popular_categories");
        this.A00 = list;
    }

    public static C132546fX A00(JSONArray jSONArray) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                A0s.add(C91824lC.A00(jSONArray.getJSONObject(i)));
            }
            return new C132546fX(A0s);
        }
        throw new JSONException("PopularCategoriesWidget/fromJson categories not found");
    }
}
