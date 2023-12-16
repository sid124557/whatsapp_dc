package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6gM  reason: invalid class name */
public final class AnonymousClass6gM extends AnonymousClass7DQ {
    public final C43072Qq A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6gM(C43072Qq r2, UserJid userJid) {
        super(2);
        C162457s7.A0J(userJid, 2);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6gM) {
                AnonymousClass6gM r5 = (AnonymousClass6gM) obj;
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
        A0o.append("ExpandableCategoryParentItem(categoryData=");
        A0o.append(this.A00);
        A0o.append(", bizJid=");
        return C18260x0.A04(this.A01, A0o);
    }
}
