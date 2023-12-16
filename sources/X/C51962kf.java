package X;

/* renamed from: X.2kf  reason: invalid class name and case insensitive filesystem */
public final class C51962kf {
    public AnonymousClass21Q A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51962kf) {
                C51962kf r5 = (C51962kf) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C51962kf(AnonymousClass21Q r1, String str) {
        C18260x0.A0Q(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotMessageInfo(targetId=");
        A0o.append(this.A01);
        A0o.append(", state=");
        return C18260x0.A04(this.A00, A0o);
    }
}
