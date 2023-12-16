package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2tc  reason: invalid class name and case insensitive filesystem */
public final class C57422tc {
    public static final byte[] A00(String str, String str2) {
        C162457s7.A0J(str, 0);
        try {
            byte[] decode = Base64.decode(str2, 2);
            C162457s7.A0D(decode);
            MessageDigest A0t = AnonymousClass0x7.A0t();
            C162457s7.A0D(A0t);
            A0t.update(decode);
            Charset forName = Charset.forName(DefaultCrypto.UTF_8);
            C162457s7.A0D(forName);
            return A0t.digest(C18320x8.A1a(str, forName));
        } catch (Exception unused) {
            Log.e("Exception generating hash at sha256Bytes");
            return null;
        }
    }

    public static final byte[] A01(String str, byte[] bArr, byte[] bArr2) {
        SecretKeySpec A0y = C18300x5.A0y(bArr2);
        IvParameterSpec A0D = C18330xA.A0D(Base64.decode(str, 2));
        Cipher A0v = C18320x8.A0v();
        C162457s7.A0D(A0v);
        byte[] A1Y = C18310x6.A1Y(A0y, A0D, A0v, bArr, 1);
        C162457s7.A0D(A1Y);
        return A1Y;
    }
}
