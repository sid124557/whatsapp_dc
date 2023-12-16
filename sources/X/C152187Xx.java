package X;

/* renamed from: X.7Xx  reason: invalid class name and case insensitive filesystem */
public final class C152187Xx {
    public final C127806Tj A00;
    public final C151727Wb A01;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C152187Xx)) {
            C152187Xx r4 = (C152187Xx) obj;
            return AnonymousClass72K.A00(this.A01, r4.A01) && AnonymousClass72K.A00(this.A00, r4.A00);
        }
    }

    public final String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(this.A01, "key");
        r2.A00(this.A00, "feature");
        return r2.toString();
    }

    public /* synthetic */ C152187Xx(C127806Tj r1, C151727Wb r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
