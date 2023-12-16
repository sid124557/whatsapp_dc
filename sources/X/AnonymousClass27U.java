package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.27U  reason: invalid class name */
public final class AnonymousClass27U {
    public static final String A00(C56972sr r3, C95814uZ r4) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            C162457s7.A0D(instance);
            PhoneUserJid A04 = C56972sr.A04(r3);
            if (A04 == null) {
                Log.e("IntegrityFunnelLogger/myPhoneUserJid is null");
                return "";
            }
            String rawString = A04.getRawString();
            Charset charset = AnonymousClass79X.A05;
            instance.update(C18320x8.A1a(rawString, charset));
            String A0V = C18270x1.A0V(instance, C18320x8.A1a(r4.getRawString(), charset));
            C162457s7.A0D(A0V);
            return A0V;
        } catch (NoSuchAlgorithmException unused) {
            Log.e("IntegrityFunnelLogger/no SHA1 algorithm available");
            return "";
        }
    }
}
