package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbTable;
import org.apache.xml.security.c14n.implementations.SymbMap;
import org.apache.xml.security.signature.XMLSignatureException;
import org.whispersystems.curve25519.JavaCurve25519Provider;

/* renamed from: X.6C9  reason: invalid class name */
public final class AnonymousClass6C9 {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static int A04(float f, float f2) {
        return (int) Math.ceil((double) (f * f2));
    }

    public static int A06(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i == 22) {
            return 1073741824;
        }
        if (i != 23) {
            return 0;
        }
        return 15;
    }

    public static int A0A(int i, int i2, int i3) {
        return Math.min(i3, i - i2);
    }

    public static long A0N(long j, long j2) {
        return Math.abs(j - j2);
    }

    public static C153257aw A0T(Collection collection) {
        return (C153257aw) new ArrayList(collection).get(0);
    }

    public static AnonymousClass303 A0W() {
        return new AnonymousClass303(new AnonymousClass303[0]);
    }

    public static Object A0a() {
        return Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
    }

    public static Object A0b(Class cls, Object obj, Class[] clsArr) {
        return cls.getConstructor(clsArr).newInstance(new Object[]{obj});
    }

    public static String A0g(byte[] bArr, int i) {
        return C162077rB.A02(AnonymousClass35E.A02(bArr, 0, i));
    }

    public static void A0u(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A0x(OutputStream outputStream, int i, int i2) {
        outputStream.write((byte) (i | i2));
    }

    public static void A17(StringBuffer stringBuffer, long j, long j2) {
        stringBuffer.append((int) (j - j2));
    }

    public static void A1F(byte[] bArr, int i) {
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void A1I(byte[] bArr, int i, long j) {
        bArr[28] = (byte) i;
        bArr[29] = (byte) ((int) (j >> 1));
        bArr[30] = (byte) ((int) (j >> 9));
        bArr[31] = (byte) ((int) (j >> 17));
    }

    public static void A1J(float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
    }

    public static void A1K(int[] iArr) {
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static boolean A1L(int i) {
        return i != 0;
    }

    public static boolean A1M(int i) {
        return i == 1;
    }

    public static boolean A1Q(String str) {
        return Log.isLoggable(str, 3);
    }

    public static boolean A1T(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        return false;
    }

    public static int[] A1W() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static Class[] A1Y(Object obj, Object obj2, int i, int i2) {
        Class[] clsArr = new Class[i];
        clsArr[0] = obj;
        clsArr[i2] = obj2;
        return clsArr;
    }

    public static double A02(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static float A03(float f, float f2, int i) {
        if (i != 0) {
            return (f * f2) / 100.0f;
        }
        return f;
    }

    public static int A05(int i) {
        return i != 0 ? 1231 : 1237;
    }

    public static int A08(int i, int i2) {
        return ((i << 28) + (i2 + 112)) >> 30;
    }

    public static int A09(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A0F(byte[] bArr, int i) {
        return (bArr[i] & 255) << 8;
    }

    public static int A0G(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 16);
    }

    public static int A0H(char[] cArr, int i, int i2, int i3, int i4) {
        int i5 = i2 | ((i & 63) << 6) | (i3 & 63);
        cArr[i4] = (char) ((i5 >>> 10) + 55232);
        return i5;
    }

    public static int A0I(int[] iArr, int i, int i2, int i3) {
        return i3 + i2 + iArr[i];
    }

    public static int A0J(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[i];
        return i + 1;
    }

    public static long A0L(int i, long j) {
        return j | ((((long) i) & 255) << 8);
    }

    public static long A0M(long j, long j2) {
        return Math.max(0, Math.min(j, j2));
    }

    public static C186268v1 A0U(Object obj) {
        return C157377iC.A02.A00(obj.getClass());
    }

    public static IndexOutOfBoundsException A0X() {
        return new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public static Long A0Y() {
        return 20L;
    }

    public static String A0c(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0e(String str) {
        if (str.equals("")) {
            return null;
        }
        return str;
    }

    public static StringBuffer A0h(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("No message with ID \"");
        stringBuffer.append(str);
        stringBuffer.append("\" found in resource bundle \"");
        stringBuffer.append("org/apache/xml/security/resource/xmlsecurity");
        return stringBuffer;
    }

    public static StringBuffer A0i(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer;
    }

    public static StringBuilder A0j(char c) {
        StringBuilder sb = new StringBuilder(37);
        sb.append("Failed writing ");
        sb.append(c);
        return sb;
    }

    public static Map A0l(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static C831746k A0m(Object obj) {
        return new C831746k((Throwable) AnonymousClass8PR.A05.get(obj));
    }

    public static NameSpaceSymbEntry A0n(Object obj, NameSpaceSymbTable nameSpaceSymbTable) {
        SymbMap symbMap = nameSpaceSymbTable.a;
        return symbMap.b[symbMap.a(obj)];
    }

    public static XMLSignatureException A0o(Exception exc) {
        return new XMLSignatureException("empty", exc);
    }

    public static short A0q(int i) {
        if (i == 17) {
            return 17;
        }
        if (i == 20) {
            return 20;
        }
        if (i == 23) {
            return 23;
        }
        if (i == 29) {
            return 29;
        }
        if (i == 39) {
            return 39;
        }
        if (i == 42) {
            return 42;
        }
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return -1;
        }
    }

    public static short A0r(int i, int i2, int i3, int i4, int i5) {
        int i6 = (i + 1) * i2;
        int i7 = i6 - i3;
        int i8 = i6 - (i * i2);
        return (short) (((i4 * i7) + ((i8 - i7) * i5)) / i8);
    }

    public static void A0w(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public static void A16(String str, byte[] bArr, int i) {
        int i2 = i * 2;
        bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
    }

    public static void A18(StringBuilder sb, int i, int i2, int i3, int i4) {
        sb.append(": remainingSynchronizationSamples ");
        sb.append(i);
        sb.append(", remainingSamplesAtTimestampDelta ");
        sb.append(i2);
        sb.append(", remainingSamplesInChunk ");
        sb.append(i3);
        sb.append(", remainingTimestampDeltaChanges ");
        sb.append(i4);
        sb.append(", remainingSamplesAtTimestampOffset ");
    }

    public static void A19(StringBuilder sb, String str) {
        sb.append("Field ");
        sb.append(str);
        sb.append(" for ");
    }

    public static void A1B(Throwable th) {
        com.whatsapp.util.Log.e("AutoconfManager/preload/feo2/soft_error", th);
    }

    public static void A1E(Charset charset, List list, byte[] bArr, int i, int i2) {
        list.add(new String(bArr, i, i2, charset));
    }

    public static void A1G(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
    }

    public static void A1H(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i & 127) | 128);
    }

    public static boolean A1P(String str) {
        return str.endsWith("%");
    }

    public static MediaCodecInfo[] A1X(int i) {
        return new MediaCodecList(i).getCodecInfos();
    }

    public static Object[] A1Z(Object obj, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        return objArr;
    }

    public static String[] A1a() {
        return new String[]{"code"};
    }

    public static char A01(String str, StringBuilder sb, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            sb.append("_");
        }
        return charAt;
    }

    public static int A07(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A0B(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static int A0C(long j) {
        return (int) ((j * 48000) / 1000000000);
    }

    public static int A0D(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i2;
        }
        return Integer.reverseBytes(i2);
    }

    public static int A0E(List list) {
        int size = list.size();
        int i = size << 1;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static long A0K(int i) {
        return (long) (i & 1048575);
    }

    public static long A0O(Matcher matcher, int i) {
        return Long.parseLong(matcher.group(i));
    }

    public static long A0P(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A00(bArr, i) >>> i2) & 2097151;
    }

    public static long A0Q(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A01(bArr, i) >>> i2) & 2097151;
    }

    public static Handler A0R(HandlerThread handlerThread) {
        return new Handler(handlerThread.getLooper());
    }

    public static Looper A0S(HandlerThread handlerThread) {
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static AnonymousClass84O A0V(List list, int i) {
        return (AnonymousClass84O) list.get(i);
    }

    public static Long A0Z(File file) {
        return Long.valueOf(file.length());
    }

    public static String A0d(AnonymousClass36K r1, String str, List list) {
        return C626836d.A0A(r1, list, new String[]{str});
    }

    public static String A0f(String str, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static Map A0k(List list, int i) {
        return (Map) list.get(i);
    }

    public static C125126Fq A0p(AbstractList abstractList, int i) {
        return (C125126Fq) abstractList.get(i);
    }

    public static void A0s(Canvas canvas, Path path, AnonymousClass66R r3) {
        canvas.drawPath(path, (Paint) r3.getValue());
    }

    public static void A0t(RectF rectF, RectF rectF2, View view, View view2, FabTransformationBehavior fabTransformationBehavior) {
        fabTransformationBehavior.A0M(rectF, view);
        rectF.offset(fabTransformationBehavior.A00, fabTransformationBehavior.A01);
        fabTransformationBehavior.A0M(rectF2, view2);
    }

    public static void A0v(View view, BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.A0U(view.getHeight(), false);
        bottomSheetBehavior.A0S(3);
        bottomSheetBehavior.A0p = true;
    }

    public static void A0y(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A0z(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 5;
    }

    public static void A10(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 6;
    }

    public static void A11(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 7;
    }

    public static void A12(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A13(String str, String str2, String str3) {
        Log.w(str3, str.concat(str2));
    }

    public static void A14(String str, String str2, String str3) {
        Log.e(str3, str.concat(str2));
    }

    public static void A15(String str, String str2, Throwable th, Object[] objArr) {
        Log.e(str2, String.format(str, objArr), th);
    }

    public static void A1A(StringBuilder sb, C185768uD r2) {
        sb.append(r2.B4N());
    }

    public static void A1C(Throwable th, Object[] objArr, int i) {
        objArr[i] = th.getMessage();
    }

    public static void A1D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer2.put(byteBuffer.get(i));
    }

    public static boolean A1N(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }

    public static boolean A1O(Object obj, List list, int i) {
        return obj.equals(list.get(i));
    }

    public static boolean A1R(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean A1S(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
        return false;
    }

    public static byte[] A1U(String str, Random random) {
        byte[] bArr = new byte[Cipher.getInstance(str).getBlockSize()];
        random.nextBytes(bArr);
        return bArr;
    }

    public static byte[] A1V(List list, int i) {
        return (byte[]) list.get(i);
    }

    public static String[] A1b(AnonymousClass36K r0, String str) {
        AnonymousClass36K.A0N(r0, str);
        return new String[]{"jid"};
    }
}
