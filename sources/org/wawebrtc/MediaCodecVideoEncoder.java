package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass8HT;
import X.C106155Xv;
import X.C141876wH;
import X.C1440970a;
import X.C1454575y;
import X.C148427Ii;
import X.C156467gg;
import X.C157927j9;
import X.C160027mu;
import X.C177508fz;
import X.C180158ka;
import X.C18330xA;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final Map cachedCodecCapabilites = AnonymousClass001.A0t();
    public static int codecErrors;
    public static C180158ka errorCallback;
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static Set hwEncoderDisabledTypes = AnonymousClass002.A0K();
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final int[] supportedSurfaceColorList;
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = AnonymousClass0x9.A18();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public C160027mu drawer;
    public C177508fz eglBase;
    public final List freeInfos = AnonymousClass0x9.A18();
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public Bundle keyFrameRequestBundle = AnonymousClass002.A08();
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public C141876wH type;
    public final C106155Xv voipSharedPreferences;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i, ByteBuffer byteBuffer, boolean z, long j, long j2, int i2, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.timestamp = j;
            this.encodeTimeMs = j2;
            this.bitInfo = i2;
            this.isConfigData = z2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[Catch:{ IllegalStateException -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[Catch:{ IllegalStateException -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encodeBuffer(boolean r16, int r17, int r18, long r19, long r21, int r23) {
        /*
            r15 = this;
            r1 = 1
            r4 = 0
            if (r16 == 0) goto L_0x0011
            boolean r0 = r15.supportForceKeyFrame()     // Catch:{ IllegalStateException -> 0x0054 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "MediaCodecVideoEncoder force Keyframe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0054 }
            r8 = 1
            goto L_0x0012
        L_0x0011:
            r8 = 0
        L_0x0012:
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0054 }
            java.util.List r0 = r15.freeInfos     // Catch:{ IllegalStateException -> 0x0054 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x0054 }
            r13 = r19
            r10 = r23
            if (r0 == 0) goto L_0x0044
            X.7gg r9 = new X.7gg     // Catch:{ IllegalStateException -> 0x0054 }
            r9.<init>(r10, r11, r13)     // Catch:{ IllegalStateException -> 0x0054 }
        L_0x0027:
            java.util.Queue r0 = r15.carryAlongInfos     // Catch:{ IllegalStateException -> 0x0054 }
            r0.add(r9)     // Catch:{ IllegalStateException -> 0x0054 }
            android.media.MediaCodec r0 = r15.mediaCodec     // Catch:{ IllegalStateException -> 0x0054 }
            r3 = r17
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r3)     // Catch:{ IllegalStateException -> 0x0054 }
            r0.position(r4)     // Catch:{ IllegalStateException -> 0x0054 }
            r5 = r18
            r0.limit(r5)     // Catch:{ IllegalStateException -> 0x0054 }
            android.media.MediaCodec r2 = r15.mediaCodec     // Catch:{ IllegalStateException -> 0x0054 }
            r6 = r21
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ IllegalStateException -> 0x0054 }
            goto L_0x0053
        L_0x0044:
            java.util.List r0 = r15.freeInfos     // Catch:{ IllegalStateException -> 0x0054 }
            java.lang.Object r9 = r0.remove(r4)     // Catch:{ IllegalStateException -> 0x0054 }
            X.7gg r9 = (X.C156467gg) r9     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A01 = r11     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A02 = r13     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A00 = r10     // Catch:{ IllegalStateException -> 0x0054 }
            goto L_0x0027
        L_0x0053:
            return r1
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder encodeBuffer failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.encodeBuffer(boolean, int, int, long, long, int):boolean");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e);
            return false;
        }
    }

    private void checkOnMediaCodecThread() {
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (r7.startsWith("OMX.google") != false) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findHwEncoder(java.lang.String r22, java.lang.String[] r23, int[] r24, int r25, boolean r26) {
        /*
            r12 = r24
            java.lang.String r0 = "vid_driver.encoder_name"
            java.lang.String r11 = com.whatsapp.voipcalling.Voip.A06(r0)
            java.lang.String r0 = "video/avc"
            r13 = r22
            boolean r20 = r13.equals(r0)
            java.lang.String r3 = " is not supported."
            java.lang.String r19 = "video/hevc"
            java.lang.String r18 = "MediaCodecVideoEncoder Model: "
            r2 = 0
            if (r20 == 0) goto L_0x0029
            boolean r0 = X.C107535bT.A04()
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r18)
            java.lang.String r0 = android.os.Build.MODEL
            X.C18260x0.A0r(r0, r3, r1)
            return r2
        L_0x0029:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String[] r4 = H265_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0035:
            if (r2 >= r3) goto L_0x004b
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0048
            r17 = 1
        L_0x0043:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h265BlacklistedBuildHardware
            goto L_0x0067
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0035
        L_0x004b:
            r17 = 0
            goto L_0x0043
        L_0x004e:
            r17 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String[] r4 = H264_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0055:
            if (r2 >= r3) goto L_0x02af
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02ab
            r17 = 1
        L_0x0063:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h264BlacklistedBuildHardware
        L_0x0067:
            boolean r0 = X.AnonymousClass8HT.A0E(r1, r0)
            if (r0 == 0) goto L_0x006f
            r17 = 1
        L_0x006f:
            java.util.LinkedList r10 = X.AnonymousClass0x9.A18()
            r9 = -1
            r8 = 0
        L_0x0075:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r8 >= r0) goto L_0x02b3
            android.media.MediaCodecInfo r3 = android.media.MediaCodecList.getCodecInfoAt(r8)
            boolean r0 = r3.isEncoder()
            if (r0 == 0) goto L_0x00c0
            java.lang.String[] r4 = r3.getSupportedTypes()
            int r2 = r4.length
            r1 = 0
        L_0x008b:
            if (r1 >= r2) goto L_0x02a8
            r0 = r4[r1]
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x02a4
            java.lang.String r7 = r3.getName()
        L_0x0099:
            if (r7 == 0) goto L_0x00c0
            if (r17 == 0) goto L_0x00c3
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x00c3
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r18)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = " has black listed H.264 hw encoder "
            r1.append(r0)
        L_0x00b9:
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r1)
        L_0x00bd:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00c0:
            int r8 = r8 + 1
            goto L_0x0075
        L_0x00c3:
            if (r26 == 0) goto L_0x00ce
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Found candidate encoder "
            X.C18260x0.A0s(r0, r7, r1)
        L_0x00ce:
            java.lang.String[] r0 = blacklistedHwCodecPrefixes
            java.lang.String r2 = "MediaCodecVideoEncoder "
            if (r0 == 0) goto L_0x00e1
            boolean r0 = X.AnonymousClass8HT.A0E(r7, r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r2, r7)
            java.lang.String r7 = " is in the blacklist."
            goto L_0x00b9
        L_0x00e1:
            r0 = r23
            if (r23 == 0) goto L_0x00f7
            boolean r1 = X.AnonymousClass8HT.A0E(r7, r0)
        L_0x00e9:
            if (r1 != 0) goto L_0x0112
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r2, r7)
            java.lang.String r0 = " is not supported on "
            r1.append(r0)
            java.lang.String r7 = android.os.Build.MODEL
            goto L_0x00b9
        L_0x00f7:
            r0 = 0
            if (r20 == 0) goto L_0x00ff
            boolean r1 = X.C107535bT.A0E(r7, r0)
            goto L_0x00e9
        L_0x00ff:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00e9
        L_0x0110:
            r1 = 0
            goto L_0x00e9
        L_0x0112:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "_"
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r13, r1)
            java.util.Map r1 = cachedCodecCapabilites
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0142
            java.lang.Object r6 = r1.get(r2)
            android.media.MediaCodecInfo$CodecCapabilities r6 = (android.media.MediaCodecInfo.CodecCapabilities) r6
        L_0x012a:
            r2 = r25
            boolean r5 = X.AnonymousClass001.A1V(r2)
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r6.profileLevels
            int r3 = r4.length
            r1 = 0
        L_0x0134:
            if (r1 >= r3) goto L_0x014a
            r0 = r4[r1]
            if (r25 < 0) goto L_0x013f
            int r0 = r0.profile
            if (r0 != r2) goto L_0x013f
            r5 = 1
        L_0x013f:
            int r1 = r1 + 1
            goto L_0x0134
        L_0x0142:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r3.getCapabilitiesForType(r13)     // Catch:{ all -> 0x0298 }
            r1.put(r2, r6)
            goto L_0x012a
        L_0x014a:
            if (r5 != 0) goto L_0x0166
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder  "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " does not support Profile "
            r1.append(r0)
            r1.append(r2)
        L_0x0160:
            java.lang.String r0 = r1.toString()
            goto L_0x00bd
        L_0x0166:
            if (r26 == 0) goto L_0x01b4
            int[] r5 = r6.colorFormats
            int r4 = r5.length
            r3 = 0
        L_0x016c:
            if (r3 >= r4) goto L_0x0183
            r2 = r5[r3]
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder    Supported Color: 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            X.C18260x0.A1L(r1, r0)
            int r3 = r3 + 1
            goto L_0x016c
        L_0x0183:
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r6.getEncoderCapabilities()
            if (r2 == 0) goto L_0x01b4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder    CBR: "
            r1.append(r0)
            r0 = 2
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ", VBR: "
            r1.append(r0)
            r0 = 1
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ",  CQ: "
            r1.append(r0)
            r0 = 0
            boolean r0 = r2.isBitrateModeSupported(r0)
            X.C18260x0.A1V(r1, r0)
        L_0x01b4:
            if (r12 != 0) goto L_0x0244
            java.lang.String r0 = "vid_driver.encoder_color_format"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r11 == 0) goto L_0x0242
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x0242
            if (r1 == 0) goto L_0x0242
            int r5 = r1.intValue()
        L_0x01ca:
            int[] r12 = X.AnonymousClass8HT.A0G(r7, r5)
        L_0x01ce:
            int r0 = r12.length
            r22 = r0
            r4 = 0
            r3 = 0
        L_0x01d3:
            r0 = r22
            if (r4 >= r0) goto L_0x0246
            r16 = r12[r4]
            int[] r15 = r6.colorFormats
            int r0 = r15.length
            r21 = r0
            r2 = 0
        L_0x01df:
            r0 = r21
            if (r2 >= r0) goto L_0x023f
            r1 = r15[r2]
            r14 = 19
            r0 = r16
            if (r0 != r14) goto L_0x01fe
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = "OMX.IMG.TOPAZ.VIDEO.Encoder"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x01fe
        L_0x01fb:
            int r2 = r2 + 1
            goto L_0x01df
        L_0x01fe:
            r0 = r16
            if (r1 != r0) goto L_0x01fb
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Found target encoder for mime "
            r14.append(r0)
            r14.append(r13)
            java.lang.String r0 = " : "
            r14.append(r0)
            r14.append(r7)
            java.lang.String r0 = ". Color: 0x"
            X.AnonymousClass000.A1G(r0, r14, r1)
            java.lang.String r0 = "("
            r14.append(r0)
            r14.append(r1)
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r14, r0)
            if (r3 != 0) goto L_0x022e
            android.media.MediaCodecInfo$VideoCapabilities r3 = r6.getVideoCapabilities()
        L_0x022e:
            if (r1 != r5) goto L_0x0234
            int r9 = r10.size()
        L_0x0234:
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r6.profileLevels
            X.7NK r0 = new X.7NK
            r0.<init>(r3, r7, r14, r1)
            r10.add(r0)
            goto L_0x01fb
        L_0x023f:
            int r4 = r4 + 1
            goto L_0x01d3
        L_0x0242:
            r5 = 0
            goto L_0x01ca
        L_0x0244:
            r5 = 0
            goto L_0x01ce
        L_0x0246:
            if (r3 == 0) goto L_0x00c0
            if (r26 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder birtate range: "
            r1.append(r0)
            android.util.Range r0 = r3.getBitrateRange()
            r1.append(r0)
            java.lang.String r0 = ", frame rate: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedFrameRates()
            r1.append(r0)
            java.lang.String r0 = ", height alignment: "
            r1.append(r0)
            int r0 = r3.getHeightAlignment()
            r1.append(r0)
            java.lang.String r0 = ", width alignment: "
            r1.append(r0)
            int r0 = r3.getWidthAlignment()
            r1.append(r0)
            java.lang.String r0 = ", height range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedHeights()
            r1.append(r0)
            java.lang.String r0 = ", width range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedWidths()
            r1.append(r0)
            goto L_0x0160
        L_0x0298:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder failed to get capabilities for "
            X.C18260x0.A0u(r0, r7, r1, r2)
            goto L_0x00c0
        L_0x02a4:
            int r1 = r1 + 1
            goto L_0x008b
        L_0x02a8:
            r7 = 0
            goto L_0x0099
        L_0x02ab:
            int r2 = r2 + 1
            goto L_0x0055
        L_0x02af:
            r17 = 0
            goto L_0x0063
        L_0x02b3:
            if (r9 < 0) goto L_0x02c4
            java.lang.Object r2 = r10.get(r9)
            r1 = 0
            java.lang.Object r0 = r10.get(r1)
            r10.set(r9, r0)
            r10.set(r1, r2)
        L_0x02c4:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x02d5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder No HW encoder found for mime "
            X.C18260x0.A0s(r0, r13, r1)
            r0 = 0
            return r0
        L_0x02d5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        if (AnonymousClass8HT.A0E(this.codecName, trustedCodecPrefixes)) {
            return 4;
        }
        return 2;
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A0E = AnonymousClass8HT.A0E(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        if (A0E) {
            return 30;
        }
        return 1000;
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mediaCodec.getOutputBuffer(i);
    }

    public static boolean isH264HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/avc")) {
            return AnonymousClass6C8.A1U("video/avc", (int[]) null, supportedH264HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc")) {
            return false;
        }
        return AnonymousClass6C8.A1U("video/avc", supportedSurfaceColorList, supportedH264HwCodecPrefixes);
    }

    public static boolean isH265HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", supportedH265HwCodecPrefixes, (int[]) null, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/hevc")) {
            return false;
        }
        return AnonymousClass6C8.A1U("video/hevc", supportedSurfaceColorList, supportedH265HwCodecPrefixes);
    }

    public static boolean isVp8HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return AnonymousClass6C8.A1U("video/x-vnd.on2.vp8", (int[]) null, supportedVp8HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return false;
        }
        return AnonymousClass6C8.A1U("video/x-vnd.on2.vp8", supportedSurfaceColorList, supportedVp8HwCodecPrefixes);
    }

    public static boolean isVp9HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return AnonymousClass6C8.A1U("video/x-vnd.on2.vp9", (int[]) null, supportedVp9HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return false;
        }
        return AnonymousClass6C8.A1U("video/x-vnd.on2.vp9", supportedSurfaceColorList, supportedVp9HwCodecPrefixes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoEncoder r0 = runningInstance
            if (r0 == 0) goto L_0x001f
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x001f
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x001f
            java.lang.String r0 = "MediaCodecVideoEncoder  stacks trace:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0015:
            r0 = r3[r1]
            X.C18280x3.A14(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.printStackTrace():void");
    }

    public static void setErrorCallback(C180158ka r1) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = r1;
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, this.mediaCodec.getInputBuffer(dequeueInputBuffer), false, 0, 0, 0, false);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = this.mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                AnonymousClass6C7.A0z(bufferInfo, outputBuffer);
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0, 0, 0, true);
                    return this.cachedOutputBuffer;
                }
                boolean A1S = AnonymousClass000.A1S(i2 & 1);
                C156467gg r2 = (C156467gg) this.carryAlongInfos.remove();
                int i3 = r2.A00;
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), A1S, r2.A02, SystemClock.elapsedRealtime() - r2.A01, i3, false);
                this.freeInfos.add(r2);
                return this.cachedOutputBuffer;
            } else if (dequeueOutputBuffer == -3) {
                return dequeueOutputBuffer(i);
            } else {
                if (dequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer(i);
                }
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                throw AnonymousClass002.A0E(AnonymousClass000.A0Y("dequeueOutputBuffer: ", AnonymousClass001.A0o(), dequeueOutputBuffer));
            }
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, (ByteBuffer) null, false, -1, -1, 0, false);
            return bufferInfo2;
        }
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        RuntimeException runtimeException;
        C148427Ii r3;
        if (z) {
            try {
                Log.i("MediaCodecVideoEncoder Sync frame request");
                this.mediaCodec.setParameters(this.keyFrameRequestBundle);
            } catch (RuntimeException e) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.A02();
        GLES20.glClear(16384);
        C160027mu r0 = this.drawer;
        int i2 = this.width;
        int i3 = this.height;
        Map map = r0.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            r3 = (C148427Ii) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            r3 = new C148427Ii();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", r3);
            C157927j9 r2 = r3.A01;
            int i4 = r2.A00;
            if (i4 != -1) {
                GLES20.glUseProgram(i4);
                C1454575y.A00("glUseProgram");
                GLES20.glUniform1i(r2.A01("oes_tex"), 0);
                C1454575y.A00("Initialize fragment shader uniform values.");
                r2.A02("in_pos", C160027mu.A01);
                r2.A02("in_tc", C160027mu.A02);
            } else {
                runtimeException = AnonymousClass002.A0E("The program has been released");
                throw runtimeException;
            }
        }
        int i5 = r3.A01.A00;
        if (i5 != -1) {
            GLES20.glUseProgram(i5);
            C1454575y.A00("glUseProgram");
            GLES20.glUniformMatrix4fv(r3.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            C177508fz r5 = this.eglBase;
            long nanos = TimeUnit.MICROSECONDS.toNanos(j);
            r5.A05();
            EGLSurface eGLSurface = r5.A03;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGLExt.eglPresentationTimeANDROID(r5.A02, eGLSurface, nanos);
                EGL14.eglSwapBuffers(r5.A02, r5.A03);
                return true;
            }
            runtimeException = AnonymousClass002.A0E("No EGLSurface - can't swap buffers");
        } else {
            runtimeException = AnonymousClass002.A0E("The program has been released");
        }
        throw runtimeException;
    }

    public boolean initH264Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(C141876wH.VIDEO_CODEC_H264, i, i2, i3, i4, i5, (C1440970a) null);
    }

    public boolean initH265Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(C141876wH.VIDEO_CODEC_H265, i, i2, i3, i4, i5, (C1440970a) null);
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportForceKeyFrame() {
        return !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportUpdateBitrate() {
        return !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    static {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 2130708361;
        supportedSurfaceColorList = A0E;
    }

    public MediaCodecVideoEncoder(C106155Xv r5) {
        this.voipSharedPreferences = r5;
        int i = 0;
        do {
            this.freeInfos.add(new C156467gg());
            i++;
        } while (i < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    private boolean setRates(int i, int i2) {
        if (!supportUpdateBitrate()) {
            return false;
        }
        try {
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("video-bitrate", i * 1000);
            this.mediaCodec.setParameters(A08);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder setRates failed", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        X.C18300x5.A11();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder "
            r1.append(r0)
            java.lang.String r0 = r11.codecName
            X.C18260x0.A1L(r1, r0)
            java.util.concurrent.CountDownLatch r10 = X.C18290x4.A14()
            r0 = 17
            X.3a3 r2 = new X.3a3
            r2.<init>(r10, r0, r11)
            java.lang.String r1 = "MediaCodecVideoEncoder"
            X.8Rq r0 = new X.8Rq
            r0.<init>(r2, r1)
            r0.start()
            r8 = 5000(0x1388, double:2.4703E-320)
            long r6 = android.os.SystemClock.elapsedRealtime()
            r5 = 0
            r3 = 5000(0x1388, double:2.4703E-320)
            r1 = 0
        L_0x002d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0036 }
            boolean r5 = r10.await(r3, r0)     // Catch:{ InterruptedException -> 0x0036 }
            if (r1 == 0) goto L_0x0047
            goto L_0x0044
        L_0x0036:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            long r3 = r8 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x002d
        L_0x0044:
            X.C18300x5.A11()
        L_0x0047:
            if (r5 != 0) goto L_0x0054
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r0 = codecErrors
            int r0 = r0 + 1
            codecErrors = r0
        L_0x0054:
            r5 = 0
            r11.codecName = r5
            r11.mediaCodec = r5
            r11.mediaCodecThread = r5
            X.7mu r0 = r11.drawer
            if (r0 == 0) goto L_0x0088
            java.util.Map r4 = r0.A00
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r4)
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.next()
            X.7Ii r0 = (X.C148427Ii) r0
            X.7j9 r2 = r0.A01
            java.lang.String r0 = "GlShader Deleting shader."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x0065
            android.opengl.GLES20.glDeleteProgram(r1)
            r2.A00 = r0
            goto L_0x0065
        L_0x0083:
            r4.clear()
            r11.drawer = r5
        L_0x0088:
            X.8fz r0 = r11.eglBase
            if (r0 == 0) goto L_0x0091
            r0.A03()
            r11.eglBase = r5
        L_0x0091:
            android.view.Surface r0 = r11.inputSurface
            if (r0 == 0) goto L_0x009a
            r0.release()
            r11.inputSurface = r5
        L_0x009a:
            runningInstance = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            lastReleaseTimestamp = r0
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.release():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027d, code lost:
        r13.setInteger("profile", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0282, code lost:
        if (r3 < 0) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0284, code lost:
        r13.setInteger("level", r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef A[Catch:{ all -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(X.C141876wH r31, int r32, int r33, int r34, int r35, int r36, X.C1440970a r37) {
        /*
            r30 = this;
            java.lang.String r5 = "video/hevc"
            java.lang.String r6 = "video/avc"
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            java.lang.String r7 = "video/x-vnd.on2.vp8"
            r27 = r37
            boolean r10 = X.AnonymousClass000.A1W(r27)
            r9 = r30
            r0 = r32
            r9.width = r0
            r0 = r33
            r9.height = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: "
            r1.append(r0)
            r12 = r31
            r1.append(r12)
            java.lang.String r0 = " : "
            r1.append(r0)
            int r0 = r9.width
            r1.append(r0)
            java.lang.String r0 = " x "
            r1.append(r0)
            int r0 = r9.height
            r1.append(r0)
            java.lang.String r0 = ". @ "
            r1.append(r0)
            r29 = r34
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = " kbps. Fps: "
            r1.append(r0)
            r28 = r35
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = ". Key frame interval: "
            r1.append(r0)
            r4 = r36
            r1.append(r4)
            java.lang.String r0 = " seconds. Encode from texture : "
            X.C18260x0.A1E(r0, r1, r10)
            java.lang.Thread r0 = r9.mediaCodecThread
            if (r0 != 0) goto L_0x0309
            java.lang.String r18 = "vid_driver.encoder_name"
            java.lang.String r15 = com.whatsapp.voipcalling.Voip.A06(r18)
            long r13 = android.os.SystemClock.uptimeMillis()
            long r0 = lastReleaseTimestamp
            long r13 = r13 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            boolean r3 = X.AnonymousClass001.A1W(r0)
            X.6wH r0 = X.C141876wH.VIDEO_CODEC_VP8     // Catch:{ all -> 0x0301 }
            if (r12 != r0) goto L_0x0095
            if (r15 == 0) goto L_0x0085
            java.lang.String[] r2 = X.C18270x1.A1b(r15)     // Catch:{ all -> 0x0301 }
            goto L_0x0087
        L_0x0085:
            java.lang.String[] r2 = supportedVp8HwCodecPrefixes     // Catch:{ all -> 0x0301 }
        L_0x0087:
            if (r10 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r1 = 0
            goto L_0x008e
        L_0x008c:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0301 }
        L_0x008e:
            r0 = -1
            java.util.List r2 = findHwEncoder(r7, r2, r1, r0, r3)     // Catch:{ all -> 0x0301 }
            r11 = r7
            goto L_0x00eb
        L_0x0095:
            X.6wH r0 = X.C141876wH.VIDEO_CODEC_VP9     // Catch:{ all -> 0x0301 }
            if (r12 != r0) goto L_0x00af
            if (r15 == 0) goto L_0x00a0
            java.lang.String[] r2 = X.C18270x1.A1b(r15)     // Catch:{ all -> 0x0301 }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String[] r2 = supportedVp9HwCodecPrefixes     // Catch:{ all -> 0x0301 }
        L_0x00a2:
            if (r10 == 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r1 = 0
            goto L_0x00a9
        L_0x00a7:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0301 }
        L_0x00a9:
            r0 = -1
            java.util.List r2 = findHwEncoder(r11, r2, r1, r0, r3)     // Catch:{ all -> 0x0301 }
            goto L_0x00eb
        L_0x00af:
            X.6wH r0 = X.C141876wH.VIDEO_CODEC_H264     // Catch:{ all -> 0x0301 }
            r8 = 20
            if (r12 != r0) goto L_0x00cc
            if (r15 == 0) goto L_0x00bc
            java.lang.String[] r2 = X.C18270x1.A1b(r15)     // Catch:{ all -> 0x0301 }
            goto L_0x00be
        L_0x00bc:
            java.lang.String[] r2 = supportedH264HwCodecPrefixes     // Catch:{ all -> 0x0301 }
        L_0x00be:
            if (r10 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r1 = 0
            goto L_0x00c5
        L_0x00c3:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0301 }
        L_0x00c5:
            r0 = -1
            java.util.List r2 = findHwEncoder(r6, r2, r1, r0, r3)     // Catch:{ all -> 0x0301 }
            r11 = r6
            goto L_0x00ed
        L_0x00cc:
            X.6wH r0 = X.C141876wH.VIDEO_CODEC_H265     // Catch:{ all -> 0x0301 }
            if (r12 != r0) goto L_0x00e7
            if (r15 == 0) goto L_0x00d7
            java.lang.String[] r2 = X.C18270x1.A1b(r15)     // Catch:{ all -> 0x0301 }
            goto L_0x00d9
        L_0x00d7:
            java.lang.String[] r2 = supportedH265HwCodecPrefixes     // Catch:{ all -> 0x0301 }
        L_0x00d9:
            if (r10 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r1 = 0
            goto L_0x00e0
        L_0x00de:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0301 }
        L_0x00e0:
            r0 = -1
            java.util.List r2 = findHwEncoder(r5, r2, r1, r0, r3)     // Catch:{ all -> 0x0301 }
            r11 = r5
            goto L_0x00ed
        L_0x00e7:
            r2 = 0
            r11 = 0
            r8 = 0
            goto L_0x00ed
        L_0x00eb:
            r8 = 100
        L_0x00ed:
            if (r36 < 0) goto L_0x00f0
            r8 = r4
        L_0x00f0:
            if (r2 == 0) goto L_0x02f6
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02f6
            runningInstance = r30
            java.util.List r1 = r9.freeInfos
            java.util.Queue r0 = r9.carryAlongInfos
            r1.addAll(r0)
            java.util.Queue r0 = r9.carryAlongInfos
            r0.clear()
            java.util.Iterator r17 = r2.iterator()
        L_0x010a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r7 = r17.next()
            X.7NK r7 = (X.AnonymousClass7NK) r7
            java.lang.String r6 = r7.A02
            r9.codecName = r6
            int r5 = r7.A00
            r9.colorFormat = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: format: 0x"
            X.AnonymousClass000.A1G(r0, r1, r5)
            java.lang.String r0 = " for Encoder: "
            X.C18260x0.A0s(r0, r6, r1)
            java.lang.String r1 = "OMX.google.h264.encoder"
            java.lang.String r0 = r9.codecName
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x013e
            r0 = 320(0x140, float:4.48E-43)
            r9.width = r0
            r0 = 192(0xc0, float:2.69E-43)
            r9.height = r0
        L_0x013e:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r7.A01
            java.lang.String r2 = "samsung"
            if (r1 == 0) goto L_0x02de
            android.util.Range r0 = r1.getSupportedWidths()
            int r25 = X.AnonymousClass6C8.A0C(r0)
            android.util.Range r0 = r1.getSupportedHeights()
            int r26 = X.AnonymousClass6C8.A0C(r0)
        L_0x0154:
            java.lang.String r1 = r9.codecName
            java.lang.String r0 = "OMX.qcom.video.encoder.avc"
            boolean r1 = r1.equals(r0)
            r24 = 16
            if (r1 == 0) goto L_0x0162
            r24 = 32
        L_0x0162:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x016e
            if (r1 == 0) goto L_0x016e
            r24 = 16
        L_0x016e:
            java.lang.String r0 = "vid_driver.encoder_min_width"
            java.lang.Integer r13 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_min_height"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_alignment"
            java.lang.Integer r3 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_profile"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_level"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_hw_h264_maxqp"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r13 == 0) goto L_0x0198
            int r25 = r13.intValue()
        L_0x0198:
            if (r4 == 0) goto L_0x019e
            int r26 = r4.intValue()
        L_0x019e:
            if (r3 == 0) goto L_0x01a4
            int r24 = r3.intValue()
        L_0x01a4:
            if (r2 == 0) goto L_0x02db
            int r4 = r2.intValue()
        L_0x01aa:
            if (r1 == 0) goto L_0x02d8
            int r3 = r1.intValue()
        L_0x01b0:
            if (r0 == 0) goto L_0x02d5
            int r2 = r0.intValue()
        L_0x01b6:
            java.lang.String r15 = r9.codecName
            int r14 = r9.colorFormat
            int r13 = r9.width
            int r1 = r9.height
            r0 = 0
            r19 = r0
            r20 = r15
            r21 = r14
            r22 = r13
            r23 = r1
            X.7hY r14 = X.AnonymousClass8HT.A04(r19, r20, r21, r22, r23, r24, r25, r26)
            int r1 = r14.A09
            r9.width = r1
            int r1 = r14.A06
            r9.height = r1
            int r1 = r14.A00
            r9.colorFormat = r1
            int r1 = r14.A05
            r9.colorId = r1
            java.lang.String r1 = "vid_driver.encoder_frame_converter_color_format"
            java.lang.Integer r16 = com.whatsapp.voipcalling.Voip.A01(r1)
            java.lang.String r13 = com.whatsapp.voipcalling.Voip.A06(r18)
            java.lang.String r1 = "vid_driver.encoder_color_format"
            java.lang.Integer r15 = com.whatsapp.voipcalling.Voip.A01(r1)
            if (r16 == 0) goto L_0x0209
            if (r13 == 0) goto L_0x0209
            if (r15 == 0) goto L_0x0209
            java.lang.String r1 = r9.codecName
            boolean r1 = r1.equalsIgnoreCase(r13)
            if (r1 == 0) goto L_0x0209
            int r13 = r9.colorFormat
            int r1 = r15.intValue()
            if (r13 != r1) goto L_0x0209
            int r1 = r16.intValue()
            r9.colorId = r1
        L_0x0209:
            X.5Xv r1 = r9.voipSharedPreferences
            int r15 = r9.colorId
            android.content.SharedPreferences r1 = r1.A03()
            android.content.SharedPreferences$Editor r13 = r1.edit()
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            X.C18270x1.A0h(r13, r1, r15)
            int r1 = r14.A08
            r16 = r1
            int r14 = r14.A07
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r9.mediaCodecThread = r1
            int r13 = r9.width     // Catch:{ all -> 0x02cd }
            int r1 = r9.height     // Catch:{ all -> 0x02cd }
            android.media.MediaFormat r13 = android.media.MediaFormat.createVideoFormat(r11, r13, r1)     // Catch:{ all -> 0x02cd }
            java.lang.String r15 = "bitrate"
            r1 = r29
            int r1 = r1 * 1000
            r13.setInteger(r15, r1)     // Catch:{ all -> 0x02cd }
            java.lang.String r1 = "color-format"
            r13.setInteger(r1, r5)     // Catch:{ all -> 0x02cd }
            java.lang.String r5 = "frame-rate"
            r1 = r28
            r13.setInteger(r5, r1)     // Catch:{ all -> 0x02cd }
            java.lang.String r1 = "i-frame-interval"
            r13.setInteger(r1, r8)     // Catch:{ all -> 0x02cd }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02cd }
            r1 = 31
            if (r5 < r1) goto L_0x0255
            if (r2 <= 0) goto L_0x0255
            java.lang.String r1 = "video-qp-max"
            r13.setInteger(r1, r2)     // Catch:{ all -> 0x02cd }
        L_0x0255:
            java.lang.String r2 = "stride"
            r1 = r16
            r13.setInteger(r2, r1)     // Catch:{ all -> 0x02cd }
            java.lang.String r1 = "slice-height"
            r13.setInteger(r1, r14)     // Catch:{ all -> 0x02cd }
            if (r4 < 0) goto L_0x0289
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r7.A03     // Catch:{ all -> 0x02cd }
            if (r14 == 0) goto L_0x0289
            int r7 = r14.length     // Catch:{ all -> 0x02cd }
            r5 = 0
        L_0x0269:
            if (r5 >= r7) goto L_0x0289
            r2 = r14[r5]     // Catch:{ all -> 0x02cd }
            int r1 = r2.profile     // Catch:{ all -> 0x02cd }
            if (r1 != r4) goto L_0x027a
            int r2 = r2.level     // Catch:{ all -> 0x02cd }
            if (r2 == r3) goto L_0x027d
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 != r1) goto L_0x027a
            goto L_0x027d
        L_0x027a:
            int r5 = r5 + 1
            goto L_0x0269
        L_0x027d:
            java.lang.String r1 = "profile"
            r13.setInteger(r1, r4)     // Catch:{ all -> 0x02cd }
            if (r3 < 0) goto L_0x0289
            java.lang.String r1 = "level"
            r13.setInteger(r1, r3)     // Catch:{ all -> 0x02cd }
        L_0x0289:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02cd }
            java.lang.String r1 = "MediaCodecVideoEncoder   Format: "
            X.C18260x0.A1R(r2, r1, r13)     // Catch:{ all -> 0x02cd }
            android.media.MediaCodec r2 = createByCodecName(r6)     // Catch:{ all -> 0x02cd }
            r9.mediaCodec = r2     // Catch:{ all -> 0x02cd }
            r9.type = r12     // Catch:{ all -> 0x02cd }
            if (r2 != 0) goto L_0x02a2
            java.lang.String r0 = "MediaCodecVideoEncoder Can not create media encoder"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02cd }
            goto L_0x02f0
        L_0x02a2:
            r1 = 1
            r2.configure(r13, r0, r0, r1)     // Catch:{ all -> 0x02cd }
            if (r10 == 0) goto L_0x02c7
            int[] r2 = X.C158677kN.A01     // Catch:{ all -> 0x02cd }
            X.8fz r1 = new X.8fz     // Catch:{ all -> 0x02cd }
            r0 = r27
            r1.<init>(r0, r2)     // Catch:{ all -> 0x02cd }
            r9.eglBase = r1     // Catch:{ all -> 0x02cd }
            android.media.MediaCodec r0 = r9.mediaCodec     // Catch:{ all -> 0x02cd }
            android.view.Surface r1 = r0.createInputSurface()     // Catch:{ all -> 0x02cd }
            r9.inputSurface = r1     // Catch:{ all -> 0x02cd }
            X.8fz r0 = r9.eglBase     // Catch:{ all -> 0x02cd }
            r0.A06(r1)     // Catch:{ all -> 0x02cd }
            X.7mu r0 = new X.7mu     // Catch:{ all -> 0x02cd }
            r0.<init>()     // Catch:{ all -> 0x02cd }
            r9.drawer = r0     // Catch:{ all -> 0x02cd }
        L_0x02c7:
            android.media.MediaCodec r0 = r9.mediaCodec     // Catch:{ all -> 0x02cd }
            r0.start()     // Catch:{ all -> 0x02cd }
            goto L_0x02f2
        L_0x02cd:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder initEncode failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x010a
        L_0x02d5:
            r2 = -1
            goto L_0x01b6
        L_0x02d8:
            r3 = -1
            goto L_0x01b0
        L_0x02db:
            r4 = -1
            goto L_0x01aa
        L_0x02de:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            r25 = 176(0xb0, float:2.47E-43)
            r26 = 144(0x90, float:2.02E-43)
            if (r0 == 0) goto L_0x0154
            r25 = 160(0xa0, float:2.24E-43)
            r26 = 128(0x80, float:1.794E-43)
            goto L_0x0154
        L_0x02f0:
            r0 = 0
            return r0
        L_0x02f2:
            r0 = 1
            return r0
        L_0x02f4:
            r2 = 0
            return r2
        L_0x02f6:
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCodecVideoEncoder Can not find HW encoder for "
            X.C18260x0.A0r(r0, r11, r1)
            return r2
        L_0x0301:
            r2 = move-exception
            r1 = 0
            java.lang.String r0 = "MediaCodecVideoEncoder Exception in findHwEncoder"
            com.whatsapp.util.Log.e(r0, r2)
            return r1
        L_0x0309:
            java.lang.String r0 = "Forgot to release()?"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.6wH, int, int, int, int, int, X.70a):boolean");
    }
}
