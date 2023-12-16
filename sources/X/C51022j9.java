package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2j9  reason: invalid class name and case insensitive filesystem */
public final class C51022j9 {
    public final C50872iu A00;

    public C51022j9(C50872iu r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final synchronized List A01(C95804uY r2) {
        List list;
        C162457s7.A0J(r2, 0);
        C51012j8 A002 = A00(r2);
        if (A002 != null) {
            list = C73723fy.A0F(A002.A00);
        } else {
            list = C72023d3.A00;
        }
        return list;
    }

    public final C51012j8 A00(C95804uY r5) {
        try {
            String A002 = this.A00.A00(C18260x0.A03(r5, "geosuspension_", AnonymousClass001.A0o()));
            if (A002 == null || A002.length() == 0) {
                return new C51012j8(AnonymousClass0x9.A17());
            }
            JSONObject A1H = AnonymousClass0x9.A1H(A002);
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            JSONArray jSONArray = A1H.getJSONArray("countries");
            C162457s7.A0D(jSONArray);
            Iterator A01 = C57282tO.A01(jSONArray);
            while (A01.hasNext()) {
                JSONObject jSONObject = (JSONObject) A01.next();
                C162457s7.A0J(jSONObject, 0);
                String string = jSONObject.getString("iso_code");
                C162457s7.A0H(string);
                A17.add(new C51002j7(string));
            }
            return new C51012j8(A17);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void A02(C95804uY r8, C51012j8 r9) {
        String A03 = C18260x0.A03(r8, "geosuspension_", AnonymousClass001.A0o());
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            Set<C51002j7> set = r9.A00;
            ArrayList A0c = C73783g4.A0c(set);
            for (C51002j7 r0 : set) {
                JSONObject A0l = AnonymousClass0x2.A0l(r0);
                A0l.put("iso_code", r0.A00);
                A0c.add(A0l);
            }
            this.A00.A02(A03, C18280x3.A0c(new JSONArray(A0c), "countries", A1G));
        } catch (Throwable th) {
            AnonymousClass3Z0.A01(th);
        }
    }
}
