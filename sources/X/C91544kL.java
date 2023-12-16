package X;

/* renamed from: X.4kL  reason: invalid class name and case insensitive filesystem */
public final class C91544kL extends AnonymousClass5AS {
    public final C95814uZ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91544kL) && C162457s7.A0P(this.A00, ((C91544kL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C91544kL(C95814uZ r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisableChatLock(chatJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
