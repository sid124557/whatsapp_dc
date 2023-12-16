package X;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.2ia  reason: invalid class name and case insensitive filesystem */
public class C50672ia {
    public static AnonymousClass2Q4 A00(AnonymousClass3MY r2, String str, X509Certificate x509Certificate) {
        AnonymousClass2Q4 A02 = r2.A01.A02(str, x509Certificate);
        r2.A00.A0H();
        return A02;
    }

    public AnonymousClass2Q4 A02(String str, X509Certificate x509Certificate) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        SecretKey generateKey = instance.generateKey();
        IvParameterSpec A0D = C18330xA.A0D(AnonymousClass29O.A01(12));
        byte[] bytes = str.getBytes();
        Cipher A0v = C18320x8.A0v();
        A0v.init(1, generateKey, A0D);
        byte[] iv = A0v.getIV();
        byte[] doFinal = A0v.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        PublicKey publicKey = x509Certificate.getPublicKey();
        Cipher instance2 = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance2.init(1, publicKey);
        return new AnonymousClass2Q4(instance2.doFinal(generateKey.getEncoded()), copyOfRange, copyOfRange2, iv);
    }

    public String A03(AnonymousClass2Q4 r7, PrivateKey privateKey) {
        byte[] bArr = r7.A01;
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(2, privateKey);
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = r7.A00;
        byte[] bArr3 = r7.A03;
        int length = bArr2.length;
        int length2 = bArr3.length;
        byte[] copyOf = Arrays.copyOf(bArr2, length + length2);
        System.arraycopy(bArr3, 0, copyOf, length, length2);
        SecretKeySpec A0y = C18300x5.A0y(doFinal);
        Cipher A0v = C18320x8.A0v();
        C18290x4.A1S(A0y, A0v, r7.A02);
        return C18320x8.A0h(A0v.doFinal(copyOf));
    }

    public final String A04(Integer num, String str, String str2, PublicKey publicKey) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        SecretKey generateKey = instance.generateKey();
        IvParameterSpec A0D = C18330xA.A0D(AnonymousClass29O.A01(12));
        byte[] bytes = str.getBytes();
        Cipher A0v = C18320x8.A0v();
        A0v.init(1, generateKey, A0D);
        if (str2 != null && !str2.isEmpty()) {
            A0v.updateAAD(str2.getBytes());
        }
        byte[] iv = A0v.getIV();
        byte[] doFinal = A0v.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        byte byteValue = num.byteValue();
        Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance2.init(1, publicKey);
        byte[] doFinal2 = instance2.doFinal(generateKey.getEncoded());
        short length2 = (short) doFinal2.length;
        byte[] bArr = {(byte) (length2 & 255), (byte) ((length2 >> 8) & 255)};
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        A0e.write(1);
        A0e.write(byteValue);
        A0e.write(iv);
        A0e.write(bArr);
        A0e.write(doFinal2);
        A0e.write(copyOfRange2);
        A0e.write(copyOfRange);
        byte[] byteArray = A0e.toByteArray();
        A0e.close();
        return AnonymousClass0x7.A0s(byteArray);
    }

    public static JSONObject A01(AnonymousClass2Q4 r0, C50672ia r1, PrivateKey privateKey) {
        return new JSONObject(r1.A03(r0, privateKey));
    }
}
