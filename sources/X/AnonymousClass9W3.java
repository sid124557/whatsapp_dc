package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9W3  reason: invalid class name */
public class AnonymousClass9W3 {
    public final AnonymousClass0XP A00;
    public final C620933l A01;
    public final C160757oG A02 = C160757oG.A00("PaymentFingerprintKeyStore", "payment-settings", "COMMON");

    public synchronized int A01() {
        JSONObject optJSONObject;
        int i = 0;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = AnonymousClass0x9.A1H(A06).optJSONObject("bio")) != null && (i = optJSONObject.optInt("bioState", 0)) == 1) {
                if (A00() == null) {
                    A03();
                    return 3;
                }
            }
        } catch (JSONException e) {
            this.A02.A0A("getState threw: ", e);
            return i;
        }
    }

    public final synchronized String A02(int i) {
        String str;
        str = null;
        try {
            C620933l r7 = this.A01;
            JSONObject A0g = C1899593h.A0g(r7);
            JSONObject optJSONObject = A0g.optJSONObject("bio");
            if (optJSONObject == null) {
                optJSONObject = AnonymousClass0x9.A1G();
            }
            optJSONObject.put("v", "1");
            if (i == 0) {
                optJSONObject.remove("bioId");
                optJSONObject.remove("bioPublicKey");
            } else if (i == 2) {
                str = C18280x3.A0Y().replace("-", "");
                optJSONObject.put("bioId", str);
            }
            optJSONObject.put("bioState", i);
            A0g.put("bio", optJSONObject);
            C1899593h.A1D(r7, A0g);
        } catch (JSONException e) {
            this.A02.A0A("PaymentFingerprintKeyStore setState threw: ", e);
        }
        return str;
    }

    public static C05860Vg A00() {
        Log.i("FingerprintHelper-helper/get-crypto-object");
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            instance.initSign((PrivateKey) instance2.getKey("payment_bio_key_alias", (char[]) null));
            return new C05860Vg(instance);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FingerprintHelper/getCryptoObject: api=");
            A0o.append(Build.VERSION.SDK_INT);
            C18270x1.A1H(A0o, " error: ", e);
            C18280x3.A13(A0o);
            return null;
        }
    }

    public void A03() {
        Log.i("FingerprintHelper-helper/remove-key");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry("payment_bio_key_alias");
            A02(0);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FingerprintHelper/removeKey: api=");
            A0o.append(Build.VERSION.SDK_INT);
            A0o.append(" error: ");
            C18260x0.A1L(A0o, e.toString());
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A06 = this.A01.A06();
                    if (!TextUtils.isEmpty(A06) && (optJSONObject = AnonymousClass0x9.A1H(A06).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", (String) null);
                    }
                } catch (JSONException e) {
                    this.A02.A0A("getId threw: ", e);
                }
            }
            if (str.equals(str2)) {
                A02(1);
                return;
            }
        }
        A03();
        return;
    }

    public boolean A05() {
        AnonymousClass0XP r1 = this.A00;
        if (!r1.A06() || !r1.A05()) {
            return false;
        }
        return true;
    }

    public AnonymousClass9W3(C54292oU r4, C620933l r5) {
        this.A01 = r5;
        this.A00 = new AnonymousClass0XP(r4.A00);
    }
}
