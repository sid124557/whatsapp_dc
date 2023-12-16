package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5TG  reason: invalid class name */
public final class AnonymousClass5TG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C52332lJ A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass5TG(C52332lJ r2, UserJid userJid, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        C162457s7.A0J(userJid, 2);
        this.A06 = str;
        this.A04 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = z;
        this.A09 = z2;
        this.A03 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TG) {
                AnonymousClass5TG r5 = (AnonymousClass5TG) obj;
                if (!C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A04, r5.A04) || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A00 != r5.A00 || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A05, r5.A05) || this.A08 != r5.A08 || this.A09 != r5.A09 || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A01((((((((((AnonymousClass000.A08(this.A04, C18310x6.A09(this.A06)) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + C18270x1.A00(this.A07)) * 31) + C18270x1.A00(this.A05)) * 31, this.A08), this.A09) + C18310x6.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CollectionProductListRequest(collectionId=");
        A0o.append(this.A06);
        A0o.append(", businessId=");
        A0o.append(this.A04);
        A0o.append(", limit=");
        A0o.append(this.A01);
        A0o.append(", width=");
        A0o.append(this.A02);
        A0o.append(", height=");
        A0o.append(this.A00);
        A0o.append(", sessionId=");
        A0o.append(this.A07);
        A0o.append(", afterCursor=");
        A0o.append(this.A05);
        A0o.append(", isCategory=");
        A0o.append(this.A08);
        A0o.append(", isSkipDirectConnectionEncryptedInfoCheck=");
        A0o.append(this.A09);
        A0o.append(", catalogVariantsRequestData=");
        return C18260x0.A04(this.A03, A0o);
    }
}
