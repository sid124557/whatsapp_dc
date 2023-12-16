package X;

/* renamed from: X.1m6  reason: invalid class name and case insensitive filesystem */
public final class C30221m6 extends C55162pu {
    public int A00;
    public Long A01;
    public Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30221m6) {
                C30221m6 r5 = (C30221m6) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A02);
    }

    public C30221m6(Long l, Long l2, int i) {
        this.A00 = i;
        this.A01 = l;
        this.A02 = l2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParentMessage(replyCount=");
        A0o.append(this.A00);
        A0o.append(", lastCommentMessageRowId=");
        A0o.append(this.A01);
        A0o.append(", lastCommentMessageTs=");
        return C18260x0.A04(this.A02, A0o);
    }
}
