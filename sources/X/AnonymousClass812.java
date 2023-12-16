package X;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.812  reason: invalid class name */
public final class AnonymousClass812 implements C184708sO, C187418xB, C184758sT {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C184718sP A07;
    public C187408xA A08;
    public C166607yy A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int[] A0J;
    public AnonymousClass818[] A0K;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final long A0O = ((long) 1048576);
    public final Uri A0P;
    public final Handler A0Q;
    public final C148557Iv A0R;
    public final AnonymousClass6K0 A0S;
    public final C160767oH A0T;
    public final C185788uF A0U;
    public final AnonymousClass7ZV A0V;
    public final C157457iK A0W = new C157457iK("Loader:ExtractorMediaPeriod");
    public final C157987jF A0X;
    public final Runnable A0Y;
    public final Runnable A0Z;

    public AnonymousClass812(Uri uri, AnonymousClass6K0 r7, C160767oH r8, C185788uF r9, AnonymousClass7ZV r10, C185218tH[] r11) {
        this.A0P = uri;
        this.A0U = r9;
        this.A0T = r8;
        this.A0S = r7;
        this.A0V = r10;
        this.A0R = new C148557Iv(this, r11);
        this.A0X = new C157987jF();
        this.A0Y = new C172668Mf(this, 1);
        this.A0Z = new C172668Mf(this, 2);
        this.A0Q = new Handler();
        this.A0J = new int[0];
        this.A0K = new AnonymousClass818[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 3;
        r8.A02();
    }

    public final long A00() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (AnonymousClass818 r0 : this.A0K) {
            AnonymousClass7XN r2 = r0.A09;
            synchronized (r2) {
                j = r2.A06;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final void A01() {
        C1676281v r9 = new C1676281v(this.A0P, this.A0R, this, this.A0U, this.A0X);
        if (this.A0F) {
            long j = this.A06;
            C159197lM.A02(AnonymousClass000.A1S((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
            long j2 = this.A03;
            if (j2 == -9223372036854775807L || j < j2) {
                long j3 = this.A07.BCa(j).A00.A00;
                long j4 = this.A06;
                r9.A06.A00 = j3;
                r9.A02 = j4;
                r9.A04 = true;
                this.A06 = -9223372036854775807L;
            } else {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
        }
        int i = 0;
        for (AnonymousClass818 r0 : this.A0K) {
            AnonymousClass7XN r02 = r0.A09;
            i += r02.A00 + r02.A02;
        }
        this.A02 = i;
        this.A0W.A00(this, r9, this.A00);
        C160767oH r4 = this.A0T;
        r4.A07(new AnonymousClass7A4(r9.A03), new C150007Ot((C166637z1) null, (Object) null, 1, -1, 0, r4.A01(r9.A02), r4.A01(this.A03)));
    }

    public final void A02(int i) {
        if (this.A0E && this.A0N[i] && !this.A0K[i].A09.A01()) {
            this.A06 = 0;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0;
            this.A02 = 0;
            for (AnonymousClass818 A032 : this.A0K) {
                A032.A03();
            }
            this.A08.BQ7(this);
        }
    }

    public final void A03(C166637z1 r6, int i) {
        C166637z1 r1 = AnonymousClass6C8.A0V(this.A09, i).A03[0];
        if (!this.A0M[i] || !r1.equals(r6)) {
            AnonymousClass6C8.A0V(this.A09, i).A03[0] = r6;
            this.A0T.A05(r6, C162097rD.A01(r6.A0S), this.A04);
            this.A0M[i] = true;
        }
    }

    public final boolean A04() {
        if (this.A0D || this.A06 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public void Aye(long j) {
    }

    public boolean Aze(long j, long j2) {
        if (this.A0B || this.A0E || (this.A0F && this.A01 == 0)) {
            return false;
        }
        boolean A012 = this.A0X.A01();
        if (this.A0W.A00 != null) {
            return A012;
        }
        A01();
        return true;
    }

    public void B1k(long j, boolean z) {
        long j2;
        int i;
        int length = this.A0K.length;
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass818 r4 = this.A0K[i2];
            boolean z2 = this.A0L[i2];
            AnonymousClass7XN r3 = r4.A09;
            synchronized (r3) {
                int i3 = r3.A02;
                if (i3 != 0) {
                    long[] jArr = r3.A0E;
                    int i4 = r3.A04;
                    if (j >= jArr[i4]) {
                        if (z2 && (i = r3.A03) != i3) {
                            i3 = i + 1;
                        }
                        int i5 = -1;
                        for (int i6 = 0; i6 < i3 && jArr[i4] <= j; i6++) {
                            if (!z || (r3.A0A[i4] & 1) != 0) {
                                i5 = i6;
                            }
                            i4++;
                            if (i4 == r3.A01) {
                                i4 = 0;
                            }
                        }
                        if (i5 != -1) {
                            j2 = r3.A00(i5);
                        }
                    }
                }
                j2 = -1;
            }
            r4.A04(j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r7 > r9) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B4F(X.C158037jK r18, long r19) {
        /*
            r17 = this;
            r1 = r19
            r0 = r17
            X.8sP r3 = r0.A07
            boolean r0 = r3.BIq()
            if (r0 != 0) goto L_0x000f
            r1 = 0
            return r1
        L_0x000f:
            X.7Xr r3 = r3.BCa(r1)
            X.7jv r0 = r3.A00
            long r7 = r0.A01
            X.7jv r0 = r3.A01
            long r5 = r0.A01
            r11 = r18
            long r9 = r11.A01
            r15 = 0
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            long r3 = r11.A00
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            long r13 = r19 - r9
            long r9 = r9 ^ r19
            long r3 = r19 ^ r13
            long r3 = r3 & r9
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            r13 = -9223372036854775808
        L_0x0039:
            long r11 = r11.A00
            long r9 = r19 + r11
            long r3 = r19 ^ r9
            long r11 = r11 ^ r9
            long r3 = r3 & r11
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004a:
            r4 = 1
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
        L_0x005d:
            if (r3 == 0) goto L_0x0070
            if (r4 == 0) goto L_0x006d
            long r3 = X.AnonymousClass6C9.A0N(r7, r1)
            long r1 = X.AnonymousClass6C9.A0N(r5, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
        L_0x006d:
            return r7
        L_0x006e:
            r4 = 0
            goto L_0x005d
        L_0x0070:
            if (r4 != 0) goto L_0x0073
            return r13
        L_0x0073:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass812.B4F(X.7jK, long):long");
    }

    public long B4w(long j) {
        long B4y;
        if (this.A0B) {
            B4y = this.A03;
        } else {
            B4y = B4y();
        }
        return B4y - j;
    }

    public long B4y() {
        long j;
        long j2;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        long j3 = this.A06;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        if (this.A0A) {
            int length = this.A0K.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.A0N[i]) {
                    AnonymousClass7XN r2 = this.A0K[i].A09;
                    synchronized (r2) {
                        j2 = r2.A06;
                    }
                    j = Math.min(j, j2);
                }
            }
        } else {
            j = A00();
        }
        if (j == Long.MIN_VALUE) {
            return this.A04;
        }
        return j;
    }

    public long BA0() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return B4y();
    }

    public C166607yy BDs() {
        return this.A09;
    }

    public void BL2() {
        IOException iOException;
        C157457iK r1 = this.A0W;
        int i = this.A00;
        IOException iOException2 = r1.A01;
        if (iOException2 == null) {
            AnonymousClass6E2 r0 = r1.A00;
            if (r0 != null && (iOException = r0.A03) != null && r0.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public /* bridge */ /* synthetic */ void BVG(C183688qS r19, long j, long j2, boolean z) {
        C1676281v r4 = (C1676281v) r19;
        C160767oH r2 = this.A0T;
        r2.A06(new AnonymousClass7A4(r4.A03), new C150007Ot((C166637z1) null, (Object) null, 1, -1, 0, r2.A01(r4.A02), r2.A01(this.A03)));
        if (!z) {
            if (this.A05 == -1) {
                this.A05 = r4.A01;
            }
            for (AnonymousClass818 A032 : this.A0K) {
                A032.A03();
            }
            if (this.A01 > 0) {
                this.A08.BQ7(this);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BVK(C183688qS r19, long j, long j2) {
        long j3;
        C1676281v r6 = (C1676281v) r19;
        if (this.A03 == -9223372036854775807L) {
            long A002 = A00();
            if (A002 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = A002 + 10000;
            }
            this.A03 = j3;
            this.A0S.A03(j3, this.A07.BIq());
        }
        C160767oH r4 = this.A0T;
        r4.A09(new AnonymousClass7A4(r6.A03), new C150007Ot((C166637z1) null, (Object) null, 1, -1, 0, r4.A01(r6.A02), r4.A01(this.A03)), r6);
        if (this.A05 == -1) {
            this.A05 = r6.A01;
        }
        this.A0B = true;
        this.A08.BQ7(this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass7A8 BVR(C183688qS r21, IOException iOException, int i, long j, long j2) {
        boolean z;
        C184718sP r0;
        C1676281v r6 = (C1676281v) r21;
        IOException iOException2 = iOException;
        if ((iOException2 instanceof AnonymousClass6JV) || ((iOException2 instanceof AnonymousClass6KQ) && ((AnonymousClass6KQ) iOException2).responseCode == 410)) {
            z = true;
        } else {
            z = false;
        }
        C160767oH r2 = this.A0T;
        r2.A08(new AnonymousClass7A4(r6.A03), new C150007Ot((C166637z1) null, (Object) null, 1, -1, 0, r2.A01(r6.A02), r2.A01(this.A03)), iOException2, z);
        long j3 = this.A05;
        if (j3 == -1) {
            j3 = r6.A01;
            this.A05 = j3;
        }
        if (z) {
            return C157457iK.A04;
        }
        AnonymousClass818[] r7 = this.A0K;
        int i2 = 0;
        for (AnonymousClass818 r22 : r7) {
            AnonymousClass7XN r23 = r22.A09;
            i2 += r23.A00 + r23.A02;
        }
        boolean A1W = C86624Kv.A1W(i2, this.A02);
        if (j3 == -1 && ((r0 = this.A07) == null || r0.B7B() == -9223372036854775807L)) {
            boolean z2 = this.A0F;
            if (!z2 || A04()) {
                this.A0D = z2;
                this.A04 = 0;
                this.A02 = 0;
                for (AnonymousClass818 A032 : r7) {
                    A032.A03();
                }
                r6.A06.A00 = 0;
                r6.A02 = 0;
                r6.A04 = true;
            } else {
                this.A0E = true;
                return C157457iK.A03;
            }
        } else {
            this.A02 = i2;
        }
        if (A1W) {
            return C157457iK.A06;
        }
        return C157457iK.A05;
    }

    public void BhH(C187408xA r2, long j) {
        this.A08 = r2;
        this.A0X.A01();
        A01();
    }

    public long BiL() {
        if (!this.A0C) {
            this.A0T.A04();
            this.A0C = true;
        }
        if (!this.A0D) {
            return -9223372036854775807L;
        }
        if (!this.A0B) {
            int i = 0;
            for (AnonymousClass818 r0 : this.A0K) {
                AnonymousClass7XN r02 = r0.A09;
                i += r02.A00 + r02.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0D = false;
        return this.A04;
    }

    public long Bl6(long j, boolean z) {
        if (!this.A07.BIq()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (this.A06 == -9223372036854775807L) {
            int length = this.A0K.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass818 r2 = this.A0K[i];
                AnonymousClass7XN r1 = r2.A09;
                synchronized (r1) {
                    r1.A03 = 0;
                }
                r2.A06 = r2.A05;
                if (r2.A01(j, false) == -1 && (this.A0N[i] || !this.A0A)) {
                    break;
                }
                i++;
            }
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        AnonymousClass6E2 r0 = this.A0W.A00;
        if (r0 != null) {
            r0.A00(false);
        } else {
            for (AnonymousClass818 A032 : this.A0K) {
                A032.A03();
            }
        }
        return j;
    }

    public long BlB(C185238tJ[] r9, C187428xC[] r10, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        C1674881g r1;
        C159197lM.A02(this.A0F);
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = r10.length;
            if (i4 >= length) {
                break;
            }
            AnonymousClass81Z r12 = r9[i4];
            if (r12 != null && (r10[i4] == null || !zArr[i4])) {
                int i5 = r12.A00;
                boolean[] zArr3 = this.A0L;
                C159197lM.A02(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                r9[i4] = null;
            }
            i4++;
        }
        if (!this.A0I ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (r9[i6] == null && (r1 = r10[i6]) != null) {
                C1674881g r13 = r1;
                int[] iArr = r13.A03;
                C159197lM.A02(AnonymousClass000.A1U(iArr.length, 1));
                C159197lM.A02(AnonymousClass000.A1T(iArr[0]));
                int indexOf = this.A09.A02.indexOf(r13.A02);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                boolean[] zArr4 = this.A0L;
                C159197lM.A02(!zArr4[indexOf]);
                this.A01++;
                zArr4[indexOf] = true;
                r9[i6] = new AnonymousClass81Z(this, indexOf);
                zArr2[i6] = true;
                if (!z) {
                    AnonymousClass818 r6 = this.A0K[indexOf];
                    AnonymousClass7XN r14 = r6.A09;
                    synchronized (r14) {
                        r14.A03 = 0;
                    }
                    r6.A06 = r6.A05;
                    if (r6.A01(j, true) == -1) {
                        AnonymousClass7XN r0 = r6.A09;
                        z = true;
                        if (r0.A00 + r0.A03 != 0) {
                        }
                    }
                    z = false;
                } else {
                    continue;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            C157457iK r5 = this.A0W;
            boolean A1W = AnonymousClass000.A1W(r5.A00);
            AnonymousClass818[] r2 = this.A0K;
            int length2 = r2.length;
            if (A1W) {
                while (i3 < length2) {
                    r2[i3].A02();
                    i3++;
                }
                AnonymousClass6E2 r15 = r5.A00;
                r15.getClass();
                r15.A00(false);
            } else {
                while (i3 < length2) {
                    r2[i3].A03();
                    i3++;
                }
            }
        } else if (z) {
            j = Bl6(j, false);
            while (i3 < r9.length) {
                if (r9[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0I = true;
        return j;
    }

    public void Bmw(boolean z) {
    }

    public C185228tI Bqz(int i, int i2) {
        AnonymousClass818[] r2 = this.A0K;
        int length = r2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.A0J[i3] == i) {
                return r2[i3];
            }
        }
        AnonymousClass818 r22 = new AnonymousClass818(this.A0V);
        r22.A04 = this;
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0J, i4);
        this.A0J = copyOf;
        copyOf[length] = i;
        AnonymousClass818[] r0 = (AnonymousClass818[]) Arrays.copyOf(this.A0K, i4);
        this.A0K = r0;
        r0[length] = r22;
        return r22;
    }

    public void Brk(byte b, boolean z) {
    }
}
