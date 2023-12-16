package X;

/* renamed from: X.1lk  reason: invalid class name and case insensitive filesystem */
public final class C30031lk extends AnonymousClass28P {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C30031lk) && C162457s7.A0P(this.A00, ((C30031lk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C30031lk(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarArtRevisionUpdate(newRevision=");
        return C18260x0.A07(this.A00, A0o);
    }
}
