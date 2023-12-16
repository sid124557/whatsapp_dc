package X;

import android.animation.ObjectAnimator;
import android.os.Parcel;
import android.util.Property;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6CA  reason: invalid class name */
public final class AnonymousClass6CA {
    public static byte A00(int i, long j, long j2) {
        return (byte) ((int) (j2 | (j << i)));
    }

    public static int A01(int i, int i2) {
        return (i + i2) * 31 * 31 * 31;
    }

    public static int A03(InputStream inputStream, byte[] bArr, int i) {
        return inputStream.read(bArr, 0, i);
    }

    public static int A06(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static int A0A(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        return i2 + 1;
    }

    public static int A0D(byte[] bArr, int i, int i2, int i3) {
        bArr[i2] = (byte) i;
        return i3 + 1;
    }

    public static long A0G(int i) {
        return ((long) i) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static String A0T(String str, Object[] objArr) {
        return String.format((Locale) null, str, objArr);
    }

    public static AtomicInteger A0d() {
        return new AtomicInteger(0);
    }

    public static void A0e(int i, byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i ^ i2);
    }

    public static String[] A0j(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int A0B(byte[] bArr, int i, int i2) {
        return (bArr[i] & 255) | i2;
    }

    public static int A0C(byte[] bArr, int i, int i2) {
        return i2 | (bArr[i] & 255);
    }

    public static int A0E(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i2] = i;
        int i5 = i3 ^ i;
        iArr[i4] = i5;
        return i5;
    }

    public static int A0F(String[] strArr, int i) {
        return Integer.parseInt(strArr[i]);
    }

    public static ObjectAnimator A0H(Property property, Object obj, float[] fArr, float f, int i) {
        fArr[i] = f;
        return ObjectAnimator.ofFloat(obj, property, fArr);
    }

    public static SparseArray A0I() {
        return new SparseArray();
    }

    public static C166427yf A0L(C162997t6 r0) {
        return (C166427yf) r0.A0J.get();
    }

    public static EOFException A0M() {
        return new EOFException();
    }

    public static IllegalArgumentException A0N() {
        return new IllegalArgumentException();
    }

    public static IllegalStateException A0O() {
        return new IllegalStateException();
    }

    public static RuntimeException A0Q(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static String A0W(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, charset);
    }

    public static StringBuffer A0X() {
        return new StringBuffer();
    }

    public static StringBuilder A0Y(int i) {
        return new StringBuilder(i);
    }

    public static InvalidAlgorithmParameterException A0Z(String str) {
        return new InvalidAlgorithmParameterException(str);
    }

    public static ArrayDeque A0a() {
        return new ArrayDeque();
    }

    public static NoSuchElementException A0c() {
        return new NoSuchElementException();
    }

    public static void A0f(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 8);
    }

    public static void A0g(byte[] bArr, byte[] bArr2, int i, int i2) {
        bArr2[i2] = bArr[i];
    }

    public static String[] A0i() {
        return new String[]{"error"};
    }

    public static int A02(long j, long j2) {
        return (int) Math.min(j, j2);
    }

    public static int A04(Enum enumR, int[] iArr) {
        return iArr[enumR.ordinal()];
    }

    public static int A05(Object obj, int i) {
        return i ^ obj.hashCode();
    }

    public static int A07(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static int A08(ByteBuffer byteBuffer, int i) {
        return byteBuffer.get(i) & 255;
    }

    public static int A09(byte[] bArr, int i) {
        return i + Arrays.hashCode(bArr);
    }

    public static C06270Wx A0J(AnonymousClass66R r0) {
        return (C06270Wx) r0.getValue();
    }

    public static C186538vW A0K(Iterator it) {
        return (C186538vW) it.next();
    }

    public static Integer A0P(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }

    public static String A0R(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static String A0S(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String A0U(Throwable th) {
        return th.getCause().getMessage();
    }

    public static String A0V(Throwable th) {
        return String.valueOf(th.getMessage());
    }

    public static List A0b(Object obj, long j) {
        return (List) C162367ro.A03(obj, j);
    }

    public static byte[] A0h(Object obj, Map map) {
        return (byte[]) map.get(obj);
    }
}
