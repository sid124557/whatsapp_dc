package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.31K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31K {
    public static List A01(AnonymousClass4E1 r4, JSONArray jSONArray) {
        C383026z r3 = new C383026z(r4, 3);
        if (jSONArray == null) {
            return C72023d3.A00;
        }
        C175698Zj A02 = C175708Zk.A02(0, jSONArray.length());
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            JSONObject optJSONObject = jSONArray.optJSONObject(((C72013d2) it).A00());
            if (optJSONObject != null) {
                A0s.add(optJSONObject);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Object invoke = r3.invoke(it2.next());
            if (invoke != null) {
                A0s2.add(invoke);
            }
        }
        return A0s2;
    }

    public static List A00(AnonymousClass4E1 r3, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object B3b : list) {
            Object B3b2 = r3.B3b(B3b);
            if (B3b2 != null) {
                A0s.add(B3b2);
            }
        }
        return A0s;
    }

    public static JSONArray A02(AnonymousClass4E1 r4, List list) {
        if (list.isEmpty()) {
            return null;
        }
        C383026z r3 = new C383026z(r4, 4);
        JSONArray A1F = AnonymousClass0x9.A1F();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object invoke : list) {
            Object invoke2 = r3.invoke(invoke);
            if (invoke2 != null) {
                A0s.add(invoke2);
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass0x7.A1L(it, A1F);
        }
        return A1F;
    }
}
