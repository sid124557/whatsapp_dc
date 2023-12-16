package X;

import java.util.List;

/* renamed from: X.5Sw  reason: invalid class name and case insensitive filesystem */
public final class C104925Sw {
    public final int A00;
    public final C624134x A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104925Sw) {
                C104925Sw r5 = (C104925Sw) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || this.A05 != r5.A05 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A03, C18310x6.A09(this.A02)) + this.A00) * 31, this.A05)) + AnonymousClass000.A07(this.A04);
    }

    public C104925Sw(C624134x r1, String str, String str2, List list, int i, boolean z) {
        C18260x0.A0Q(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r1;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReactionItem(key=");
        A0o.append(this.A02);
        A0o.append(", reaction=");
        A0o.append(this.A03);
        A0o.append(", count=");
        A0o.append(this.A00);
        A0o.append(", hasMyReaction=");
        A0o.append(this.A05);
        A0o.append(", message=");
        A0o.append(this.A01);
        A0o.append(", reactionSenders=");
        return C18260x0.A04(this.A04, A0o);
    }
}
