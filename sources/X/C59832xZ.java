package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2xZ  reason: invalid class name and case insensitive filesystem */
public final class C59832xZ {
    public static final JSONArray A00(Map map) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONArray A1F2 = AnonymousClass0x9.A1F();
            Iterator A0q2 = AnonymousClass000.A0q((Map) A0w.getValue());
            while (A0q2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                C51672kC r3 = (C51672kC) A0w2.getValue();
                JSONObject A0l = AnonymousClass0x2.A0l(r3);
                A0l.put("min_version", r3.A01);
                A0l.put("max_version", r3.A00);
                A0l.put("env", A0w2.getKey());
                A1F2.put(A0l);
            }
            A1G.put("version", A0w.getKey());
            A1G.put("android", A1F2);
            A1F.put(A1G);
        }
        return A1F;
    }

    public final C60742z5 A01(JSONObject jSONObject) {
        return new C60742z5(A02(jSONObject.optJSONArray("welj")), A02(jSONObject.optJSONArray("data_channel")), A02(jSONObject.optJSONArray("flow_message")));
    }

    public final Map A02(JSONArray jSONArray) {
        String A03;
        LinkedHashMap A0r = C18320x8.A0r();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String A032 = AnonymousClass355.A03("version", optJSONObject);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("android");
                    if (!(A032 == null || optJSONArray == null)) {
                        LinkedHashMap A0r2 = C18320x8.A0r();
                        int length2 = optJSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                            if (!(optJSONObject2 == null || (A03 = AnonymousClass355.A03("env", optJSONObject2)) == null)) {
                                A0r2.put(A03, new C51672kC(AnonymousClass355.A03("min_version", optJSONObject2), AnonymousClass355.A03("max_version", optJSONObject2)));
                            }
                        }
                        A0r.put(A032, A0r2);
                    }
                }
            }
        }
        return A0r;
    }
}
