package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7ZH  reason: invalid class name */
public final class AnonymousClass7ZH {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass7ZH(UserJid userJid, String str, String str2, boolean z) {
        C162457s7.A0J(userJid, 4);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZH) {
                AnonymousClass7ZH r5 = (AnonymousClass7ZH) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A02)), this.A03));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CatalogCategoryTabItem(tabName=");
        A0o.append(this.A02);
        A0o.append(", categoryId=");
        A0o.append(this.A01);
        A0o.append(", isLastLevel=");
        A0o.append(this.A03);
        A0o.append(", bizJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
