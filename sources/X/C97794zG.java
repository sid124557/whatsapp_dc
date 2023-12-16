package X;

/* renamed from: X.4zG  reason: invalid class name and case insensitive filesystem */
public final class C97794zG extends C156137g5 {
    public final AnonymousClass4GP A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97794zG) && C162457s7.A0P(this.A00, ((C97794zG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97794zG(AnonymousClass4GP r3) {
        super(C18290x4.A0Z(), 36);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LockedChatsEntrypointItem(onClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
