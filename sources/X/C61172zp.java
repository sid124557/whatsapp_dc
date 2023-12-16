package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.2zp  reason: invalid class name and case insensitive filesystem */
public abstract class C61172zp {
    public final C55682qk A00;
    public final C66663Mh A01;
    public final C60152y5 A02;

    public C46402bZ A02(byte[] bArr) {
        C46402bZ A002 = ((C23411Sy) this).A00.A00(C58172up.A0T, bArr);
        if (A002 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("EncryptedKeyHelperAESPassword/");
            C18260x0.A1K(A0o, "crypto issue on encryption");
        }
        return A002;
    }

    public byte[] A04(AnonymousClass20A r4, C46402bZ r5) {
        byte[] A012 = ((C23411Sy) this).A00.A01(r5, C58172up.A0T);
        if (A012 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("EncryptedKeyHelperAESPassword/");
            C18260x0.A1O(A0o, "crypto issue on decryption while ", r4);
        }
        return A012;
    }

    public void A01(String str, Throwable th) {
        Log.e("EncryptedKeyHelper/reportKeystoreCriticalException/", th);
        SharedPreferences A03 = this.A02.A03("keystore");
        long j = A03.getLong("client_static_keypair_enc_success", 0);
        long j2 = A03.getLong("client_static_keypair_enc_failed", 0);
        C55682qk r8 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("keystore-error-");
        A0o.append(str);
        A0o.append("-");
        AnonymousClass000.A1A(th, A0o);
        String obj = A0o.toString();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18320x8.A1N(A0o2, th);
        Locale locale = Locale.US;
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1Q(A0M, 0, j);
        AnonymousClass000.A1Q(A0M, 1, j2);
        r8.A09(obj, AnonymousClass000.A0X(String.format(locale, " KS Stats OK/KO: %d/%d", A0M), A0o2), th);
    }

    public C61172zp(C55682qk r1, C66663Mh r2, C60152y5 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A03() {
    }
}
