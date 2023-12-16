package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public final class C06400Xn {
    public static final Object A00 = AnonymousClass002.A0D();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static Typeface A02(Context context, int i) {
        Context context2 = context;
        if (context.isRestricted()) {
            return null;
        }
        return A03(context2, new TypedValue(), (C04570Ou) null, i, 0, false, false);
    }

    public static void A04(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static int A00(Resources.Theme theme, Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RU.A00(theme, resources, i);
        }
        return resources.getColor(i);
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C03700Lf r5;
        Resources.Theme theme2;
        AnonymousClass0OJ r4 = new AnonymousClass0OJ(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(r4);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r5 = (C03700Lf) sparseArray.get(i)) == null)) {
                if (!r5.A02.equals(r4.A01.getConfiguration()) || (!((theme2 = r4.A00) == null && r5.A00 == 0) && (theme2 == null || r5.A00 != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList = r5.A01;
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        TypedValue A0P = AnonymousClass001.A0P(A01);
        boolean z = true;
        resources.getValue(i, A0P, true);
        int i2 = A0P.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            try {
                colorStateList2 = AnonymousClass0VI.A01(theme, resources, resources.getXml(i));
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 != null) {
            synchronized (obj) {
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r4);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(r4, sparseArray2);
                }
                sparseArray2.append(i, new C03700Lf(colorStateList2, r4.A01.getConfiguration(), theme));
            }
            return colorStateList2;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RU.A01(theme, resources, i);
        } else {
            return resources.getColorStateList(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        if (r33 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0389, code lost:
        if (r4 != null) goto L_0x038b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0247 A[Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024a A[Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0260 A[Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ca A[Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A03(android.content.Context r31, android.util.TypedValue r32, X.C04570Ou r33, int r34, int r35, boolean r36, boolean r37) {
        /*
            r23 = 0
            android.content.res.Resources r0 = r31.getResources()
            r6 = 1
            r7 = r32
            r2 = r34
            r0.getValue(r2, r7, r6)
            java.lang.String r22 = "ResourcesCompat"
            java.lang.CharSequence r1 = r7.string
            if (r1 == 0) goto L_0x03c0
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r10.startsWith(r1)
            r3 = r33
            if (r1 == 0) goto L_0x03b7
            int r4 = r7.assetCookie
            X.0Qw r21 = X.AnonymousClass0VS.A00
            r1 = r35
            java.lang.String r5 = X.AnonymousClass0VS.A00(r0, r10, r2, r4, r1)
            r4 = r21
            java.lang.Object r4 = r4.A04(r5)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            if (r4 == 0) goto L_0x0061
            if (r33 == 0) goto L_0x0044
            android.os.Handler r1 = X.AnonymousClass000.A0A()
            X.0kG r0 = new X.0kG
            r0.<init>(r4, r3)
            r1.post(r0)
        L_0x0044:
            r23 = r4
        L_0x0046:
            if (r23 != 0) goto L_0x03bf
            if (r33 != 0) goto L_0x03bf
            if (r37 != 0) goto L_0x03bf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Font resource ID #0x"
            X.AnonymousClass000.A1G(r0, r1, r2)
            java.lang.String r0 = " could not be retrieved."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0061:
            if (r37 != 0) goto L_0x0046
            java.lang.String r5 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = ".xml"
            boolean r4 = r5.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x036f
            android.content.res.XmlResourceParser r14 = r0.getXml(r2)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x0073:
            int r4 = r14.next()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r9 = 2
            if (r4 == r9) goto L_0x0085
            if (r4 != r6) goto L_0x0073
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x033a
        L_0x0085:
            r8 = 0
            java.lang.String r5 = "font-family"
            r14.require(r9, r8, r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = r14.getName()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            boolean r4 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x01f8
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            int[] r4 = X.AnonymousClass0K6.A01     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.content.res.TypedArray r12 = r0.obtainAttributes(r5, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = 0
            java.lang.String r20 = r12.getString(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = 4
            java.lang.String r19 = r12.getString(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = 5
            java.lang.String r15 = r12.getString(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5 = 0
            int r4 = r12.getResourceId(r6, r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            int r18 = r12.getInteger(r9, r6)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r11 = 3
            r8 = 500(0x1f4, float:7.0E-43)
            int r17 = r12.getInteger(r11, r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8 = 6
            java.lang.String r16 = r12.getString(r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r12.recycle()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r13 = 3
            if (r20 == 0) goto L_0x0157
            if (r19 == 0) goto L_0x0157
            if (r15 == 0) goto L_0x0157
        L_0x00cd:
            int r8 = r14.next()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r8 == r11) goto L_0x00d7
            A04(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x00cd
        L_0x00d7:
            if (r4 != 0) goto L_0x00da
            goto L_0x013d
        L_0x00da:
            android.content.res.TypedArray r11 = r0.obtainTypedArray(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            int r8 = r11.length()     // Catch:{ all -> 0x0336 }
            if (r8 != 0) goto L_0x00e9
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0336 }
            goto L_0x0139
        L_0x00e9:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0336 }
            int r8 = X.C02670Hd.A00(r11, r5)     // Catch:{ all -> 0x0336 }
            if (r8 != r6) goto L_0x011e
            r13 = 0
        L_0x00f4:
            int r4 = r11.length()     // Catch:{ all -> 0x0336 }
            if (r13 >= r4) goto L_0x0139
            int r4 = r11.getResourceId(r13, r5)     // Catch:{ all -> 0x0336 }
            if (r4 == 0) goto L_0x011b
            java.lang.String[] r9 = r0.getStringArray(r4)     // Catch:{ all -> 0x0336 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0336 }
            int r14 = r9.length     // Catch:{ all -> 0x0336 }
            r6 = 0
        L_0x010a:
            if (r6 >= r14) goto L_0x0118
            r4 = r9[r6]     // Catch:{ all -> 0x0336 }
            byte[] r4 = android.util.Base64.decode(r4, r5)     // Catch:{ all -> 0x0336 }
            r8.add(r4)     // Catch:{ all -> 0x0336 }
            int r6 = r6 + 1
            goto L_0x010a
        L_0x0118:
            r12.add(r8)     // Catch:{ all -> 0x0336 }
        L_0x011b:
            int r13 = r13 + 1
            goto L_0x00f4
        L_0x011e:
            java.lang.String[] r13 = r0.getStringArray(r4)     // Catch:{ all -> 0x0336 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0336 }
            int r8 = r13.length     // Catch:{ all -> 0x0336 }
            r6 = 0
        L_0x0128:
            if (r6 >= r8) goto L_0x0136
            r4 = r13[r6]     // Catch:{ all -> 0x0336 }
            byte[] r4 = android.util.Base64.decode(r4, r5)     // Catch:{ all -> 0x0336 }
            r9.add(r4)     // Catch:{ all -> 0x0336 }
            int r6 = r6 + 1
            goto L_0x0128
        L_0x0136:
            r12.add(r9)     // Catch:{ all -> 0x0336 }
        L_0x0139:
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0141
        L_0x013d:
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x0141:
            X.0Nf r9 = new X.0Nf     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5 = r20
            r4 = r19
            r9.<init>(r5, r4, r15, r12)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0M5 r8 = new X.0M5     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r6 = r16
            r5 = r18
            r4 = r17
            r8.<init>(r9, r6, r5, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x01fd
        L_0x0157:
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x015b:
            int r4 = r14.next()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == r13) goto L_0x01e3
            int r4 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 != r9) goto L_0x015b
            java.lang.String r8 = r14.getName()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = "font"
            boolean r4 = r8.equals(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x01de
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            int[] r4 = X.AnonymousClass0K6.A02     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.content.res.TypedArray r4 = r0.obtainAttributes(r8, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r11 = 8
            boolean r8 = r4.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r8 != 0) goto L_0x0186
            r11 = 1
        L_0x0186:
            r8 = 400(0x190, float:5.6E-43)
            int r27 = r4.getInt(r11, r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8 = 6
            boolean r11 = r4.hasValue(r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r11 != 0) goto L_0x0194
            r8 = 2
        L_0x0194:
            int r8 = r4.getInt(r8, r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            boolean r30 = X.AnonymousClass000.A1U(r6, r8)
            r8 = 9
            boolean r11 = r4.hasValue(r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r11 != 0) goto L_0x01a5
            r8 = 3
        L_0x01a5:
            r11 = 7
            boolean r15 = r4.hasValue(r11)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r15 != 0) goto L_0x01ad
            r11 = 4
        L_0x01ad:
            java.lang.String r26 = r4.getString(r11)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            int r28 = r4.getInt(r8, r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8 = 5
            boolean r11 = r4.hasValue(r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r11 != 0) goto L_0x01bd
            r8 = 0
        L_0x01bd:
            int r29 = r4.getResourceId(r8, r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r25 = r4.getString(r8)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4.recycle()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x01c8:
            int r4 = r14.next()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == r13) goto L_0x01d2
            A04(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x01c8
        L_0x01d2:
            X.0Mb r4 = new X.0Mb     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r12.add(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x015b
        L_0x01de:
            A04(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x015b
        L_0x01e3:
            boolean r4 = r12.isEmpty()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x01ea
            goto L_0x01fc
        L_0x01ea:
            X.0Mb[] r4 = new X.C03920Mb[r5]     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.Object[] r4 = r12.toArray(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Mb[] r4 = (X.C03920Mb[]) r4     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0KK r8 = new X.0KK     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.<init>(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x01fd
        L_0x01f8:
            A04(r14)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x01fd
        L_0x01fc:
            r8 = 0
        L_0x01fd:
            if (r8 != 0) goto L_0x020e
            java.lang.String r1 = "Failed to find font-family tag"
            r0 = r22
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r33 == 0) goto L_0x0046
            r0 = -3
            r3.A00(r0)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0046
        L_0x020e:
            int r6 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            boolean r4 = r8 instanceof X.AnonymousClass0M5     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x0344
            X.0M5 r8 = (X.AnonymousClass0M5) r8     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r7 = r8.A03     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = 0
            if (r7 == 0) goto L_0x0235
            boolean r5 = r7.isEmpty()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r5 != 0) goto L_0x0235
            r9 = 0
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r9)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r9)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r7 == 0) goto L_0x0235
            boolean r5 = r7.equals(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r5 != 0) goto L_0x0235
            r4 = r7
        L_0x0235:
            if (r4 == 0) goto L_0x023b
            if (r33 == 0) goto L_0x0044
            goto L_0x038b
        L_0x023b:
            if (r36 == 0) goto L_0x0242
            int r4 = r8.A00     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 != 0) goto L_0x0248
            goto L_0x0244
        L_0x0242:
            if (r33 != 0) goto L_0x0248
        L_0x0244:
            r9 = 1
        L_0x0245:
            if (r36 == 0) goto L_0x024a
            goto L_0x024c
        L_0x0248:
            r9 = 0
            goto L_0x0245
        L_0x024a:
            r11 = -1
            goto L_0x024e
        L_0x024c:
            int r11 = r8.A01     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x024e:
            android.os.Handler r5 = X.AnonymousClass000.A0A()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Ss r4 = new X.0Ss     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4.<init>(r3)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Nf r7 = r8.A02     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0NA r8 = new X.0NA     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.<init>(r5, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r9 == 0) goto L_0x02ca
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = r7.A00     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = "-"
            java.lang.String r9 = X.AnonymousClass000.A0Y(r4, r5, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Qw r4 = X.C05810Vb.A00     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.Object r4 = r4.A04(r9)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 != 0) goto L_0x033b
            r4 = -1
            if (r11 != r4) goto L_0x0289
            r4 = r31
            X.0Sz r4 = X.C05810Vb.A00(r4, r7, r9, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.A00(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.graphics.Typeface r4 = r4.A01     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0355
        L_0x0289:
            r17 = 0
            X.0wO r5 = new X.0wO     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r12 = r5
            r13 = r31
            r14 = r7
            r15 = r9
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.util.concurrent.ExecutorService r4 = X.C05810Vb.A03     // Catch:{ InterruptedException -> 0x02be }
            java.util.concurrent.Future r9 = r4.submit(r5)     // Catch:{ InterruptedException -> 0x02be }
            long r4 = (long) r11     // Catch:{ InterruptedException -> 0x02be }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x02b7, InterruptedException -> 0x02ad, TimeoutException -> 0x02af }
            java.lang.Object r4 = r9.get(r4, r7)     // Catch:{ ExecutionException -> 0x02b7, InterruptedException -> 0x02ad, TimeoutException -> 0x02af }
            X.0Sz r4 = (X.C05350Sz) r4     // Catch:{ InterruptedException -> 0x02be }
            r8.A00(r4)     // Catch:{ InterruptedException -> 0x02be }
            android.graphics.Typeface r4 = r4.A01     // Catch:{ InterruptedException -> 0x02be }
            goto L_0x0355
        L_0x02ad:
            r5 = move-exception
            goto L_0x02b6
        L_0x02af:
            java.lang.String r4 = "timeout"
            java.lang.InterruptedException r5 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x02be }
            r5.<init>(r4)     // Catch:{ InterruptedException -> 0x02be }
        L_0x02b6:
            throw r5     // Catch:{ InterruptedException -> 0x02be }
        L_0x02b7:
            r5 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x02be }
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x02be }
            throw r4     // Catch:{ InterruptedException -> 0x02be }
        L_0x02be:
            r5 = -3
            X.0Sz r4 = new X.0Sz     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4.<init>((int) r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.A00(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = 0
            goto L_0x0355
        L_0x02ca:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = r7.A00     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.String r4 = "-"
            java.lang.String r5 = X.AnonymousClass000.A0Y(r4, r5, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Qw r4 = X.C05810Vb.A00     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.Object r4 = r4.A04(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 != 0) goto L_0x033b
            r4 = 0
            X.0wV r11 = new X.0wV     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r11.<init>(r8, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.lang.Object r9 = X.C05810Vb.A02     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            monitor-enter(r9)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Wz r8 = X.C05810Vb.A01     // Catch:{ all -> 0x0333 }
            java.lang.Object r4 = r8.get(r5)     // Catch:{ all -> 0x0333 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0333 }
            if (r4 == 0) goto L_0x02fb
            r4.add(r11)     // Catch:{ all -> 0x0333 }
            monitor-exit(r9)     // Catch:{ all -> 0x0333 }
            goto L_0x0353
        L_0x02fb:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0333 }
            r4.add(r11)     // Catch:{ all -> 0x0333 }
            r8.put(r5, r4)     // Catch:{ all -> 0x0333 }
            monitor-exit(r9)     // Catch:{ all -> 0x0333 }
            r16 = 1
            X.0wO r9 = new X.0wO     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r11 = r9
            r12 = r31
            r13 = r7
            r14 = r5
            r15 = r1
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            java.util.concurrent.ExecutorService r8 = X.C05810Vb.A03     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0dB r7 = new X.0dB     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r7.<init>(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 != 0) goto L_0x032d
            android.os.Handler r5 = X.AnonymousClass000.A0A()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x0324:
            X.0lp r4 = new X.0lp     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4.<init>(r5, r7, r9)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.execute(r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0353
        L_0x032d:
            android.os.Handler r5 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0324
        L_0x0333:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0333 }
            goto L_0x033a
        L_0x0336:
            r1 = move-exception
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x033a:
            throw r1     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x033b:
            X.0Sz r5 = new X.0Sz     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5.<init>((android.graphics.Typeface) r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8.A00(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0355
        L_0x0344:
            X.0Q5 r5 = X.AnonymousClass0VS.A01     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0KK r8 = (X.AnonymousClass0KK) r8     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r4 = r31
            android.graphics.Typeface r4 = r5.A01(r4, r0, r8, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r33 == 0) goto L_0x0355
            if (r4 == 0) goto L_0x0399
            goto L_0x0358
        L_0x0353:
            r4 = r23
        L_0x0355:
            if (r4 == 0) goto L_0x0044
            goto L_0x0364
        L_0x0358:
            android.os.Handler r7 = X.AnonymousClass000.A0A()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0kG r5 = new X.0kG     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r5.<init>(r4, r3)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r7.post(r5)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x0364:
            java.lang.String r1 = X.AnonymousClass0VS.A00(r0, r10, r2, r6, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r0 = r21
            r0.A08(r1, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0044
        L_0x036f:
            int r5 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0Q5 r7 = X.AnonymousClass0VS.A01     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r8 = r31
            r9 = r0
            r11 = r2
            r12 = r1
            android.graphics.Typeface r4 = r7.A02(r8, r9, r10, r11, r12)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            if (r4 == 0) goto L_0x0387
            java.lang.String r1 = X.AnonymousClass0VS.A00(r0, r10, r2, r5, r1)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r0 = r21
            r0.A08(r1, r4)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
        L_0x0387:
            if (r33 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0399
        L_0x038b:
            android.os.Handler r1 = X.AnonymousClass000.A0A()     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            X.0kG r0 = new X.0kG     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r0.<init>(r4, r3)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            r1.post(r0)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0044
        L_0x0399:
            r0 = -3
            r3.A00(r0)     // Catch:{ XmlPullParserException -> 0x039f, IOException -> 0x03a7 }
            goto L_0x0044
        L_0x039f:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse xml resource "
            goto L_0x03ae
        L_0x03a7:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to read xml resource "
        L_0x03ae:
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r10, r1)
            r0 = r22
            android.util.Log.e(r0, r1, r4)
        L_0x03b7:
            if (r33 == 0) goto L_0x0046
            r0 = -3
            r3.A00(r0)
            goto L_0x0046
        L_0x03bf:
            return r23
        L_0x03c0:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Resource \""
            r3.append(r1)
            java.lang.String r0 = r0.getResourceName(r2)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            X.AnonymousClass000.A1G(r0, r3, r2)
            java.lang.String r0 = ") is not a Font: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r0, r3)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06400Xn.A03(android.content.Context, android.util.TypedValue, X.0Ou, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
