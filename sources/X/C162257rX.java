package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.7rX  reason: invalid class name and case insensitive filesystem */
public class C162257rX {
    public static int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return A02(bArr);
    }

    public static int A01(byte[] bArr) {
        if (bArr.length == 3) {
            return AnonymousClass6CA.A0B(bArr, 2, AnonymousClass6C8.A0G(bArr, 1, 0 | ((bArr[0] & 255) << 16)));
        }
        throw C143806zV.A00("Invalid argument. Byte array is null or length != 3");
    }

    public static boolean A06(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length; i++) {
            z &= AnonymousClass000.A1U(bArr[i], bArr2[i]);
        }
        return z;
    }

    public static byte[] A0C(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[A02(bArr)];
        byteBuffer.get(bArr2);
        return bArr2;
    }

    public static int A02(byte[] bArr) {
        if (bArr != null && bArr.length == 2) {
            return AnonymousClass6CA.A0B(bArr, 1, 0 | AnonymousClass6C9.A0F(bArr, 0));
        }
        throw C143806zV.A00("Invalid argument. Byte array is null or length != 2");
    }

    public static long A03(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        }
        throw C143806zV.A00("Invalid argument. byte array is null or length != 4");
    }

    public static String A04(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        for (byte valueOf : bArr) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = Byte.valueOf(valueOf);
            formatter.format("%02x ", A0L);
        }
        return formatter.toString();
    }

    public static byte[] A07(int i) {
        if (i < 0 || i >= 16777216) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid argument. The supplied int value = ");
            A0o.append(i);
            throw C143806zV.A00(AnonymousClass000.A0X(" does not fit in 3 bytes.", A0o));
        }
        return new byte[]{(byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A08(int i) {
        if (i < 0 || i >= 65536) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid argument. The supplied int value = ");
            A0o.append(i);
            throw C143806zV.A00(AnonymousClass000.A0X(" does not fit in 2 bytes.", A0o));
        }
        return new byte[]{(byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A0A(String str, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            try {
                byte[] bytes = AnonymousClass000.A0V("tls13 ", str, AnonymousClass001.A0o()).getBytes(DefaultCrypto.UTF_8);
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length2 + 1 + 2 + length + 1);
                A05(i, allocate);
                short s = (short) length2;
                if (s < 0 || s >= 256) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Invalid argument. Short val = ");
                    A0o.append(s);
                    throw C143806zV.A00(AnonymousClass000.A0X(" cannot fit in single byte", A0o));
                }
                allocate.put((byte) (s & 255));
                allocate.put(bytes);
                allocate.put((byte) length);
                allocate.put(bArr);
                return allocate.array();
            } catch (UnsupportedEncodingException e) {
                throw C143806zV.A03(e);
            }
        } else {
            throw C143806zV.A01("Context cannot be null when generating info", (byte) 80);
        }
    }

    public static byte[] A0B(String str, byte[] bArr, byte[] bArr2) {
        try {
            String replace = str.replace("-", "");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, AnonymousClass000.A0T("Hmac", replace));
            Mac instance = Mac.getInstance(AnonymousClass000.A0T("Hmac", replace));
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw C143806zV.A02(AnonymousClass000.A0X(" not found", AnonymousClass000.A0m("Hmac", str)), e, (byte) 80);
        } catch (InvalidKeyException e2) {
            throw C143806zV.A02("Invalid key", e2, (byte) 80);
        }
    }

    public static void A05(int i, ByteBuffer byteBuffer) {
        byteBuffer.put(A08(i));
    }

    public static byte[] A09(String str, String str2, int i) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("#");
        A0l.append(i);
        try {
            return AnonymousClass000.A0V("#", str2, A0l).getBytes(DefaultCrypto.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw C143806zV.A04(e);
        }
    }
}
