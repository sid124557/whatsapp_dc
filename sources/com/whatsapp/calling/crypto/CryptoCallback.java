package com.whatsapp.calling.crypto;

public interface CryptoCallback {
    boolean generateE2EKeysV2(byte[] bArr, byte[] bArr2, String str);

    boolean generateRandomBytes(byte[] bArr);

    boolean getSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    boolean hkdfSha256(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    boolean hmacSha256(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
