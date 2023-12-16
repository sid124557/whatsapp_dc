package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.2jO  reason: invalid class name and case insensitive filesystem */
public final class C51172jO {
    public final UserJid A00;
    public final Collection A01;

    public C51172jO(UserJid userJid, Collection collection) {
        C162457s7.A0J(collection, 2);
        this.A00 = userJid;
        this.A01 = collection;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51172jO) {
                C51172jO r5 = (C51172jO) obj;
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
        A0o.append("ExtensionsSubCatalogCategoriesRequest(bizJid=");
        A0o.append(this.A00);
        A0o.append(", categoryIds=");
        return C18260x0.A04(this.A01, A0o);
    }
}
