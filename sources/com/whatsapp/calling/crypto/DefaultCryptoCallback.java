package com.whatsapp.calling.crypto;

import X.AnonymousClass001;
import X.AnonymousClass31Q;
import X.C380825n;
import X.C56972sr;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DefaultCryptoCallback implements CryptoCallback {
    public static final int E2E_CALL_KEY_LENGTH = 32;
    public static final int E2E_EXTENDED_V2_KEY_LENGTH = 46;
    public static final int HMAC_SHA256_DIGEST_LENGTH = 32;
    public static final int SECURE_SSRC_LENGTH = 4;
    public final C56972sr meManager;
    public final SecureRandom secureRandom = new SecureRandom();

    private byte[] expandCallKey(byte[] bArr, String str) {
        if (bArr.length == 32) {
            if (str == null) {
                str = C56972sr.A06(this.meManager);
            }
            byte[] A00 = AnonymousClass31Q.A00(bArr, str.getBytes(), 46);
            if (A00.length == 46) {
                return A00;
            }
            throw AnonymousClass001.A0e("split byte counts do not match");
        }
        throw AnonymousClass001.A0c("callKey should be 32 bytes");
    }

    public static byte[] generateSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A02 = AnonymousClass31Q.A02(bArr, bArr3, bArr2, 4);
        if (A02.length == 4) {
            return A02;
        }
        throw AnonymousClass001.A0e("split byte counts do not match");
    }

    public boolean generateE2EKeysV2(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr2 == null || bArr.length != 32 || bArr2.length != 46) {
            return false;
        }
        System.arraycopy(expandCallKey(bArr, str), 0, bArr2, 0, 46);
        return true;
    }

    public boolean getSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length != 4) {
            return false;
        }
        System.arraycopy(generateSecureSsrc(bArr, bArr2, bArr3), 0, bArr4, 0, 4);
        return true;
    }

    public boolean hkdfSha256(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr4.length;
        System.arraycopy(AnonymousClass31Q.A02(bArr2, bArr, bArr3, length), 0, bArr4, 0, length);
        return true;
    }

    public boolean hmacSha256(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] A00 = C380825n.A00(bArr, bArr2);
            if (A00.length != 32) {
                return false;
            }
            System.arraycopy(A00, 0, bArr3, 0, 32);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public boolean generateRandomBytes(byte[] bArr) {
        this.secureRandom.nextBytes(bArr);
        return true;
    }

    public DefaultCryptoCallback(C56972sr r2) {
        this.meManager = r2;
    }
}
