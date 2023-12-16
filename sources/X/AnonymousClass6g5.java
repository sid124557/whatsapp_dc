package X;

/* renamed from: X.6g5  reason: invalid class name */
public final class AnonymousClass6g5 extends AnonymousClass7DH {
    public final AnonymousClass5ZU A00;
    public final AnonymousClass3ZH A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6g5) {
                AnonymousClass6g5 r5 = (AnonymousClass6g5) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6g5(X.AnonymousClass5ZU r4, X.AnonymousClass3ZH r5) {
        /*
            r3 = this;
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            java.lang.String r1 = r4.A0H(r5)
            r0 = 0
            r2[r0] = r1
            r1 = 2131890567(0x7f121187, float:1.941583E38)
            X.6pW r0 = new X.6pW
            r0.<init>(r2, r1)
            r3.<init>(r0)
            r3.A01 = r5
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6g5.<init>(X.5ZU, X.3ZH):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RecentlyJoinedUser(contact=");
        A0o.append(this.A01);
        A0o.append(", contactNames=");
        return C18260x0.A04(this.A00, A0o);
    }
}
