package X;

/* renamed from: X.2om  reason: invalid class name and case insensitive filesystem */
public class C54472om {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;

    public void A03(AnonymousClass1ED r5, AnonymousClass1nB r6, int i, boolean z) {
        if (i != 1 || z) {
            AnonymousClass33C A002 = C30471mV.A00(r6);
            if ((r5.bitField0_ & 32) != 0) {
                byte[] A07 = r5.streamingSidecar_.A07();
                if (A07.length > 0) {
                    C613030d A1v = r6.A1v();
                    C626936e.A06(A1v);
                    synchronized (A1v) {
                        A1v.A03(A07, (int[]) null);
                    }
                }
            }
            C626635z.A08(A002, this.A00, r5.interactiveAnnotations_, r5.annotations_);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r11 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if ((r1 & 256) != 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        r3.A08 = r13.width_;
        r3.A06 = r13.height_;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass1ED r13, X.AnonymousClass1nB r14, int r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            r2 = 1
            if (r15 != r2) goto L_0x001e
            if (r16 != 0) goto L_0x001e
            java.lang.String r0 = r13.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = r13.caption_
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r1, r0)
            r14.A02 = r0
            return
        L_0x0018:
            r0 = 0
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x001e:
            X.33C r3 = new X.33C
            r3.<init>()
            r14.A01 = r3
            X.2z0 r4 = r14.A1J
            X.4uZ r0 = r4.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r16 != 0) goto L_0x0030
            r11 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r11 = 1
        L_0x0031:
            int r0 = r13.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x010b
            X.8Lq r0 = r13.mediaKey_
            byte[] r0 = r0.A07()
            X.AnonymousClass31H.A00(r3, r14, r0)
        L_0x0040:
            int r0 = r13.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0051
            long r0 = r13.mediaKeyTimestamp_
            long r0 = r0 * r9
            r3.A0B = r0
        L_0x0051:
            X.8Lq r0 = r13.jpegThumbnail_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0065
            r14.A02 = r2
            X.30w r0 = r14.A0y()
            r2 = r17
            r0.A04(r1, r2)
        L_0x0065:
            java.lang.String r6 = "; message.key="
            if (r11 == 0) goto L_0x006f
            int r0 = r13.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x007b
        L_0x006f:
            long r1 = r13.fileLength_
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cf
            r14.A00 = r1
            if (r11 == 0) goto L_0x0085
        L_0x007b:
            int r1 = r13.bitField0_
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x008d
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x008d
        L_0x0085:
            int r0 = r13.width_
            r3.A08 = r0
            int r0 = r13.height_
            r3.A06 = r0
        L_0x008d:
            r8 = 14
            java.lang.String r7 = "FMessageVideoCommon/bogus sha-256 hash received; length="
            r2 = 32
            r5 = 2
            if (r11 == 0) goto L_0x009c
            int r0 = r13.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00ab
        L_0x009c:
            X.8Lq r0 = r13.fileSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r2) goto L_0x01c3
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r14.A04 = r0
        L_0x00ab:
            int r0 = r13.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c0
            X.8Lq r0 = r13.fileEncSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r2) goto L_0x01b7
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r14.A03 = r0
        L_0x00c0:
            if (r11 == 0) goto L_0x00c8
            int r0 = r13.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0121
        L_0x00c8:
            java.lang.String r2 = r13.mimetype_
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "empty video mime type"
        L_0x00d2:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r13.mimetype_
            r1.append(r0)
            X.C18260x0.A1S(r1, r6, r4)
            r0 = 17
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x00ed:
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unrecognized video mime type; mimeType="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            goto L_0x00d2
        L_0x010b:
            if (r11 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/missing media key; message.key="
            X.C18260x0.A1S(r1, r0, r4)
            r0 = 16
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x011d:
            java.lang.String r0 = r13.mimetype_
            r14.A05 = r0
        L_0x0121:
            int r1 = r13.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r13.staticUrl_
        L_0x012a:
            r14.A20(r0)
        L_0x012d:
            java.lang.String r0 = r13.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013f
            java.lang.String r1 = r13.caption_
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r1, r0)
            r14.A02 = r0
        L_0x013f:
            if (r11 == 0) goto L_0x01a8
            int r0 = r13.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x01a8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key="
            X.C18260x0.A1S(r1, r0, r4)
        L_0x0150:
            int r1 = r13.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0192
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0192
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0192
            X.2qb r4 = new X.2qb
            r4.<init>()
            java.lang.String r0 = r13.thumbnailDirectPath_
            r4.A04 = r0
            X.8Lq r0 = r13.thumbnailSha256_
            byte[] r2 = r0.A07()
            X.8Lq r0 = r13.thumbnailEncSha256_
            byte[] r1 = r0.A07()
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r5)
            r4.A08 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r4.A05 = r0
            X.8Lq r0 = r13.mediaKey_
            byte[] r0 = r0.A07()
            r4.A0A = r0
            long r0 = r13.mediaKeyTimestamp_
            long r0 = r0 * r9
            r4.A02 = r0
            r14.A1W(r4)
        L_0x0192:
            int r0 = r13.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01a6
            int r0 = r13.seconds_
        L_0x019a:
            r14.A0B = r0
            X.1VX r2 = r12.A00
            X.8ya r1 = r13.interactiveAnnotations_
            X.8ya r0 = r13.annotations_
            X.C626635z.A08(r3, r2, r1, r0)
            return
        L_0x01a6:
            r0 = 0
            goto L_0x019a
        L_0x01a8:
            java.lang.String r0 = r13.directPath_
            r3.A0G = r0
            goto L_0x0150
        L_0x01ad:
            if (r11 == 0) goto L_0x01b3
            r0 = r1 & 1
            if (r0 == 0) goto L_0x012d
        L_0x01b3:
            java.lang.String r0 = r13.url_
            goto L_0x012a
        L_0x01b7:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r7)
            X.C18260x0.A1S(r0, r6, r4)
            X.24W r0 = X.AnonymousClass24W.A00(r8)
            throw r0
        L_0x01c3:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r7)
            X.C18260x0.A1S(r0, r6, r4)
            X.24W r0 = X.AnonymousClass24W.A00(r8)
            throw r0
        L_0x01cf:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/bogus media size received; file_length="
            r3.append(r0)
            r3.append(r1)
            X.C18260x0.A1S(r3, r6, r4)
            r0 = 13
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54472om.A04(X.1ED, X.1nB, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f1, code lost:
        if (r15.A0B <= 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f3, code lost:
        r2 = r15.A0B;
        r1 = X.C18290x4.A0S(r13);
        r1.bitField0_ |= 16;
        r1.seconds_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        r2 = r15.A1w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0205, code lost:
        if (r2 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0207, code lost:
        r1 = X.C18290x4.A0S(r13);
        r1.bitField0_ |= 64;
        r1.caption_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        if (r10 == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0217, code lost:
        if (r4.A0W == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0219, code lost:
        r2 = X.C18270x1.A09(r13, r4.A0W);
        r1 = (X.AnonymousClass1ED) r13.A00;
        r1.bitField0_ |= 32;
        r1.mediaKey_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022b, code lost:
        r0 = r4.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x022f, code lost:
        if (r0 <= 0) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0231, code lost:
        r0 = X.C18290x4.A0B(r0);
        r3 = X.C18290x4.A0S(r13);
        r3.bitField0_ |= com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
        r3.mediaKeyTimestamp_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0241, code lost:
        r6 = r15.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0243, code lost:
        if (r6 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0247, code lost:
        if (r6.A04 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024b, code lost:
        if (r6.A08 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024f, code lost:
        if (r6.A05 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0259, code lost:
        if (java.util.Arrays.equals(r6.A0A, r4.A0W) == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0261, code lost:
        if (r6.A02 != r4.A0B) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0263, code lost:
        r5 = r6.A0C;
        r3 = r6.A04;
        r2 = X.C18290x4.A0S(r13);
        r3.getClass();
        r2.bitField0_ |= 262144;
        r2.thumbnailDirectPath_ = r3;
        r3 = X.C18270x1.A08(r13, r6.A08);
        r2 = (X.AnonymousClass1ED) r13.A00;
        r2.bitField0_ |= 524288;
        r2.thumbnailSha256_ = r3;
        r3 = X.C18270x1.A08(r13, r6.A05);
        r2 = (X.AnonymousClass1ED) r13.A00;
        r2.bitField0_ |= 1048576;
        r2.thumbnailEncSha256_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x029d, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x029f, code lost:
        if (r18 != false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a5, code lost:
        if (r11.A09() == null) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a7, code lost:
        if (r5 == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a9, code lost:
        r2 = X.C18270x1.A09(r13, r11.A09());
        r1 = (X.AnonymousClass1ED) r13.A00;
        r1.bitField0_ |= com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
        r1.jpegThumbnail_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bd, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c3, code lost:
        if (X.C59542x5.A01(r14, r15, r1) == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c5, code lost:
        r0 = r12.A01.A02(r14, r15, r1, r3);
        r1 = X.C18290x4.A0S(r13);
        r0.getClass();
        r1.contextInfo_ = r0;
        r1.bitField0_ |= 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02da, code lost:
        r2 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02dc, code lost:
        if (r2 <= 0) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e0, code lost:
        if (r4.A08 <= 0) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e2, code lost:
        r1 = X.C18290x4.A0S(r13);
        r1.bitField0_ |= 256;
        r1.height_ = r2;
        r2 = r4.A08;
        r1 = (X.AnonymousClass1ED) X.C18320x8.A0C(r13);
        r1.bitField0_ |= 512;
        r1.width_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0304, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0G) != false) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0306, code lost:
        r2 = r4.A0G;
        r1 = X.C18290x4.A0S(r13);
        r2.getClass();
        r1.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        r1.directPath_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0317, code lost:
        r5 = r12.A00;
        r3 = X.C626635z.A06(r4, r5, true);
        r2 = X.C18290x4.A0S(r13);
        r1 = r2.interactiveAnnotations_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0329, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032b, code lost:
        r1 = X.C130786cX.A07(r1);
        r2.interactiveAnnotations_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0331, code lost:
        X.C170208Ch.A05(r3, r1);
        r3 = X.C626635z.A06(r4, r5, false);
        r2 = (X.AnonymousClass1ED) X.C18320x8.A0C(r13);
        r1 = r2.annotations_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0346, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0348, code lost:
        r1 = X.C130786cX.A07(r1);
        r2.annotations_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x034e, code lost:
        X.C170208Ch.A05(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0351, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0352, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C624134x.A0S(r15, "FMessageVideoCommon/message without direct path received; message.key=", r1);
        r1.append("; message.senderJid=");
        X.C18270x1.A17(r15.A0n(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0368, code lost:
        X.C624134x.A0Q(r15, "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key=", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0373, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r7.contains("static.whatsapp.net/downloadable?category=PSA") == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r10 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r3 = r15.A1J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (X.C626635z.A0A(r3, r7) != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageVideoCommon/buildE2eMessage/sending image with invalid url");
        r1.append(r7);
        X.C18260x0.A1S(r1, "; message.key=", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r19 == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r12.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        throw X.AnonymousClass24A.A00(15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r7 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.AnonymousClass2z0.A0C(r15) != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        r3 = r15.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        if (r17 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        if (r10 != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        X.C626936e.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        if ("video/mp4".equals(r3) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if ("video/3gpp".equals(r3) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        if (r19 == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r12.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageVideoCommon/unrecognized video mime type; mimeType=");
        r1.append(r3);
        X.C624134x.A0Q(r15, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        throw X.AnonymousClass24A.A00(17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        r1 = X.C18290x4.A0S(r13);
        r3.getClass();
        r1.bitField0_ |= 2;
        r1.mimetype_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        if (r17 == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0127, code lost:
        if (android.text.TextUtils.isEmpty(r15.A04) != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r8 = android.util.Base64.decode(r15.A04, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        if (r10 != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0131, code lost:
        r3 = r8.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        if (r3 == 32) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0134, code lost:
        if (r19 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        if (r12.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0142, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageVideoCommon/bogus sha-256 hash; length=");
        r1.append(r3);
        X.C624134x.A0Q(r15, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0155, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0156, code lost:
        r3 = X.C18280x3.A0H(r13, r8);
        r1 = (X.AnonymousClass1ED) r13.A00;
        r1.bitField0_ |= 4;
        r1.fileSha256_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        if (android.text.TextUtils.isEmpty(r15.A03) != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016e, code lost:
        r7 = android.util.Base64.decode(r15.A03, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0174, code lost:
        if (r10 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0176, code lost:
        r6 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0177, code lost:
        if (r6 == 32) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        if (r19 == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0185, code lost:
        if (r12.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageVideoCommon/bogus enc sha-256 hash; length=");
        r1.append(r6);
        X.C624134x.A0Q(r15, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019a, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019b, code lost:
        r3 = X.C18280x3.A0H(r13, r7);
        r1 = (X.AnonymousClass1ED) r13.A00;
        r1.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        r1.fileEncSha256_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ad, code lost:
        if (r17 == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b3, code lost:
        if (r15.A00 <= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b5, code lost:
        r0 = r15.A00;
        r5 = X.C18290x4.A0S(r13);
        r5.bitField0_ |= 8;
        r5.fileLength_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c3, code lost:
        if (r17 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c5, code lost:
        r0 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c9, code lost:
        if (r0 > 0) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cb, code lost:
        r5 = X.AnonymousClass001.A0o();
        r5.append("FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size=");
        r5.append(r0);
        X.C624134x.A0Q(r15, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01da, code lost:
        if (r19 == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        if (r12.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ee, code lost:
        throw X.AnonymousClass24A.A00(13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C209519y A01(X.C209519y r13, X.AnonymousClass3Z2 r14, X.AnonymousClass1nB r15, byte[] r16, boolean r17, boolean r18, boolean r19) {
        /*
            r12 = this;
            X.33C r4 = r15.A01
            X.30w r11 = r15.A0y()
            r6 = 0
            if (r17 != 0) goto L_0x0010
            boolean r0 = X.AnonymousClass2z0.A0C(r15)
            r10 = 0
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r10 = 1
        L_0x0011:
            r7 = 16
            if (r4 == 0) goto L_0x0376
            if (r10 != 0) goto L_0x001b
            byte[] r0 = r4.A0W
            if (r0 == 0) goto L_0x0376
        L_0x001b:
            byte[] r0 = r4.A0W
            r5 = 32
            java.lang.String r2 = "; message.key="
            if (r0 == 0) goto L_0x0048
            int r3 = r0.length
            if (r3 == r5) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r3)
            X.C624134x.A0Q(r15, r2, r1)
            if (r19 == 0) goto L_0x0048
            X.1VX r3 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0048
            X.24A r0 = X.AnonymousClass24A.A00(r7)
            throw r0
        L_0x0048:
            java.lang.String r7 = r15.A07
            if (r7 == 0) goto L_0x0099
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0099
            X.1ED r3 = X.C18290x4.A0S(r13)
            int r1 = r3.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.staticUrl_ = r7
        L_0x0062:
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            if (r10 != 0) goto L_0x00c9
        L_0x006d:
            X.2z0 r3 = r15.A1J
            boolean r0 = X.C626635z.A0A(r3, r7)
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r7)
            X.C18260x0.A1S(r1, r2, r3)
            if (r19 == 0) goto L_0x00c9
            X.1VX r3 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 15
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0099:
            if (r10 == 0) goto L_0x00a6
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a6
            if (r7 == 0) goto L_0x006b
            goto L_0x0062
        L_0x00a6:
            X.1ED r1 = X.C18290x4.A0S(r13)
            r7.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r7
            if (r10 != 0) goto L_0x0062
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with url not set; message.key="
            X.C624134x.A0Q(r15, r0, r1)
            goto L_0x0062
        L_0x00c9:
            java.lang.String r3 = r15.A05
            if (r17 == 0) goto L_0x00d3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x011d
        L_0x00d3:
            if (r10 != 0) goto L_0x010e
            X.C626936e.A06(r3)
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x010e
            if (r19 == 0) goto L_0x010e
            X.1VX r7 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r7.A0Y(r0, r1)
            if (r0 == 0) goto L_0x010e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            r1.append(r3)
            X.C624134x.A0Q(r15, r2, r1)
            r0 = 17
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x010e:
            X.1ED r1 = X.C18290x4.A0S(r13)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r3
        L_0x011d:
            r9 = 14
            if (r17 == 0) goto L_0x0129
            java.lang.String r0 = r15.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0166
        L_0x0129:
            java.lang.String r0 = r15.A04
            byte[] r8 = android.util.Base64.decode(r0, r6)
            if (r10 != 0) goto L_0x0156
            int r3 = r8.length
            if (r3 == r5) goto L_0x0156
            if (r19 == 0) goto L_0x0156
            X.1VX r7 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r7.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0156
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r3)
            X.C624134x.A0Q(r15, r2, r1)
            X.24A r0 = X.AnonymousClass24A.A00(r9)
            throw r0
        L_0x0156:
            X.8Lq r3 = X.C18280x3.A0H(r13, r8)
            X.6cX r1 = r13.A00
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r3
        L_0x0166:
            java.lang.String r0 = r15.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = r15.A03
            byte[] r7 = android.util.Base64.decode(r0, r6)
            if (r10 != 0) goto L_0x019b
            int r6 = r7.length
            if (r6 == r5) goto L_0x019b
            if (r19 == 0) goto L_0x019b
            X.1VX r3 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x019b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/bogus enc sha-256 hash; length="
            r1.append(r0)
            r1.append(r6)
            X.C624134x.A0Q(r15, r2, r1)
            X.24A r0 = X.AnonymousClass24A.A00(r9)
            throw r0
        L_0x019b:
            X.8Lq r3 = X.C18280x3.A0H(r13, r7)
            X.6cX r1 = r13.A00
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r3
        L_0x01ab:
            r6 = 0
            if (r17 == 0) goto L_0x01b5
            long r0 = r15.A00
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ef
        L_0x01b5:
            long r0 = r15.A00
            X.1ED r5 = X.C18290x4.A0S(r13)
            int r3 = r5.bitField0_
            r3 = r3 | 8
            r5.bitField0_ = r3
            r5.fileLength_ = r0
            if (r17 != 0) goto L_0x01ef
            long r0 = r15.A00
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x01f3
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size="
            r5.append(r3)
            r5.append(r0)
            X.C624134x.A0Q(r15, r2, r5)
            if (r19 == 0) goto L_0x01f3
            X.1VX r2 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01f3
            r0 = 13
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x01ef:
            int r0 = r15.A0B
            if (r0 <= 0) goto L_0x0201
        L_0x01f3:
            int r2 = r15.A0B
            X.1ED r1 = X.C18290x4.A0S(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r2
        L_0x0201:
            java.lang.String r2 = r15.A1w()
            if (r2 == 0) goto L_0x0213
            X.1ED r1 = X.C18290x4.A0S(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r2
        L_0x0213:
            if (r10 == 0) goto L_0x0219
            byte[] r0 = r4.A0W
            if (r0 == 0) goto L_0x022b
        L_0x0219:
            byte[] r0 = r4.A0W
            X.8Lq r2 = X.C18270x1.A09(r13, r0)
            X.6cX r1 = r13.A00
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x022b:
            long r0 = r4.A0B
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0241
            long r0 = X.C18290x4.A0B(r0)
            X.1ED r3 = X.C18290x4.A0S(r13)
            int r2 = r3.bitField0_
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r3.bitField0_ = r2
            r3.mediaKeyTimestamp_ = r0
        L_0x0241:
            X.2qb r6 = r15.A0l
            if (r6 == 0) goto L_0x0373
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = r6.A08
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x0373
            byte[] r1 = r6.A0A
            byte[] r0 = r4.A0W
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0373
            long r2 = r6.A02
            long r0 = r4.A0B
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0373
            boolean r5 = r6.A0C
            java.lang.String r3 = r6.A04
            X.1ED r2 = X.C18290x4.A0S(r13)
            r3.getClass()
            int r1 = r2.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailDirectPath_ = r3
            java.lang.String r0 = r6.A08
            X.8Lq r3 = X.C18270x1.A08(r13, r0)
            X.6cX r2 = r13.A00
            X.1ED r2 = (X.AnonymousClass1ED) r2
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
            java.lang.String r0 = r6.A05
            X.8Lq r3 = X.C18270x1.A08(r13, r0)
            X.6cX r2 = r13.A00
            X.1ED r2 = (X.AnonymousClass1ED) r2
            int r1 = r2.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailEncSha256_ = r3
        L_0x029d:
            r3 = r18
            if (r18 != 0) goto L_0x0368
            byte[] r0 = r11.A09()
            if (r0 == 0) goto L_0x0368
            if (r5 == 0) goto L_0x0368
            byte[] r0 = r11.A09()
            X.8Lq r2 = X.C18270x1.A09(r13, r0)
            X.6cX r1 = r13.A00
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r2
        L_0x02bd:
            r1 = r16
            boolean r0 = X.C59542x5.A01(r14, r15, r1)
            if (r0 == 0) goto L_0x02da
            X.2x5 r0 = r12.A01
            X.1EF r0 = r0.A02(r14, r15, r1, r3)
            X.1ED r1 = X.C18290x4.A0S(r13)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x02da:
            int r2 = r4.A06
            if (r2 <= 0) goto L_0x02fe
            int r0 = r4.A08
            if (r0 <= 0) goto L_0x02fe
            X.1ED r1 = X.C18290x4.A0S(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.height_ = r2
            int r2 = r4.A08
            X.6cX r1 = X.C18320x8.A0C(r13)
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.width_ = r2
        L_0x02fe:
            java.lang.String r0 = r4.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0352
            java.lang.String r2 = r4.A0G
            X.1ED r1 = X.C18290x4.A0S(r13)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x0317:
            X.1VX r5 = r12.A00
            r0 = 1
            java.util.List r3 = X.C626635z.A06(r4, r5, r0)
            X.1ED r2 = X.C18290x4.A0S(r13)
            X.8ya r1 = r2.interactiveAnnotations_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0331
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.interactiveAnnotations_ = r1
        L_0x0331:
            X.C170208Ch.A05(r3, r1)
            r0 = 0
            java.util.List r3 = X.C626635z.A06(r4, r5, r0)
            X.6cX r2 = X.C18320x8.A0C(r13)
            X.1ED r2 = (X.AnonymousClass1ED) r2
            X.8ya r1 = r2.annotations_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x034e
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.annotations_ = r1
        L_0x034e:
            X.C170208Ch.A05(r3, r1)
            return r13
        L_0x0352:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/message without direct path received; message.key="
            X.C624134x.A0S(r15, r0, r1)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.4uZ r0 = r15.A0n()
            X.C18270x1.A17(r0, r1)
            goto L_0x0317
        L_0x0368:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key="
            X.C624134x.A0Q(r15, r0, r1)
            goto L_0x02bd
        L_0x0373:
            r5 = 1
            goto L_0x029d
        L_0x0376:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key="
            X.C624134x.A0S(r15, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.C624134x.A0U(r15, r0, r1)
            if (r19 == 0) goto L_0x0397
            X.1VX r2 = r12.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0397
            X.24A r0 = X.AnonymousClass24A.A00(r7)
            throw r0
        L_0x0397:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54472om.A01(X.19y, X.3Z2, X.1nB, byte[], boolean, boolean, boolean):X.19y");
    }

    public C54472om(AnonymousClass1VX r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static void A00(C55962rC r8, AnonymousClass1ED r9, AnonymousClass1nB r10, C54472om r11) {
        AnonymousClass1ED r3 = r9;
        AnonymousClass1nB r4 = r10;
        C54472om r2 = r11;
        r2.A04(r3, r4, r8.A01, r8.A04(), r8.A0O);
        r11.A03(r9, r10, r8.A01, r8.A0N);
    }

    public void A02(C55032pg r9, C209519y r10, AnonymousClass1nB r11) {
        boolean A02 = r9.A02();
        C209519y A012 = A01(r10, r9.A01, r11, r9.A09, A02, r9.A03, r9.A02);
        AnonymousClass33C r1 = r11.A01;
        boolean A0C = AnonymousClass2z0.A0C(r11);
        if (r1 == null || A012 == null || (!A0C && !A02 && r1.A0W == null)) {
            C624134x.A0U(r11, "FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=", AnonymousClass001.A0o());
            return;
        }
        C613030d A1v = r11.A1v();
        C626936e.A06(A1v);
        byte[] A06 = A1v.A06();
        if (A06 != null) {
            C172548Lq A09 = C18270x1.A09(A012, A06);
            AnonymousClass1ED r2 = (AnonymousClass1ED) A012.A00;
            r2.bitField0_ |= 32768;
            r2.streamingSidecar_ = A09;
        }
    }
}
