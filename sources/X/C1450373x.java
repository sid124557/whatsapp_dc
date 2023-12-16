package X;

import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.73x  reason: invalid class name and case insensitive filesystem */
public final class C1450373x {
    public static final AnonymousClass6fW A00(JSONArray jSONArray) {
        C162457s7.A0J(jSONArray, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            A0s.add(C109065e1.A02(jSONArray.getJSONObject(i)));
        }
        return new AnonymousClass6fW(A0s);
    }
}
