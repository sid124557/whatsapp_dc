package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2xr  reason: invalid class name and case insensitive filesystem */
public class C60012xr {
    public static final byte[] A02 = {2};
    public static final byte[] A03 = {1};
    public final int A00;
    public final byte[] A01;

    public C60012xr A00() {
        try {
            return new C60012xr(this.A00 + 1, AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, this.A01).doFinal(A02));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C43012Qk A01() {
        try {
            return new C43012Qk(this.A00, AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, this.A01).doFinal(A03));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C60012xr(int i, byte[] bArr) {
        this.A00 = i;
        this.A01 = bArr;
    }
}
