package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2l1  reason: invalid class name and case insensitive filesystem */
public final class C52182l1 {
    public final UserJid A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52182l1) {
                C52182l1 r5 = (C52182l1) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass0x2.A07(this.A02, C18300x5.A04(this.A00)));
    }

    public C52182l1(UserJid userJid, String str, String str2) {
        C18260x0.A0S(str, str2);
        this.A00 = userJid;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsCatalogCollectionAdditionalPageRequest(bizJid=");
        A0o.append(this.A00);
        A0o.append(", collectionId=");
        A0o.append(this.A02);
        A0o.append(", afterCursor=");
        return C18260x0.A07(this.A01, A0o);
    }
}
