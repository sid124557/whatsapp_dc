package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.30K  reason: invalid class name */
public final class AnonymousClass30K {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C78613vI(this));

    public AnonymousClass30K(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void A04(AnonymousClass3ZO r5) {
        AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[1];
        AnonymousClass3Z6.A09(r5.A06, r5, r1, 0);
        Map A0G = C73813g7.A0G(r1);
        Map A03 = A03();
        if (true ^ A03.isEmpty()) {
            A0G.putAll(A03);
        }
        A06(A0G);
    }

    public void A05(List list) {
        boolean z;
        C162457s7.A0J(list, 0);
        Map A03 = A03();
        if (!A03.isEmpty()) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (!z) {
                        z = true;
                        if (A03.remove(next) == null) {
                        }
                    }
                }
            }
            if (z) {
                A06(A03);
            }
        }
    }

    public AnonymousClass3ZO A01(String str) {
        String string = C18310x6.A0F(this.A01).getString("framework_alert_list_info", (String) null);
        if (string != null) {
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            Iterator<String> keys = A1H.keys();
            C162457s7.A0D(keys);
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                if (C162457s7.A0P(A0m, str)) {
                    return A00(C18290x4.A0r(A0m, A1H));
                }
            }
        }
        return null;
    }

    public final Map A03() {
        String A0Z = C18280x3.A0Z(C18310x6.A0F(this.A01), "framework_alert_list_info");
        LinkedHashMap A0r = C18320x8.A0r();
        if (A0Z != null) {
            JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
            Iterator<String> keys = A1H.keys();
            C162457s7.A0D(keys);
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                C162457s7.A0H(A0m);
                A0r.put(A0m, A00(C18290x4.A0r(A0m, A1H)));
            }
        }
        return A0r;
    }

    public static final AnonymousClass3ZO A00(String str) {
        C60422yX r3;
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        String string = A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String string2 = A1H.getString("title");
        String string3 = A1H.getString("description");
        String string4 = A1H.getString("ctaText");
        String string5 = A1H.getString("scope");
        int i = A1H.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        boolean optBoolean = A1H.optBoolean("isCancelable", true);
        String optString = A1H.optString("phoenix_flow");
        C165897xo r4 = null;
        if (AnonymousClass001.A1W(AnonymousClass0x7.A06(optString))) {
            new C60422yX("");
            r3 = new C60422yX(C18290x4.A0r("config", AnonymousClass0x9.A1H(optString)));
        } else {
            r3 = null;
        }
        String optString2 = A1H.optString("legacy_payment_step_up_info");
        if (AnonymousClass0x7.A06(optString2) > 0) {
            r4 = C154407d7.A01(optString2);
        }
        C18280x3.A16(string, string2, string3);
        C162457s7.A0H(string4);
        C162457s7.A0H(string5);
        return new AnonymousClass3ZO(r3, r4, string, string2, string3, string4, string5, i, optBoolean);
    }

    public List A02() {
        Map A03 = A03();
        ArrayList A0s = AnonymousClass001.A0s();
        if (!A03.isEmpty()) {
            A0s.addAll(A03.values());
        }
        return A0s;
    }

    public final void A06(Map map) {
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A16 = AnonymousClass0x9.A16(map);
        while (A16.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A16);
            Object key = A0w.getKey();
            AnonymousClass3ZO r7 = (AnonymousClass3ZO) A0w.getValue();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r7.A06);
            A1G.put("title", r7.A08);
            A1G.put("description", r7.A05);
            A1G.put("ctaText", r7.A04);
            A1G.put("scope", r7.A07);
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r7.A01);
            A1G.put("isCancelable", r7.A09);
            C60422yX r0 = r7.A02;
            if (r0 != null) {
                A1G.put("phoenix_flow", C18280x3.A0c(r0.A00, "config", AnonymousClass0x9.A1G()));
            }
            C165897xo r02 = r7.A03;
            if (r02 != null) {
                A1G.put("legacy_payment_step_up_info", r02.A00().toString());
            }
            A0r.put(key, C18290x4.A0o(A1G));
        }
        SharedPreferences.Editor A04 = C18270x1.A04(this.A01);
        C162457s7.A0D(A04);
        A04.putString("framework_alert_list_info", C18280x3.A0d(A0r));
        A04.apply();
    }
}
