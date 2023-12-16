package X;

import java.util.List;

/* renamed from: X.1Mp  reason: invalid class name and case insensitive filesystem */
public final class C22321Mp extends AnonymousClass25E {
    public final int A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22321Mp) {
                C22321Mp r5 = (C22321Mp) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A02);
    }

    public C22321Mp(List list, List list2, int i) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(statusCode=");
        A0o.append(this.A00);
        A0o.append(", errorCode=");
        A0o.append(this.A01);
        A0o.append(", errorMessage=");
        return C18260x0.A04(this.A02, A0o);
    }
}
