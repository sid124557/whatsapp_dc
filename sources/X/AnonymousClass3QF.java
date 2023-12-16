package X;

import android.os.SystemClock;

/* renamed from: X.3QF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3QF implements C182538oa {
    public final /* synthetic */ C42162Na A00;
    public final /* synthetic */ C182378oJ A01;
    public final /* synthetic */ AnonymousClass2YO A02;
    public final /* synthetic */ AnonymousClass1I5 A03;
    public final /* synthetic */ AnonymousClass2U2 A04;
    public final /* synthetic */ C32441qP A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.6tY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.6tY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: X.6hh} */
    /* JADX WARNING: type inference failed for: r7v13, types: [X.1Qh] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b1, code lost:
        if (r9 >= 500) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0328 A[Catch:{ all -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0354 A[Catch:{ all -> 0x0393 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C161997qy BkH(X.AnonymousClass7US r34) {
        /*
            r33 = this;
            r0 = r33
            X.1I5 r4 = r0.A03
            X.8oJ r6 = r0.A01
            X.1qP r14 = r0.A05
            X.2Na r8 = r0.A00
            X.2U2 r3 = r0.A04
            X.2YO r0 = r0.A02
            r32 = r0
            X.2UL r12 = r4.A0Y
            X.2pd r0 = r4.A0P
            r5 = 1
            r13 = r34
            int r0 = r0.A00(r13, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A07 = r0
            boolean r0 = r4 instanceof X.AnonymousClass1g4
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = "fallback"
            java.lang.String r0 = r13.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "mediaUpload/call Do not allow using fallback host on EP upload"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1 = 27
        L_0x0036:
            X.7PE r0 = new X.7PE
            r0.<init>(r13, r1)
            X.7qy r0 = X.C161997qy.A01(r0)
            return r0
        L_0x0040:
            X.34l r0 = r4.A0a     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            X.2zt r9 = r4.A0V     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            X.2UD r2 = r9.A02     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            java.io.File r1 = r2.A07     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            X.C626936e.A06(r1)     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            X.8KT r18 = r0.A02(r6, r9, r1)     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            android.net.Uri$Builder r0 = r14.A02(r13)     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = X.C18300x5.A0f(r0)     // Catch:{ all -> 0x0393 }
            r12.A0O = r0     // Catch:{ all -> 0x0393 }
            long r6 = r4.A00     // Catch:{ all -> 0x0393 }
            boolean r26 = r4.A0F()     // Catch:{ all -> 0x0393 }
            boolean r27 = r4.A0E()     // Catch:{ all -> 0x0393 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0393 }
            boolean r28 = r9.A02()     // Catch:{ all -> 0x0393 }
            X.38t r2 = r2.A06     // Catch:{ all -> 0x0393 }
            r31 = r2
            boolean r2 = r4.A0E()     // Catch:{ all -> 0x0393 }
            boolean r29 = X.AnonymousClass000.A1T(r2)
            X.2cG r2 = r4.A0A()     // Catch:{ all -> 0x0393 }
            java.lang.String r23 = r2.A00()     // Catch:{ all -> 0x0393 }
            X.2Tj r2 = new X.2Tj     // Catch:{ all -> 0x0393 }
            r19 = r31
            r20 = r13
            r21 = r1
            r22 = r0
            r24 = r6
            r16 = r2
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)     // Catch:{ all -> 0x0393 }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x0393 }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x0393 }
            X.8KT r9 = r2.A03     // Catch:{ all -> 0x0393 }
            r22 = 0
            if (r9 != 0) goto L_0x00a0
            r1 = 3
            goto L_0x030c
        L_0x00a0:
            boolean r0 = r2.A09     // Catch:{ all -> 0x0393 }
            r3.A01 = r0     // Catch:{ all -> 0x0393 }
            r11 = 2
            X.4JV r0 = new X.4JV     // Catch:{ all -> 0x0393 }
            r0.<init>(r2, r11, r3)     // Catch:{ all -> 0x0393 }
            boolean r1 = r2.A07     // Catch:{ all -> 0x0393 }
            if (r1 == 0) goto L_0x00db
            int[] r6 = r3.A0D     // Catch:{ all -> 0x0393 }
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length     // Catch:{ all -> 0x0393 }
            if (r1 <= 0) goto L_0x00cf
            X.6tY r8 = r9.A00     // Catch:{ all -> 0x0393 }
            X.2Na r1 = r2.A02     // Catch:{ all -> 0x0393 }
            X.1Qh r7 = new X.1Qh     // Catch:{ all -> 0x0393 }
            r7.<init>(r1, r8, r6)     // Catch:{ all -> 0x0393 }
        L_0x00be:
            X.7Rc r15 = r7.A04     // Catch:{ all -> 0x0393 }
        L_0x00c0:
            X.2cX r10 = r3.A06     // Catch:{ all -> 0x0393 }
            java.lang.String r1 = r2.A05     // Catch:{ all -> 0x0393 }
            r30 = r1
            r17 = 0
            X.7US r6 = r2.A04     // Catch:{ all -> 0x0393 }
            int r1 = r6.A00     // Catch:{ all -> 0x0393 }
            r16 = r1
            goto L_0x00e1
        L_0x00cf:
            X.6tY r8 = r9.A00     // Catch:{ all -> 0x0393 }
            X.2Na r6 = r2.A02     // Catch:{ all -> 0x0393 }
            r1 = 65536(0x10000, float:9.18355E-41)
            X.6hh r7 = new X.6hh     // Catch:{ all -> 0x0393 }
            r7.<init>(r6, r8, r1)     // Catch:{ all -> 0x0393 }
            goto L_0x00be
        L_0x00db:
            X.6tY r7 = r9.A00     // Catch:{ all -> 0x0393 }
            r8 = r7
            r15 = r22
            goto L_0x00c0
        L_0x00e1:
            boolean r28 = X.AnonymousClass000.A1T(r16)
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0393 }
            r23 = r10
            r24 = r0
            r25 = r30
            r26 = r1
            r27 = r17
            X.30q r10 = r23.A00(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0393 }
            java.lang.String r21 = "file"
            long r0 = r2.A00     // Catch:{ all -> 0x0393 }
            r26 = r0
            long r0 = r2.A01     // Catch:{ all -> 0x0393 }
            r28 = r0
            java.util.List r1 = r10.A0C     // Catch:{ all -> 0x0393 }
            X.5KF r0 = new X.5KF     // Catch:{ all -> 0x0393 }
            r19 = r0
            r20 = r7
            r23 = r11
            r24 = r26
            r26 = r28
            r19.<init>(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0393 }
            r1.add(r0)     // Catch:{ all -> 0x0393 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ all -> 0x0393 }
            r0 = 13
            X.91H r1 = new X.91H     // Catch:{ all -> 0x0393 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x0393 }
            java.lang.String r7 = "hash"
            java.util.List r0 = r10.A0D     // Catch:{ all -> 0x0393 }
            android.util.Pair r1 = android.util.Pair.create(r7, r1)     // Catch:{ all -> 0x0393 }
            r0.add(r1)     // Catch:{ all -> 0x0393 }
            X.7L4 r8 = new X.7L4     // Catch:{ all -> 0x0393 }
            r8.<init>(r15, r10, r9)     // Catch:{ all -> 0x0393 }
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0C     // Catch:{ all -> 0x0393 }
            X.30q r7 = r8.A01     // Catch:{ all -> 0x0393 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x0393 }
            r0.set(r7)     // Catch:{ all -> 0x0393 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x025c }
            java.lang.String r0 = "mediaupload/attemptUpload key="
            r1.append(r0)     // Catch:{ IOException -> 0x025c }
            java.lang.String r10 = r3.A0B     // Catch:{ IOException -> 0x025c }
            X.C18260x0.A1J(r1, r10)     // Catch:{ IOException -> 0x025c }
            X.2UL r1 = r3.A09     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            r1.A06 = r0     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            java.lang.String r0 = r6.A04     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            r1.A0J = r0     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            r1.A0F = r0     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            int r9 = r7.A03(r6)     // Catch:{ 57Z -> 0x01f1, IOException -> 0x01e9 }
            A00(r7, r1)     // Catch:{ IOException -> 0x025c }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r9)     // Catch:{ IOException -> 0x025c }
            r1.A0A = r0     // Catch:{ IOException -> 0x025c }
            java.lang.String r0 = r7.A03     // Catch:{ IOException -> 0x025c }
            r1.A0M = r0     // Catch:{ IOException -> 0x025c }
            r0 = 400(0x190, float:5.6E-43)
            if (r9 != r0) goto L_0x0182
            X.1I5 r1 = r3.A08     // Catch:{ IOException -> 0x025c }
            java.util.concurrent.FutureTask r1 = r1.A02     // Catch:{ IOException -> 0x025c }
            boolean r1 = r1.isCancelled()     // Catch:{ IOException -> 0x025c }
            if (r1 == 0) goto L_0x0182
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x025c }
            java.lang.String r0 = "mediaupload/upload-error/cancelled/400 "
            goto L_0x0211
        L_0x0182:
            java.lang.String r7 = " "
            java.lang.String r1 = "mediaupload/upload-error/response-code="
            if (r9 < r0) goto L_0x01b9
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r9, r1)     // Catch:{ IOException -> 0x025c }
            X.C18260x0.A0r(r7, r10, r0)     // Catch:{ IOException -> 0x025c }
            r0 = 507(0x1fb, float:7.1E-43)
            if (r9 == r0) goto L_0x01b6
            r0 = 429(0x1ad, float:6.01E-43)
            if (r9 == r0) goto L_0x01b6
            r0 = 401(0x191, float:5.62E-43)
            r1 = 13
            if (r9 == r0) goto L_0x01e0
            r0 = 415(0x19f, float:5.82E-43)
            r1 = 36
            if (r9 == r0) goto L_0x01e0
            r0 = 413(0x19d, float:5.79E-43)
            r1 = 24
            if (r9 == r0) goto L_0x01e0
            r0 = 408(0x198, float:5.72E-43)
            if (r9 == r0) goto L_0x01b3
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 9
            if (r9 < r0) goto L_0x01e0
        L_0x01b3:
            r1 = 8
            goto L_0x01e0
        L_0x01b6:
            r1 = 15
            goto L_0x01e0
        L_0x01b9:
            if (r9 >= 0) goto L_0x01bc
            goto L_0x0201
        L_0x01bc:
            boolean r0 = r3.A01     // Catch:{ IOException -> 0x025c }
            if (r0 == 0) goto L_0x01db
            X.7Ol r0 = r3.A00     // Catch:{ IOException -> 0x025c }
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = r0.A00     // Catch:{ IOException -> 0x025c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x025c }
            if (r0 == 0) goto L_0x01db
        L_0x01cc:
            X.1VX r7 = r3.A05     // Catch:{ IOException -> 0x025c }
            r1 = 3300(0xce4, float:4.624E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x025c }
            boolean r0 = r7.A0Y(r0, r1)     // Catch:{ IOException -> 0x025c }
            if (r0 == 0) goto L_0x01db
            r1 = 29
            goto L_0x01e0
        L_0x01db:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x025c }
            goto L_0x01e4
        L_0x01e0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x025c }
        L_0x01e4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x025c }
            goto L_0x021c
        L_0x01e9:
            r6 = move-exception
            X.2UL r1 = r3.A09     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x0255 }
            r1.A0N = r0     // Catch:{ all -> 0x0255 }
            throw r6     // Catch:{ all -> 0x0255 }
        L_0x01f1:
            java.lang.Integer r1 = X.C18320x8.A0X()     // Catch:{ all -> 0x0255 }
            r0 = r17
            android.util.Pair r1 = X.C18300x5.A0E(r1, r0)     // Catch:{ all -> 0x0255 }
            X.2UL r0 = r3.A09     // Catch:{ IOException -> 0x025c }
            A00(r7, r0)     // Catch:{ IOException -> 0x025c }
            goto L_0x0220
        L_0x0201:
            X.1I5 r0 = r3.A08     // Catch:{ IOException -> 0x025c }
            java.util.concurrent.FutureTask r0 = r0.A02     // Catch:{ IOException -> 0x025c }
            boolean r0 = r0.isCancelled()     // Catch:{ IOException -> 0x025c }
            if (r0 == 0) goto L_0x0247
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x025c }
            java.lang.String r0 = "mediaupload/upload-error/cancelled "
        L_0x0211:
            X.C18260x0.A0r(r0, r10, r1)     // Catch:{ IOException -> 0x025c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x025c }
        L_0x0218:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x025c }
        L_0x021c:
            android.util.Pair r1 = android.util.Pair.create(r1, r0)     // Catch:{ IOException -> 0x025c }
        L_0x0220:
            java.lang.Object r0 = r1.first     // Catch:{ IOException -> 0x025c }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IOException -> 0x025c }
            X.7PE r7 = new X.7PE     // Catch:{ IOException -> 0x025c }
            r7.<init>(r6, r0)     // Catch:{ IOException -> 0x025c }
            java.lang.Object r0 = r1.second     // Catch:{ IOException -> 0x025c }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IOException -> 0x025c }
            r7.A00 = r0     // Catch:{ IOException -> 0x025c }
            r7.A01 = r8     // Catch:{ IOException -> 0x025c }
            X.8KT r0 = r8.A02     // Catch:{ IOException -> 0x025c }
            X.7N1 r0 = r0.A00()     // Catch:{ IOException -> 0x025c }
            r7.A02 = r0     // Catch:{ IOException -> 0x025c }
            X.7Ol r0 = r3.A00     // Catch:{ IOException -> 0x025c }
            r7.A03 = r0     // Catch:{ IOException -> 0x025c }
            boolean r0 = r3.A02     // Catch:{ IOException -> 0x025c }
            r7.A04 = r0     // Catch:{ IOException -> 0x025c }
            goto L_0x0313
        L_0x0247:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r9, r1)     // Catch:{ IOException -> 0x025c }
            X.C18260x0.A0r(r7, r10, r0)     // Catch:{ IOException -> 0x025c }
            r0 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x025c }
            goto L_0x0218
        L_0x0255:
            r1 = move-exception
            X.2UL r0 = r3.A09     // Catch:{ IOException -> 0x025c }
            A00(r7, r0)     // Catch:{ IOException -> 0x025c }
            throw r1     // Catch:{ IOException -> 0x025c }
        L_0x025c:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = "mediaupload/io-error/"
            r1.append(r0)     // Catch:{ all -> 0x0393 }
            android.net.Uri r0 = android.net.Uri.parse(r30)     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x0393 }
            r1.append(r0)     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x0393 }
            X.C18260x0.A15(r0, r1, r6)     // Catch:{ all -> 0x0393 }
            X.2UL r1 = r3.A09     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = X.C18310x6.A0n(r6)     // Catch:{ all -> 0x0393 }
            r1.A0K = r0     // Catch:{ all -> 0x0393 }
            boolean r0 = r6 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x028b
            r1 = 22
            goto L_0x030c
        L_0x028b:
            boolean r0 = r6 instanceof org.chromium.net.CronetException     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02fb
            boolean r0 = r6 instanceof org.chromium.net.NetworkException     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02e9
            r0 = r6
            org.chromium.net.NetworkException r0 = (org.chromium.net.NetworkException) r0     // Catch:{ all -> 0x0393 }
            int r8 = r0.getErrorCode()     // Catch:{ all -> 0x0393 }
            int r3 = r0.getCronetInternalErrorCode()     // Catch:{ all -> 0x0393 }
            if (r8 == r5) goto L_0x02de
            if (r8 == r11) goto L_0x02d7
            r0 = 4
            r9 = 10
            if (r8 == r0) goto L_0x02d2
            r7 = 9
            if (r8 == r7) goto L_0x02de
            r0 = 11
            if (r8 == r0) goto L_0x02b6
            r0 = 6
            if (r8 == r0) goto L_0x02d2
            r0 = 7
            if (r8 != r0) goto L_0x02e9
            goto L_0x02e5
        L_0x02b6:
            r0 = -103(0xffffffffffffff99, float:NaN)
            if (r3 == r0) goto L_0x02d2
            r0 = -18
            if (r3 == r0) goto L_0x02cd
            r0 = -176(0xffffffffffffff50, float:NaN)
            if (r3 == r0) goto L_0x02cd
            r0 = -107(0xffffffffffffff95, float:NaN)
            if (r3 != r0) goto L_0x02e9
            r0 = 18
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x02e9
        L_0x02cd:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0393 }
            goto L_0x02e9
        L_0x02d2:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0393 }
            goto L_0x02e9
        L_0x02d7:
            r0 = 25
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x02e9
        L_0x02de:
            r0 = 22
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x02e9
        L_0x02e5:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0393 }
        L_0x02e9:
            boolean r0 = X.C154457dC.A01(r6)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02f2
            if (r22 == 0) goto L_0x02f2
            goto L_0x0308
        L_0x02f2:
            java.lang.String r0 = X.C60872zJ.A00(r6, r5)     // Catch:{ all -> 0x0393 }
            r1.A0L = r0     // Catch:{ all -> 0x0393 }
            r1 = 28
            goto L_0x030c
        L_0x02fb:
            X.2p6 r0 = r3.A07     // Catch:{ all -> 0x0393 }
            boolean r0 = r0.A02(r6)     // Catch:{ all -> 0x0393 }
            r1 = 17
            if (r0 == 0) goto L_0x030c
            r1 = 18
            goto L_0x030c
        L_0x0308:
            int r1 = r22.intValue()     // Catch:{ all -> 0x0393 }
        L_0x030c:
            X.7US r0 = r2.A04     // Catch:{ all -> 0x0393 }
            X.7PE r7 = new X.7PE     // Catch:{ all -> 0x0393 }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x0393 }
        L_0x0313:
            long r0 = r4.A0i     // Catch:{ all -> 0x0393 }
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0322
            long r0 = r4.A00     // Catch:{ all -> 0x0393 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0322
            r5 = 0
        L_0x0322:
            int r2 = r7.A05     // Catch:{ all -> 0x0393 }
            r0 = 26
            if (r2 != r0) goto L_0x0354
            java.lang.String r1 = r4.A04     // Catch:{ all -> 0x0393 }
            r0 = r32
            X.5KH r1 = r4.A09(r0, r14, r1)     // Catch:{ all -> 0x0393 }
            int r0 = r1.A01     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x0339
            int r0 = r1.A00     // Catch:{ all -> 0x0393 }
            long r0 = (long) r0     // Catch:{ all -> 0x0393 }
            r4.A00 = r0     // Catch:{ all -> 0x0393 }
        L_0x0339:
            X.1i8 r6 = r4.A0f     // Catch:{ all -> 0x0393 }
            r0 = r31
            java.lang.String r7 = r0.A02     // Catch:{ all -> 0x0393 }
            r8 = 0
            r10 = 0
            r0 = r32
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01     // Catch:{ all -> 0x0393 }
            int r11 = r0.get()     // Catch:{ all -> 0x0393 }
            r9 = r8
            X.8to r1 = r6.A0A(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0393 }
            X.7qy r0 = new X.7qy     // Catch:{ all -> 0x0393 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0393 }
            goto L_0x038f
        L_0x0354:
            if (r2 == 0) goto L_0x038b
            java.util.concurrent.FutureTask r0 = r4.A02     // Catch:{ all -> 0x0393 }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x038b
            long r0 = r4.A0i     // Catch:{ all -> 0x0393 }
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0375
            java.lang.String r1 = r4.A04     // Catch:{ all -> 0x0393 }
            r0 = r32
            X.5KH r1 = r4.A09(r0, r14, r1)     // Catch:{ all -> 0x0393 }
            int r0 = r1.A01     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x0375
            int r0 = r1.A00     // Catch:{ all -> 0x0393 }
            long r0 = (long) r0     // Catch:{ all -> 0x0393 }
            r4.A00 = r0     // Catch:{ all -> 0x0393 }
        L_0x0375:
            r0 = 29
            if (r2 != r0) goto L_0x0384
            r4 = 0
            r3 = -1
            r6 = 1
            X.7qy r0 = new X.7qy     // Catch:{ all -> 0x0393 }
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0393 }
            goto L_0x038f
        L_0x0384:
            int r0 = r7.A00     // Catch:{ all -> 0x0393 }
            X.7qy r0 = X.C161997qy.A04(r7, r0, r5)     // Catch:{ all -> 0x0393 }
            goto L_0x038f
        L_0x038b:
            X.7qy r0 = X.C161997qy.A02(r7)     // Catch:{ all -> 0x0393 }
        L_0x038f:
            r18.close()     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
            goto L_0x03a8
        L_0x0393:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0398 }
            goto L_0x039c
        L_0x0398:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
        L_0x039c:
            throw r1     // Catch:{ NoSuchAlgorithmException -> 0x039d, IOException -> 0x03a9 }
        L_0x039d:
            r0 = move-exception
            java.lang.String r0 = X.C18310x6.A0n(r0)
            r12.A0K = r0
            r1 = 16
            goto L_0x0036
        L_0x03a8:
            return r0
        L_0x03a9:
            r0 = move-exception
            java.lang.String r0 = X.C18310x6.A0n(r0)
            r12.A0K = r0
            r1 = 3
            X.7PE r0 = new X.7PE
            r0.<init>(r13, r1)
            X.7qy r0 = X.C161997qy.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QF.BkH(X.7US):X.7qy");
    }

    public /* synthetic */ AnonymousClass3QF(C42162Na r1, C182378oJ r2, AnonymousClass2YO r3, AnonymousClass1I5 r4, AnonymousClass2U2 r5, C32441qP r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public static void A00(C614230q r2, AnonymousClass2UL r3) {
        r3.A0E = Long.valueOf(SystemClock.uptimeMillis());
        r3.A09 = Long.valueOf(r2.A00);
        r3.A02 = r2.A02;
    }
}
