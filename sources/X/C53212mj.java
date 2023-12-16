package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2mj  reason: invalid class name and case insensitive filesystem */
public final class C53212mj {
    public final long A00;
    public final C54692p8 A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53212mj) {
                C53212mj r8 = (C53212mj) obj;
                if (!C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03) || this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A00(AnonymousClass0x2.A07(this.A03, AnonymousClass000.A08(this.A02, C18310x6.A09(this.A04))), this.A00));
    }

    public C53212mj(C54692p8 r1, UserJid userJid, String str, String str2, long j) {
        C18260x0.A0R(str, str2);
        this.A04 = str;
        this.A02 = userJid;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SurveyInfo(sessionId=");
        A0o.append(this.A04);
        A0o.append(", businessJid=");
        A0o.append(this.A02);
        A0o.append(", businessSessionId=");
        A0o.append(this.A03);
        A0o.append(", surveyStartTimestamp=");
        A0o.append(this.A00);
        A0o.append(", conversionInfo=");
        return C18260x0.A04(this.A01, A0o);
    }
}
