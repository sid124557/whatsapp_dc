package X;

/* renamed from: X.3Y7  reason: invalid class name */
public final class AnonymousClass3Y7 implements C833648c {
    public C52672lr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3Y7) && C162457s7.A0P(this.A00, ((AnonymousClass3Y7) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public AnonymousClass3Y7(C52672lr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushPSANotificationContext(notificationInfo=");
        return C18260x0.A04(this.A00, A0o);
    }

    public AnonymousClass3Y7() {
        this((C52672lr) null);
    }
}
