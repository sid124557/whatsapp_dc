package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2jR  reason: invalid class name and case insensitive filesystem */
public final class C51202jR {
    public final UserJid A00;
    public final String A01;

    public C51202jR(UserJid userJid, String str) {
        C162457s7.A0J(str, 2);
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51202jR) {
                C51202jR r5 = (C51202jR) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A01, C18300x5.A04(this.A00)) + 1231;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogProductRequest(bizJid=");
        A0o.append(this.A00);
        A0o.append(", productId=");
        A0o.append(this.A01);
        A0o.append(", fetchComplianceInfo=");
        return C18260x0.A0A(A0o, true);
    }
}
