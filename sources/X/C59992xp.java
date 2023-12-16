package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2xp  reason: invalid class name and case insensitive filesystem */
public final class C59992xp {
    public static final List A02 = AnonymousClass8UF.A0o("ACCEPT", "START", "DENY", "OK");
    public final AnonymousClass1VX A00;
    public final C48212eX A01;

    public final C633338v A01(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (!C162457s7.A0P(optString, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID) || !jSONObject.has("v2") || !this.A00.A0Y(C58422vE.A02, 6674)) {
            String A0r = C18290x4.A0r("light", jSONObject);
            String optString2 = jSONObject.optString("dark");
            C162457s7.A0H(optString);
            return new C633338v((C142396x8) null, (C142406x9) null, A0r, optString2, optString);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("v2");
        String A0r2 = C18290x4.A0r("light", jSONObject2);
        if (jSONObject2.has("dark")) {
            str = jSONObject2.getString("dark");
        }
        C162457s7.A0H(optString);
        return new C633338v(AnonymousClass752.A00(jSONObject2.optString("role")), AnonymousClass753.A00(jSONObject2.optString("style")), A0r2, str, optString);
    }

    public final C104625Rs A00(JSONObject jSONObject, int i) {
        C1000659h r1;
        C141826wC r17;
        C165957xu r0;
        C166007xz r13;
        C166007xz r14;
        int i2 = i;
        try {
            LinkedHashMap A0r = C18320x8.A0r();
            JSONArray jSONArray = jSONObject.getJSONObject("privacy-disclosure").getJSONArray("prompts");
            C162457s7.A0D(jSONArray);
            Iterator A012 = C57282tO.A01(jSONArray);
            while (true) {
                if (A012.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) A012.next();
                    if (jSONObject2 != null) {
                        String A0r2 = C18290x4.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject2);
                        String A0r3 = C18290x4.A0r("template", jSONObject2);
                        String optString = jSONObject2.optString("height");
                        if (AnonymousClass0x7.A06(optString) > 0) {
                            r17 = C141826wC.valueOf(optString);
                        } else {
                            r17 = C633638y.A0B;
                        }
                        C633338v A013 = A01(jSONObject2.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON));
                        String optString2 = jSONObject2.optString("title");
                        String optString3 = jSONObject2.optString("body");
                        String optString4 = jSONObject2.optString("footer");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("bullets");
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            Iterator A014 = C57282tO.A01(optJSONArray);
                            while (A014.hasNext()) {
                                JSONObject jSONObject3 = (JSONObject) A014.next();
                                if (jSONObject3 != null) {
                                    A0s.add(new C632838q(A01(jSONObject3.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)), C18290x4.A0r("text", jSONObject3), jSONObject3.optString("secondaryText")));
                                }
                            }
                        }
                        C632838q[] r12 = (C632838q[]) A0s.toArray(new C632838q[0]);
                        JSONObject optJSONObject = jSONObject2.optJSONObject("nav");
                        if (optJSONObject == null) {
                            r0 = null;
                        } else {
                            r0 = new C165957xu(optJSONObject.optBoolean("dismissButton"));
                        }
                        JSONObject jSONObject4 = jSONObject2.getJSONObject("primaryButton");
                        if (jSONObject4 == null) {
                            r13 = null;
                        } else {
                            r13 = new C166007xz(C18290x4.A0r("action", jSONObject4), C18290x4.A0r("label", jSONObject4));
                        }
                        C162457s7.A0H(r13);
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("secondaryButton");
                        if (optJSONObject2 == null) {
                            r14 = null;
                        } else {
                            r14 = new C166007xz(C18290x4.A0r("action", optJSONObject2), C18290x4.A0r("label", optJSONObject2));
                        }
                        C633638y r122 = new C633638y(r13, r14, A013, r0, r17, A0r2, A0r3, optString2, optString3, optString4, r12);
                        String str = r122.A07;
                        if (A0r.containsKey(str)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Duplicated prompt name ");
                            A0o.append(str);
                            r1 = new C1000659h(AnonymousClass000.A0X(" in the disclosure", A0o));
                            break;
                        }
                        A0r.put(str, r122);
                    }
                } else {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    String str2 = "START";
                    if (!A0r.containsKey(str2)) {
                        r1 = new C1000659h("The START prompt is not defined in the disclosure");
                    } else {
                        while (!AnonymousClass8UF.A0o(null, "ACCEPT", "DENY", "OK").contains(str2) && (!A0r.isEmpty())) {
                            C633638y r02 = (C633638y) A0r.get(str2);
                            if (r02 != null) {
                                A0s2.add(r02);
                                A0r.remove(str2);
                                str2 = r02.A00.A00;
                            } else {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("Prompt ");
                                A0o2.append(str2);
                                r1 = new C1000659h(AnonymousClass000.A0X(" is not defined in the disclosure", A0o2));
                            }
                        }
                        return new C104625Rs(A0s2, i2);
                    }
                }
            }
            throw r1;
        } catch (Throwable th) {
            Throwable A002 = AnonymousClass3Z0.A00(th);
            if (A002 == null) {
                throw new C73143f0();
            }
            this.A01.A00(i2, C18290x4.A0a());
            throw new C1000659h(A002);
        }
    }

    public C59992xp(AnonymousClass1VX r1, C48212eX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
