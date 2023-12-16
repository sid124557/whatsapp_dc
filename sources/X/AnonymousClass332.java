package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.332  reason: invalid class name */
public class AnonymousClass332 {
    public final C60692yy A00;

    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        boolean z = true;
        byte[] A0M = C627236i.A0M(bArr, bArr2);
        if (A0M.length < 20) {
            z = false;
        }
        C626936e.A0B(z);
        byte[] bArr3 = new byte[20];
        System.arraycopy(A0M, 0, bArr3, 0, 20);
        return bArr3;
    }

    public final synchronized byte[] A04(C54742pD r8) {
        String A0Z;
        C60692yy r4 = this.A00;
        String str = r8.A01;
        A0Z = C18280x3.A0Z(r4.A01(), C60692yy.A00(str, "auth/encryption_key"));
        if (A0Z == null) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator = (KeyGenerator) AnonymousClass34H.A00(instance, "AES", instance.getProvider().getName());
                SecureRandom A01 = AnonymousClass34H.A01();
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                keyGenerator.init(256, A01);
                A0Z = AnonymousClass0x7.A0s(encoded);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                A0Z = null;
            }
            C18270x1.A0j(r4.A01().edit(), C60692yy.A00(str, "auth/encryption_key"), A0Z);
        }
        return Base64.decode(A0Z, 11);
    }

    public String A02(C54742pD r9, String str) {
        if (r9.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A08 = AnonymousClass36A.A08(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A08[0];
                byte[] bArr2 = A08[1];
                byte[] bArr3 = A08[2];
                byte[] A04 = A04(r9);
                if (Arrays.equals(bArr, A00(A04, AnonymousClass36A.A03(bArr2, bArr3, new byte[2][], 0, 1)))) {
                    return new String(A01(bArr2, bArr3, A04, 2));
                }
                throw new SecurityException("Data mac corrupt");
            } catch (ParseException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public String A03(C54742pD r8, String str) {
        if (r8.A03) {
            byte[] A04 = A04(r8);
            byte[] A002 = A00(A04, str.getBytes());
            C626936e.A0B(C18280x3.A1U(A002.length, 16));
            byte[] bArr = new byte[16];
            System.arraycopy(A002, 0, bArr, 0, 16);
            byte[] A03 = AnonymousClass36A.A03(bArr, A01(bArr, str.getBytes(), A04, 1), new byte[2][], 0, 1);
            return AnonymousClass0x7.A0s(AnonymousClass36A.A03(A00(A04, A03), A03, new byte[2][], 0, 1));
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public AnonymousClass332(C60692yy r1) {
        this.A00 = r1;
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            IvParameterSpec A0D = C18330xA.A0D(bArr);
            SecretKeySpec A0y = C18300x5.A0y(bArr3);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            return C18310x6.A1Y(A0y, A0D, (Cipher) AnonymousClass34H.A00(instance, "AES/CBC/PKCS5Padding", instance.getProvider().getName()), bArr2, i);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new SecurityException(e);
        }
    }
}
