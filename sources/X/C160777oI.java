package X;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7oI  reason: invalid class name and case insensitive filesystem */
public class C160777oI {
    public C141266vI A00;
    public boolean A01;
    public final C141186vA A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C160777oI(C141266vI r5, String str) {
        C141186vA r2 = C141186vA.GENERAL;
        this.A07 = str;
        this.A03 = null;
        this.A04 = null;
        this.A08 = null;
        this.A00 = r5;
        this.A02 = r2;
        this.A09 = false;
        this.A01 = false;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A0A = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C160777oI r5 = (C160777oI) obj;
            if (!Objects.equals(this.A07, r5.A07) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A04, r5.A04) || !Objects.equals(this.A08, r5.A08) || this.A02 != r5.A02 || this.A00 != r5.A00 || this.A09 != r5.A09) {
                return false;
            }
        }
        return true;
    }

    public C141266vI A00() {
        return this.A00;
    }

    public String A01() {
        return this.A03;
    }

    public String A02() {
        return this.A04;
    }

    public String A03() {
        return this.A05;
    }

    public String A04() {
        return this.A06;
    }

    public String A05() {
        return this.A07;
    }

    public boolean A06() {
        return this.A0A;
    }

    public boolean A07() {
        return this.A01;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.A07, this.A03, this.A04, this.A08, this.A00, this.A02, Boolean.valueOf(this.A09), Boolean.valueOf(this.A01)});
    }

    public C160777oI(C141266vI r1, C141186vA r2, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, boolean z, boolean z2, boolean z3) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r1;
        this.A02 = r2;
        this.A09 = z;
        this.A01 = z2;
        this.A06 = str4;
        this.A05 = str5;
        this.A0A = z3;
    }

    public C160777oI(C141266vI r3, C141186vA r4, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r3;
        this.A02 = r4;
        this.A09 = z;
        this.A01 = false;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A0A = false;
    }
}
