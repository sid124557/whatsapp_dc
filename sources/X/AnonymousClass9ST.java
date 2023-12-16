package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9ST  reason: invalid class name */
public abstract class AnonymousClass9ST {
    public List A00;
    public final JSONArray A01 = new JSONArray();

    public String A01() {
        if (!(this instanceof C190869Ad)) {
            return ((C190879Ae) this).A00;
        }
        try {
            return AnonymousClass9UD.A00(((C190869Ad) this).A00.toString());
        } catch (UnsupportedEncodingException e) {
            throw new AnonymousClass9KN(e);
        }
    }

    public AnonymousClass9ST A00(PublicKey... publicKeyArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            for (PublicKey A012 : publicKeyArr) {
                A0s.add(AnonymousClass9UD.A01(A012));
            }
            this.A00 = A0s;
            return this;
        } catch (NoSuchAlgorithmException e) {
            Log.e("PAY: DefaultTrustTokenBuilder/generateKeyFingerprints", e);
            throw new AnonymousClass9KN(e);
        }
    }
}
