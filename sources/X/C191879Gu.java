package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.9Gu  reason: invalid class name and case insensitive filesystem */
public class C191879Gu extends AnonymousClass5ZM {
    public final C55682qk A00;
    public final AnonymousClass9AC A01;
    public final C203309nU A02;
    public final C85134Fb A03;
    public final C385127z A04;
    public final C115115o9 A05;
    public final C194259Se A06;
    public final String A07 = "initial";
    public final boolean A08;

    public C191879Gu(C55682qk r2, AnonymousClass9AC r3, C203309nU r4, C85134Fb r5, C385127z r6, C115115o9 r7, C194259Se r8, boolean z) {
        this.A06 = r8;
        this.A05 = r7;
        this.A00 = r2;
        this.A08 = z;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A05.B5M(this.A07, this.A06.A01(), this.A08);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
            AnonymousClass9AC r14 = this.A01;
            String str2 = this.A07;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type/challenge");
            } else {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                if (!TextUtils.isEmpty(str)) {
                    r14.A06.Bq0();
                    AnonymousClass31C r10 = r14.A02;
                    String A032 = r10.A03();
                    String A012 = r14.A08.A01();
                    String A072 = r14.A03.A07();
                    String A0z = AnonymousClass0x9.A0z(str2);
                    AnonymousClass9IP r5 = new AnonymousClass9IP(A032);
                    C56052rL A013 = C56052rL.A01();
                    C1899593h.A1M(A013);
                    C56052rL A0U = C1899593h.A0U();
                    C56052rL.A0D(A0U, "action", "upi-get-token");
                    if (C626836d.A0M(str, 0, 1000, false)) {
                        C56052rL.A0D(A0U, PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, str);
                    }
                    if (C626836d.A0M(A012, 1, 1000, false)) {
                        C56052rL.A0D(A0U, "device-id", A012);
                    }
                    if (A072 != null && C1899693i.A0z(A072, 1, true)) {
                        C56052rL.A0D(A0U, "provider-type", A072);
                    }
                    A0U.A0L(A0z, "token-type", C192139Ii.A00);
                    AnonymousClass36K A033 = C41032Ir.A03(A0U, A013, r5);
                    C153607bd r0 = r14.A00;
                    r0.A03("upi-get-token");
                    r10.A0D(new C203919oW(r14.A00, r14.A01, r14, r14.A05, r0), A033, A032, 204, 0);
                }
            }
        } else {
            C203309nU r02 = this.A02;
            if (r02 != null) {
                r02.BTy();
            }
            this.A00.A0A("payments/indiaupi", true, "Failed to get Challenge");
        }
        AnonymousClass9S0.A09 = null;
    }
}
