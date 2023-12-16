package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2p8  reason: invalid class name and case insensitive filesystem */
public final class C54692p8 {
    public final long A00;
    public final AnonymousClass20Z A01;
    public final AnonymousClass20L A02;
    public final UserJid A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54692p8) {
                C54692p8 r8 = (C54692p8) obj;
                if (!(C162457s7.A0P(this.A03, r8.A03) && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A01, C18300x5.A04(this.A03))), this.A00);
    }

    public C54692p8(AnonymousClass20Z r1, AnonymousClass20L r2, UserJid userJid, long j) {
        C18260x0.A0S(r1, r2);
        this.A03 = userJid;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public final JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("business_jid", this.A03.getRawString());
        A1G.put("business_type", this.A01.toString());
        A1G.put("conversion_event_type", this.A02.toString());
        A1G.put("conversion_event_timestamp", this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SurveyConversionInfo(businessJid=");
        A0o.append(this.A03);
        A0o.append(", businessType=");
        A0o.append(this.A01);
        A0o.append(", conversionEventType=");
        A0o.append(this.A02);
        A0o.append(", conversionEventTimestamp=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
