package X;

/* renamed from: X.1zk  reason: invalid class name and case insensitive filesystem */
public final class C36701zk extends C36711zl {
    public final Object A00;
    public final Throwable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36701zk) {
                C36701zk r5 = (C36701zk) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C36701zk(Object obj, Throwable th) {
        this.A00 = obj;
        this.A01 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Exception(request=");
        A0o.append(this.A00);
        A0o.append(", error=");
        return C18260x0.A04(this.A01, A0o);
    }
}
