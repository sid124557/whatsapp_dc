package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7nt  reason: invalid class name and case insensitive filesystem */
public final class C160577nt {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r9) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r2.isFeatureSupported("tunneled-playback") == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return new X.C160577nt(r2, r3, r10, false, r11, r12, r8, r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160577nt A00(android.media.MediaCodecInfo.CodecCapabilities r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13) {
        /*
            r5 = 0
            r2 = r8
            r3 = r9
            if (r8 == 0) goto L_0x0035
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r8.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0035
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r1 > r0) goto L_0x004c
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "ODROID-XU3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "Nexus 10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
        L_0x0025:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004c
        L_0x0035:
            r8 = 0
            if (r2 == 0) goto L_0x0041
        L_0x0038:
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r2.isFeatureSupported(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            X.7nt r1 = new X.7nt
            r4 = r10
            r6 = r11
            r7 = r12
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x004c:
            r8 = 1
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160577nt.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, boolean, boolean, boolean):X.7nt");
    }

    public boolean A03(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else {
                if (Util.A00 >= 29) {
                    int A002 = AnonymousClass711.A00(videoCapabilities, d, i, i2);
                    if (A002 != 2) {
                        if (A002 == 1) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            AnonymousClass6C7.A1J("sizeAndRate.cover, ", "x", A0o, i, i2);
                            A0o.append("@");
                            A0o.append(d);
                            obj = A0o.toString();
                        }
                    }
                    return true;
                }
                if (!A01(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str = this.A02;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.A01)) && A01(videoCapabilities, d, i2, i)) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            AnonymousClass6C7.A1J("sizeAndRate.rotated, ", "x", A0o2, i, i2);
                            A0o2.append("@");
                            A0o2.append(d);
                            String obj2 = A0o2.toString();
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("AssumedSupport [");
                            A0o3.append(obj2);
                            A0o3.append("] [");
                            A0o3.append(str);
                            AnonymousClass001.A1M(A0o3);
                            A0o3.append(this.A01);
                            A0o3.append("] [");
                            Log.d("MediaCodecInfo", AnonymousClass000.A0W(Util.A02, A0o3));
                        }
                    }
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    AnonymousClass6C7.A1J("sizeAndRate.support, ", "x", A0o4, i, i2);
                    A0o4.append("@");
                    A0o4.append(d);
                    obj = A0o4.toString();
                }
                return true;
            }
        }
        A02(obj);
        return false;
    }

    public String toString() {
        return this.A02;
    }

    public C160577nt(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.A02 = str;
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A06 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A03 = z4;
        this.A09 = z5;
        this.A07 = z6;
        this.A05 = C162097rD.A07(str2, "video");
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

    public final void A02(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NoSupport [");
        A0o.append(str);
        A0o.append("] [");
        A0o.append(this.A02);
        AnonymousClass001.A1M(A0o);
        A0o.append(this.A01);
        A0o.append("] [");
        Log.d("MediaCodecInfo", AnonymousClass000.A0W(Util.A02, A0o));
    }
}
