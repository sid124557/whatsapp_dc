package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.36B  reason: invalid class name */
public class AnonymousClass36B {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 * 2);
        for (byte b : bArr) {
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, b & 255, 0);
            sb.append(String.format("%02x", A0L));
        }
        return sb.toString();
    }

    public static byte[] A04(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(DefaultCrypto.UTF_8));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
        }
        return messageDigest.digest();
    }

    public static String A01(String str, String str2) {
        String[] split = str.split("\\|");
        byte[] decode = Base64.decode(split[0], 2);
        byte[] decode2 = Base64.decode(str2, 2);
        return new String(C18310x6.A1Y(C18300x5.A0y(decode2), new GCMParameterSpec(128, Base64.decode(split[1], 2)), C18320x8.A0v(), decode, 2));
    }

    public static SecretKey A03(String str) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"GCM"}).setUserAuthenticationRequired(false).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            return instance.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException("Failed to create symmetric key ", e);
        }
    }

    public static String A00(Boolean bool, String str) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, 999);
        KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 12);
            if (i >= 30) {
                builder.setUserAuthenticationParameters(15, 3);
            } else {
                builder.setUserAuthenticationValidityDurationSeconds(15);
            }
            instance3.initialize(builder.setKeySize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH).setKeyValidityStart(instance.getTime()).setKeyValidityEnd(instance2.getTime()).setDigests(new String[]{"SHA-512"}).setUserAuthenticationRequired(bool.booleanValue()).setSignaturePaddings(new String[]{"PSS"}).setCertificateSubject(new X500Principal("CN=NPCI_CERT")).setCertificateSerialNumber(BigInteger.ONE).build());
        }
        KeyPair genKeyPair = instance3.genKeyPair();
        PrivateKey privateKey = genKeyPair.getPrivate();
        if (((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware()) {
            return C18290x4.A0t(genKeyPair.getPublic().getEncoded());
        }
        throw new InvalidKeySpecException("TEE is unavailable");
    }

    public static byte[] A05(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return C18310x6.A1Y(C18300x5.A0y(bArr2), new GCMParameterSpec(128, bArr3), C18320x8.A0v(), bArr, 1);
    }

    public static byte[] A06(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return C18310x6.A1Y(C18300x5.A0y(bArr2), new GCMParameterSpec(128, bArr3), C18320x8.A0v(), bArr, 2);
    }
}
