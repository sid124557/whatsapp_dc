package X;

/* renamed from: X.4kP  reason: invalid class name and case insensitive filesystem */
public final class C91584kP extends AnonymousClass5AS {
    public final C95814uZ A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91584kP) {
                C91584kP r5 = (C91584kP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18300x5.A04(this.A00), this.A01);
    }

    public C91584kP(C95814uZ r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnlockChat(chatJid=");
        A0o.append(this.A00);
        A0o.append(", openChatDirectly=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
