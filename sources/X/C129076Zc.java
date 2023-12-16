package X;

/* renamed from: X.6Zc  reason: invalid class name and case insensitive filesystem */
public final class C129076Zc extends C1446972o {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1446972o) {
            return this.A00.equals(((C129076Zc) ((C1446972o) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StandardIntegrityTokenRequest{requestHash=");
        A0o.append(str);
        return AnonymousClass000.A0g(A0o);
    }

    public /* synthetic */ C129076Zc(String str) {
        this.A00 = str;
    }
}
