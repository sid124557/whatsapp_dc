package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2wj  reason: invalid class name and case insensitive filesystem */
public class C59322wj {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;

    public static void A00(C130546c9 r4, C55032pg r5, C624134x r6, C59322wj r7) {
        AnonymousClass3Z2 r3 = r5.A01;
        byte[] bArr = r5.A09;
        if (C59542x5.A01(r3, r6, bArr)) {
            AnonymousClass1EF A02 = r7.A01.A02(r3, r6, bArr, r5.A03);
            r4.A07();
            AnonymousClass1E5 r1 = (AnonymousClass1E5) r4.A00;
            A02.getClass();
            r1.contextInfo_ = A02;
            r1.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r3 = r9.waveform_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (r12 != false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1E5 r9, X.AnonymousClass2z0 r10, X.C30811nC r11, boolean r12) {
        /*
            boolean r0 = r9.ptt_
            r11.A09 = r0
            X.33C r2 = new X.33C
            r2.<init>()
            r11.A01 = r2
            int r0 = r9.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00d2
            X.8Lq r3 = r9.waveform_
            int r1 = r3.A03()
            if (r1 <= 0) goto L_0x00d2
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x00d2
            byte[] r3 = r3.A07()
        L_0x0021:
            int r0 = r9.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00cf
            int r1 = r9.backgroundArgb_
        L_0x0029:
            if (r3 != 0) goto L_0x002d
            if (r1 == 0) goto L_0x0035
        L_0x002d:
            X.2xx r0 = new X.2xx
            r0.<init>(r3, r1)
            r11.A23(r0)
        L_0x0035:
            int r0 = r9.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00b7
            X.8Lq r0 = r9.mediaKey_
            byte[] r0 = r0.A07()
            X.AnonymousClass31H.A00(r2, r11, r0)
        L_0x0044:
            int r8 = r9.bitField0_
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0051
            long r0 = r9.mediaKeyTimestamp_
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r2.A0B = r0
        L_0x0051:
            java.lang.String r4 = "; message.key="
            if (r12 == 0) goto L_0x0059
            r0 = r8 & 8
            if (r0 == 0) goto L_0x0063
        L_0x0059:
            long r0 = r9.fileLength_
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0128
            r11.A00 = r0
        L_0x0063:
            r7 = 14
            java.lang.String r6 = "FMessageAudio/bogus sha-256 hash received; length="
            r5 = 2
            r3 = 32
            if (r12 == 0) goto L_0x0070
            r0 = r8 & 4
            if (r0 == 0) goto L_0x007f
        L_0x0070:
            X.8Lq r0 = r9.fileSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r3) goto L_0x011c
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r11.A04 = r0
        L_0x007f:
            int r0 = r9.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0094
            X.8Lq r0 = r9.fileEncSha256_
            byte[] r1 = r0.A07()
            int r0 = r1.length
            if (r0 != r3) goto L_0x0110
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r11.A03 = r0
        L_0x0094:
            if (r12 != 0) goto L_0x00d5
            java.lang.String r1 = r9.mimetype_
            r0 = 1
            java.lang.String r0 = X.C162397rz.A0A(r1, r0)
            if (r0 != 0) goto L_0x00d5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r9.mimetype_
            r1.append(r0)
            X.C18260x0.A1S(r1, r4, r10)
            r0 = 17
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x00b7:
            if (r12 != 0) goto L_0x0044
            boolean r0 = X.AnonymousClass2z0.A0C(r11)
            if (r0 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/missing media key; message.key="
            X.C18260x0.A1S(r1, r0, r10)
            r0 = 16
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x00cf:
            r1 = 0
            goto L_0x0029
        L_0x00d2:
            r3 = 0
            goto L_0x0021
        L_0x00d5:
            java.lang.String r0 = r9.mimetype_
            r11.A05 = r0
            if (r12 == 0) goto L_0x00e1
            int r0 = r9.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00e8
        L_0x00e1:
            java.lang.String r0 = r9.url_
            r11.A20(r0)
            if (r12 == 0) goto L_0x010b
        L_0x00e8:
            int r0 = r9.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; message.senderJid="
            r1.append(r0)
            X.4uZ r0 = r11.A0n()
            X.C18270x1.A17(r0, r1)
        L_0x0106:
            int r0 = r9.seconds_
            r11.A0B = r0
            return
        L_0x010b:
            java.lang.String r0 = r9.directPath_
            r2.A0G = r0
            goto L_0x0106
        L_0x0110:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r6)
            X.C18260x0.A1S(r0, r4, r10)
            X.24W r0 = X.AnonymousClass24W.A00(r7)
            throw r0
        L_0x011c:
            java.lang.StringBuilder r0 = X.C18270x1.A0W(r0, r6)
            X.C18260x0.A1S(r0, r4, r10)
            X.24W r0 = X.AnonymousClass24W.A00(r7)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "FMessageAudio/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C18260x0.A1S(r3, r4, r10)
            r0 = 13
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59322wj.A01(X.1E5, X.2z0, X.1nC, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0203, code lost:
        if (X.C56952sp.A0E(r12.A00) == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        throw X.AnonymousClass24A.A00(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024b, code lost:
        r2 = X.C18270x1.A09(r3, r5.A0W);
        r1 = (X.AnonymousClass1E5) r3.A00;
        r1.bitField0_ |= 64;
        r1.mediaKey_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025d, code lost:
        r4 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025f, code lost:
        if (r4 == null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0261, code lost:
        r2 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0263, code lost:
        if (r2 == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0265, code lost:
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0266, code lost:
        if (r1 <= 0) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026a, code lost:
        if (r1 > 192) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026c, code lost:
        r2 = X.C18300x5.A0J(r3, r2, r1);
        r1 = (X.AnonymousClass1E5) r3.A00;
        r1.bitField0_ |= com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.waveform_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027c, code lost:
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027e, code lost:
        if (r2 == 0) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0280, code lost:
        r1 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r1.bitField0_ |= com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
        r1.backgroundArgb_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028e, code lost:
        r0 = r5.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0292, code lost:
        if (r0 <= 0) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0294, code lost:
        r0 = X.C18290x4.A0B(r0);
        r4 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r4.bitField0_ |= 512;
        r4.mediaKeyTimestamp_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a6, code lost:
        A00(r3, r13, r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02af, code lost:
        if (android.text.TextUtils.isEmpty(r5.A0G) != false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b1, code lost:
        r2 = r5.A0G;
        r1 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r2.getClass();
        r1.bitField0_ |= 256;
        r1.directPath_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c5, code lost:
        X.C624134x.A0Q(r14, "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key=", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ce, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r11 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (android.text.TextUtils.isEmpty(r14.A04) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r7 = android.util.Base64.decode(r14.A04, 0);
        r6 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (r6 == 32) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageAudio/bogus sha-256 hash; length=");
        r1.append(r6);
        X.C624134x.A0Q(r14, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.AnonymousClass2z0.A0C(r14) != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r13.A02 == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        if (X.C56952sp.A0E(r12.A00) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0119, code lost:
        r6 = X.C18300x5.A0J(r3, r7, r6);
        r1 = (X.AnonymousClass1E5) r3.A00;
        r1.bitField0_ |= 4;
        r1.fileSha256_ = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012f, code lost:
        if (android.text.TextUtils.isEmpty(r14.A03) != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0131, code lost:
        r7 = android.util.Base64.decode(r14.A03, 0);
        r6 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013a, code lost:
        if (r6 == 32) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageAudio/bogus sha-256 enc hash; length=");
        r1.append(r6);
        X.C624134x.A0Q(r14, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r13.A02 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0157, code lost:
        if (X.C56952sp.A0E(r12.A00) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015f, code lost:
        throw X.AnonymousClass24A.A00(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0160, code lost:
        r6 = X.C18300x5.A0J(r3, r7, r6);
        r1 = (X.AnonymousClass1E5) r3.A00;
        r1.bitField0_ |= 128;
        r1.fileEncSha256_ = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        r0 = r14.A00;
        r6 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        if (r11 == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r6 <= 0) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
        r0 = r14.A00;
        r7 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r7.bitField0_ |= 8;
        r7.fileLength_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        if (r11 == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        if (r14.A0B <= 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0190, code lost:
        r6 = r14.A0B;
        r1 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r1.bitField0_ |= 16;
        r1.seconds_ = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a2, code lost:
        if (r14.A09 != 1) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a4, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a5, code lost:
        r1 = (X.AnonymousClass1E5) X.C18320x8.A0C(r3);
        r1.bitField0_ |= 32;
        r1.ptt_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        if (r10 == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b7, code lost:
        if (r5.A0W == null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b9, code lost:
        r0 = r5.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bb, code lost:
        if (r11 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bd, code lost:
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c0, code lost:
        if (r2 == 32) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c2, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("FMessageAudio/buildE2eMessage/media key incorrect length; length=");
        r1.append(r2);
        X.C624134x.A0Q(r14, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d5, code lost:
        if (r13.A02 == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dd, code lost:
        if (X.C56952sp.A0E(r12.A00) == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e5, code lost:
        throw X.AnonymousClass24A.A00(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e6, code lost:
        if (r6 > 0) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r7 = X.AnonymousClass001.A0o();
        r7.append("FMessageAudio/buildE2eMessage/sending audio with media size not set, size=");
        r7.append(r0);
        X.C624134x.A0Q(r14, "; message.key=", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fb, code lost:
        if (r13.A02 == false) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass16H A02(X.C55032pg r13, X.C30811nC r14) {
        /*
            r12 = this;
            X.33C r5 = r14.A01
            boolean r11 = r13.A02()
            r2 = 0
            r4 = 1
            if (r11 != 0) goto L_0x0011
            boolean r0 = X.AnonymousClass2z0.A0C(r14)
            r10 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r10 = 1
        L_0x0012:
            if (r5 == 0) goto L_0x020c
            if (r10 != 0) goto L_0x001a
            byte[] r0 = r5.A0W
            if (r0 == 0) goto L_0x020c
        L_0x001a:
            X.1A4 r0 = r13.A00
            X.6cX r0 = r0.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1E5 r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x0026
            X.1E5 r0 = X.AnonymousClass1E5.DEFAULT_INSTANCE
        L_0x0026:
            X.6c9 r3 = r0.A0H()
            X.16H r3 = (X.AnonymousClass16H) r3
            java.lang.String r7 = r14.A07
            if (r11 == 0) goto L_0x00ed
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0047
        L_0x0036:
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            r7.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r7
        L_0x0047:
            java.lang.String r1 = r14.A05
            if (r11 == 0) goto L_0x0051
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0092
        L_0x0051:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "audio/aac"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "audio/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "audio/amr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "audio/ogg; codecs=opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
        L_0x007f:
            X.6cX r6 = X.C18320x8.A0C(r3)
            X.1E5 r6 = (X.AnonymousClass1E5) r6
            r1.getClass()
            int r0 = r6.bitField0_
            r0 = r0 | 2
            r6.bitField0_ = r0
            r6.mimetype_ = r1
            if (r11 == 0) goto L_0x009a
        L_0x0092:
            java.lang.String r0 = r14.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0129
        L_0x009a:
            java.lang.String r0 = r14.A04
            byte[] r7 = android.util.Base64.decode(r0, r2)
            int r6 = r7.length
            r0 = 32
            if (r6 == r0) goto L_0x0119
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r14, r0, r1)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0119
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0119
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00c9:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/invalid mime type; mimetype="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r14, r0, r6)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x007f
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x007f
            r0 = 17
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x00ed:
            X.2z0 r6 = r14.A1J
            boolean r0 = X.C626635z.A0A(r6, r7)
            if (r0 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending message with invalid url"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.C18260x0.A1S(r1, r0, r6)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0036
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 15
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0119:
            X.8Lq r6 = X.C18300x5.A0J(r3, r7, r6)
            X.6cX r1 = r3.A00
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r6
        L_0x0129:
            java.lang.String r0 = r14.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = r14.A03
            byte[] r7 = android.util.Base64.decode(r0, r2)
            int r6 = r7.length
            r0 = 32
            if (r6 == r0) goto L_0x0160
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r14, r0, r1)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0160
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x0160
            r0 = 14
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0160:
            X.8Lq r6 = X.C18300x5.A0J(r3, r7, r6)
            X.6cX r1 = r3.A00
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r6
        L_0x0170:
            r8 = 0
            long r0 = r14.A00
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x01e6
            if (r6 <= 0) goto L_0x018c
        L_0x017a:
            long r0 = r14.A00
            X.6cX r7 = X.C18320x8.A0C(r3)
            X.1E5 r7 = (X.AnonymousClass1E5) r7
            int r6 = r7.bitField0_
            r6 = r6 | 8
            r7.bitField0_ = r6
            r7.fileLength_ = r0
            if (r11 == 0) goto L_0x0190
        L_0x018c:
            int r0 = r14.A0B
            if (r0 <= 0) goto L_0x01a0
        L_0x0190:
            int r6 = r14.A0B
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r6
        L_0x01a0:
            int r0 = r14.A09
            if (r0 != r4) goto L_0x01a5
            r2 = 1
        L_0x01a5:
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r2
            if (r10 == 0) goto L_0x01b9
            byte[] r0 = r5.A0W
            if (r0 == 0) goto L_0x025d
        L_0x01b9:
            byte[] r0 = r5.A0W
            if (r11 != 0) goto L_0x024b
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L_0x024b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r14, r0, r1)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x024b
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x01e6:
            if (r6 > 0) goto L_0x017a
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = "; message.key="
            X.C624134x.A0Q(r14, r0, r7)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x017a
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x017a
            r0 = 13
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x020c:
            if (r11 == 0) goto L_0x02cf
            X.1A4 r0 = r13.A00
            X.6cX r0 = r0.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1E5 r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x021a
            X.1E5 r0 = X.AnonymousClass1E5.DEFAULT_INSTANCE
        L_0x021a:
            X.6c9 r3 = r0.A0H()
            X.16H r3 = (X.AnonymousClass16H) r3
            int r0 = r14.A09
            if (r0 != r4) goto L_0x0225
            r2 = 1
        L_0x0225:
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r2
            A00(r3, r13, r14, r12)
            int r0 = r14.A0B
            if (r0 <= 0) goto L_0x02c4
            int r2 = r14.A0B
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r2
            return r3
        L_0x024b:
            byte[] r0 = r5.A0W
            X.8Lq r2 = X.C18270x1.A09(r3, r0)
            X.6cX r1 = r3.A00
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x025d:
            X.2xx r4 = r14.A00
            if (r4 == 0) goto L_0x028e
            byte[] r2 = r4.A02
            if (r2 == 0) goto L_0x027c
            int r1 = r2.length
            if (r1 <= 0) goto L_0x027c
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x027c
            X.8Lq r2 = X.C18300x5.A0J(r3, r2, r1)
            X.6cX r1 = r3.A00
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.waveform_ = r2
        L_0x027c:
            int r2 = r4.A01
            if (r2 == 0) goto L_0x028e
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.backgroundArgb_ = r2
        L_0x028e:
            long r0 = r5.A0B
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x02a6
            long r0 = X.C18290x4.A0B(r0)
            X.6cX r4 = X.C18320x8.A0C(r3)
            X.1E5 r4 = (X.AnonymousClass1E5) r4
            int r2 = r4.bitField0_
            r2 = r2 | 512(0x200, float:7.175E-43)
            r4.bitField0_ = r2
            r4.mediaKeyTimestamp_ = r0
        L_0x02a6:
            A00(r3, r13, r14, r12)
            java.lang.String r0 = r5.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02c5
            java.lang.String r2 = r5.A0G
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E5 r1 = (X.AnonymousClass1E5) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x02c4:
            return r3
        L_0x02c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            X.C624134x.A0Q(r14, r0, r1)
            return r3
        L_0x02cf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/unable to send audio message due to missing mediaKey; message.key="
            X.C624134x.A0S(r14, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.C624134x.A0U(r14, r0, r1)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x02f0
            X.1VX r0 = r12.A00
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x02f0
            r0 = 16
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x02f0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59322wj.A02(X.2pg, X.1nC):X.16H");
    }

    public C59322wj(AnonymousClass1VX r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
