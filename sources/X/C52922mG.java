package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2mG  reason: invalid class name and case insensitive filesystem */
public abstract class C52922mG {
    public final int A00;
    public final C55682qk A01;
    public final AnonymousClass31C A02;
    public final String A03;

    public final void A00(AnonymousClass4EK r13) {
        AnonymousClass31C r5 = this.A02;
        String A032 = r5.A03();
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0B(A012, "smax_id", this.A00);
        C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
        C56052rL.A0D(A012, "xmlns", this.A03);
        C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C56052rL.A0D(A012, "to", "s.whatsapp.net");
        if (this instanceof AnonymousClass1V2) {
            C56052rL.A07(C56052rL.A04("password_pem"), A012);
            C56052rL.A07(C56052rL.A04("payload_enc_certificates"), A012);
            C56052rL.A05(((AnonymousClass1V2) this).A00, C56052rL.A04("timestamp"), A012);
        } else if (this instanceof AnonymousClass1V3) {
            AnonymousClass1V3 r2 = (AnonymousClass1V3) this;
            C55782qu r4 = r2.A01;
            Integer num = r4.A00;
            if (num != null) {
                r4.A01(num.intValue(), "fetch_certificate");
            }
            C56052rL.A07(C56052rL.A04("password_pem"), A012);
            C56052rL.A07(C56052rL.A04("payload_enc_certificates"), A012);
            C56052rL.A08(C56052rL.A04("timestamp"), A012, String.valueOf(C56612sH.A00(r2.A00)));
        } else if (this instanceof AnonymousClass1V1) {
            Log.i("SupportUser/Fetch Certificate");
            C56052rL.A08(C56052rL.A04("supported_certificates"), A012, "rsa2048");
            C56052rL.A08(C56052rL.A04("fetch_password_pem"), A012, "true");
            C56052rL A04 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A04, "timestamp", C56612sH.A00(((AnonymousClass1V1) this).A00));
            C56052rL.A0B(A04, "version", 1);
            C56052rL.A0D(A04, "use_case", "support");
            C56052rL.A07(A04, A012);
        } else if (this instanceof AnonymousClass1V6) {
            C56052rL.A08(C56052rL.A04("supported_certificates"), A012, "rsa2048");
            C56052rL A042 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A042, "timestamp", C56612sH.A00(((AnonymousClass1V6) this).A00));
            C56052rL.A0B(A042, "version", 1);
            C56052rL.A07(A042, A012);
        } else {
            C56052rL.A08(C56052rL.A04("supported_certificates"), A012, "rsa2048");
            C56052rL.A08(C56052rL.A04("fetch_password_pem"), A012, "true");
            C56052rL A043 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A043, "timestamp", C56612sH.A00(((AnonymousClass1V0) this).A00));
            C56052rL.A0B(A043, "version", 1);
            C56052rL.A07(A043, A012);
        }
        r5.A0K(new AnonymousClass4KT(r13, 5, this), A012.A0F(), A032, 264, 32000);
    }

    public C52922mG(C55682qk r1, AnonymousClass31C r2, String str, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = str;
    }
}
