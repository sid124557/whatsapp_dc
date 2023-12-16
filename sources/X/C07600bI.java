package X;

/* renamed from: X.0bI  reason: invalid class name and case insensitive filesystem */
public class C07600bI implements C15600rd {
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021b, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable B0g(android.content.Context r25, android.content.res.Resources.Theme r26, android.util.AttributeSet r27, org.xmlpull.v1.XmlPullParser r28) {
        /*
            r24 = this;
            r23 = r25
            android.content.res.Resources r10 = r23.getResources()     // Catch:{ Exception -> 0x023e }
            r22 = r28
            java.lang.String r2 = r22.getName()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = "animated-selector"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x021c
            r0 = 0
            X.04A r9 = new X.04A     // Catch:{ Exception -> 0x023e }
            r9.<init>(r0, r0)     // Catch:{ Exception -> 0x023e }
            int[] r0 = X.C03400Jz.A00     // Catch:{ Exception -> 0x023e }
            r12 = r26
            r11 = r27
            android.content.res.TypedArray r2 = X.C05790Uy.A01(r12, r10, r11, r0)     // Catch:{ Exception -> 0x023e }
            r0 = 1
            r8 = 1
            boolean r0 = r2.getBoolean(r0, r0)     // Catch:{ Exception -> 0x023e }
            r9.setVisible(r0, r8)     // Catch:{ Exception -> 0x023e }
            X.048 r3 = r9.A02     // Catch:{ Exception -> 0x023e }
            int r1 = r3.A00     // Catch:{ Exception -> 0x023e }
            int r0 = r2.getChangingConfigurations()     // Catch:{ Exception -> 0x023e }
            r1 = r1 | r0
            r3.A00 = r1     // Catch:{ Exception -> 0x023e }
            r1 = 2
            boolean r0 = r3.A0W     // Catch:{ Exception -> 0x023e }
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ Exception -> 0x023e }
            r3.A0W = r0     // Catch:{ Exception -> 0x023e }
            r1 = 3
            boolean r0 = r3.A0P     // Catch:{ Exception -> 0x023e }
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ Exception -> 0x023e }
            r3.A0P = r0     // Catch:{ Exception -> 0x023e }
            r1 = 4
            int r0 = r3.A07     // Catch:{ Exception -> 0x023e }
            int r0 = r2.getInt(r1, r0)     // Catch:{ Exception -> 0x023e }
            r3.A07 = r0     // Catch:{ Exception -> 0x023e }
            r1 = 5
            int r0 = r3.A08     // Catch:{ Exception -> 0x023e }
            int r0 = r2.getInt(r1, r0)     // Catch:{ Exception -> 0x023e }
            r3.A08 = r0     // Catch:{ Exception -> 0x023e }
            r1 = 0
            boolean r0 = r3.A0Q     // Catch:{ Exception -> 0x023e }
            boolean r0 = r2.getBoolean(r1, r0)     // Catch:{ Exception -> 0x023e }
            r9.setDither(r0)     // Catch:{ Exception -> 0x023e }
            X.011 r0 = r9.A08     // Catch:{ Exception -> 0x023e }
            r0.A06(r10)     // Catch:{ Exception -> 0x023e }
            r2.recycle()     // Catch:{ Exception -> 0x023e }
            int r0 = r22.getDepth()     // Catch:{ Exception -> 0x023e }
            int r21 = r0 + 1
        L_0x0074:
            int r2 = r22.next()     // Catch:{ Exception -> 0x023e }
            if (r2 == r8) goto L_0x0214
            int r1 = r22.getDepth()     // Catch:{ Exception -> 0x023e }
            r0 = r21
            if (r1 >= r0) goto L_0x0085
            r0 = 3
            if (r2 == r0) goto L_0x0214
        L_0x0085:
            r0 = 2
            if (r2 != r0) goto L_0x0074
            r0 = r21
            if (r1 > r0) goto L_0x0074
            java.lang.String r1 = r22.getName()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0138
            int[] r0 = X.C03400Jz.A01     // Catch:{ Exception -> 0x023e }
            android.content.res.TypedArray r2 = X.C05790Uy.A01(r12, r10, r11, r0)     // Catch:{ Exception -> 0x023e }
            r0 = 0
            int r14 = r2.getResourceId(r0, r0)     // Catch:{ Exception -> 0x023e }
            r0 = -1
            int r1 = r2.getResourceId(r8, r0)     // Catch:{ Exception -> 0x023e }
            if (r1 <= 0) goto L_0x00bd
            r0 = r23
            android.graphics.drawable.Drawable r4 = X.AnonymousClass0XW.A01(r0, r1)     // Catch:{ Exception -> 0x023e }
        L_0x00b0:
            r2.recycle()     // Catch:{ Exception -> 0x023e }
            int r13 = r11.getAttributeCount()     // Catch:{ Exception -> 0x023e }
            int[] r7 = new int[r13]     // Catch:{ Exception -> 0x023e }
            r6 = 0
            r5 = 0
            r3 = 0
            goto L_0x00bf
        L_0x00bd:
            r4 = 0
            goto L_0x00b0
        L_0x00bf:
            if (r5 >= r13) goto L_0x00e0
            int r2 = r11.getAttributeNameResource(r5)     // Catch:{ Exception -> 0x023e }
            if (r2 == 0) goto L_0x00dd
            r0 = 16842960(0x10100d0, float:2.369414E-38)
            if (r2 == r0) goto L_0x00dd
            r0 = 16843161(0x1010199, float:2.3694704E-38)
            if (r2 == r0) goto L_0x00dd
            int r1 = r3 + 1
            boolean r0 = r11.getAttributeBooleanValue(r5, r6)     // Catch:{ Exception -> 0x023e }
            if (r0 != 0) goto L_0x00da
            int r2 = -r2
        L_0x00da:
            r7[r3] = r2     // Catch:{ Exception -> 0x023e }
            r3 = r1
        L_0x00dd:
            int r5 = r5 + 1
            goto L_0x00bf
        L_0x00e0:
            int[] r3 = android.util.StateSet.trimStateSet(r7, r3)     // Catch:{ Exception -> 0x023e }
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L_0x0108
        L_0x00e8:
            int r1 = r22.next()     // Catch:{ Exception -> 0x023e }
            r0 = 4
            if (r1 == r0) goto L_0x00e8
            r0 = 2
            if (r1 != r0) goto L_0x022c
            java.lang.String r1 = r22.getName()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = "vector"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x011d
            X.0AQ r4 = new X.0AQ     // Catch:{ Exception -> 0x023e }
            r4.<init>()     // Catch:{ Exception -> 0x023e }
            r0 = r22
            r4.inflate(r10, r0, r11, r12)     // Catch:{ Exception -> 0x023e }
        L_0x0108:
            X.048 r1 = r9.A02     // Catch:{ Exception -> 0x023e }
            int r2 = r1.A00(r4)     // Catch:{ Exception -> 0x023e }
            int[][] r0 = r1.A00     // Catch:{ Exception -> 0x023e }
            r0[r2] = r3     // Catch:{ Exception -> 0x023e }
            X.0i5 r1 = r1.A01     // Catch:{ Exception -> 0x023e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x023e }
            r1.A03(r2, r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x0074
        L_0x011d:
            r0 = r22
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r10, r0, r11, r12)     // Catch:{ Exception -> 0x023e }
            if (r4 != 0) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = r22.getPositionDescription()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x023d
        L_0x0138:
            java.lang.String r1 = r22.getName()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = "transition"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0074
            int[] r0 = X.C03400Jz.A02     // Catch:{ Exception -> 0x023e }
            android.content.res.TypedArray r6 = X.C05790Uy.A01(r12, r10, r11, r0)     // Catch:{ Exception -> 0x023e }
            r0 = 2
            r5 = -1
            int r2 = r6.getResourceId(r0, r5)     // Catch:{ Exception -> 0x023e }
            int r4 = r6.getResourceId(r8, r5)     // Catch:{ Exception -> 0x023e }
            r3 = 0
            int r1 = r6.getResourceId(r3, r5)     // Catch:{ Exception -> 0x023e }
            if (r1 <= 0) goto L_0x0175
            r0 = r23
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0XW.A01(r0, r1)     // Catch:{ Exception -> 0x023e }
        L_0x0161:
            r0 = 3
            boolean r20 = r6.getBoolean(r0, r3)     // Catch:{ Exception -> 0x023e }
            r6.recycle()     // Catch:{ Exception -> 0x023e }
            java.lang.String r3 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r1 != 0) goto L_0x01ae
        L_0x016d:
            int r1 = r22.next()     // Catch:{ Exception -> 0x023e }
            r0 = 4
            if (r1 == r0) goto L_0x016d
            goto L_0x0177
        L_0x0175:
            r1 = 0
            goto L_0x0161
        L_0x0177:
            r0 = 2
            if (r1 != r0) goto L_0x01f2
            java.lang.String r1 = r22.getName()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = "animated-vector"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0193
            X.0AR r1 = new X.0AR     // Catch:{ Exception -> 0x023e }
            r0 = r23
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            r0 = r22
            r1.inflate(r10, r0, r11, r12)     // Catch:{ Exception -> 0x023e }
            goto L_0x01ae
        L_0x0193:
            r0 = r22
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromXmlInner(r10, r0, r11, r12)     // Catch:{ Exception -> 0x023e }
            if (r1 != 0) goto L_0x01ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = r22.getPositionDescription()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x023d
        L_0x01ae:
            if (r2 == r5) goto L_0x0204
            if (r4 == r5) goto L_0x0204
            X.048 r15 = r9.A02     // Catch:{ Exception -> 0x023e }
            int r1 = r15.A00(r1)     // Catch:{ Exception -> 0x023e }
            long r6 = (long) r2     // Catch:{ Exception -> 0x023e }
            r0 = 32
            long r2 = r6 << r0
            long r4 = (long) r4     // Catch:{ Exception -> 0x023e }
            long r18 = r4 | r2
            if (r20 == 0) goto L_0x01c8
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01ca
        L_0x01c8:
            r16 = 0
        L_0x01ca:
            X.0i7 r0 = r15.A00     // Catch:{ Exception -> 0x023e }
            r14 = r0
            long r2 = (long) r1     // Catch:{ Exception -> 0x023e }
            long r0 = r2 | r16
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x023e }
            r0 = r18
            r14.A09(r0, r13)     // Catch:{ Exception -> 0x023e }
            if (r20 == 0) goto L_0x0074
            r0 = 32
            long r4 = r4 << r0
            long r6 = r6 | r4
            X.0i7 r4 = r15.A00     // Catch:{ Exception -> 0x023e }
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r2
            long r0 = r0 | r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x023e }
            r4.A09(r6, r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x0074
        L_0x01f2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = r22.getPositionDescription()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x023d
        L_0x0204:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r22)     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x023d
        L_0x0214:
            int[] r0 = r9.getState()     // Catch:{ Exception -> 0x023e }
            r9.onStateChange(r0)     // Catch:{ Exception -> 0x023e }
            return r9
        L_0x021c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0n(r22)     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = ": invalid animated-selector tag "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x023d
        L_0x022c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = r22.getPositionDescription()     // Catch:{ Exception -> 0x023e }
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x023e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x023e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x023e }
        L_0x023d:
            throw r1     // Catch:{ Exception -> 0x023e }
        L_0x023e:
            r2 = move-exception
            java.lang.String r1 = "AsldcInflateDelegate"
            java.lang.String r0 = "Exception while inflating <animated-selector>"
            android.util.Log.e(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07600bI.B0g(android.content.Context, android.content.res.Resources$Theme, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.graphics.drawable.Drawable");
    }
}
