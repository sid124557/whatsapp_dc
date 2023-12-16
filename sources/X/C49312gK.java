package X;

import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: X.2gK  reason: invalid class name and case insensitive filesystem */
public final class C49312gK {
    public final C55682qk A00;
    public final C57182tE A01;
    public final C50652iY A02;

    public final String A00(String str) {
        byte[] bArr;
        try {
            C46402bZ A002 = C57182tE.A00(str);
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = this.A02.A01(A002, C58172up.A0T);
            }
            if (bArr != null) {
                Charset charset = C58152un.A0D;
                C162457s7.A0F(charset);
                return new String(bArr, charset);
            }
            this.A00.A0A("XFamilyEncryptionHelper/decryptFromHash", true, "Failed to decrypt");
            throw AnonymousClass001.A0e("Failed to decrypt");
        } catch (JSONException e) {
            C55682qk.A05(this.A00, "XFamilyAccountStore/decryptFromHash", e);
            throw new IllegalStateException("Failed to decrypt", e);
        }
    }

    public final String A01(String str) {
        String A002;
        C46402bZ A003 = this.A02.A00(C58172up.A0T, C18290x4.A1b(str));
        if (A003 != null && (A002 = A003.A00()) != null && str.equals(A00(A002))) {
            return A002;
        }
        this.A00.A0A("XFamilyEncryptionHelper/encryptToHash", true, "Failed to encrypt");
        throw AnonymousClass001.A0e("Failed to encrypt");
    }

    public C49312gK(C55682qk r1, C57182tE r2, C50652iY r3) {
        C18260x0.A0R(r3, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
