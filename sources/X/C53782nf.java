package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2nf  reason: invalid class name and case insensitive filesystem */
public final class C53782nf {
    public final long A00;
    public final long A01;
    public final C27991fJ A02;
    public final C27991fJ A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53782nf) {
                C53782nf r8 = (C53782nf) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A07 != r8.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A042 = C18300x5.A04(this.A03);
        return AnonymousClass0x7.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A08(this.A04, (((AnonymousClass000.A08(this.A02, A042) + C18270x1.A00(this.A06)) * 31) + AnonymousClass0x7.A07(this.A05)) * 31), this.A00), this.A01), this.A07);
    }

    public C53782nf(C27991fJ r2, C27991fJ r3, UserJid userJid, String str, String str2, long j, long j2, boolean z) {
        C18260x0.A0Q(r2, r3);
        C162457s7.A0J(userJid, 5);
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SubgroupSuggestion(parentGroup=");
        A0o.append(this.A03);
        A0o.append(", groupJid=");
        A0o.append(this.A02);
        A0o.append(", subject=");
        A0o.append(this.A06);
        A0o.append(", description=");
        A0o.append(this.A05);
        A0o.append(", creator=");
        A0o.append(this.A04);
        A0o.append(", creation=");
        A0o.append(this.A00);
        A0o.append(", participantCount=");
        A0o.append(this.A01);
        A0o.append(", isExistingGroup=");
        return C18260x0.A0A(A0o, this.A07);
    }
}
