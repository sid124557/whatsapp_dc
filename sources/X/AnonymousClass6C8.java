package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.exoplayer2.Timeline;
import com.whatsapp.Mp4Ops;
import java.security.Key;
import java.security.spec.MGF1ParameterSpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.transforms.TransformationException;
import org.w3c.dom.Node;
import org.wawebrtc.MediaCodecVideoEncoder;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.6C8  reason: invalid class name */
public final class AnonymousClass6C8 {
    public static float A00(float f, float f2, float f3) {
        float f4 = f - f2;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    public static float A01(int i, int i2, int i3) {
        return ((float) (i - i2)) - (((float) i3) / 2.0f);
    }

    public static int A06(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static int A0A(int i, int i2, int i3, int i4) {
        int i5 = (i - i2) - 1;
        return (((i3 >> i5) & 1) << 1) + ((i4 >> i5) & 1);
    }

    public static long A0M(int i) {
        return ((long) i) & 4294967295L;
    }

    public static long A0N(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    public static long A0Q(long j, long j2) {
        return Math.max(0, j - j2);
    }

    public static Object A0c(Class cls) {
        return cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{false});
    }

    public static Object A0d(Class cls) {
        return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Map A0l(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public static CanonicalizationException A0o(Node node, Object[] objArr) {
        objArr[2] = node.getNodeValue();
        return new CanonicalizationException("c14n.Canonicalizer.RelativeNamespace", objArr);
    }

    public static XMLSignatureException A0p(Throwable th, Object[] objArr) {
        objArr[1] = th.getLocalizedMessage();
        return new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr);
    }

    public static TransformationException A0q(Exception exc) {
        return new TransformationException("generic.EmptyMessage", new Object[]{exc.getMessage()}, exc);
    }

    public static void A0u(int i, byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i | i2);
    }

    public static void A0z(C162997t6 r1, String str) {
        r1.A0J(str, new Object[0]);
    }

    public static void A15(Class cls, Object obj) {
        cls.getMethod("getInt", new Class[]{obj});
        cls.getMethod("putInt", new Class[]{obj, Integer.TYPE});
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
    }

    public static void A1H(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static boolean A1P(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1U(String str, int[] iArr, String[] strArr) {
        return MediaCodecVideoEncoder.findHwEncoder(str, strArr, iArr, -1, false) != null;
    }

    public static String[] A1a(AnonymousClass36K r8, Long l, Long l2) {
        AnonymousClass36K r1 = r8;
        C626836d.A06(r1, Long.class, l, l2, 406L, new String[]{"code"}, false);
        return new String[]{"field"};
    }

    public static float A02(float[] fArr, int i) {
        float f = fArr[i];
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        return f;
    }

    public static float A03(int[] iArr, float f, int i) {
        return Math.abs(f - ((float) iArr[i]));
    }

    public static int A04(int i) {
        return (527 + i) * 31;
    }

    public static int A07(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A08(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int A0B(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A0F(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int A0G(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 8);
    }

    public static int A0H(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) ((i2 >>> 12) | 480);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((i2 >>> 6) & 63) | 128);
        return i4;
    }

    public static int A0I(byte[] bArr, int i, int i2, int i3, int i4) {
        return (-1 >>> (32 - i4)) & (i3 | ((bArr[i] & 255) >> (8 - i2)));
    }

    public static int A0J(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i + 1;
        bArr2[i] = bArr[(i2 >> 6) & 63];
        int i4 = i3 + 1;
        bArr2[i3] = bArr[i2 & 63];
        return i4;
    }

    public static long A0O(int i, long j) {
        return j | ((((long) i) & 255) << 16);
    }

    public static long A0P(long j, long j2) {
        return Math.min(j2, j - 1);
    }

    public static long A0R(Pair pair) {
        return ((Number) pair.second).longValue();
    }

    public static long A0T(int[] iArr, int i) {
        return (long) (iArr[i + 1] & 1048575);
    }

    public static AudioFormat A0U(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static C166617yz A0V(C166607yy r0, int i) {
        return (C166617yz) r0.A02.get(i);
    }

    public static C166537yr A0W(C162997t6 r0) {
        return (C166537yr) r0.A08.get();
    }

    public static C158647kK A0X(C158647kK r2, Timeline timeline, int i) {
        return timeline.A0B(r2, i, 0);
    }

    public static C186258v0 A0Y(Object obj) {
        return C157367iB.A02.A00(obj.getClass());
    }

    public static Double A0Z() {
        return Double.valueOf(0.0d);
    }

    public static StringBuilder A0g(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    public static Locale A0k(String str) {
        String[] split = str.split("_");
        Locale locale = new Locale(str);
        if (split.length == 2) {
            return new Locale(split[0], split[1]);
        }
        return locale;
    }

    public static SecretKey A0n() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    public static short A0r(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static short A0s(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i == 122) {
            return 32;
        }
        if (i != 244) {
            return -1;
        }
        return 64;
    }

    public static void A0t(int i, int i2, int[] iArr, int[] iArr2) {
        iArr2[i] = i2 + iArr[i];
    }

    public static void A0x(SparseIntArray sparseIntArray) {
        sparseIntArray.put(10241, 9729);
        sparseIntArray.put(10240, 9729);
        sparseIntArray.put(10242, 33071);
        sparseIntArray.put(10243, 33071);
    }

    public static void A10(Mp4Ops.VideoStreamInfo videoStreamInfo, C134206ic r3) {
        if (videoStreamInfo != null) {
            r3.A0F = Long.valueOf((long) videoStreamInfo.averageBitrateKbps);
            r3.A0G = Long.valueOf((long) videoStreamInfo.framesPerKseconds);
            r3.A0H = Long.valueOf((long) videoStreamInfo.height);
            r3.A0I = Long.valueOf((long) videoStreamInfo.levelIdc);
            r3.A0J = Long.valueOf((long) videoStreamInfo.profileIdc);
            r3.A0K = Long.valueOf((long) videoStreamInfo.rotationDegrees);
            r3.A0L = 2L;
            r3.A05 = Integer.valueOf(videoStreamInfo.type);
            r3.A0M = Long.valueOf((long) videoStreamInfo.width);
        }
    }

    public static void A11(C134246ig r1, AnonymousClass303 r2) {
        if (r2 != null && r2.A01.length() > 0) {
            r1.A0Z = r2.toString();
        }
    }

    public static void A14(Appendable appendable, int i) {
        appendable.append("0123456789ABCDEF".charAt(i & 15));
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
    }

    public static void A1I(byte[] bArr, int i, long j) {
        bArr[i - 4] = (byte) ((int) (j & 255));
        bArr[i - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    public static void A1J(byte[] bArr, byte[] bArr2, int i) {
        bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
    }

    public static void A1K(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        byte b = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16) | (bArr[i + 2] & 255);
        bArr3[i2] = bArr2[(b >> 18) & 63];
        bArr3[i2 + 1] = bArr2[(b >> 12) & 63];
        bArr3[i2 + 2] = bArr2[(b >> 6) & 63];
        bArr3[i2 + 3] = bArr2[b & 63];
    }

    public static void A1L(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void A1M(int[][] iArr, int i, int i2, int i3) {
        int[] iArr2 = iArr[i];
        int i4 = iArr2[i2];
        int i5 = ((i4 << i3) | (i4 >>> 8)) ^ i4;
        int i6 = i4 ^ ((((-2139062144 & i5) >>> 7) * 27) ^ ((2139062143 & i5) << 1));
        int i7 = i6 & -1061109568;
        int i8 = i7 ^ (i7 >>> 1);
        int i9 = i5 ^ ((i8 >>> 5) ^ (((1061109567 & i6) << 2) ^ (i8 >>> 2)));
        iArr2[i2] = i6 ^ (i9 ^ ((i9 << (-16)) | (i9 >>> 16)));
    }

    public static boolean A1N() {
        return C162477s9.A01.BI0(6);
    }

    public static boolean A1O(int i) {
        if ((i & 7) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1S(Appendable appendable, boolean z) {
        if (!z) {
            return true;
        }
        appendable.append(',');
        return z;
    }

    public static byte[] A1V(Key key, byte[] bArr) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
        instance.init(1, key, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        return instance.doFinal(bArr);
    }

    public static double[] A1W(Object obj, int i, int i2) {
        double[] dArr = new double[((i / 2) + 1)];
        System.arraycopy(obj, 0, dArr, 0, i2);
        return dArr;
    }

    public static float[] A1X(Object obj, int i, int i2) {
        float[] fArr = new float[((i / 2) + 1)];
        System.arraycopy(obj, 0, fArr, 0, i2);
        return fArr;
    }

    public static int[] A1Y(Object obj, int i, int i2) {
        int[] iArr = new int[((i / 2) + 1)];
        System.arraycopy(obj, 0, iArr, 0, i2);
        return iArr;
    }

    public static long[] A1Z(Object obj, int i, int i2) {
        long[] jArr = new long[((i / 2) + 1)];
        System.arraycopy(obj, 0, jArr, 0, i2);
        return jArr;
    }

    public static boolean[] A1b(Object obj, int i, int i2) {
        boolean[] zArr = new boolean[((i / 2) + 1)];
        System.arraycopy(obj, 0, zArr, 0, i2);
        return zArr;
    }

    public static int A05(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                            default:
                                switch (i) {
                                    case 40:
                                        return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                                    case 41:
                                        return ZipDecompressor.UNZIP_BUFFER_SIZE;
                                    case 42:
                                        return DefaultCrypto.BUFFER_SIZE;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int A09(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            case 11:
                return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            case 12:
                return ZipDecompressor.UNZIP_BUFFER_SIZE;
            case 13:
                return DefaultCrypto.BUFFER_SIZE;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return AnonymousClass35S.A0F;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int A0C(Range range) {
        return ((Number) range.getLower()).intValue();
    }

    public static int A0D(Object obj, AbstractMap abstractMap) {
        return ((Number) abstractMap.get(obj)).intValue();
    }

    public static int A0E(List list, int i) {
        return Float.floatToRawIntBits(((Number) list.get(i)).floatValue());
    }

    public static long A0K() {
        return Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    }

    public static long A0L() {
        return SystemClock.elapsedRealtime() * 1000;
    }

    public static long A0S(List list, int i) {
        return Double.doubleToRawLongBits(((Number) list.get(i)).doubleValue());
    }

    public static Integer A0a(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 19;
    }

    public static Object A0b(AnonymousClass36K r1, AnonymousClass4B7 r2, String str) {
        return C626836d.A04(r1, r2, new String[]{str});
    }

    public static String A0e(C185628tz r1) {
        if (r1.Bgh().BID()) {
            return null;
        }
        return r1.Bgh().BqG();
    }

    public static String A0f(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return group;
    }

    public static Throwable A0h(Throwable th) {
        if (th.getCause() != null) {
            return th.getCause();
        }
        return th;
    }

    public static ArrayList A0i(List list, int i) {
        return new ArrayList(list.size() + i);
    }

    public static List A0j(String str, String str2) {
        return Arrays.asList(new String[]{str, str2});
    }

    public static Logger A0m(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A0v(RectF rectF, Drawable drawable) {
        rectF.set(drawable.getBounds());
    }

    public static void A0w(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A0y(View view, Object[] objArr, int i, int i2) {
        objArr[i2] = view.findViewById(i);
    }

    public static void A12(AnonymousClass36K r1, String str, String str2, List list) {
        C626836d.A0A(r1, list, new String[]{str, str2});
    }

    public static void A13(AnonymousClass36K r1, String str, List list) {
        C626836d.A0A(r1, list, new String[]{str});
    }

    public static void A16(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 3;
    }

    public static void A17(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 4;
    }

    public static void A1A(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = Pair.create(obj, obj2);
    }

    public static void A1B(String str, String str2, Object[] objArr) {
        Log.w(str2, String.format(str, objArr));
    }

    public static void A1C(String str, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
    }

    public static void A1D(String str, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i - i2);
    }

    public static void A1E(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", description=");
    }

    public static void A1F(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A1G(List list, long j) {
        list.add(Long.valueOf(j));
    }

    public static boolean A1Q(IBinder iBinder, Parcel parcel) {
        parcel.writeStrongBinder(iBinder);
        parcel.writeInt(1);
        return false;
    }

    public static boolean A1R(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.A0F(view, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static boolean A1T(Object obj, XmlPullParser xmlPullParser) {
        return xmlPullParser.getName().equals(obj);
    }
}
