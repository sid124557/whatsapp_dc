package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9bR  reason: invalid class name */
public class AnonymousClass9bR implements C185728u9 {
    public final C1906899l A00;
    public final C620933l A01;
    public final AnonymousClass9OF A02;
    public final AnonymousClass9VV A03;

    public void B1M() {
        this.A01.A0J((String) null);
        this.A03.A04("personal");
        AnonymousClass9OF r3 = this.A02;
        AnonymousClass9R1 r0 = (AnonymousClass9R1) r3.A01.A00.get();
        if (r0 != null) {
            try {
                KeyStore keyStore = r0.A01;
                if (keyStore.containsAlias("alias-payments-br-trusted-device-key")) {
                    keyStore.deleteEntry("alias-payments-br-trusted-device-key");
                }
            } catch (KeyStoreException unused) {
                Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
            }
        }
        try {
            C620933l r2 = r3.A00;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1H = AnonymousClass0x9.A1H(A06);
                A1H.remove("td");
                C1899593h.A1D(r2, A1H);
            }
        } catch (JSONException e) {
            Log.w("PAY: TrustedDeviceKeyStore delete failed", e);
        }
    }

    public boolean Bo1(AnonymousClass1S4 r3) {
        if (!C18280x3.A1W(this.A01.A03(), "payments_card_can_receive_payment") || !this.A00.A0E()) {
            return true;
        }
        return false;
    }

    public boolean BrZ(long j, boolean z) {
        C620933l r3 = this.A01;
        C18270x1.A0l(C620933l.A00(r3), "payment_account_recoverable", z);
        if (!z) {
            C18270x1.A0i(C620933l.A00(r3), "payment_account_recoverable_time_ms", 0);
            return true;
        } else if (j > 0) {
            C18270x1.A0i(C620933l.A00(r3), "payment_account_recoverable_time_ms", j * 1000);
            return true;
        } else {
            r3.A0D();
            return true;
        }
    }

    public AnonymousClass9bR(C1906899l r1, C620933l r2, AnonymousClass9OF r3, AnonymousClass9VV r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public boolean B1N(String str, boolean z) {
        return false;
    }

    public boolean Brs(C133796hx r2) {
        return false;
    }
}
