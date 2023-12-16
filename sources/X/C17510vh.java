package X;

import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.0vh  reason: invalid class name and case insensitive filesystem */
public class C17510vh extends Property {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0086, code lost:
        r3 = r6.A04;
        r3[2] = r6.A00;
        r3[5] = r6.A01;
        r2 = r6.A02;
        r2.setValues(r3);
        X.AnonymousClass0VZ.A02.A01(r2, r6.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00eb, code lost:
        X.AnonymousClass0VZ.A02.A06(r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        X.AnonymousClass0VZ.A02.A06(r1, r2, r3, r4, r5);
        r6.A05 = 0;
        r6.A01 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void set(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r6 = r12
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x0033;
                case 2: goto L_0x000e;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00ba;
                case 5: goto L_0x009f;
                case 6: goto L_0x007b;
                case 7: goto L_0x006e;
                case 8: goto L_0x0062;
                default: goto L_0x0006;
            }
        L_0x0006:
            android.view.View r6 = (android.view.View) r6
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            X.C04910Rd.A01(r6, r13)
        L_0x000d:
            return
        L_0x000e:
            X.0Mf r6 = (X.C03960Mf) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r4 = java.lang.Math.round(r0)
            r6.A03 = r4
            float r0 = r13.y
            int r5 = java.lang.Math.round(r0)
            r6.A00 = r5
            int r0 = r6.A01
            int r1 = r0 + 1
            r6.A01 = r1
            int r0 = r6.A05
            if (r0 != r1) goto L_0x000d
            android.view.View r1 = r6.A06
            int r2 = r6.A02
            int r3 = r6.A04
            goto L_0x0057
        L_0x0033:
            X.0Mf r6 = (X.C03960Mf) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r2 = java.lang.Math.round(r0)
            r6.A02 = r2
            float r0 = r13.y
            int r3 = java.lang.Math.round(r0)
            r6.A04 = r3
            int r0 = r6.A05
            int r1 = r0 + 1
            r6.A05 = r1
            int r0 = r6.A01
            if (r1 != r0) goto L_0x000d
            android.view.View r1 = r6.A06
            int r4 = r6.A03
            int r5 = r6.A00
        L_0x0057:
            X.0Qj r0 = X.AnonymousClass0VZ.A02
            r0.A06(r1, r2, r3, r4, r5)
            r0 = 0
            r6.A05 = r0
            r6.A01 = r0
            return
        L_0x0062:
            android.view.View r6 = (android.view.View) r6
            float r1 = X.AnonymousClass001.A05(r13)
            X.0Qj r0 = X.AnonymousClass0VZ.A02
            r0.A04(r6, r1)
            return
        L_0x006e:
            X.0Nh r6 = (X.C04220Nh) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            r6.A00 = r0
            float r0 = r13.y
            r6.A01 = r0
            goto L_0x0086
        L_0x007b:
            X.0Nh r6 = (X.C04220Nh) r6
            float[] r13 = (float[]) r13
            float[] r2 = r6.A04
            int r1 = r13.length
            r0 = 0
            java.lang.System.arraycopy(r13, r0, r2, r0, r1)
        L_0x0086:
            float[] r3 = r6.A04
            r1 = 2
            float r0 = r6.A00
            r3[r1] = r0
            r1 = 5
            float r0 = r6.A01
            r3[r1] = r0
            android.graphics.Matrix r2 = r6.A02
            r2.setValues(r3)
            android.view.View r1 = r6.A03
            X.0Qj r0 = X.AnonymousClass0VZ.A02
            r0.A01(r2, r1)
            return
        L_0x009f:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r7 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r8 = java.lang.Math.round(r0)
            int r9 = r6.getWidth()
            int r9 = r9 + r7
            int r10 = r6.getHeight()
            int r10 = r10 + r8
            goto L_0x00eb
        L_0x00ba:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            float r0 = r13.x
            int r7 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r8 = java.lang.Math.round(r0)
            int r9 = r6.getRight()
            int r10 = r6.getBottom()
            goto L_0x00eb
        L_0x00d3:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            int r7 = r6.getLeft()
            int r8 = r6.getTop()
            float r0 = r13.x
            int r9 = java.lang.Math.round(r0)
            float r0 = r13.y
            int r10 = java.lang.Math.round(r0)
        L_0x00eb:
            X.0Qj r5 = X.AnonymousClass0VZ.A02
            r5.A06(r6, r7, r8, r9, r10)
            return
        L_0x00f1:
            androidx.appcompat.widget.SwitchCompat r6 = (androidx.appcompat.widget.SwitchCompat) r6
            float r0 = X.AnonymousClass001.A05(r13)
            r6.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17510vh.set(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17510vh(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0012;
                case 2: goto L_0x0017;
                case 3: goto L_0x0017;
                case 4: goto L_0x0012;
                case 5: goto L_0x001c;
                case 6: goto L_0x0021;
                case 7: goto L_0x0026;
                case 8: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "thumbPos"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "topLeft"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "bottomRight"
            goto L_0x0009
        L_0x001c:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "position"
            goto L_0x0009
        L_0x0021:
            java.lang.Class<float[]> r1 = float[].class
            java.lang.String r0 = "nonTranslations"
            goto L_0x0009
        L_0x0026:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "translations"
            goto L_0x0009
        L_0x002b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17510vh.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        switch (this.A00) {
            case 0:
                f = ((SwitchCompat) obj).mThumbPosition;
                break;
            case 8:
                f = AnonymousClass0VZ.A02.A00((View) obj);
                break;
            case 9:
                return C04910Rd.A00((View) obj);
            default:
                return null;
        }
        return Float.valueOf(f);
    }
}
