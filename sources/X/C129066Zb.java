package X;

/* renamed from: X.6Zb  reason: invalid class name and case insensitive filesystem */
public final class C129066Zb extends C1446872n {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1446872n) {
            return this.A00.equals(((C129066Zb) ((C1446872n) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StandardIntegrityToken{token=");
        A0o.append(str);
        return AnonymousClass000.A0g(A0o);
    }

    public /* synthetic */ C129066Zb(String str) {
        this.A00 = str;
    }
}
