package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0AQ  reason: invalid class name */
public class AnonymousClass0AQ extends AnonymousClass01K {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public ColorFilter A00;
    public PorterDuffColorFilter A01;
    public Drawable.ConstantState A02;
    public AnonymousClass012 A03;
    public boolean A04;
    public boolean A05;
    public final Matrix A06;
    public final Rect A07;
    public final float[] A08;

    /* JADX WARNING: type inference failed for: r2v6, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r21v4, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r19v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e6, code lost:
        r26 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e9, code lost:
        r26 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ec, code lost:
        r2 = new android.graphics.SweepGradient(r19, r18, r1.A01, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fc, code lost:
        if (r24 <= 0.0f) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fe, code lost:
        r3 = r1.A01;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        if (r4 == 1) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0205, code lost:
        if (r4 == 2) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0208, code lost:
        r27 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020b, code lost:
        r27 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020e, code lost:
        r27 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0210, code lost:
        r21 = new android.graphics.RadialGradient(r19, r18, r24, r3, r1, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0220, code lost:
        r26 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0222, code lost:
        r19 = new android.graphics.LinearGradient(r20, r21, r22, r23, r3, r0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0233, code lost:
        return new X.C03690Le((android.content.res.ColorStateList) null, r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0234, code lost:
        r1 = new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c1, code lost:
        if (r11.size() <= 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c3, code lost:
        r1 = new X.C05840Ve((java.util.List) r11, (java.util.List) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c9, code lost:
        if (r17 == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cb, code lost:
        r1 = new X.C05840Ve(r5, r16, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d3, code lost:
        r1 = new X.C05840Ve(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d8, code lost:
        if (r6 == 1) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01db, code lost:
        if (r6 == 2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01dd, code lost:
        r3 = r1.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e1, code lost:
        if (r4 == 1) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e3, code lost:
        if (r4 == 2) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03690Le A02(android.content.res.Resources.Theme r23, android.content.res.TypedArray r24, java.lang.String r25, org.xmlpull.v1.XmlPullParser r26, int r27) {
        /*
            r8 = 0
            r1 = r25
            r0 = r26
            boolean r0 = X.C05790Uy.A02(r1, r0)
            if (r0 == 0) goto L_0x0264
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r4 = r24
            r3 = r27
            r4.getValue(r3, r2)
            int r1 = r2.type
            r0 = 28
            if (r1 < r0) goto L_0x002a
            r0 = 31
            if (r1 > r0) goto L_0x002a
            int r1 = r2.data
            r0 = 0
            X.0Le r3 = new X.0Le
            r3.<init>(r0, r0, r1)
            return r3
        L_0x002a:
            android.content.res.Resources r10 = r4.getResources()
            int r0 = r4.getResourceId(r3, r8)
            android.content.res.XmlResourceParser r9 = r10.getXml(r0)     // Catch:{ Exception -> 0x025c }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r9)     // Catch:{ Exception -> 0x025c }
        L_0x003a:
            int r1 = r9.next()     // Catch:{ Exception -> 0x025c }
            r0 = 2
            if (r1 == r0) goto L_0x004d
            r0 = 1
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x025b
        L_0x004d:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "gradient"
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x025c }
            r25 = r23
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x024c
            r0 = r25
            android.content.res.ColorStateList r2 = X.AnonymousClass0VI.A00(r0, r10, r7, r9)     // Catch:{ Exception -> 0x025c }
            int r1 = r2.getDefaultColor()     // Catch:{ Exception -> 0x025c }
            r0 = 0
            X.0Le r3 = new X.0Le     // Catch:{ Exception -> 0x025c }
            r3.<init>(r2, r0, r1)     // Catch:{ Exception -> 0x025c }
            return r3
        L_0x0074:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x025c }
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x023c
            int[] r1 = X.AnonymousClass0K6.A03     // Catch:{ Exception -> 0x025c }
            r0 = r25
            android.content.res.TypedArray r2 = X.C05790Uy.A01(r0, r10, r7, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "startX"
            r1 = 8
            r11 = 0
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0094
            r20 = 0
            goto L_0x0098
        L_0x0094:
            float r20 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x0098:
            java.lang.String r0 = "startY"
            r1 = 9
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00a5
            r21 = 0
            goto L_0x00a9
        L_0x00a5:
            float r21 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x00a9:
            java.lang.String r0 = "endX"
            r1 = 10
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00b6
            r22 = 0
            goto L_0x00ba
        L_0x00b6:
            float r22 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x00ba:
            java.lang.String r0 = "endY"
            r1 = 11
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00c7
            r23 = 0
            goto L_0x00cb
        L_0x00c7:
            float r23 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x00cb:
            java.lang.String r0 = "centerX"
            r1 = 3
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00d7
            r19 = 0
            goto L_0x00db
        L_0x00d7:
            float r19 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x00db:
            java.lang.String r0 = "centerY"
            r1 = 4
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00e7
            r18 = 0
            goto L_0x00eb
        L_0x00e7:
            float r18 = r2.getFloat(r1, r11)     // Catch:{ Exception -> 0x025c }
        L_0x00eb:
            java.lang.String r0 = "type"
            r1 = 2
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x00f6
            r6 = 0
            goto L_0x00fa
        L_0x00f6:
            int r6 = r2.getInt(r1, r8)     // Catch:{ Exception -> 0x025c }
        L_0x00fa:
            java.lang.String r0 = "startColor"
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0104
            r5 = 0
            goto L_0x0108
        L_0x0104:
            int r5 = r2.getColor(r8, r8)     // Catch:{ Exception -> 0x025c }
        L_0x0108:
            java.lang.String r0 = "centerColor"
            boolean r17 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            r1 = 7
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0118
            r16 = 0
            goto L_0x011c
        L_0x0118:
            int r16 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x025c }
        L_0x011c:
            java.lang.String r0 = "endColor"
            r1 = 1
            r4 = 0
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0128
            r3 = 0
            goto L_0x012c
        L_0x0128:
            int r3 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x025c }
        L_0x012c:
            java.lang.String r0 = "tileMode"
            r1 = 6
            boolean r0 = X.C05790Uy.A02(r0, r9)     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x0139
            int r4 = r2.getInt(r1, r8)     // Catch:{ Exception -> 0x025c }
        L_0x0139:
            java.lang.String r1 = "gradientRadius"
            r15 = 0
            r0 = 5
            boolean r1 = X.C05790Uy.A02(r1, r9)     // Catch:{ Exception -> 0x025c }
            if (r1 != 0) goto L_0x0146
            r24 = 0
            goto L_0x014a
        L_0x0146:
            float r24 = r2.getFloat(r0, r11)     // Catch:{ Exception -> 0x025c }
        L_0x014a:
            r2.recycle()     // Catch:{ Exception -> 0x025c }
            int r0 = r9.getDepth()     // Catch:{ Exception -> 0x025c }
            r2 = 1
            int r13 = r0 + 1
            r0 = 20
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r0)     // Catch:{ Exception -> 0x025c }
            java.util.ArrayList r11 = X.AnonymousClass002.A0I(r0)     // Catch:{ Exception -> 0x025c }
        L_0x015e:
            int r1 = r9.next()     // Catch:{ Exception -> 0x025c }
            if (r1 == r2) goto L_0x01bd
            int r0 = r9.getDepth()     // Catch:{ Exception -> 0x025c }
            if (r0 >= r13) goto L_0x016d
            r14 = 3
            if (r1 == r14) goto L_0x01bd
        L_0x016d:
            r14 = 2
            if (r1 != r14) goto L_0x015e
            if (r0 > r13) goto L_0x015e
            java.lang.String r1 = r9.getName()     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x015e
            int[] r1 = X.AnonymousClass0K6.A04     // Catch:{ Exception -> 0x025c }
            r0 = r25
            android.content.res.TypedArray r0 = X.C05790Uy.A01(r0, r10, r7, r1)     // Catch:{ Exception -> 0x025c }
            boolean r14 = r0.hasValue(r8)     // Catch:{ Exception -> 0x025c }
            boolean r1 = r0.hasValue(r2)     // Catch:{ Exception -> 0x025c }
            if (r14 == 0) goto L_0x01ac
            if (r1 == 0) goto L_0x01ac
            int r14 = r0.getColor(r8, r8)     // Catch:{ Exception -> 0x025c }
            float r1 = r0.getFloat(r2, r15)     // Catch:{ Exception -> 0x025c }
            r0.recycle()     // Catch:{ Exception -> 0x025c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x025c }
            r11.add(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ Exception -> 0x025c }
            r12.add(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x015e
        L_0x01ac:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r9)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x025c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x025b
        L_0x01bd:
            int r0 = r11.size()     // Catch:{ Exception -> 0x025c }
            if (r0 <= 0) goto L_0x01c9
            X.0Ve r1 = new X.0Ve     // Catch:{ Exception -> 0x025c }
            r1.<init>((java.util.List) r11, (java.util.List) r12)     // Catch:{ Exception -> 0x025c }
            goto L_0x01d8
        L_0x01c9:
            if (r17 == 0) goto L_0x01d3
            X.0Ve r1 = new X.0Ve     // Catch:{ Exception -> 0x025c }
            r0 = r16
            r1.<init>(r5, r0, r3)     // Catch:{ Exception -> 0x025c }
            goto L_0x01d8
        L_0x01d3:
            X.0Ve r1 = new X.0Ve     // Catch:{ Exception -> 0x025c }
            r1.<init>((int) r5, (int) r3)     // Catch:{ Exception -> 0x025c }
        L_0x01d8:
            if (r6 == r2) goto L_0x01fa
            r5 = 2
            if (r6 == r5) goto L_0x01ec
            int[] r3 = r1.A01     // Catch:{ Exception -> 0x025c }
            float[] r0 = r1.A00     // Catch:{ Exception -> 0x025c }
            if (r4 == r2) goto L_0x01e9
            if (r4 == r5) goto L_0x01e6
            goto L_0x0220
        L_0x01e6:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x025c }
            goto L_0x0222
        L_0x01e9:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x025c }
            goto L_0x0222
        L_0x01ec:
            int[] r4 = r1.A01     // Catch:{ Exception -> 0x025c }
            float[] r3 = r1.A00     // Catch:{ Exception -> 0x025c }
            android.graphics.SweepGradient r2 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x025c }
            r1 = r19
            r0 = r18
            r2.<init>(r1, r0, r4, r3)     // Catch:{ Exception -> 0x025c }
            goto L_0x022d
        L_0x01fa:
            int r0 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            int[] r3 = r1.A01     // Catch:{ Exception -> 0x025c }
            float[] r1 = r1.A00     // Catch:{ Exception -> 0x025c }
            if (r4 == r2) goto L_0x020b
            r0 = 2
            if (r4 == r0) goto L_0x0208
            goto L_0x020e
        L_0x0208:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x025c }
            goto L_0x0210
        L_0x020b:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x025c }
            goto L_0x0210
        L_0x020e:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x025c }
        L_0x0210:
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x025c }
            r21 = r2
            r22 = r19
            r23 = r18
            r25 = r3
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x025c }
            goto L_0x022d
        L_0x0220:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x025c }
        L_0x0222:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x025c }
            r19 = r2
            r24 = r3
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x025c }
        L_0x022d:
            r0 = 0
            X.0Le r3 = new X.0Le     // Catch:{ Exception -> 0x025c }
            r3.<init>(r0, r2, r8)     // Catch:{ Exception -> 0x025c }
            return r3
        L_0x0234:
            java.lang.String r0 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x025b
        L_0x023c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r9)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": invalid gradient color tag "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x025c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x025b
        L_0x024c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r9)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": unsupported complex color tag "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x025c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
        L_0x025b:
            throw r1     // Catch:{ Exception -> 0x025c }
        L_0x025c:
            r2 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r0 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r0, r2)
        L_0x0264:
            r0 = 0
            X.0Le r3 = new X.0Le
            r3.<init>(r0, r0, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AQ.A02(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.0Le");
    }

    public static AnonymousClass0AQ A03(Resources.Theme theme, Resources resources, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0AQ r2 = new AnonymousClass0AQ();
            Drawable A002 = C02680He.A00(theme, resources, i);
            r2.A00 = A002;
            r2.A02 = new AnonymousClass010(A002.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    AnonymousClass0AQ r0 = new AnonymousClass0AQ();
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public PorterDuffColorFilter A04(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        AnonymousClass0YG.A08(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A07;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A00;
            if (colorFilter == null) {
                colorFilter = this.A01;
            }
            Matrix matrix = this.A06;
            canvas.getMatrix(matrix);
            float[] fArr = this.A08;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && C06130Wj.A00(this) == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                AnonymousClass012 r1 = this.A03;
                Bitmap bitmap = r1.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == r1.A04.getHeight())) {
                    r1.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    r1.A0A = true;
                }
                boolean z = this.A04;
                AnonymousClass012 r8 = this.A03;
                if (!z) {
                    r8.A00(min, min2);
                } else if (!(!r8.A0A && r8.A02 == r8.A03 && r8.A06 == r8.A07 && r8.A0B == r8.A09 && r8.A00 == r8.A08.A05)) {
                    r8.A00(min, min2);
                    AnonymousClass012 r12 = this.A03;
                    r12.A02 = r12.A03;
                    r12.A06 = r12.A07;
                    r12.A00 = r12.A08.A05;
                    r12.A0B = r12.A09;
                    r12.A0A = false;
                }
                AnonymousClass012 r6 = this.A03;
                if (r6.A08.A05 < 255 || colorFilter != null) {
                    if (r6.A05 == null) {
                        Paint paint2 = new Paint();
                        r6.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r6.A05.setAlpha(r6.A08.A05);
                    r6.A05.setColorFilter(colorFilter);
                    paint = r6.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r6.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0X1.A00(drawable);
        }
        return this.A03.A08.A05;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A03.A01;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0YG.A00(drawable);
        }
        return this.A00;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass010(drawable.getConstantState());
        }
        this.A03.A01 = getChangingConfigurations();
        return this.A03;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A03.A08.A00;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A03.A08.A01;
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ColorStateList A012;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            AnonymousClass0YG.A02(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        AnonymousClass012 r3 = this.A03;
        r3.A08 = new AnonymousClass0WC();
        TypedArray A013 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A0A);
        AnonymousClass012 r11 = this.A03;
        AnonymousClass0WC r10 = r11.A08;
        if (!C05790Uy.A02("tintMode", xmlPullParser2)) {
            i = -1;
        } else {
            i = A013.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        r11.A07 = mode;
        if (C05790Uy.A02("tint", xmlPullParser2)) {
            TypedValue typedValue = new TypedValue();
            A013.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 != 2) {
                if (i6 < 28 || i6 > 31) {
                    Resources resources3 = A013.getResources();
                    try {
                        A012 = AnonymousClass0VI.A01(theme2, resources3, resources3.getXml(A013.getResourceId(1, 0)));
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                } else {
                    A012 = ColorStateList.valueOf(typedValue.data);
                }
                if (A012 != null) {
                    r11.A03 = A012;
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Failed to resolve attribute at index ");
                A0o.append(1);
                throw AnonymousClass002.A0G(AnonymousClass000.A0P(typedValue, ": ", A0o));
            }
        }
        boolean z = r11.A09;
        if (C05790Uy.A02("autoMirrored", xmlPullParser2)) {
            z = A013.getBoolean(5, z);
        }
        r11.A09 = z;
        r10.A03 = A01(A013, "viewportWidth", xmlPullParser2, r10.A03, 7);
        float A014 = A01(A013, "viewportHeight", xmlPullParser2, r10.A02, 8);
        r10.A02 = A014;
        if (r10.A03 <= 0.0f) {
            throw new XmlPullParserException(AnonymousClass000.A0X("<vector> tag requires viewportWidth > 0", AnonymousClass01K.A00(A013)));
        } else if (A014 > 0.0f) {
            r10.A01 = A013.getDimension(3, r10.A01);
            float dimension = A013.getDimension(2, r10.A00);
            r10.A00 = dimension;
            if (r10.A01 <= 0.0f) {
                throw new XmlPullParserException(AnonymousClass000.A0X("<vector> tag requires width > 0", AnonymousClass01K.A00(A013)));
            } else if (dimension > 0.0f) {
                r10.setAlpha(A01(A013, "alpha", xmlPullParser2, r10.getAlpha(), 4));
                String string = A013.getString(0);
                if (string != null) {
                    r10.A0A = string;
                    r10.A0E.put(string, r10);
                }
                A013.recycle();
                r3.A01 = getChangingConfigurations();
                r3.A0A = true;
                AnonymousClass012 r9 = this.A03;
                AnonymousClass0WC r1 = r9.A08;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(r1.A0F);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z2 = true;
                while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser2.getName();
                        AnonymousClass0AT r102 = (AnonymousClass0AT) arrayDeque.peek();
                        if ("path".equals(name)) {
                            AnonymousClass0AV r13 = new AnonymousClass0AV();
                            TypedArray A015 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A09);
                            r13.A0B = null;
                            if (C05790Uy.A02("pathData", xmlPullParser2)) {
                                String string2 = A015.getString(0);
                                if (string2 != null) {
                                    r13.A02 = string2;
                                }
                                String string3 = A015.getString(2);
                                if (string3 != null) {
                                    r13.A03 = AnonymousClass0WW.A02(string3);
                                }
                                r13.A09 = A02(theme2, A015, "fillColor", xmlPullParser2, 1);
                                r13.A00 = A01(A015, "fillAlpha", xmlPullParser2, r13.A00, 12);
                                int i7 = -1;
                                if (!C05790Uy.A02("strokeLineCap", xmlPullParser2)) {
                                    i5 = -1;
                                } else {
                                    i5 = A015.getInt(8, -1);
                                }
                                Paint.Cap cap = r13.A07;
                                if (i5 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i5 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (i5 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                r13.A07 = cap;
                                if (C05790Uy.A02("strokeLineJoin", xmlPullParser2)) {
                                    i7 = A015.getInt(9, -1);
                                }
                                Paint.Join join = r13.A08;
                                if (i7 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i7 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i7 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                r13.A08 = join;
                                r13.A02 = A01(A015, "strokeMiterLimit", xmlPullParser2, r13.A02, 10);
                                r13.A0A = A02(theme2, A015, "strokeColor", xmlPullParser2, 3);
                                r13.A01 = A01(A015, "strokeAlpha", xmlPullParser2, r13.A01, 11);
                                r13.A03 = A01(A015, "strokeWidth", xmlPullParser2, r13.A03, 4);
                                r13.A04 = A01(A015, "trimPathEnd", xmlPullParser2, r13.A04, 6);
                                r13.A05 = A01(A015, "trimPathOffset", xmlPullParser2, r13.A05, 7);
                                r13.A06 = A01(A015, "trimPathStart", xmlPullParser2, r13.A06, 5);
                                int i8 = r13.A01;
                                if (C05790Uy.A02("fillType", xmlPullParser2)) {
                                    i8 = A015.getInt(13, i8);
                                }
                                r13.A01 = i8;
                            }
                            A015.recycle();
                            r102.A0C.add(r13);
                            String str = r13.A02;
                            if (str != null) {
                                r1.A0E.put(str, r13);
                            }
                            r9.A01 = r13.A00 | r9.A01;
                            z2 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                AnonymousClass0AU r132 = new AnonymousClass0AU();
                                if (C05790Uy.A02("pathData", xmlPullParser2)) {
                                    TypedArray A016 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A07);
                                    String string4 = A016.getString(0);
                                    if (string4 != null) {
                                        r132.A02 = string4;
                                    }
                                    String string5 = A016.getString(1);
                                    if (string5 != null) {
                                        r132.A03 = AnonymousClass0WW.A02(string5);
                                    }
                                    if (!C05790Uy.A02("fillType", xmlPullParser2)) {
                                        i4 = 0;
                                    } else {
                                        i4 = A016.getInt(2, 0);
                                    }
                                    r132.A01 = i4;
                                    A016.recycle();
                                }
                                r102.A0C.add(r132);
                                String str2 = r132.A02;
                                if (str2 != null) {
                                    r1.A0E.put(str2, r132);
                                }
                                i2 = r9.A01;
                                i3 = r132.A00;
                            } else if ("group".equals(name)) {
                                AnonymousClass0AT r112 = new AnonymousClass0AT();
                                TypedArray A017 = C05790Uy.A01(theme2, resources2, attributeSet2, AnonymousClass0KA.A08);
                                r112.A09 = null;
                                r112.A02 = A01(A017, "rotation", xmlPullParser2, r112.A02, 5);
                                r112.A00 = A017.getFloat(1, r112.A00);
                                r112.A01 = A017.getFloat(2, r112.A01);
                                r112.A03 = A01(A017, "scaleX", xmlPullParser2, r112.A03, 3);
                                r112.A04 = A01(A017, "scaleY", xmlPullParser2, r112.A04, 4);
                                r112.A05 = A01(A017, "translateX", xmlPullParser2, r112.A05, 6);
                                r112.A06 = A01(A017, "translateY", xmlPullParser2, r112.A06, 7);
                                String string6 = A017.getString(0);
                                if (string6 != null) {
                                    r112.A08 = string6;
                                }
                                r112.A02();
                                A017.recycle();
                                r102.A0C.add(r112);
                                arrayDeque.push(r112);
                                String str3 = r112.A08;
                                if (str3 != null) {
                                    r1.A0E.put(str3, r112);
                                }
                                i2 = r9.A01;
                                i3 = r112.A07;
                            }
                            r9.A01 = i3 | i2;
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser2.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser2.next();
                }
                if (!z2) {
                    this.A01 = A04(r3.A03, r3.A07);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(AnonymousClass000.A0X("<vector> tag requires height > 0", AnonymousClass01K.A00(A013)));
            }
        } else {
            throw new XmlPullParserException(AnonymousClass000.A0X("<vector> tag requires viewportHeight > 0", AnonymousClass01K.A00(A013)));
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0X1.A04(drawable);
        }
        return this.A03.A09;
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass012 r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        AnonymousClass0WC r1 = r0.A08;
        Boolean bool = r1.A09;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A00());
            r1.A09 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A03.A03;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A05 && super.mutate() == this) {
            this.A03 = new AnonymousClass012(this.A03);
            this.A05 = true;
            return this;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        AnonymousClass012 r4 = this.A03;
        ColorStateList colorStateList = r4.A03;
        if (colorStateList == null || (mode = r4.A07) == null) {
            z = false;
        } else {
            this.A01 = A04(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        AnonymousClass0WC r1 = r4.A08;
        Boolean bool = r1.A09;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A00());
            r1.A09 = bool;
        }
        if (bool.booleanValue()) {
            boolean A012 = r4.A08.A0F.A01(iArr);
            r4.A0A |= A012;
            if (A012) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        AnonymousClass0WC r1 = this.A03.A08;
        if (r1.A05 != i) {
            r1.A05 = i;
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0X1.A03(drawable, z);
        } else {
            this.A03.A09 = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A00 = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A06(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A01(colorStateList, drawable);
            return;
        }
        AnonymousClass012 r1 = this.A03;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A01 = A04(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A04(mode, drawable);
            return;
        }
        AnonymousClass012 r1 = this.A03;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A01 = A04(r1.A03, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public AnonymousClass0AQ(AnonymousClass012 r3) {
        this.A04 = true;
        this.A08 = new float[9];
        this.A06 = AnonymousClass002.A05();
        this.A07 = AnonymousClass001.A0N();
        this.A03 = r3;
        this.A01 = A04(r3.A03, r3.A07);
    }

    public static float A01(TypedArray typedArray, String str, XmlPullParser xmlPullParser, float f, int i) {
        if (!C05790Uy.A02(str, xmlPullParser)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public AnonymousClass0AQ() {
        this.A04 = true;
        this.A08 = new float[9];
        this.A06 = AnonymousClass002.A05();
        this.A07 = AnonymousClass001.A0N();
        this.A03 = new AnonymousClass012();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }
}
