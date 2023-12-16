package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: X.7o8  reason: invalid class name and case insensitive filesystem */
public final class C160687o8 {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r7) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160687o8 A00(android.media.MediaCodecInfo.CodecCapabilities r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r2 = r6
            r3 = r7
            if (r6 == 0) goto L_0x0034
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r6.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0034
            int r1 = X.C162387ry.A01
            r0 = 22
            if (r1 > r0) goto L_0x0053
            java.lang.String r1 = X.C162387ry.A05
            java.lang.String r0 = "ODROID-XU3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "Nexus 10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
        L_0x0024:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0053
        L_0x0034:
            r6 = 0
            if (r2 == 0) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "tunneled-playback"
            r2.isFeatureSupported(r0)
        L_0x003c:
            if (r10 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0051
            java.lang.String r0 = "secure-playback"
            boolean r0 = r2.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0051
        L_0x0048:
            r7 = 1
        L_0x0049:
            X.7o8 r1 = new X.7o8
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0051:
            r7 = 0
            goto L_0x0049
        L_0x0053:
            r6 = 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160687o8.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, java.lang.String, boolean):X.7o8");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r9.A02(r10) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C151887Wr A02(X.C166527yp r9, X.C166527yp r10) {
        /*
            r8 = this;
            r3 = r9
            java.lang.String r1 = r9.A0T
            r4 = r10
            java.lang.String r0 = r10.A0T
            boolean r0 = X.C162387ry.A0D(r1, r0)
            r7 = 0
            if (r0 != 0) goto L_0x000f
            r7 = 8
        L_0x000f:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0066
            int r1 = r9.A0E
            int r0 = r10.A0E
            if (r1 == r0) goto L_0x001b
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L_0x001b:
            boolean r0 = r8.A04
            if (r0 != 0) goto L_0x002d
            int r1 = r9.A0I
            int r0 = r10.A0I
            if (r1 != r0) goto L_0x002b
            int r1 = r9.A09
            int r0 = r10.A09
            if (r1 == r0) goto L_0x002d
        L_0x002b:
            r7 = r7 | 512(0x200, float:7.175E-43)
        L_0x002d:
            X.7ym r1 = r9.A0M
            X.7ym r0 = r10.A0M
            boolean r0 = X.C162387ry.A0D(r1, r0)
            if (r0 != 0) goto L_0x0039
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L_0x0039:
            java.lang.String r5 = r8.A03
            java.lang.String r1 = X.C162387ry.A05
            java.lang.String r0 = "SM-T230"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0055
            boolean r0 = r9.A02(r10)
            if (r0 != 0) goto L_0x0055
            r7 = r7 | 2
        L_0x0055:
            if (r7 != 0) goto L_0x00c1
            boolean r0 = r9.A02(r10)
            r6 = 2
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            r6 = 3
        L_0x005f:
            r7 = 0
        L_0x0060:
            X.7Wr r2 = new X.7Wr
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x0066:
            int r1 = r9.A06
            int r0 = r10.A06
            if (r1 == r0) goto L_0x006e
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x006e:
            int r1 = r9.A0F
            int r0 = r10.A0F
            if (r1 == r0) goto L_0x0076
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
        L_0x0076:
            int r1 = r9.A0B
            int r0 = r10.A0B
            if (r1 == r0) goto L_0x007e
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x007e:
            if (r7 != 0) goto L_0x00a7
            java.lang.String r1 = "audio/mp4a-latm"
            java.lang.String r0 = r8.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a7
            android.util.Pair r1 = X.C162267rY.A00(r9)
            android.util.Pair r0 = X.C162267rY.A00(r10)
            if (r1 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a7
            int r2 = X.C18280x3.A03(r1)
            int r1 = X.C18280x3.A03(r0)
            r0 = 42
            if (r2 != r0) goto L_0x00a7
            if (r1 != r0) goto L_0x00a7
            java.lang.String r5 = r8.A03
            goto L_0x005e
        L_0x00a7:
            boolean r0 = r9.A02(r10)
            if (r0 != 0) goto L_0x00af
            r7 = r7 | 32
        L_0x00af:
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bb
            r7 = r7 | 2
        L_0x00bb:
            if (r7 != 0) goto L_0x00c1
            java.lang.String r5 = r8.A03
            r6 = 1
            goto L_0x005f
        L_0x00c1:
            java.lang.String r5 = r8.A03
            r6 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160687o8.A02(X.7yp, X.7yp):X.7Wr");
    }

    public boolean A04(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else if (A01(videoCapabilities, d, i, i2)) {
                return true;
            } else {
                if (i < i2) {
                    String str = this.A03;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(C162387ry.A02)) && A01(videoCapabilities, d, i2, i)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass6C7.A1J("sizeAndRate.rotated, ", "x", A0o, i, i2);
                        A0o.append("x");
                        A0o.append(d);
                        String obj2 = A0o.toString();
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("AssumedSupport [");
                        A0o2.append(obj2);
                        A0o2.append("] [");
                        A0o2.append(str);
                        AnonymousClass001.A1M(A0o2);
                        A0o2.append(this.A02);
                        A0o2.append("] [");
                        Log.d("MediaCodecInfo", AnonymousClass000.A0W(C162387ry.A03, A0o2));
                        return true;
                    }
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass6C7.A1J("sizeAndRate.support, ", "x", A0o3, i, i2);
                A0o3.append("x");
                A0o3.append(d);
                obj = A0o3.toString();
            }
        }
        A03(obj);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x026f, code lost:
        if (r1 < 800000) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C166527yp r13) {
        /*
            r12 = this;
            java.lang.String r3 = r13.A0O
            r2 = 1
            if (r3 == 0) goto L_0x01d9
            java.lang.String r1 = r12.A02
            if (r1 == 0) goto L_0x01d9
            java.lang.String r4 = r3.trim()
            if (r4 == 0) goto L_0x0013
            java.lang.String r4 = X.AnonymousClass0x9.A0z(r4)
        L_0x0013:
            java.lang.String r0 = "avc1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "avc3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "hev1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "hvc1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "dvav"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "dva1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "dvhe"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "dvh1"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "av01"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r8 = "video/av01"
        L_0x005d:
            boolean r0 = r1.equals(r8)
            java.lang.String r7 = ", "
            r6 = 0
            if (r0 != 0) goto L_0x01c3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "codec.mime "
        L_0x006c:
            X.C18260x0.A0p(r0, r3, r7, r8, r1)
            java.lang.String r0 = r1.toString()
            r12.A03(r0)
            r0 = 0
        L_0x0077:
            r6 = 0
            if (r0 == 0) goto L_0x036f
            boolean r1 = r12.A05
            r0 = 1
            if (r1 == 0) goto L_0x027b
            int r3 = r13.A0I
            if (r3 <= 0) goto L_0x008e
            int r2 = r13.A09
            if (r2 <= 0) goto L_0x008e
            float r0 = r13.A01
            double r0 = (double) r0
            boolean r0 = r12.A04(r3, r2, r0)
        L_0x008e:
            return r0
        L_0x008f:
            java.lang.String r0 = "vp9"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "vp09"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "vp8"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "vp08"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "mp4a"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "mp4a."
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00cd
            X.7GG r0 = X.C162107rG.A01(r4)
            if (r0 == 0) goto L_0x00cd
            int r0 = r0.A01
            java.lang.String r8 = X.C162107rG.A02(r0)
            if (r8 != 0) goto L_0x005d
        L_0x00cd:
            java.lang.String r8 = "audio/mp4a-latm"
            goto L_0x005d
        L_0x00d0:
            java.lang.String r0 = "ac-3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = "dac3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = "ec-3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "dec3"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "ec+3"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r8 = "audio/eac3-joc"
            goto L_0x005d
        L_0x00fc:
            java.lang.String r0 = "ac-4"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "dac4"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "dtsc"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = "dtse"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = "dtsh"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "dtsl"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "opus"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0138
            java.lang.String r8 = "audio/opus"
            goto L_0x005d
        L_0x0138:
            java.lang.String r0 = "vorbis"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0144
            java.lang.String r8 = "audio/vorbis"
            goto L_0x005d
        L_0x0144:
            java.lang.String r0 = "flac"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0150
            java.lang.String r8 = "audio/flac"
            goto L_0x005d
        L_0x0150:
            java.lang.String r0 = "stpp"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x015c
            java.lang.String r8 = "application/ttml+xml"
            goto L_0x005d
        L_0x015c:
            java.lang.String r0 = "wvtt"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0168
            java.lang.String r8 = "text/vtt"
            goto L_0x005d
        L_0x0168:
            java.lang.String r0 = "cea708"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0174
            java.lang.String r8 = "application/cea-708"
            goto L_0x005d
        L_0x0174:
            java.lang.String r0 = "eia608"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0197
            java.lang.String r0 = "cea608"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0197
            java.util.ArrayList r2 = X.C162107rG.A00
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x01d9
            r2.get(r0)
            java.lang.String r0 = "codecPrefix"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0197:
            java.lang.String r8 = "application/cea-608"
            goto L_0x005d
        L_0x019b:
            java.lang.String r8 = "audio/vnd.dts.hd"
            goto L_0x005d
        L_0x019f:
            java.lang.String r8 = "audio/vnd.dts"
            goto L_0x005d
        L_0x01a3:
            java.lang.String r8 = "audio/ac4"
            goto L_0x005d
        L_0x01a7:
            java.lang.String r8 = "audio/eac3"
            goto L_0x005d
        L_0x01ab:
            java.lang.String r8 = "audio/ac3"
            goto L_0x005d
        L_0x01af:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            goto L_0x005d
        L_0x01b3:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            goto L_0x005d
        L_0x01b7:
            java.lang.String r8 = "video/dolby-vision"
            goto L_0x005d
        L_0x01bb:
            java.lang.String r8 = "video/hevc"
            goto L_0x005d
        L_0x01bf:
            java.lang.String r8 = "video/avc"
            goto L_0x005d
        L_0x01c3:
            android.util.Pair r0 = X.C162267rY.A00(r13)
            if (r0 == 0) goto L_0x01d9
            int r5 = X.C18280x3.A03(r0)
            int r4 = X.C18290x4.A03(r0)
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x01dc
            r0 = 42
            if (r5 == r0) goto L_0x01dc
        L_0x01d9:
            r0 = 1
            goto L_0x0077
        L_0x01dc:
            android.media.MediaCodecInfo$CodecCapabilities r10 = r12.A00
            if (r10 == 0) goto L_0x01e4
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = r10.profileLevels
            if (r9 != 0) goto L_0x01e6
        L_0x01e4:
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x01e6:
            int r11 = X.C162387ry.A01
            r0 = 23
            if (r11 > r0) goto L_0x021b
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x021b
            int r0 = r9.length
            if (r0 != 0) goto L_0x021b
            if (r10 == 0) goto L_0x0271
            android.media.MediaCodecInfo$VideoCapabilities r0 = r10.getVideoCapabilities()
            if (r0 == 0) goto L_0x0271
            android.util.Range r0 = r0.getBitrateRange()
            int r1 = X.AnonymousClass6C7.A05(r0)
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r1 < r0) goto L_0x022c
            r9 = 1024(0x400, float:1.435E-42)
        L_0x020e:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r2
            r0.level = r9
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r9[r6] = r0
        L_0x021b:
            int r2 = r9.length
        L_0x021c:
            if (r6 >= r2) goto L_0x0273
            r1 = r9[r6]
            int r0 = r1.profile
            if (r0 != r5) goto L_0x0229
            int r0 = r1.level
            if (r0 < r4) goto L_0x0229
            goto L_0x01d9
        L_0x0229:
            int r6 = r6 + 1
            goto L_0x021c
        L_0x022c:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r1 < r0) goto L_0x0234
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x020e
        L_0x0234:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r1 < r0) goto L_0x023c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x020e
        L_0x023c:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r1 < r0) goto L_0x0244
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x020e
        L_0x0244:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r1 < r0) goto L_0x024c
            r9 = 64
            goto L_0x020e
        L_0x024c:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x0254
            r9 = 32
            goto L_0x020e
        L_0x0254:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r1 < r0) goto L_0x025c
            r9 = 16
            goto L_0x020e
        L_0x025c:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r1 < r0) goto L_0x0264
            r9 = 8
            goto L_0x020e
        L_0x0264:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 < r0) goto L_0x026b
            r9 = 4
            goto L_0x020e
        L_0x026b:
            r0 = 800000(0xc3500, float:1.121039E-39)
            r9 = 2
            if (r1 >= r0) goto L_0x020e
        L_0x0271:
            r9 = 1
            goto L_0x020e
        L_0x0273:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "codec.profileLevel, "
            goto L_0x006c
        L_0x027b:
            int r2 = r13.A0F
            r1 = -1
            if (r2 == r1) goto L_0x02a4
            android.media.MediaCodecInfo$CodecCapabilities r0 = r12.A00
            if (r0 != 0) goto L_0x028a
            java.lang.String r0 = "sampleRate.caps"
        L_0x0286:
            r12.A03(r0)
            return r6
        L_0x028a:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x0293
            java.lang.String r0 = "sampleRate.aCaps"
            goto L_0x0286
        L_0x0293:
            boolean r0 = r0.isSampleRateSupported(r2)
            if (r0 != 0) goto L_0x02a4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sampleRate.support, "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            goto L_0x0286
        L_0x02a4:
            int r3 = r13.A06
            if (r3 == r1) goto L_0x036e
            android.media.MediaCodecInfo$CodecCapabilities r0 = r12.A00
            if (r0 != 0) goto L_0x02af
            java.lang.String r0 = "channelCount.caps"
            goto L_0x0286
        L_0x02af:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "channelCount.aCaps"
            goto L_0x0286
        L_0x02b8:
            java.lang.String r5 = r12.A03
            java.lang.String r1 = r12.A02
            int r4 = r0.getMaxInputChannelCount()
            r0 = 1
            if (r4 > r0) goto L_0x02cb
            int r2 = X.C162387ry.A01
            r0 = 26
            if (r2 < r0) goto L_0x02d8
            if (r4 <= 0) goto L_0x02d8
        L_0x02cb:
            if (r4 >= r3) goto L_0x036e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "channelCount.support, "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            goto L_0x0286
        L_0x02d8:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0361
            r2 = 6
        L_0x0339:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", ["
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.AnonymousClass000.A0f(r1)
            java.lang.String r0 = "MediaCodecInfo"
            android.util.Log.w(r0, r1)
            r4 = r2
            goto L_0x02cb
        L_0x0361:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r1)
            r2 = 30
            if (r0 == 0) goto L_0x0339
            r2 = 16
            goto L_0x0339
        L_0x036e:
            r6 = 1
        L_0x036f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160687o8.A05(X.7yp):boolean");
    }

    public boolean A06(C166527yp r4) {
        if (this.A05) {
            return this.A04;
        }
        Pair A002 = C162267rY.A00(r4);
        if (A002 == null || C18280x3.A03(A002) != 42) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A03;
    }

    public C160687o8(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A04 = z;
        this.A06 = z2;
        this.A05 = C162107rG.A05(str2);
    }

    public static boolean A01(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        Point A0P = AnonymousClass6C7.A0P(videoCapabilities, i, i2);
        int i3 = A0P.x;
        int i4 = A0P.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final void A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NoSupport [");
        A0o.append(str);
        A0o.append("] [");
        A0o.append(this.A03);
        AnonymousClass001.A1M(A0o);
        A0o.append(this.A02);
        A0o.append("] [");
        Log.d("MediaCodecInfo", AnonymousClass000.A0W(C162387ry.A03, A0o));
    }
}
