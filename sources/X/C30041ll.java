package X;

/* renamed from: X.1ll  reason: invalid class name and case insensitive filesystem */
public final class C30041ll extends AnonymousClass28P {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C30041ll) && C162457s7.A0P(this.A00, ((C30041ll) obj).A00));
    }

    public int hashCode() {
        return C18270x1.A00(this.A00);
    }

    public C30041ll(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarEditorEvent(event=");
        return C18260x0.A07(this.A00, A0o);
    }
}
