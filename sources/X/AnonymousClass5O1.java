package X;

/* renamed from: X.5O1  reason: invalid class name */
public final class AnonymousClass5O1 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C108925dn A03;
    public final C108925dn A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (android.text.TextUtils.equals(r5.getName(), "badge") == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r8 = android.util.Xml.asAttributeSet(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r12 = r8.getStyleAttribute();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r12 != 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Must have a <");
        r1.append("badge");
        r1 = new org.xmlpull.v1.XmlPullParserException(X.AnonymousClass000.A0X("> start tag", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (r1 != false) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5O1(android.content.Context r14, X.C108925dn r15) {
        /*
            r13 = this;
            r13.<init>()
            X.5dn r3 = new X.5dn
            r3.<init>()
            r13.A03 = r3
            if (r15 != 0) goto L_0x0011
            X.5dn r15 = new X.5dn
            r15.<init>()
        L_0x0011:
            int r4 = r15.A01
            r11 = 2130968725(0x7f040095, float:1.7546112E38)
            r2 = 0
            r7 = r14
            if (r4 == 0) goto L_0x007e
            java.lang.String r6 = "badge"
            android.content.res.Resources r0 = r14.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            android.content.res.XmlResourceParser r5 = r0.getXml(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
        L_0x0024:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            r0 = 2
            if (r1 == r0) goto L_0x0036
            r0 = 1
            if (r1 != r0) goto L_0x0024
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            goto L_0x0062
        L_0x0036:
            java.lang.String r0 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            if (r0 == 0) goto L_0x004b
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            int r12 = r8.getStyleAttribute()
            if (r12 != 0) goto L_0x0082
            goto L_0x007f
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            java.lang.String r0 = "Must have a <"
            r1.append(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            r1.append(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            java.lang.String r0 = "> start tag"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
        L_0x0062:
            throw r1     // Catch:{ IOException | XmlPullParserException -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Can't load badge resource ID #0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x007e:
            r8 = 0
        L_0x007f:
            r12 = 2132084500(0x7f150714, float:1.9809172E38)
        L_0x0082:
            int[] r9 = X.C1463179t.A02
            int[] r10 = new int[r2]
            android.content.res.TypedArray r4 = X.C161837qd.A00(r7, r8, r9, r10, r11, r12)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2
            r0 = 2131167355(0x7f07087b, float:1.7948981E38)
            int r0 = X.C86634Kw.A05(r5, r4, r0, r1)
            float r0 = (float) r0
            r13.A00 = r0
            r1 = 4
            r0 = 2131167354(0x7f07087a, float:1.794898E38)
            int r0 = X.C86634Kw.A05(r5, r4, r0, r1)
            float r0 = (float) r0
            r13.A01 = r0
            r1 = 5
            r0 = 2131167360(0x7f070880, float:1.7948991E38)
            int r0 = X.C86634Kw.A05(r5, r4, r0, r1)
            float r0 = (float) r0
            r13.A02 = r0
            int r0 = r15.A00
            r6 = -2
            if (r0 != r6) goto L_0x00b6
            r0 = 255(0xff, float:3.57E-43)
        L_0x00b6:
            r3.A00 = r0
            java.lang.CharSequence r0 = r15.A07
            if (r0 != 0) goto L_0x00c3
            r0 = 2131896075(0x7f12270b, float:1.9427E38)
            java.lang.String r0 = r14.getString(r0)
        L_0x00c3:
            r3.A07 = r0
            int r0 = r15.A03
            if (r0 != 0) goto L_0x00cc
            r0 = 2131755423(0x7f10019f, float:1.9141725E38)
        L_0x00cc:
            r3.A03 = r0
            int r0 = r15.A02
            if (r0 != 0) goto L_0x00d5
            r0 = 2131896088(0x7f122718, float:1.9427027E38)
        L_0x00d5:
            r3.A02 = r0
            java.lang.Boolean r0 = r15.A06
            r5 = 0
            if (r0 == 0) goto L_0x00e3
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x00e4
        L_0x00e3:
            r0 = 1
        L_0x00e4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A06 = r0
            int r0 = r15.A04
            if (r0 != r6) goto L_0x00f5
            r1 = 8
            r0 = 4
            int r0 = r4.getInt(r1, r0)
        L_0x00f5:
            r3.A04 = r0
            int r0 = r15.A05
            if (r0 != r6) goto L_0x0107
            r1 = 9
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x01f8
            int r0 = r4.getInt(r1, r2)
        L_0x0107:
            r3.A05 = r0
            java.lang.Integer r0 = r15.A0A
            if (r0 != 0) goto L_0x01f2
            android.content.res.ColorStateList r0 = X.C160917of.A00(r14, r4, r2)
            int r0 = r0.getDefaultColor()
        L_0x0115:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            java.lang.Integer r0 = r15.A0C
            if (r0 != 0) goto L_0x0132
            r1 = 3
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x01e6
            android.content.res.ColorStateList r0 = X.C160917of.A00(r14, r4, r1)
        L_0x012a:
            int r0 = r0.getDefaultColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0132:
            r3.A0C = r0
            java.lang.Integer r0 = r15.A0B
            if (r0 != 0) goto L_0x01e0
            r1 = 1
            r0 = 8388661(0x800035, float:1.1755018E-38)
            int r0 = r4.getInt(r1, r0)
        L_0x0140:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            java.lang.Integer r0 = r15.A0E
            if (r0 != 0) goto L_0x01da
            r0 = 6
            int r0 = r4.getDimensionPixelOffset(r0, r2)
        L_0x014f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0E = r0
            java.lang.Integer r0 = r15.A0G
            if (r0 != 0) goto L_0x01d5
            r0 = 10
            int r0 = r4.getDimensionPixelOffset(r0, r2)
        L_0x015f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0G = r0
            java.lang.Integer r0 = r15.A0D
            if (r0 != 0) goto L_0x01d0
            r1 = 7
            java.lang.Integer r0 = r3.A0E
            int r0 = r0.intValue()
            int r0 = r4.getDimensionPixelOffset(r1, r0)
        L_0x0174:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0D = r0
            java.lang.Integer r0 = r15.A0F
            if (r0 != 0) goto L_0x01cb
            r1 = 11
            java.lang.Integer r0 = r3.A0G
            int r0 = r0.intValue()
            int r0 = r4.getDimensionPixelOffset(r1, r0)
        L_0x018a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0F = r0
            java.lang.Integer r0 = r15.A08
            if (r0 != 0) goto L_0x01c6
            r0 = 0
        L_0x0195:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A08 = r0
            java.lang.Integer r0 = r15.A09
            if (r0 == 0) goto L_0x01a3
            int r5 = r0.intValue()
        L_0x01a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A09 = r0
            r4.recycle()
            java.util.Locale r0 = r15.A0H
            if (r0 != 0) goto L_0x01bc
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x01c1
            java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
            java.util.Locale r0 = java.util.Locale.getDefault(r0)
        L_0x01bc:
            r3.A0H = r0
            r13.A04 = r15
            return
        L_0x01c1:
            java.util.Locale r0 = java.util.Locale.getDefault()
            goto L_0x01bc
        L_0x01c6:
            int r0 = r0.intValue()
            goto L_0x0195
        L_0x01cb:
            int r0 = r0.intValue()
            goto L_0x018a
        L_0x01d0:
            int r0 = r0.intValue()
            goto L_0x0174
        L_0x01d5:
            int r0 = r0.intValue()
            goto L_0x015f
        L_0x01da:
            int r0 = r0.intValue()
            goto L_0x014f
        L_0x01e0:
            int r0 = r0.intValue()
            goto L_0x0140
        L_0x01e6:
            r1 = 2132083740(0x7f15041c, float:1.980763E38)
            X.7bS r0 = new X.7bS
            r0.<init>(r14, r1)
            android.content.res.ColorStateList r0 = r0.A01
            goto L_0x012a
        L_0x01f2:
            int r0 = r0.intValue()
            goto L_0x0115
        L_0x01f8:
            r0 = -1
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O1.<init>(android.content.Context, X.5dn):void");
    }
}
