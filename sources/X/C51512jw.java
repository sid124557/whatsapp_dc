package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
public final class C51512jw {
    public final UserJid A00;
    public final JSONObject A01;

    public C51512jw(UserJid userJid, JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 2);
        this.A00 = userJid;
        this.A01 = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51512jw) {
                C51512jw r5 = (C51512jw) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CtwaTrustSignalInfo(jid=");
        A0o.append(this.A00);
        A0o.append(", data=");
        return C18260x0.A04(this.A01, A0o);
    }
}
