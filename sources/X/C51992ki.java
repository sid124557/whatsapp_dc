package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.2ki  reason: invalid class name and case insensitive filesystem */
public class C51992ki {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0200, code lost:
        if (r12 != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0228, code lost:
        if ((r1 & 32) != 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022a, code lost:
        r2.A08 = r14.width_;
        r2.A06 = r14.height_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0240, code lost:
        if (r12 != false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r3 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass1EE r14, X.AnonymousClass1nA r15, int r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r5 = 1
            r0 = r16
            if (r0 != r5) goto L_0x0020
            if (r17 != 0) goto L_0x0020
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r1 = r14.caption_
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r1, r0)
            r15.A02 = r0
            return
        L_0x001a:
            r0 = 0
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0020:
            X.33C r2 = new X.33C
            r2.<init>()
            r15.A01 = r2
            X.2z0 r4 = r15.A1J
            X.4uZ r0 = r4.A00
            boolean r3 = r0 instanceof X.C95804uY
            r8 = 0
            if (r17 != 0) goto L_0x0033
            r12 = 0
            if (r3 == 0) goto L_0x0034
        L_0x0033:
            r12 = 1
        L_0x0034:
            int r0 = r14.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015d
            X.8Lq r0 = r14.mediaKey_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0046
            X.AnonymousClass31H.A00(r2, r15, r1)
        L_0x0046:
            int r7 = r14.bitField0_
            r0 = r7 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0057
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r10
            r2.A0B = r0
        L_0x0057:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r7
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r6 = 2
            if (r0 == 0) goto L_0x009c
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r7
            if (r0 == 0) goto L_0x009c
            r0 = 2097152(0x200000, float:2.938736E-39)
            r7 = r7 & r0
            if (r7 == 0) goto L_0x009c
            X.2qb r7 = new X.2qb
            r7.<init>()
            java.lang.String r0 = r14.thumbnailDirectPath_
            r7.A04 = r0
            X.8Lq r0 = r14.thumbnailSha256_
            byte[] r9 = r0.A07()
            X.8Lq r0 = r14.thumbnailEncSha256_
            byte[] r1 = r0.A07()
            java.lang.String r0 = android.util.Base64.encodeToString(r9, r6)
            r7.A08 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r7.A05 = r0
            X.8Lq r0 = r14.mediaKey_
            byte[] r0 = r0.A07()
            r7.A0A = r0
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r10
            r7.A02 = r0
            r15.A1W(r7)
        L_0x009c:
            X.4Fk r0 = r14.scanLengths_
            int r9 = r0.size()
            int r1 = r14.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = X.C18270x1.A1T(r1, r0)
            r7 = 32
            if (r0 == 0) goto L_0x011d
            if (r9 <= 0) goto L_0x011d
            X.8Lq r0 = r14.scansSidecar_
            byte[] r1 = r0.A07()
            int[] r11 = new int[r9]
            r10 = 0
        L_0x00b9:
            X.4Fk r0 = r14.scanLengths_
            X.6bX r0 = (X.C130176bX) r0
            r0.A01(r10)
            int[] r0 = r0.A01
            r0 = r0[r10]
            r11[r10] = r0
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x00b9
            if (r9 < r6) goto L_0x011d
            int r0 = r1.length
            int r0 = r0 / 10
            if (r0 != r9) goto L_0x011d
            X.30d r0 = r15.A1v()
            X.C626936e.A06(r0)
            r0.A03(r1, r11)
            int r1 = r14.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f1
            X.8Lq r0 = r14.midQualityFileSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r7) goto L_0x00f1
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r2.A0L = r0
        L_0x00f1:
            int r1 = r14.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0107
            X.8Lq r0 = r14.midQualityFileEncSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0107
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r2.A0K = r0
        L_0x0107:
            r10 = 10
            byte[] r9 = new byte[r10]
            X.8Lq r1 = r14.scansSidecar_
            int r0 = r1.A03()
            X.C172548Lq.A00(r8, r10, r0)
            r1.A06(r9, r10)
            r2.A0T = r9
            r0 = r11[r8]
            r2.A04 = r0
        L_0x011d:
            X.8Lq r0 = r14.jpegThumbnail_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            r8 = r18
            if (r0 > 0) goto L_0x012a
            if (r18 == 0) goto L_0x0133
        L_0x012a:
            r15.A02 = r5
            X.30w r0 = r15.A0y()
            r0.A04(r1, r8)
        L_0x0133:
            java.lang.String r5 = "; message.key="
            if (r12 == 0) goto L_0x013d
            int r0 = r14.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0175
        L_0x013d:
            long r0 = r14.fileLength_
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x016f
            if (r3 != 0) goto L_0x016f
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "FMessageImageCommon/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C18260x0.A1S(r3, r5, r4)
            r0 = 13
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x015d:
            if (r12 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/missing media key; message.key="
            X.C18260x0.A1S(r1, r0, r4)
            r0 = 16
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x016f:
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0175
            r15.A00 = r0
        L_0x0175:
            r9 = 14
            java.lang.String r8 = "FMessageImageCommon/bogus sha-256 hash received; length="
            if (r12 == 0) goto L_0x0181
            int r0 = r14.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0190
        L_0x0181:
            X.8Lq r0 = r14.fileSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r7) goto L_0x024f
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A04 = r0
        L_0x0190:
            int r0 = r14.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01a5
            X.8Lq r0 = r14.fileEncSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0243
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A03 = r0
        L_0x01a5:
            if (r3 != 0) goto L_0x01b3
            int r1 = r14.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = r14.staticUrl_
        L_0x01b0:
            r15.A20(r0)
        L_0x01b3:
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c5
            java.lang.String r1 = r14.caption_
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r1, r0)
            r15.A02 = r0
        L_0x01c5:
            if (r12 == 0) goto L_0x01cd
            int r0 = r14.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0202
        L_0x01cd:
            java.lang.String r0 = "image/jpeg"
            java.lang.String r3 = r14.mimetype_
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x01fe
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r3)
            X.C18260x0.A1S(r1, r5, r4)
            r0 = 17
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x01f5:
            if (r17 == 0) goto L_0x01fb
            r0 = r1 & 1
            if (r0 == 0) goto L_0x01b3
        L_0x01fb:
            java.lang.String r0 = r14.url_
            goto L_0x01b0
        L_0x01fe:
            r15.A05 = r3
            if (r12 == 0) goto L_0x023c
        L_0x0202:
            int r0 = r14.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x023c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/message without direct path received; message.key="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.4uZ r0 = r15.A0n()
            X.C18270x1.A17(r0, r1)
        L_0x0220:
            int r1 = r14.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0232
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0232
        L_0x022a:
            int r0 = r14.width_
            r2.A08 = r0
            int r0 = r14.height_
            r2.A06 = r0
        L_0x0232:
            X.1VX r3 = r13.A00
            X.8ya r1 = r14.interactiveAnnotations_
            X.8ya r0 = r14.annotations_
            X.C626635z.A08(r2, r3, r1, r0)
            return
        L_0x023c:
            java.lang.String r0 = r14.directPath_
            r2.A0G = r0
            if (r12 == 0) goto L_0x022a
            goto L_0x0220
        L_0x0243:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r8)
            X.C18260x0.A1S(r0, r5, r4)
            X.24W r0 = X.AnonymousClass24W.A00(r9)
            throw r0
        L_0x024f:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r8)
            X.C18260x0.A1S(r0, r5, r4)
            X.24W r0 = X.AnonymousClass24W.A00(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51992ki.A03(X.1EE, X.1nA, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0222, code lost:
        if (r6.A08 <= 0) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0224, code lost:
        r1 = X.AnonymousClass0x7.A0V(r7);
        r1.bitField0_ |= 32;
        r1.height_ = r3;
        r3 = r6.A08;
        r1 = X.AnonymousClass0x7.A0V(r7);
        r1.bitField0_ |= 64;
        r1.width_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0244, code lost:
        if (android.text.TextUtils.isEmpty(r6.A0G) != false) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0246, code lost:
        r3 = r6.A0G;
        r1 = X.AnonymousClass0x7.A0V(r7);
        r3.getClass();
        r1.bitField0_ |= 512;
        r1.directPath_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0257, code lost:
        r14 = r2.A1v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x025b, code lost:
        if (r14 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x025d, code lost:
        r3 = r14.A06();
        r13 = r14.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0265, code lost:
        if (r13 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0267, code lost:
        if (r3 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0269, code lost:
        r12 = r13.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026b, code lost:
        if (r12 < 2) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026d, code lost:
        r1 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0270, code lost:
        if ((r1 / 10) != r12) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0272, code lost:
        r10 = X.C18300x5.A0J(r7, r3, r1);
        r3 = (X.AnonymousClass1EE) r7.A00;
        r3.bitField0_ |= 65536;
        r3.scansSidecar_ = r10;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0284, code lost:
        r10 = r13[r11];
        r3 = X.AnonymousClass0x7.A0V(r7);
        r1 = r3.scanLengths_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0291, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0293, code lost:
        r1 = X.C130786cX.A06(r1);
        r3.scanLengths_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0299, code lost:
        r1.AwT(r10);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029e, code lost:
        if (r11 < r12) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a0, code lost:
        r10 = !r14.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02aa, code lost:
        if (android.text.TextUtils.isEmpty(r6.A0L) != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ac, code lost:
        r11 = X.C18270x1.A08(r7, r6.A0L);
        r3 = (X.AnonymousClass1EE) r7.A00;
        r3.bitField0_ |= X.AnonymousClass35S.A0F;
        r3.midQualityFileSha256_ = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bf, code lost:
        r11 = r2.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c1, code lost:
        if (r11 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c5, code lost:
        if (r11.A04 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c9, code lost:
        if (r11.A08 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02cd, code lost:
        if (r11.A05 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d7, code lost:
        if (java.util.Arrays.equals(r11.A0A, r6.A0W) == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02df, code lost:
        if (r11.A02 != r6.A0B) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e1, code lost:
        r10 = r11.A0C;
        r3 = r11.A04;
        r2 = X.AnonymousClass0x7.A0V(r7);
        r3.getClass();
        r2.bitField0_ |= 1048576;
        r2.thumbnailDirectPath_ = r3;
        r3 = X.C18270x1.A08(r7, r11.A08);
        r2 = (X.AnonymousClass1EE) r7.A00;
        r2.bitField0_ |= 2097152;
        r2.thumbnailSha256_ = r3;
        r3 = X.C18270x1.A08(r7, r11.A05);
        r2 = (X.AnonymousClass1EE) r7.A00;
        r2.bitField0_ |= 4194304;
        r2.thumbnailEncSha256_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x031d, code lost:
        if (r8.A03 != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0323, code lost:
        if (r17.A09() == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0325, code lost:
        if (r10 == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0327, code lost:
        r2 = X.C18280x3.A0H(r7, r17.A09());
        r1 = (X.AnonymousClass1EE) r7.A00;
        r1.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        r1.jpegThumbnail_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x033b, code lost:
        r4 = r4.A00;
        r3 = X.C626635z.A06(r6, r4, true);
        r2 = X.AnonymousClass0x7.A0V(r7);
        r1 = r2.interactiveAnnotations_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034d, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x034f, code lost:
        r1 = X.C130786cX.A07(r1);
        r2.interactiveAnnotations_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0355, code lost:
        X.C170208Ch.A05(r3, r1);
        r3 = X.C626635z.A06(r6, r4, false);
        r2 = X.AnonymousClass0x7.A0V(r7);
        r1 = r2.annotations_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0367, code lost:
        if (((X.AnonymousClass8T6) r1).A00 != false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0369, code lost:
        r1 = X.C130786cX.A07(r1);
        r2.annotations_ = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036f, code lost:
        X.C170208Ch.A05(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0372, code lost:
        return r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0373, code lost:
        X.C18260x0.A1S(X.AnonymousClass001.A0o(), "FMessageImageCommon/buildE2eMessage/image thumbnail missing; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037d, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0380, code lost:
        X.C18260x0.A1S(X.AnonymousClass001.A0o(), "FMessageImageCommon/buildE2eMessage/sending image with directPath not set; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r11.contains("static.whatsapp.net/downloadable?category=PSA") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r12 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (X.C626635z.A0A(r5, r11) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageImageCommon/buildE2eMessage/sending image with invalid url");
        r1.append(r11);
        X.C18260x0.A1S(r1, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r8.A02 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r4.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        throw X.AnonymousClass24A.A00(15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r11 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        r11 = r2.A05;
        r1 = X.AnonymousClass0x7.A0V(r7);
        r1.bitField0_ |= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (r11 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r1.mimetype_ = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if ("image/jpeg".equalsIgnoreCase(r11) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if ("image/png".equalsIgnoreCase(r11) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r10 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageImageCommon/invalid mime type; mimetype=");
        r1.append(r11);
        X.C18260x0.A1S(r1, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        throw X.AnonymousClass24A.A00(17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r1.mimetype_ = "image/jpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r11 = r2.A1w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r11 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d9, code lost:
        r1 = X.AnonymousClass0x7.A0V(r7);
        r1.bitField0_ |= 4;
        r1.caption_ = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        if (r18 == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        if (android.text.TextUtils.isEmpty(r2.A04) != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        r0 = android.util.Base64.decode(r2.A04, 0);
        r11 = r0.length;
        r12 = X.C18300x5.A0J(r7, r0, r11);
        r1 = (X.AnonymousClass1EE) r7.A00;
        r1.bitField0_ |= 8;
        r1.fileSha256_ = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        if (r11 == 32) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageImageCommon/bogus sha-256 hash; length=");
        r1.append(r11);
        X.C18260x0.A1S(r1, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        if (android.text.TextUtils.isEmpty(r2.A03) != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        r0 = android.util.Base64.decode(r2.A03, 0);
        r12 = r0.length;
        r11 = X.C18300x5.A0J(r7, r0, r12);
        r1 = (X.AnonymousClass1EE) r7.A00;
        r1.bitField0_ |= 256;
        r1.fileEncSha256_ = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013f, code lost:
        if (r12 == 32) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0141, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageImageCommon/bogus sha-256 enc hash; length=");
        r1.append(r12);
        X.C18260x0.A1S(r1, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r18 == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r0 > 0) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        r12 = X.AnonymousClass001.A0o();
        r12.append("FMessageImageCommon/buildE2eMessage/image media size not set, size=");
        r12.append(r0);
        X.C18260x0.A1S(r12, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        if (r8.A02 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017e, code lost:
        if (r4.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
        throw X.AnonymousClass24A.A00(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0185, code lost:
        r0 = r2.A00;
        r12 = X.AnonymousClass0x7.A0V(r7);
        r12.bitField0_ |= 16;
        r12.fileLength_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0193, code lost:
        if (r18 != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0195, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0199, code lost:
        if (r0 > 0) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019b, code lost:
        r12 = X.AnonymousClass001.A0o();
        r12.append("FMessageImageCommon/buildE2eMessage/sending image with media size not set, size=");
        r12.append(r0);
        X.C18260x0.A1S(r12, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
        if (r8.A02 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b8, code lost:
        if (r4.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01be, code lost:
        throw X.AnonymousClass24A.A00(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bf, code lost:
        if (r10 != false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c1, code lost:
        if (r18 == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c5, code lost:
        if (r6.A0W == null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c7, code lost:
        r0 = r6.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (r0 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        r10 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
        if (r10 == 32) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d0, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
        r1.append(r10);
        X.C18260x0.A1S(r1, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e1, code lost:
        if (r8.A02 == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ed, code lost:
        if (r4.A00.A0Y(X.C58422vE.A02, 4465) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f3, code lost:
        throw X.AnonymousClass24A.A00(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f4, code lost:
        r3 = X.C18280x3.A0H(r7, r6.A0W);
        r1 = (X.AnonymousClass1EE) r7.A00;
        r1.bitField0_ |= 128;
        r1.mediaKey_ = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0206, code lost:
        r0 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020a, code lost:
        if (r0 <= 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020c, code lost:
        r0 = X.C18290x4.A0B(r0);
        r10 = X.AnonymousClass0x7.A0V(r7);
        r10.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        r10.mediaKeyTimestamp_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021c, code lost:
        r3 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021e, code lost:
        if (r3 <= 0) goto L_0x023e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C207219b A01(X.C55032pg r20, X.C207219b r21, X.AnonymousClass1nA r22) {
        /*
            r19 = this;
            r8 = r20
            boolean r18 = r8.A02()
            r2 = r22
            X.33C r6 = r2.A01
            X.30w r17 = r2.A0y()
            X.2z0 r5 = r2.A1J
            X.4uZ r0 = r5.A00
            boolean r10 = r0 instanceof X.C95804uY
            r9 = 0
            if (r18 != 0) goto L_0x001a
            r12 = 0
            if (r10 == 0) goto L_0x001b
        L_0x001a:
            r12 = 1
        L_0x001b:
            r16 = 16
            r4 = r19
            if (r6 == 0) goto L_0x038b
            if (r12 != 0) goto L_0x0027
            byte[] r0 = r6.A0W
            if (r0 == 0) goto L_0x038b
        L_0x0027:
            java.lang.String r11 = r2.A07
            r7 = r21
            if (r11 == 0) goto L_0x0080
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0080
            X.1EE r3 = X.AnonymousClass0x7.A0V(r7)
            int r1 = r3.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.staticUrl_ = r11
        L_0x0043:
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r1 = r11.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            java.lang.String r3 = "; message.key="
            if (r0 != 0) goto L_0x0054
            if (r12 != 0) goto L_0x009b
        L_0x0054:
            boolean r0 = X.C626635z.A0A(r5, r11)
            if (r0 != 0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r11)
            X.C18260x0.A1S(r1, r3, r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x009b
            X.1VX r11 = r4.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r0, r1)
            if (r0 == 0) goto L_0x009b
            r0 = 15
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0080:
            if (r12 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x008b
            if (r11 == 0) goto L_0x004d
            goto L_0x0043
        L_0x008b:
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            r11.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r11
            goto L_0x0043
        L_0x009b:
            java.lang.String r11 = r2.A05
            java.lang.String r12 = "image/jpeg"
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            if (r11 == 0) goto L_0x00d1
            r1.mimetype_ = r11
            boolean r0 = r12.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r11)
            X.C18260x0.A1S(r1, r3, r5)
            r0 = 17
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00d1:
            r1.mimetype_ = r12
        L_0x00d3:
            java.lang.String r11 = r2.A1w()
            if (r11 == 0) goto L_0x00e5
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.caption_ = r11
        L_0x00e5:
            r14 = 14
            r13 = 32
            if (r18 == 0) goto L_0x00f3
            java.lang.String r0 = r2.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0120
        L_0x00f3:
            java.lang.String r0 = r2.A04
            byte[] r0 = android.util.Base64.decode(r0, r9)
            int r11 = r0.length
            X.8Lq r12 = X.C18300x5.A0J(r7, r0, r11)
            X.6cX r1 = r7.A00
            X.1EE r1 = (X.AnonymousClass1EE) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r12
            if (r11 == r13) goto L_0x0120
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r11)
            X.C18260x0.A1S(r1, r3, r5)
            X.24A r0 = X.AnonymousClass24A.A00(r14)
            throw r0
        L_0x0120:
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = r2.A03
            byte[] r0 = android.util.Base64.decode(r0, r9)
            int r12 = r0.length
            X.8Lq r11 = X.C18300x5.A0J(r7, r0, r12)
            X.6cX r1 = r7.A00
            X.1EE r1 = (X.AnonymousClass1EE) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r11
            if (r12 == r13) goto L_0x0155
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r12)
            X.C18260x0.A1S(r1, r3, r5)
            X.24A r0 = X.AnonymousClass24A.A00(r14)
            throw r0
        L_0x0155:
            r15 = 13
            r13 = 0
            if (r18 == 0) goto L_0x0185
            long r0 = r2.A00
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x0185
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "FMessageImageCommon/buildE2eMessage/image media size not set, size="
            r12.append(r11)
            r12.append(r0)
            X.C18260x0.A1S(r12, r3, r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x01bf
            X.1VX r11 = r4.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01bf
            X.24A r0 = X.AnonymousClass24A.A00(r15)
            throw r0
        L_0x0185:
            long r0 = r2.A00
            X.1EE r12 = X.AnonymousClass0x7.A0V(r7)
            int r11 = r12.bitField0_
            r11 = r11 | 16
            r12.bitField0_ = r11
            r12.fileLength_ = r0
            if (r18 != 0) goto L_0x01bf
            long r0 = r2.A00
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x01bf
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "FMessageImageCommon/buildE2eMessage/sending image with media size not set, size="
            r12.append(r11)
            r12.append(r0)
            X.C18260x0.A1S(r12, r3, r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x01bf
            X.1VX r11 = r4.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r11.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01bf
            X.24A r0 = X.AnonymousClass24A.A00(r15)
            throw r0
        L_0x01bf:
            if (r10 != 0) goto L_0x0206
            if (r18 == 0) goto L_0x01c7
            byte[] r0 = r6.A0W
            if (r0 == 0) goto L_0x0206
        L_0x01c7:
            byte[] r0 = r6.A0W
            if (r0 == 0) goto L_0x01f4
            int r10 = r0.length
            r0 = 32
            if (r10 == r0) goto L_0x01f4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r10)
            X.C18260x0.A1S(r1, r3, r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x01f4
            X.1VX r3 = r4.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01f4
            X.24A r0 = X.AnonymousClass24A.A00(r16)
            throw r0
        L_0x01f4:
            byte[] r0 = r6.A0W
            X.8Lq r3 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1EE r1 = (X.AnonymousClass1EE) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.mediaKey_ = r3
        L_0x0206:
            long r0 = r6.A0B
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x021c
            long r0 = X.C18290x4.A0B(r0)
            X.1EE r10 = X.AnonymousClass0x7.A0V(r7)
            int r3 = r10.bitField0_
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r10.bitField0_ = r3
            r10.mediaKeyTimestamp_ = r0
        L_0x021c:
            int r3 = r6.A06
            if (r3 <= 0) goto L_0x023e
            int r0 = r6.A08
            if (r0 <= 0) goto L_0x023e
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.height_ = r3
            int r3 = r6.A08
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.width_ = r3
        L_0x023e:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0380
            java.lang.String r3 = r6.A0G
            X.1EE r1 = X.AnonymousClass0x7.A0V(r7)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r3
        L_0x0257:
            X.30d r14 = r2.A1v()
            if (r14 == 0) goto L_0x037d
            byte[] r3 = r14.A06()
            int[] r13 = r14.A07()
            if (r13 == 0) goto L_0x037d
            if (r3 == 0) goto L_0x037d
            int r12 = r13.length
            r0 = 2
            if (r12 < r0) goto L_0x037d
            int r1 = r3.length
            int r0 = r1 / 10
            if (r0 != r12) goto L_0x037d
            X.8Lq r10 = X.C18300x5.A0J(r7, r3, r1)
            X.6cX r3 = r7.A00
            X.1EE r3 = (X.AnonymousClass1EE) r3
            int r1 = r3.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.scansSidecar_ = r10
            r11 = 0
        L_0x0284:
            r10 = r13[r11]
            X.1EE r3 = X.AnonymousClass0x7.A0V(r7)
            X.4Fk r1 = r3.scanLengths_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0299
            X.4Fk r1 = X.C130786cX.A06(r1)
            r3.scanLengths_ = r1
        L_0x0299:
            r1.AwT(r10)
            int r11 = r11 + 1
            if (r11 < r12) goto L_0x0284
            boolean r0 = r14.A05
            r10 = r0 ^ 1
            java.lang.String r0 = r6.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02bf
            java.lang.String r0 = r6.A0L
            X.8Lq r11 = X.C18270x1.A08(r7, r0)
            X.6cX r3 = r7.A00
            X.1EE r3 = (X.AnonymousClass1EE) r3
            int r1 = r3.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.midQualityFileSha256_ = r11
        L_0x02bf:
            X.2qb r11 = r2.A0l
            if (r11 == 0) goto L_0x031b
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = r11.A08
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x031b
            byte[] r1 = r11.A0A
            byte[] r0 = r6.A0W
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x031b
            long r2 = r11.A02
            long r0 = r6.A0B
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x031b
            boolean r10 = r11.A0C
            java.lang.String r3 = r11.A04
            X.1EE r2 = X.AnonymousClass0x7.A0V(r7)
            r3.getClass()
            int r1 = r2.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailDirectPath_ = r3
            java.lang.String r0 = r11.A08
            X.8Lq r3 = X.C18270x1.A08(r7, r0)
            X.6cX r2 = r7.A00
            X.1EE r2 = (X.AnonymousClass1EE) r2
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
            java.lang.String r0 = r11.A05
            X.8Lq r3 = X.C18270x1.A08(r7, r0)
            X.6cX r2 = r7.A00
            X.1EE r2 = (X.AnonymousClass1EE) r2
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailEncSha256_ = r3
        L_0x031b:
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0373
            byte[] r0 = r17.A09()
            if (r0 == 0) goto L_0x0373
            if (r10 == 0) goto L_0x0373
            byte[] r0 = r17.A09()
            X.8Lq r2 = X.C18280x3.A0H(r7, r0)
            X.6cX r1 = r7.A00
            X.1EE r1 = (X.AnonymousClass1EE) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r2
        L_0x033b:
            X.1VX r4 = r4.A00
            r0 = 1
            java.util.List r3 = X.C626635z.A06(r6, r4, r0)
            X.1EE r2 = X.AnonymousClass0x7.A0V(r7)
            X.8ya r1 = r2.interactiveAnnotations_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0355
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.interactiveAnnotations_ = r1
        L_0x0355:
            X.C170208Ch.A05(r3, r1)
            java.util.List r3 = X.C626635z.A06(r6, r4, r9)
            X.1EE r2 = X.AnonymousClass0x7.A0V(r7)
            X.8ya r1 = r2.annotations_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x036f
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.annotations_ = r1
        L_0x036f:
            X.C170208Ch.A05(r3, r1)
            return r21
        L_0x0373:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/image thumbnail missing; message.key="
            X.C18260x0.A1S(r1, r0, r5)
            goto L_0x033b
        L_0x037d:
            r10 = 1
            goto L_0x02bf
        L_0x0380:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with directPath not set; message.key="
            X.C18260x0.A1S(r1, r0, r5)
            goto L_0x0257
        L_0x038b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/unable to send encrypted media message due to missing mediaKey; message.key="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; media_wa_type="
            X.C624134x.A0U(r2, r0, r1)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x03b1
            X.1VX r2 = r4.A00
            r1 = 4465(0x1171, float:6.257E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x03b1
            X.24A r0 = X.AnonymousClass24A.A00(r16)
            throw r0
        L_0x03b1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51992ki.A01(X.2pg, X.19b, X.1nA):X.19b");
    }

    public C51992ki(AnonymousClass1VX r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static void A00(C55962rC r6, AnonymousClass1EE r7, AnonymousClass1nA r8, C51992ki r9) {
        AnonymousClass1EE r1 = r7;
        AnonymousClass1nA r2 = r8;
        C51992ki r0 = r9;
        r0.A03(r1, r2, r6.A01, r6.A04(), r6.A0O);
    }

    public C207219b A02(C55032pg r5, C207219b r6, AnonymousClass1nA r7) {
        C207219b A012 = A01(r5, r6, r7);
        if (A012 != null) {
            AnonymousClass3Z2 r2 = r5.A01;
            byte[] bArr = r5.A09;
            if (C59542x5.A01(r2, r7, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A01, r5, r2, r7, bArr);
                AnonymousClass1EE A0V = AnonymousClass0x7.A0V(A012);
                A002.getClass();
                A0V.contextInfo_ = A002;
                A0V.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            }
        }
        return A012;
    }
}
