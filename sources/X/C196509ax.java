package X;

/* renamed from: X.9ax  reason: invalid class name and case insensitive filesystem */
public class C196509ax implements C202929mq {
    public final C56492s4 A00;
    public final C54292oU A01;
    public final C196629bS A02;
    public final C1906899l A03;
    public final C1906999m A04;
    public final AnonymousClass9U4 A05;

    public C196509ax(C56492s4 r1, C54292oU r2, C196629bS r3, C1906899l r4, C1906999m r5, AnonymousClass9U4 r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r2 = X.C161357pU.A0F.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Awv(java.lang.String r5, java.util.List r6) {
        /*
            r4 = this;
            java.util.Iterator r3 = r6.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            X.7yw r0 = X.C1899693i.A0C(r3)
            X.6hx r1 = r0.A08
            boolean r0 = r1 instanceof X.AnonymousClass99H
            if (r0 == 0) goto L_0x0028
            X.99H r1 = (X.AnonymousClass99H) r1
            boolean r0 = X.AnonymousClass99H.A00(r1)
            if (r0 == 0) goto L_0x0004
            X.9U4 r0 = r4.A05
            X.9Vj r1 = r0.A0C(r5)
            java.lang.String r0 = "2fa"
            r1.A09(r0)
            goto L_0x0004
        L_0x0028:
            boolean r0 = r1 instanceof X.AnonymousClass99K
            if (r0 == 0) goto L_0x0004
            X.99K r1 = (X.AnonymousClass99K) r1
            java.lang.String r0 = r1.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0004
            X.7yt r0 = r1.A00
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x0004
            X.7pU r0 = X.C161357pU.A0F
            X.7Tb[] r2 = r0.A0C
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0004
            X.99m r1 = r4.A04
            int r0 = r0 + -1
            r0 = r2[r0]
            r1.A08(r0)
            goto L_0x0004
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196509ax.Awv(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166587yw Axj(X.C166587yw r8) {
        /*
            r7 = this;
            int r1 = r8.A08()
            r0 = 5
            X.6hx r2 = r8.A08
            if (r0 != r1) goto L_0x0066
            X.99K r2 = (X.AnonymousClass99K) r2
            if (r2 == 0) goto L_0x0065
            X.9U4 r0 = r7.A05
            X.8EA r1 = X.AnonymousClass9U4.A03(r0)
            java.lang.String r0 = r8.A0A
            X.7yw r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0039
            X.6hx r1 = r0.A08
            if (r1 == 0) goto L_0x0039
            X.99K r1 = (X.AnonymousClass99K) r1
            X.7yt r0 = r2.A00
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 == 0) goto L_0x002d
            X.7yt r0 = r1.A00
            r2.A00 = r0
        L_0x002d:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r1.A02
            r2.A02 = r0
        L_0x0039:
            X.7yt r0 = r2.A00
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 == 0) goto L_0x004f
            X.9bS r0 = r7.A02
            X.7yt r1 = r0.A04()
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x004f
            r2.A00 = r1
        L_0x004f:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0065
            X.9bS r0 = r7.A02
            java.lang.String r1 = r0.A0C()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0065
            r2.A02 = r1
        L_0x0065:
            return r8
        L_0x0066:
            X.99H r2 = (X.AnonymousClass99H) r2
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: beforeMethodAdded got methodData: "
            r3.append(r0)
            if (r2 == 0) goto L_0x0180
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "vpa: "
            r1.append(r0)
            X.7yt r0 = r2.A09
            r1.append(r0)
            java.lang.String r0 = " image: "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = " supportPhoneNumber: "
            r1.append(r0)
            java.lang.String r0 = r2.A0D
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0096:
            X.C18260x0.A1L(r3, r0)
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0105
            java.lang.String r1 = "BankLogos"
            java.lang.String r4 = r2.A03
            X.2oU r0 = r7.A01
            android.content.Context r6 = r0.A00
            java.io.File r0 = r6.getCacheDir()
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r1)
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c5:
            r0 = 1048576(0x100000, double:5.180654E-318)
            X.30R r5 = new X.30R
            r5.<init>(r3, r0)
            java.lang.String r4 = X.C627236i.A04(r4)
            X.C626936e.A06(r4)
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131167745(0x7f070a01, float:1.7949772E38)
            int r3 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 0
            android.graphics.Bitmap r4 = r5.A01(r4, r3, r1, r0)
            r5.A05(r0)
            if (r4 == 0) goto L_0x0177
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r4.compress(r1, r0, r3)
            byte[] r0 = r3.toByteArray()
            if (r0 == 0) goto L_0x0177
        L_0x0103:
            r8.A0D = r0
        L_0x0105:
            X.9U4 r0 = r7.A05
            X.8EA r1 = X.AnonymousClass9U4.A03(r0)
            java.lang.String r0 = r8.A0A
            X.7yw r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x013f
            X.6hx r1 = r0.A08
            if (r1 == 0) goto L_0x013f
            X.99H r1 = (X.AnonymousClass99H) r1
            X.7yt r0 = r2.A09
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 == 0) goto L_0x0125
            X.7yt r0 = r1.A09
            r2.A09 = r0
        L_0x0125:
            java.lang.String r0 = r2.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r1.A0F
            r2.A0F = r0
        L_0x0131:
            X.7yt r0 = r2.A03
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 == 0) goto L_0x013f
            X.7yt r0 = r1.A08()
            r2.A03 = r0
        L_0x013f:
            X.7yt r0 = r2.A09
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 == 0) goto L_0x0155
            X.9bS r0 = r7.A02
            X.7yt r1 = r0.A04()
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0155
            r2.A09 = r1
        L_0x0155:
            java.lang.String r0 = r2.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016b
            X.9bS r0 = r7.A02
            java.lang.String r1 = r0.A0C()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016b
            r2.A0F = r1
        L_0x016b:
            X.9bS r6 = r7.A02
            X.7yt r1 = r2.A09
            java.lang.String r0 = r2.A0F
            java.lang.String r5 = r2.A0A
            java.lang.String r4 = r2.A0E
            monitor-enter(r6)
            goto L_0x0184
        L_0x0177:
            java.lang.String r1 = r2.A03
            X.2s4 r0 = r7.A00
            byte[] r0 = X.C195169Wk.A09(r0, r1)
            goto L_0x0103
        L_0x0180:
            java.lang.String r0 = "null"
            goto L_0x0096
        L_0x0184:
            X.33l r3 = r6.A03     // Catch:{ JSONException -> 0x01b1 }
            org.json.JSONObject r2 = X.C1899593h.A0g(r3)     // Catch:{ JSONException -> 0x01b1 }
            r6.A0H(r1, r0, r2)     // Catch:{ JSONException -> 0x01b1 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x01b1 }
            if (r0 != 0) goto L_0x01ad
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x01b1 }
            if (r0 != 0) goto L_0x01ad
            r6.A0K(r5, r4, r2)     // Catch:{ JSONException -> 0x01b1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x01b1 }
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updated psp: "
            r1.append(r0)     // Catch:{ JSONException -> 0x01b1 }
            r1.append(r5)     // Catch:{ JSONException -> 0x01b1 }
            java.lang.String r0 = " transactionPrefix: "
            X.C18260x0.A0s(r0, r4, r1)     // Catch:{ JSONException -> 0x01b1 }
        L_0x01ad:
            X.C1899593h.A1D(r3, r2)     // Catch:{ JSONException -> 0x01b1 }
            goto L_0x01b7
        L_0x01b1:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01b9 }
        L_0x01b7:
            monitor-exit(r6)
            return r8
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196509ax.Axj(X.7yw):X.7yw");
    }
}
