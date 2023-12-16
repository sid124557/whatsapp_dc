package X;

import java.util.List;

/* renamed from: X.2nW  reason: invalid class name and case insensitive filesystem */
public final class C53702nW {
    public final long A00;
    public final long A01;
    public final C95804uY A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53702nW) {
                C53702nW r8 = (C53702nW) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02) || this.A01 != r8.A01 || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A00(AnonymousClass000.A08(this.A02, AnonymousClass0x2.A02(this.A00)), this.A01) + C18270x1.A00(this.A05)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A06)) * 31) + C18310x6.A07(this.A04);
    }

    public C53702nW(C95804uY r1, Long l, Long l2, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A02 = r1;
        this.A01 = j2;
        this.A05 = str;
        this.A03 = l;
        this.A06 = list;
        this.A04 = l2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterMyOrphanAddOns(id=");
        A0o.append(this.A00);
        A0o.append(", newsletterJid=");
        A0o.append(this.A02);
        A0o.append(", serverMessageId=");
        A0o.append(this.A01);
        A0o.append(", myReaction=");
        A0o.append(this.A05);
        A0o.append(", myReactionMs=");
        A0o.append(this.A03);
        A0o.append(", myVotes=");
        A0o.append(this.A06);
        A0o.append(", myVotesMs=");
        return C18260x0.A04(this.A04, A0o);
    }
}
