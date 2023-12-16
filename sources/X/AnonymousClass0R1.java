package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.0R1  reason: invalid class name */
public class AnonymousClass0R1 {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = 0;
    public ArrayList A03 = AnonymousClass001.A0s();
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;

    public View A05(int i, int i2) {
        View view = null;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i2 != -1) {
            while (i3 >= 0) {
                View A0S = AnonymousClass001.A0S(arrayList, i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0F && C06440Xs.A03(A0S) >= i) {
                    break;
                } else if (staggeredGridLayoutManager.A0F || C06440Xs.A03(A0S) > i) {
                    if (!A0S.hasFocusable()) {
                        break;
                    }
                    i3--;
                    view = A0S;
                } else {
                    return view;
                }
            }
        } else {
            int i4 = 0;
            while (i4 < size) {
                View A0S2 = AnonymousClass001.A0S(arrayList, i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0F && C06440Xs.A03(A0S2) <= i) || ((!staggeredGridLayoutManager2.A0F && C06440Xs.A03(A0S2) >= i) || !A0S2.hasFocusable())) {
                    break;
                }
                i4++;
                view = A0S2;
            }
        }
        return view;
    }

    public AnonymousClass0R1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public int A00() {
        boolean z = this.A05.A0F;
        int size = this.A03.size();
        if (z) {
            return A04(size - 1, -1);
        }
        return A04(0, size);
    }

    public int A01() {
        boolean z = this.A05.A0F;
        int size = this.A03.size();
        if (z) {
            return A04(0, size);
        }
        return A04(size - 1, -1);
    }

    public int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A06();
        return this.A00;
    }

    public int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A07();
        return this.A01;
    }

    public int A04(int i, int i2) {
        C05590Uc r8 = this.A05.A07;
        int A042 = r8.A04();
        int A022 = r8.A02();
        int i3 = -1;
        if (i2 > i) {
            i3 = 1;
        }
        while (i != i2) {
            View A0S = AnonymousClass001.A0S(this.A03, i);
            int A09 = r8.A09(A0S);
            int A06 = r8.A06(A0S);
            boolean z = false;
            boolean z2 = false;
            if (A09 <= A022) {
                z2 = true;
            }
            if (A06 >= A042) {
                z = true;
            }
            if (z2 && z && (A09 < A042 || A06 > A022)) {
                return C06440Xs.A03(A0S);
            }
            i += i3;
        }
        return -1;
    }

    public void A06() {
        C06810Zh A012;
        int i;
        ArrayList arrayList = this.A03;
        View A0S = AnonymousClass001.A0S(arrayList, arrayList.size() - 1);
        AnonymousClass09Y r2 = (AnonymousClass09Y) A0S.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A06(A0S);
        if (r2.A01 && (A012 = staggeredGridLayoutManager.A09.A01(AnonymousClass001.A0J(r2.A00))) != null && A012.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A012.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A00 = i2 + i;
        }
    }

    public void A07() {
        C06810Zh A012;
        int i;
        View A0S = AnonymousClass001.A0S(this.A03, 0);
        AnonymousClass09Y r2 = (AnonymousClass09Y) A0S.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A09(A0S);
        if (r2.A01 && (A012 = staggeredGridLayoutManager.A09.A01(AnonymousClass001.A0J(r2.A00))) != null && A012.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A012.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A01 = i2 - i;
        }
    }

    public void A08() {
        this.A03.clear();
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = 0;
    }

    public void A09() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        AnonymousClass09Y r1 = (AnonymousClass09Y) view.getLayoutParams();
        r1.A00 = null;
        C05570Ua r12 = r1.A00;
        if (AnonymousClass000.A1S(r12.A00 & 8) || (r12.A00 & 2) != 0) {
            this.A02 -= this.A05.A07.A07(view);
        }
        if (size == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        this.A00 = Integer.MIN_VALUE;
    }

    public void A0A() {
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.remove(0);
        AnonymousClass09Y r1 = (AnonymousClass09Y) view.getLayoutParams();
        r1.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = Integer.MIN_VALUE;
        }
        C05570Ua r12 = r1.A00;
        if (AnonymousClass000.A1S(r12.A00 & 8) || (r12.A00 & 2) != 0) {
            this.A02 -= this.A05.A07.A07(view);
        }
        this.A01 = Integer.MIN_VALUE;
    }

    public void A0B(View view) {
        AnonymousClass09Y r3 = (AnonymousClass09Y) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        C05570Ua r1 = r3.A00;
        if (AnonymousClass000.A1S(r1.A00 & 8) || (r1.A00 & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }

    public void A0C(View view) {
        AnonymousClass09Y r3 = (AnonymousClass09Y) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A00 = Integer.MIN_VALUE;
        }
        C05570Ua r1 = r3.A00;
        if (AnonymousClass000.A1S(r1.A00 & 8) || (r1.A00 & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }
}
