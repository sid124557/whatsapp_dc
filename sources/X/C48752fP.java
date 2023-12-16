package X;

/* renamed from: X.2fP  reason: invalid class name and case insensitive filesystem */
public class C48752fP {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (X.AnonymousClass2z0.A0C(r13) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1EB r12, X.AnonymousClass1nF r13, int r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r4 = 1
            if (r14 != r4) goto L_0x0013
            if (r15 != 0) goto L_0x0013
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = r12.caption_
            r13.A23(r0)
        L_0x0012:
            return
        L_0x0013:
            X.33C r1 = new X.33C
            r1.<init>()
            r13.A01 = r1
            if (r15 != 0) goto L_0x0023
            boolean r0 = X.AnonymousClass2z0.A0C(r13)
            r10 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r10 = 1
        L_0x0024:
            int r0 = r12.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0170
            X.8Lq r0 = r12.mediaKey_
            byte[] r0 = r0.A07()
            X.AnonymousClass31H.A00(r1, r13, r0)
        L_0x0033:
            int r0 = r12.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0044
            long r2 = r12.mediaKeyTimestamp_
            long r2 = r2 * r8
            r1.A0B = r2
        L_0x0044:
            X.8Lq r0 = r12.jpegThumbnail_
            byte[] r2 = r0.A07()
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0058
            r13.A02 = r4
            X.30w r0 = r13.A0y()
            r3 = r16
            r0.A04(r2, r3)
        L_0x0058:
            java.lang.String r4 = "; message.key="
            if (r10 == 0) goto L_0x0062
            int r0 = r12.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x006c
        L_0x0062:
            long r2 = r12.fileLength_
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01a0
            r13.A00 = r2
        L_0x006c:
            r7 = 14
            java.lang.String r6 = "FMessageDocument/bogus sha-256 hash received; length="
            r5 = 32
            r2 = 2
            if (r10 == 0) goto L_0x007b
            int r0 = r12.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x008a
        L_0x007b:
            X.8Lq r0 = r12.fileSha256_
            byte[] r3 = r0.A07()
            int r0 = r3.length
            if (r0 != r5) goto L_0x0194
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A04 = r0
        L_0x008a:
            int r0 = r12.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x009f
            X.8Lq r0 = r12.fileEncSha256_
            byte[] r3 = r0.A07()
            int r0 = r3.length
            if (r0 != r5) goto L_0x0188
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A03 = r0
        L_0x009f:
            if (r10 == 0) goto L_0x00a7
            int r0 = r12.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00ac
        L_0x00a7:
            java.lang.String r0 = r12.url_
            r13.A20(r0)
        L_0x00ac:
            java.lang.String r0 = r12.title_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = r12.title_
            java.lang.String r0 = X.C107575bX.A0C(r0, r3)
            r13.A02 = r0
        L_0x00be:
            int r0 = r12.pageCount_
            r13.A00 = r0
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = r12.caption_
            r13.A23(r0)
        L_0x00cf:
            java.lang.String r0 = r12.fileName_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = r12.fileName_
            java.lang.String r0 = X.C107575bX.A0C(r0, r3)
            r13.A06 = r0
        L_0x00df:
            if (r10 == 0) goto L_0x016b
            int r0 = r12.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x016b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            X.C624134x.A0S(r13, r0, r1)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.4uZ r0 = r13.A0n()
            X.C18270x1.A17(r0, r1)
        L_0x00fc:
            int r1 = r12.bitField0_
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x015f
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x015f
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x015f
            r0 = r1 & 64
            if (r0 == 0) goto L_0x015f
            X.2qb r3 = new X.2qb
            r3.<init>()
            java.lang.String r0 = r12.thumbnailDirectPath_
            r3.A04 = r0
            X.8Lq r0 = r12.thumbnailSha256_
            java.lang.String r0 = X.C18320x8.A0d(r0, r2)
            r3.A08 = r0
            X.8Lq r0 = r12.thumbnailEncSha256_
            java.lang.String r0 = X.C18320x8.A0d(r0, r2)
            r3.A05 = r0
            X.8Lq r0 = r12.mediaKey_
            byte[] r0 = r0.A07()
            r3.A0A = r0
            int r2 = r12.bitField0_
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x013a
            long r0 = r12.mediaKeyTimestamp_
            long r0 = r0 * r8
            r3.A02 = r0
        L_0x013a:
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0148
            X.8Lq r0 = r12.jpegThumbnail_
            byte[] r0 = r0.A07()
            r3.A0B = r0
        L_0x0148:
            int r1 = r12.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0153
            int r0 = r12.thumbnailWidth_
            r3.A01 = r0
        L_0x0153:
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x015c
            int r0 = r12.thumbnailHeight_
            r3.A00 = r0
        L_0x015c:
            r13.A1W(r3)
        L_0x015f:
            java.lang.String r0 = r12.mimetype_
            r13.A05 = r0
            boolean r0 = r12.contactVcard_
            if (r0 == 0) goto L_0x0012
            r0 = 7
            r13.A09 = r0
            return
        L_0x016b:
            java.lang.String r0 = r12.directPath_
            r1.A0G = r0
            goto L_0x00fc
        L_0x0170:
            if (r10 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/missing media key; message.key="
            X.C624134x.A0Q(r13, r0, r1)
            r0 = 16
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0182:
            r0 = 0
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0188:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r6)
            X.C624134x.A0Q(r13, r4, r0)
            X.24W r0 = X.AnonymousClass24W.A00(r7)
            throw r0
        L_0x0194:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r6)
            X.C624134x.A0Q(r13, r4, r0)
            X.24W r0 = X.AnonymousClass24W.A00(r7)
            throw r0
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/bogus media size received; file_length="
            r1.append(r0)
            r1.append(r2)
            X.C624134x.A0Q(r13, r4, r1)
            r0 = 13
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48752fP.A01(X.1EB, X.1nF, int, boolean, boolean):void");
    }

    public C48752fP(AnonymousClass1VX r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (X.AnonymousClass2z0.A0C(r15) != false) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass33C r11, X.C55032pg r12, X.AnonymousClass19Z r13, X.C614630w r14, X.AnonymousClass1nF r15) {
        /*
            r10 = this;
            boolean r9 = r12.A02()
            boolean r6 = r12.A03
            X.3Z2 r5 = r12.A01
            byte[] r4 = r12.A09
            if (r9 == 0) goto L_0x0014
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0038
        L_0x0014:
            java.lang.String r2 = r15.A07
            X.1EB r1 = X.C18280x3.A0M(r13)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            if (r9 != 0) goto L_0x0038
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with url not set; message.key="
            X.C624134x.A0Q(r15, r0, r1)
        L_0x0038:
            java.lang.String r2 = r15.A05
            if (r2 == 0) goto L_0x0048
            X.1EB r1 = X.C18280x3.A0M(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L_0x0048:
            java.lang.String r2 = r15.A1w()
            if (r2 == 0) goto L_0x005a
            X.1EB r1 = X.C18280x3.A0M(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.title_ = r2
        L_0x005a:
            java.lang.String r0 = r15.A1x()
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = r15.A1x()
            X.1EB r1 = X.C18280x3.A0M(r13)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileName_ = r2
        L_0x0073:
            if (r9 == 0) goto L_0x0079
            int r0 = r15.A00
            if (r0 < 0) goto L_0x0087
        L_0x0079:
            int r2 = r15.A00
            X.1EB r1 = X.C18280x3.A0M(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.pageCount_ = r2
        L_0x0087:
            java.lang.String r3 = r15.A01
            if (r3 == 0) goto L_0x0098
            X.1EB r2 = X.C18280x3.A0M(r13)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.caption_ = r3
        L_0x0098:
            r3 = 0
            if (r9 == 0) goto L_0x00a3
            java.lang.String r0 = r15.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e2
        L_0x00a3:
            java.lang.String r0 = r15.A04
            byte[] r2 = android.util.Base64.decode(r0, r3)
            int r1 = r2.length
            r0 = 32
            if (r1 == r0) goto L_0x00d2
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 hash; length="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r15, r0, r7)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x00d2
            X.1VX r0 = r10.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x00d2
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00d2:
            X.8Lq r2 = X.C172548Lq.A02(r2, r3, r1)
            X.1EB r1 = X.C18280x3.A0M(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r2
        L_0x00e2:
            java.lang.String r0 = r15.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = r15.A03
            byte[] r2 = android.util.Base64.decode(r0, r3)
            int r1 = r2.length
            r0 = 32
            if (r1 == r0) goto L_0x0119
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 enc hash; length="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r15, r0, r7)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0119
            X.1VX r0 = r10.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0119
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0119:
            X.8Lq r2 = X.C172548Lq.A02(r2, r3, r1)
            X.1EB r1 = X.C18280x3.A0M(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r2
        L_0x0129:
            r7 = 0
            if (r9 == 0) goto L_0x0133
            long r0 = r15.A00
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0174
        L_0x0133:
            long r0 = r15.A00
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x015d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "FMessageDocument/buildE2eMessage/sending document with media size not set, size="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r15, r0, r3)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x015d
            X.1VX r0 = r10.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x015d
            r0 = 13
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x015d:
            long r0 = r15.A00
            X.1EB r3 = X.C18280x3.A0M(r13)
            int r2 = r3.bitField0_
            r2 = r2 | 16
            r3.bitField0_ = r2
            r3.fileLength_ = r0
            if (r9 != 0) goto L_0x0174
            boolean r1 = X.AnonymousClass2z0.A0C(r15)
            r0 = 0
            if (r1 == 0) goto L_0x0175
        L_0x0174:
            r0 = 1
        L_0x0175:
            byte[] r1 = r11.A0W
            if (r1 != 0) goto L_0x0182
            if (r0 != 0) goto L_0x01c7
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0182:
            r0 = 16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r1.length
            r0 = 32
            if (r2 == r0) goto L_0x01b5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r15, r0, r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x01b5
            X.1VX r2 = r10.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01b5
            r1 = 0
            X.24A r0 = new X.24A
            r0.<init>(r3, r1)
            throw r0
        L_0x01b5:
            byte[] r0 = r11.A0W
            X.8Lq r2 = X.C18280x3.A0H(r13, r0)
            X.6cX r1 = r13.A00
            X.1EB r1 = (X.AnonymousClass1EB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x01c7:
            long r0 = r11.A0B
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x01dd
            long r0 = X.C18290x4.A0B(r0)
            X.1EB r3 = X.C18280x3.A0M(r13)
            int r2 = r3.bitField0_
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3.bitField0_ = r2
            r3.mediaKeyTimestamp_ = r0
        L_0x01dd:
            X.2qb r7 = r15.A0l
            if (r7 == 0) goto L_0x02da
            java.lang.String r0 = r7.A04
            if (r0 == 0) goto L_0x02da
            java.lang.String r0 = r7.A08
            if (r0 == 0) goto L_0x02da
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x02da
            byte[] r0 = r7.A0B
            if (r0 == 0) goto L_0x02da
            byte[] r1 = r7.A0A
            byte[] r0 = r11.A0W
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x02da
            long r2 = r7.A02
            long r0 = r11.A0B
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x02da
            r8 = 1
            java.lang.String r2 = r7.A04
            X.1EB r1 = X.C18280x3.A0M(r13)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.thumbnailDirectPath_ = r2
            java.lang.String r0 = r7.A08
            X.8Lq r2 = X.C18270x1.A08(r13, r0)
            X.6cX r1 = r13.A00
            X.1EB r1 = (X.AnonymousClass1EB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.thumbnailSha256_ = r2
            java.lang.String r0 = r7.A05
            X.8Lq r2 = X.C18270x1.A08(r13, r0)
            X.6cX r1 = r13.A00
            X.1EB r1 = (X.AnonymousClass1EB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
            r1.thumbnailEncSha256_ = r2
            int r3 = r7.A01
            if (r3 <= 0) goto L_0x0261
            int r0 = r7.A00
            if (r0 <= 0) goto L_0x0261
            X.6cX r2 = X.C18320x8.A0C(r13)
            X.1EB r2 = (X.AnonymousClass1EB) r2
            int r1 = r2.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailWidth_ = r3
            int r3 = r7.A00
            X.6cX r2 = X.C18320x8.A0C(r13)
            X.1EB r2 = (X.AnonymousClass1EB) r2
            int r1 = r2.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailHeight_ = r3
        L_0x0261:
            if (r6 != 0) goto L_0x027d
            if (r8 == 0) goto L_0x02cf
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x02cf
            byte[] r0 = r7.A0B
        L_0x026b:
            X.8Lq r3 = X.C18280x3.A0H(r13, r0)
            X.6cX r2 = r13.A00
            X.1EB r2 = (X.AnonymousClass1EB) r2
            int r1 = r2.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.jpegThumbnail_ = r3
        L_0x027d:
            boolean r0 = X.C59542x5.A01(r5, r15, r4)
            if (r0 == 0) goto L_0x0299
            X.2x5 r0 = r10.A01
            X.1EF r0 = r0.A02(r5, r15, r4, r6)
            X.1EB r2 = X.C18280x3.A0M(r13)
            r0.getClass()
            r2.contextInfo_ = r0
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0299:
            java.lang.String r0 = r11.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02c5
            java.lang.String r2 = r11.A0G
            X.1EB r1 = X.C18280x3.A0M(r13)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x02b2:
            int r1 = r15.A09
            r0 = 7
            if (r1 != r0) goto L_0x02c4
            X.1EB r2 = X.C18280x3.A0M(r13)
            r1 = 1
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.contactVcard_ = r1
        L_0x02c4:
            return
        L_0x02c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key="
            X.C624134x.A0Q(r15, r0, r1)
            goto L_0x02b2
        L_0x02cf:
            byte[] r0 = r14.A09()
            if (r0 == 0) goto L_0x027d
            byte[] r0 = r14.A09()
            goto L_0x026b
        L_0x02da:
            r8 = 0
            goto L_0x0261
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48752fP.A00(X.33C, X.2pg, X.19Z, X.30w, X.1nF):void");
    }
}
