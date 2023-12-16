package X;

/* renamed from: X.4kN  reason: invalid class name and case insensitive filesystem */
public final class C91564kN extends AnonymousClass5AS {
    public final C95814uZ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91564kN) && C162457s7.A0P(this.A00, ((C91564kN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C91564kN(C95814uZ r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LockChat(chatJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
