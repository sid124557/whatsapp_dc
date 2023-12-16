package X;

/* renamed from: X.5SF  reason: invalid class name */
public final class AnonymousClass5SF {
    public final AnonymousClass58X A00;
    public final C624134x A01;
    public final AnonymousClass2z0 A02;

    public AnonymousClass5SF(AnonymousClass58X r2, C624134x r3, AnonymousClass2z0 r4) {
        C162457s7.A0J(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SF) {
                AnonymousClass5SF r5 = (AnonymousClass5SF) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)) + AnonymousClass000.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PinInChatMessageChange(message=");
        A0o.append(this.A01);
        A0o.append(", type=");
        A0o.append(this.A00);
        A0o.append(", previousMessageKeyBeforeEdit=");
        return C18260x0.A04(this.A02, A0o);
    }
}
