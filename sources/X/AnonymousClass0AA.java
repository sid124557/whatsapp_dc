package X;

import android.graphics.Matrix;
import android.util.Property;
import android.view.View;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.0AA  reason: invalid class name */
public class AnonymousClass0AA extends C10560i8 {
    public static final Property A01 = new C17510vh(6);
    public static final Property A02 = new C17510vh(7);
    public static final String[] A03 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public Matrix A00 = AnonymousClass002.A05();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.0ex} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.0ex} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.02s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.0ex} */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.0A7] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0273, code lost:
        if (r18.getZ() > r17.getZ()) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029b, code lost:
        if (r7.size() == r2) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029e, code lost:
        r6 = r4 - 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A05(android.view.ViewGroup r23, X.AnonymousClass0U7 r24, X.AnonymousClass0U7 r25) {
        /*
            r22 = this;
            r21 = r24
            if (r24 == 0) goto L_0x031a
            r4 = r25
            if (r25 == 0) goto L_0x031a
            r0 = r21
            java.util.Map r13 = r0.A02
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x031a
            java.util.Map r3 = r4.A02
            boolean r0 = r3.containsKey(r12)
            if (r0 == 0) goto L_0x031a
            java.lang.Object r5 = r13.get(r12)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r2 = r3.get(r12)
            android.view.View r2 = (android.view.View) r2
            r11 = r22
            boolean r0 = r11.A0W(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0163
            boolean r0 = r11.A0W(r2)
            if (r0 == 0) goto L_0x0163
            X.0U7 r0 = r11.A0D(r5, r1)
            if (r0 == 0) goto L_0x0167
            android.view.View r0 = r0.A00
            if (r2 != r0) goto L_0x0167
        L_0x0041:
            r20 = 0
        L_0x0043:
            java.lang.String r0 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "android:changeTransform:matrix"
            r13.put(r0, r1)
        L_0x0050:
            java.lang.String r0 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            r13.put(r0, r1)
        L_0x005d:
            if (r20 == 0) goto L_0x0094
            java.lang.String r6 = "android:changeTransform:parentMatrix"
            java.lang.Object r5 = r3.get(r6)
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            android.view.View r1 = r4.A00
            r0 = 2131432060(0x7f0b127c, float:1.8485867E38)
            r1.setTag(r0, r5)
            android.graphics.Matrix r2 = r11.A00
            r2.reset()
            r5.invert(r2)
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r1 = r13.get(r0)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x0088
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            r13.put(r0, r1)
        L_0x0088:
            java.lang.Object r0 = r13.get(r6)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            r1.postConcat(r0)
            r1.postConcat(r2)
        L_0x0094:
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r2 = r13.get(r0)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            java.lang.Object r7 = r3.get(r0)
            android.graphics.Matrix r7 = (android.graphics.Matrix) r7
            if (r2 != 0) goto L_0x00a6
            android.graphics.Matrix r2 = X.C03150Ja.A00
        L_0x00a6:
            if (r7 != 0) goto L_0x00aa
            android.graphics.Matrix r7 = X.C03150Ja.A00
        L_0x00aa:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x00da
            r10 = 0
        L_0x00b1:
            if (r20 == 0) goto L_0x031b
            if (r10 == 0) goto L_0x031b
            android.view.View r9 = r4.A00
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            java.lang.Object r0 = r3.get(r0)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r0)
            X.0Qj r20 = X.AnonymousClass0VZ.A02
            r2 = r23
            r0 = r20
            r0.A03(r3, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L_0x01bb
            boolean r0 = X.C08720ex.A04
            if (r0 != 0) goto L_0x0195
            r5 = 1
            goto L_0x016b
        L_0x00da:
            java.lang.String r0 = "android:changeTransform:transforms"
            java.lang.Object r6 = r3.get(r0)
            X.0Px r6 = (X.C04630Px) r6
            android.view.View r5 = r4.A00
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setTranslationX(r1)
            r5.setTranslationY(r1)
            X.AnonymousClass0YZ.A0C(r5, r1)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            r5.setRotationX(r1)
            r5.setRotationY(r1)
            r5.setRotation(r1)
            r0 = 9
            float[] r1 = new float[r0]
            r2.getValues(r1)
            float[] r8 = new float[r0]
            r7.getValues(r8)
            X.0Nh r2 = new X.0Nh
            r2.<init>(r5, r1)
            android.util.Property r14 = A01
            float[] r0 = new float[r0]
            X.0Ym r10 = new X.0Ym
            r10.<init>(r0)
            r9 = 2
            float[][] r0 = new float[r9][]
            r17 = 0
            r0[r17] = r1
            r16 = 1
            r0[r16] = r8
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofObject(r14, r10, r0)
            r14 = r1[r9]
            r0 = 5
            r10 = r1[r0]
            r1 = r8[r9]
            r0 = r8[r0]
            android.graphics.Path r8 = X.AnonymousClass002.A06()
            r8.moveTo(r14, r10)
            r8.lineTo(r1, r0)
            android.util.Property r1 = A02
            r0 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r1, r0, r8)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r9]
            r0[r17] = r15
            r0[r16] = r1
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r2, r0)
            X.00D r0 = new X.00D
            r19 = r11
            r17 = r2
            r18 = r6
            r14 = r0
            r15 = r7
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r10.addListener(r0)
            r10.addPauseListener(r0)
            goto L_0x00b1
        L_0x0163:
            if (r5 != r2) goto L_0x0167
            goto L_0x0041
        L_0x0167:
            r20 = 1
            goto L_0x0043
        L_0x016b:
            X.C08720ex.A00()     // Catch:{ NoSuchMethodException -> 0x018b }
            java.lang.Class r7 = X.C08720ex.A01     // Catch:{ NoSuchMethodException -> 0x018b }
            java.lang.String r6 = "addGhost"
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x018b }
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0 = 0
            r4[r0] = r1     // Catch:{ NoSuchMethodException -> 0x018b }
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            r4[r5] = r0     // Catch:{ NoSuchMethodException -> 0x018b }
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            r0 = 2
            java.lang.reflect.Method r0 = X.AnonymousClass002.A0H(r7, r1, r6, r4, r0)     // Catch:{ NoSuchMethodException -> 0x018b }
            X.C08720ex.A02 = r0     // Catch:{ NoSuchMethodException -> 0x018b }
            r0.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x018b }
            goto L_0x0193
        L_0x018b:
            r4 = move-exception
            java.lang.String r1 = "GhostViewApi21"
            java.lang.String r0 = "Failed to retrieve addGhost method"
            android.util.Log.i(r1, r0, r4)
        L_0x0193:
            X.C08720ex.A04 = r5
        L_0x0195:
            java.lang.reflect.Method r5 = X.C08720ex.A02
            r4 = 0
            if (r5 == 0) goto L_0x02e5
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            X.AnonymousClass000.A16(r9, r2, r1)     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            r0 = 2
            r1[r0] = r3     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            java.lang.Object r0 = r5.invoke(r4, r1)     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            X.0ex r14 = new X.0ex     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            r14.<init>(r0)     // Catch:{ IllegalAccessException -> 0x02e5, InvocationTargetException -> 0x01b0 }
            goto L_0x02e6
        L_0x01b0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0313
            r0 = 2131430338(0x7f0b0bc2, float:1.8482374E38)
            java.lang.Object r15 = r2.getTag(r0)
            X.03G r15 = (X.AnonymousClass03G) r15
            r0 = 2131430337(0x7f0b0bc1, float:1.8482372E38)
            java.lang.Object r14 = r9.getTag(r0)
            X.02s r14 = (X.C002302s) r14
            if (r14 == 0) goto L_0x02bd
            android.view.ViewParent r1 = r14.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == r15) goto L_0x02dc
            int r0 = r14.A00
            r19 = r0
            r1.removeView(r14)
        L_0x01e6:
            X.02s r14 = new X.02s
            r14.<init>(r9)
            r14.A01 = r3
            if (r15 != 0) goto L_0x02a1
            X.03G r15 = new X.03G
            r15.<init>(r2)
        L_0x01f4:
            X.C002302s.A00(r2, r15)
            X.C002302s.A00(r2, r14)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            android.view.View r0 = r14.A04
            X.AnonymousClass03G.A00(r0, r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            int r0 = r15.getChildCount()
            int r6 = r0 + -1
            r5 = 0
        L_0x020e:
            if (r5 > r6) goto L_0x02c1
            int r0 = r5 + r6
            int r4 = r0 / 2
            android.view.View r0 = r15.getChildAt(r4)
            X.02s r0 = (X.C002302s) r0
            android.view.View r0 = r0.A04
            X.AnonymousClass03G.A00(r0, r7)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0275
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0275
            r0 = 0
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r0 = r7.get(r0)
            if (r1 != r0) goto L_0x0275
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            r3 = 1
        L_0x0243:
            if (r3 >= r2) goto L_0x0297
            android.view.View r18 = X.AnonymousClass001.A0S(r8, r3)
            android.view.View r17 = X.AnonymousClass001.A0S(r7, r3)
            r1 = r18
            r0 = r17
            if (r1 == r0) goto L_0x0294
            android.view.ViewParent r3 = r18.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r16 = r3.getChildCount()
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x027b
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x029e
        L_0x0275:
            int r5 = r4 + 1
        L_0x0277:
            r7.clear()
            goto L_0x020e
        L_0x027b:
            r2 = 0
        L_0x027c:
            r0 = r16
            if (r2 >= r0) goto L_0x0275
            int r0 = X.C05180Si.A00(r3, r2)
            android.view.View r0 = r3.getChildAt(r0)
            r1 = r18
            if (r0 == r1) goto L_0x029e
            r1 = r0
            r0 = r17
            if (r1 == r0) goto L_0x0275
            int r2 = r2 + 1
            goto L_0x027c
        L_0x0294:
            int r3 = r3 + 1
            goto L_0x0243
        L_0x0297:
            int r0 = r7.size()
            if (r0 != r2) goto L_0x029e
            goto L_0x0275
        L_0x029e:
            int r6 = r4 + -1
            goto L_0x0277
        L_0x02a1:
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x02d5
            android.view.ViewGroup r1 = r15.A00
            X.0Kb r0 = new X.0Kb
            r0.<init>(r1)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.remove(r15)
            X.0Kb r0 = new X.0Kb
            r0.<init>(r1)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.add(r15)
            goto L_0x01f4
        L_0x02bd:
            r19 = 0
            goto L_0x01e6
        L_0x02c1:
            if (r5 < 0) goto L_0x02d1
            int r0 = r15.getChildCount()
            if (r5 >= r0) goto L_0x02d1
            r15.addView(r14, r5)
        L_0x02cc:
            r0 = r19
            r14.A00 = r0
            goto L_0x02de
        L_0x02d1:
            r15.addView(r14)
            goto L_0x02cc
        L_0x02d5:
            java.lang.String r0 = "This GhostViewHolder is detached!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x02dc:
            r14.A01 = r3
        L_0x02de:
            int r0 = r14.A00
            int r0 = r0 + 1
            r14.A00 = r0
            goto L_0x02e6
        L_0x02e5:
            r14 = r4
        L_0x02e6:
            if (r14 == 0) goto L_0x031b
            java.lang.Object r1 = r13.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = r21
            android.view.View r2 = r0.A00
            r14.Bjt(r2, r1)
        L_0x02f5:
            X.0A7 r0 = r11.A07
            if (r0 == 0) goto L_0x02fb
            r11 = r0
            goto L_0x02f5
        L_0x02fb:
            X.0AF r0 = new X.0AF
            r0.<init>(r9, r14)
            r11.A0B(r0)
            if (r2 == r9) goto L_0x030b
            r1 = 0
            r0 = r20
            r0.A04(r2, r1)
        L_0x030b:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            r0.A04(r9, r1)
            return r10
        L_0x0313:
            java.lang.String r0 = "Ghosted views must be parented by a ViewGroup"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x031a:
            r10 = 0
        L_0x031b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AA.A05(android.view.ViewGroup, X.0U7, X.0U7):android.animation.Animator");
    }

    public String[] A0Y() {
        return A03;
    }

    public final void A0Z(AnonymousClass0U7 r7) {
        Matrix matrix;
        View view = r7.A00;
        if (view.getVisibility() != 8) {
            Map map = r7.A02;
            map.put("android:changeTransform:parent", view.getParent());
            map.put("android:changeTransform:transforms", new C04630Px(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            map.put("android:changeTransform:matrix", matrix);
            Matrix A05 = AnonymousClass002.A05();
            View view2 = (View) view.getParent();
            AnonymousClass0VZ.A02.A02(A05, view2);
            A05.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            map.put("android:changeTransform:parentMatrix", A05);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    public void A0U(AnonymousClass0U7 r1) {
        A0Z(r1);
    }

    public void A0V(AnonymousClass0U7 r1) {
        A0Z(r1);
    }
}
