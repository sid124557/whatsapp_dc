package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0YS  reason: invalid class name */
public class AnonymousClass0YS {
    public static final Set A00 = new HashSet(Arrays.asList(new String[]{"123qwe", "1q2w3e4r", "1qaz2wsx", "Football", "Million2", "aa123456", "aaron431", "abc123", "access", "admin", "adobe123[a]", "ashley", "azerty", "bailey", "baseball", "batman", "charlie", "donald", "dragon", "flower", "football", "freedom", "hello", "hottie", "iloveyou", "jesus", "letmein", "login", "lovely", "loveme", "master", "michael", "monkey", "mustang", "ninja", "passw0rd", "password", "password1", "photoshop[a]", "picture1", "princess", "qazwsx", "qqww1122", "qwerty", "qwerty123", "qwertyuiop", "senha", "shadow", "solo", "starwars", "sunshine", "superman", "trustno1", "welcome", "whatever", "zaq1zaq1"}));
    public static final String[] A01 = {"MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAjlh/7UEoTs3y0teyqbR70frEsSnRhkj1hYQS7oa26GlzDtsXrmlCMMdMHfYQsjGouKQ8JCsejtdw8FIIwt1aoaaS5IXtHFsE9rDbL6oROYU4g5TDvi9wZdm4/Q/hEUIopeymVl7LZvJh8LR+l5CsTyoSV0A8aED1e0vaFYN//6RGeNffdt1E86cficxTASORnl7V7QYksZehmvksPlqxzKq/N/2qQnqsSZgZGa2soMc+lxt4TW9JlBTkI3PJVvXdE4ZKiC56I4zDiTTT4rStp9ZA0rznVCN2jhZPBeXHHhUsvtDCTHPv/M83VGurWJmPdw0cf4FZzhTEvp1d7MzZb6+DRTlHQonj8p8NR/sAQBNm9KqzmKqbyPbe8AC6lljt+AvO1/XbxWKzChvXFH7zVbXfxjclm7dsXANgXGeCYGNsm4gHHxy4GcNaX1Vq1d3Q1n+aG5z+ks9BNNpvMX0V6mKQ+UZReCCqPbeP4p7lKN0e97xE/tAUSjPgZGnCcBFHAgMBAAE=", "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA3jL8MW8+0NAy4RqiB8w57xRQOzZ9xSOJXDiOL0ycf1rOFjHVNvNRECKKf+9yEKFjD/lZLVx33/4vHHykqQW6mS1MH3eenw2du/hG9EKRWCaezIwgqxwYhhZbdDQ7SiM88LUcZxKBZLYgmgfLzJYQD0ycTcaH5VKvye6cpV2P2y3e/eiCSamybQplygLJtS54+mXWZ5cAbfI89WNwFeofXkXF9r6N0zJOvz03GweZQjzcN55xonfLErECMLM4F5MuPNdzLsaWb275A19NDTlcuppbXtqkOA6ZXKOGIwtLekCElv3/L+Xe4i2OkclXJYAQ2oBBm6onW24afaR4Yea5FhBlNsXkPgZ2CuC2k3diabqRAbVDH9c2RrExgH7FYamLeOiE2W/EtWJEEZthRDciXMHgoWr9ZzQNof3ZdSauV3rUHB5FaXQhLP1qA+JS7F/634PogKk0NlO/4qrFKeG6sIiNyRFmbE0I+RTitK8pvJHz7JNDGmTxIRCiDXBZDQ7RAgMBAAE="};

    public static String A03(String str, byte[] bArr, byte[] bArr2) {
        boolean z = true;
        C626936e.A0E(AnonymousClass000.A1U(bArr.length, 32), "wrong length of enc key");
        C626936e.A0E(AnonymousClass000.A1U(bArr2.length, 32), "wrong length of auth key");
        ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 2));
        int i = wrap.get();
        boolean A1U = AnonymousClass000.A1U(i, 16);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("unexpected size of iv (");
        A0o.append(i);
        C626936e.A0E(A1U, AnonymousClass000.A0X(")", A0o));
        byte[] bArr3 = new byte[i];
        wrap.get(bArr3);
        int i2 = wrap.get();
        if (i2 != 32) {
            z = false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("unexpected size of mac (");
        A0o2.append(i2);
        C626936e.A0E(z, AnonymousClass000.A0X(")", A0o2));
        byte[] bArr4 = new byte[i2];
        wrap.get(bArr4);
        byte[] bArr5 = new byte[wrap.remaining()];
        wrap.get(bArr5);
        Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
        instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
        instance.update(bArr3);
        instance.update(bArr5);
        if (MessageDigest.isEqual(instance.doFinal(), bArr4)) {
            Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance2.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr3));
            return new String(instance2.doFinal(bArr5));
        }
        throw new SecurityException("cannot authenticate");
    }

    public static String A04(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        C626936e.A0E(AnonymousClass000.A1U(bArr.length, 32), "wrong length of enc key");
        C626936e.A0E(AnonymousClass000.A1U(bArr2.length, 32), "wrong length of auth key");
        int length = bArr3.length;
        if (length == 16) {
            z = true;
        }
        C626936e.A0E(z, "wrong length of iv");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr3));
        byte[] doFinal = instance.doFinal(str.getBytes());
        Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
        instance2.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
        instance2.update(bArr3);
        instance2.update(doFinal);
        byte[] doFinal2 = instance2.doFinal();
        int length2 = doFinal2.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 1 + 1 + length2 + doFinal.length);
        allocate.put((byte) length);
        allocate.put(bArr3);
        allocate.put((byte) length2);
        allocate.put(doFinal2);
        allocate.put(doFinal);
        return Base64.encodeToString(allocate.array(), 2);
    }

    public static boolean A06(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            AnonymousClass7R4 r4 = new AnonymousClass7R4();
            int length = bArr2.length;
            int length2 = bArr.length;
            int i = length + length2;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr2, 0, bArr4, 0, length);
            System.arraycopy(bArr, 0, bArr4, length, length2);
            return AnonymousClass76G.A00(r4, new byte[i], bArr4, bArr3, (long) i) == 0;
        } catch (AnonymousClass8RS | IllegalArgumentException e) {
            Log.e("EncryptedBackupUtils/verifyEd25519SignatureAgainstKey/exception.", e);
            return false;
        }
    }

    public static C130736cS A01(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write(bArr5);
        C130526c7 A002 = C130736cS.A00();
        A002.A09(C172548Lq.A01(bArr));
        A002.A0B(C172548Lq.A01(bArr4));
        A002.A0A(C172548Lq.A01(bArr5));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(byteArray);
            A002.A0C(C172548Lq.A01(instance.digest()));
            return (C130736cS) A002.A06();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean A05(byte[] bArr, byte[] bArr2) {
        for (String decode : A01) {
            if (A07(bArr, bArr2, Base64.decode(decode, 0))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr3)));
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
            Log.e("EncryptedBackupUtils/verifySignature/exception.", e);
            return false;
        }
    }

    public static byte[] A08() {
        return C627236i.A0I(32);
    }

    public static byte[] A09(byte[] bArr, byte[] bArr2) {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, generatePublic);
        return instance.doFinal(bArr);
    }

    public static int A00(String str) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return 0;
        }
        if (trim.codePointCount(0, trim.length()) < 6) {
            return 1;
        }
        if (!trim.matches(".*\\p{L}+.*")) {
            return 2;
        }
        if (A00.contains(trim) || SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equalsIgnoreCase(trim) || TextUtils.isEmpty(trim)) {
            return 3;
        }
        String trim2 = trim.trim();
        int codePointCount = trim2.codePointCount(0, trim2.length());
        if (codePointCount < 3) {
            return 3;
        }
        HashSet hashSet = new HashSet(3);
        int i = 0;
        do {
            if (hashSet.add(Integer.valueOf(trim2.codePointAt(i))) && hashSet.size() >= 3) {
                return 4;
            }
            i++;
        } while (i < codePointCount);
        return 3;
    }

    public static C130776cW A02(byte[] bArr, byte[] bArr2) {
        C130516c6 A002 = C130776cW.A00();
        A002.A09(C172548Lq.A01(bArr));
        A002.A0A(C172548Lq.A01(bArr2));
        return (C130776cW) A002.A06();
    }
}
