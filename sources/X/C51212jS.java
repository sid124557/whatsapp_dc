package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2jS  reason: invalid class name and case insensitive filesystem */
public final class C51212jS {
    public final UserJid A00;
    public final String A01;

    public C51212jS(UserJid userJid, String str) {
        C162457s7.A0J(str, 2);
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51212jS) {
                C51212jS r5 = (C51212jS) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18300x5.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogProductCatalogAdditionalPageRequest(bizJid=");
        A0o.append(this.A00);
        A0o.append(", afterCursor=");
        return C18260x0.A07(this.A01, A0o);
    }
}
