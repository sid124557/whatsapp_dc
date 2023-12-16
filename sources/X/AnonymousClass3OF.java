package X;

import com.whatsapp.util.Log;

/* renamed from: X.3OF  reason: invalid class name */
public class AnonymousClass3OF implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;
    public final AnonymousClass9TU A02;

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0251, code lost:
        if (r0.A08 == false) goto L_0x0253;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C208519o A00(X.C55032pg r10, X.AnonymousClass1nE r11) {
        /*
            r9 = this;
            X.33C r3 = r11.A01
            X.2z0 r2 = r11.A1J
            X.4uZ r0 = r2.A00
            boolean r4 = r0 instanceof X.C95804uY
            if (r3 == 0) goto L_0x028a
            byte[] r0 = r3.A0W
            if (r0 != 0) goto L_0x0016
            boolean r0 = r10.A02()
            if (r0 != 0) goto L_0x0016
            if (r4 == 0) goto L_0x028a
        L_0x0016:
            X.1A4 r0 = r10.A00
            X.6cX r0 = r0.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EA r0 = r0.stickerMessage_
            if (r0 != 0) goto L_0x0022
            X.1EA r0 = X.AnonymousClass1EA.DEFAULT_INSTANCE
        L_0x0022:
            X.6c9 r4 = r0.A0H()
            X.19o r4 = (X.C208519o) r4
            byte[] r0 = r3.A0W
            if (r0 == 0) goto L_0x0068
            int r5 = r0.length
            r0 = 32
            if (r5 == r0) goto L_0x0055
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0055
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r2)
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0055:
            byte[] r0 = r3.A0W
            X.8Lq r5 = X.C18270x1.A09(r4, r0)
            X.6cX r1 = r4.A00
            X.1EA r1 = (X.AnonymousClass1EA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.mediaKey_ = r5
            goto L_0x006d
        L_0x0068:
            java.lang.String r0 = "FMessageSticker/buildE2eMessage/sticker media key missing"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x006d:
            long r0 = r3.A0B
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0085
            long r0 = X.C18290x4.A0B(r0)
            X.1EA r6 = X.C18300x5.A0S(r4)
            int r5 = r6.bitField0_
            r5 = r5 | 512(0x200, float:7.175E-43)
            r6.bitField0_ = r5
            r6.mediaKeyTimestamp_ = r0
        L_0x0085:
            java.lang.String r0 = r11.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = 0
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = r11.A03
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r5 = r1.length
            r0 = 32
            if (r5 == r0) goto L_0x00bd
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00bd
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x00bd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r2)
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00bd:
            X.8Lq r5 = X.C172548Lq.A02(r1, r6, r5)
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r5
        L_0x00cd:
            java.lang.String r0 = r11.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r11.A04
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r5 = r1.length
            r0 = 32
            if (r5 == r0) goto L_0x0104
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0104
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r2)
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0104:
            X.8Lq r5 = X.C172548Lq.A02(r1, r6, r5)
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.fileSha256_ = r5
        L_0x0114:
            int r5 = r3.A06
            if (r5 <= 0) goto L_0x0138
            int r0 = r3.A08
            if (r0 <= 0) goto L_0x0138
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.height_ = r5
            int r5 = r3.A08
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1EA r1 = (X.AnonymousClass1EA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.width_ = r5
        L_0x0138:
            X.3Z2 r5 = r10.A01
            byte[] r1 = r10.A09
            boolean r0 = X.C59542x5.A01(r5, r11, r1)
            if (r0 == 0) goto L_0x0157
            X.2x5 r0 = r9.A01
            X.1EF r0 = X.C55032pg.A00(r0, r10, r5, r11, r1)
            X.1EA r1 = X.C18300x5.A0S(r4)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x0157:
            java.lang.String r5 = r11.A07
            if (r5 == 0) goto L_0x0191
            boolean r0 = X.C626635z.A0A(r2, r5)
            if (r0 != 0) goto L_0x0185
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0185
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0185
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r2)
            r0 = 15
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0185:
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r5
        L_0x0191:
            java.lang.String r5 = r11.A05
            if (r5 == 0) goto L_0x01db
            boolean r0 = r11.A24()
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x01cf
        L_0x01a3:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x01cf
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x01cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r2)
            r0 = 17
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x01c7:
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x01a3
        L_0x01cf:
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.mimetype_ = r5
        L_0x01db:
            java.lang.String r0 = r3.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f4
            java.lang.String r2 = r3.A0G
            X.1EA r1 = X.C18300x5.A0S(r4)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x01f4:
            long r1 = r11.A00
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0206
            X.1EA r5 = X.C18300x5.A0S(r4)
            int r0 = r5.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.bitField0_ = r0
            r5.fileLength_ = r1
        L_0x0206:
            int r2 = r3.A04
            if (r2 <= 0) goto L_0x0216
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.firstFrameLength_ = r2
        L_0x0216:
            byte[] r0 = r3.A0T
            if (r0 == 0) goto L_0x022a
            X.8Lq r2 = X.C18270x1.A09(r4, r0)
            X.6cX r1 = r4.A00
            X.1EA r1 = (X.AnonymousClass1EA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.firstFrameSidecar_ = r2
        L_0x022a:
            boolean r2 = r11.A02
            X.1EA r1 = X.C18300x5.A0S(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.isAnimated_ = r2
            long r2 = r11.A03
            X.6cX r5 = X.C18320x8.A0C(r4)
            X.1EA r5 = (X.AnonymousClass1EA) r5
            int r1 = r5.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r5.bitField0_ = r1
            r5.stickerSentTs_ = r2
            X.330 r0 = r11.A04
            if (r0 == 0) goto L_0x0253
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L_0x0254
        L_0x0253:
            r3 = 0
        L_0x0254:
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1EA r2 = (X.AnonymousClass1EA) r2
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.isAvatar_ = r3
            boolean r3 = r11.A23()
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1EA r2 = (X.AnonymousClass1EA) r2
            int r1 = r2.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.isAiSticker_ = r3
            boolean r3 = r11.A24()
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1EA r2 = (X.AnonymousClass1EA) r2
            int r1 = r2.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.isLottie_ = r3
            return r4
        L_0x028a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; media_wa_type="
            X.C624134x.A0U(r11, r0, r1)
            if (r4 != 0) goto L_0x02b0
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x02b0
            X.1VX r0 = r9.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x02b0
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x02b0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OF.A00(X.2pg, X.1nE):X.19o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r0 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1nE A01(X.C55962rC r14) {
        /*
            r13 = this;
            X.1EU r0 = r14.A0B
            X.1EA r8 = r0.stickerMessage_
            if (r8 != 0) goto L_0x0008
            X.1EA r8 = X.AnonymousClass1EA.DEFAULT_INSTANCE
        L_0x0008:
            X.2z0 r2 = r14.A0D
            long r0 = r14.A05
            X.1nE r7 = new X.1nE
            r7.<init>(r2, r0)
            boolean r1 = r14.A04()
            X.33C r9 = new X.33C
            r9.<init>()
            r7.A01 = r9
            X.2z0 r6 = r7.A1J
            X.4uZ r0 = r6.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r1 != 0) goto L_0x0027
            r12 = 0
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r12 = 1
        L_0x0028:
            int r0 = r8.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0125
            X.8Lq r0 = r8.mediaKey_
            byte[] r0 = r0.A07()
            X.AnonymousClass31H.A00(r9, r7, r0)
        L_0x0037:
            int r11 = r8.bitField0_
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0044
            long r0 = r8.mediaKeyTimestamp_
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r9.A0B = r0
        L_0x0044:
            r5 = 14
            java.lang.String r4 = "FMessageSticker/bogus sha-256 hash received; length="
            r3 = 2
            r2 = 32
            java.lang.String r10 = "; message.key="
            if (r12 == 0) goto L_0x0053
            r0 = r11 & 2
            if (r0 == 0) goto L_0x0062
        L_0x0053:
            X.8Lq r0 = r8.fileSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r2) goto L_0x0165
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r7.A04 = r0
        L_0x0062:
            int r0 = r8.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0077
            X.8Lq r0 = r8.fileEncSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r2) goto L_0x0159
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r7.A03 = r0
        L_0x0077:
            if (r12 == 0) goto L_0x007f
            int r0 = r8.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00ad
        L_0x007f:
            java.lang.String r2 = r8.mimetype_
            boolean r0 = r8.isLottie_
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x00ab
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/invalid sticker mime type; mimetype="
            r1.append(r0)
            r1.append(r2)
            X.C18260x0.A1S(r1, r10, r6)
            r0 = 17
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x00a3:
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x008d
        L_0x00ab:
            r7.A05 = r2
        L_0x00ad:
            int r0 = r8.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r8.url_
            r7.A20(r0)
        L_0x00b8:
            int r1 = r8.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00ca
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00ca
            int r0 = r8.height_
            r9.A06 = r0
            int r0 = r8.width_
            r9.A08 = r0
        L_0x00ca:
            if (r12 == 0) goto L_0x00d0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d4
        L_0x00d0:
            java.lang.String r0 = r8.directPath_
            r9.A0G = r0
        L_0x00d4:
            r0 = r1 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00e6
            long r2 = r8.fileLength_
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            r7.A00 = r2
        L_0x00e6:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00f0
            int r0 = r8.firstFrameLength_
            if (r0 <= 0) goto L_0x00f0
            r9.A04 = r0
        L_0x00f0:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00fe
            X.8Lq r0 = r8.firstFrameSidecar_
            if (r0 == 0) goto L_0x00fe
            byte[] r0 = r0.A07()
            r9.A0T = r0
        L_0x00fe:
            boolean r2 = r8.isAiSticker_
            boolean r1 = r8.isAvatar_
            boolean r0 = r8.isLottie_
            if (r2 == 0) goto L_0x0108
            r0 = r0 | 2
        L_0x0108:
            if (r1 == 0) goto L_0x010c
            r0 = r0 | 4
        L_0x010c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A00 = r0
            r7.A01 = r2
            boolean r0 = r8.isAnimated_
            r7.A02 = r0
            int r1 = r8.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0122
            long r4 = r8.stickerSentTs_
        L_0x0122:
            r7.A03 = r4
            return r7
        L_0x0125:
            if (r12 != 0) goto L_0x0037
            X.1VX r2 = r13.A00
            r1 = 4466(0x1172, float:6.258E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/no media key; message.key="
            X.C18260x0.A1S(r1, r0, r6)
            r0 = 16
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0143:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageSticker/bogus media size received; fileLength="
            r1.append(r0)
            r1.append(r2)
            X.C18260x0.A1S(r1, r10, r6)
            r0 = 13
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0159:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r4)
            X.C18260x0.A1S(r0, r10, r6)
            X.24W r0 = X.AnonymousClass24W.A00(r5)
            throw r0
        L_0x0165:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r4)
            X.C18260x0.A1S(r0, r10, r6)
            X.24W r0 = X.AnonymousClass24W.A00(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OF.A01(X.2rC):X.1nE");
    }

    public void AyD(C55032pg r5, C624134x r6) {
        C624134x.A0W(r6, "FMessageStickerProtobuf: message type is not supported ", AnonymousClass001.A0o(), r6 instanceof AnonymousClass1nE);
        AnonymousClass1nE r62 = (AnonymousClass1nE) r6;
        C624034w r3 = r62.A0P;
        if (r3 != null) {
            this.A02.A03(r3, r5, new AnonymousClass4JW(this, 1), r62);
        } else if (r62.A24()) {
            AnonymousClass1A4 r32 = r5.A00;
            AnonymousClass1AL r0 = ((AnonymousClass1EU) r32.A00).lottieStickerMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r2 = (C209119u) r0.A0H();
            AnonymousClass1A4 r1 = (AnonymousClass1A4) r2.A09().A0H();
            C208519o A002 = A00(r5, r62);
            if (A002 != null) {
                r1.A0G(A002);
                AnonymousClass1AL A003 = C209119u.A00(r1, r2);
                AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r32, A003);
                A0L.lottieStickerMessage_ = A003;
                A0L.bitField1_ |= 134217728;
            }
        } else {
            C208519o A004 = A00(r5, r62);
            if (A004 != null) {
                r5.A00.A0G(A004);
            }
        }
    }

    public C624134x BgW(C55962rC r5) {
        AnonymousClass1EU r3 = r5.A0B;
        if (AnonymousClass000.A1S(r3.bitField0_ & 2097152)) {
            return A01(r5);
        }
        if ((r3.bitField1_ & 134217728) == 0) {
            return null;
        }
        AnonymousClass1AL r0 = r3.lottieStickerMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
        }
        AnonymousClass1EU r02 = r0.message_;
        AnonymousClass1EU r1 = r02;
        if (r02 == null) {
            r02 = AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        if (AnonymousClass000.A1S(r02.bitField0_ & 2097152)) {
            if (r1 == null) {
                r1 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
            return A01(r5.A02(r1));
        }
        Log.d("FMessageStickerProtobuf/parseProtobufMessage received future-proof sticker with no inner sticker message");
        throw AnonymousClass24W.A00(0);
    }

    public AnonymousClass3OF(AnonymousClass1VX r1, C59542x5 r2, AnonymousClass9TU r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
