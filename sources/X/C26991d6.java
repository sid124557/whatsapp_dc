package X;

import org.json.JSONObject;

/* renamed from: X.1d6  reason: invalid class name and case insensitive filesystem */
public abstract class C26991d6 extends AnonymousClass2WN {
    public AnonymousClass2P7 A03(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String string;
        if (jSONObject != null) {
            String string2 = jSONObject.getString("status");
            String A00 = AnonymousClass29C.A00(string2);
            if (!A00.equals("UNKNOWN_IN_CLIENT")) {
                String str4 = null;
                if (jSONObject.isNull("reason") || (string = jSONObject.getString("reason")) == null) {
                    str3 = null;
                } else {
                    str3 = "OOPS";
                    if (!str3.equals(string)) {
                        str3 = "OTHER";
                    }
                }
                if (!jSONObject.isNull("reason_url")) {
                    str4 = jSONObject.getString("reason_url");
                }
                return new AnonymousClass2P7(A00, str3, str4);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("State is invalid in ban appeal status: ");
            A0o.append(string2);
            AnonymousClass001.A1M(A0o);
            if (this instanceof C32981s6) {
                str2 = "whatsapp_support_process_ban_appeal_request";
            } else {
                str2 = "whatsapp_support_ban_appeal_status";
            }
            throw new Exception(AnonymousClass000.A0X(str2, A0o));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Value of ");
        if (this instanceof C32981s6) {
            str = "whatsapp_support_process_ban_appeal_request";
        } else {
            str = "whatsapp_support_ban_appeal_status";
        }
        A0o2.append(str);
        throw new Exception(AnonymousClass000.A0X(" is null while submitting ban appeal", A0o2));
    }
}
