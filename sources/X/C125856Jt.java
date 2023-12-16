package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.android.exoplayer2.util.Util;
import java.util.List;

/* renamed from: X.6Jt  reason: invalid class name and case insensitive filesystem */
public class C125856Jt extends AnonymousClass6JQ {
    public static boolean A0n;
    public static boolean A0o;
    public static final int[] A0p = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public MediaFormat A0P;
    public Surface A0Q;
    public Surface A0R;
    public C148597Iz A0S;
    public AnonymousClass7R5 A0T;
    public C146607Ax A0U;
    public Object A0V;
    public boolean A0W = true;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a = true;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final int A0f;
    public final long A0g;
    public final Context A0h;
    public final C157727im A0i;
    public final AnonymousClass7FE A0j;
    public final boolean A0k;
    public final long[] A0l;
    public final long[] A0m;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        return (r5 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(java.lang.String r4, int r5, int r6) {
        /*
            r3 = -1
            if (r5 == r3) goto L_0x000d
            if (r6 == r3) goto L_0x000d
            int r0 = r4.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L_0x0045;
                case -1662541442: goto L_0x003b;
                case 1187890754: goto L_0x0038;
                case 1331836730: goto L_0x0014;
                case 1599127256: goto L_0x0011;
                case 1599127257: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x003d
        L_0x0011:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0047
        L_0x0014:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = "BRAVIA 4K 2015"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x000d
            r2 = 16
            int r0 = r5 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r6 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r5 = r0 * 16
            goto L_0x004e
        L_0x0038:
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x0047
        L_0x003b:
            java.lang.String r0 = "video/hevc"
        L_0x003d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
            goto L_0x004f
        L_0x0045:
            java.lang.String r0 = "video/3gpp"
        L_0x0047:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x004e:
            r2 = 2
        L_0x004f:
            int r1 = r5 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.A03(java.lang.String, int, int):int");
    }

    public void A0B() {
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0O = -9223372036854775807L;
        this.A0L = -9223372036854775807L;
        this.A0A = 0;
        this.A0E = -1;
        this.A0C = -1;
        this.A02 = -1.0f;
        this.A0D = -1;
        A0O();
        C157727im r2 = this.A0i;
        if (r2.A09 != null) {
            C162857ss r1 = r2.A0A;
            if (r1 != null) {
                r1.A00.unregisterDisplayListener(r1);
            }
            r2.A0B.A02.sendEmptyMessage(2);
        }
        this.A0T = null;
        this.A0d = false;
        this.A08 = 0;
        this.A09 = 0;
        try {
            super.A0B();
            synchronized (this.A0B) {
            }
            AnonymousClass7FE r3 = this.A0j;
            C150237Pv r22 = this.A0B;
            synchronized (r22) {
            }
            Handler handler = r3.A00;
            if (handler != null) {
                AnonymousClass8MF.A00(handler, r3, r22, 10);
            }
        } catch (Throwable th) {
            synchronized (this.A0B) {
                AnonymousClass7FE r32 = this.A0j;
                C150237Pv r23 = this.A0B;
                synchronized (r23) {
                    Handler handler2 = r32.A00;
                    if (handler2 != null) {
                        AnonymousClass8MF.A00(handler2, r32, r23, 10);
                    }
                    throw th;
                }
            }
        }
    }

    public void A0G() {
        try {
            super.A0G();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0Q;
            if (surface != null) {
                if (this.A0R == surface) {
                    this.A0R = null;
                }
                surface.release();
                this.A0Q = null;
            }
        }
    }

    public final void A0O() {
        C186508vT r1;
        this.A0c = false;
        if (Util.A00 >= 23 && this.A0d && (r1 = this.A0E) != null) {
            this.A0T = new AnonymousClass7R5(r1, this);
        }
    }

    public static final int A00(C166637z1 r6) {
        int i = r6.A0A;
        if (i != -1) {
            List list = r6.A0T;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += AnonymousClass6C9.A1V(list, i3).length;
            }
            return i + i2;
        }
        return A03(r6.A0S, r6.A0I, r6.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0189, code lost:
        if (r9 < 800000) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f2, code lost:
        if (r0.length <= 0) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C166637z1 r13, X.C187008wI r14, boolean r15, boolean r16) {
        /*
            java.lang.String r9 = r13.A0S
            java.lang.String r0 = "video"
            boolean r0 = X.C162097rD.A07(r9, r0)
            r6 = 0
            if (r0 != 0) goto L_0x000c
            return r6
        L_0x000c:
            X.7z3 r0 = r13.A0L
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1W(r0)
            java.util.List r2 = r14.B6o(r9, r4, r6)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0042
            if (r16 == 0) goto L_0x0042
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r0 = X.C162317rh.A01(r13)
            if (r0 == 0) goto L_0x0042
            java.util.List r3 = r14.B6o(r0, r6, r6)
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 26
            if (r1 < r0) goto L_0x0042
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0042
            r2 = r3
        L_0x0042:
            if (r4 == 0) goto L_0x0056
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r14.B6o(r9, r6, r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0055
            r5 = 2
        L_0x0055:
            return r5
        L_0x0056:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005f
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x005f:
            int r1 = r13.A06
            if (r1 == 0) goto L_0x0069
            r0 = 2
            if (r1 == r0) goto L_0x0069
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x0069:
            java.lang.Object r8 = r2.get(r6)
            X.7nt r8 = (X.C160577nt) r8
            java.lang.String r7 = r13.A0O
            if (r7 == 0) goto L_0x00d4
            java.lang.String r12 = r8.A01
            if (r12 == 0) goto L_0x00d4
            java.lang.String r4 = X.C162097rD.A04(r7)
            if (r4 == 0) goto L_0x00d4
            boolean r0 = r12.equals(r4)
            java.lang.String r3 = ", "
            if (r0 != 0) goto L_0x00ab
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "codec.mime "
        L_0x008b:
            X.C18260x0.A0p(r0, r7, r3, r4, r1)
            java.lang.String r0 = r1.toString()
            r8.A02(r0)
            r4 = 0
        L_0x0096:
            boolean r0 = r8.A03
            r1 = 8
            if (r0 == 0) goto L_0x009e
            r1 = 16
        L_0x009e:
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x00a4
            r6 = 32
        L_0x00a4:
            r0 = 3
            if (r4 == 0) goto L_0x00a8
            r0 = 4
        L_0x00a8:
            r1 = r1 | r6
            r0 = r0 | r1
            return r0
        L_0x00ab:
            android.util.Pair r0 = X.C162317rh.A00(r13)
            if (r0 == 0) goto L_0x00d4
            int r2 = X.C18280x3.A03(r0)
            int r1 = X.C18290x4.A03(r0)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = "video/avc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x018d
            r2 = 8
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x00e5
            r0 = 42
            if (r2 == r0) goto L_0x00e5
        L_0x00d4:
            r4 = 1
            int r3 = r13.A0I
            if (r3 <= 0) goto L_0x0096
            int r2 = r13.A09
            if (r2 <= 0) goto L_0x0096
            float r0 = r13.A01
            double r0 = (double) r0
            boolean r4 = r8.A03(r3, r2, r0)
            goto L_0x0096
        L_0x00e5:
            if (r15 == 0) goto L_0x00f5
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.A00
            if (r0 == 0) goto L_0x00ef
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x00f1
        L_0x00ef:
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x00f1:
            int r0 = r0.length
            if (r0 > 0) goto L_0x00f5
            goto L_0x00d4
        L_0x00f5:
            android.media.MediaCodecInfo$CodecCapabilities r10 = r8.A00
            if (r10 == 0) goto L_0x00fd
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = r10.profileLevels
            if (r11 != 0) goto L_0x00ff
        L_0x00fd:
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r6]
        L_0x00ff:
            int r9 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r9 > r0) goto L_0x0134
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0134
            int r0 = r11.length
            if (r0 != 0) goto L_0x0134
            if (r10 == 0) goto L_0x018b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r10.getVideoCapabilities()
            if (r0 == 0) goto L_0x018b
            android.util.Range r0 = r0.getBitrateRange()
            int r9 = X.AnonymousClass6C7.A05(r0)
            r0 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r9 < r0) goto L_0x0146
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0127:
            android.media.MediaCodecInfo$CodecProfileLevel r0 = new android.media.MediaCodecInfo$CodecProfileLevel
            r0.<init>()
            r0.profile = r5
            r0.level = r10
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = new android.media.MediaCodecInfo.CodecProfileLevel[r5]
            r11[r6] = r0
        L_0x0134:
            int r10 = r11.length
            r9 = 0
        L_0x0136:
            if (r9 >= r10) goto L_0x0198
            r5 = r11[r9]
            int r0 = r5.profile
            if (r0 != r2) goto L_0x0143
            int r0 = r5.level
            if (r0 < r1) goto L_0x0143
            goto L_0x00d4
        L_0x0143:
            int r9 = r9 + 1
            goto L_0x0136
        L_0x0146:
            r0 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r9 < r0) goto L_0x014e
            r10 = 512(0x200, float:7.175E-43)
            goto L_0x0127
        L_0x014e:
            r0 = 60000000(0x3938700, float:8.670878E-37)
            if (r9 < r0) goto L_0x0156
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0127
        L_0x0156:
            r0 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r9 < r0) goto L_0x015e
            r10 = 128(0x80, float:1.794E-43)
            goto L_0x0127
        L_0x015e:
            r0 = 18000000(0x112a880, float:2.6936858E-38)
            if (r9 < r0) goto L_0x0166
            r10 = 64
            goto L_0x0127
        L_0x0166:
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r9 < r0) goto L_0x016e
            r10 = 32
            goto L_0x0127
        L_0x016e:
            r0 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r9 < r0) goto L_0x0176
            r10 = 16
            goto L_0x0127
        L_0x0176:
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            if (r9 < r0) goto L_0x017e
            r10 = 8
            goto L_0x0127
        L_0x017e:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r9 < r0) goto L_0x0185
            r10 = 4
            goto L_0x0127
        L_0x0185:
            r0 = 800000(0xc3500, float:1.121039E-39)
            r10 = 2
            if (r9 >= r0) goto L_0x0127
        L_0x018b:
            r10 = 1
            goto L_0x0127
        L_0x018d:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00cc
            r2 = 2
            goto L_0x00cb
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "codec.profileLevel, "
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.A02(X.7z1, X.8wI, boolean, boolean):int");
    }

    public static boolean A05(C166637z1 r2, C166637z1 r3, boolean z) {
        if (!r2.A0S.equals(r3.A0S) || r2.A0E != r3.A0E || ((!z && (r2.A0I != r3.A0I || r2.A09 != r3.A09)) || !Util.A0D(r2.A0N, r3.A0N))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r13.A09 == -1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(android.media.MediaCrypto r23, X.C166637z1 r24, X.C186508vT r25, X.C160577nt r26) {
        /*
            r22 = this;
            r9 = r22
            X.7z1[] r12 = r9.A0A
            r12.getClass()
            r11 = r24
            int r8 = r11.A0I
            r21 = r8
            int r7 = r11.A09
            r20 = r7
            r19 = r7
            int r6 = A00(r11)
            int r5 = r12.length
            r0 = 1
            r10 = r26
            if (r5 == r0) goto L_0x00d6
            r4 = 0
            r14 = 0
        L_0x001f:
            if (r4 >= r5) goto L_0x004c
            r13 = r12[r4]
            boolean r0 = r10.A03
            boolean r0 = A05(r11, r13, r0)
            if (r0 == 0) goto L_0x0049
            int r3 = r13.A0I
            r2 = -1
            if (r3 == r2) goto L_0x0035
            int r1 = r13.A09
            r0 = 0
            if (r1 != r2) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r14 = r14 | r0
            int r8 = java.lang.Math.max(r8, r3)
            int r0 = r13.A09
            int r7 = java.lang.Math.max(r7, r0)
            int r0 = A00(r13)
            int r6 = java.lang.Math.max(r6, r0)
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x004c:
            if (r14 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Resolutions unknown. Codec max resolution: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r5 = "x"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r5, r1, r7)
            java.lang.String r4 = "MediaCodecVideoRenderer"
            android.util.Log.w(r4, r0)
            r3 = 0
            r16 = 0
            r18 = r21
            r1 = r20
            r0 = r21
            if (r1 <= r0) goto L_0x0076
            r16 = 1
            r18 = r1
            r19 = r0
        L_0x0076:
            r0 = r19
            float r2 = (float) r0
            r0 = r18
            float r0 = (float) r0
            float r2 = r2 / r0
            int[] r12 = A0p
            int r0 = r12.length
            r17 = r0
        L_0x0082:
            r13 = 0
            r0 = r17
            if (r3 >= r0) goto L_0x00d6
            r1 = r12[r3]
            float r0 = (float) r1
            float r0 = r0 * r2
            int r14 = (int) r0
            r0 = r18
            if (r1 <= r0) goto L_0x00d6
            r0 = r19
            if (r14 <= r0) goto L_0x00d6
            r15 = r14
            if (r16 != 0) goto L_0x0099
            r15 = r1
            r1 = r14
        L_0x0099:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r10.A00
            if (r0 == 0) goto L_0x00a7
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 == 0) goto L_0x00a7
            android.graphics.Point r13 = X.AnonymousClass6C7.A0P(r0, r15, r1)
        L_0x00a7:
            float r0 = r11.A01
            int r15 = r13.x
            int r14 = r13.y
            double r0 = (double) r0
            boolean r0 = r10.A03(r15, r14, r0)
            if (r0 == 0) goto L_0x01d4
            int r0 = r13.x
            int r8 = java.lang.Math.max(r8, r0)
            int r0 = r13.y
            int r7 = java.lang.Math.max(r7, r0)
            java.lang.String r0 = r11.A0S
            int r0 = A03(r0, r8, r7)
            int r6 = java.lang.Math.max(r6, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Codec max resolution adjusted to: "
            X.AnonymousClass6C7.A1J(r0, r5, r1, r8, r7)
            X.AnonymousClass6C7.A1A(r1, r4)
        L_0x00d6:
            X.7Iz r3 = new X.7Iz
            r3.<init>(r8, r7, r6)
            r9.A0S = r3
            boolean r5 = r9.A0k
            int r4 = r9.A0G
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r1 = r11.A0S
            java.lang.String r0 = "mime"
            r2.setString(r0, r1)
            java.lang.String r1 = "width"
            r0 = r21
            r2.setInteger(r1, r0)
            java.lang.String r1 = "height"
            r0 = r20
            r2.setInteger(r1, r0)
            java.util.List r0 = r11.A0T
            X.AnonymousClass713.A00(r2, r0)
            java.lang.String r6 = "frame-rate"
            float r1 = r11.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x010d
            r2.setFloat(r6, r1)
        L_0x010d:
            java.lang.String r1 = "rotation-degrees"
            int r0 = r11.A0E
            X.AnonymousClass6C9.A0u(r2, r1, r0)
            X.7z0 r7 = r11.A0N
            if (r7 == 0) goto L_0x0141
            java.lang.String r1 = "color-transfer"
            int r0 = r7.A03
            r6 = -1
            if (r0 == r6) goto L_0x0122
            r2.setInteger(r1, r0)
        L_0x0122:
            java.lang.String r1 = "color-standard"
            int r0 = r7.A02
            if (r0 == r6) goto L_0x012b
            r2.setInteger(r1, r0)
        L_0x012b:
            java.lang.String r1 = "color-range"
            int r0 = r7.A01
            if (r0 == r6) goto L_0x0134
            r2.setInteger(r1, r0)
        L_0x0134:
            java.lang.String r1 = "hdr-static-info"
            byte[] r0 = r7.A04
            if (r0 == 0) goto L_0x0141
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r2.setByteBuffer(r1, r0)
        L_0x0141:
            int r1 = r3.A02
            java.lang.String r0 = "max-width"
            r2.setInteger(r0, r1)
            java.lang.String r1 = "max-height"
            int r0 = r3.A00
            r2.setInteger(r1, r0)
            java.lang.String r1 = "max-input-size"
            int r0 = r3.A01
            X.AnonymousClass6C9.A0u(r2, r1, r0)
            int r3 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            r1 = 0
            if (r3 < r0) goto L_0x0162
            java.lang.String r0 = "priority"
            r2.setInteger(r0, r1)
        L_0x0162:
            if (r5 == 0) goto L_0x0169
            java.lang.String r0 = "auto-frc"
            r2.setInteger(r0, r1)
        L_0x0169:
            if (r4 == 0) goto L_0x0176
            java.lang.String r1 = "tunneled-playback"
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            java.lang.String r0 = "audio-session-id"
            r2.setInteger(r0, r4)
        L_0x0176:
            android.view.Surface r0 = r9.A0R
            if (r0 != 0) goto L_0x0191
            boolean r0 = r9.A0S(r10)
            X.C159197lM.A02(r0)
            android.view.Surface r0 = r9.A0Q
            if (r0 != 0) goto L_0x018f
            android.content.Context r1 = r9.A0h
            boolean r0 = r10.A07
            X.6EV r0 = X.AnonymousClass6EV.A01(r1, r0)
            r9.A0Q = r0
        L_0x018f:
            r9.A0R = r0
        L_0x0191:
            r0 = 30
            if (r3 >= r0) goto L_0x019b
            X.7QT r0 = r9.A0i
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x01b4
        L_0x019b:
            X.7QT r0 = r9.A0i
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x01b4
            android.media.MediaCodecInfo$CodecCapabilities r0 = r10.A00
            if (r0 == 0) goto L_0x01b4
            java.lang.String r1 = "low-latency"
            boolean r0 = r0.isFeatureSupported(r1)
            if (r0 == 0) goto L_0x01b4
            r0 = 1
            r2.setFeatureEnabled(r1, r0)
            r2.setInteger(r1, r0)
        L_0x01b4:
            android.view.Surface r1 = r9.A0R
            r15 = 0
            java.lang.Object r0 = r9.A0V
            r11 = r23
            r4 = r25
            r10 = r4
            r12 = r2
            r13 = r1
            r14 = r0
            r10.AzS(r11, r12, r13, r14, r15)
            r0 = 23
            if (r3 < r0) goto L_0x01d3
            boolean r0 = r9.A0d
            if (r0 == 0) goto L_0x01d3
            X.7R5 r0 = new X.7R5
            r0.<init>(r4, r9)
            r9.A0T = r0
        L_0x01d3:
            return
        L_0x01d4:
            int r3 = r3 + 1
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.A0K(android.media.MediaCrypto, X.7z1, X.8vT, X.7nt):void");
    }

    public void A0N() {
        if (!this.A0c) {
            this.A0c = true;
            AnonymousClass7FE r3 = this.A0j;
            Surface surface = this.A0R;
            Handler handler = r3.A00;
            if (handler != null) {
                AnonymousClass8MF.A00(handler, r3, surface, 11);
            }
        }
    }

    public final void A0P() {
        int i = this.A07;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.A0H;
            AnonymousClass7FE r4 = this.A0j;
            Handler handler = r4.A00;
            if (handler != null) {
                handler.post(new C70263aD(r4, i, 0, j));
            }
            this.A07 = 0;
            this.A0H = elapsedRealtime;
        }
    }

    public final void A0Q() {
        int i = this.A0E;
        if (i != -1 || this.A0C != -1) {
            AnonymousClass7FE r2 = this.A0j;
            int i2 = this.A0C;
            int i3 = this.A0D;
            float f = this.A02;
            Handler handler = r2.A00;
            if (handler != null) {
                handler.post(new AnonymousClass8MO(r2, f, i, i2, i3, 0));
            }
        }
    }

    public void A0R(int i) {
        C150237Pv r3 = this.A0B;
        r3.A03 += i;
        int i2 = this.A07 + i;
        this.A07 = i2;
        int i3 = this.A04 + i;
        this.A04 = i3;
        r3.A05 = Math.max(i3, r3.A05);
        if (i2 >= 0) {
            A0P();
        }
    }

    public final boolean A0S(C160577nt r3) {
        if (Util.A00 < 23 || !this.A0a || this.A0d || A0T(r3.A02)) {
            return false;
        }
        if (!r3.A07 || AnonymousClass6EV.A02(this.A0h)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0141, code lost:
        if (r1.equals("Lenovo K8") != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0621, code lost:
        if (r1.equals("HWWAS-H") != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0623, code lost:
        A0n = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0e
            r3 = 1
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0006:
            java.lang.String r0 = "OMX.google"
            boolean r1 = r7.startsWith(r0)
            r0 = 0
            if (r1 != 0) goto L_0x062d
            java.lang.Class<X.6Jt> r2 = X.C125856Jt.class
            monitor-enter(r2)
            boolean r0 = A0o     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "dangal"
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01     // Catch:{ all -> 0x062a }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            int r5 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x062a }
            r4 = 27
            if (r5 > r4) goto L_0x0040
            java.lang.String r0 = "HWEML"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x062a }
            if (r0 != 0) goto L_0x0143
            if (r5 >= r4) goto L_0x0040
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2144781245: goto L_0x0147;
                case -2144781185: goto L_0x0151;
                case -2144781160: goto L_0x015b;
                case -2097309513: goto L_0x0165;
                case -2022874474: goto L_0x016f;
                case -1978993182: goto L_0x0179;
                case -1978990237: goto L_0x0183;
                case -1936688988: goto L_0x018d;
                case -1936688066: goto L_0x0197;
                case -1936688065: goto L_0x01a1;
                case -1931988508: goto L_0x01ab;
                case -1696512866: goto L_0x01b5;
                case -1680025915: goto L_0x01bf;
                case -1615810839: goto L_0x01c9;
                case -1554255044: goto L_0x01d3;
                case -1481772737: goto L_0x01dd;
                case -1481772730: goto L_0x01e7;
                case -1481772729: goto L_0x01f1;
                case -1320080169: goto L_0x01fb;
                case -1217592143: goto L_0x0205;
                case -1180384755: goto L_0x020f;
                case -1139198265: goto L_0x0219;
                case -1052835013: goto L_0x0223;
                case -993250464: goto L_0x022d;
                case -993250458: goto L_0x0237;
                case -965403638: goto L_0x0241;
                case -958336948: goto L_0x024b;
                case -879245230: goto L_0x0255;
                case -842500323: goto L_0x025f;
                case -821392978: goto L_0x0269;
                case -797483286: goto L_0x0273;
                case -794946968: goto L_0x027d;
                case -788334647: goto L_0x0287;
                case -782144577: goto L_0x0291;
                case -575125681: goto L_0x029b;
                case -521118391: goto L_0x02a5;
                case -430914369: goto L_0x02af;
                case -290434366: goto L_0x02b9;
                case -282781963: goto L_0x02c3;
                case -277133239: goto L_0x02cd;
                case -173639913: goto L_0x02d7;
                case -56598463: goto L_0x02e1;
                case 2126: goto L_0x02eb;
                case 2564: goto L_0x02f5;
                case 2715: goto L_0x02ff;
                case 2719: goto L_0x0309;
                case 3483: goto L_0x0313;
                case 73405: goto L_0x031d;
                case 75739: goto L_0x0327;
                case 76779: goto L_0x0331;
                case 78669: goto L_0x033b;
                case 79305: goto L_0x0345;
                case 80618: goto L_0x034f;
                case 88274: goto L_0x0359;
                case 98846: goto L_0x0363;
                case 98848: goto L_0x036d;
                case 99329: goto L_0x0377;
                case 101481: goto L_0x0381;
                case 1513190: goto L_0x038b;
                case 1514184: goto L_0x0395;
                case 1514185: goto L_0x039f;
                case 2436959: goto L_0x03a9;
                case 2463773: goto L_0x03b3;
                case 2464648: goto L_0x03bd;
                case 2689555: goto L_0x03c7;
                case 3154429: goto L_0x03d1;
                case 3284551: goto L_0x03db;
                case 3351335: goto L_0x03e5;
                case 3386211: goto L_0x03ef;
                case 41325051: goto L_0x03f9;
                case 55178625: goto L_0x0403;
                case 61542055: goto L_0x040d;
                case 65355429: goto L_0x0417;
                case 66214468: goto L_0x0421;
                case 66214470: goto L_0x042b;
                case 66214473: goto L_0x0435;
                case 66215429: goto L_0x043f;
                case 66215431: goto L_0x0449;
                case 66215433: goto L_0x0453;
                case 66216390: goto L_0x045d;
                case 76402249: goto L_0x0467;
                case 76404105: goto L_0x0471;
                case 76404911: goto L_0x047b;
                case 80963634: goto L_0x0485;
                case 82882791: goto L_0x048f;
                case 98715550: goto L_0x0499;
                case 101370885: goto L_0x04a3;
                case 102844228: goto L_0x04ad;
                case 165221241: goto L_0x04b7;
                case 182191441: goto L_0x04c1;
                case 245388979: goto L_0x04cb;
                case 287431619: goto L_0x04d5;
                case 307593612: goto L_0x04df;
                case 308517133: goto L_0x04e9;
                case 316215098: goto L_0x04f3;
                case 316215116: goto L_0x04fd;
                case 316246811: goto L_0x0507;
                case 316246818: goto L_0x0511;
                case 407160593: goto L_0x051b;
                case 507412548: goto L_0x0525;
                case 793982701: goto L_0x052f;
                case 794038622: goto L_0x0539;
                case 794040393: goto L_0x0543;
                case 835649806: goto L_0x054d;
                case 917340916: goto L_0x0557;
                case 958008161: goto L_0x0561;
                case 1060579533: goto L_0x056b;
                case 1150207623: goto L_0x0575;
                case 1176899427: goto L_0x057f;
                case 1280332038: goto L_0x0589;
                case 1306947716: goto L_0x0593;
                case 1349174697: goto L_0x059d;
                case 1522194893: goto L_0x05a6;
                case 1691543273: goto L_0x05af;
                case 1709443163: goto L_0x05b8;
                case 1865889110: goto L_0x05c1;
                case 1906253259: goto L_0x05ca;
                case 1977196784: goto L_0x05d3;
                case 2006372676: goto L_0x05dc;
                case 2029784656: goto L_0x05e5;
                case 2030379515: goto L_0x05ee;
                case 2033393791: goto L_0x05f7;
                case 2047190025: goto L_0x0600;
                case 2047252157: goto L_0x0609;
                case 2048319463: goto L_0x0612;
                case 2048855701: goto L_0x061b;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x062a }
        L_0x0037:
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x062a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x062a }
            switch(r0) {
                case -2038157993: goto L_0x0045;
                case -2038157992: goto L_0x004f;
                case -1984447159: goto L_0x0059;
                case -1458559768: goto L_0x0063;
                case -1337484257: goto L_0x006d;
                case -1152053872: goto L_0x0077;
                case -1147076792: goto L_0x0081;
                case -708142633: goto L_0x008b;
                case -594534941: goto L_0x0095;
                case -581948979: goto L_0x009f;
                case -401692983: goto L_0x00a9;
                case -399133966: goto L_0x00b3;
                case -154985182: goto L_0x00bd;
                case 2006354: goto L_0x00c6;
                case 2006367: goto L_0x00cf;
                case 81951059: goto L_0x00d8;
                case 439365079: goto L_0x00e1;
                case 511748841: goto L_0x00ea;
                case 619782645: goto L_0x00f3;
                case 619782647: goto L_0x00fc;
                case 632760191: goto L_0x0105;
                case 807317112: goto L_0x010e;
                case 807374834: goto L_0x0117;
                case 1070811680: goto L_0x0120;
                case 1682560972: goto L_0x0129;
                case 1921424370: goto L_0x0132;
                case 2133907258: goto L_0x013b;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x062a }
        L_0x0040:
            A0o = r3     // Catch:{ all -> 0x062a }
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            goto L_0x0627
        L_0x0045:
            java.lang.String r0 = "Redmi Note 2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x004f:
            java.lang.String r0 = "Redmi Note 3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0059:
            java.lang.String r0 = "MotoG3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0063:
            java.lang.String r0 = "MotoE2(4G-LTE)"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x006d:
            java.lang.String r0 = "Asus_ZB500KL"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0077:
            java.lang.String r0 = "SUGAR S9"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0081:
            java.lang.String r0 = "Lenovo A2016b30"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x008b:
            java.lang.String r0 = "Redmi 4X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0095:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x009f:
            java.lang.String r0 = "m2 note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00a9:
            java.lang.String r0 = "SM-G9350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00b3:
            java.lang.String r0 = "SM-J200M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00bd:
            java.lang.String r0 = "Andromax A26C4H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00c6:
            java.lang.String r0 = "AFTA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00cf:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00d8:
            java.lang.String r0 = "VS880"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00e1:
            java.lang.String r0 = "HUAWEI NXT-L29"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00ea:
            java.lang.String r0 = "SM-J200GU"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00f3:
            java.lang.String r0 = "ASUS_X00ADA"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x00fc:
            java.lang.String r0 = "ASUS_X00ADC"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0105:
            java.lang.String r0 = "SM-N910R4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x010e:
            java.lang.String r0 = "LG-K430"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0117:
            java.lang.String r0 = "LG-M250"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0120:
            java.lang.String r0 = "Lenovo K10a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0129:
            java.lang.String r0 = "ASUS_X00AD"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x0132:
            java.lang.String r0 = "Sony Tablet S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
            goto L_0x0143
        L_0x013b:
            java.lang.String r0 = "Lenovo K8"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0040
        L_0x0143:
            A0n = r3     // Catch:{ all -> 0x062a }
            goto L_0x0040
        L_0x0147:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0151:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x015b:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0165:
            java.lang.String r0 = "K50a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x016f:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0179:
            java.lang.String r0 = "NX541J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0183:
            java.lang.String r0 = "NX573J"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x018d:
            java.lang.String r0 = "PGN528"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0197:
            java.lang.String r0 = "PGN610"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01a1:
            java.lang.String r0 = "PGN611"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01ab:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01b5:
            java.lang.String r0 = "XT1663"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01bf:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01c9:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01d3:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01dd:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01e7:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01f1:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x01fb:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0205:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x020f:
            java.lang.String r0 = "iris60"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0219:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0223:
            java.lang.String r0 = "namath"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x022d:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0237:
            java.lang.String r0 = "A10-70L"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0241:
            java.lang.String r0 = "s905x018"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x024b:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0255:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x025f:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0269:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0273:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x027d:
            java.lang.String r0 = "watson"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0287:
            java.lang.String r0 = "whyred"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0291:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x029b:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02a5:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02af:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02b9:
            java.lang.String r0 = "taido_row"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02c3:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02cd:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02d7:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02e1:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02eb:
            java.lang.String r0 = "C1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02f5:
            java.lang.String r0 = "Q5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x02ff:
            java.lang.String r0 = "V1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0309:
            java.lang.String r0 = "V5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0313:
            java.lang.String r0 = "mh"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x031d:
            java.lang.String r0 = "JGZ"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0327:
            java.lang.String r0 = "M5c"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0331:
            java.lang.String r0 = "MX6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x033b:
            java.lang.String r0 = "P85"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0345:
            java.lang.String r0 = "PLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x034f:
            java.lang.String r0 = "QX1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0359:
            java.lang.String r0 = "Z80"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0363:
            java.lang.String r0 = "cv1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x036d:
            java.lang.String r0 = "cv3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0377:
            java.lang.String r0 = "deb"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0381:
            java.lang.String r0 = "flo"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x038b:
            java.lang.String r0 = "1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0395:
            java.lang.String r0 = "1713"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x039f:
            java.lang.String r0 = "1714"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03a9:
            java.lang.String r0 = "P681"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03b3:
            java.lang.String r0 = "Q350"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03bd:
            java.lang.String r0 = "Q427"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03c7:
            java.lang.String r0 = "XE2X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03d1:
            java.lang.String r0 = "fugu"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03db:
            java.lang.String r0 = "kate"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03e5:
            java.lang.String r0 = "mido"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03ef:
            java.lang.String r0 = "p212"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x03f9:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0403:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x040d:
            java.lang.String r0 = "A1601"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0417:
            java.lang.String r0 = "E5643"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0421:
            java.lang.String r0 = "F3111"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x042b:
            java.lang.String r0 = "F3113"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0435:
            java.lang.String r0 = "F3116"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x043f:
            java.lang.String r0 = "F3211"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0449:
            java.lang.String r0 = "F3213"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0453:
            java.lang.String r0 = "F3215"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x045d:
            java.lang.String r0 = "F3311"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0467:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0471:
            java.lang.String r0 = "Q4260"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x047b:
            java.lang.String r0 = "Q4310"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0485:
            java.lang.String r0 = "V23GB"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x048f:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0499:
            java.lang.String r0 = "i9031"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04a3:
            java.lang.String r0 = "l5460"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04ad:
            java.lang.String r0 = "le_x6"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04b7:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04c1:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04cb:
            java.lang.String r0 = "marino_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04d5:
            java.lang.String r0 = "griffin"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04df:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04e9:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04f3:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x04fd:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0507:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0511:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x051b:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0525:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x052f:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0539:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0543:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x054d:
            java.lang.String r0 = "manning"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0557:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0561:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x056b:
            java.lang.String r0 = "panell_d"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0575:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x057f:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0589:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0593:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x059d:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05a6:
            java.lang.String r0 = "woods_f"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05af:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05b8:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05c1:
            java.lang.String r0 = "santoni"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ca:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05d3:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05dc:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05e5:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05ee:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x05f7:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0600:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0609:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x0612:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0623
        L_0x061b:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x062a }
            if (r0 == 0) goto L_0x0037
        L_0x0623:
            A0n = r3     // Catch:{ all -> 0x062a }
            goto L_0x0037
        L_0x0627:
            boolean r0 = A0n
            return r0
        L_0x062a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x062a }
            throw r0
        L_0x062d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.A0T(java.lang.String):boolean");
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public static void A04(Surface surface, C186508vT r1) {
        r1.Bmo(surface);
    }

    public void A0C(long j, boolean z) {
        long j2;
        super.A0C(j, z);
        A0O();
        this.A0J = -9223372036854775807L;
        this.A04 = 0;
        this.A0L = -9223372036854775807L;
        this.A08 = 0;
        this.A09 = 0;
        int i = this.A0A;
        if (i != 0) {
            this.A0O = this.A0l[i - 1];
            this.A0A = 0;
        }
        if (z) {
            long j3 = this.A0g;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0K = j2;
            return;
        }
        this.A0K = -9223372036854775807L;
    }

    public void A0D(boolean z, boolean z2) {
        super.A0D(z, z2);
        C157937jA r0 = this.A04;
        r0.getClass();
        int i = r0.A00;
        this.A0G = i;
        this.A0d = AnonymousClass000.A1S(i);
        AnonymousClass7FE r3 = this.A0j;
        C150237Pv r2 = this.A0B;
        Handler handler = r3.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r3, r2, 9);
        }
        C157727im r32 = this.A0i;
        r32.A08 = false;
        if (r32.A09 != null) {
            r32.A0B.A02.sendEmptyMessage(1);
            C162857ss r22 = r32.A0A;
            if (r22 != null) {
                r22.A00.registerDisplayListener(r22, (Handler) null);
            }
            r32.A00();
        }
    }

    public void A0F() {
        super.A0F();
        this.A03 = 0;
    }

    public void A0L(C166637z1 r4) {
        super.A0L(r4);
        AnonymousClass7FE r2 = this.A0j;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, r4, 8);
        }
        this.A01 = r4.A02;
        this.A0B = r4.A0E;
    }

    public boolean BIe() {
        Surface surface;
        Surface surface2;
        if (super.BIe() && !this.A0c && (((surface2 = this.A0Q) == null || this.A0R != surface2) && this.A0E != null && !this.A0d)) {
            this.A07 = C142576xQ.SURFACE_NOT_READY;
        }
        if (!super.BIe() || (!this.A0c && (((surface = this.A0Q) == null || this.A0R != surface) && this.A0E != null && !this.A0d))) {
            long j = this.A0K;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A0K = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A0K = -9223372036854775807L;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0061, code lost:
        if ("NVIDIA".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0063;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C125856Jt(android.content.Context r17, android.os.Handler r18, X.C185208tG r19, X.C187008wI r20, X.C147717Fj r21, X.AnonymousClass7QT r22, X.AnonymousClass81X r23, java.lang.Object r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r16 = this;
            r4 = 0
            r15 = 1
            r12 = 2
            r7 = r16
            r14 = r26
            r13 = r25
            r11 = r22
            r10 = r21
            r9 = r20
            r8 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r7.A0a = r15
            r7.A0W = r15
            r5 = 0
            r7.A0b = r4
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0I = r2
            r7.A0Z = r4
            r7.A0e = r4
            r0 = r28
            r7.A0g = r0
            r1 = r17
            android.content.Context r0 = r1.getApplicationContext()
            r7.A0h = r0
            r0 = r27
            r7.A0f = r0
            X.7im r0 = new X.7im
            r0.<init>(r1)
            r7.A0i = r0
            X.7FE r0 = new X.7FE
            r6 = r18
            r1 = r23
            r0.<init>(r6, r1)
            r7.A0j = r0
            int r6 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 22
            if (r6 > r0) goto L_0x0063
            java.lang.String r1 = "foster"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = "NVIDIA"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            r7.A0k = r0
            r0 = 29
            if (r6 != r0) goto L_0x0075
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "Pixel "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0075
            r5 = 1
        L_0x0075:
            r7.A0X = r5
            r1 = 10
            long[] r0 = new long[r1]
            r7.A0l = r0
            long[] r0 = new long[r1]
            r7.A0m = r0
            r7.A0O = r2
            r7.A0L = r2
            r7.A0K = r2
            r1 = -1
            r7.A06 = r1
            r7.A05 = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A00 = r0
            r7.A01 = r0
            r7.A0F = r15
            r7.A0E = r1
            r7.A0C = r1
            r7.A02 = r0
            r7.A0D = r1
            r0 = r30
            r7.A0a = r0
            r7.A0W = r4
            r0 = r31
            r7.A0b = r0
            r0 = r32
            r7.A0Z = r0
            r0 = r33
            r7.A0e = r0
            r0 = r24
            r7.A0V = r0
            r0 = r34
            r7.A0W = r0
            r0 = r35
            r7.A0V = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.<init>(android.content.Context, android.os.Handler, X.8tG, X.8wI, X.7Fj, X.7QT, X.81X, java.lang.Object, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        if (X.AnonymousClass6C9.A0N(r0 - r13.A05, r14 - r13.A04) > 20000000) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022a A[Catch:{ all -> 0x02aa, IllegalStateException -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x029d A[Catch:{ all -> 0x02aa, IllegalStateException -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029f A[Catch:{ all -> 0x02aa, IllegalStateException -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020f A[Catch:{ all -> 0x02aa, IllegalStateException -> 0x02af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(X.C186508vT r38, java.nio.ByteBuffer r39, int r40, int r41, long r42, long r44, long r46, boolean r48) {
        /*
            r37 = this;
            r2 = r37
            long r3 = r2.A0J
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r22 = r42
            if (r5 != 0) goto L_0x0015
            r3 = r22
            r5 = r22
            r2.A0J = r5
        L_0x0015:
            long r5 = r2.A0O
            r27 = r46
            long r29 = r46 - r5
            r26 = 1
            r36 = r38
            r35 = r40
            if (r48 == 0) goto L_0x003e
            java.lang.String r3 = "skipVideoBuffer"
            X.C153827c5.A01(r3)
            r5 = 0
            r4 = r36
            r3 = r35
            r4.Bir(r3, r5)
            X.C153827c5.A00()
            X.7Pv r4 = r2.A0B
            int r3 = r4.A09
            int r3 = r3 + 1
            r4.A09 = r3
        L_0x003b:
            r2.A0I = r0
            return r26
        L_0x003e:
            long r24 = r46 - r42
            android.view.Surface r1 = r2.A0R
            android.view.Surface r0 = r2.A0Q
            r5 = 0
            if (r1 != r0) goto L_0x006a
            r3 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a9
            java.lang.String r0 = "skipVideoBuffer"
            X.C153827c5.A01(r0)
            r1 = r36
            r0 = r35
            r1.Bir(r0, r5)
            X.C153827c5.A00()
            X.7Pv r1 = r2.A0B
            int r0 = r1.A09
            int r0 = r0 + 1
            r1.A09 = r0
        L_0x0064:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x003b
        L_0x006a:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r20
            int r1 = r2.A01
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            boolean r0 = r2.A0c
            if (r0 == 0) goto L_0x01e0
            if (r1 == 0) goto L_0x02de
            long r0 = r2.A0M
            long r7 = r9 - r0
            r5 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            r5 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            goto L_0x01e0
        L_0x0092:
            int r0 = (r42 > r3 ? 1 : (r42 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x02de
            long r9 = r9 - r44
            long r3 = r24 - r9
            long r18 = java.lang.System.nanoTime()
            long r3 = r3 * r20
            long r0 = r18 + r3
            X.7im r13 = r2.A0i
            long r14 = r20 * r46
            boolean r9 = r13.A08
            if (r9 == 0) goto L_0x015e
            long r3 = r13.A02
            int r5 = (r46 > r3 ? 1 : (r46 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bb
            long r3 = r13.A01
            r5 = 1
            long r3 = r3 + r5
            r13.A01 = r3
            long r3 = r13.A03
            r13.A00 = r3
        L_0x00bb:
            long r3 = r13.A01
            r6 = 6
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0147
            long r11 = r13.A04
            long r5 = r14 - r11
            long r5 = r5 / r3
            long r7 = r13.A00
            long r7 = r7 + r5
            long r3 = r7 - r11
            long r9 = r13.A05
            long r16 = r0 - r9
            r5 = r3
            r3 = r16
            long r16 = X.AnonymousClass6C9.A0N(r3, r5)
            r4 = 20000000(0x1312d00, double:9.881313E-317)
            int r3 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x015a
            long r9 = r9 + r7
            long r0 = r9 - r11
        L_0x00e2:
            r3 = r27
            r13.A02 = r3
            r13.A03 = r7
            X.7t8 r8 = r13.A0B
            if (r8 == 0) goto L_0x0116
            long r4 = r13.A06
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0116
            long r3 = r8.A04
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0116
            long r5 = r13.A06
            long r7 = r0 - r3
            long r7 = r7 / r5
            long r7 = r7 * r5
            long r3 = r3 + r7
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x0143
            long r8 = r3 - r5
        L_0x010a:
            long r6 = r3 - r0
            long r0 = r0 - r8
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0112
            r3 = r8
        L_0x0112:
            long r0 = r13.A07
            long r3 = r3 - r0
            r0 = r3
        L_0x0116:
            long r8 = r0 - r18
            long r8 = r8 / r20
            r4 = -500000(0xfffffffffff85ee0, double:NaN)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x016f
            X.8tJ r7 = r2.A06
            r7.getClass()
            long r5 = r2.A03
            long r3 = r42 - r5
            int r3 = r7.BpO(r3)
            if (r3 == 0) goto L_0x016f
            X.7Pv r1 = r2.A0B
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            int r0 = r2.A03
            int r0 = r0 + r3
            r2.A0R(r0)
            r2.A0F()
            goto L_0x02de
        L_0x0143:
            long r5 = r5 + r3
            r8 = r3
            r3 = r5
            goto L_0x010a
        L_0x0147:
            long r3 = r13.A04
            long r7 = r14 - r3
            long r5 = r13.A05
            long r3 = r0 - r5
            long r6 = X.AnonymousClass6C9.A0N(r3, r7)
            r4 = 20000000(0x1312d00, double:9.881313E-317)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x015e
        L_0x015a:
            r3 = 0
            r13.A08 = r3
            r9 = 0
        L_0x015e:
            r7 = r14
            if (r9 != 0) goto L_0x00e2
            r13.A04 = r14
            r13.A05 = r0
            r3 = 0
            r13.A01 = r3
            r3 = r26
            r13.A08 = r3
            goto L_0x00e2
        L_0x016f:
            r4 = -30000(0xffffffffffff8ad0, double:NaN)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x018b
            java.lang.String r0 = "dropVideoBuffer"
            X.C153827c5.A01(r0)
            r3 = 0
            r1 = r36
            r0 = r35
            r1.Bir(r0, r3)
            X.C153827c5.A00()
            r0 = r26
            r2.A0R(r0)
            return r26
        L_0x018b:
            r4 = 50000(0xc350, double:2.47033E-319)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x01e4
            X.7z1 r0 = r2.A0A
            float r10 = r0.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x019e
            r10 = 1106247680(0x41f00000, float:30.0)
        L_0x019e:
            long r0 = com.facebook.android.exoplayer2.util.Util.A05(r22)
            int r9 = (int) r0
            long r0 = com.facebook.android.exoplayer2.util.Util.A05(r24)
            int r8 = (int) r0
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r8 <= r5) goto L_0x02de
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r8 >= r0) goto L_0x02de
            int r4 = r9 + r8
            int r1 = r2.A08
            int r0 = r2.A09
            int r3 = r1 + r0
            int r0 = r3 + r5
            if (r4 <= r0) goto L_0x02de
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r9 <= r1) goto L_0x01d8
            if (r9 >= r3) goto L_0x01d8
            X.7Pv r5 = r2.A0B
            int r1 = r5.A0A
            int r4 = r4 - r3
            float r0 = (float) r4
        L_0x01cb:
            float r0 = r0 * r10
            double r3 = (double) r0
            double r3 = r3 / r6
            int r0 = (int) r3
            int r1 = r1 + r0
            r5.A0A = r1
        L_0x01d2:
            r2.A08 = r9
            r2.A09 = r8
            goto L_0x02de
        L_0x01d8:
            if (r9 <= r3) goto L_0x01d2
            X.7Pv r5 = r2.A0B
            int r1 = r5.A0A
            float r0 = (float) r8
            goto L_0x01cb
        L_0x01e0:
            long r0 = java.lang.System.nanoTime()     // Catch:{ IllegalStateException -> 0x02af }
        L_0x01e4:
            int r7 = r2.A06     // Catch:{ IllegalStateException -> 0x02af }
            r4 = -1
            if (r7 != r4) goto L_0x01ed
            int r3 = r2.A05     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == r4) goto L_0x0226
        L_0x01ed:
            int r3 = r2.A0E     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 != r7) goto L_0x0204
            int r4 = r2.A0C     // Catch:{ IllegalStateException -> 0x02af }
            int r3 = r2.A05     // Catch:{ IllegalStateException -> 0x02af }
            if (r4 != r3) goto L_0x0204
            int r4 = r2.A0D     // Catch:{ IllegalStateException -> 0x02af }
            r3 = 0
            if (r4 != r3) goto L_0x0204
            float r4 = r2.A02     // Catch:{ IllegalStateException -> 0x02af }
            float r3 = r2.A00     // Catch:{ IllegalStateException -> 0x02af }
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0226
        L_0x0204:
            X.7FE r5 = r2.A0j     // Catch:{ IllegalStateException -> 0x02af }
            int r8 = r2.A05     // Catch:{ IllegalStateException -> 0x02af }
            r9 = 0
            float r6 = r2.A00     // Catch:{ IllegalStateException -> 0x02af }
            android.os.Handler r3 = r5.A00     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == 0) goto L_0x0218
            X.8MO r4 = new X.8MO     // Catch:{ IllegalStateException -> 0x02af }
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ IllegalStateException -> 0x02af }
            r3.post(r4)     // Catch:{ IllegalStateException -> 0x02af }
        L_0x0218:
            int r3 = r2.A06     // Catch:{ IllegalStateException -> 0x02af }
            r2.A0E = r3     // Catch:{ IllegalStateException -> 0x02af }
            int r3 = r2.A05     // Catch:{ IllegalStateException -> 0x02af }
            r2.A0C = r3     // Catch:{ IllegalStateException -> 0x02af }
            r2.A0D = r9     // Catch:{ IllegalStateException -> 0x02af }
            float r3 = r2.A00     // Catch:{ IllegalStateException -> 0x02af }
            r2.A02 = r3     // Catch:{ IllegalStateException -> 0x02af }
        L_0x0226:
            X.7Ax r3 = r2.A0U     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == 0) goto L_0x0265
            X.7qS r4 = r3.A00     // Catch:{ IllegalStateException -> 0x02af }
            X.7a6 r3 = r4.A0B     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == 0) goto L_0x0265
            boolean r3 = r4.A0Z     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == 0) goto L_0x0265
            X.0Su r3 = r4.A08     // Catch:{ IllegalStateException -> 0x02af }
            if (r3 == 0) goto L_0x0265
            long r29 = r29 / r20
            long r33 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x02af }
            X.0MG r8 = new X.0MG     // Catch:{ IllegalStateException -> 0x02af }
            r28 = r8
            r31 = r29
            r28.<init>(r29, r31, r33)     // Catch:{ IllegalStateException -> 0x02af }
            java.util.concurrent.BlockingDeque r9 = r3.A00     // Catch:{ IllegalStateException -> 0x02af }
            java.lang.Object r10 = r9.peekLast()     // Catch:{ IllegalStateException -> 0x02af }
            X.0MG r10 = (X.AnonymousClass0MG) r10     // Catch:{ IllegalStateException -> 0x02af }
            if (r10 == 0) goto L_0x0262
            long r5 = r10.A03     // Catch:{ IllegalStateException -> 0x02af }
            long r3 = r8.A03     // Catch:{ IllegalStateException -> 0x02af }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0262
            long r6 = r10.A01     // Catch:{ IllegalStateException -> 0x02af }
            long r4 = r8.A01     // Catch:{ IllegalStateException -> 0x02af }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0262
            goto L_0x0265
        L_0x0262:
            r9.add(r8)     // Catch:{ IllegalStateException -> 0x02af }
        L_0x0265:
            java.lang.String r3 = "releaseOutputBuffer"
            X.C153827c5.A01(r3)     // Catch:{ all -> 0x02aa }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02aa }
            r4 = r36
            r3 = r35
            r4.Biq(r3, r0)     // Catch:{ all -> 0x02aa }
            long r3 = r2.A09     // Catch:{ all -> 0x02aa }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02aa }
            long r0 = r0 - r5
            long r3 = r3 + r0
            r2.A09 = r3     // Catch:{ all -> 0x02aa }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02aa }
            long r0 = r0 * r20
            r2.A0M = r0     // Catch:{ all -> 0x02aa }
            X.7Pv r1 = r2.A0B     // Catch:{ all -> 0x02aa }
            int r0 = r1.A07     // Catch:{ all -> 0x02aa }
            int r0 = r0 + 1
            r1.A07 = r0     // Catch:{ all -> 0x02aa }
            r0 = 0
            r2.A04 = r0     // Catch:{ all -> 0x02aa }
            r2.A0N()     // Catch:{ all -> 0x02aa }
            X.7Pv r5 = r2.A0B     // Catch:{ all -> 0x02aa }
            long r3 = r2.A09     // Catch:{ all -> 0x02aa }
            int r0 = r5.A07     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x029f
            r0 = -1
            goto L_0x02a2
        L_0x029f:
            long r0 = (long) r0     // Catch:{ all -> 0x02aa }
            long r3 = r3 / r0
            int r0 = (int) r3     // Catch:{ all -> 0x02aa }
        L_0x02a2:
            r5.A00 = r0     // Catch:{ all -> 0x02aa }
            X.C153827c5.A00()     // Catch:{ IllegalStateException -> 0x02af }
            goto L_0x0064
        L_0x02a9:
            return r5
        L_0x02aa:
            r0 = move-exception
            X.C153827c5.A00()     // Catch:{ IllegalStateException -> 0x02af }
            throw r0     // Catch:{ IllegalStateException -> 0x02af }
        L_0x02af:
            r12 = move-exception
            int r1 = r2.A0f
            r11 = 0
            if (r1 <= 0) goto L_0x02e0
            long r7 = r2.A0I
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x02ca
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            long r3 = (long) r1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x02cb
        L_0x02ca:
            r11 = 1
        L_0x02cb:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x02dc
            java.lang.String r1 = "MediaCodecVideoRenderer"
            java.lang.String r0 = "Render output failed"
            android.util.Log.w(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A0I = r0
        L_0x02dc:
            if (r11 == 0) goto L_0x02e0
        L_0x02de:
            r0 = 0
            return r0
        L_0x02e0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125856Jt.A0M(X.8vT, java.nio.ByteBuffer, int, int, long, long, long, boolean):boolean");
    }
}
