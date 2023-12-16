package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.09n  reason: invalid class name and case insensitive filesystem */
public class C011909n extends AnonymousClass09Z {
    public C05590Uc A00;
    public C05590Uc A01;

    public int[] A07(View view, C06440Xs r7) {
        int[] iArr = new int[2];
        if (r7.A17()) {
            C05590Uc r1 = this.A00;
            if (r1 == null || r1.A02 != r7) {
                r1 = new C17600vq(r7, 0);
                this.A00 = r1;
            }
            iArr[0] = AnonymousClass09Z.A00(view, r1);
        } else {
            iArr[0] = 0;
        }
        if (r7.A18()) {
            C05590Uc r12 = this.A01;
            if (r12 == null || r12.A02 != r7) {
                r12 = new C17600vq(r7, 1);
                this.A01 = r12;
            }
            iArr[1] = AnonymousClass09Z.A00(view, r12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public C011209g A04(C06440Xs r4) {
        if (!(r4 instanceof C16040sN)) {
            return null;
        }
        return new C17590vp(this.A01.getContext(), this, 0);
    }

    public int A02(C06440Xs r12, int i, int i2) {
        C05590Uc r9;
        PointF AzL;
        int A09 = r12.A09();
        if (A09 != 0) {
            if (r12.A18()) {
                r9 = this.A01;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new C17600vq(r12, 1);
                    this.A01 = r9;
                }
            } else if (r12.A17()) {
                r9 = this.A00;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new C17600vq(r12, 0);
                    this.A00 = r9;
                }
            }
            int A08 = r12.A08();
            View view = null;
            View view2 = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < A08; i5++) {
                View A0Q = r12.A0Q(i5);
                if (A0Q != null) {
                    int A002 = AnonymousClass09Z.A00(A0Q, r9);
                    if (A002 <= 0) {
                        if (A002 > i3) {
                            view2 = A0Q;
                            i3 = A002;
                        }
                        if (A002 < 0) {
                        }
                    }
                    if (A002 < i4) {
                        view = A0Q;
                        i4 = A002;
                    }
                }
            }
            boolean z = true;
            if (!r12.A17() ? i2 <= 0 : i <= 0) {
                z = false;
                if (view2 != null) {
                    return C06440Xs.A03(view2);
                }
            } else if (view != null) {
                return C06440Xs.A03(view);
            } else {
                view = view2;
            }
            if (view != null) {
                int A03 = C06440Xs.A03(view);
                int A092 = r12.A09();
                boolean z2 = false;
                if ((r12 instanceof C16040sN) && (AzL = ((C16040sN) r12).AzL(A092 - 1)) != null && (AzL.x < 0.0f || AzL.y < 0.0f)) {
                    z2 = true;
                }
                int i6 = 1;
                if (z2 == z) {
                    i6 = -1;
                }
                int i7 = A03 + i6;
                if (i7 < 0 || i7 >= A09) {
                    return -1;
                }
                return i7;
            }
        }
        return -1;
    }

    public View A03(C06440Xs r10) {
        C05590Uc r7;
        if (r10.A18()) {
            r7 = this.A01;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C17600vq(r10, 1);
                this.A01 = r7;
            }
        } else if (!r10.A17()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C17600vq(r10, 0);
                this.A00 = r7;
            }
        }
        int A08 = r10.A08();
        View view = null;
        if (A08 == 0) {
            return null;
        }
        int A04 = r7.A04() + (r7.A05() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A08; i2++) {
            View A0Q = r10.A0Q(i2);
            int A0A = AnonymousClass001.A0A(r7.A09(A0Q) + (r7.A07(A0Q) / 2), A04);
            if (A0A < i) {
                view = A0Q;
                i = A0A;
            }
        }
        return view;
    }
}
