package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09Y;
import X.AnonymousClass0JZ;
import X.AnonymousClass0KP;
import X.AnonymousClass0Q1;
import X.AnonymousClass0R1;
import X.AnonymousClass0V8;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.C002102g;
import X.C011209g;
import X.C04310Ns;
import X.C04370Ny;
import X.C04650Qc;
import X.C04870Qz;
import X.C05590Uc;
import X.C05650Ui;
import X.C06440Xs;
import X.C06810Zh;
import X.C06850Zl;
import X.C11080j4;
import X.C16020sL;
import X.C16040sN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends C06440Xs implements C16040sN {
    public int A00;
    public int A01 = 2;
    public int A02;
    public int A03 = -1;
    public int A04 = Integer.MIN_VALUE;
    public int A05;
    public int A06 = -1;
    public C05590Uc A07;
    public C05590Uc A08;
    public C04650Qc A09 = new C04650Qc();
    public C06850Zl A0A;
    public BitSet A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = true;
    public int[] A0I;
    public AnonymousClass0R1[] A0J;
    public final Rect A0K = AnonymousClass001.A0N();
    public final C04370Ny A0L;
    public final C04310Ns A0M = new C04310Ns(this);
    public final Runnable A0N = new C11080j4(this);

    public int A0I(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        C05590Uc r3 = this.A07;
        boolean z = this.A0H;
        boolean z2 = !z;
        return AnonymousClass0V8.A00(A1P(z2), A1O(z2), r3, this, r8, z);
    }

    public int A0K(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        C05590Uc r3 = this.A07;
        boolean z = this.A0H;
        boolean z2 = !z;
        return AnonymousClass0V8.A01(A1P(z2), A1O(z2), r3, this, r8, z);
    }

    public int A0L(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        C05590Uc r3 = this.A07;
        boolean z = this.A0H;
        boolean z2 = !z;
        return AnonymousClass0V8.A00(A1P(z2), A1O(z2), r3, this, r8, z);
    }

    public int A0N(AnonymousClass0Q1 r8) {
        if (A08() == 0) {
            return 0;
        }
        C05590Uc r3 = this.A07;
        boolean z = this.A0H;
        boolean z2 = !z;
        return AnonymousClass0V8.A01(A1P(z2), A1O(z2), r3, this, r8, z);
    }

    public void A0v(C04870Qz r2, AnonymousClass0Q1 r3) {
        A1W(r2, r3, true);
    }

    public void A0y(AnonymousClass0Q1 r2) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0M.A00();
    }

    public void A12(RecyclerView recyclerView, int i, int i2) {
        A1T(i, i2, 1);
    }

    public void A13(RecyclerView recyclerView, int i, int i2) {
        A1T(i, i2, 2);
    }

    public void A15(RecyclerView recyclerView, Object obj, int i, int i2) {
        A1T(i, i2, 4);
    }

    public final int A1M(AnonymousClass0Q1 r9) {
        if (A08() == 0) {
            return 0;
        }
        C05590Uc r3 = this.A07;
        boolean z = this.A0H;
        boolean z2 = !z;
        return AnonymousClass0V8.A02(A1P(z2), A1O(z2), r3, this, r9, z, this.A0G);
    }

    public void A1R(int i) {
        A16((String) null);
        if (i != this.A06) {
            C04650Qc r2 = this.A09;
            int[] iArr = r2.A01;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r2.A00 = null;
            A0V();
            this.A06 = i;
            this.A0B = new BitSet(i);
            AnonymousClass0R1[] r22 = new AnonymousClass0R1[i];
            this.A0J = r22;
            for (int i2 = 0; i2 < i; i2++) {
                r22[i2] = new AnonymousClass0R1(this, i2);
            }
            A0V();
        }
    }

    public void A1X(AnonymousClass0Q1 r5, int i) {
        int A1G;
        int i2;
        if (i > 0) {
            A1G = A1H();
            i2 = 1;
        } else {
            A1G = A1G();
            i2 = -1;
        }
        C04370Ny r1 = this.A0L;
        r1.A07 = true;
        A1Y(r5, A1G);
        A1S(i2);
        r1.A01 = A1G + r1.A03;
        r1.A00 = Math.abs(i);
    }

    public static final int A00(int i, int i2, int i3) {
        int mode;
        if ((i2 != 0 || i3 != 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public int A0E(C04870Qz r3, AnonymousClass0Q1 r4) {
        if (this.A02 == 1) {
            return this.A06;
        }
        return super.A0E(r3, r4);
    }

    public int A0F(C04870Qz r2, AnonymousClass0Q1 r3) {
        if (this.A02 == 0) {
            return this.A06;
        }
        return super.A0F(r2, r3);
    }

    public Parcelable A0O() {
        C06850Zl r4;
        int A1G;
        View A1P;
        int A032;
        int A033;
        int A042;
        int[] iArr;
        C06850Zl r0 = this.A0A;
        if (r0 == null) {
            r4 = new C06850Zl();
            r4.A07 = this.A0F;
            r4.A05 = this.A0D;
            r4.A06 = this.A0E;
            C04650Qc r1 = this.A09;
            if (r1 == null || (iArr = r1.A01) == null) {
                r4.A01 = 0;
            } else {
                r4.A08 = iArr;
                r4.A01 = iArr.length;
                r4.A04 = r1.A00;
            }
            if (A08() > 0) {
                if (this.A0D) {
                    A1G = A1H();
                } else {
                    A1G = A1G();
                }
                r4.A00 = A1G;
                if (this.A0G) {
                    A1P = A1O(true);
                } else {
                    A1P = A1P(true);
                }
                if (A1P == null) {
                    A032 = -1;
                } else {
                    A032 = C06440Xs.A03(A1P);
                }
                r4.A03 = A032;
                int i = this.A06;
                r4.A02 = i;
                r4.A09 = new int[i];
                for (int i2 = 0; i2 < this.A06; i2++) {
                    boolean z = this.A0D;
                    AnonymousClass0R1 r02 = this.A0J[i2];
                    if (z) {
                        A033 = r02.A02(Integer.MIN_VALUE);
                        if (A033 != Integer.MIN_VALUE) {
                            A042 = this.A07.A02();
                        } else {
                            r4.A09[i2] = A033;
                        }
                    } else {
                        A033 = r02.A03(Integer.MIN_VALUE);
                        if (A033 != Integer.MIN_VALUE) {
                            A042 = this.A07.A04();
                        } else {
                            r4.A09[i2] = A033;
                        }
                    }
                    A033 -= A042;
                    r4.A09[i2] = A033;
                }
            } else {
                r4.A00 = -1;
                r4.A03 = -1;
                r4.A02 = 0;
                return r4;
            }
        }
        return r4;
    }

    public C002102g A0S() {
        AnonymousClass09Y r0;
        if (this.A02 == 0) {
            return r0;
        }
        r0 = new AnonymousClass09Y(-1, -2);
        return r0;
    }

    public C002102g A0T(Context context, AttributeSet attributeSet) {
        return new AnonymousClass09Y(context, attributeSet);
    }

    public C002102g A0U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass09Y((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass09Y(layoutParams);
    }

    public void A0Y(int i) {
        if (i == 0) {
            A1a();
        }
    }

    public void A0Z(int i) {
        C06850Zl r1 = this.A0A;
        if (!(r1 == null || r1.A00 == i)) {
            r1.A09 = null;
            r1.A02 = 0;
            r1.A00 = -1;
            r1.A03 = -1;
        }
        this.A03 = i;
        this.A04 = Integer.MIN_VALUE;
        A0V();
    }

    public void A0e(Parcelable parcelable) {
        if (parcelable instanceof C06850Zl) {
            this.A0A = (C06850Zl) parcelable;
            A0V();
        }
    }

    public void A0q(C16020sL r7, AnonymousClass0Q1 r8, int i, int i2) {
        int A022;
        int i3;
        if (this.A02 != 0) {
            i = i2;
        }
        if (A08() != 0 && i != 0) {
            A1X(r8, i);
            int[] iArr = this.A0I;
            if (iArr == null || iArr.length < this.A06) {
                this.A0I = new int[this.A06];
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.A06; i6++) {
                C04370Ny r5 = this.A0L;
                if (r5.A03 == -1) {
                    A022 = r5.A05;
                    i3 = this.A0J[i6].A03(A022);
                } else {
                    A022 = this.A0J[i6].A02(r5.A02);
                    i3 = r5.A02;
                }
                int i7 = A022 - i3;
                if (i7 >= 0) {
                    this.A0I[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.A0I, 0, i5);
            while (i4 < i5) {
                C04370Ny r2 = this.A0L;
                int i8 = r2.A01;
                if (i8 >= 0 && i8 < r8.A00()) {
                    r7.Awj(i8, this.A0I[i4]);
                    r2.A01 += r2.A03;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0w(C04870Qz r3, RecyclerView recyclerView) {
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.A06; i++) {
            this.A0J[i].A08();
        }
        recyclerView.requestLayout();
    }

    public void A11(RecyclerView recyclerView) {
        C04650Qc r2 = this.A09;
        int[] iArr = r2.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = null;
        A0V();
    }

    public void A14(RecyclerView recyclerView, int i, int i2, int i3) {
        A1T(i, i2, 8);
    }

    public void A16(String str) {
        if (this.A0A == null) {
            super.A16(str);
        }
    }

    public boolean A17() {
        return AnonymousClass000.A1T(this.A02);
    }

    public boolean A18() {
        return AnonymousClass001.A1T(this.A02);
    }

    public boolean A19() {
        return AnonymousClass000.A1S(this.A01);
    }

    public boolean A1B() {
        return AnonymousClass000.A1X(this.A0A);
    }

    public final int A1I(int i) {
        int A022 = this.A0J[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A023 = this.A0J[i2].A02(i);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    public final int A1J(int i) {
        int A032 = this.A0J[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A033 = this.A0J[i2].A03(i);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A1K(X.C04370Ny r24, X.C04870Qz r25, X.AnonymousClass0Q1 r26) {
        /*
            r23 = this;
            r9 = r23
            java.util.BitSet r1 = r9.A0B
            int r0 = r9.A06
            r12 = 0
            r8 = 1
            r1.set(r12, r0, r8)
            X.0Ny r7 = r9.A0L
            boolean r0 = r7.A06
            r10 = r24
            int r3 = r10.A04
            if (r0 == 0) goto L_0x0035
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r8) goto L_0x001c
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            r2 = 0
        L_0x001d:
            int r0 = r9.A06
            if (r2 >= r0) goto L_0x0043
            X.0R1[] r1 = r9.A0J
            r0 = r1[r2]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            r0 = r1[r2]
            r9.A1Z(r0, r3, r6)
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0035:
            if (r3 != r8) goto L_0x003d
            int r6 = r10.A02
            int r0 = r10.A00
            int r6 = r6 + r0
            goto L_0x001c
        L_0x003d:
            int r6 = r10.A05
            int r0 = r10.A00
            int r6 = r6 - r0
            goto L_0x001c
        L_0x0043:
            boolean r1 = r9.A0G
            X.0Uc r0 = r9.A07
            r21 = r0
            if (r1 == 0) goto L_0x034e
            int r20 = r21.A02()
        L_0x004f:
            r2 = 0
        L_0x0050:
            int r1 = r10.A01
            r22 = r25
            if (r1 < 0) goto L_0x0354
            int r0 = r26.A00()
            if (r1 >= r0) goto L_0x0354
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0068
            java.util.BitSet r0 = r9.A0B
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0354
        L_0x0068:
            int r1 = r10.A01
            r0 = r22
            android.view.View r5 = r0.A01(r1)
            int r1 = r10.A01
            int r0 = r10.A03
            int r1 = r1 + r0
            r10.A01 = r1
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            X.09Y r4 = (X.AnonymousClass09Y) r4
            X.0Ua r0 = r4.A00
            int r3 = X.AnonymousClass001.A0J(r0)
            X.0Qc r2 = r9.A09
            int[] r1 = r2.A01
            if (r1 == 0) goto L_0x02e7
            int r0 = r1.length
            if (r3 >= r0) goto L_0x02e7
            r1 = r1[r3]
            r0 = -1
            if (r1 == r0) goto L_0x02e7
            r19 = 0
            X.0R1[] r0 = r9.A0J
            r1 = r0[r1]
        L_0x0097:
            r4.A00 = r1
            int r0 = r10.A04
            if (r0 != r8) goto L_0x02e2
            r0 = -1
            r9.A0i(r5, r0, r12)
        L_0x00a1:
            boolean r11 = r4.A01
            int r0 = r9.A02
            r18 = r0
            if (r11 == 0) goto L_0x02b5
            if (r0 != r8) goto L_0x029b
            int r14 = r9.A00
        L_0x00ad:
            int r13 = r9.A00
            int r12 = r9.A01
            int r11 = r9.A0D()
            int r0 = r9.A0A()
            int r11 = r11 + r0
            int r0 = r4.height
            int r0 = X.C06440Xs.A02(r13, r12, r11, r0, r8)
        L_0x00c0:
            r9.A1U(r5, r14, r0)
        L_0x00c3:
            int r11 = r10.A04
            boolean r0 = r4.A01
            if (r11 != r8) goto L_0x010b
            if (r0 == 0) goto L_0x0104
            r0 = r20
            int r12 = r9.A1I(r0)
        L_0x00d1:
            r0 = r21
            int r11 = r0.A07(r5)
            int r11 = r11 + r12
            if (r19 == 0) goto L_0x017f
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017f
            X.0Zh r14 = new X.0Zh
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x00ea:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x0100
            int[] r0 = r14.A03
            r15 = r0
            X.0R1[] r0 = r9.A0J
            r0 = r0[r13]
            int r0 = r0.A02(r12)
            int r0 = r12 - r0
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x00ea
        L_0x0100:
            r0 = -1
            r14.A00 = r0
            goto L_0x014b
        L_0x0104:
            r0 = r20
            int r12 = r1.A02(r0)
            goto L_0x00d1
        L_0x010b:
            if (r0 == 0) goto L_0x0142
            r0 = r20
            int r11 = r9.A1J(r0)
        L_0x0113:
            r0 = r21
            int r0 = r0.A07(r5)
            int r12 = r11 - r0
            if (r19 == 0) goto L_0x017f
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017f
            X.0Zh r14 = new X.0Zh
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x012d:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x0149
            int[] r0 = r14.A03
            r15 = r0
            X.0R1[] r0 = r9.A0J
            r0 = r0[r13]
            int r0 = r0.A03(r11)
            int r0 = r0 - r11
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x012d
        L_0x0142:
            r0 = r20
            int r11 = r1.A03(r0)
            goto L_0x0113
        L_0x0149:
            r14.A00 = r8
        L_0x014b:
            r14.A01 = r3
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0157
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A00 = r0
        L_0x0157:
            int r17 = r0.size()
            r13 = 0
        L_0x015c:
            r0 = r17
            if (r13 >= r0) goto L_0x01b0
            X.0Zh r16 = X.C04650Qc.A00(r2, r13)
            r0 = r16
            int r0 = r0.A01
            r15 = r0
            int r0 = r14.A01
            if (r15 != r0) goto L_0x0172
            java.util.List r0 = r2.A00
            r0.remove(r13)
        L_0x0172:
            r0 = r16
            int r0 = r0.A01
            int r15 = r14.A01
            if (r0 < r15) goto L_0x01ad
            java.util.List r0 = r2.A00
            r0.add(r13, r14)
        L_0x017f:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x01d8
            int r13 = r10.A03
            r0 = -1
            if (r13 != r0) goto L_0x01d8
            if (r19 != 0) goto L_0x01d6
            int r13 = r10.A04
            X.0R1[] r14 = r9.A0J
            r0 = 0
            r0 = r14[r0]
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r8) goto L_0x01b6
            int r16 = r0.A02(r14)
            r15 = 1
        L_0x019a:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d8
            X.0R1[] r0 = r9.A0J
            r0 = r0[r15]
            int r13 = r0.A02(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01ce
            int r15 = r15 + 1
            goto L_0x019a
        L_0x01ad:
            int r13 = r13 + 1
            goto L_0x015c
        L_0x01b0:
            java.util.List r0 = r2.A00
            r0.add(r14)
            goto L_0x017f
        L_0x01b6:
            int r16 = r0.A03(r14)
            r15 = 1
        L_0x01bb:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d8
            X.0R1[] r0 = r9.A0J
            r0 = r0[r15]
            int r13 = r0.A03(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01ce
            int r15 = r15 + 1
            goto L_0x01bb
        L_0x01ce:
            X.0Zh r0 = r2.A01(r3)
            if (r0 == 0) goto L_0x01d6
            r0.A02 = r8
        L_0x01d6:
            r9.A0C = r8
        L_0x01d8:
            int r2 = r10.A04
            boolean r0 = r4.A01
            if (r2 != r8) goto L_0x01f4
            if (r0 == 0) goto L_0x01ee
            int r2 = r9.A06
        L_0x01e2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0209
            X.0R1[] r0 = r9.A0J
            r0 = r0[r2]
            r0.A0B(r5)
            goto L_0x01e2
        L_0x01ee:
            X.0R1 r0 = r4.A00
            r0.A0B(r5)
            goto L_0x0209
        L_0x01f4:
            if (r0 == 0) goto L_0x0204
            int r2 = r9.A06
        L_0x01f8:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0209
            X.0R1[] r0 = r9.A0J
            r0 = r0[r2]
            r0.A0C(r5)
            goto L_0x01f8
        L_0x0204:
            X.0R1 r0 = r4.A00
            r0.A0C(r5)
        L_0x0209:
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x0251
            r0 = r18
            if (r0 != r8) goto L_0x0251
            boolean r0 = r4.A01
            X.0Uc r13 = r9.A08
            int r3 = r13.A02()
            if (r0 != 0) goto L_0x0229
            int r2 = r9.A06
            int r2 = r2 - r8
            int r0 = r1.A04
            int r2 = r2 - r0
            int r0 = r9.A05
            int r2 = r2 * r0
            int r3 = r3 - r2
        L_0x0229:
            int r0 = r13.A07(r5)
            int r2 = r3 - r0
        L_0x022f:
            X.C06440Xs.A05(r5, r2, r12, r3, r11)
        L_0x0232:
            boolean r0 = r4.A01
            int r11 = r7.A04
            if (r0 == 0) goto L_0x0275
            r3 = 0
        L_0x0239:
            int r0 = r9.A06
            if (r3 >= r0) goto L_0x0278
            X.0R1[] r2 = r9.A0J
            r0 = r2[r3]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024e
            r0 = r2[r3]
            r9.A1Z(r0, r11, r6)
        L_0x024e:
            int r3 = r3 + 1
            goto L_0x0239
        L_0x0251:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0268
            X.0Uc r3 = r9.A08
            int r2 = r3.A04()
        L_0x025b:
            int r3 = r3.A07(r5)
            int r3 = r3 + r2
            r0 = r18
            if (r0 == r8) goto L_0x022f
            X.C06440Xs.A05(r5, r12, r2, r11, r3)
            goto L_0x0232
        L_0x0268:
            int r2 = r1.A04
            int r0 = r9.A05
            int r2 = r2 * r0
            X.0Uc r3 = r9.A08
            int r0 = r3.A04()
            int r2 = r2 + r0
            goto L_0x025b
        L_0x0275:
            r9.A1Z(r1, r11, r6)
        L_0x0278:
            r0 = r22
            r9.A1V(r7, r0)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0290
            boolean r0 = r5.hasFocusable()
            if (r0 == 0) goto L_0x0290
            boolean r0 = r4.A01
            java.util.BitSet r2 = r9.A0B
            if (r0 == 0) goto L_0x0294
            r2.clear()
        L_0x0290:
            r2 = 1
            r12 = 0
            goto L_0x0050
        L_0x0294:
            int r1 = r1.A04
            r0 = 0
            r2.set(r1, r0)
            goto L_0x0290
        L_0x029b:
            int r13 = r9.A03
            int r12 = r9.A04
            int r11 = r9.A0B()
            int r0 = r9.A0C()
            int r11 = r11 + r0
            int r0 = r4.width
            int r11 = X.C06440Xs.A02(r13, r12, r11, r0, r8)
            int r0 = r9.A00
            r9.A1U(r5, r11, r0)
            goto L_0x00c3
        L_0x02b5:
            if (r0 != r8) goto L_0x02c3
            int r13 = r9.A05
            int r11 = r9.A04
            int r0 = r4.width
            int r14 = X.C06440Xs.A02(r13, r11, r12, r0, r12)
            goto L_0x00ad
        L_0x02c3:
            int r14 = r9.A03
            int r13 = r9.A04
            int r11 = r9.A0B()
            int r0 = r9.A0C()
            int r11 = r11 + r0
            int r0 = r4.width
            int r14 = X.C06440Xs.A02(r14, r13, r11, r0, r8)
            int r13 = r9.A05
            int r11 = r9.A01
            int r0 = r4.height
            int r0 = X.C06440Xs.A02(r13, r11, r12, r0, r12)
            goto L_0x00c0
        L_0x02e2:
            r9.A0i(r5, r12, r12)
            goto L_0x00a1
        L_0x02e7:
            r19 = 1
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02fc
            X.0R1[] r0 = r9.A0J
            r1 = r0[r12]
        L_0x02f1:
            r2.A02(r3)
            int[] r11 = r2.A01
            int r0 = r1.A04
            r11[r3] = r0
            goto L_0x0097
        L_0x02fc:
            int r0 = r10.A04
            boolean r0 = r9.A1b(r0)
            if (r0 == 0) goto L_0x032c
            int r13 = r9.A06
            int r13 = r13 - r8
            r11 = -1
            r18 = -1
        L_0x030a:
            int r0 = r10.A04
            r1 = 0
            if (r0 != r8) goto L_0x0332
            int r17 = r21.A04()
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x0316:
            if (r13 == r11) goto L_0x02f1
            X.0R1[] r0 = r9.A0J
            r14 = r0[r13]
            r0 = r17
            int r15 = r14.A02(r0)
            r0 = r16
            if (r15 >= r0) goto L_0x0329
            r1 = r14
            r16 = r15
        L_0x0329:
            int r13 = r13 + r18
            goto L_0x0316
        L_0x032c:
            int r11 = r9.A06
            r13 = 0
            r18 = 1
            goto L_0x030a
        L_0x0332:
            int r17 = r21.A02()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0338:
            if (r13 == r11) goto L_0x02f1
            X.0R1[] r0 = r9.A0J
            r14 = r0[r13]
            r0 = r17
            int r15 = r14.A03(r0)
            r0 = r16
            if (r15 <= r0) goto L_0x034b
            r1 = r14
            r16 = r15
        L_0x034b:
            int r13 = r13 + r18
            goto L_0x0338
        L_0x034e:
            int r20 = r21.A04()
            goto L_0x004f
        L_0x0354:
            if (r2 != 0) goto L_0x035b
            r0 = r22
            r9.A1V(r7, r0)
        L_0x035b:
            int r1 = r7.A04
            r0 = -1
            if (r1 != r0) goto L_0x0376
            int r0 = r21.A04()
            int r0 = r9.A1J(r0)
            int r1 = r21.A04()
        L_0x036c:
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0375
            int r0 = r10.A00
            int r12 = java.lang.Math.min(r0, r1)
        L_0x0375:
            return r12
        L_0x0376:
            int r0 = r21.A02()
            int r1 = r9.A1I(r0)
            int r0 = r21.A02()
            goto L_0x036c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1K(X.0Ny, X.0Qz, X.0Q1):int");
    }

    public View A1O(boolean z) {
        C05590Uc r7 = this.A07;
        int A042 = r7.A04();
        int A022 = r7.A02();
        View view = null;
        for (int A082 = A08() - 1; A082 >= 0; A082--) {
            View A0Q = A0Q(A082);
            int A092 = r7.A09(A0Q);
            int A062 = r7.A06(A0Q);
            if (A062 > A042 && A092 < A022) {
                if (A062 <= A022 || !z) {
                    return A0Q;
                }
                if (view == null) {
                    view = A0Q;
                }
            }
        }
        return view;
    }

    public View A1P(boolean z) {
        C05590Uc r8 = this.A07;
        int A042 = r8.A04();
        int A022 = r8.A02();
        int A082 = A08();
        View view = null;
        for (int i = 0; i < A082; i++) {
            View A0Q = A0Q(i);
            int A092 = r8.A09(A0Q);
            if (r8.A06(A0Q) > A042 && A092 < A022) {
                if (A092 >= A042 || !z) {
                    return A0Q;
                }
                if (view == null) {
                    view = A0Q;
                }
            }
        }
        return view;
    }

    public final void A1Q() {
        boolean z;
        if (this.A02 == 1 || !AnonymousClass0YH.A08(this.A07)) {
            z = this.A0F;
        } else {
            z = !this.A0F;
        }
        this.A0G = z;
    }

    public final void A1S(int i) {
        C04370Ny r3 = this.A0L;
        r3.A04 = i;
        int i2 = 1;
        if (this.A0G != AnonymousClass000.A1U(i, -1)) {
            i2 = -1;
        }
        r3.A03 = i2;
    }

    public final void A1T(int i, int i2, int i3) {
        int A1G;
        int i4;
        int i5;
        int A1H;
        if (this.A0G) {
            A1G = A1H();
        } else {
            A1G = A1G();
        }
        if (i3 == 8) {
            i4 = i2 + 1;
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
            }
            i5 = i;
        } else {
            i4 = i + i2;
            i5 = i;
        }
        C04650Qc r2 = this.A09;
        r2.A04(i5);
        if (i3 == 1) {
            r2.A05(i, i2);
        } else if (i3 == 2) {
            r2.A06(i, i2);
        } else if (i3 == 8) {
            r2.A06(i, 1);
            r2.A05(i2, 1);
        }
        if (i4 > A1G) {
            if (this.A0G) {
                A1H = A1G();
            } else {
                A1H = A1H();
            }
            if (i5 <= A1H) {
                A0V();
            }
        }
    }

    public final void A1U(View view, int i, int i2) {
        Rect rect = this.A0K;
        A0j(view, rect);
        C002102g A0Y = AnonymousClass001.A0Y(view);
        int A002 = A00(i, A0Y.leftMargin + rect.left, A0Y.rightMargin + rect.right);
        int A003 = A00(i2, A0Y.topMargin + rect.top, A0Y.bottomMargin + rect.bottom);
        if (A1E(view, A0Y, A002, A003)) {
            view.measure(A002, A003);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == -1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1V(X.C04370Ny r8, X.C04870Qz r9) {
        /*
            r7 = this;
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0129
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0129
            int r2 = r8.A00
            r1 = -1
            int r0 = r8.A04
            if (r2 != 0) goto L_0x0072
            if (r0 != r1) goto L_0x0126
        L_0x0011:
            int r1 = r8.A02
        L_0x0013:
            int r4 = r7.A08()
            r3 = 1
            int r4 = r4 - r3
        L_0x0019:
            if (r4 < 0) goto L_0x0129
            android.view.View r2 = r7.A0Q(r4)
            X.0Uc r5 = r7.A07
            int r0 = r5.A09(r2)
            if (r0 < r1) goto L_0x0129
            int r0 = r5.A0B(r2)
            if (r0 < r1) goto L_0x0129
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            X.09Y r5 = (X.AnonymousClass09Y) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x005a
            r6 = 0
            r5 = 0
        L_0x0039:
            int r0 = r7.A06
            if (r5 >= r0) goto L_0x004c
            X.0R1[] r0 = r7.A0J
            r0 = r0[r5]
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            int r5 = r5 + 1
            goto L_0x0039
        L_0x004c:
            int r0 = r7.A06
            if (r6 >= r0) goto L_0x0069
            X.0R1[] r0 = r7.A0J
            r0 = r0[r6]
            r0.A09()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            X.0R1 r0 = r5.A00
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            X.0R1 r0 = r5.A00
            r0.A09()
        L_0x0069:
            r7.A0g(r2)
            r9.A06(r2)
            int r4 = r4 + -1
            goto L_0x0019
        L_0x0072:
            if (r0 != r1) goto L_0x00a0
            int r3 = r8.A05
            X.0R1[] r1 = r7.A0J
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A03(r3)
            r1 = 1
        L_0x0080:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x0092
            X.0R1[] r0 = r7.A0J
            r0 = r0[r1]
            int r0 = r0.A03(r3)
            if (r0 <= r2) goto L_0x008f
            r2 = r0
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0092:
            int r3 = r3 - r2
            if (r3 < 0) goto L_0x0011
            int r1 = r8.A02
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r3, r0)
            int r1 = r1 - r0
            goto L_0x0013
        L_0x00a0:
            int r3 = r8.A02
            X.0R1[] r1 = r7.A0J
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A02(r3)
            r1 = 1
        L_0x00ac:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x00be
            X.0R1[] r0 = r7.A0J
            r0 = r0[r1]
            int r0 = r0.A02(r3)
            if (r0 >= r2) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00be:
            int r0 = r8.A02
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0126
            int r1 = r8.A05
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + r1
        L_0x00cc:
            int r1 = r7.A08()
            if (r1 <= 0) goto L_0x0129
            r5 = 0
            android.view.View r3 = r7.A0Q(r5)
            X.0Uc r2 = r7.A07
            int r1 = r2.A06(r3)
            if (r1 > r0) goto L_0x0129
            int r1 = r2.A0A(r3)
            if (r1 > r0) goto L_0x0129
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.09Y r2 = (X.AnonymousClass09Y) r2
            boolean r1 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x0112
            r2 = 0
        L_0x00f1:
            int r1 = r7.A06
            if (r2 >= r1) goto L_0x0104
            X.0R1[] r1 = r7.A0J
            r1 = r1[r2]
            java.util.ArrayList r1 = r1.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0104:
            int r1 = r7.A06
            if (r5 >= r1) goto L_0x011f
            X.0R1[] r1 = r7.A0J
            r1 = r1[r5]
            r1.A0A()
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0112:
            X.0R1 r2 = r2.A00
            java.util.ArrayList r1 = r2.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            r2.A0A()
        L_0x011f:
            r7.A0g(r3)
            r9.A06(r3)
            goto L_0x00cc
        L_0x0126:
            int r0 = r8.A05
            goto L_0x00cc
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1V(X.0Ny, X.0Qz):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0164, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03aa, code lost:
        if (A1a() != false) goto L_0x03ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1W(X.C04870Qz r12, X.AnonymousClass0Q1 r13, boolean r14) {
        /*
            r11 = this;
            X.0Ns r9 = r11.A0M
            X.0Zl r2 = r11.A0A
            r1 = -1
            if (r2 != 0) goto L_0x000b
            int r0 = r11.A03
            if (r0 == r1) goto L_0x0018
        L_0x000b:
            int r0 = r13.A00()
            if (r0 != 0) goto L_0x0018
            r11.A0s(r12)
            r9.A00()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r9.A04
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0025
            r6 = 0
            if (r2 == 0) goto L_0x00dd
        L_0x0025:
            r6 = 1
            r9.A00()
            X.0Zl r3 = r11.A0A
            if (r3 == 0) goto L_0x00b1
            int r2 = r3.A02
            if (r2 <= 0) goto L_0x0075
            int r0 = r11.A06
            if (r2 != r0) goto L_0x0066
            r4 = 0
        L_0x0036:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x0075
            X.0R1[] r0 = r11.A0J
            r0 = r0[r4]
            r0.A08()
            X.0Zl r2 = r11.A0A
            int[] r0 = r2.A09
            r3 = r0[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x0056
            boolean r2 = r2.A05
            X.0Uc r0 = r11.A07
            if (r2 == 0) goto L_0x0061
            int r0 = r0.A02()
        L_0x0055:
            int r3 = r3 + r0
        L_0x0056:
            X.0R1[] r0 = r11.A0J
            r0 = r0[r4]
            r0.A01 = r3
            r0.A00 = r3
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0061:
            int r0 = r0.A04()
            goto L_0x0055
        L_0x0066:
            r0 = 0
            r3.A09 = r0
            r3.A02 = r8
            r3.A01 = r8
            r3.A08 = r0
            r3.A04 = r0
            int r0 = r3.A03
            r3.A00 = r0
        L_0x0075:
            X.0Zl r2 = r11.A0A
            boolean r0 = r2.A06
            r11.A0E = r0
            boolean r3 = r2.A07
            r0 = 0
            r11.A16(r0)
            X.0Zl r2 = r11.A0A
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.A07
            if (r0 == r3) goto L_0x008b
            r2.A07 = r3
        L_0x008b:
            r11.A0F = r3
            r11.A0V()
            r11.A1Q()
            X.0Zl r3 = r11.A0A
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00ae
            r11.A03 = r0
            boolean r0 = r3.A05
        L_0x009d:
            r9.A03 = r0
            int r0 = r3.A01
            if (r0 <= r7) goto L_0x00b8
            X.0Qc r2 = r11.A09
            int[] r0 = r3.A08
            r2.A01 = r0
            java.util.List r0 = r3.A04
            r2.A00 = r0
            goto L_0x00b8
        L_0x00ae:
            boolean r0 = r11.A0G
            goto L_0x009d
        L_0x00b1:
            r11.A1Q()
            boolean r0 = r11.A0G
            r9.A03 = r0
        L_0x00b8:
            boolean r0 = r13.A08
            r3 = 0
            if (r0 != 0) goto L_0x0134
            int r4 = r11.A03
            if (r4 == r1) goto L_0x0134
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 < 0) goto L_0x0130
            int r0 = r13.A00()
            if (r4 >= r0) goto L_0x0130
            X.0Zl r2 = r11.A0A
            if (r2 == 0) goto L_0x019f
            int r0 = r2.A00
            if (r0 == r1) goto L_0x019f
            int r0 = r2.A02
            if (r0 < r7) goto L_0x019f
            r9.A00 = r5
            r9.A01 = r4
        L_0x00db:
            r9.A04 = r7
        L_0x00dd:
            X.0Zl r0 = r11.A0A
            if (r0 != 0) goto L_0x0103
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0103
            boolean r2 = r9.A03
            boolean r0 = r11.A0D
            if (r2 != r0) goto L_0x00f5
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r2 = X.AnonymousClass0YH.A08(r0)
            boolean r0 = r11.A0E
            if (r2 == r0) goto L_0x0103
        L_0x00f5:
            X.0Qc r2 = r11.A09
            int[] r0 = r2.A01
            if (r0 == 0) goto L_0x00fe
            java.util.Arrays.fill(r0, r1)
        L_0x00fe:
            r0 = 0
            r2.A00 = r0
            r9.A02 = r7
        L_0x0103:
            int r0 = r11.A08()
            if (r0 <= 0) goto L_0x029f
            X.0Zl r0 = r11.A0A
            if (r0 == 0) goto L_0x0111
            int r0 = r0.A02
            if (r0 >= r7) goto L_0x029f
        L_0x0111:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0225
            r4 = 0
        L_0x0116:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x029f
            X.0R1[] r3 = r11.A0J
            r0 = r3[r4]
            r0.A08()
            int r2 = r9.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x012d
            r0 = r3[r4]
            r0.A01 = r2
            r0.A00 = r2
        L_0x012d:
            int r4 = r4 + 1
            goto L_0x0116
        L_0x0130:
            r11.A03 = r1
            r11.A04 = r5
        L_0x0134:
            boolean r0 = r11.A0D
            int r4 = r13.A00()
            if (r0 == 0) goto L_0x0151
            int r0 = r11.A08()
        L_0x0140:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0164
            int r3 = X.C06440Xs.A04(r11, r0)
            if (r3 < 0) goto L_0x0140
            if (r3 >= r4) goto L_0x0140
        L_0x014c:
            r9.A01 = r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x017a
        L_0x0151:
            int r2 = r11.A08()
            r0 = 0
        L_0x0156:
            if (r0 >= r2) goto L_0x0164
            int r3 = X.C06440Xs.A04(r11, r0)
            if (r3 < 0) goto L_0x0161
            if (r3 >= r4) goto L_0x0161
            goto L_0x014c
        L_0x0161:
            int r0 = r0 + 1
            goto L_0x0156
        L_0x0164:
            r3 = 0
            goto L_0x014c
        L_0x0166:
            X.0Uc r3 = r11.A07
            int r2 = r3.A07(r4)
            int r0 = r3.A05()
            if (r2 <= r0) goto L_0x0183
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x017e
            int r0 = r3.A02()
        L_0x017a:
            r9.A00 = r0
            goto L_0x00db
        L_0x017e:
            int r0 = r3.A04()
            goto L_0x017a
        L_0x0183:
            int r2 = r3.A09(r4)
            int r0 = r3.A04()
            int r2 = r2 - r0
            if (r2 >= 0) goto L_0x0190
            int r0 = -r2
            goto L_0x017a
        L_0x0190:
            int r2 = r3.A02()
            int r0 = r3.A06(r4)
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x01c5
            r9.A00 = r5
            goto L_0x00db
        L_0x019f:
            android.view.View r4 = r11.A0P(r4)
            if (r4 == 0) goto L_0x01da
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x01d5
            int r0 = r11.A1H()
        L_0x01ad:
            r9.A01 = r0
            int r0 = r11.A04
            if (r0 == r5) goto L_0x0166
            boolean r0 = r9.A03
            X.0Uc r3 = r11.A07
            if (r0 == 0) goto L_0x01c9
            int r2 = r3.A02()
            int r0 = r11.A04
            int r2 = r2 - r0
            int r0 = r3.A06(r4)
        L_0x01c4:
            int r2 = r2 - r0
        L_0x01c5:
            r9.A00 = r2
            goto L_0x00db
        L_0x01c9:
            int r2 = r3.A04()
            int r0 = r11.A04
            int r2 = r2 + r0
            int r0 = r3.A09(r4)
            goto L_0x01c4
        L_0x01d5:
            int r0 = r11.A1G()
            goto L_0x01ad
        L_0x01da:
            int r2 = r11.A03
            r9.A01 = r2
            int r4 = r11.A04
            if (r4 != r5) goto L_0x0211
            int r0 = r11.A08()
            if (r0 != 0) goto L_0x0204
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x01ed
        L_0x01ec:
            r3 = 1
        L_0x01ed:
            r9.A03 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0Uc r0 = r0.A07
            if (r3 == 0) goto L_0x01ff
            int r0 = r0.A02()
        L_0x01f9:
            r9.A00 = r0
            r9.A02 = r7
            goto L_0x00db
        L_0x01ff:
            int r0 = r0.A04()
            goto L_0x01f9
        L_0x0204:
            int r0 = r11.A1G()
            boolean r2 = X.AnonymousClass001.A1Y(r2, r0)
            boolean r0 = r11.A0G
            if (r2 == r0) goto L_0x01ec
            goto L_0x01ed
        L_0x0211:
            boolean r2 = r9.A03
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0Uc r0 = r0.A07
            if (r2 == 0) goto L_0x021f
            int r0 = r0.A02()
            int r0 = r0 - r4
            goto L_0x01f9
        L_0x021f:
            int r0 = r0.A04()
            int r0 = r0 + r4
            goto L_0x01f9
        L_0x0225:
            if (r6 != 0) goto L_0x0240
            int[] r4 = r9.A05
            if (r4 == 0) goto L_0x0240
            r3 = 0
        L_0x022c:
            int r0 = r11.A06
            if (r3 >= r0) goto L_0x029f
            X.0R1[] r0 = r11.A0J
            r2 = r0[r3]
            r2.A08()
            r0 = r4[r3]
            r2.A01 = r0
            r2.A00 = r0
            int r3 = r3 + 1
            goto L_0x022c
        L_0x0240:
            r5 = 0
        L_0x0241:
            int r0 = r11.A06
            X.0R1[] r6 = r11.A0J
            if (r5 >= r0) goto L_0x027c
            r6 = r6[r5]
            boolean r10 = r11.A0G
            int r4 = r9.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0277
            int r2 = r6.A02(r3)
        L_0x0255:
            r6.A08()
            if (r2 == r3) goto L_0x026d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r6.A05
            X.0Uc r0 = r0.A07
            if (r10 == 0) goto L_0x0270
            int r0 = r0.A02()
            if (r2 < r0) goto L_0x026d
        L_0x0266:
            if (r4 == r3) goto L_0x0269
            int r2 = r2 + r4
        L_0x0269:
            r6.A00 = r2
            r6.A01 = r2
        L_0x026d:
            int r5 = r5 + 1
            goto L_0x0241
        L_0x0270:
            int r0 = r0.A04()
            if (r2 <= r0) goto L_0x0266
            goto L_0x026d
        L_0x0277:
            int r2 = r6.A03(r3)
            goto L_0x0255
        L_0x027c:
            int r5 = r6.length
            int[] r0 = r9.A05
            if (r0 == 0) goto L_0x0284
            int r0 = r0.length
            if (r0 >= r5) goto L_0x028d
        L_0x0284:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0R1[] r0 = r0.A0J
            int r0 = r0.length
            int[] r0 = new int[r0]
            r9.A05 = r0
        L_0x028d:
            r4 = 0
        L_0x028e:
            if (r4 >= r5) goto L_0x029f
            int[] r3 = r9.A05
            r2 = r6[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A03(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x028e
        L_0x029f:
            r11.A0r(r12)
            X.0Ny r3 = r11.A0L
            r3.A07 = r8
            r11.A0C = r8
            X.0Uc r2 = r11.A08
            int r4 = r2.A05()
            int r0 = r11.A06
            int r0 = r4 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r11.A00 = r0
            int r0 = r9.A01
            r11.A1Y(r13, r0)
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0310
            r11.A1S(r1)
            r11.A1K(r3, r12, r13)
            r11.A1S(r7)
        L_0x02d0:
            int r1 = r9.A01
            int r0 = r3.A03
            int r1 = r1 + r0
            r3.A01 = r1
            r11.A1K(r3, r12, r13)
            int r1 = r2.A03()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0347
            int r6 = r11.A08()
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x02e9:
            if (r4 >= r6) goto L_0x031a
            android.view.View r10 = r11.A0Q(r4)
            int r0 = r2.A07(r10)
            float r3 = (float) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x030d
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.09Y r0 = (X.AnonymousClass09Y) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0309
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r0 = r11.A06
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0309:
            float r1 = java.lang.Math.max(r1, r3)
        L_0x030d:
            int r4 = r4 + 1
            goto L_0x02e9
        L_0x0310:
            r11.A1S(r7)
            r11.A1K(r3, r12, r13)
            r11.A1S(r1)
            goto L_0x02d0
        L_0x031a:
            int r4 = r11.A05
            int r0 = r11.A06
            float r0 = (float) r0
            int r1 = X.AnonymousClass001.A07(r1, r0)
            int r3 = r2.A03()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x0333
            int r0 = r2.A05()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0333:
            int r0 = r11.A06
            int r0 = r1 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r11.A00 = r0
            int r0 = r11.A05
            if (r0 != r4) goto L_0x03fd
        L_0x0347:
            int r0 = r11.A08()
            if (r0 <= 0) goto L_0x0383
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x03ca
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r11.A1I(r1)
            if (r0 == r1) goto L_0x036e
            X.0Uc r2 = r11.A07
            int r1 = r2.A02()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x036e
            int r0 = -r1
            int r0 = r11.A1L(r12, r13, r0)
            int r0 = -r0
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x036e
            r2.A0C(r1)
        L_0x036e:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A1J(r0)
            if (r1 == r0) goto L_0x0383
            X.0Uc r0 = r11.A07
            int r0 = r0.A04()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0383
            r11.A1L(r12, r13, r1)
        L_0x0383:
            if (r14 == 0) goto L_0x03c8
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x03c8
            int r0 = r11.A01
            if (r0 == 0) goto L_0x03c8
            int r0 = r11.A08()
            if (r0 <= 0) goto L_0x03c8
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x039d
            android.view.View r0 = r11.A1N()
            if (r0 == 0) goto L_0x03c8
        L_0x039d:
            java.lang.Runnable r1 = r11.A0N
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x03a6
            r0.removeCallbacks(r1)
        L_0x03a6:
            boolean r0 = r11.A1a()
            if (r0 == 0) goto L_0x03c8
        L_0x03ac:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x03b3
            r9.A00()
        L_0x03b3:
            boolean r0 = r9.A03
            r11.A0D = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            r11.A0E = r0
            if (r7 == 0) goto L_0x0017
            r9.A00()
            r11.A1W(r12, r13, r8)
            return
        L_0x03c8:
            r7 = 0
            goto L_0x03ac
        L_0x03ca:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r11.A1J(r0)
            if (r2 == r0) goto L_0x03e7
            X.0Uc r1 = r11.A07
            int r0 = r1.A04()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03e7
            int r0 = r11.A1L(r12, r13, r2)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03e7
            int r0 = -r2
            r1.A0C(r0)
        L_0x03e7:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r11.A1I(r0)
            if (r1 == r0) goto L_0x0383
            X.0Uc r0 = r11.A07
            int r0 = r0.A02()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0383
            int r0 = -r0
            r11.A1L(r12, r13, r0)
            goto L_0x0383
        L_0x03fd:
            if (r5 >= r6) goto L_0x0347
            android.view.View r3 = r11.A0Q(r5)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.09Y r2 = (X.AnonymousClass09Y) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x042e
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x0431
            int r0 = r11.A02
            if (r0 != r7) goto L_0x0431
            int r10 = r11.A06
            int r1 = r10 + -1
            X.0R1 r0 = r2.A00
            int r2 = r0.A04
            int r1 = r1 - r2
            int r1 = -r1
            int r0 = r11.A05
            int r1 = r1 * r0
            int r10 = r10 - r7
            int r10 = r10 - r2
            int r0 = -r10
            int r0 = r0 * r4
            int r1 = r1 - r0
        L_0x042b:
            r3.offsetLeftAndRight(r1)
        L_0x042e:
            int r5 = r5 + 1
            goto L_0x03fd
        L_0x0431:
            X.0R1 r0 = r2.A00
            int r2 = r0.A04
            int r1 = r11.A05
            int r1 = r1 * r2
            int r2 = r2 * r4
            int r0 = r11.A02
            int r1 = r1 - r2
            if (r0 == r7) goto L_0x042b
            r3.offsetTopAndBottom(r1)
            goto L_0x042e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1W(X.0Qz, X.0Q1, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Y(X.AnonymousClass0Q1 r8, int r9) {
        /*
            r7 = this;
            X.0Ny r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A01 = r9
            X.0Qg r0 = r7.A06
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r6 = 1
            if (r0 == 0) goto L_0x0064
            int r1 = r8.A06
            r0 = -1
            if (r1 == r0) goto L_0x0064
            boolean r2 = r7.A0G
            boolean r1 = X.AnonymousClass001.A1Y(r1, r9)
            X.0Uc r0 = r7.A07
            int r5 = r0.A05()
            if (r2 == r1) goto L_0x0065
            r2 = r5
            r5 = 0
        L_0x0029:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x0032
            boolean r1 = r0.A0d
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            X.0Uc r1 = r7.A07
            if (r0 == 0) goto L_0x0059
            int r0 = r1.A04()
            int r0 = r0 - r2
            r4.A05 = r0
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A02 = r0
        L_0x0045:
            r4.A08 = r3
            r4.A07 = r6
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0056
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            r4.A06 = r3
            return
        L_0x0059:
            int r0 = r1.A01()
            int r0 = r0 + r5
            r4.A02 = r0
            int r0 = -r2
            r4.A05 = r0
            goto L_0x0045
        L_0x0064:
            r5 = 0
        L_0x0065:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1Y(X.0Q1, int):void");
    }

    public final void A1Z(AnonymousClass0R1 r5, int i, int i2) {
        int i3 = r5.A02;
        if (i == -1) {
            int i4 = r5.A01;
            if (i4 == Integer.MIN_VALUE) {
                r5.A07();
                i4 = r5.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = r5.A00;
            if (i5 == Integer.MIN_VALUE) {
                r5.A06();
                i5 = r5.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0B.set(r5.A04, false);
    }

    public final boolean A1b(int i) {
        int i2 = this.A02;
        boolean A1U = AnonymousClass000.A1U(i, -1);
        boolean z = this.A0G;
        if (i2 == 0) {
            if (A1U != z) {
                return true;
            }
            return false;
        } else if (AnonymousClass000.A1U(A1U ? 1 : 0, z ? 1 : 0) == AnonymousClass0YH.A08(this.A07)) {
            return true;
        } else {
            return false;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0JZ.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i3 == 0 || i3 == 1) {
            A16((String) null);
            if (i3 != this.A02) {
                this.A02 = i3;
                C05590Uc r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0V();
            }
            A1R(i4);
            A16((String) null);
            C06850Zl r12 = this.A0A;
            if (!(r12 == null || r12.A07 == z)) {
                r12.A07 = z;
            }
            this.A0F = z;
            A0V();
            this.A0L = new C04370Ny();
            this.A07 = C05590Uc.A00(this, this.A02);
            this.A08 = C05590Uc.A00(this, 1 - this.A02);
            return;
        }
        throw AnonymousClass001.A0c("invalid orientation.");
    }

    public int A0G(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        return A1L(r2, r3, i);
    }

    public int A0H(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        return A1L(r2, r3, i);
    }

    public int A0J(AnonymousClass0Q1 r2) {
        return A1M(r2);
    }

    public int A0M(AnonymousClass0Q1 r2) {
        return A1M(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r12.A02 == 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (X.AnonymousClass0YH.A08(r12.A07) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (X.AnonymousClass0YH.A08(r12.A07) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        if (r12.A02 == 1) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0129 A[LOOP:3: B:89:0x0129->B:98:0x0140, LOOP_START, PHI: r5 
      PHI: (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:75:0x0103, B:98:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0R(android.view.View r13, X.C04870Qz r14, X.AnonymousClass0Q1 r15, int r16) {
        /*
            r12 = this;
            int r0 = r12.A08()
            r11 = 0
            if (r0 == 0) goto L_0x0148
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            if (r0 == 0) goto L_0x0148
            android.view.View r3 = r0.A0E(r13)
            if (r3 == 0) goto L_0x0148
            X.0R0 r0 = r12.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0148
            r12.A1Q()
            r2 = -1
            r6 = 1
            r1 = r16
            if (r1 == r6) goto L_0x009a
            r0 = 2
            if (r1 == r0) goto L_0x008d
            r0 = 17
            if (r1 == r0) goto L_0x0088
            r0 = 33
            if (r1 == r0) goto L_0x00a7
            r0 = 66
            if (r1 == r0) goto L_0x0083
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L_0x0148
            int r0 = r12.A02
            if (r0 != r6) goto L_0x0148
        L_0x003b:
            r7 = 1
        L_0x003c:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.09Y r0 = (X.AnonymousClass09Y) r0
            boolean r8 = r0.A01
            X.0R1 r4 = r0.A00
            if (r7 != r6) goto L_0x007e
            int r9 = r12.A1H()
        L_0x004c:
            r12.A1Y(r15, r9)
            r12.A1S(r7)
            X.0Ny r10 = r12.A0L
            int r0 = r10.A03
            int r0 = r0 + r9
            r10.A01 = r0
            X.0Uc r0 = r12.A07
            int r0 = r0.A05()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10.A00 = r0
            r10.A08 = r6
            r5 = 0
            r10.A07 = r5
            r12.A1K(r10, r14, r15)
            boolean r0 = r12.A0G
            r12.A0D = r0
            if (r8 != 0) goto L_0x00ad
            android.view.View r0 = r4.A05(r9, r7)
            if (r0 == 0) goto L_0x00ad
            if (r0 == r3) goto L_0x00ad
            return r0
        L_0x007e:
            int r9 = r12.A1G()
            goto L_0x004c
        L_0x0083:
            int r0 = r12.A02
            if (r0 != 0) goto L_0x0148
            goto L_0x003b
        L_0x0088:
            int r0 = r12.A02
            if (r0 != 0) goto L_0x0148
            goto L_0x00ab
        L_0x008d:
            int r0 = r12.A02
            if (r0 == r6) goto L_0x003b
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x003b
            goto L_0x00ab
        L_0x009a:
            int r0 = r12.A02
            if (r0 == r6) goto L_0x00ab
            androidx.recyclerview.widget.RecyclerView r0 = r12.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x00ab
            goto L_0x003b
        L_0x00a7:
            int r0 = r12.A02
            if (r0 != r6) goto L_0x0148
        L_0x00ab:
            r7 = -1
            goto L_0x003c
        L_0x00ad:
            boolean r0 = r12.A1b(r7)
            if (r0 == 0) goto L_0x00c8
            int r1 = r12.A06
            int r1 = r1 - r6
        L_0x00b6:
            if (r1 < 0) goto L_0x00dd
            X.0R1[] r0 = r12.A0J
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00c5
            if (r0 == r3) goto L_0x00c5
            return r0
        L_0x00c5:
            int r1 = r1 + -1
            goto L_0x00b6
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            int r0 = r12.A06
            if (r1 >= r0) goto L_0x00dd
            X.0R1[] r0 = r12.A0J
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00da
            if (r0 == r3) goto L_0x00da
            return r0
        L_0x00da:
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00dd:
            boolean r0 = r12.A0F
            r1 = r0 ^ 1
            boolean r0 = X.AnonymousClass000.A1U(r7, r2)
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            if (r8 != 0) goto L_0x00ff
            if (r2 == 0) goto L_0x00fa
            int r0 = r4.A00()
        L_0x00f1:
            android.view.View r0 = r12.A0P(r0)
            if (r0 == 0) goto L_0x00ff
            if (r0 == r3) goto L_0x00ff
            return r0
        L_0x00fa:
            int r0 = r4.A01()
            goto L_0x00f1
        L_0x00ff:
            boolean r0 = r12.A1b(r7)
            if (r0 == 0) goto L_0x0129
            int r1 = r12.A06
            int r1 = r1 - r6
        L_0x0108:
            if (r1 < 0) goto L_0x0148
            int r0 = r4.A04
            if (r1 == r0) goto L_0x0126
            X.0R1[] r0 = r12.A0J
            r0 = r0[r1]
            if (r2 == 0) goto L_0x0121
            int r0 = r0.A00()
        L_0x0118:
            android.view.View r0 = r12.A0P(r0)
            if (r0 == 0) goto L_0x0126
            if (r0 == r3) goto L_0x0126
            return r0
        L_0x0121:
            int r0 = r0.A01()
            goto L_0x0118
        L_0x0126:
            int r1 = r1 + -1
            goto L_0x0108
        L_0x0129:
            int r0 = r12.A06
            if (r5 >= r0) goto L_0x0148
            X.0R1[] r0 = r12.A0J
            r0 = r0[r5]
            if (r2 == 0) goto L_0x0143
            int r0 = r0.A00()
        L_0x0137:
            android.view.View r0 = r12.A0P(r0)
            if (r0 == 0) goto L_0x0140
            if (r0 == r3) goto L_0x0140
            return r0
        L_0x0140:
            int r5 = r5 + 1
            goto L_0x0129
        L_0x0143:
            int r0 = r0.A01()
            goto L_0x0137
        L_0x0148:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0R(android.view.View, X.0Qz, X.0Q1, int):android.view.View");
    }

    public void A0W(int i) {
        super.A0W(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass0R1 r2 = this.A0J[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public void A0X(int i) {
        super.A0X(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass0R1 r2 = this.A0J[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public void A0c(Rect rect, int i, int i2) {
        int A012;
        int A013;
        int A0B2 = A0B() + A0C();
        int A0D2 = A0D() + A0A();
        if (this.A02 == 1) {
            A013 = C06440Xs.A01(i2, rect.height() + A0D2, AnonymousClass0YY.A01(this.A07));
            A012 = C06440Xs.A01(i, (this.A05 * this.A06) + A0B2, AnonymousClass0YY.A02(this.A07));
        } else {
            A012 = C06440Xs.A01(i, rect.width() + A0B2, AnonymousClass0YY.A02(this.A07));
            A013 = C06440Xs.A01(i2, (this.A05 * this.A06) + A0D2, AnonymousClass0YY.A01(this.A07));
        }
        this.A07.setMeasuredDimension(A012, A013);
    }

    public void A0l(View view, C05650Ui r10, C04870Qz r11, AnonymousClass0Q1 r12) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass09Y)) {
            super.A0k(view, r10);
            return;
        }
        AnonymousClass09Y r1 = (AnonymousClass09Y) layoutParams;
        if (this.A02 == 0) {
            AnonymousClass0R1 r0 = r1.A00;
            if (r0 == null) {
                i = -1;
            } else {
                i = r0.A04;
            }
            if (r1.A01) {
                i4 = this.A06;
            } else {
                i4 = 1;
            }
            i2 = -1;
            i3 = -1;
        } else {
            i = -1;
            AnonymousClass0R1 r02 = r1.A00;
            if (r02 == null) {
                i2 = -1;
            } else {
                i2 = r02.A04;
            }
            if (r1.A01) {
                i3 = this.A06;
            } else {
                i3 = 1;
            }
            i4 = -1;
        }
        r10.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i2, i3, false, false)));
    }

    public void A0m(AccessibilityEvent accessibilityEvent) {
        super.A0m(accessibilityEvent);
        if (A08() > 0) {
            View A1P = A1P(false);
            View A1O = A1O(false);
            if (A1P != null && A1O != null) {
                int A032 = C06440Xs.A03(A1P);
                int A033 = C06440Xs.A03(A1O);
                if (A032 < A033) {
                    accessibilityEvent.setFromIndex(A032);
                    accessibilityEvent.setToIndex(A033);
                    return;
                }
                accessibilityEvent.setFromIndex(A033);
                accessibilityEvent.setToIndex(A032);
            }
        }
    }

    public void A0z(AnonymousClass0Q1 r3, RecyclerView recyclerView, int i) {
        C011209g r0 = new C011209g(recyclerView.getContext());
        r0.A00 = i;
        A0x(r0);
    }

    public int A1G() {
        if (A08() != 0) {
            return C06440Xs.A04(this, 0);
        }
        return 0;
    }

    public int A1H() {
        int A082 = A08();
        if (A082 == 0) {
            return 0;
        }
        return C06440Xs.A04(this, A082 - 1);
    }

    public int A1L(C04870Qz r5, AnonymousClass0Q1 r6, int i) {
        if (A08() == 0 || i == 0) {
            return 0;
        }
        A1X(r6, i);
        C04370Ny r2 = this.A0L;
        int A1K = A1K(r2, r5, r6);
        if (r2.A00 >= A1K) {
            int i2 = i;
            i = A1K;
            if (i2 < 0) {
                i = -A1K;
            }
        }
        this.A07.A0C(-i);
        this.A0D = this.A0G;
        r2.A00 = 0;
        A1V(r2, r5);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.AnonymousClass0YH.A08(r11.A07) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1N() {
        /*
            r11 = this;
            int r6 = r11.A08()
            r2 = 1
            int r6 = r6 - r2
            int r1 = r11.A06
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r1)
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r2) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r9 = -1
        L_0x0020:
            boolean r0 = r11.A0G
            r4 = -1
            if (r0 != 0) goto L_0x0028
            int r4 = r6 + 1
            r6 = 0
        L_0x0028:
            if (r6 >= r4) goto L_0x002b
            r10 = 1
        L_0x002b:
            if (r6 == r4) goto L_0x00d8
            android.view.View r3 = r11.A0Q(r6)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.09Y r7 = (X.AnonymousClass09Y) r7
            X.0R1 r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0091
            X.0R1 r8 = r7.A00
            boolean r0 = r11.A0G
            r2 = 0
            if (r0 == 0) goto L_0x0074
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0053
            r8.A06()
            int r1 = r8.A00
        L_0x0053:
            X.0Uc r0 = r11.A07
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            int r0 = r1.size()
            int r2 = r0 + -1
        L_0x0063:
            android.view.View r0 = X.AnonymousClass001.A0S(r1, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.09Y r0 = (X.AnonymousClass09Y) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            return r3
        L_0x0074:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x007f
            r8.A07()
            int r1 = r8.A01
        L_0x007f:
            X.0Uc r0 = r11.A07
            int r0 = r0.A04()
            if (r1 <= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            goto L_0x0063
        L_0x008a:
            X.0R1 r0 = r7.A00
            int r0 = r0.A04
            r5.clear(r0)
        L_0x0091:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d5
            int r0 = r6 + r10
            if (r0 == r4) goto L_0x00d5
            android.view.View r2 = r11.A0Q(r0)
            boolean r1 = r11.A0G
            X.0Uc r0 = r11.A07
            if (r1 == 0) goto L_0x00ae
            int r1 = r0.A06(r3)
            int r0 = r0.A06(r2)
            if (r1 >= r0) goto L_0x00b9
            return r3
        L_0x00ae:
            int r1 = r0.A09(r3)
            int r0 = r0.A09(r2)
            if (r1 <= r0) goto L_0x00b9
            return r3
        L_0x00b9:
            if (r1 != r0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            X.09Y r2 = (X.AnonymousClass09Y) r2
            X.0R1 r0 = r7.A00
            int r1 = r0.A04
            X.0R1 r0 = r2.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            boolean r1 = X.AnonymousClass001.A1V(r1)
            boolean r0 = X.AnonymousClass001.A1V(r9)
            if (r1 == r0) goto L_0x00d5
            return r3
        L_0x00d5:
            int r6 = r6 + r10
            goto L_0x002b
        L_0x00d8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1N():android.view.View");
    }

    public boolean A1a() {
        int A1G;
        int A1H;
        int i;
        int i2;
        if (!(A08() == 0 || this.A01 == 0 || !this.A0B)) {
            if (this.A0G) {
                A1G = A1H();
                A1H = A1G();
            } else {
                A1G = A1G();
                A1H = A1H();
            }
            if (A1G == 0 && A1N() != null) {
                C04650Qc r2 = this.A09;
                int[] iArr = r2.A01;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                r2.A00 = null;
            } else if (this.A0C) {
                int i3 = 1;
                if (this.A0G) {
                    i3 = -1;
                }
                C04650Qc r8 = this.A09;
                int i4 = A1H + 1;
                List list = r8.A00;
                if (list != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        C06810Zh A002 = C04650Qc.A00(r8, i5);
                        int i6 = A002.A01;
                        if (i6 >= i4) {
                            break;
                        } else if (i6 < A1G || (A002.A00 != i3 && !A002.A02)) {
                            i5++;
                        } else {
                            int i7 = -i3;
                            List list2 = r8.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        C06810Zh A003 = C04650Qc.A00(r8, i8);
                                        i2 = A003.A01;
                                        if (i2 >= i6) {
                                            break;
                                        } else if (i2 < A1G || !(i7 == 0 || A003.A00 == i7 || A003.A02)) {
                                            i8++;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i = i2 + 1;
                                r8.A03(i);
                            }
                            i = A002.A01;
                            r8.A03(i);
                        }
                    }
                }
                this.A0C = false;
                r8.A03(i4);
            }
            this.A0D = true;
            A0V();
            return true;
        }
        return false;
    }

    public PointF AzL(int i) {
        int i2 = -1;
        if (A08() != 0 ? AnonymousClass001.A1Y(i, A1G()) == this.A0G : this.A0G) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i2;
        return pointF;
    }

    public boolean A1F(C002102g r2) {
        return r2 instanceof AnonymousClass09Y;
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.A02 = i2;
        A1R(i);
        this.A0L = new C04370Ny();
        this.A07 = C05590Uc.A00(this, this.A02);
        this.A08 = C05590Uc.A00(this, 1 - this.A02);
    }
}
