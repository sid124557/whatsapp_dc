package X;

/* renamed from: X.9RO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RO {
    public final /* synthetic */ C202759mX A00;
    public final /* synthetic */ AnonymousClass9Ct A01;
    public final /* synthetic */ Runnable A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007b, code lost:
        if (r2.verify(android.util.Base64.decode(r7.A01, 0)) != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass34V r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            X.9Ct r2 = r8.A01
            java.lang.Runnable r4 = r8.A02
            X.9mX r3 = r8.A00
            r2.BjL()
            if (r9 != 0) goto L_0x0085
            r2.A0Z = r10
            r2.A0c = r13
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "upiHandle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            X.7yt r0 = X.C1899693i.A0F(r1, r5, r11, r0)
            r2.A0I = r0
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x002f
            X.3QD r1 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "accountHolderName"
            X.7yt r0 = X.C1899693i.A0F(r1, r5, r12, r0)
            r2.A0G = r0
        L_0x002f:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 == 0) goto L_0x007d
            r5 = 0
            if (r14 == 0) goto L_0x0081
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "extra_merchant_signature_data"
            android.os.Parcelable r7 = r1.getParcelableExtra(r0)
            X.38m r7 = (X.C632438m) r7
            r6 = 0
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            byte[] r0 = android.util.Base64.decode(r14, r6)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r0)
            java.lang.String r0 = r7.A02
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.PublicKey r1 = r0.generatePublic(r1)
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r2 = java.security.Signature.getInstance(r0)
            r2.initVerify(r1)
            java.lang.String r1 = r7.A00
            java.nio.charset.Charset r0 = X.AnonymousClass79X.A05
            byte[] r0 = r1.getBytes(r0)
            X.C162457s7.A0D(r0)
            r2.update(r0)
            java.lang.String r0 = r7.A01
            byte[] r0 = android.util.Base64.decode(r0, r6)
            boolean r0 = r2.verify(r0)
            if (r0 == 0) goto L_0x0081
        L_0x007d:
            r4.run()
            return
        L_0x0081:
            r3.BS6(r5)
            return
        L_0x0085:
            r3.BS6(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RO.A00(X.34V, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ AnonymousClass9RO(C202759mX r1, AnonymousClass9Ct r2, Runnable runnable) {
        this.A01 = r2;
        this.A02 = runnable;
        this.A00 = r1;
    }
}
