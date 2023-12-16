package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0AP  reason: invalid class name */
public abstract class AnonymousClass0AP extends C10560i8 {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r6 == null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0X(X.AnonymousClass0U7 r5, X.AnonymousClass0U7 r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L_0x0006
            if (r6 != 0) goto L_0x0019
        L_0x0005:
            return r3
        L_0x0006:
            if (r6 == 0) goto L_0x0019
            java.util.Map r0 = r6.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r5.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L_0x0019
            return r3
        L_0x0019:
            X.0Mc r1 = A01(r5, r6)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0005
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0029
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0005
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A0X(X.0U7, X.0U7):boolean");
    }

    public abstract Animator A0Z(View view, ViewGroup viewGroup, AnonymousClass0U7 r3, AnonymousClass0U7 r4);

    public abstract Animator A0a(View view, ViewGroup viewGroup, AnonymousClass0U7 r3, AnonymousClass0U7 r4);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r9 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r5.A01 == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r1 == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r5.A03 == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C03930Mc A01(X.AnonymousClass0U7 r8, X.AnonymousClass0U7 r9) {
        /*
            X.0Mc r5 = new X.0Mc
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r3 = "android:visibility:parent"
            r4 = 0
            r7 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x007a
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass001.A0K(r0)
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L_0x002c:
            if (r9 == 0) goto L_0x0077
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass001.A0K(r0)
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0046:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L_0x0058
            if (r9 == 0) goto L_0x005e
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L_0x0067
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L_0x0067
        L_0x0057:
            return r5
        L_0x0058:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x006d
            if (r9 != 0) goto L_0x0057
        L_0x005e:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x0057
        L_0x0062:
            r5.A04 = r6
        L_0x0064:
            r5.A05 = r3
            return r5
        L_0x0067:
            if (r2 == r1) goto L_0x0070
            if (r2 == 0) goto L_0x0062
            if (r1 != 0) goto L_0x0057
        L_0x006d:
            r5.A04 = r3
            goto L_0x0064
        L_0x0070:
            if (r4 == 0) goto L_0x0062
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x0057
            goto L_0x006d
        L_0x0077:
            r5.A00 = r7
            goto L_0x0046
        L_0x007a:
            r5.A01 = r7
            r5.A03 = r4
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A01(X.0U7, X.0U7):X.0Mc");
    }

    public static final void A02(AnonymousClass0U7 r4) {
        View view = r4.A00;
        int visibility = view.getVisibility();
        Map map = r4.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public String[] A0Y() {
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (A01(A0D(r2, false), A0E(r2, false)).A05 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A05(android.view.ViewGroup r12, X.AnonymousClass0U7 r13, X.AnonymousClass0U7 r14) {
        /*
            r11 = this;
            X.0Mc r1 = A01(r13, r14)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0122
            android.view.ViewGroup r0 = r1.A03
            if (r0 != 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.A02
            if (r0 == 0) goto L_0x0122
        L_0x0010:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x003a
            int r0 = r11.A00
            r1 = 1
            r0 = r0 & 1
            r5 = 0
            if (r0 != r1) goto L_0x0039
            if (r14 == 0) goto L_0x0039
            if (r13 != 0) goto L_0x0117
            android.view.View r0 = r14.A00
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.0U7 r1 = r11.A0D(r2, r0)
            X.0U7 r0 = r11.A0E(r2, r0)
            X.0Mc r0 = A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0117
        L_0x0039:
            return r5
        L_0x003a:
            int r9 = r1.A00
            int r0 = r11.A00
            r8 = 2
            r0 = r0 & 2
            r5 = 0
            if (r0 != r8) goto L_0x0039
            if (r13 == 0) goto L_0x0039
            android.view.View r7 = r13.A00
            if (r14 == 0) goto L_0x0103
            android.view.View r2 = r14.A00
        L_0x004c:
            r6 = 2131433218(0x7f0b1702, float:1.8488215E38)
            java.lang.Object r1 = r7.getTag(r6)
            android.view.View r1 = (android.view.View) r1
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0076
            r10 = 1
        L_0x005a:
            android.animation.Animator r5 = r11.A0a(r1, r12, r13, r14)
            if (r10 != 0) goto L_0x0039
            if (r5 != 0) goto L_0x006d
            X.0Kb r0 = new X.0Kb
            r0.<init>(r12)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.remove(r1)
            return r5
        L_0x006d:
            r7.setTag(r6, r1)
            X.0AD r0 = new X.0AD
            r0.<init>(r1, r7, r12, r11)
            goto L_0x009d
        L_0x0076:
            if (r2 == 0) goto L_0x00a1
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0100
            r0 = 4
            if (r9 == r0) goto L_0x0083
            if (r7 != r2) goto L_0x00a1
        L_0x0083:
            int r1 = r2.getVisibility()
            X.0Qj r0 = X.AnonymousClass0VZ.A02
            r0.A05(r2, r4)
            android.animation.Animator r5 = r11.A0a(r2, r12, r13, r14)
            if (r5 == 0) goto L_0x011e
            X.00F r0 = new X.00F
            r0.<init>(r2, r9)
            r5.addListener(r0)
            r5.addPauseListener(r0)
        L_0x009d:
            r11.A0B(r0)
            return r5
        L_0x00a1:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 != 0) goto L_0x00de
            r10 = 0
            r1 = r7
        L_0x00a9:
            java.util.Map r2 = r13.A02
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r2.get(r0)
            int[] r0 = (int[]) r0
            r9 = r0[r4]
            r5 = r0[r3]
            int[] r2 = new int[r8]
            r12.getLocationOnScreen(r2)
            r0 = r2[r4]
            int r9 = r9 - r0
            int r0 = r1.getLeft()
            int r9 = r9 - r0
            r1.offsetLeftAndRight(r9)
            r0 = r2[r3]
            int r5 = r5 - r0
            int r0 = r1.getTop()
            int r5 = r5 - r0
            r1.offsetTopAndBottom(r5)
            X.0Kb r0 = new X.0Kb
            r0.<init>(r12)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.add(r1)
            goto L_0x005a
        L_0x00de:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0039
            android.view.ViewParent r2 = r7.getParent()
            android.view.View r2 = (android.view.View) r2
            X.0U7 r1 = r11.A0E(r2, r3)
            X.0U7 r0 = r11.A0D(r2, r3)
            X.0Mc r0 = A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0106
            android.view.View r2 = X.AnonymousClass0SE.A00(r7, r2, r12)
        L_0x0100:
            r10 = 0
            r1 = r2
            goto L_0x00a9
        L_0x0103:
            r2 = r5
            goto L_0x004c
        L_0x0106:
            int r1 = r2.getId()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x0039
            r0 = -1
            if (r1 == r0) goto L_0x0039
            r12.findViewById(r1)
            return r5
        L_0x0117:
            android.view.View r0 = r14.A00
            android.animation.Animator r5 = r11.A0Z(r0, r12, r13, r14)
            return r5
        L_0x011e:
            r0.A05(r2, r1)
            return r5
        L_0x0122:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A05(android.view.ViewGroup, X.0U7, X.0U7):android.animation.Animator");
    }

    public void A0U(AnonymousClass0U7 r1) {
        A02(r1);
    }
}
