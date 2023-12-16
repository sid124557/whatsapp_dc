package X;

/* renamed from: X.9eQ  reason: invalid class name and case insensitive filesystem */
public final class C198129eQ implements C84964Ek {
    public final /* synthetic */ C42082Ms A00;
    public final /* synthetic */ AnonymousClass49I A01;
    public final /* synthetic */ AnonymousClass49I A02;
    public final /* synthetic */ Object A03;

    public C198129eQ(C42082Ms r1, AnonymousClass49I r2, AnonymousClass49I r3, Object obj) {
        this.A00 = r1;
        this.A03 = obj;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void A00() {
        C69253Wh r2 = this.A00.A01;
        if (r2 != null) {
            r2.BkS(AnonymousClass8DJ.A07(this.A01.B3r(), this.A03));
            return;
        }
        throw C18270x1.A0S("mainThreadHandler");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.lang.String r0 = "bloks_response"
            java.lang.String r1 = r7.getString(r0)     // Catch:{ JSONException -> 0x0075 }
            X.C162457s7.A0H(r1)     // Catch:{ JSONException -> 0x0075 }
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x006e }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006e }
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x0067 }
            r3.<init>(r4)     // Catch:{ all -> 0x0067 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0060 }
            r2.<init>()     // Catch:{ all -> 0x0060 }
            X.C627536m.A0I(r3, r2)     // Catch:{ all -> 0x0059 }
            java.nio.charset.Charset r0 = X.C58152un.A0D     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r2.toString(r0)     // Catch:{ all -> 0x0059 }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x0059 }
            r2.close()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ all -> 0x0067 }
            r4.close()     // Catch:{ IOException -> 0x006e }
            X.2Ms r0 = r6.A00
            X.2EV r4 = r0.A00
            if (r4 == 0) goto L_0x0052
            java.lang.Object r3 = r6.A03
            X.49I r2 = r6.A02
            X.49I r0 = r6.A01
            X.9aK r1 = new X.9aK
            r1.<init>(r4, r2, r0, r3)
            r0 = 0
            X.C159437lp.A00(r1, r0, r5)
            return
        L_0x0052:
            java.lang.String r0 = "accountLinkingExtensionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x006e }
            throw r0     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0075:
            r6.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198129eQ.onSuccess(java.lang.Object):void");
    }

    public void BSC(Exception exc, Integer num) {
        A00();
    }

    public void BQp() {
        A00();
    }
}
