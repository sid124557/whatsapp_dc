package X;

/* renamed from: X.8Lg  reason: invalid class name and case insensitive filesystem */
public final class C172468Lg implements Comparable {
    public final String A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str = this.A00;
        int length = str.length();
        String str2 = ((C172468Lg) obj).A00;
        int length2 = str2.length();
        if (length != length2) {
            return length - length2;
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C172468Lg.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C172468Lg) obj).A00);
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("\"");
        return AnonymousClass000.A0V(str, "\"", A0o);
    }

    public C172468Lg(String str) {
        this.A00 = str;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, 3);
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public C172468Lg() {
    }
}
