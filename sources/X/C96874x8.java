package X;

/* renamed from: X.4x8  reason: invalid class name and case insensitive filesystem */
public final class C96874x8 extends AnonymousClass5BP {
    public final AnonymousClass3ZH A00;

    public C96874x8(AnonymousClass3ZH r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96874x8) && C162457s7.A0P(this.A00, ((C96874x8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InvitedAdmin(waContact=");
        return C18260x0.A04(this.A00, A0o);
    }
}
