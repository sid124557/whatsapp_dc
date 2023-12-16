package X;

import java.math.BigInteger;

/* renamed from: X.0iC  reason: invalid class name and case insensitive filesystem */
public final class C10600iC implements Comparable {
    public static final C10600iC A05;
    public static final C10600iC A06 = new C10600iC(0, 0, "", 0);
    public static final C10600iC A07 = new C10600iC(0, 1, "", 0);
    public static final C10600iC A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C14080ob(this));

    static {
        C10600iC r0 = new C10600iC(1, 0, "", 0);
        A08 = r0;
        A05 = r0;
    }

    /* renamed from: A00 */
    public int compareTo(C10600iC r3) {
        C162457s7.A0J(r3, 0);
        return A01().compareTo(r3.A01());
    }

    public final BigInteger A01() {
        Object value = this.A04.getValue();
        C162457s7.A0D(value);
        return (BigInteger) value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10600iC)) {
            return false;
        }
        C10600iC r4 = (C10600iC) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        String str;
        String str2 = this.A03;
        if (!C175738Zn.A0V(str2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append('-');
            str = AnonymousClass000.A0X(str2, A0o);
        } else {
            str = "";
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(this.A00);
        A0o2.append('.');
        A0o2.append(this.A01);
        A0o2.append('.');
        A0o2.append(this.A02);
        return AnonymousClass000.A0X(str, A0o2);
    }

    public C10600iC(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = str;
    }
}
