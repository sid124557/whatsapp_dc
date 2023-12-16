package X;

/* renamed from: X.7YI  reason: invalid class name */
public final class AnonymousClass7YI {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YI) {
                AnonymousClass7YI r5 = (AnonymousClass7YI) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + C18270x1.A00(this.A01);
    }

    public AnonymousClass7YI(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessApiResultsPage(pageSize=");
        A0o.append(this.A00);
        A0o.append(", pageId=");
        return C18260x0.A07(this.A01, A0o);
    }
}
