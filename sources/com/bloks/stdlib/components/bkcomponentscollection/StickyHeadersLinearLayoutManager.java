package com.bloks.stdlib.components.bkcomponentscollection;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass09M;
import X.AnonymousClass0Q1;
import X.AnonymousClass0R6;
import X.AnonymousClass8UF;
import X.C04870Qz;
import X.C05570Ua;
import X.C06750Zb;
import X.C125336Hk;
import X.C162457s7;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public View A03;
    public C125336Hk A04;
    public final AnonymousClass09M A05 = new AnonymousClass09M(this);
    public final List A06 = AnonymousClass001.A0s();

    public int A0G(C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(r4, 2);
        A1n();
        int A0G = super.A0G(r3, r4, i);
        A1m();
        if (A0G != 0) {
            A1s(r3, false);
        }
        return A0G;
    }

    public int A0H(C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        C162457s7.A0J(r3, 1);
        C162457s7.A0J(r4, 2);
        A1n();
        int A0H = super.A0H(r3, r4, i);
        A1m();
        if (A0H != 0) {
            A1s(r3, false);
        }
        return A0H;
    }

    public int A0I(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1N = A1N(r2);
        A1m();
        return A1N;
    }

    public int A0J(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1O = A1O(r2);
        A1m();
        return A1O;
    }

    public int A0K(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1P = A1P(r2);
        A1m();
        return A1P;
    }

    public int A0L(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1N = A1N(r2);
        A1m();
        return A1N;
    }

    public int A0M(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1O = A1O(r2);
        A1m();
        return A1O;
    }

    public int A0N(AnonymousClass0Q1 r2) {
        C162457s7.A0J(r2, 0);
        A1n();
        int A1P = A1P(r2);
        A1m();
        return A1P;
    }

    public View A0R(View view, C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        C162457s7.A0J(view, 0);
        C162457s7.A0J(r3, 2);
        C162457s7.A0J(r4, 3);
        A1n();
        View A0R = super.A0R(view, r3, r4, i);
        A1m();
        return A0R;
    }

    public void A0v(C04870Qz r3, AnonymousClass0Q1 r4) {
        C162457s7.A0J(r3, 0);
        C162457s7.A0J(r4, 1);
        A1n();
        super.A0v(r3, r4);
        A1m();
        if (!r4.A08) {
            A1s(r3, true);
        }
    }

    public void A1Y(int i, int i2) {
        int width;
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        int A1l = A1l(i);
        if (A1l != -1 && A1j(i) == -1) {
            int i3 = i - 1;
            if (A1j(i3) != -1) {
                super.A1Y(i3, i2);
                return;
            }
            View view = this.A03;
            if (view == null || A1l != A1j(this.A02)) {
                this.A01 = i;
                this.A00 = i2;
            } else {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = 0;
                }
                if (this.A01 == 1) {
                    width = view.getHeight();
                } else {
                    width = view.getWidth();
                }
                i2 += width;
            }
        }
        super.A1Y(i, i2);
    }

    public final void A1o(View view) {
        A0f(view);
        if (this.A01 == 1) {
            view.layout(A0B(), 0, this.A03 - A0C(), view.getMeasuredHeight());
        } else {
            view.layout(0, A0D(), view.getMeasuredWidth(), this.A00 - A0A());
        }
    }

    public final void A1r(C04870Qz r5, int i) {
        View A012 = r5.A01(i);
        C162457s7.A0D(A012);
        A0i(A012, -1, false);
        A1o(A012);
        ViewParent parent = A012.getParent();
        RecyclerView recyclerView = this.A07;
        if (parent != recyclerView || recyclerView.indexOfChild(A012) == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("View should be fully attached to be ignored");
            throw AnonymousClass000.A0F(this.A07.A0I(), A0o);
        }
        C05570Ua r2 = AnonymousClass001.A0Y(A012).A00;
        r2.A00 = 128 | r2.A00;
        this.A07.A11.A02(r2);
        this.A03 = A012;
        this.A02 = i;
    }

    public void A0Z(int i) {
        A1Y(i, Integer.MIN_VALUE);
    }

    public void A0e(Parcelable parcelable) {
        if (parcelable instanceof C06750Zb) {
            C06750Zb r2 = (C06750Zb) parcelable;
            this.A01 = r2.A01;
            this.A00 = r2.A00;
            parcelable = r2.A02;
        }
        super.A0e(parcelable);
    }

    public void A10(RecyclerView recyclerView) {
        A1p(recyclerView.A0N);
    }

    public final int A1j(int i) {
        int A0k = AnonymousClass8UF.A0l(Integer.valueOf(i), this.A06, this.A06.size());
        if (A0k < 0) {
            return -1;
        }
        return A0k;
    }

    public final int A1k(int i) {
        List list = this.A06;
        int A032 = AnonymousClass002.A03(list);
        int i2 = 0;
        while (i2 <= A032) {
            int i3 = (i2 + A032) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (AnonymousClass000.A09(list, i4) >= i) {
                    A032 = i4;
                }
            }
            if (AnonymousClass000.A09(list, i3) >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    public final int A1l(int i) {
        List list = this.A06;
        int A032 = AnonymousClass002.A03(list);
        int i2 = 0;
        while (i2 <= A032) {
            int i3 = (i2 + A032) / 2;
            if (AnonymousClass000.A09(list, i3) > i) {
                A032 = i3 - 1;
            } else {
                if (i3 < AnonymousClass002.A03(list)) {
                    i2 = i3 + 1;
                    if (AnonymousClass000.A09(list, i2) <= i) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public final void A1m() {
        View view = this.A03;
        if (view != null) {
            A0h(view, -1);
        }
    }

    public final void A1n() {
        int A042;
        View view = this.A03;
        if (view != null && (A042 = this.A05.A04(view)) >= 0) {
            this.A05.A06(A042);
        }
    }

    public final void A1p(AnonymousClass0R6 r3) {
        C125336Hk r0 = this.A04;
        if (r0 != null) {
            r0.A01.unregisterObserver(this.A05);
        }
        if (r3 instanceof C125336Hk) {
            this.A04 = (C125336Hk) r3;
            AnonymousClass09M r02 = this.A05;
            r3.BiZ(r02);
            r02.A05();
            return;
        }
        this.A04 = null;
        this.A06.clear();
    }

    public final void A1q(C04870Qz r5) {
        View view = this.A03;
        if (view != null) {
            this.A03 = null;
            this.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C05570Ua r2 = AnonymousClass001.A0Y(view).A00;
            r2.A00 &= -129;
            r2.A03();
            r2.A00 = 4 | r2.A00;
            A0g(view);
            if (r5 != null) {
                r5.A06(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ec, code lost:
        if ((r5 + r0) >= 0.0f) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        if (r5 > ((float) r0)) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0058 A[EDGE_INSN: B:145:0x0058->B:24:0x0058 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0236 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1s(X.C04870Qz r20, boolean r21) {
        /*
            r19 = this;
            r3 = r19
            java.util.List r7 = r3.A06
            int r6 = r7.size()
            int r5 = r3.A08()
            r13 = r20
            if (r6 <= 0) goto L_0x0240
            if (r5 <= 0) goto L_0x0240
            r2 = 0
        L_0x0013:
            r12 = 0
            r1 = -1
            if (r2 >= r5) goto L_0x0240
            android.view.View r11 = r3.A0Q(r2)
            if (r11 == 0) goto L_0x023d
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
        L_0x0021:
            boolean r0 = r4 instanceof X.C002102g
            if (r0 == 0) goto L_0x023a
            X.02g r4 = (X.C002102g) r4
        L_0x0027:
            if (r11 == 0) goto L_0x0236
            if (r4 == 0) goto L_0x0236
            X.0Ua r8 = r4.A00
            int r0 = r8.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0236
            int r0 = r8.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0236
            int r10 = r3.A01
            r9 = 0
            r8 = 1
            boolean r0 = r3.A09
            if (r10 != r8) goto L_0x0204
            if (r0 == 0) goto L_0x0218
            int r0 = r11.getTop()
            float r8 = (float) r0
            float r0 = r11.getTranslationY()
            float r8 = r8 + r0
            int r0 = r3.A00
        L_0x0053:
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0236
        L_0x0058:
            X.0Ua r0 = r4.A00
            int r8 = r0.A01()
            if (r8 == r1) goto L_0x0240
            int r0 = r3.A1l(r8)
            if (r0 == r1) goto L_0x0201
            int r4 = X.AnonymousClass000.A09(r7, r0)
        L_0x006a:
            int r0 = r0 + 1
            if (r6 <= r0) goto L_0x01fe
            int r6 = X.AnonymousClass000.A09(r7, r0)
        L_0x0072:
            if (r4 == r1) goto L_0x0240
            if (r4 != r8) goto L_0x0091
            int r9 = r3.A01
            r7 = 0
            r5 = 1
            boolean r0 = r3.A09
            if (r9 != r5) goto L_0x01d6
            if (r0 == 0) goto L_0x01cc
            int r0 = r11.getBottom()
            float r5 = (float) r0
            float r0 = r11.getTranslationY()
            float r5 = r5 - r0
            int r0 = r3.A00
        L_0x008c:
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0240
        L_0x0091:
            int r0 = r4 + 1
            if (r6 == r0) goto L_0x0240
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x01c9
            X.02g r0 = X.AnonymousClass001.A0Y(r0)
            X.0Ua r0 = r0.A00
            int r0 = r0.A02
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x00a5:
            X.6Hk r0 = r3.A04
            if (r0 == 0) goto L_0x01c6
            int r0 = r0.getItemViewType(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00b1:
            boolean r0 = X.C162457s7.A0P(r5, r0)
            if (r0 != 0) goto L_0x00ba
            r3.A1q(r13)
        L_0x00ba:
            android.view.View r0 = r3.A03
            if (r0 != 0) goto L_0x00c1
            r3.A1r(r13, r4)
        L_0x00c1:
            if (r21 != 0) goto L_0x0159
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x0159
            int r0 = X.C06440Xs.A03(r0)
            if (r0 != r4) goto L_0x0159
        L_0x00cd:
            if (r6 == r1) goto L_0x00e0
            int r6 = r6 - r8
            int r2 = r2 + r6
            android.view.View r1 = r3.A0Q(r2)
            android.view.View r0 = r3.A03
            boolean r0 = X.C162457s7.A0P(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e0
            r12 = r1
        L_0x00e0:
            android.view.View r4 = r3.A03
            if (r4 == 0) goto L_0x0141
            int r1 = r3.A01
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L_0x0119
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x00f6
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 == 0) goto L_0x00fe
        L_0x00f6:
            int r1 = r3.A03
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r2 = r2 + r1
        L_0x00fe:
            if (r12 == 0) goto L_0x0119
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0150
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 != 0) goto L_0x0150
            int r1 = r12.getLeft()
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r2 = java.lang.Math.min(r1, r2)
        L_0x0119:
            float r0 = (float) r2
            r4.setTranslationX(r0)
            int r1 = r3.A01
            r0 = 1
            r2 = 0
            if (r1 != r0) goto L_0x013d
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x012f
            int r1 = r3.A00
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r2 = r2 + r1
        L_0x012f:
            if (r12 == 0) goto L_0x013d
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0142
            int r0 = r12.getBottom()
            int r2 = java.lang.Math.max(r0, r2)
        L_0x013d:
            float r0 = (float) r2
            r4.setTranslationY(r0)
        L_0x0141:
            return
        L_0x0142:
            int r1 = r12.getTop()
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r2 = java.lang.Math.min(r1, r2)
            goto L_0x013d
        L_0x0150:
            int r0 = r12.getRight()
            int r2 = java.lang.Math.max(r0, r2)
            goto L_0x0119
        L_0x0159:
            android.view.View r7 = r3.A03
            if (r7 == 0) goto L_0x00cd
            X.02g r0 = X.AnonymousClass001.A0Y(r7)
            X.0Ua r14 = r0.A00
            if (r14 == 0) goto L_0x0278
            androidx.recyclerview.widget.RecyclerView r5 = r13.A08
            X.0ec r9 = r5.A0J
            r0 = 0
            int r15 = r9.A00(r4, r0)
            if (r15 < 0) goto L_0x0248
            X.0R6 r0 = r5.A0N
            int r0 = r0.A0G()
            if (r15 >= r0) goto L_0x0248
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r4
            r13.A0B(r14, r15, r16, r17)
            android.view.View r10 = r14.A0H
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            if (r9 != 0) goto L_0x01b8
            android.view.ViewGroup$LayoutParams r9 = r5.generateDefaultLayoutParams()
        L_0x018e:
            X.02g r9 = (X.C002102g) r9
            r10.setLayoutParams(r9)
        L_0x0193:
            r5 = 1
            r9.A01 = r5
            r9.A00 = r14
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto L_0x019f
            r5 = 0
        L_0x019f:
            r9.A02 = r5
            r3.A02 = r4
            r3.A1o(r7)
            int r0 = r3.A01
            if (r0 == r1) goto L_0x00cd
            android.view.ViewTreeObserver r4 = r7.getViewTreeObserver()
            X.0aV r0 = new X.0aV
            r0.<init>(r4, r3)
            r4.addOnGlobalLayoutListener(r0)
            goto L_0x00cd
        L_0x01b8:
            boolean r0 = r5.checkLayoutParams(r9)
            if (r0 != 0) goto L_0x01c3
            android.view.ViewGroup$LayoutParams r9 = r5.generateLayoutParams((android.view.ViewGroup.LayoutParams) r9)
            goto L_0x018e
        L_0x01c3:
            X.02g r9 = (X.C002102g) r9
            goto L_0x0193
        L_0x01c6:
            r0 = r12
            goto L_0x00b1
        L_0x01c9:
            r5 = r12
            goto L_0x00a5
        L_0x01cc:
            int r0 = r11.getTop()
            float r5 = (float) r0
            float r0 = r11.getTranslationY()
            goto L_0x01e9
        L_0x01d6:
            if (r0 != 0) goto L_0x01f0
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 != 0) goto L_0x01f0
            int r0 = r11.getLeft()
            float r5 = (float) r0
            float r0 = r11.getTranslationX()
        L_0x01e9:
            float r5 = r5 + r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0240
            goto L_0x0091
        L_0x01f0:
            int r0 = r11.getRight()
            float r5 = (float) r0
            float r0 = r11.getTranslationX()
            float r5 = r5 - r0
            int r0 = r3.A03
            goto L_0x008c
        L_0x01fe:
            r6 = -1
            goto L_0x0072
        L_0x0201:
            r4 = -1
            goto L_0x006a
        L_0x0204:
            if (r0 != 0) goto L_0x0228
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            boolean r0 = X.AnonymousClass0YH.A08(r0)
            if (r0 != 0) goto L_0x0228
            int r0 = r11.getRight()
            float r8 = (float) r0
            float r0 = r11.getTranslationX()
            goto L_0x0221
        L_0x0218:
            int r0 = r11.getBottom()
            float r8 = (float) r0
            float r0 = r11.getTranslationY()
        L_0x0221:
            float r8 = r8 - r0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0236
            goto L_0x0058
        L_0x0228:
            int r0 = r11.getLeft()
            float r8 = (float) r0
            float r0 = r11.getTranslationX()
            float r8 = r8 + r0
            int r0 = r3.A03
            goto L_0x0053
        L_0x0236:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x023a:
            r4 = r12
            goto L_0x0027
        L_0x023d:
            r4 = r12
            goto L_0x0021
        L_0x0240:
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x0141
            r3.A1q(r13)
            return
        L_0x0248:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            X.0Q1 r0 = r5.A0y
            int r0 = r0.A00()
            r1.append(r0)
            java.lang.String r0 = r5.A0I()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0278:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A08
            java.lang.String r0 = r0.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A1s(X.0Qz, boolean):void");
    }

    public StickyHeadersLinearLayoutManager(int i) {
        super(i);
    }

    public Parcelable A0O() {
        return new C06750Zb(super.A0O(), this.A01, this.A00);
    }

    public void A0o(AnonymousClass0R6 r1, AnonymousClass0R6 r2) {
        A1p(r2);
    }

    public PointF AzL(int i) {
        A1n();
        PointF AzL = super.AzL(i);
        A1m();
        return AzL;
    }
}
