package X;

import java.util.Arrays;

/* renamed from: X.2gA  reason: invalid class name and case insensitive filesystem */
public final class C49212gA {
    public final int A00;
    public final String A01;
    public final String A02;

    public C49212gA(String str, String str2, int i) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C49212gA)) {
                return false;
            }
            C49212gA r4 = (C49212gA) obj;
            if (!C162457s7.A0P(this.A01, r4.A01) || !C162457s7.A0P(this.A02, r4.A02) || this.A00 != r4.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        A1X[1] = this.A02;
        AnonymousClass000.A1N(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }
}
