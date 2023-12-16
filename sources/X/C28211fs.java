package X;

import com.whatsapp.stickers.WebpUtils;

/* renamed from: X.1fs  reason: invalid class name and case insensitive filesystem */
public final class C28211fs extends C172738Mn {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C56352rq A02;
    public final C620633i A03;
    public final C46042az A04;
    public final C135466ki A05;
    public final WebpUtils A06;
    public final C45122Yt A07;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00da, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e1, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0122, code lost:
        if (r2.exists() != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7N0 A03() {
        /*
            r14 = this;
            X.6ki r3 = r14.A05
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x006d
            X.2rq r0 = r14.A02
            java.io.File r2 = r0.A02(r4)
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x006d
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r2, r4)
        L_0x0017:
            r9 = 0
            if (r6 == 0) goto L_0x006a
            java.lang.Object r8 = r6.first
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r10 = r6.second
            java.lang.String r10 = (java.lang.String) r10
        L_0x0022:
            r12 = -1
            X.2Yt r1 = r14.A07
            java.lang.String r0 = r3.A04
            X.7bC r5 = r1.A00(r8, r0)
            if (r8 == 0) goto L_0x0066
            java.lang.String r0 = r8.getAbsolutePath()
            if (r0 == 0) goto L_0x0066
            if (r5 == 0) goto L_0x0066
            long r6 = r8.length()
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            r0 = 2131894011(0x7f121efb, float:1.9422815E38)
        L_0x0043:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x012d
            int r1 = r0.intValue()
            X.8oe r0 = r3.A05
            r0.B1x(r1)
            r13 = 0
            X.6kp r7 = new X.6kp
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x005a:
            X.20j r0 = X.C369520j.SEND
            boolean r0 = r5.A04(r0)
            if (r0 != 0) goto L_0x0131
            r0 = 2131887452(0x7f12055c, float:1.9409511E38)
            goto L_0x0043
        L_0x0066:
            r0 = 2131893800(0x7f121e28, float:1.9422387E38)
            goto L_0x0043
        L_0x006a:
            r8 = r9
            r10 = r9
            goto L_0x0022
        L_0x006d:
            java.io.File r2 = r3.A01
            if (r2 == 0) goto L_0x007e
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x007e
            r0 = 0
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r2, r0)
            goto L_0x0017
        L_0x007e:
            java.io.File r4 = r3.A06
            X.C162457s7.A0D(r4)
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x00b5
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/sticker uri is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008c:
            r0 = 0
        L_0x008d:
            r5 = 0
            if (r0 == 0) goto L_0x0103
            com.whatsapp.stickers.WebpUtils r6 = r14.A06
            java.lang.String r0 = r4.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r2 = r6.A02(r0)
            if (r2 == 0) goto L_0x00f4
            int r0 = r2.height
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L_0x00f4
            int r0 = r2.width
            if (r0 != r1) goto L_0x00f4
            X.330 r0 = r3.A00
            if (r0 == 0) goto L_0x00f7
            byte[] r0 = r0.A02()
            boolean r0 = r6.A03(r4, r0)
            if (r0 == 0) goto L_0x00f7
            goto L_0x00ed
        L_0x00b5:
            X.33i r0 = r14.A03     // Catch:{ Exception -> 0x00e5 }
            X.5UR r1 = r0.A0R()     // Catch:{ Exception -> 0x00e5 }
            if (r1 == 0) goto L_0x00dc
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00e5 }
            java.io.InputStream r2 = r1.A06(r0)     // Catch:{ Exception -> 0x00e5 }
            if (r2 != 0) goto L_0x00cd
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x008c
        L_0x00cd:
            r0 = 500000(0x7a120, double:2.47033E-318)
            boolean r0 = X.C627536m.A0S(r4, r2, r0)     // Catch:{ all -> 0x00d8 }
            r2.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x008d
        L_0x00d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00e4
        L_0x00e1:
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ Exception -> 0x00e5 }
        L_0x00e4:
            throw r0     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/copyStickerFileFromUri exception "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x008d
        L_0x00ed:
            X.2qk r0 = r14.A00     // Catch:{ IOException -> 0x00fd }
            java.lang.String r5 = X.C615131b.A00(r0, r4)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0103
        L_0x00f4:
            java.lang.String r0 = "ProcessStickerTask/processMedia/sticker uri in processMediaRequestData was invalid"
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r0 = "ProcessStickerTask/processMedia/there is no sticker metadata object in processMediaRequestData"
        L_0x00f9:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0103
        L_0x00fd:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia/unable to get sticker hash"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0103:
            r6 = 0
            if (r5 == 0) goto L_0x0017
            X.2rq r0 = r14.A02
            java.io.File r2 = r0.A02(r5)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0124
            X.3Dh r0 = r14.A01     // Catch:{ IOException -> 0x0118 }
            r0.A0b(r4, r2)     // Catch:{ IOException -> 0x0118 }
            goto L_0x011e
        L_0x0118:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia failed to move file to destination "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x011e:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0017
        L_0x0124:
            X.C18270x1.A0x(r4)
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r2, r5)
            goto L_0x0017
        L_0x012d:
            if (r5 != 0) goto L_0x0131
            r11 = r9
            goto L_0x0157
        L_0x0131:
            X.38t r4 = X.C633138t.A0b
            java.io.File r3 = r5.A00
            java.lang.String r2 = r5.A02()
            r0 = 0
            X.7Mx r1 = new X.7Mx
            r1.<init>(r4, r3, r2, r0)
            X.2az r0 = r14.A04
            X.2QF r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x015e
            byte[] r11 = r0.A02
        L_0x0149:
            X.7jl r0 = r5.A01()
            int r12 = r0.A00
            boolean r0 = r5.A03()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        L_0x0157:
            r13 = 1
            X.6kp r7 = new X.6kp
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x015e:
            r11 = 0
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28211fs.A03():X.7N0");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28211fs(C55682qk r2, C64393Dh r3, C56352rq r4, C620633i r5, C46042az r6, C135466ki r7, WebpUtils webpUtils, C45122Yt r9) {
        super(r7);
        C18260x0.A0f(r2, webpUtils, r3, r5, r4);
        C162457s7.A0J(r7, 6);
        this.A00 = r2;
        this.A06 = webpUtils;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r9;
    }
}
