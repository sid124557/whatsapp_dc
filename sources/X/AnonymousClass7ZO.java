package X;

/* renamed from: X.7ZO  reason: invalid class name */
public final class AnonymousClass7ZO {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZO) {
                AnonymousClass7ZO r5 = (AnonymousClass7ZO) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A02), this.A00), this.A03), this.A01);
    }

    public AnonymousClass7ZO(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A00 = z2;
        this.A03 = z3;
        this.A01 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChatMessageCountsFMessageMetadata(isSent=");
        A0o.append(this.A02);
        A0o.append(", isEphemeral=");
        A0o.append(this.A00);
        A0o.append(", isViewOnce=");
        A0o.append(this.A03);
        A0o.append(", isReply=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
