package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3Tx  reason: invalid class name and case insensitive filesystem */
public class C68633Tx implements AnonymousClass672 {
    public final AnonymousClass317 A00;

    public void BF0(String str, Map map) {
        AnonymousClass317 r1 = this.A00;
        String A0o = C18310x6.A0o("registration_code", map);
        Log.i("RegistrationManager/handleRegistrationVerificationNotification");
        if (A0o == null) {
            Log.i("RegistrationManager/handleRegistrationVerificationNotification/registrationCode is null");
        } else {
            C18270x1.A0j(C18270x1.A03(r1.A0c), "registration_push_notif_code", A0o);
        }
    }

    public boolean BoG(C47742dk r2, Long l, String str) {
        return "RegistrationVerification".equalsIgnoreCase(str);
    }

    public C68633Tx(AnonymousClass317 r1) {
        this.A00 = r1;
    }
}
