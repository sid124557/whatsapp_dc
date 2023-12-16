package X;

/* renamed from: X.2yk  reason: invalid class name and case insensitive filesystem */
public final class C60552yk {
    public final AnonymousClass21P A00;
    public final String A01;

    public C60552yk(AnonymousClass21P r2, String str) {
        C162457s7.A0J(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60552yk) {
                C60552yk r5 = (C60552yk) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(AnonymousClass21P r2, C60552yk r3, Object obj, C85524Gp r5) {
        return r5.AzD(obj, new C60552yk(r2, r3.A01));
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18270x1.A00(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallLinkUIState(linkText=");
        A0o.append(this.A01);
        A0o.append(", state=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60552yk() {
        this(AnonymousClass21P.NONE, (String) null);
    }
}
