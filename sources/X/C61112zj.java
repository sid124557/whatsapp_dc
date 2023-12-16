package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2zj  reason: invalid class name and case insensitive filesystem */
public final class C61112zj {
    public final AnonymousClass1VX A00;

    public C61112zj(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.5Rt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: long[]} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61202zs A02(org.json.JSONObject r12) {
        /*
            r11 = this;
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            java.lang.String r0 = "start"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.5RT r9 = A00(r0)
            java.lang.String r0 = "duration"
            org.json.JSONObject r4 = r12.optJSONObject(r0)
            r10 = 0
            if (r4 == 0) goto L_0x0051
            java.lang.String r0 = "static"
            r1 = -1
            int r0 = r4.optInt(r0, r1)
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == r1) goto L_0x0048
            long r2 = (long) r0
            long r2 = r2 * r7
        L_0x0027:
            java.lang.String r0 = "repeat"
            org.json.JSONArray r6 = r4.optJSONArray(r0)
            if (r6 == 0) goto L_0x004b
            int r0 = r6.length()
            long[] r10 = new long[r0]
            int r5 = r6.length()
            r4 = 0
        L_0x003b:
            if (r4 >= r5) goto L_0x004b
            int r0 = r6.getInt(r4)
            long r0 = (long) r0
            long r0 = r0 * r7
            r10[r4] = r0
            int r4 = r4 + 1
            goto L_0x003b
        L_0x0048:
            r2 = -1
            goto L_0x0027
        L_0x004b:
            X.5Rt r0 = new X.5Rt
            r0.<init>(r10, r2)
            r10 = r0
        L_0x0051:
            java.lang.String r0 = "end"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.5RT r2 = A00(r0)
            java.lang.String r0 = "activation"
            java.lang.String r1 = r12.optString(r0)
            X.2zs r0 = new X.2zs
            r0.<init>(r10, r9, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61112zj.A02(org.json.JSONObject):X.2zs");
    }

    public static final AnonymousClass5RT A00(JSONObject jSONObject) {
        TimeZone timeZone;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("time");
        String string2 = jSONObject.getString("reference");
        SimpleDateFormat A0u = AnonymousClass0x7.A0u("yyyy-MM-dd'T'HH:mm:ss'Z'");
        if ("utc".equalsIgnoreCase(string2)) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        try {
            A0u.setTimeZone(timeZone);
            Date parse = A0u.parse(string);
            C626936e.A06(parse);
            return new AnonymousClass5RT(parse.getTime());
        } catch (ParseException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("UserNoticeTiming/getDate/Unable to parse date: ");
            A0o.append(string);
            C18260x0.A0r(" reference: ", string2, A0o);
            throw C18330xA.A09(e);
        }
    }

    public final C53722nY A01(JSONObject jSONObject, int i) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject2;
        String string;
        String A002;
        C142396x8 A003;
        int i2 = i;
        JSONObject jSONObject3 = jSONObject;
        try {
            int i3 = jSONObject3.getInt("policyVersion");
            AnonymousClass1kT r8 = null;
            if (jSONObject3.has("banner") && (optJSONObject2 = jSONObject3.optJSONObject("banner")) != null) {
                String string2 = optJSONObject2.getString("text");
                String string3 = optJSONObject2.getString("iconDescription");
                String string4 = optJSONObject2.getString("action");
                AnonymousClass1VX r9 = this.A00;
                JSONObject jSONObject4 = optJSONObject2.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                C142406x9 r11 = null;
                if (!jSONObject4.has("v2") || !r9.A0Y(C58422vE.A02, 6674)) {
                    jSONObject2 = null;
                } else {
                    jSONObject2 = jSONObject4.getJSONObject("v2");
                }
                if (jSONObject2 == null) {
                    string = jSONObject4.getString("light");
                } else {
                    string = jSONObject2.getString("light");
                }
                if (jSONObject2 == null) {
                    A002 = jSONObject4.getString("dark");
                    A003 = null;
                } else {
                    A002 = C57282tO.A00("dark", jSONObject2, false);
                    if (A002 == null) {
                        A002 = jSONObject2.getString("light");
                    }
                    A003 = AnonymousClass752.A00(C57282tO.A00("role", jSONObject2, false));
                    if (A003 == null) {
                        A003 = C142396x8.DEFAULT;
                    }
                    r11 = AnonymousClass753.A00(C57282tO.A00("style", jSONObject2, false));
                    if (r11 == null) {
                        r11 = C142406x9.PLAIN;
                    }
                }
                C162457s7.A0H(string);
                C162457s7.A0H(A002);
                C18260x0.A0Q(string, A002);
                JSONObject jSONObject5 = optJSONObject2.getJSONObject("timing");
                C162457s7.A0H(jSONObject5);
                r8 = new AnonymousClass1kT(A02(jSONObject5), A003, r11, string2, string, A002, string3, string4);
            }
            AnonymousClass1kU A03 = A03("modal", jSONObject3, true);
            AnonymousClass1kU A032 = A03("blocking-modal", jSONObject3, false);
            C53012mP r7 = null;
            if (jSONObject3.has("badged-notice") && (optJSONObject = jSONObject3.optJSONObject("badged-notice")) != null) {
                String string5 = optJSONObject.getString("text");
                String string6 = optJSONObject.getString("action");
                JSONObject jSONObject6 = optJSONObject.getJSONObject("timing");
                C162457s7.A0H(jSONObject6);
                C61202zs A02 = A02(jSONObject6);
                int A004 = C100475Bb.A00(optJSONObject);
                C162457s7.A0H(string5);
                C162457s7.A0H(string6);
                r7 = new C53012mP(A02, string5, string6, A004);
            }
            return new C53722nY(r8, A03, A032, r7, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, i2, i3);
        } catch (IOException | JSONException e) {
            Log.e(C18260x0.A05("Failed to parse user notice content for notice id: ", i2), e);
            return null;
        }
    }

    public final AnonymousClass1kU A03(String str, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        String string;
        String A002;
        C142396x8 A003;
        String str2;
        String str3;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        if (!jSONObject3.has(str4) || (optJSONObject = jSONObject3.optJSONObject(str4)) == null) {
            return null;
        }
        String string2 = optJSONObject.getString("title");
        String string3 = optJSONObject.getString("iconDescription");
        String string4 = optJSONObject.getString("buttonText");
        AnonymousClass1VX r8 = this.A00;
        JSONObject jSONObject4 = optJSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        C142406x9 r0 = null;
        if (!jSONObject4.has("v2") || !r8.A0Y(C58422vE.A02, 6674)) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject4.getJSONObject("v2");
        }
        if (jSONObject2 == null) {
            string = jSONObject4.getString("light");
        } else {
            string = jSONObject2.getString("light");
        }
        if (jSONObject2 == null) {
            A002 = jSONObject4.getString("dark");
            A003 = null;
        } else {
            A002 = C57282tO.A00("dark", jSONObject2, false);
            if (A002 == null) {
                A002 = jSONObject2.getString("light");
            }
            A003 = AnonymousClass752.A00(C57282tO.A00("role", jSONObject2, false));
            if (A003 == null) {
                A003 = C142396x8.DEFAULT;
            }
            r0 = AnonymousClass753.A00(C57282tO.A00("style", jSONObject2, false));
            if (r0 == null) {
                r0 = C142406x9.PLAIN;
            }
        }
        C162457s7.A0H(string);
        C162457s7.A0H(A002);
        C18260x0.A0Q(string, A002);
        JSONObject jSONObject5 = optJSONObject.getJSONObject("timing");
        C162457s7.A0H(jSONObject5);
        C47462dI r12 = new C47462dI(A02(jSONObject5), string, A002, string3, string2, string4);
        r12.A00 = A003;
        r12.A01 = r0;
        JSONArray jSONArray = optJSONObject.getJSONArray("bullets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
            String string5 = jSONObject6.getString("text");
            JSONObject optJSONObject2 = jSONObject6.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            if (optJSONObject2 != null) {
                str3 = optJSONObject2.getString("light");
                str2 = optJSONObject2.getString("dark");
            } else {
                str2 = null;
                str3 = null;
            }
            r12.A0A.add(new AnonymousClass5SH(string5, str3, str2));
        }
        String optString = optJSONObject.optString("body");
        if (!(optString == null || optString.length() == 0)) {
            r12.A03 = optString;
        }
        String optString2 = optJSONObject.optString("footer");
        if (!(optString2 == null || optString2.length() == 0)) {
            r12.A05 = optString2;
        }
        if (z) {
            r12.A04 = optJSONObject.getString("dismissText");
        }
        return r12.A00();
    }
}
