package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2y1  reason: invalid class name and case insensitive filesystem */
public class C60112y1 {
    public static final byte[] A03 = {2};
    public static final byte[] A04 = {1};
    public final int A00;
    public final C60352yQ A01;
    public final byte[] A02;

    public C43022Ql A00() {
        try {
            byte[][] A022 = C616531r.A02(this.A01.A01(A01(A04), "WhisperMessageKeys".getBytes(), 80), 32, 32, 16);
            SecretKeySpec A0y = C18300x5.A0y(A022[0]);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022[1], DefaultCrypto.HMAC_SHA256);
            return new C43022Ql(C18330xA.A0D(A022[2]), A0y, secretKeySpec, this.A00);
        } catch (ParseException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public final byte[] A01(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(this.A02, DefaultCrypto.HMAC_SHA256));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C60112y1(C60352yQ r1, byte[] bArr, int i) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = i;
    }
}
