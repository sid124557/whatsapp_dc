package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0JZ;
import X.AnonymousClass0M6;
import X.AnonymousClass0OO;
import X.AnonymousClass0Q1;
import X.AnonymousClass0QI;
import X.AnonymousClass0V8;
import X.AnonymousClass0YH;
import X.C002102g;
import X.C011209g;
import X.C04460Oj;
import X.C04870Qz;
import X.C05570Ua;
import X.C05590Uc;
import X.C06440Xs;
import X.C06840Zk;
import X.C15190qv;
import X.C16020sL;
import X.C16040sN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends C06440Xs implements C16040sN, C15190qv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C04460Oj A04;
    public C06840Zk A05;
    public C05590Uc A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public final AnonymousClass0QI A0E;
    public final AnonymousClass0M6 A0F;

    public C002102g A0S() {
        return new C002102g(-2, -2);
    }

    public void A0y(AnonymousClass0Q1 r2) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A0E.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1K(int r5) {
        /*
            r4 = this;
            r3 = -1
            r2 = 1
            if (r5 == r2) goto L_0x0039
            r0 = 2
            if (r5 == r0) goto L_0x0024
            r0 = 17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x0046
            r0 = 33
            if (r5 == r0) goto L_0x001f
            r0 = 66
            if (r5 == r0) goto L_0x0031
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0036
            return r2
        L_0x001f:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x004b
            return r3
        L_0x0024:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0035
            androidx.recyclerview.widget.RecyclerView r0 = r4.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x0035
            return r3
        L_0x0031:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            return r2
        L_0x0036:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L_0x0039:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView r0 = r4.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x004a
            return r2
        L_0x0046:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            return r3
        L_0x004b:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1K(int):int");
    }

    public final int A1N(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        A1V();
        C05590Uc r3 = this.A06;
        boolean z = this.A0B;
        boolean z2 = !z;
        return AnonymousClass0V8.A00(A1U(z2), A1T(z2), r3, this, r8, z);
    }

    public final int A1O(AnonymousClass0Q1 r9) {
        if (A08() == 0) {
            return 0;
        }
        A1V();
        C05590Uc r3 = this.A06;
        boolean z = this.A0B;
        boolean z2 = !z;
        return AnonymousClass0V8.A02(A1U(z2), A1T(z2), r3, this, r9, z, this.A0A);
    }

    public final int A1P(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        A1V();
        C05590Uc r3 = this.A06;
        boolean z = this.A0B;
        boolean z2 = !z;
        return AnonymousClass0V8.A01(A1U(z2), A1T(z2), r3, this, r8, z);
    }

    public View A1T(boolean z) {
        int A082;
        int i;
        if (this.A0A) {
            A082 = 0;
            i = A08();
        } else {
            A082 = A08() - 1;
            i = -1;
        }
        return A1R(A082, i, z, true);
    }

    public View A1U(boolean z) {
        int i;
        int A082;
        if (this.A0A) {
            i = A08() - 1;
            A082 = -1;
        } else {
            i = 0;
            A082 = A08();
        }
        return A1R(i, A082, z, true);
    }

    public void A1h(boolean z) {
        A16((String) null);
        if (z != this.A09) {
            this.A09 = z;
            A0V();
        }
    }

    public void A1i(boolean z) {
        A16((String) null);
        if (this.A0C != z) {
            this.A0C = z;
            A0V();
        }
    }

    public int A0G(C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1M(r3, r4, i);
    }

    public int A0H(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1M(r2, r3, i);
    }

    public Parcelable A0O() {
        C06840Zk r2;
        int i;
        int i2;
        int A082;
        C06840Zk r0 = this.A05;
        if (r0 != null) {
            return r2;
        }
        r2 = new C06840Zk();
        if (A08() > 0) {
            A1V();
            boolean z = this.A07;
            boolean z2 = this.A0A;
            boolean z3 = z ^ z2;
            r2.A02 = z3;
            if (z3) {
                if (z2) {
                    A082 = 0;
                } else {
                    A082 = A08() - 1;
                }
                View A0Q = A0Q(A082);
                r2.A00 = this.A06.A02() - this.A06.A06(A0Q);
                i = C06440Xs.A03(A0Q);
            } else {
                if (z2) {
                    i2 = A08() - 1;
                } else {
                    i2 = 0;
                }
                View A0Q2 = A0Q(i2);
                r2.A01 = C06440Xs.A03(A0Q2);
                r2.A00 = this.A06.A09(A0Q2) - this.A06.A04();
                return r2;
            }
        } else {
            i = -1;
        }
        r2.A01 = i;
        return r2;
    }

    public void A0Z(int i) {
        this.A02 = i;
        this.A03 = Integer.MIN_VALUE;
        C06840Zk r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0V();
    }

    public void A0e(Parcelable parcelable) {
        if (parcelable instanceof C06840Zk) {
            this.A05 = (C06840Zk) parcelable;
            A0V();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(X.C16020sL r6, int r7) {
        /*
            r5 = this;
            X.0Zk r0 = r5.A05
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r0.A01
            if (r2 < 0) goto L_0x001e
            boolean r0 = r0.A02
        L_0x000c:
            if (r0 == 0) goto L_0x002d
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x002f
            if (r2 < 0) goto L_0x002f
            if (r2 >= r7) goto L_0x002f
            r6.Awj(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001e:
            r5.A1W()
            boolean r0 = r5.A0A
            int r2 = r5.A02
            if (r2 != r4) goto L_0x000c
            r2 = 0
            if (r0 == 0) goto L_0x002d
            int r2 = r7 + -1
            goto L_0x000e
        L_0x002d:
            r4 = 1
            goto L_0x000e
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0p(X.0sL, int):void");
    }

    public void A0q(C16020sL r4, AnonymousClass0Q1 r5, int i, int i2) {
        if (this.A01 != 0) {
            i = i2;
        }
        if (A08() != 0 && i != 0) {
            A1V();
            int i3 = -1;
            if (i > 0) {
                i3 = 1;
            }
            A1f(r5, i3, Math.abs(i), true);
            A1d(this.A04, r4, r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ff, code lost:
        if (r0 <= 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0201, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f4, code lost:
        if (r1.A01() != 0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017a, code lost:
        if (r1 > 0) goto L_0x017c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0v(X.C04870Qz r18, X.AnonymousClass0Q1 r19) {
        /*
            r17 = this;
            r3 = r17
            X.0Zk r1 = r3.A05
            r6 = -1
            r5 = r18
            r4 = r19
            if (r1 != 0) goto L_0x000f
            int r0 = r3.A02
            if (r0 == r6) goto L_0x0021
        L_0x000f:
            int r0 = r4.A00()
            if (r0 != 0) goto L_0x0019
            r3.A0s(r5)
            return
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0021
            r3.A02 = r0
        L_0x0021:
            r3.A1V()
            X.0Oj r0 = r3.A04
            r2 = 0
            r0.A0B = r2
            r3.A1W()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            r8 = 0
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r0.getFocusedChild()
            if (r1 == 0) goto L_0x0042
            X.0R0 r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            r8 = r1
        L_0x0042:
            X.0QI r7 = r3.A0E
            boolean r0 = r7.A04
            r9 = 1
            if (r0 == 0) goto L_0x0264
            int r0 = r3.A02
            if (r0 != r6) goto L_0x0264
            X.0Zk r0 = r3.A05
            if (r0 != 0) goto L_0x0264
            if (r8 == 0) goto L_0x0076
            X.0Uc r0 = r3.A06
            int r1 = r0.A09(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x006f
            X.0Uc r0 = r3.A06
            int r1 = r0.A06(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            if (r1 > r0) goto L_0x0076
        L_0x006f:
            int r0 = X.C06440Xs.A03(r8)
            r7.A02(r8, r0)
        L_0x0076:
            X.0Oj r8 = r3.A04
            int r1 = r8.A04
            r0 = -1
            if (r1 < 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            r8.A05 = r0
            int[] r1 = r3.A0D
            r1[r2] = r2
            r1[r9] = r2
            r3.A1g(r4, r1)
            r0 = r1[r2]
            int r10 = java.lang.Math.max(r2, r0)
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            int r10 = r10 + r0
            r0 = r1[r9]
            int r9 = java.lang.Math.max(r2, r0)
            X.0Uc r0 = r3.A06
            X.0vq r0 = (X.C17600vq) r0
            int r1 = r0.A00
            X.0Xs r0 = r0.A02
            if (r1 == 0) goto L_0x025e
            int r0 = r0.A0A()
        L_0x00aa:
            int r9 = r9 + r0
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00d6
            int r8 = r3.A02
            if (r8 == r6) goto L_0x00d6
            int r1 = r3.A03
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00d6
            android.view.View r11 = r3.A0P(r8)
            if (r11 == 0) goto L_0x00d6
            boolean r1 = r3.A0A
            X.0Uc r0 = r3.A06
            if (r1 == 0) goto L_0x024f
            int r8 = r0.A02()
            X.0Uc r0 = r3.A06
            int r0 = r0.A06(r11)
            int r8 = r8 - r0
            int r1 = r3.A03
        L_0x00d2:
            int r8 = r8 - r1
            if (r8 <= 0) goto L_0x024c
            int r10 = r10 + r8
        L_0x00d6:
            boolean r1 = r7.A03
            boolean r0 = r3.A0A
            if (r1 == 0) goto L_0x0248
            if (r0 == 0) goto L_0x00df
        L_0x00de:
            r6 = 1
        L_0x00df:
            r3.A1b(r7, r5, r4, r6)
            r3.A0r(r5)
            X.0Oj r6 = r3.A04
            X.0Uc r1 = r3.A06
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x00f6
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            r6.A0A = r0
            r6.A06 = r2
            boolean r6 = r7.A03
            int r1 = r7.A01
            int r0 = r7.A00
            if (r6 == 0) goto L_0x0206
            r3.A1a(r1, r0)
            X.0Oj r0 = r3.A04
            r0.A02 = r10
            r3.A1L(r0, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r6 = r0.A07
            int r10 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0118
            int r9 = r9 + r0
        L_0x0118:
            int r1 = r7.A01
            int r0 = r7.A00
            r3.A1Z(r1, r0)
            X.0Oj r8 = r3.A04
            r8.A02 = r9
            int r1 = r8.A01
            int r0 = r8.A03
            int r1 = r1 + r0
            r8.A01 = r1
            r3.A1L(r8, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r8 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0143
            r3.A1a(r10, r6)
            X.0Oj r0 = r3.A04
            r0.A02 = r1
            r3.A1L(r0, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r6 = r0.A07
        L_0x0143:
            int r0 = r3.A08()
            if (r0 <= 0) goto L_0x0183
            boolean r1 = r3.A0A
            boolean r0 = r3.A0C
            r1 = r1 ^ r0
            X.0Uc r0 = r3.A06
            if (r1 == 0) goto L_0x01d6
            int r0 = r0.A02()
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x01d4
            int r0 = -r0
            int r0 = r3.A1M(r5, r4, r0)
            int r10 = -r0
            int r9 = r8 + r10
            X.0Uc r0 = r3.A06
            int r1 = r0.A02()
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x01d2
            X.0Uc r0 = r3.A06
            r0.A0C(r1)
            int r1 = r1 + r10
        L_0x0170:
            int r6 = r6 + r1
            int r8 = r8 + r1
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            int r1 = r6 - r0
            if (r1 <= 0) goto L_0x0201
        L_0x017c:
            int r0 = r3.A1M(r5, r4, r1)
            int r0 = -r0
        L_0x0181:
            int r6 = r6 + r0
            int r8 = r8 + r0
        L_0x0183:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0460
            int r0 = r3.A08()
            if (r0 == 0) goto L_0x0460
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0460
            boolean r0 = r3.A1B()
            if (r0 == 0) goto L_0x0460
            java.util.List r12 = r5.A07
            int r16 = r12.size()
            int r13 = X.C06440Xs.A04(r3, r2)
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x01a4:
            r0 = r16
            if (r11 >= r0) goto L_0x0418
            java.lang.Object r0 = r12.get(r11)
            X.0Ua r0 = (X.C05570Ua) r0
            int r1 = r0.A00
            r1 = r1 & 8
            boolean r1 = X.AnonymousClass000.A1S(r1)
            if (r1 != 0) goto L_0x01cd
            int r1 = X.AnonymousClass001.A0J(r0)
            boolean r14 = X.AnonymousClass001.A1Y(r1, r13)
            boolean r1 = r3.A0A
            X.0Uc r15 = r3.A06
            android.view.View r0 = r0.A0H
            int r0 = r15.A07(r0)
            if (r14 == r1) goto L_0x01d0
            int r10 = r10 + r0
        L_0x01cd:
            int r11 = r11 + 1
            goto L_0x01a4
        L_0x01d0:
            int r9 = r9 + r0
            goto L_0x01cd
        L_0x01d2:
            r1 = r10
            goto L_0x0170
        L_0x01d4:
            r1 = 0
            goto L_0x0170
        L_0x01d6:
            int r0 = r0.A04()
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x0204
            int r0 = r3.A1M(r5, r4, r0)
            int r10 = -r0
            int r9 = r6 + r10
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            int r9 = r9 - r0
            if (r9 <= 0) goto L_0x01f5
            X.0Uc r1 = r3.A06
            int r0 = -r9
            r1.A0C(r0)
            int r10 = r10 - r9
        L_0x01f5:
            int r6 = r6 + r10
            int r8 = r8 + r10
            X.0Uc r0 = r3.A06
            int r0 = r0.A02()
            int r0 = r0 - r8
            int r1 = -r0
            if (r0 > 0) goto L_0x017c
        L_0x0201:
            r0 = 0
            goto L_0x0181
        L_0x0204:
            r10 = 0
            goto L_0x01f5
        L_0x0206:
            r3.A1Z(r1, r0)
            X.0Oj r0 = r3.A04
            r0.A02 = r9
            r3.A1L(r0, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r8 = r0.A07
            int r9 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x021b
            int r10 = r10 + r0
        L_0x021b:
            int r1 = r7.A01
            int r0 = r7.A00
            r3.A1a(r1, r0)
            X.0Oj r6 = r3.A04
            r6.A02 = r10
            int r1 = r6.A01
            int r0 = r6.A03
            int r1 = r1 + r0
            r6.A01 = r1
            r3.A1L(r6, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r6 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0143
            r3.A1Z(r9, r8)
            X.0Oj r0 = r3.A04
            r0.A02 = r1
            r3.A1L(r0, r5, r4, r2)
            X.0Oj r0 = r3.A04
            int r8 = r0.A07
            goto L_0x0143
        L_0x0248:
            if (r0 == 0) goto L_0x00de
            goto L_0x00df
        L_0x024c:
            int r9 = r9 - r8
            goto L_0x00d6
        L_0x024f:
            int r1 = r0.A09(r11)
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            int r1 = r1 - r0
            int r8 = r3.A03
            goto L_0x00d2
        L_0x025e:
            int r0 = r0.A0C()
            goto L_0x00aa
        L_0x0264:
            r7.A00()
            boolean r12 = r3.A0A
            boolean r0 = r3.A0C
            r0 = r0 ^ r12
            r7.A03 = r0
            boolean r0 = r4.A08
            r10 = 0
            if (r0 != 0) goto L_0x0330
            int r11 = r3.A02
            if (r11 == r6) goto L_0x0330
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 < 0) goto L_0x032c
            int r0 = r4.A00()
            if (r11 >= r0) goto L_0x032c
            r7.A01 = r11
            X.0Zk r1 = r3.A05
            if (r1 == 0) goto L_0x02a2
            int r0 = r1.A01
            if (r0 < 0) goto L_0x02a2
            boolean r1 = r1.A02
            r7.A03 = r1
            X.0Uc r0 = r3.A06
            if (r1 == 0) goto L_0x0321
            int r10 = r0.A02()
            X.0Zk r0 = r3.A05
            int r0 = r0.A00
        L_0x029b:
            int r10 = r10 - r0
        L_0x029c:
            r7.A00 = r10
        L_0x029e:
            r7.A04 = r9
            goto L_0x0076
        L_0x02a2:
            int r0 = r3.A03
            if (r0 != r8) goto L_0x030d
            android.view.View r8 = r3.A0P(r11)
            if (r8 == 0) goto L_0x03cd
            X.0Uc r0 = r3.A06
            int r1 = r0.A07(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A05()
            if (r1 > r0) goto L_0x03e4
            X.0Uc r0 = r3.A06
            int r1 = r0.A09(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            int r1 = r1 - r0
            X.0Uc r0 = r3.A06
            if (r1 >= 0) goto L_0x02d4
            int r0 = r0.A04()
            r7.A00 = r0
            r7.A03 = r2
            goto L_0x029e
        L_0x02d4:
            int r1 = r0.A02()
            X.0Uc r0 = r3.A06
            int r0 = r0.A06(r8)
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x02ec
            X.0Uc r0 = r3.A06
            int r0 = r0.A02()
            r7.A00 = r0
            r7.A03 = r9
            goto L_0x029e
        L_0x02ec:
            boolean r1 = r7.A03
            X.0Uc r0 = r3.A06
            if (r1 == 0) goto L_0x0308
            int r10 = r0.A06(r8)
            X.0Uc r8 = r3.A06
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r8.A00
            if (r1 != r0) goto L_0x0300
            r1 = 0
            goto L_0x0329
        L_0x0300:
            int r1 = r8.A05()
            int r0 = r8.A00
            int r1 = r1 - r0
            goto L_0x0329
        L_0x0308:
            int r10 = r0.A09(r8)
            goto L_0x029c
        L_0x030d:
            r7.A03 = r12
            X.0Uc r0 = r3.A06
            if (r12 == 0) goto L_0x031a
            int r10 = r0.A02()
            int r0 = r3.A03
            goto L_0x029b
        L_0x031a:
            int r10 = r0.A04()
            int r1 = r3.A03
            goto L_0x0329
        L_0x0321:
            int r10 = r0.A04()
            X.0Zk r0 = r3.A05
            int r1 = r0.A00
        L_0x0329:
            int r10 = r10 + r1
            goto L_0x029c
        L_0x032c:
            r3.A02 = r6
            r3.A03 = r8
        L_0x0330:
            int r0 = r3.A08()
            if (r0 == 0) goto L_0x03f7
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            if (r0 == 0) goto L_0x0371
            android.view.View r8 = r0.getFocusedChild()
            if (r8 == 0) goto L_0x0371
            X.0R0 r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0371
            X.02g r1 = X.AnonymousClass001.A0Y(r8)
            X.0Ua r0 = r1.A00
            int r0 = r0.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0371
            X.0Ua r0 = r1.A00
            int r1 = X.AnonymousClass001.A0J(r0)
            if (r1 < 0) goto L_0x0371
            int r0 = r4.A00()
            if (r1 >= r0) goto L_0x0371
            int r0 = X.C06440Xs.A03(r8)
            r7.A02(r8, r0)
            goto L_0x029e
        L_0x0371:
            boolean r1 = r3.A07
            boolean r0 = r3.A0C
            if (r1 != r0) goto L_0x03f7
            boolean r1 = r7.A03
            boolean r0 = r3.A0A
            if (r1 == 0) goto L_0x03c3
            if (r0 == 0) goto L_0x03c5
        L_0x037f:
            r13 = 0
            int r14 = r3.A08()
        L_0x0384:
            int r15 = r4.A00()
            r12 = r4
            r11 = r5
            r10 = r3
            android.view.View r8 = r10.A1S(r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x03f7
            int r0 = X.C06440Xs.A03(r8)
            r7.A01(r8, r0)
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x029e
            boolean r0 = r3.A1B()
            if (r0 == 0) goto L_0x029e
            X.0Uc r0 = r3.A06
            int r1 = r0.A09(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x03be
            X.0Uc r0 = r3.A06
            int r1 = r0.A06(r8)
            X.0Uc r0 = r3.A06
            int r0 = r0.A04()
            if (r1 >= r0) goto L_0x029e
        L_0x03be:
            boolean r1 = r7.A03
            X.0Uc r0 = r3.A06
            goto L_0x03e8
        L_0x03c3:
            if (r0 == 0) goto L_0x037f
        L_0x03c5:
            int r0 = r3.A08()
            int r13 = r0 + -1
            r14 = -1
            goto L_0x0384
        L_0x03cd:
            int r0 = r3.A08()
            if (r0 <= 0) goto L_0x03e4
            int r1 = X.C06440Xs.A04(r3, r2)
            int r0 = r3.A02
            boolean r1 = X.AnonymousClass001.A1Y(r0, r1)
            boolean r0 = r3.A0A
            if (r1 != r0) goto L_0x03e2
            r10 = 1
        L_0x03e2:
            r7.A03 = r10
        L_0x03e4:
            boolean r1 = r7.A03
            X.0Uc r0 = r7.A02
        L_0x03e8:
            if (r1 == 0) goto L_0x03f2
            int r0 = r0.A02()
        L_0x03ee:
            r7.A00 = r0
            goto L_0x029e
        L_0x03f2:
            int r0 = r0.A04()
            goto L_0x03ee
        L_0x03f7:
            boolean r1 = r7.A03
            X.0Uc r0 = r7.A02
            if (r1 == 0) goto L_0x0413
            int r0 = r0.A02()
        L_0x0401:
            r7.A00 = r0
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0411
            int r0 = r4.A00()
            int r0 = r0 + -1
        L_0x040d:
            r7.A01 = r0
            goto L_0x029e
        L_0x0411:
            r0 = 0
            goto L_0x040d
        L_0x0413:
            int r0 = r0.A04()
            goto L_0x0401
        L_0x0418:
            X.0Oj r0 = r3.A04
            r0.A09 = r12
            if (r10 <= 0) goto L_0x043e
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x047c
            int r0 = r3.A08()
            int r0 = r0 + -1
        L_0x0428:
            int r0 = X.C06440Xs.A04(r3, r0)
            r3.A1a(r0, r6)
            X.0Oj r1 = r3.A04
            r1.A02 = r10
            r1.A00 = r2
            r0 = 0
            r1.A01(r0)
            X.0Oj r0 = r3.A04
            r3.A1L(r0, r5, r4, r2)
        L_0x043e:
            if (r9 <= 0) goto L_0x045b
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0475
            r0 = 0
        L_0x0445:
            int r0 = X.C06440Xs.A04(r3, r0)
            r3.A1Z(r0, r8)
            X.0Oj r1 = r3.A04
            r1.A02 = r9
            r1.A00 = r2
            r0 = 0
            r1.A01(r0)
            X.0Oj r0 = r3.A04
            r3.A1L(r0, r5, r4, r2)
        L_0x045b:
            X.0Oj r1 = r3.A04
            r0 = 0
            r1.A09 = r0
        L_0x0460:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0471
            X.0Uc r1 = r3.A06
            int r0 = r1.A05()
            r1.A00 = r0
        L_0x046c:
            boolean r0 = r3.A0C
            r3.A07 = r0
            return
        L_0x0471:
            r7.A00()
            goto L_0x046c
        L_0x0475:
            int r0 = r3.A08()
            int r0 = r0 + -1
            goto L_0x0445
        L_0x047c:
            r0 = 0
            goto L_0x0428
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0v(X.0Qz, X.0Q1):void");
    }

    public void A0w(C04870Qz r2, RecyclerView recyclerView) {
        if (this.A08) {
            A0s(r2);
            r2.A05.clear();
            r2.A03();
        }
    }

    public void A16(String str) {
        if (this.A05 == null) {
            super.A16(str);
        }
    }

    public boolean A17() {
        return AnonymousClass000.A1T(this.A01);
    }

    public boolean A18() {
        return AnonymousClass001.A1T(this.A01);
    }

    public boolean A19() {
        return true;
    }

    public boolean A1A() {
        if (this.A01 == 1073741824 || this.A04 == 1073741824) {
            return false;
        }
        int A082 = A08();
        for (int i = 0; i < A082; i++) {
            ViewGroup.LayoutParams layoutParams = A0Q(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean A1B() {
        if (this.A05 == null && this.A07 == this.A0C) {
            return true;
        }
        return false;
    }

    public int A1L(C04460Oj r8, C04870Qz r9, AnonymousClass0Q1 r10, boolean z) {
        int i;
        int i2 = r8.A00;
        int i3 = r8.A08;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                r8.A08 = i3 + i2;
            }
            A1e(r8, r9);
        }
        int i4 = r8.A00 + r8.A02;
        AnonymousClass0M6 r2 = this.A0F;
        while (true) {
            if ((!r8.A0A && i4 <= 0) || (i = r8.A01) < 0 || i >= r10.A00()) {
                break;
            }
            r2.A00 = 0;
            r2.A01 = false;
            r2.A03 = false;
            r2.A02 = false;
            A1c(r2, r8, r9, r10);
            if (r2.A01) {
                break;
            }
            int i5 = r8.A07;
            int i6 = r2.A00;
            r8.A07 = i5 + (r8.A05 * i6);
            if (!r2.A03 || r8.A09 != null || !r10.A08) {
                r8.A00 -= i6;
                i4 -= i6;
            }
            int i7 = r8.A08;
            if (i7 != Integer.MIN_VALUE) {
                int i8 = i7 + i6;
                r8.A08 = i8;
                int i9 = r8.A00;
                if (i9 < 0) {
                    r8.A08 = i8 + i9;
                }
                A1e(r8, r9);
            }
            if (z && r2.A02) {
                break;
            }
        }
        return i2 - r8.A00;
    }

    public void A1V() {
        if (this.A04 == null) {
            this.A04 = new C04460Oj();
        }
    }

    public final void A1W() {
        boolean z;
        if (this.A01 == 1 || !AnonymousClass0YH.A08(this.A07)) {
            z = this.A09;
        } else {
            z = !this.A09;
        }
        this.A0A = z;
    }

    public void A1X(int i) {
        if (i == 0 || i == 1) {
            A16((String) null);
            if (i != this.A01 || this.A06 == null) {
                C05590Uc A002 = C05590Uc.A00(this, i);
                this.A06 = A002;
                this.A0E.A02 = A002;
                this.A01 = i;
                A0V();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0G("invalid orientation:", AnonymousClass001.A0o(), i);
    }

    public void A1Y(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        C06840Zk r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0V();
    }

    public final void A1Z(int i, int i2) {
        this.A04.A00 = this.A06.A02() - i2;
        C04460Oj r3 = this.A04;
        int i3 = 1;
        if (this.A0A) {
            i3 = -1;
        }
        r3.A03 = i3;
        r3.A01 = i;
        r3.A05 = 1;
        r3.A07 = i2;
        r3.A08 = Integer.MIN_VALUE;
    }

    public final void A1a(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A04();
        C04460Oj r3 = this.A04;
        r3.A01 = i;
        int i3 = -1;
        if (this.A0A) {
            i3 = 1;
        }
        r3.A03 = i3;
        r3.A05 = -1;
        r3.A07 = i2;
        r3.A08 = Integer.MIN_VALUE;
    }

    public void A1d(C04460Oj r4, C16020sL r5, AnonymousClass0Q1 r6) {
        int i = r4.A01;
        if (i >= 0 && i < r6.A00()) {
            r5.Awj(i, Math.max(0, r4.A08));
        }
    }

    public final void A1e(C04460Oj r8, C04870Qz r9) {
        int i;
        int i2;
        if (r8.A0B && !r8.A0A) {
            int i3 = r8.A08;
            int i4 = r8.A06;
            if (r8.A05 == -1) {
                int A082 = A08();
                if (i3 >= 0) {
                    int A012 = (this.A06.A01() - i3) + i4;
                    int i5 = A082 - 1;
                    int i6 = i5;
                    if (this.A0A) {
                        i5 = 0;
                        i2 = 0;
                        while (i2 < A082) {
                            View A0Q = A0Q(i2);
                            if (this.A06.A09(A0Q) >= A012 && this.A06.A0B(A0Q) >= A012) {
                                i2++;
                            }
                        }
                        return;
                    }
                    while (i2 >= 0) {
                        View A0Q2 = A0Q(i2);
                        if (this.A06.A09(A0Q2) >= A012 && this.A06.A0B(A0Q2) >= A012) {
                            i6 = i2 - 1;
                        }
                    }
                    return;
                    if (i5 == i2) {
                        return;
                    }
                    if (i2 > i5) {
                        while (true) {
                            i2--;
                            if (i2 >= i5) {
                                A0u(r9, i2);
                            } else {
                                return;
                            }
                        }
                    } else {
                        while (i5 > i2) {
                            A0u(r9, i5);
                            i5--;
                        }
                    }
                }
            } else if (i3 >= 0) {
                int i7 = i3 - i4;
                int A083 = A08();
                int i8 = 0;
                int i9 = 0;
                if (this.A0A) {
                    i8 = A083 - 1;
                    i = i8;
                    while (i >= 0) {
                        View A0Q3 = A0Q(i);
                        if (this.A06.A06(A0Q3) <= i7 && this.A06.A0A(A0Q3) <= i7) {
                            i--;
                        }
                    }
                    return;
                }
                while (i < A083) {
                    View A0Q4 = A0Q(i);
                    if (this.A06.A06(A0Q4) <= i7 && this.A06.A0A(A0Q4) <= i7) {
                        i9 = i + 1;
                    }
                }
                return;
                if (i8 == i) {
                    return;
                }
                if (i > i8) {
                    while (true) {
                        i--;
                        if (i >= i8) {
                            A0u(r9, i);
                        } else {
                            return;
                        }
                    }
                } else {
                    while (i8 > i) {
                        A0u(r9, i8);
                        i8--;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A01() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1f(X.AnonymousClass0Q1 r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            X.0Oj r2 = r6.A04
            X.0Uc r1 = r6.A06
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0011
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0A = r0
            r2.A05 = r8
            int[] r2 = r6.A0D
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r6.A1g(r7, r2)
            r0 = r2[r4]
            int r1 = java.lang.Math.max(r4, r0)
            r0 = r2[r5]
            int r0 = java.lang.Math.max(r4, r0)
            if (r8 != r5) goto L_0x0030
            r4 = 1
        L_0x0030:
            X.0Oj r3 = r6.A04
            r2 = r1
            if (r4 == 0) goto L_0x0036
            r2 = r0
        L_0x0036:
            r3.A02 = r2
            if (r4 != 0) goto L_0x003b
            r1 = r0
        L_0x003b:
            r3.A06 = r1
            if (r4 == 0) goto L_0x009a
            X.0Uc r0 = r6.A06
            X.0vq r0 = (X.C17600vq) r0
            int r1 = r0.A00
            X.0Xs r0 = r0.A02
            if (r1 == 0) goto L_0x0095
            int r0 = r0.A0A()
        L_0x004d:
            int r2 = r2 + r0
            r3.A02 = r2
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x008e
            r0 = 0
        L_0x0055:
            android.view.View r4 = r6.A0Q(r0)
            X.0Oj r3 = r6.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0060
            r5 = -1
        L_0x0060:
            r3.A03 = r5
            int r2 = X.C06440Xs.A03(r4)
            X.0Oj r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0Uc r0 = r6.A06
            int r0 = r0.A06(r4)
            r1.A07 = r0
            X.0Uc r0 = r6.A06
            int r1 = r0.A06(r4)
            X.0Uc r0 = r6.A06
            int r0 = r0.A02()
            int r1 = r1 - r0
        L_0x0082:
            X.0Oj r0 = r6.A04
            r0.A00 = r9
            if (r10 == 0) goto L_0x008b
            int r9 = r9 - r1
            r0.A00 = r9
        L_0x008b:
            r0.A08 = r1
            return
        L_0x008e:
            int r0 = r6.A08()
            int r0 = r0 + -1
            goto L_0x0055
        L_0x0095:
            int r0 = r0.A0C()
            goto L_0x004d
        L_0x009a:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00e0
            int r0 = r6.A08()
            int r0 = r0 + -1
        L_0x00a4:
            android.view.View r4 = r6.A0Q(r0)
            X.0Oj r2 = r6.A04
            int r1 = r2.A02
            X.0Uc r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            r2.A02 = r1
            X.0Oj r3 = r6.A04
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x00bc
            r5 = -1
        L_0x00bc:
            r3.A03 = r5
            int r2 = X.C06440Xs.A03(r4)
            X.0Oj r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0Uc r0 = r6.A06
            int r0 = r0.A09(r4)
            r1.A07 = r0
            X.0Uc r0 = r6.A06
            int r0 = r0.A09(r4)
            int r1 = -r0
            X.0Uc r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            goto L_0x0082
        L_0x00e0:
            r0 = 0
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1f(X.0Q1, int, int, boolean):void");
    }

    public void A1g(AnonymousClass0Q1 r6, int[] iArr) {
        int i;
        if (r6.A06 != -1) {
            i = this.A06.A05();
        } else {
            i = 0;
        }
        int i2 = 0;
        if (this.A04.A05 != -1) {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A09 = false;
        this.A0A = false;
        this.A0C = false;
        this.A0B = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0E = new AnonymousClass0QI();
        this.A0F = new AnonymousClass0M6();
        this.A00 = 2;
        this.A0D = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0JZ.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1X(i3);
        A1h(z);
        A1i(z2);
    }

    public int A0I(AnonymousClass0Q1 r2) {
        return A1N(r2);
    }

    public int A0J(AnonymousClass0Q1 r2) {
        return A1O(r2);
    }

    public int A0K(AnonymousClass0Q1 r2) {
        return A1P(r2);
    }

    public int A0L(AnonymousClass0Q1 r2) {
        return A1N(r2);
    }

    public int A0M(AnonymousClass0Q1 r2) {
        return A1O(r2);
    }

    public int A0N(AnonymousClass0Q1 r2) {
        return A1P(r2);
    }

    public View A0P(int i) {
        int A082 = A08();
        if (A082 == 0) {
            return null;
        }
        int A042 = i - C06440Xs.A04(this, 0);
        if (A042 >= 0 && A042 < A082) {
            View A0Q = A0Q(A042);
            if (C06440Xs.A03(A0Q) == i) {
                return A0Q;
            }
        }
        return super.A0P(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r6.A0A != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = A08() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r1 = A0Q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r1.hasFocusable() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r6.A0A != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0R(android.view.View r7, X.C04870Qz r8, X.AnonymousClass0Q1 r9, int r10) {
        /*
            r6 = this;
            r6.A1W()
            int r0 = r6.A08()
            r5 = 0
            if (r0 == 0) goto L_0x007a
            int r4 = r6.A1K(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r2) goto L_0x007a
            r6.A1V()
            X.0Uc r0 = r6.A06
            int r0 = r0.A05()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 0
            r6.A1f(r9, r4, r1, r0)
            X.0Oj r1 = r6.A04
            r1.A08 = r2
            r1.A0B = r0
            r0 = 1
            r6.A1L(r1, r8, r9, r0)
            r3 = -1
            boolean r0 = r6.A0A
            if (r4 != r3) goto L_0x005e
            if (r0 == 0) goto L_0x0058
            int r0 = r6.A08()
            int r1 = r0 + -1
            r0 = -1
        L_0x003d:
            android.view.View r2 = r6.A1Q(r1, r0)
        L_0x0041:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x006f
        L_0x0045:
            int r0 = r6.A08()
            int r0 = r0 + -1
        L_0x004b:
            android.view.View r1 = r6.A0Q(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x0079
            if (r2 == 0) goto L_0x007a
            return r1
        L_0x0058:
            r1 = 0
            int r0 = r6.A08()
            goto L_0x003d
        L_0x005e:
            if (r0 == 0) goto L_0x0071
            r1 = 0
            int r0 = r6.A08()
        L_0x0065:
            android.view.View r2 = r6.A1Q(r1, r0)
            if (r4 == r3) goto L_0x0041
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0045
        L_0x006f:
            r0 = 0
            goto L_0x004b
        L_0x0071:
            int r0 = r6.A08()
            int r1 = r0 + -1
            r0 = -1
            goto L_0x0065
        L_0x0079:
            return r2
        L_0x007a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0R(android.view.View, X.0Qz, X.0Q1, int):android.view.View");
    }

    public void A0m(AccessibilityEvent accessibilityEvent) {
        super.A0m(accessibilityEvent);
        if (A08() > 0) {
            accessibilityEvent.setFromIndex(A1H());
            accessibilityEvent.setToIndex(A1J());
        }
    }

    public void A0z(AnonymousClass0Q1 r3, RecyclerView recyclerView, int i) {
        C011209g r0 = new C011209g(recyclerView.getContext());
        r0.A00 = i;
        A0x(r0);
    }

    public int A1G() {
        View A1R = A1R(0, A08(), true, false);
        if (A1R == null) {
            return -1;
        }
        return C06440Xs.A03(A1R);
    }

    public int A1H() {
        View A1R = A1R(0, A08(), false, true);
        if (A1R == null) {
            return -1;
        }
        return C06440Xs.A03(A1R);
    }

    public int A1I() {
        View A1R = A1R(A08() - 1, -1, true, false);
        if (A1R != null) {
            return C06440Xs.A03(A1R);
        }
        return -1;
    }

    public int A1J() {
        View A1R = A1R(A08() - 1, -1, false, true);
        if (A1R != null) {
            return C06440Xs.A03(A1R);
        }
        return -1;
    }

    public int A1M(C04870Qz r6, AnonymousClass0Q1 r7, int i) {
        if (!(A08() == 0 || i == 0)) {
            A1V();
            this.A04.A0B = true;
            int i2 = -1;
            if (i > 0) {
                i2 = 1;
            }
            int abs = Math.abs(i);
            A1f(r7, i2, abs, true);
            C04460Oj r0 = this.A04;
            int A1L = r0.A08 + A1L(r0, r6, r7, false);
            if (A1L >= 0) {
                if (abs > A1L) {
                    i = i2 * A1L;
                }
                this.A06.A0C(-i);
                this.A04.A04 = i;
                return i;
            }
        }
        return 0;
    }

    public View A1Q(int i, int i2) {
        AnonymousClass0OO r0;
        A1V();
        if (i2 <= i && i2 >= i) {
            return A0Q(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A09(A0Q(i)) < this.A06.A04()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i3, i4);
    }

    public View A1R(int i, int i2, boolean z, boolean z2) {
        AnonymousClass0OO r0;
        A1V();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i4, i3);
    }

    public View A1S(C04870Qz r8, AnonymousClass0Q1 r9, int i, int i2, int i3) {
        A1V();
        int A042 = this.A06.A04();
        int A022 = this.A06.A02();
        int i4 = -1;
        if (i2 > i) {
            i4 = 1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0Q = A0Q(i);
            int A032 = C06440Xs.A03(A0Q);
            if (A032 >= 0 && A032 < i3) {
                if (AnonymousClass000.A1S(AnonymousClass001.A0Y(A0Q).A00.A00 & 8)) {
                    if (view2 == null) {
                        view2 = A0Q;
                    }
                } else if (this.A06.A09(A0Q) < A022 && this.A06.A06(A0Q) >= A042) {
                    return A0Q;
                } else {
                    if (view == null) {
                        view = A0Q;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public void A1c(AnonymousClass0M6 r11, C04460Oj r12, C04870Qz r13, AnonymousClass0Q1 r14) {
        int A0D2;
        int A082;
        int i;
        int i2;
        View A002 = r12.A00(r13);
        if (A002 == null) {
            r11.A01 = true;
            return;
        }
        C002102g A0Y = AnonymousClass001.A0Y(A002);
        List list = r12.A09;
        boolean z = this.A0A;
        boolean A1U = AnonymousClass000.A1U(r12.A05, -1);
        if (list == null) {
            if (z == A1U) {
                A0i(A002, -1, false);
            } else {
                A0i(A002, 0, false);
            }
        } else if (z == A1U) {
            A0i(A002, -1, true);
        } else {
            A0i(A002, 0, true);
        }
        A0f(A002);
        r11.A00 = this.A06.A07(A002);
        if (this.A01 == 1) {
            if (AnonymousClass0YH.A08(this.A07)) {
                i = this.A03 - A0C();
                i2 = i - this.A06.A08(A002);
            } else {
                i2 = A0B();
                i = this.A06.A08(A002) + i2;
            }
            int i3 = r12.A05;
            A082 = r12.A07;
            int i4 = r11.A00;
            A0D2 = A082 - i4;
            if (i3 != -1) {
                A0D2 = A082;
                A082 = i4 + A082;
            }
        } else {
            A0D2 = A0D();
            A082 = this.A06.A08(A002) + A0D2;
            int i5 = r12.A05;
            int i6 = r12.A07;
            int i7 = r11.A00;
            if (i5 == -1) {
                i2 = i6 - i7;
                i = i6;
            } else {
                i = i7 + i6;
                i2 = i6;
            }
        }
        C06440Xs.A05(A002, i2, A0D2, i, A082);
        C05570Ua r1 = A0Y.A00;
        if (AnonymousClass000.A1S(r1.A00 & 8) || (r1.A00 & 2) != 0) {
            r11.A03 = true;
        }
        r11.A02 = A002.hasFocusable();
    }

    public PointF AzL(int i) {
        PointF pointF;
        if (A08() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < C06440Xs.A04(this, 0)) {
            z = true;
        }
        if (z != this.A0A) {
            i2 = -1;
        }
        float f = (float) i2;
        if (this.A01 == 0) {
            return pointF;
        }
        pointF = new PointF(0.0f, f);
        return pointF;
    }

    public void A1b(AnonymousClass0QI r1, C04870Qz r2, AnonymousClass0Q1 r3, int i) {
    }

    public LinearLayoutManager(int i) {
        this.A01 = 1;
        this.A09 = false;
        this.A0A = false;
        this.A0C = false;
        this.A0B = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0E = new AnonymousClass0QI();
        this.A0F = new AnonymousClass0M6();
        this.A00 = 2;
        this.A0D = new int[2];
        A1X(i);
        A1h(false);
    }

    public LinearLayoutManager() {
        this(1);
    }
}
