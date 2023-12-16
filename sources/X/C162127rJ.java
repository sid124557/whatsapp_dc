package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7rJ  reason: invalid class name and case insensitive filesystem */
public class C162127rJ {
    public static final List A01;
    public static final Map A02;
    public static final Set A03;
    public static final Set A04;
    public static final Set A05;
    public static final Set A06;
    public C154807dm A00 = C154807dm.A00;

    public static C153037aZ A01(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface) {
        MediaCodec mediaCodec2 = mediaCodec;
        if (mediaCodec.getName().equals("OMX.Exynos.avc.dec") && Build.VERSION.SDK_INT >= 31) {
            mediaFormat.removeKey("color-range");
        }
        Class<C162127rJ> cls = C162127rJ.class;
        try {
            String name = mediaCodec.getName();
            if (C162477s9.A01.BI0(3)) {
                C162477s9.A02(cls, StringFormatUtil.formatStrLocaleSafe("config video decoder (%s) with format: %s", name, mediaFormat));
            }
            String str = null;
            boolean z = false;
            mediaCodec2.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            try {
                Locale locale = Locale.US;
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = A04(mediaCodec2, mediaFormat);
                A0M[1] = mediaFormat;
                str = String.format(locale, "media codec:%s, format:%s", A0M);
            } catch (Throwable unused) {
            }
            if (surface != null) {
                z = true;
            }
            return new C153037aZ(mediaCodec2, (Surface) null, C142306wz.DECODER, str, z);
        } catch (IllegalStateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("codec name:");
            throw new IllegalStateException(AnonymousClass000.A0X(mediaCodec2.getName(), A0o), e);
        }
    }

    public static C153037aZ A02(MediaFormat mediaFormat, C141286vK r13, String str, String str2) {
        String str3;
        String str4;
        if (str.equals(C142616xU.CODEC_VIDEO_H264.value) || str.equals(C142616xU.CODEC_VIDEO_HEVC.value) || str.equals(C142616xU.CODEC_VIDEO_AV1.value) || str.equals(C142616xU.CODEC_AUDIO_AAC.value) || str.equals(C142616xU.CODEC_ANDROID_AUDIO_AAC.value)) {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                C141286vK r4 = C141286vK.SURFACE;
                Surface surface = null;
                Class<C162127rJ> cls = C162127rJ.class;
                String name = mediaCodec.getName();
                if (C162477s9.A01.BI0(3)) {
                    C162477s9.A02(cls, StringFormatUtil.formatStrLocaleSafe("config video encoder (%s) with format: %s", name, mediaFormat));
                }
                mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                try {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = A04(mediaCodec, mediaFormat);
                    C18300x5.A1K(mediaFormat, r13, objArr);
                    str4 = String.format(locale, "media codec:%s, format:%s, input type:%s", objArr);
                } catch (Throwable unused) {
                    str4 = null;
                }
                if (r13 == r4) {
                    surface = mediaCodec.createInputSurface();
                }
                return new C153037aZ(mediaCodec, surface, C142306wz.ENCODER, str4, false);
            } catch (Exception e) {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[6];
                String str5 = "null";
                if (mediaCodec != null) {
                    str3 = A04(mediaCodec, mediaFormat);
                } else {
                    str3 = str5;
                }
                C18260x0.A0i(str3, mediaFormat, r13, objArr2);
                objArr2[3] = str;
                if (e instanceof MediaCodec.CodecException) {
                    str5 = C159297la.A00((MediaCodec.CodecException) e);
                }
                objArr2[4] = str5;
                objArr2[5] = str2;
                throw new AnonymousClass6O1(String.format(locale2, "media codec:%s, format:%s, input type:%s, mimeType:%s, mediaCodecException:%s, debugInfo:", objArr2), e);
            }
        } else {
            throw new AnonymousClass6O0(AnonymousClass000.A0V("Unsupported codec for ", str, AnonymousClass001.A0o()));
        }
    }

    public static boolean A05(String str) {
        if (str.equals(C142616xU.CODEC_VIDEO_H264.value) || str.equals(C142616xU.CODEC_VIDEO_HEVC.value) || str.equals(C142616xU.CODEC_VIDEO_AV1.value) || str.equals(C142616xU.CODEC_VIDEO_H263.value) || str.equals(C142616xU.CODEC_VIDEO_MPEG4.value) || str.equals(C142616xU.CODEC_VIDEO_VP8.value) || str.equals(C142616xU.CODEC_FFMPEG_VIDEO_MPEG4.value)) {
            return true;
        }
        return false;
    }

    static {
        HashSet A0K = AnonymousClass002.A0K();
        A04 = A0K;
        A0K.add("OMX.ittiam.video.encoder.avc");
        A0K.add("OMX.Exynos.avc.enc");
        HashMap A0t = AnonymousClass001.A0t();
        A02 = A0t;
        A0t.put("OMX.qcom.video.encoder.avc", 21);
        HashSet A0K2 = AnonymousClass002.A0K();
        A06 = A0K2;
        A0K2.add("OMX.qcom.video.decoder.avc");
        HashSet A0K3 = AnonymousClass002.A0K();
        A03 = A0K3;
        A0K3.add("OMX.ittiam.video.decoder.avc");
        A0K3.add("OMX.Exynos.AVC.Decoder");
        HashSet A0K4 = AnonymousClass002.A0K();
        A05 = A0K4;
        A0K4.add("GT-S6812i");
        A0K4.add("GT-I8552");
        A0K4.add("GT-I8552B");
        A0K4.add("GT-I8262B");
        ArrayList A0s = AnonymousClass001.A0s();
        A01 = A0s;
        A0s.add("OMX.SEC.AVC.Encoder");
        A0s.add("OMX.SEC.avc.enc");
    }

    public static final int A00(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    public static final AnonymousClass7B7 A03(String str, List list) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(str)) {
                String name = codecInfoAt.getName();
                if (!A03.contains(name) && (list == null || list.isEmpty() || !list.contains(name))) {
                    return new AnonymousClass7B7(name);
                }
            }
        }
        return null;
    }

    public static String A04(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        int[] iArr;
        boolean z2;
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("name=");
        C18270x1.A1C(codecInfo.getName(), A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(" is encoder=");
        A0o3.append(codecInfo.isEncoder());
        AnonymousClass000.A1B(A0o3, A0o);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append(" supported types=");
        C18270x1.A1C(Arrays.toString(codecInfo.getSupportedTypes()), A0o4, A0o);
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append(" is vendor=");
            A0o5.append(codecInfo.isVendor());
            AnonymousClass000.A1B(A0o5, A0o);
            StringBuilder A0o6 = AnonymousClass001.A0o();
            A0o6.append(" is alias=");
            A0o6.append(codecInfo.isAlias());
            AnonymousClass000.A1B(A0o6, A0o);
            StringBuilder A0o7 = AnonymousClass001.A0o();
            A0o7.append(" is software only=");
            A0o7.append(codecInfo.isSoftwareOnly());
            AnonymousClass000.A1B(A0o7, A0o);
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(mediaFormat.getString("mime"));
        int A002 = A00(mediaFormat, "color-format");
        if (A002 > 0 && (iArr = capabilitiesForType.colorFormats) != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (iArr[i2] == A002) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            StringBuilder A0o8 = AnonymousClass001.A0o();
            A0o8.append(" color format supported=");
            A0o8.append(z2);
            AnonymousClass000.A1B(A0o8, A0o);
        }
        int i3 = Build.VERSION.SDK_INT;
        int A003 = A00(mediaFormat, "profile");
        if (i3 >= 23) {
            i = A00(mediaFormat, "level");
        } else {
            i = -1;
        }
        StringBuilder A0o9 = AnonymousClass001.A0o();
        A0o9.append(" Checking for profile=");
        A0o9.append(A003);
        A0o.append(AnonymousClass000.A0Y(" level=", A0o9, i));
        if (A003 > 0 && i > 0 && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
            int length2 = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    z = false;
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i4];
                StringBuilder A0o10 = AnonymousClass001.A0o();
                A0o10.append(" codecProfileLevel.profile=");
                int i5 = codecProfileLevel.profile;
                A0o10.append(i5);
                A0o10.append(" codecProfileLevel.level=");
                A0o10.append(codecProfileLevel.level);
                AnonymousClass000.A1B(A0o10, A0o);
                if (i5 == A003 && codecProfileLevel.level == i) {
                    z = true;
                    break;
                }
                i4++;
            }
            StringBuilder A0o11 = AnonymousClass001.A0o();
            A0o11.append(" profile level supported=");
            A0o11.append(z);
            AnonymousClass000.A1B(A0o11, A0o);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        int A004 = A00(mediaFormat, "width");
        int A005 = A00(mediaFormat, "height");
        boolean isSizeSupported = videoCapabilities.isSizeSupported(A004, A005);
        StringBuilder A0o12 = AnonymousClass001.A0o();
        A0o12.append(" size supported=");
        A0o12.append(isSizeSupported);
        AnonymousClass000.A1B(A0o12, A0o);
        if (isSizeSupported) {
            double A006 = (double) A00(mediaFormat, "frame-rate");
            if (A006 > 0.0d) {
                StringBuilder A0o13 = AnonymousClass001.A0o();
                A0o13.append(" frame rate supported=");
                A0o13.append(videoCapabilities.getSupportedFrameRatesFor(A004, A005).contains(Double.valueOf(A006)));
                AnonymousClass000.A1B(A0o13, A0o);
            }
        }
        StringBuilder A0o14 = AnonymousClass001.A0o();
        A0o14.append(" width alignment=");
        A0o14.append(videoCapabilities.getWidthAlignment());
        AnonymousClass000.A1B(A0o14, A0o);
        StringBuilder A0o15 = AnonymousClass001.A0o();
        A0o15.append(" height alignment=");
        A0o15.append(videoCapabilities.getHeightAlignment());
        AnonymousClass000.A1B(A0o15, A0o);
        int A007 = A00(mediaFormat, "bitrate");
        if (A007 > 0) {
            StringBuilder A0o16 = AnonymousClass001.A0o();
            A0o16.append(" bitrate supported=");
            A0o16.append(videoCapabilities.getBitrateRange().contains(Integer.valueOf(A007)));
            AnonymousClass000.A1B(A0o16, A0o);
        }
        int A008 = A00(mediaFormat, "bitrate-mode");
        if (A008 > 0) {
            StringBuilder A0o17 = AnonymousClass001.A0o();
            A0o17.append(" bitrate mode supported=");
            A0o17.append(encoderCapabilities.isBitrateModeSupported(A008));
            AnonymousClass000.A1B(A0o17, A0o);
        }
        return AnonymousClass000.A0X(String.format(Locale.US, " supported widths=[%d, %d] supported heights=[%d, %d] supported bitrate=[%d, %d]", new Object[]{videoCapabilities.getSupportedWidths().getLower(), videoCapabilities.getSupportedWidths().getUpper(), videoCapabilities.getSupportedHeights().getLower(), videoCapabilities.getSupportedHeights().getUpper(), videoCapabilities.getBitrateRange().getLower(), videoCapabilities.getBitrateRange().getUpper()}), A0o);
    }
}
