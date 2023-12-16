package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0Wv  reason: invalid class name and case insensitive filesystem */
public final class C06250Wv {
    public static final C15630rg A0K = new C07660bO();
    public static final String A0L;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass0FN A09;
    public AnonymousClass0XS A0A;
    public AnonymousClass0Xq A0B;
    public AnonymousClass0Xq A0C;
    public AnonymousClass0FO A0D;
    public AnonymousClass0GD A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final int A0I;
    public final String A0J;

    public static final C06250Wv A00(AnonymousClass0FN r1, AnonymousClass0XS r2, AnonymousClass0Xq r3, AnonymousClass0Xq r4, AnonymousClass0FO r5, AnonymousClass0GD r6, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        C162457s7.A0J(r6, 1);
        C162457s7.A0J(r2, 9);
        C162457s7.A0J(r1, 11);
        C162457s7.A0J(r5, 17);
        return new C06250Wv(r1, r2, r3, r4, r5, r6, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06250Wv) {
                C06250Wv r8 = (C06250Wv) obj;
                if (!(C162457s7.A0P(this.A0J, r8.A0J) && this.A0E == r8.A0E && C162457s7.A0P(this.A0G, r8.A0G) && C162457s7.A0P(this.A0F, r8.A0F) && C162457s7.A0P(this.A0B, r8.A0B) && C162457s7.A0P(this.A0C, r8.A0C) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A03 == r8.A03 && C162457s7.A0P(this.A0A, r8.A0A) && this.A01 == r8.A01 && this.A09 == r8.A09 && this.A02 == r8.A02 && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A08 == r8.A08 && this.A0H == r8.A0H && this.A0D == r8.A0D && this.A00 == r8.A00 && this.A0I == r8.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        String A012 = C06240Wu.A01("WorkSpec");
        C162457s7.A0D(A012);
        A0L = A012;
    }

    public static final List A01(List list) {
        AnonymousClass0Xq r7;
        if (list == null) {
            return null;
        }
        ArrayList A0I2 = AnonymousClass002.A0I(C73783g4.A0b(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C04620Pw r2 = (C04620Pw) it.next();
            List list2 = r2.A04;
            if (!list2.isEmpty()) {
                r7 = (AnonymousClass0Xq) list2.get(0);
            } else {
                r7 = AnonymousClass0Xq.A01;
            }
            UUID fromString = UUID.fromString(r2.A03);
            A0I2.add(new C04610Pv(r2.A01, r7, r2.A02, r2.A05, fromString, r2.A00, r2.A06));
        }
        return A0I2;
    }

    public final long A02() {
        long j;
        long j2;
        int i;
        if (this.A0E != AnonymousClass0GD.ENQUEUED || (i = this.A01) <= 0) {
            long j3 = this.A05;
            if (j3 != 0) {
                long j4 = 0;
                int i2 = this.A00;
                long j5 = this.A06;
                if (i2 == 0) {
                    j5 += this.A04;
                }
                long j6 = this.A03;
                if (j6 != j3) {
                    if (i2 == 0) {
                        j4 = ((long) -1) * j6;
                    }
                    j5 += j3;
                } else if (i2 != 0) {
                    j4 = j3;
                }
                return j5 + j4;
            }
            long j7 = this.A06;
            if (j7 == 0) {
                j7 = System.currentTimeMillis();
            }
            j2 = this.A04;
        } else {
            AnonymousClass0FN r1 = this.A09;
            AnonymousClass0FN r0 = AnonymousClass0FN.LINEAR;
            long j8 = this.A02;
            if (r1 == r0) {
                j = j8 * ((long) i);
            } else {
                j = (long) Math.scalb((float) j8, i - 1);
            }
            j2 = this.A06;
            if (j > 18000000) {
                j = 18000000;
            }
        }
        return j2 + j;
    }

    public final boolean A05() {
        return !C162457s7.A0P(AnonymousClass0XS.A08, this.A0A);
    }

    public int hashCode() {
        int hashCode;
        int A082 = (AnonymousClass000.A08(this.A0E, this.A0J.hashCode() * 31) + this.A0G.hashCode()) * 31;
        String str = this.A0F;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A002 = AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A08(this.A0C, AnonymousClass000.A08(this.A0B, (A082 + hashCode) * 31)), this.A04), this.A05), this.A03);
        int A003 = AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A08(this.A09, (AnonymousClass000.A08(this.A0A, A002) + this.A01) * 31), this.A02), this.A06), this.A07), this.A08);
        boolean z = this.A0H;
        if (z) {
            z = true;
        }
        return ((AnonymousClass000.A08(this.A0D, (A003 + (z ? 1 : 0)) * 31) + this.A00) * 31) + this.A0I;
    }

    public final void A03(long j) {
        long j2 = j;
        if (j > 18000000) {
            C06240Wu.A00();
            Log.w(A0L, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            C06240Wu.A00();
            Log.w(A0L, "Backoff delay duration less than minimum value");
        }
        this.A02 = C175708Zk.A01(j2, 10000, 18000000);
    }

    public final void A04(long j, long j2) {
        if (j < 900000) {
            C06240Wu.A00();
            Log.w(A0L, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j3 = j;
        if (j < 900000) {
            j3 = 900000;
        }
        this.A05 = j3;
        long j4 = j2;
        if (j2 < 300000) {
            C06240Wu.A00();
            Log.w(A0L, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.A05) {
            C06240Wu.A00();
            Log.w(A0L, AnonymousClass000.A0Z("Flex duration greater than interval duration; Changed to ", AnonymousClass001.A0o(), j));
        }
        this.A03 = C175708Zk.A01(j4, 300000, this.A05);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("{WorkSpec: ");
        A0o.append(this.A0J);
        return AnonymousClass000.A0d(A0o);
    }

    public C06250Wv(AnonymousClass0FN r3, AnonymousClass0XS r4, AnonymousClass0Xq r5, AnonymousClass0Xq r6, AnonymousClass0FO r7, AnonymousClass0GD r8, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(r8, 2);
        C162457s7.A0J(str2, 3);
        C162457s7.A0J(r3, 12);
        C162457s7.A0J(r7, 18);
        this.A0J = str;
        this.A0E = r8;
        this.A0G = str2;
        this.A0F = str3;
        this.A0B = r5;
        this.A0C = r6;
        this.A04 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A0A = r4;
        this.A01 = i;
        this.A09 = r3;
        this.A02 = j4;
        this.A06 = j5;
        this.A07 = j6;
        this.A08 = j7;
        this.A0H = z;
        this.A0D = r7;
        this.A00 = i2;
        this.A0I = i3;
    }
}
