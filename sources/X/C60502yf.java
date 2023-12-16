package X;

import java.util.List;

/* renamed from: X.2yf  reason: invalid class name and case insensitive filesystem */
public final class C60502yf {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60502yf) {
                C60502yf r5 = (C60502yf) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, this.A00 * 31);
    }

    public C60502yf(List list, int i) {
        this.A00 = i;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupCallPsaUiState(titleResId=");
        A0o.append(this.A00);
        A0o.append(", groupSuggestions=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C60502yf() {
        this(C72023d3.A00, 0);
    }
}
