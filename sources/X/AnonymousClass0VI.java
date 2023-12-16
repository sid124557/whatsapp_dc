package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0VI  reason: invalid class name */
public final class AnonymousClass0VI {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r1v44, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r5.hasValue(3) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r5.hasValue(2) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r10 > 100.0f) goto L_0x00fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList A00(android.content.res.Resources.Theme r29, android.content.res.Resources r30, android.util.AttributeSet r31, org.xmlpull.v1.XmlPullParser r32) {
        /*
            java.lang.String r2 = r32.getName()
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0306
            int r0 = r32.getDepth()
            r1 = 1
            int r28 = r0 + 1
            r2 = 20
            int[][] r0 = new int[r2][]
            r27 = r0
            int[] r0 = new int[r2]
            r26 = r0
            r7 = 0
        L_0x001e:
            int r3 = r32.next()
            if (r3 == r1) goto L_0x02f1
            int r2 = r32.getDepth()
            r0 = r28
            if (r2 >= r0) goto L_0x002f
            r0 = 3
            if (r3 == r0) goto L_0x02f1
        L_0x002f:
            r0 = 2
            if (r3 != r0) goto L_0x0146
            r0 = r28
            if (r2 > r0) goto L_0x0146
            java.lang.String r2 = r32.getName()
            java.lang.String r0 = "item"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0146
            int[] r2 = X.AnonymousClass0K6.A00
            r10 = r29
            r8 = r30
            r11 = r31
            if (r29 != 0) goto L_0x00e6
            android.content.res.TypedArray r5 = r8.obtainAttributes(r11, r2)
        L_0x0050:
            r9 = 0
            r6 = 0
            r0 = -1
            int r12 = r5.getResourceId(r9, r0)
            r4 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r0) goto L_0x0086
            java.lang.ThreadLocal r0 = A00
            android.util.TypedValue r0 = X.AnonymousClass001.A0P(r0)
            r3 = 1
            r8.getValue(r12, r0, r1)
            int r2 = r0.type
            r0 = 28
            if (r2 < r0) goto L_0x0084
            r0 = 31
            if (r2 > r0) goto L_0x0084
        L_0x0070:
            if (r3 != 0) goto L_0x0086
            android.content.res.XmlResourceParser r0 = r8.getXml(r12)     // Catch:{ Exception -> 0x007f }
            android.content.res.ColorStateList r0 = A01(r10, r8, r0)     // Catch:{ Exception -> 0x007f }
            int r2 = r0.getDefaultColor()     // Catch:{ Exception -> 0x007f }
            goto L_0x008a
        L_0x007f:
            int r2 = r5.getColor(r9, r4)
            goto L_0x008a
        L_0x0084:
            r3 = 0
            goto L_0x0070
        L_0x0086:
            int r2 = r5.getColor(r9, r4)
        L_0x008a:
            r3 = 1
            boolean r0 = r5.hasValue(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x009a
            r3 = 3
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x009e
        L_0x009a:
            float r1 = r5.getFloat(r3, r1)
        L_0x009e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 < r0) goto L_0x00e4
            r3 = 2
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x00e4
        L_0x00ad:
            float r10 = r5.getFloat(r3, r4)
            r5.recycle()
            int r12 = r11.getAttributeCount()
            int[] r8 = new int[r12]
            r5 = 0
        L_0x00bb:
            if (r5 >= r12) goto L_0x00ed
            int r4 = r11.getAttributeNameResource(r5)
            r0 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r0) goto L_0x00e1
            r0 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r0) goto L_0x00e1
            r0 = 2130968653(0x7f04004d, float:1.7545966E38)
            if (r4 == r0) goto L_0x00e1
            r0 = 2130969861(0x7f040505, float:1.7548416E38)
            if (r4 == r0) goto L_0x00e1
            int r3 = r9 + 1
            boolean r0 = r11.getAttributeBooleanValue(r5, r6)
            if (r0 != 0) goto L_0x00de
            int r4 = -r4
        L_0x00de:
            r8[r9] = r4
            r9 = r3
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00bb
        L_0x00e4:
            r3 = 4
            goto L_0x00ad
        L_0x00e6:
            r0 = 0
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r2, r0, r0)
            goto L_0x0050
        L_0x00ed:
            int[] r25 = android.util.StateSet.trimStateSet(r8, r9)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00fd
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00fe
        L_0x00fd:
            r3 = 0
        L_0x00fe:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0149
            if (r3 != 0) goto L_0x0149
        L_0x0106:
            int r1 = r7 + 1
            r0 = r26
            int r0 = r0.length
            if (r1 <= r0) goto L_0x011d
            r1 = 4
            int r0 = r7 * 2
            if (r7 > r1) goto L_0x0114
            r0 = 8
        L_0x0114:
            int[] r1 = new int[r0]
            r0 = r26
            java.lang.System.arraycopy(r0, r6, r1, r6, r7)
            r26 = r1
        L_0x011d:
            r26[r7] = r2
            int r1 = r7 + 1
            r0 = r27
            int r0 = r0.length
            if (r1 <= r0) goto L_0x0142
            java.lang.Class r0 = r27.getClass()
            java.lang.Class r2 = r0.getComponentType()
            r1 = 4
            int r0 = r7 * 2
            if (r7 > r1) goto L_0x0135
            r0 = 8
        L_0x0135:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r27
            java.lang.System.arraycopy(r0, r6, r1, r6, r7)
            r27 = r1
        L_0x0142:
            r27[r7] = r25
            int r7 = r7 + 1
        L_0x0146:
            r1 = 1
            goto L_0x001e
        L_0x0149:
            int r0 = android.graphics.Color.alpha(r2)
            float r0 = (float) r0
            int r24 = X.AnonymousClass001.A06(r0, r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r24
            if (r0 >= r6) goto L_0x02eb
            r24 = 0
        L_0x015a:
            if (r3 == 0) goto L_0x0255
            X.0TN r12 = X.AnonymousClass0TN.A0A
            X.0Vv r0 = X.C06010Vv.A01(r12, r2)
            float r5 = r0.A03
            float r11 = r0.A02
            double r0 = (double) r11
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x029d
            int r0 = java.lang.Math.round(r10)
            double r0 = (double) r0
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x029d
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x029d
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0295
            r23 = 0
        L_0x0185:
            r22 = 0
            r3 = r11
            r9 = 0
            r21 = 1
        L_0x018b:
            float r1 = X.AnonymousClass002.A00(r9, r11)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x028c
            r20 = 0
            r19 = 1120403456(0x42c80000, float:100.0)
            r18 = 1148846080(0x447a0000, float:1000.0)
            r8 = 0
            r17 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
        L_0x01a0:
            r0 = r19
            float r1 = X.AnonymousClass002.A00(r5, r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x024b
            float r4 = r19 - r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r4 = r4 + r5
            r0 = r23
            X.0Vv r0 = X.C06010Vv.A00(r4, r3, r0)
            int r13 = r0.A02(r12)
            int r0 = android.graphics.Color.red(r13)
            float r0 = X.C05210Sl.A00(r0)
            int r1 = android.graphics.Color.green(r13)
            float r16 = X.C05210Sl.A00(r1)
            int r1 = android.graphics.Color.blue(r13)
            float r15 = X.C05210Sl.A00(r1)
            float[][] r1 = X.C05210Sl.A02
            r14 = 1
            r2 = r1[r14]
            r1 = r2[r6]
            float r0 = r0 * r1
            r1 = r2[r14]
            float r16 = r16 * r1
            float r0 = r0 + r16
            r1 = 2
            r1 = r2[r1]
            float r15 = r15 * r1
            float r0 = r0 + r15
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r1 = 1007753895(0x3c111aa7, float:0.008856452)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x027e
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            float r0 = r0 * r1
        L_0x01f6:
            float r16 = X.AnonymousClass002.A00(r10, r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0243
            X.0Vv r13 = X.C06010Vv.A01(r12, r13)
            float r14 = r13.A04
            float r2 = r13.A02
            r1 = r23
            X.0Vv r1 = X.C06010Vv.A00(r14, r2, r1)
            float r15 = r13.A05
            float r2 = r1.A05
            float r15 = r15 - r2
            float r14 = r13.A00
            float r2 = r1.A00
            float r14 = r14 - r2
            float r2 = r13.A01
            float r1 = r1.A01
            float r2 = r2 - r1
            float r15 = r15 * r15
            float r14 = r14 * r14
            float r15 = r15 + r14
            float r2 = r2 * r2
            float r15 = r15 + r2
            double r1 = (double) r15
            double r14 = java.lang.Math.sqrt(r1)
            r1 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r1 = java.lang.Math.pow(r14, r1)
            r14 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r1 = r1 * r14
            float r14 = (float) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0243
            r8 = r13
            r18 = r16
            r17 = r14
        L_0x0243:
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0273
            int r1 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0273
        L_0x024b:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r21 == 0) goto L_0x0266
            if (r8 == 0) goto L_0x025e
            int r2 = r8.A02(r12)
        L_0x0255:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            int r0 = r24 << 24
            r2 = r2 | r0
            goto L_0x0106
        L_0x025e:
            float r3 = r11 - r9
            float r3 = r3 / r0
            float r3 = r3 + r9
            r21 = 0
            goto L_0x018b
        L_0x0266:
            if (r8 != 0) goto L_0x026f
            r11 = r3
        L_0x0269:
            float r3 = r11 - r9
            float r3 = r3 / r0
            float r3 = r3 + r9
            goto L_0x018b
        L_0x026f:
            r9 = r3
            r22 = r8
            goto L_0x0269
        L_0x0273:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            r5 = r4
            goto L_0x01a0
        L_0x027a:
            r19 = r4
            goto L_0x01a0
        L_0x027e:
            double r0 = (double) r0
            double r1 = java.lang.Math.cbrt(r0)
            float r0 = (float) r1
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 - r1
            goto L_0x01f6
        L_0x028c:
            if (r22 == 0) goto L_0x029d
            r0 = r22
            int r2 = r0.A02(r12)
            goto L_0x0255
        L_0x0295:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r23 = java.lang.Math.min(r0, r5)
            goto L_0x0185
        L_0x029d:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a6
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0255
        L_0x02a6:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ae
            r2 = -1
            goto L_0x0255
        L_0x02ae:
            r8 = 1098907648(0x41800000, float:16.0)
            float r5 = r10 + r8
            r4 = 1122500608(0x42e80000, float:116.0)
            float r5 = r5 / r4
            r0 = 1090519040(0x41000000, float:8.0)
            r3 = 1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            if (r0 == 0) goto L_0x02e9
            float r10 = r5 * r5
            float r10 = r10 * r5
        L_0x02c6:
            float r2 = r5 * r5
            float r2 = r2 * r5
            r0 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02d4
            float r5 = r5 * r4
            float r5 = r5 - r8
            float r5 = r5 / r1
            r2 = r5
        L_0x02d4:
            float[] r1 = X.C05210Sl.A00
            r0 = r1[r6]
            float r0 = r0 * r2
            double r8 = (double) r0
            r0 = r1[r3]
            float r10 = r10 * r0
            double r10 = (double) r10
            r0 = 2
            r0 = r1[r0]
            float r2 = r2 * r0
            double r12 = (double) r2
            int r2 = X.AnonymousClass0YI.A02(r8, r10, r12)
            goto L_0x0255
        L_0x02e9:
            float r10 = r10 / r1
            goto L_0x02c6
        L_0x02eb:
            if (r0 <= r1) goto L_0x015a
            r24 = 255(0xff, float:3.57E-43)
            goto L_0x015a
        L_0x02f1:
            int[] r3 = new int[r7]
            int[][] r2 = new int[r7][]
            r1 = 0
            r0 = r26
            java.lang.System.arraycopy(r0, r1, r3, r1, r7)
            r0 = r27
            java.lang.System.arraycopy(r0, r1, r2, r1, r7)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r2, r3)
            return r0
        L_0x0306:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r32)
            java.lang.String r0 = ": invalid color state list tag "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VI.A00(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.content.res.ColorStateList");
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, XmlPullParser xmlPullParser) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return A00(theme, resources, asAttributeSet, xmlPullParser);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
