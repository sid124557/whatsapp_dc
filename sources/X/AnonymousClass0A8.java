package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.0A8  reason: invalid class name */
public class AnonymousClass0A8 extends C10560i8 {
    public static final Property A00 = new C17510vh(3);
    public static final Property A01 = new C17510vh(2);
    public static final Property A02 = new AnonymousClass02I();
    public static final Property A03 = new C17510vh(5);
    public static final Property A04 = new C17510vh(4);
    public static final Property A05 = new C17510vh(1);
    public static final String[] A06 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    public static Path A00(int i, int i2, int i3, int i4) {
        Path path = new Path();
        path.moveTo((float) i, (float) i2);
        path.lineTo((float) i3, (float) i4);
        return path;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r13 != r8) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A05(android.view.ViewGroup r17, X.AnonymousClass0U7 r18, X.AnonymousClass0U7 r19) {
        /*
            r16 = this;
            r0 = r18
            if (r18 == 0) goto L_0x00e8
            r3 = r19
            if (r19 == 0) goto L_0x00e8
            java.util.Map r10 = r0.A02
            java.util.Map r1 = r3.A02
            java.lang.String r0 = "android:changeBounds:parent"
            java.lang.Object r2 = r10.get(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r2 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e8
            android.view.View r11 = r3.A00
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.Object r2 = r10.get(r0)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r12 = r2.left
            int r9 = r0.left
            int r13 = r2.top
            int r8 = r0.top
            int r14 = r2.right
            int r7 = r0.right
            int r15 = r2.bottom
            int r6 = r0.bottom
            int r5 = r14 - r12
            int r4 = r15 - r13
            int r3 = r7 - r9
            int r2 = r6 - r8
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r10 = r10.get(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r5 == 0) goto L_0x0050
            if (r4 != 0) goto L_0x0054
        L_0x0050:
            if (r3 == 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00e5
        L_0x0054:
            if (r12 != r9) goto L_0x0059
            r1 = 0
            if (r13 == r8) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            if (r14 != r7) goto L_0x005e
            if (r15 == r6) goto L_0x0060
        L_0x005e:
            int r1 = r1 + 1
        L_0x0060:
            if (r10 == 0) goto L_0x00e0
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00e2
        L_0x0068:
            if (r1 <= 0) goto L_0x00e8
            r0 = 2
            X.0Qj r10 = X.AnonymousClass0VZ.A02
            r10.A06(r11, r12, r13, r14, r15)
            r10 = r16
            if (r1 != r0) goto L_0x00ce
            if (r5 != r3) goto L_0x009e
            if (r4 != r2) goto L_0x009e
            android.graphics.Path r2 = A00(r12, r13, r9, r8)
            android.util.Property r1 = A03
        L_0x007e:
            r0 = 0
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r11, r1, r0, r2)
        L_0x0083:
            android.view.ViewParent r0 = r11.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009d
            android.view.ViewParent r1 = r11.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 1
            X.C05180Si.A01(r1, r0)
            X.0AE r0 = new X.0AE
            r0.<init>(r1, r10)
            r10.A0B(r0)
        L_0x009d:
            return r3
        L_0x009e:
            X.0Mf r2 = new X.0Mf
            r2.<init>(r11)
            android.graphics.Path r3 = A00(r12, r13, r9, r8)
            android.util.Property r1 = A05
            r5 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r2, r1, r5, r3)
            android.graphics.Path r3 = A00(r14, r15, r7, r6)
            android.util.Property r1 = A01
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r1, r5, r3)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            X.AnonymousClass000.A16(r4, r1, r0)
            r3.playTogether(r0)
            X.005 r0 = new X.005
            r0.<init>(r2, r10)
            r3.addListener(r0)
            goto L_0x0083
        L_0x00ce:
            if (r12 != r9) goto L_0x00d9
            if (r13 != r8) goto L_0x00d9
            android.graphics.Path r2 = A00(r14, r15, r7, r6)
            android.util.Property r1 = A00
            goto L_0x007e
        L_0x00d9:
            android.graphics.Path r2 = A00(r12, r13, r9, r8)
            android.util.Property r1 = A04
            goto L_0x007e
        L_0x00e0:
            if (r0 == 0) goto L_0x0068
        L_0x00e2:
            int r1 = r1 + 1
            goto L_0x0068
        L_0x00e5:
            r1 = 0
            goto L_0x0060
        L_0x00e8:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A8.A05(android.view.ViewGroup, X.0U7, X.0U7):android.animation.Animator");
    }

    public String[] A0Y() {
        return A06;
    }

    public final void A0Z(AnonymousClass0U7 r8) {
        View view = r8.A00;
        if (C06360Xi.A05(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = r8.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", view.getParent());
        }
    }

    public void A0U(AnonymousClass0U7 r1) {
        A0Z(r1);
    }

    public void A0V(AnonymousClass0U7 r1) {
        A0Z(r1);
    }
}
