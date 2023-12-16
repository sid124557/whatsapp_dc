package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Y6  reason: invalid class name */
public final class AnonymousClass3Y6 implements C833648c {
    public C53212mj A00 = null;
    public UserJid A01;

    public AnonymousClass3Y6(UserJid userJid) {
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Y6) {
                AnonymousClass3Y6 r5 = (AnonymousClass3Y6) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SurveyQuickPromotionsUserFilterContext(userJid=");
        A0o.append(this.A01);
        A0o.append(", surveyInfo=");
        return C18260x0.A04(this.A00, A0o);
    }
}
