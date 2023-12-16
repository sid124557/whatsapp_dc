package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0M3  reason: invalid class name */
public class AnonymousClass0M3 {
    public SparseArray A00 = new SparseArray();
    public SparseArray A01 = new SparseArray();
    public AnonymousClass0GU A02 = null;
    public final ConstraintLayout A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0677, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0678, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x067d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x067e, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0688, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0689, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r14 == -1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0688 A[ExcHandler: IOException | XmlPullParserException (r0v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0M3(android.content.Context r21, androidx.constraintlayout.widget.ConstraintLayout r22, int r23) {
        /*
            r20 = this;
            r10 = r20
            r10.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r10.A01 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r10.A00 = r0
            r17 = 0
            r0 = r17
            r10.A02 = r0
            r0 = r22
            r10.A03 = r0
            r11 = r21
            android.content.res.Resources r0 = r11.getResources()
            r1 = r23
            android.content.res.XmlResourceParser r18 = r0.getXml(r1)
            int r1 = r18.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r9 = 0
        L_0x002e:
            r0 = 1
            if (r1 == r0) goto L_0x068c
            if (r1 == 0) goto L_0x0037
            r0 = 2
            if (r1 != r0) goto L_0x0055
            goto L_0x003b
        L_0x0037:
            r18.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0055
        L_0x003b:
            java.lang.String r1 = r18.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r0 = r1.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            switch(r0) {
                case -1349929691: goto L_0x009a;
                case 80204913: goto L_0x0083;
                case 1382829617: goto L_0x007a;
                case 1657696882: goto L_0x0071;
                case 1901439077: goto L_0x005a;
                default: goto L_0x0046;
            }     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
        L_0x0046:
            java.lang.String r3 = "ConstraintLayoutStates"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = "unknown tag "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            android.util.Log.v(r3, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
        L_0x0055:
            int r1 = r18.next()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x002e
        L_0x005a:
            java.lang.String r0 = "Variant"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0046
            X.0MZ r1 = new X.0MZ     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r0 = r18
            r1.<init>(r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r9 == 0) goto L_0x0055
            java.util.ArrayList r0 = r9.A03     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r0.add(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0055
        L_0x0071:
            java.lang.String r0 = "layoutDescription"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0046
            goto L_0x0055
        L_0x007a:
            java.lang.String r0 = "StateSet"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0046
            goto L_0x0055
        L_0x0083:
            java.lang.String r0 = "State"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0046
            X.0M2 r9 = new X.0M2     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r0 = r18
            r9.<init>(r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            android.util.SparseArray r1 = r10.A01     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r0 = r9.A01     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r1.put(r0, r9)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0055
        L_0x009a:
            java.lang.String r13 = "ConstraintSet"
            boolean r0 = r1.equals(r13)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0046
            X.0XZ r12 = new X.0XZ     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r12.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r2 = r18.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r1 = 0
        L_0x00ac:
            if (r1 >= r2) goto L_0x0055
            r0 = r18
            java.lang.String r0 = r0.getAttributeName(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r4 = "id"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x00f7
            r0 = r18
            java.lang.String r3 = r0.getAttributeValue(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = "/"
            boolean r0 = r3.contains(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r15 = 1
            if (r0 == 0) goto L_0x00f5
            r0 = 47
            int r0 = r3.indexOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r0 = r0 + 1
            java.lang.String r2 = r3.substring(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = r11.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r14 = r1.getIdentifier(r2, r4, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r0 = -1
            if (r14 != r0) goto L_0x0101
        L_0x00e6:
            int r0 = r3.length()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            if (r0 <= r15) goto L_0x00fa
            java.lang.String r0 = r3.substring(r15)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0101
        L_0x00f5:
            r14 = -1
            goto L_0x00e6
        L_0x00f7:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00fa:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
        L_0x0101:
            int r3 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r8 = r17
        L_0x0107:
            if (r3 == r15) goto L_0x0681
            if (r3 == 0) goto L_0x0656
            java.lang.String r2 = "Constraint"
            r1 = 3
            r0 = 2
            if (r3 == r0) goto L_0x0132
            if (r3 != r1) goto L_0x0659
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            boolean r0 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 != 0) goto L_0x0681
            boolean r0 = r1.equalsIgnoreCase(r2)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            java.util.HashMap r1 = r12.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1.put(r0, r8)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r8 = r17
            goto L_0x0659
        L_0x0132:
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            switch(r0) {
                case -2025855158: goto L_0x03ba;
                case -1984451626: goto L_0x0341;
                case -1269513683: goto L_0x02e2;
                case -1238332596: goto L_0x0249;
                case -71750448: goto L_0x0231;
                case 1331510167: goto L_0x021b;
                case 1791837707: goto L_0x014f;
                case 1803088381: goto L_0x013f;
                default: goto L_0x013d;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x013d:
            goto L_0x0659
        L_0x013f:
            boolean r0 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0Oe r8 = r12.A05(r11, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x014f:
            java.lang.String r0 = "CustomAttribute"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x065f
            java.util.HashMap r0 = r8.A01     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r19 = r0
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0K9.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r16 = r7.getIndexCount()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r6 = 0
            r5 = 0
            r4 = r6
            r3 = r6
            r2 = 0
        L_0x0170:
            r0 = r16
            if (r2 >= r0) goto L_0x0208
            int r1 = r7.getIndex(r2)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r1 != r5) goto L_0x019e
            java.lang.String r6 = r7.getString(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r6 == 0) goto L_0x0204
            int r0 = r6.length()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 <= 0) goto L_0x0204
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            char r0 = r6.charAt(r5)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            char r0 = java.lang.Character.toUpperCase(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = r6.substring(r15)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0204
        L_0x019e:
            if (r1 != r15) goto L_0x01ab
            boolean r0 = r7.getBoolean(r1, r5)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0Fz r3 = X.C02390Fz.BOOLEAN_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0204
        L_0x01ab:
            r0 = 3
            if (r1 != r0) goto L_0x01b1
            X.0Fz r3 = X.C02390Fz.COLOR_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x01f1
        L_0x01b1:
            r0 = 2
            if (r1 != r0) goto L_0x01b5
            goto L_0x01ef
        L_0x01b5:
            r0 = 7
            if (r1 != r0) goto L_0x01c8
            X.0Fz r3 = X.C02390Fz.DIMENSION_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = 0
            float r1 = r7.getDimension(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r11)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = android.util.TypedValue.applyDimension(r15, r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x01df
        L_0x01c8:
            r0 = 4
            if (r1 != r0) goto L_0x01cc
            goto L_0x01d8
        L_0x01cc:
            r0 = 5
            if (r1 != r0) goto L_0x01e4
            X.0Fz r3 = X.C02390Fz.FLOAT_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = 2143289344(0x7fc00000, float:NaN)
            float r0 = r7.getFloat(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x01df
        L_0x01d8:
            X.0Fz r3 = X.C02390Fz.DIMENSION_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = 0
            float r0 = r7.getDimension(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x01df:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0204
        L_0x01e4:
            r0 = 6
            if (r1 != r0) goto L_0x01fa
            X.0Fz r3 = X.C02390Fz.INT_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = -1
            int r0 = r7.getInteger(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x01f5
        L_0x01ef:
            X.0Fz r3 = X.C02390Fz.COLOR_DRAWABLE_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x01f1:
            int r0 = r7.getColor(r1, r5)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x01f5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0204
        L_0x01fa:
            r0 = 8
            if (r1 != r0) goto L_0x0204
            X.0Fz r3 = X.C02390Fz.STRING_TYPE     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r4 = r7.getString(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0204:
            int r2 = r2 + 1
            goto L_0x0170
        L_0x0208:
            if (r6 == 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            X.0Tj r1 = new X.0Tj     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1.<init>(r3, r4, r6)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = r19
            r0.put(r6, r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0216:
            r7.recycle()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x021b:
            java.lang.String r0 = "Barrier"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0Oe r8 = r12.A05(r11, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0TP r0 = r8.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0.A0b = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x0231:
            java.lang.String r0 = "Guideline"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0Oe r8 = r12.A05(r11, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            X.0TP r0 = r8.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0.A0y = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0.A0w = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x0249:
            java.lang.String r0 = "Transform"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x0664
            X.0TO r4 = r8.A05     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0K9.A07     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A0C = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r2 = r3.getIndexCount()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1 = 0
        L_0x0266:
            if (r1 >= r2) goto L_0x02dd
            int r5 = r3.getIndex(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.SparseIntArray r0 = X.AnonymousClass0TO.A0D     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r0.get(r5)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            switch(r0) {
                case 1: goto L_0x0276;
                case 2: goto L_0x027f;
                case 3: goto L_0x0288;
                case 4: goto L_0x0291;
                case 5: goto L_0x029a;
                case 6: goto L_0x02a3;
                case 7: goto L_0x02ac;
                case 8: goto L_0x02b5;
                case 9: goto L_0x02be;
                case 10: goto L_0x02c7;
                case 11: goto L_0x02d0;
                default: goto L_0x0275;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0275:
            goto L_0x02da
        L_0x0276:
            float r0 = r4.A01     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x027f:
            float r0 = r4.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x0288:
            float r0 = r4.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x0291:
            float r0 = r4.A04     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A04 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x029a:
            float r0 = r4.A05     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A05 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02a3:
            float r0 = r4.A06     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A06 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02ac:
            float r0 = r4.A07     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A07 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02b5:
            float r0 = r4.A08     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A08 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02be:
            float r0 = r4.A09     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A09 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02c7:
            float r0 = r4.A0A     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A0A = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x02da
        L_0x02d0:
            r4.A0B = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r4.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getDimension(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x02da:
            int r1 = r1 + 1
            goto L_0x0266
        L_0x02dd:
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x02e2:
            java.lang.String r0 = "PropertySet"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x0669
            X.0MI r4 = r8.A04     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0K9.A05     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A04 = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r2 = r3.getIndexCount()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1 = 0
        L_0x02ff:
            if (r1 >= r2) goto L_0x033c
            int r5 = r3.getIndex(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r5 != r15) goto L_0x0310
            float r0 = r4.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0339
        L_0x0310:
            r0 = 0
            if (r5 != r0) goto L_0x0322
            int r0 = r4.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r5 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A03 = r5     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0XZ.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = r0[r5]     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0339
        L_0x0322:
            r0 = 4
            if (r5 != r0) goto L_0x032e
            int r0 = r4.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r3.getInt(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0339
        L_0x032e:
            r0 = 3
            if (r5 != r0) goto L_0x0339
            float r0 = r4.A01     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0339:
            int r1 = r1 + 1
            goto L_0x02ff
        L_0x033c:
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x0341:
            java.lang.String r0 = "Motion"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x066e
            X.0TL r4 = r8.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0K9.A04     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A06 = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r7 = r3.getIndexCount()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r2 = 0
            r1 = 0
        L_0x035f:
            if (r1 >= r7) goto L_0x03b5
            int r6 = r3.getIndex(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.SparseIntArray r0 = X.AnonymousClass0TL.A07     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r0.get(r6)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            switch(r0) {
                case 1: goto L_0x03aa;
                case 2: goto L_0x03a1;
                case 3: goto L_0x0388;
                case 4: goto L_0x0381;
                case 5: goto L_0x0378;
                case 6: goto L_0x036f;
                default: goto L_0x036e;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x036e:
            goto L_0x03b2
        L_0x036f:
            float r0 = r4.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x03b2
        L_0x0378:
            int r0 = r4.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r3, r6, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x03b2
        L_0x0381:
            int r0 = r3.getInt(r6, r2)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x03b2
        L_0x0388:
            android.util.TypedValue r0 = r3.peekValue(r6)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r5 = r0.type     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = 3
            if (r5 != r0) goto L_0x0398
            java.lang.String r0 = r3.getString(r6)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0395:
            r4.A05 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x03b2
        L_0x0398:
            java.lang.String[] r5 = X.AnonymousClass0JS.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r3.getInteger(r6, r2)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = r5[r0]     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0395
        L_0x03a1:
            int r0 = r4.A04     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r3.getInt(r6, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A04 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x03b2
        L_0x03aa:
            float r0 = r4.A01     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r3.getFloat(r6, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x03b2:
            int r1 = r1 + 1
            goto L_0x035f
        L_0x03b5:
            r3.recycle()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x03ba:
            java.lang.String r0 = "Layout"
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            if (r0 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x0673
            X.0TP r3 = r8.A02     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int[] r0 = X.AnonymousClass0K9.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0w = r15     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r16 = r2.getIndexCount()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r1 = 0
        L_0x03d7:
            r0 = r16
            if (r1 >= r0) goto L_0x0652
            int r4 = r2.getIndex(r1)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.SparseIntArray r6 = X.AnonymousClass0TP.A10     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r5 = r6.get(r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r0 = 80
            if (r5 == r0) goto L_0x0646
            r0 = 81
            if (r5 == r0) goto L_0x063d
            switch(r5) {
                case 1: goto L_0x0634;
                case 2: goto L_0x062b;
                case 3: goto L_0x0622;
                case 4: goto L_0x0619;
                case 5: goto L_0x0612;
                case 6: goto L_0x0609;
                case 7: goto L_0x0600;
                case 8: goto L_0x05f7;
                case 9: goto L_0x05ee;
                case 10: goto L_0x05e5;
                case 11: goto L_0x05dc;
                case 12: goto L_0x05d3;
                case 13: goto L_0x05ca;
                case 14: goto L_0x05c0;
                case 15: goto L_0x05b6;
                case 16: goto L_0x05ac;
                case 17: goto L_0x05a2;
                case 18: goto L_0x0598;
                case 19: goto L_0x058e;
                case 20: goto L_0x0584;
                case 21: goto L_0x057a;
                case 22: goto L_0x0570;
                case 23: goto L_0x0566;
                case 24: goto L_0x055c;
                case 25: goto L_0x0552;
                case 26: goto L_0x0548;
                case 27: goto L_0x053e;
                case 28: goto L_0x0534;
                case 29: goto L_0x052a;
                case 30: goto L_0x0520;
                case 31: goto L_0x0516;
                case 32: goto L_0x050c;
                case 33: goto L_0x0502;
                case 34: goto L_0x04f8;
                case 35: goto L_0x04ee;
                case 36: goto L_0x04e4;
                case 37: goto L_0x04da;
                case 38: goto L_0x04d0;
                case 39: goto L_0x04c6;
                case 40: goto L_0x04bc;
                default: goto L_0x03f0;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x03f0:
            switch(r5) {
                case 54: goto L_0x04b2;
                case 55: goto L_0x04a8;
                case 56: goto L_0x049e;
                case 57: goto L_0x0494;
                case 58: goto L_0x048a;
                case 59: goto L_0x0480;
                default: goto L_0x03f3;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x03f3:
            switch(r5) {
                case 61: goto L_0x0476;
                case 62: goto L_0x046c;
                case 63: goto L_0x0462;
                default: goto L_0x03f6;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x03f6:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r7 = "   "
            switch(r5) {
                case 69: goto L_0x045a;
                case 70: goto L_0x0452;
                case 71: goto L_0x044b;
                case 72: goto L_0x0441;
                case 73: goto L_0x0437;
                case 74: goto L_0x042f;
                case 75: goto L_0x0425;
                case 76: goto L_0x0416;
                case 77: goto L_0x041d;
                default: goto L_0x03fd;
            }     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x03fd:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = "Unknown attribute 0x"
        L_0x0403:
            X.AnonymousClass000.A1G(r0, r5, r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r5.append(r7)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r6.get(r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            android.util.Log.w(r13, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0416:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            java.lang.String r0 = "unused attribute 0x"
            goto L_0x0403
        L_0x041d:
            java.lang.String r0 = r2.getString(r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0s = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0425:
            boolean r0 = r3.A0x     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            boolean r0 = r2.getBoolean(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0x = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x042f:
            java.lang.String r0 = r2.getString(r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0t = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0437:
            int r0 = r3.A0Z     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0Z = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0441:
            int r0 = r3.A0Y     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0Y = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x044b:
            java.lang.String r0 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0452:
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x045a:
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A07 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0462:
            float r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x046c:
            int r0 = r3.A0D     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0D = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0476:
            int r0 = r3.A0C     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0C = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0480:
            int r0 = r3.A0T     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0T = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x048a:
            int r0 = r3.A0q     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0q = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0494:
            int r0 = r3.A0S     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0S = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x049e:
            int r0 = r3.A0p     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0p = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04a8:
            int r0 = r3.A0R     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0R = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04b2:
            int r0 = r3.A0o     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0o = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04bc:
            int r0 = r3.A0n     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0n = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04c6:
            int r0 = r3.A0U     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0U = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04d0:
            float r0 = r3.A06     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A06 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04da:
            float r0 = r3.A04     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04e4:
            float r0 = r3.A05     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A05 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04ee:
            int r0 = r3.A0m     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0m = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x04f8:
            int r0 = r3.A0l     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0l = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0502:
            int r0 = r3.A0k     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0k = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x050c:
            int r0 = r3.A0j     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0j = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0516:
            int r0 = r3.A0i     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0i = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0520:
            int r0 = r3.A0h     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0h = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x052a:
            int r0 = r3.A0g     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0g = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0534:
            int r0 = r3.A0f     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0f = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x053e:
            int r0 = r3.A0e     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0e = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0548:
            int r0 = r3.A0d     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getInt(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0d = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0552:
            int r0 = r3.A0X     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0X = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x055c:
            int r0 = r3.A0W     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0W = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0566:
            int r0 = r3.A0V     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0V = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0570:
            int r0 = r3.A0c     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getLayoutDimension(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0c = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x057a:
            int r0 = r3.A0a     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getLayoutDimension(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0a = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0584:
            float r0 = r3.A03     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x058e:
            float r0 = r3.A01     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            float r0 = r2.getFloat(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0598:
            int r0 = r3.A0Q     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelOffset(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0Q = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05a2:
            int r0 = r3.A0P     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelOffset(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0P = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05ac:
            int r0 = r3.A0O     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0O = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05b6:
            int r0 = r3.A0N     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0N = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05c0:
            int r0 = r3.A0M     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0M = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05ca:
            int r0 = r3.A0L     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0L = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05d3:
            int r0 = r3.A0K     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0K = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05dc:
            int r0 = r3.A0J     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0J = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05e5:
            int r0 = r3.A0I     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0I = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05ee:
            int r0 = r3.A0H     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0H = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x05f7:
            int r0 = r3.A0G     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0G = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0600:
            int r0 = r3.A0F     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelOffset(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0F = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0609:
            int r0 = r3.A0E     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelOffset(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0E = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0612:
            java.lang.String r0 = r2.getString(r4)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0r = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0619:
            int r0 = r3.A0B     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0B = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0622:
            int r0 = r3.A0A     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0A = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x062b:
            int r0 = r3.A09     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = r2.getDimensionPixelSize(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A09 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0634:
            int r0 = r3.A08     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            int r0 = X.AnonymousClass0XZ.A00(r2, r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A08 = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x063d:
            boolean r0 = r3.A0u     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            boolean r0 = r2.getBoolean(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0u = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x064e
        L_0x0646:
            boolean r0 = r3.A0v     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            boolean r0 = r2.getBoolean(r4, r0)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            r3.A0v = r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x064e:
            int r1 = r1 + 1
            goto L_0x03d7
        L_0x0652:
            r2.recycle()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0659
        L_0x0656:
            r18.getName()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0659:
            int r3 = r18.next()     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0107
        L_0x065f:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0677
        L_0x0664:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0677
        L_0x0669:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0677
        L_0x066e:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0677
        L_0x0673:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0677:
            throw r0     // Catch:{ XmlPullParserException -> 0x067d, IOException -> 0x0678, IOException | XmlPullParserException -> 0x0688 }
        L_0x0678:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0681
        L_0x067d:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
        L_0x0681:
            android.util.SparseArray r0 = r10.A00     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            r0.put(r14, r12)     // Catch:{ IOException | XmlPullParserException -> 0x0688 }
            goto L_0x0055
        L_0x0688:
            r0 = move-exception
            r0.printStackTrace()
        L_0x068c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0M3.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    public static RuntimeException A00(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append("XML parser error must be within a Constraint ");
        sb.append(xmlPullParser.getLineNumber());
        return new RuntimeException(sb.toString());
    }
}
