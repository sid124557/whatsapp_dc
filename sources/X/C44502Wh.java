package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2Wh  reason: invalid class name and case insensitive filesystem */
public final class C44502Wh {
    public final C54292oU A00;

    public C44502Wh(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final ArrayList A00(String str) {
        String str2;
        C162457s7.A0J(str, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(str, 64).signatures;
            C162457s7.A0H(signatureArr);
            for (Signature charsString : signatureArr) {
                String charsString2 = charsString.toCharsString();
                C162457s7.A0D(charsString2);
                String A0e = AnonymousClass0x2.A0e(charsString2, AnonymousClass000.A0l(str), ' ');
                try {
                    MessageDigest A0t = AnonymousClass0x7.A0t();
                    Charset charset = StandardCharsets.UTF_8;
                    C162457s7.A0F(charset);
                    A0t.update(C18320x8.A1a(A0e, charset));
                    String A0i = C18320x8.A0i(Arrays.copyOfRange(A0t.digest(), 0, 9));
                    C162457s7.A0H(A0i);
                    str2 = A0i.substring(0, 11);
                    C162457s7.A0D(str2);
                } catch (NoSuchAlgorithmException unused) {
                    Log.e("OTPHashUtil/hash:NoSuchAlgorithm");
                    str2 = null;
                }
                if (str2 != null) {
                    String format = String.format(Locale.US, "%s", Arrays.copyOf(new Object[]{str2}, 1));
                    C162457s7.A0D(format);
                    A0s.add(format);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.e("OTPHashUtil/Unable to find package to obtain hash");
        }
        return A0s;
    }
}
