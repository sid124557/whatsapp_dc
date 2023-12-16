package X;

import java.util.Set;

/* renamed from: X.2n4  reason: invalid class name and case insensitive filesystem */
public final class C53422n4 {
    public long A00;
    public Integer A01 = null;
    public final long A02;
    public final C624134x A03;
    public final AnonymousClass2z0 A04;
    public final Set A05;

    public C53422n4(C624134x r3, AnonymousClass2z0 r4, Set set, long j, long j2) {
        C162457s7.A0J(r4, 2);
        this.A02 = j;
        this.A04 = r4;
        this.A00 = j2;
        this.A03 = r3;
        this.A05 = set;
        set.add(Long.valueOf(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53422n4) {
                C53422n4 r8 = (C53422n4) obj;
                if (this.A02 != r8.A02 || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A05, AnonymousClass000.A08(this.A03, AnonymousClass000.A00(AnonymousClass000.A08(this.A04, AnonymousClass0x2.A02(this.A02)), this.A00))) + AnonymousClass000.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommentMessagePreview(parentMessageRowId=");
        A0o.append(this.A02);
        A0o.append(", parentMessageKey=");
        A0o.append(this.A04);
        A0o.append(", parentMessageSortId=");
        A0o.append(this.A00);
        A0o.append(", lastCommentMessage=");
        A0o.append(this.A03);
        A0o.append(", parentMessageRowIds=");
        A0o.append(this.A05);
        A0o.append(", unseenSenderCount=");
        return C18260x0.A04(this.A01, A0o);
    }
}
