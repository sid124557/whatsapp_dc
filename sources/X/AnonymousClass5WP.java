package X;

/* renamed from: X.5WP  reason: invalid class name */
public final class AnonymousClass5WP {
    public static final AnonymousClass5WP A00 = new AnonymousClass5WP();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r5 == null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C130666cL A00(X.AnonymousClass59T r9, X.AnonymousClass59U r10, java.lang.String r11, java.util.Map r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            X.C18260x0.A0Q(r9, r10)
            X.6cL r0 = X.C130666cL.DEFAULT_INSTANCE
            X.6c9 r4 = r0.A0G()
            r4.A07()
            X.6cX r1 = r4.A00
            X.6cL r1 = (X.C130666cL) r1
            int r0 = r9.BA3()
            r1.encoding_ = r0
            r4.A07()
            X.6cX r1 = r4.A00
            X.6cL r1 = (X.C130666cL) r1
            int r0 = r10.BA3()
            r1.transformer_ = r0
            r1 = 0
            int r0 = r9.ordinal()
            if (r0 != r1) goto L_0x0119
            java.nio.charset.Charset r0 = X.AnonymousClass79X.A05
            byte[] r0 = r11.getBytes(r0)
            X.C162457s7.A0D(r0)
            X.8Lq r7 = X.C172548Lq.A01(r0)
        L_0x003b:
            r3 = 0
            if (r7 == 0) goto L_0x004f
            int r1 = r10.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x0078
            r0 = 0
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = "UserPasscodeUtil/Transformer.transform: Unknown Transformer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r3
        L_0x004e:
            r3 = r7
        L_0x004f:
            r4.A07()
            X.6cX r0 = r4.A00
            X.6cL r0 = (X.C130666cL) r0
            r3.getClass()
            r0.transformedData_ = r3
            r4.A07()
            X.6cX r2 = r4.A00
            X.6cL r2 = (X.C130666cL) r2
            X.8Tq r1 = r2.transformerArgsMap_
            boolean r0 = r1.isMutable
            if (r0 != 0) goto L_0x006e
            X.8Tq r1 = r1.A01()
            r2.transformerArgsMap_ = r1
        L_0x006e:
            r1.putAll(r12)
            X.6cX r0 = r4.A06()
            X.6cL r0 = (X.C130666cL) r0
            return r0
        L_0x0078:
            java.lang.String r3 = "salt"
            java.lang.Object r1 = r12.get(r3)
            X.6cH r1 = (X.C130626cH) r1
            if (r1 == 0) goto L_0x008a
            int r0 = r1.valueCase_
            if (r0 != r2) goto L_0x0115
            java.lang.Object r5 = r1.value_
        L_0x0088:
            if (r5 != 0) goto L_0x00b6
        L_0x008a:
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r1)
            X.8Lq r5 = X.C172548Lq.A01(r1)
            X.6cH r0 = X.C130626cH.DEFAULT_INSTANCE
            X.6c9 r2 = r0.A0G()
            r2.A07()
            X.6cX r1 = r2.A00
            X.6cH r1 = (X.C130626cH) r1
            r0 = 1
            r1.valueCase_ = r0
            r1.value_ = r5
            X.6cX r0 = r2.A06()
            r12.put(r3, r0)
            X.C162457s7.A0H(r5)
        L_0x00b6:
            java.lang.String r6 = "iterations"
            java.lang.Object r2 = r12.get(r6)
            X.6cH r2 = (X.C130626cH) r2
            if (r2 == 0) goto L_0x00f3
            int r1 = r2.valueCase_
            r0 = 2
            if (r1 != r0) goto L_0x00f1
            java.lang.Object r0 = r2.value_
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x00cb:
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r5, r0)
            java.lang.Object r1 = r0.first
            X.8Lq r1 = (X.C172548Lq) r1
            java.lang.Object r0 = r0.second
            int r3 = X.AnonymousClass001.A0K(r0)
            byte[] r2 = r7.A07()
            byte[] r1 = r1.A07()
            int r0 = r13 * 8
            javax.crypto.SecretKey r0 = X.C627236i.A09(r2, r1, r3, r0)
            byte[] r0 = r0.getEncoded()
            X.8Lq r7 = X.C172548Lq.A01(r0)
            goto L_0x004e
        L_0x00f1:
            r0 = 0
            goto L_0x00cb
        L_0x00f3:
            X.6cH r0 = X.C130626cH.DEFAULT_INSTANCE
            X.6c9 r3 = r0.A0G()
            r2 = 10000(0x2710, float:1.4013E-41)
            r3.A07()
            X.6cX r1 = r3.A00
            X.6cH r1 = (X.C130626cH) r1
            r0 = 2
            r1.valueCase_ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.value_ = r0
            X.6cX r0 = r3.A06()
            r12.put(r6, r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x00cb
        L_0x0115:
            X.8Lq r5 = X.C172548Lq.A01
            goto L_0x0088
        L_0x0119:
            java.lang.String r0 = "UserPasscodeUtil/Encoding.encode: Unknown user password encoding"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WP.A00(X.59T, X.59U, java.lang.String, java.util.Map, int):X.6cL");
    }
}
