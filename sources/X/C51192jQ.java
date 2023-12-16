package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.2jQ  reason: invalid class name and case insensitive filesystem */
public final class C51192jQ {
    public final UserJid A00;
    public final Collection A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51192jQ) {
                C51192jQ r5 = (C51192jQ) obj;
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

    public C51192jQ(UserJid userJid, Collection collection) {
        this.A00 = userJid;
        this.A01 = collection;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogProductListRequest(bizJid=");
        A0o.append(this.A00);
        A0o.append(", productIds=");
        return C18260x0.A04(this.A01, A0o);
    }
}
