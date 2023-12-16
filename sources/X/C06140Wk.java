package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.0Wk  reason: invalid class name and case insensitive filesystem */
public class C06140Wk {
    public static C10530i5 A00;
    public static AnonymousClass0T2 A01 = AnonymousClass0T2.A00("x", "y");
    public static AnonymousClass0T2 A02 = AnonymousClass0T2.A00("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final Interpolator A03 = new LinearInterpolator();

    public static Interpolator A00(PointF pointF, PointF pointF2) {
        int i;
        WeakReference weakReference;
        Interpolator interpolator;
        Interpolator interpolator2;
        pointF.x = AnonymousClass001.A01(1.0f, pointF.x, -1.0f);
        pointF.y = AnonymousClass001.A01(100.0f, pointF.y, -100.0f);
        float A012 = AnonymousClass001.A01(1.0f, pointF2.x, -1.0f);
        pointF2.x = A012;
        float A013 = AnonymousClass001.A01(100.0f, pointF2.y, -100.0f);
        pointF2.y = A013;
        float f = pointF.x;
        float f2 = pointF.y;
        if (f != 0.0f) {
            i = (int) (((float) 527) * f);
        } else {
            i = 17;
        }
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (A012 != 0.0f) {
            i = (int) (((float) (i * 31)) * A012);
        }
        if (A013 != 0.0f) {
            i = (int) (((float) (i * 31)) * A013);
        }
        Class<C06140Wk> cls = C06140Wk.class;
        synchronized (cls) {
            C10530i5 r1 = A00;
            if (r1 == null) {
                r1 = new C10530i5();
                A00 = r1;
            }
            weakReference = (WeakReference) r1.A01(i, (Object) null);
        }
        if (weakReference != null) {
            interpolator = (Interpolator) weakReference.get();
        } else {
            interpolator = null;
        }
        if (weakReference == null || interpolator2 == null) {
            try {
                interpolator2 = C05030Rp.A00(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator2 = C05030Rp.A00(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator2 = new LinearInterpolator();
                }
            }
            try {
                WeakReference weakReference2 = new WeakReference(interpolator2);
                synchronized (cls) {
                    A00.A03(i, weakReference2);
                }
                return interpolator2;
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0132, code lost:
        r6.A0J();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C06230Wt A01(X.AnonymousClass0QL r16, X.C16250si r17, X.C10470hz r18, float r19, boolean r20, boolean r21) {
        /*
            r7 = r17
            r6 = r18
            r5 = r19
            if (r20 == 0) goto L_0x020a
            r17 = r16
            if (r21 == 0) goto L_0x0199
            r6.A0H()
            r14 = 0
            r15 = 0
            r11 = 0
            r10 = 0
            r1 = 0
            r19 = 0
            r4 = 0
            r12 = 0
            r9 = 0
            r21 = 0
            r13 = 0
            r20 = 0
        L_0x001e:
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x0153
            X.0T2 r0 = A02
            int r0 = r6.A0A(r0)
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0037;
                case 2: goto L_0x003c;
                case 3: goto L_0x0041;
                case 4: goto L_0x00bd;
                case 5: goto L_0x013d;
                case 6: goto L_0x0147;
                case 7: goto L_0x014d;
                default: goto L_0x002e;
            }
        L_0x002e:
            r6.A0L()
            goto L_0x001e
        L_0x0032:
            float r21 = X.C10470hz.A03(r6)
            goto L_0x001e
        L_0x0037:
            java.lang.Object r19 = r7.BgT(r6, r5)
            goto L_0x001e
        L_0x003c:
            java.lang.Object r20 = r7.BgT(r6, r5)
            goto L_0x001e
        L_0x0041:
            X.0G4 r2 = r6.A0C()
            X.0G4 r0 = X.AnonymousClass0G4.BEGIN_OBJECT
            if (r2 != r0) goto L_0x00b7
            r6.A0H()
            r8 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0050:
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x00ac
            X.0T2 r0 = A01
            int r1 = r6.A0A(r0)
            if (r1 == 0) goto L_0x0087
            r0 = 1
            if (r1 == r0) goto L_0x0065
            r6.A0L()
            goto L_0x0050
        L_0x0065:
            X.0G4 r0 = r6.A0C()
            X.0G4 r1 = X.AnonymousClass0G4.NUMBER
            if (r0 != r1) goto L_0x0073
            float r2 = X.C10470hz.A03(r6)
            r4 = r2
            goto L_0x0050
        L_0x0073:
            r6.A0G()
            float r4 = X.C10470hz.A03(r6)
            X.0G4 r0 = r6.A0C()
            if (r0 != r1) goto L_0x0085
            float r2 = X.C10470hz.A03(r6)
            goto L_0x00a6
        L_0x0085:
            r2 = r4
            goto L_0x00a6
        L_0x0087:
            X.0G4 r0 = r6.A0C()
            X.0G4 r1 = X.AnonymousClass0G4.NUMBER
            if (r0 != r1) goto L_0x0095
            float r3 = X.C10470hz.A03(r6)
            r8 = r3
            goto L_0x0050
        L_0x0095:
            r6.A0G()
            float r8 = X.C10470hz.A03(r6)
            X.0G4 r0 = r6.A0C()
            if (r0 != r1) goto L_0x00aa
            float r3 = X.C10470hz.A03(r6)
        L_0x00a6:
            r6.A0I()
            goto L_0x0050
        L_0x00aa:
            r3 = r8
            goto L_0x00a6
        L_0x00ac:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r8, r4)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r2)
            goto L_0x0132
        L_0x00b7:
            android.graphics.PointF r11 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x001e
        L_0x00bd:
            X.0G4 r2 = r6.A0C()
            X.0G4 r0 = X.AnonymousClass0G4.BEGIN_OBJECT
            if (r2 != r0) goto L_0x0137
            r6.A0H()
            r9 = 0
            r8 = 0
            r3 = 0
            r2 = 0
        L_0x00cc:
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x0128
            X.0T2 r0 = A01
            int r12 = r6.A0A(r0)
            if (r12 == 0) goto L_0x0103
            r0 = 1
            if (r12 == r0) goto L_0x00e1
            r6.A0L()
            goto L_0x00cc
        L_0x00e1:
            X.0G4 r0 = r6.A0C()
            X.0G4 r2 = X.AnonymousClass0G4.NUMBER
            if (r0 != r2) goto L_0x00ef
            float r2 = X.C10470hz.A03(r6)
            r8 = r2
            goto L_0x00cc
        L_0x00ef:
            r6.A0G()
            float r8 = X.C10470hz.A03(r6)
            X.0G4 r0 = r6.A0C()
            if (r0 != r2) goto L_0x0101
            float r2 = X.C10470hz.A03(r6)
            goto L_0x0122
        L_0x0101:
            r2 = r8
            goto L_0x0122
        L_0x0103:
            X.0G4 r0 = r6.A0C()
            X.0G4 r3 = X.AnonymousClass0G4.NUMBER
            if (r0 != r3) goto L_0x0111
            float r3 = X.C10470hz.A03(r6)
            r9 = r3
            goto L_0x00cc
        L_0x0111:
            r6.A0G()
            float r9 = X.C10470hz.A03(r6)
            X.0G4 r0 = r6.A0C()
            if (r0 != r3) goto L_0x0126
            float r3 = X.C10470hz.A03(r6)
        L_0x0122:
            r6.A0I()
            goto L_0x00cc
        L_0x0126:
            r3 = r9
            goto L_0x0122
        L_0x0128:
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r9, r8)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r3, r2)
        L_0x0132:
            r6.A0J()
            goto L_0x001e
        L_0x0137:
            android.graphics.PointF r10 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x001e
        L_0x013d:
            int r0 = r6.A09()
            boolean r15 = X.AnonymousClass000.A1U(r0, r2)
            goto L_0x001e
        L_0x0147:
            android.graphics.PointF r13 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x001e
        L_0x014d:
            android.graphics.PointF r14 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x001e
        L_0x0153:
            r6.A0J()
            if (r15 == 0) goto L_0x0168
            android.view.animation.Interpolator r16 = A03
            r20 = r19
        L_0x015c:
            r18 = 0
            X.0Wt r15 = new X.0Wt
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0QL) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
        L_0x0163:
            r15.A06 = r13
            r15.A07 = r14
            return r15
        L_0x0168:
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            android.view.animation.Interpolator r16 = A00(r11, r10)
            goto L_0x015c
        L_0x0171:
            if (r1 == 0) goto L_0x0196
            if (r4 == 0) goto L_0x0196
            if (r12 == 0) goto L_0x0196
            if (r9 == 0) goto L_0x0196
            android.view.animation.Interpolator r1 = A00(r1, r12)
            android.view.animation.Interpolator r2 = A00(r4, r9)
            r16 = 0
            if (r1 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x015c
            X.0Wt r15 = new X.0Wt
            r0 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>((android.view.animation.Interpolator) r1, (android.view.animation.Interpolator) r2, (X.AnonymousClass0QL) r3, (java.lang.Object) r4, (java.lang.Object) r5, (float) r6)
            goto L_0x0163
        L_0x0196:
            android.view.animation.Interpolator r16 = A03
            goto L_0x015c
        L_0x0199:
            r6.A0H()
            r8 = 0
            r4 = r8
            r20 = r8
            r19 = r8
            r3 = r8
            r2 = r8
            r9 = 0
            r21 = 0
        L_0x01a7:
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x01e9
            X.0T2 r0 = A02
            int r1 = r6.A0A(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01c1;
                case 2: goto L_0x01c6;
                case 3: goto L_0x01cb;
                case 4: goto L_0x01d0;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01df;
                case 7: goto L_0x01e4;
                default: goto L_0x01b8;
            }
        L_0x01b8:
            r6.A0L()
            goto L_0x01a7
        L_0x01bc:
            float r21 = X.C10470hz.A03(r6)
            goto L_0x01a7
        L_0x01c1:
            java.lang.Object r19 = r7.BgT(r6, r5)
            goto L_0x01a7
        L_0x01c6:
            java.lang.Object r20 = r7.BgT(r6, r5)
            goto L_0x01a7
        L_0x01cb:
            android.graphics.PointF r8 = X.AnonymousClass0X5.A02(r6, r0)
            goto L_0x01a7
        L_0x01d0:
            android.graphics.PointF r4 = X.AnonymousClass0X5.A02(r6, r0)
            goto L_0x01a7
        L_0x01d5:
            int r1 = r6.A09()
            r0 = 1
            boolean r9 = X.AnonymousClass000.A1U(r1, r0)
            goto L_0x01a7
        L_0x01df:
            android.graphics.PointF r3 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x01a7
        L_0x01e4:
            android.graphics.PointF r2 = X.AnonymousClass0X5.A02(r6, r5)
            goto L_0x01a7
        L_0x01e9:
            r6.A0J()
            if (r9 == 0) goto L_0x01fe
            android.view.animation.Interpolator r16 = A03
            r20 = r19
        L_0x01f2:
            r18 = 0
            X.0Wt r15 = new X.0Wt
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass0QL) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r15.A06 = r3
            r15.A07 = r2
            return r15
        L_0x01fe:
            if (r8 == 0) goto L_0x0207
            if (r4 == 0) goto L_0x0207
            android.view.animation.Interpolator r16 = A00(r8, r4)
            goto L_0x01f2
        L_0x0207:
            android.view.animation.Interpolator r16 = A03
            goto L_0x01f2
        L_0x020a:
            java.lang.Object r0 = r7.BgT(r6, r5)
            X.0Wt r15 = new X.0Wt
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06140Wk.A01(X.0QL, X.0si, X.0hz, float, boolean, boolean):X.0Wt");
    }
}
