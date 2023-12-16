package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8zU  reason: invalid class name and case insensitive filesystem */
public class C188788zU extends C04810Qt {
    public Object A00;
    public final int A01;

    public C188788zU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A01(View view) {
        if (1 - this.A01 != 0) {
            return super.A01(view);
        }
        return ((SideSheetBehavior) this.A00).A05;
    }

    public int A02(View view) {
        if (this.A01 != 0) {
            return super.A02(view);
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A00;
        if (bottomSheetBehavior.A0d) {
            return bottomSheetBehavior.A0H;
        }
        return bottomSheetBehavior.A06;
    }

    public int A03(View view, int i, int i2) {
        if (this.A01 == 0) {
            return view.getLeft();
        }
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
        SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior.A0C.A00;
        int max = Math.max(0, sideSheetBehavior2.A05 - sideSheetBehavior2.A02);
        int i3 = sideSheetBehavior.A05;
        if (i >= max) {
            max = i;
            if (i > i3) {
                return i3;
            }
        }
        return max;
    }

    public int A04(View view, int i, int i2) {
        if (this.A01 != 0) {
            return view.getTop();
        }
        int A0K = ((BottomSheetBehavior) this.A00).A0K();
        int A02 = A02(view);
        if (i < A0K) {
            return A0K;
        }
        if (i <= A02) {
            return i;
        }
        return A02;
    }

    public void A05(int i) {
        if (this.A01 != 0) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
                if (sideSheetBehavior.A0F) {
                    sideSheetBehavior.A0L(1);
                }
            }
        } else if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A00;
            if (bottomSheetBehavior.A0Z) {
                bottomSheetBehavior.A0T(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r3 > ((r2 - java.lang.Math.max(0, r2 - r6.A02)) / 2)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (X.AnonymousClass001.A0A(r3, java.lang.Math.max(0, r2 - r6.A02)) < X.AnonymousClass001.A0A(r3, r2)) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r1 > r2.A0A) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r4 < r0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (X.AnonymousClass001.A0A(r4, r0) < X.AnonymousClass001.A0A(r4, r2.A06)) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (X.AnonymousClass001.A0A(r4, r2.A08) < X.AnonymousClass001.A0A(r4, r2.A06)) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            int r0 = r7.A01
            if (r0 == 0) goto L_0x007e
            java.lang.Object r5 = r7.A00
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            X.7fU r3 = r5.A0C
            r4 = 3
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            int r0 = r8.getRight()
            float r1 = (float) r0
            com.google.android.material.sidesheet.SideSheetBehavior r6 = r3.A00
            float r0 = r6.A01
            float r0 = r0 * r9
            float r1 = r1 + r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            r0 = 500(0x1f4, float:7.0E-43)
            float r0 = (float) r0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
        L_0x0038:
            r4 = 5
        L_0x0039:
            r0 = 1
            r5.A0M(r8, r4, r0)
            return
        L_0x003e:
            int r3 = r8.getLeft()
            int r2 = r6.A05
            int r0 = r6.A02
            int r1 = r2 - r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r2 - r0
            int r0 = r2 / 2
            if (r3 <= r0) goto L_0x0039
            goto L_0x0038
        L_0x0053:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            goto L_0x0038
        L_0x0064:
            int r3 = r8.getLeft()
            int r2 = r6.A05
            int r0 = r6.A02
            int r1 = r2 - r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = X.AnonymousClass001.A0A(r3, r0)
            int r0 = X.AnonymousClass001.A0A(r3, r2)
            if (r1 >= r0) goto L_0x0038
            goto L_0x0039
        L_0x007e:
            r3 = 6
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.Object r2 = r7.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            if (r0 >= 0) goto L_0x009c
            boolean r0 = r2.A0b
            if (r0 != 0) goto L_0x00e4
            int r1 = r8.getTop()
            java.lang.System.currentTimeMillis()
            int r0 = r2.A0A
            if (r1 <= r0) goto L_0x00e4
        L_0x0097:
            r0 = 1
            r2.A0Y(r8, r3, r0)
            return
        L_0x009c:
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r2.A0e(r8, r10)
            if (r0 == 0) goto L_0x00e6
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            int r0 = r2.A0N
            float r0 = (float) r0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
        L_0x00b9:
            int r4 = r8.getTop()
            int r1 = r2.A0H
            int r0 = r2.A0K()
            int r1 = r1 + r0
            int r0 = r1 / 2
            if (r4 > r0) goto L_0x012f
            boolean r0 = r2.A0b
            if (r0 != 0) goto L_0x00e4
            int r1 = r8.getTop()
            int r0 = r2.A0K()
            int r4 = X.AnonymousClass001.A0A(r1, r0)
            int r1 = r8.getTop()
            int r0 = r2.A0A
            int r0 = X.AnonymousClass001.A0A(r1, r0)
        L_0x00e2:
            if (r4 >= r0) goto L_0x0097
        L_0x00e4:
            r3 = 3
            goto L_0x0097
        L_0x00e6:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010d
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x010d
            boolean r0 = r2.A0b
            if (r0 != 0) goto L_0x0132
            int r4 = r8.getTop()
            int r0 = r2.A0A
        L_0x0100:
            int r1 = X.AnonymousClass001.A0A(r4, r0)
            int r0 = r2.A06
            int r0 = X.AnonymousClass001.A0A(r4, r0)
            if (r1 >= r0) goto L_0x0132
            goto L_0x0097
        L_0x010d:
            int r4 = r8.getTop()
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x0124
            int r0 = r2.A08
            int r1 = X.AnonymousClass001.A0A(r4, r0)
            int r0 = r2.A06
            int r0 = X.AnonymousClass001.A0A(r4, r0)
            if (r1 >= r0) goto L_0x0132
            goto L_0x00e4
        L_0x0124:
            int r0 = r2.A0A
            if (r4 >= r0) goto L_0x0100
            int r0 = r2.A06
            int r0 = X.AnonymousClass001.A0A(r4, r0)
            goto L_0x00e2
        L_0x012f:
            r3 = 5
            goto L_0x0097
        L_0x0132:
            r3 = 4
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188788zU.A06(android.view.View, float, float):void");
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        View A0j;
        ViewGroup.MarginLayoutParams A0T;
        if (this.A01 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A00;
            WeakReference weakReference = sideSheetBehavior.A0D;
            if (!(weakReference == null || (A0j = C86664Kz.A0j(weakReference)) == null || (A0T = AnonymousClass001.A0T(A0j)) == null)) {
                C155777fU r0 = sideSheetBehavior.A0C;
                int left = view.getLeft();
                view.getRight();
                int i5 = r0.A00.A05;
                if (left <= i5) {
                    A0T.rightMargin = i5 - left;
                }
                A0j.setLayoutParams(A0T);
            }
            Set set = sideSheetBehavior.A0J;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onSlide");
                }
                return;
            }
            return;
        }
        ((BottomSheetBehavior) this.A00).A0Q(i2);
    }

    public boolean A09(View view, int i) {
        boolean z;
        WeakReference weakReference;
        WeakReference weakReference2;
        View A0j;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
            z = false;
            if (sideSheetBehavior.A06 == 1) {
                return false;
            }
            weakReference = sideSheetBehavior.A0E;
        } else {
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
            int i3 = bottomSheetBehavior.A0O;
            z = false;
            if (i3 == 1 || bottomSheetBehavior.A0q) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.A04 == i && (weakReference2 = bottomSheetBehavior.A0W) != null && (A0j = C86664Kz.A0j(weakReference2)) != null && A0j.canScrollVertically(-1)) {
                return false;
            }
            System.currentTimeMillis();
            weakReference = bottomSheetBehavior.A0X;
        }
        if (weakReference == null || weakReference.get() != view) {
            return z;
        }
        return true;
    }
}
