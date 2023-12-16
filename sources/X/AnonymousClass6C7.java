package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Range;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import java.io.File;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6C7  reason: invalid class name */
public final class AnonymousClass6C7 {
    public static int A0E(byte[] bArr, int i, int i2, int i3) {
        int i4 = i3 + 1;
        return (bArr[i4 + 1] & 255) | i | i2 | ((bArr[i4] & 255) << 8);
    }

    public static long A0F(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static long A0G(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static long A0H(long j, long j2) {
        return (j * j2) / SearchActionVerificationClientService.MS_TO_NS;
    }

    public static Object A0Z() {
        return Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static Object A0a(C150587Rj r3, Object obj, int i) {
        if (i != 0) {
            String str = (String) obj;
            if (C175738Zn.A0Y(str, "$.", false)) {
                return r3.A00(str);
            }
        }
        return obj;
    }

    public static Object A0b(AnonymousClass36K r7, Class cls, String[] strArr) {
        return C626836d.A06(r7, cls, 0L, 9007199254740991L, (Object) null, strArr, false);
    }

    public static Object A0c(AnonymousClass36K r7, Class cls, String[] strArr) {
        return C626836d.A06(r7, cls, -9007199254740991L, 9007199254740991L, (Object) null, strArr, false);
    }

    public static String A0i(String str) {
        return String.valueOf(str.substring(0, 1).toLowerCase());
    }

    public static StringBuilder A0p(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        return sb;
    }

    public static void A0x(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((int) (j >> i));
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
        objArr[4] = obj3;
    }

    public static void A1L(StringBuilder sb, int i) {
        sb.append(new String(new int[]{i}, 0, 1));
    }

    public static void A1S(XMLSignatureInput xMLSignatureInput) {
        xMLSignatureInput.b = null;
        xMLSignatureInput.c = null;
        xMLSignatureInput.d = null;
        xMLSignatureInput.e = null;
        xMLSignatureInput.f = false;
        xMLSignatureInput.g = false;
        xMLSignatureInput.h = null;
        xMLSignatureInput.m = null;
        xMLSignatureInput.n = null;
        xMLSignatureInput.i = new ArrayList();
        xMLSignatureInput.j = false;
        xMLSignatureInput.k = null;
    }

    public static void A1U(Object[] objArr, int i, int i2) {
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
    }

    public static boolean A1X(Class cls) {
        cls.getMethod("objectFieldOffset", new Class[]{Field.class});
        Class<Class> cls2 = Class.class;
        cls.getMethod("arrayBaseOffset", new Class[]{cls2});
        cls.getMethod("arrayIndexScale", new Class[]{cls2});
        return true;
    }

    public static boolean A1Y(Class cls, Object obj) {
        Class<byte[]> cls2 = byte[].class;
        Class cls3 = Boolean.TYPE;
        cls.getMethod("peekLong", new Class[]{obj, cls3});
        cls.getMethod("pokeLong", new Class[]{obj, Long.TYPE, cls3});
        Class cls4 = Integer.TYPE;
        cls.getMethod("pokeInt", new Class[]{obj, cls4, cls3});
        cls.getMethod("peekInt", new Class[]{obj, cls3});
        cls.getMethod("pokeByte", new Class[]{obj, Byte.TYPE});
        cls.getMethod("peekByte", new Class[]{obj});
        cls.getMethod("pokeByteArray", new Class[]{obj, cls2, cls4, cls4});
        cls.getMethod("peekByteArray", new Class[]{obj, cls2, cls4, cls4});
        return true;
    }

    public static int A00(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int A01(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((255 & i3) << i4) | (i2 & (~(255 << i4)));
    }

    public static int A02(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }

    public static int A03(int i, long j) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A04(int i, long j) {
        return i >>> ((int) ((j & 3) << 3));
    }

    public static int A07(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
        return (i & 7) + 48;
    }

    public static int A0A(byte[] bArr, char c, char c2, int i) {
        int codePoint = Character.toCodePoint(c, c2);
        int i2 = i + 1;
        bArr[i] = (byte) ((codePoint >>> 18) | 240);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((codePoint >>> 12) & 63) | 128);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((codePoint >>> 6) & 63) | 128);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((codePoint & 63) | 128);
        return i5;
    }

    public static int A0B(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int A0C(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static int A0D(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >> 16);
        return i5;
    }

    public static long A0L(byte[] bArr, int i) {
        return (((long) bArr[i + 2]) << 16) & 16711680;
    }

    public static long A0M(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A0N(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static long A0O(int[] iArr, int i) {
        return (long) (iArr[i + 2] & 1048575);
    }

    public static C186358vA A0R(Object obj) {
        return C157387iD.A02.A00(obj.getClass());
    }

    public static IndexOutOfBoundsException A0X(int i, int i2) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return new IndexOutOfBoundsException(sb.toString());
    }

    public static RuntimeException A0f(String str, StringBuilder sb, Throwable th) {
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return new RuntimeException(sb.toString(), th);
    }

    public static String A0k(String str, String str2, int i) {
        if (i != 0) {
            return str.concat(str2);
        }
        return new String(str);
    }

    public static String A0m(String str, JSONArray jSONArray, int i) {
        return ((JSONObject) jSONArray.get(i)).optString(str, "");
    }

    public static StringBuilder A0n(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        return sb;
    }

    public static Throwable A0r(Throwable th) {
        return new NoClassDefFoundError().initCause(th);
    }

    public static Iterator A0u(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static Set A0v(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static short A0w(short[] sArr, int i, int i2, int i3, int i4) {
        return (short) (((sArr[i] * (i2 - i3)) + (sArr[i4] * i3)) / i2);
    }

    public static void A0z(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A12(Writer writer, StringBuilder sb) {
        sb.append(10);
        writer.write(sb.toString());
    }

    public static void A15(Object obj, int i, int i2) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A16(Object obj, int i, int i2) {
        System.arraycopy(obj, i, obj, i + 1, i2 - i);
    }

    public static void A17(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[31] = obj;
        objArr[32] = obj2;
        objArr[33] = obj3;
        objArr[34] = obj4;
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[43] = obj;
        objArr[44] = obj2;
        objArr[45] = obj3;
        objArr[46] = obj4;
    }

    public static void A1C(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA384WITHRSA");
        abstractMap.put(C186938wB.A2G, "SHA512WITHRSA");
        abstractMap.put(C186878w5.A0M, "GOST3411WITHGOST3410");
        abstractMap.put(C186878w5.A0L, "GOST3411WITHECGOST3410");
        abstractMap.put(C186818vz.A0H, "GOST3411-2012-256WITHECGOST3410-2012-256");
        abstractMap.put(C186818vz.A0I, "GOST3411-2012-512WITHECGOST3410-2012-512");
        abstractMap.put(C186828w0.A03, "SHA1WITHPLAIN-ECDSA");
        abstractMap.put(C186828w0.A04, "SHA224WITHPLAIN-ECDSA");
        abstractMap.put(C186828w0.A05, "SHA256WITHPLAIN-ECDSA");
        abstractMap.put(C186828w0.A06, "SHA384WITHPLAIN-ECDSA");
        abstractMap.put(C186828w0.A07, "SHA512WITHPLAIN-ECDSA");
        abstractMap.put(C186828w0.A02, "RIPEMD160WITHPLAIN-ECDSA");
        abstractMap.put(C186838w1.A0C, "SHA1WITHCVC-ECDSA");
        abstractMap.put(C186838w1.A0D, "SHA224WITHCVC-ECDSA");
        abstractMap.put(C186838w1.A0E, "SHA256WITHCVC-ECDSA");
        abstractMap.put(C186838w1.A0F, "SHA384WITHCVC-ECDSA");
    }

    public static void A1E(Object obj, Object[] objArr, int i, int i2, int i3) {
        objArr[i] = obj;
        objArr[i2] = obj;
        objArr[i3] = obj;
    }

    public static void A1M(StringBuilder sb, String str) {
        if (!str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
    }

    public static void A1P(Method method, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(method.getName(), method);
        if (method.getParameterTypes().length == 0) {
            abstractMap2.put(method.getName(), method);
            if (method.getName().startsWith("get")) {
                abstractCollection.add(method.getName());
            }
        }
    }

    public static void A1Q(AbstractCollection abstractCollection) {
        abstractCollection.remove(AnonymousClass7sA.A08);
        abstractCollection.remove(AnonymousClass7sA.A03);
        abstractCollection.remove(AnonymousClass7sA.A0B);
        abstractCollection.remove(AnonymousClass7sA.A06);
        abstractCollection.remove(AnonymousClass7sA.A07);
        abstractCollection.remove(AnonymousClass7sA.A05);
        abstractCollection.remove(AnonymousClass7sA.A0A);
        abstractCollection.remove(AnonymousClass7sA.A02);
        abstractCollection.remove(AnonymousClass7sA.A0C);
        abstractCollection.remove(AnonymousClass7sA.A09);
    }

    public static void A1R(C175778Zr r2) {
        int i;
        int addAndGet = C175778Zr.A01.addAndGet(r2, -65536);
        if (r2 instanceof C175758Zp) {
            i = AnonymousClass79Y.A01;
        } else {
            i = C1462879o.A01;
        }
        if (addAndGet == i && r2.A00() != null) {
            r2.A02();
        }
    }

    public static void A1T(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr2[i3] = (byte) (i2 ^ bArr[i]);
    }

    public static byte[] A1a(long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong(j);
        return order.array();
    }

    public static int A05(Range range) {
        return ((Number) range.getUpper()).intValue();
    }

    public static int A06(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A08(ByteBuffer byteBuffer, int i, int i2) {
        return Float.floatToIntBits((float) (((double) (i2 | ((byteBuffer.get(i) & 255) << 24))) * 4.656612875245797E-10d));
    }

    public static int A09(CertPath certPath, int i, int i2) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        if (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) || i2 == 0) {
            return i2;
        }
        return i2 - 1;
    }

    public static long A0I(List list, int i) {
        return ByteBuffer.wrap((byte[]) list.get(i)).order(ByteOrder.nativeOrder()).getLong();
    }

    public static long A0J(List list, int i) {
        long longValue = ((Number) list.get(i)).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static long A0K(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static Point A0P(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static Parcelable A0Q(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static File A0S(String str, StringBuilder sb) {
        sb.append(str);
        return new File(sb.toString());
    }

    public static ArrayIndexOutOfBoundsException A0T(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static IllegalArgumentException A0U(Object obj) {
        return new IllegalArgumentException(String.valueOf(obj));
    }

    public static IllegalArgumentException A0V(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0W(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IndexOutOfBoundsException A0Y(StringBuilder sb, int i) {
        sb.append(i);
        return new IndexOutOfBoundsException(sb.toString());
    }

    public static Object A0d(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static RuntimeException A0e(Object obj) {
        return new RuntimeException(obj.toString());
    }

    public static String A0g(int i, Object[] objArr) {
        objArr[1] = Integer.valueOf(i);
        objArr[2] = 1;
        return String.format("Pos: %d, limit: %d, len: %d", objArr);
    }

    public static String A0h(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getStringExtra("extra_referral_screen");
        }
        return null;
    }

    public static String A0j(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0l(String str, String str2, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static StringBuilder A0o(int i, String str) {
        return new StringBuilder(i + str.length());
    }

    public static StringBuilder A0q(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static ByteBuffer A0s(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static X509Certificate A0t(CertPath certPath, int i) {
        return (X509Certificate) certPath.getCertificates().get(i);
    }

    public static void A0y(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
    }

    public static void A10(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A11(ImageView imageView, int i, boolean z) {
        imageView.setImageResource(i);
        C05040Rr.A00(AnonymousClass0Y8.A07(imageView.getContext(), R.color.f5nameremoved), imageView);
        imageView.setSelected(z);
    }

    public static void A13(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A14(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A1A(Object obj, String str) {
        Log.w(str, obj.toString());
    }

    public static void A1B(Object obj, String str, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        stringBuffer.append(obj);
        log.debug(stringBuffer.toString());
    }

    public static void A1D(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(f));
    }

    public static void A1F(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.w(str3, sb.toString());
    }

    public static void A1G(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.d(str3, sb.toString());
    }

    public static void A1H(String str, String str2, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        log.debug(stringBuffer.toString());
    }

    public static void A1I(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.w(str2, sb.toString());
    }

    public static void A1J(String str, String str2, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void A1K(String str, StringBuffer stringBuffer, org.apache.commons.logging.Log log) {
        stringBuffer.append(str);
        log.debug(stringBuffer.toString());
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        Log.w("MetadataUtil", sb.toString());
    }

    public static void A1O(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj.getClass());
    }

    public static void A1V(Object[] objArr, int i, boolean z) {
        objArr[i] = Boolean.valueOf(z);
    }

    public static boolean A1W(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1Z(Object obj, AbstractList abstractList) {
        if (abstractList.indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public static String[] A1b(AnonymousClass36K r0, String str) {
        AnonymousClass36K.A0N(r0, str);
        return new String[]{"error"};
    }
}
