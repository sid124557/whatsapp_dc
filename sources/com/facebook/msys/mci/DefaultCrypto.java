package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.C04890Rb;
import X.C18310x6;
import X.C18330xA;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.wamsys.Hex;
import com.whatsapp.wamsys.SecureUriParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final int BUFFER_SIZE = 8192;
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final Class TAG = DefaultCrypto.class;
    public static final String UTF_8 = "UTF-8";
    public static final Crypto mCrypto = new DefaultCrypto();

    private String computeSHA256Impl(String str, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        int read;
        String str3 = str;
        try {
            Uri parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(str3);
            String scheme = parseEncodedRFC2396.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Invalid fileUrlString: ");
                th = AnonymousClass000.A0F(str3, A0o);
            } else if (scheme.equalsIgnoreCase("file")) {
                String path = parseEncodedRFC2396.getPath();
                if (!TextUtils.isEmpty(path)) {
                    File A0B = AnonymousClass002.A0B(path);
                    if (A0B.exists()) {
                        String path2 = A0B.getPath();
                        try {
                            fileInputStream = new FileInputStream(path2);
                            File A0B2 = AnonymousClass002.A0B(path2);
                            byte[] bArr = new byte[BUFFER_SIZE];
                            long length = A0B2.length();
                            Mac instance = Mac.getInstance(HMAC_SHA256);
                            instance.init(new SecretKeySpec(str2.getBytes(), HMAC_SHA256));
                            long j = length;
                            long j2 = 0;
                            boolean z = true;
                            while (true) {
                                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                                if (i > 0 && (read = fileInputStream.read(bArr)) != -1) {
                                    int i2 = 0;
                                    while (z && i2 < 8192) {
                                        z = AnonymousClass000.A1T(bArr[i2]);
                                        i2++;
                                    }
                                    int min = Math.min((int) j, read);
                                    instance.update(bArr, 0, min);
                                    j2 += (long) read;
                                    j -= (long) min;
                                } else if (!z || j2 == length || i != 0) {
                                    throw AnonymousClass002.A0E("Unable to read all bytes from file");
                                } else {
                                    String A0z = AnonymousClass0x9.A0z(Hex.encodeHex(instance.doFinal(), false));
                                    fileInputStream.close();
                                    return A0z;
                                }
                            }
                            if (!z && j2 == length) {
                            }
                            throw AnonymousClass002.A0E("Unable to read all bytes from file");
                        } catch (NoSuchAlgorithmException e) {
                            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e);
                        } catch (UnsupportedEncodingException e2) {
                            throw new RuntimeException("UTF_8 encoding is not supported.", e2);
                        } catch (InvalidKeyException e3) {
                            throw new RuntimeException("Invalid secret key.", e3);
                        } catch (IOException e4) {
                            throw new RuntimeException("Couldn't read the content.", e4);
                        } catch (IllegalStateException e5) {
                            throw new RuntimeException("Couldn't update the hash.", e5);
                        } catch (IllegalArgumentException e6) {
                            throw new RuntimeException("Invalid arguments", e6);
                        } catch (Exception e7) {
                            throw new RuntimeException("Unexpected exception", e7);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        th = C18330xA.A05(AnonymousClass000.A0V("File does not exist. Url: ", str3, AnonymousClass001.A0o()));
                    }
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Invalid input file Url: ");
                    th = AnonymousClass000.A0F(str3, A0o2);
                }
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Url MUST be of 'file:' scheme. Found: ");
                th = AnonymousClass000.A0F(scheme, A0o3);
            }
            throw th;
            throw th;
        } catch (FileNotFoundException | IllegalArgumentException | SecurityException e8) {
            throw new RuntimeException("Exception while parsing fileUrl", e8);
        }
    }

    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder A0o = AnonymousClass001.A0o();
            for (byte A1T : digest) {
                Object[] A0L = AnonymousClass002.A0L();
                C18310x6.A1T(A0L, A1T, 0);
                A0o.append(String.format("%02x", A0L));
            }
            return AnonymousClass0x9.A1R(A0o);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public String computeSHA256(byte[] bArr, String str) {
        C04890Rb.A01(bArr, "file bytes can not be null");
        try {
            Mac instance = Mac.getInstance(HMAC_SHA256);
            instance.init(new SecretKeySpec(str.getBytes(UTF_8), HMAC_SHA256));
            return AnonymousClass0x9.A0z(Hex.encodeHex(instance.doFinal(bArr), false));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF_8 encoding is not supported.", e2);
        } catch (InvalidKeyException e3) {
            throw new RuntimeException("Invalid secret key.", e3);
        }
    }

    public static Crypto get() {
        return mCrypto;
    }

    public String computeSHA256(String str, String str2) {
        try {
            return computeSHA256Impl(str, str2);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
