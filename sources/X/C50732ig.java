package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2ig  reason: invalid class name and case insensitive filesystem */
public final class C50732ig {
    public final UserJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50732ig) && C162457s7.A0P(this.A00, ((C50732ig) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C50732ig(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogProductCatalogRequest(bizJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
