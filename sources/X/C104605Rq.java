package X;

/* renamed from: X.5Rq  reason: invalid class name and case insensitive filesystem */
public final class C104605Rq {
    public final C95804uY A00;
    public final AnonymousClass21F A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104605Rq) {
                C104605Rq r5 = (C104605Rq) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public C104605Rq(C95804uY r1, AnonymousClass21F r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterSuccessAction(action=");
        A0o.append(this.A01);
        A0o.append(", jid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
