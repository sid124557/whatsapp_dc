package X;

import com.whatsapp.util.Log;

/* renamed from: X.3TA  reason: invalid class name */
public final class AnonymousClass3TA implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2EU A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ C46832cH A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public void BQs(String str) {
        C162457s7.A0J(str, 0);
        Log.e("BloksPreConsentPayloadIqHelper/sendData:onDeliveryFailure");
        AnonymousClass2EU r0 = this.A01;
        AnonymousClass249 r1 = new AnonymousClass249(str);
        C49382gR r4 = r0.A00;
        C46202bF r3 = r4.A01;
        r3.A02 = r1;
        r3.A00 = 7;
        r4.A00.A01(r3, r4.A02, r1.getLocalizedMessage());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            java.lang.String r0 = "BloksPreConsentPayloadIqHelper/sendData:onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2cH r0 = r5.A03
            X.8qC r0 = r0.A05
            X.30u r1 = X.AnonymousClass0x9.A0c(r0)
            java.lang.Boolean r0 = r5.A04
            r1.A05(r0)
            java.lang.String r0 = "bloks_response"
            X.36K r0 = r6.A0m(r0)
            byte[] r1 = r0.A01
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.io.ByteArrayInputStream r4 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ IOException -> 0x0066 }
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x005f }
            r3.<init>(r4)     // Catch:{ all -> 0x005f }
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x0058 }
            X.C627536m.A0I(r3, r2)     // Catch:{ all -> 0x0051 }
            java.nio.charset.Charset r0 = X.C58152un.A0D     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r2.toString(r0)     // Catch:{ all -> 0x0051 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x0051 }
            r2.close()     // Catch:{ all -> 0x0058 }
            r3.close()     // Catch:{ all -> 0x005f }
            r4.close()     // Catch:{ IOException -> 0x0066 }
            X.2EU r0 = r5.A01
            X.2gR r0 = r0.A00
            r0.A01(r1)
            return
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x0066 }
            throw r0     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TA.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass3TA(AnonymousClass2EU r1, C54662p5 r2, C46832cH r3, Boolean bool, String str, String str2, int i) {
        this.A03 = r3;
        this.A04 = bool;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = i;
    }

    public void BSN(AnonymousClass36K r12, String str) {
        C614430u r1;
        Boolean bool;
        C18260x0.A0O(str, r12);
        int A012 = C57492tj.A01(r12);
        C18260x0.A0x("BloksPreConsentPayloadIqHelper/sendData:onError code=", AnonymousClass001.A0o(), A012);
        C46832cH r7 = this.A03;
        AnonymousClass24F r2 = new AnonymousClass24F(r12, str);
        AnonymousClass2EU r5 = this.A01;
        C54662p5 r6 = this.A02;
        C70743az r4 = new C70743az(r5, r6, r7, this.A05, this.A06, this.A00);
        if (!(A012 == 400 || A012 == 405)) {
            if (!(A012 == 408 || A012 == 429)) {
                if (A012 != 481) {
                    if (A012 != 500) {
                        if (A012 != 503) {
                            switch (A012) {
                                case 483:
                                    r1 = AnonymousClass0x9.A0c(r7.A05);
                                    bool = Boolean.FALSE;
                                    break;
                                case 484:
                                    r1 = AnonymousClass0x9.A0c(r7.A05);
                                    bool = Boolean.TRUE;
                                    break;
                                case 485:
                                    AnonymousClass0x9.A0c(r7.A05).A05(Boolean.TRUE);
                                    ((C45652aM) r7.A02.get()).A00(C54662p5.A00(), new C42952Qe(r5, r6, r2, r4));
                                    return;
                                default:
                                    return;
                            }
                            r1.A05(bool);
                        }
                    }
                }
                if (r6.A04()) {
                    r4.run();
                    return;
                }
            }
            Long A013 = r6.A01();
            if (A013 != null) {
                r7.A01.Bkn(r4, "BloksPreConsentPayloadIqHelper/retryWithBackoff", A013.longValue());
                return;
            }
        }
        r5.A00.A00(r2);
    }
}
