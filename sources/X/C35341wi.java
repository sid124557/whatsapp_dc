package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public class C35341wi extends C35561x4 {
    public C35341wi(Long l) {
        C56052rL A04 = C56052rL.A04("avatar_consent_result");
        if (C626836d.A0J(l, 0, 2, false)) {
            C56052rL.A0A(A04, l, "value");
        }
        C41032Ir.A0A(A04, this);
    }

    public C35341wi(String str, int i) {
        String str2;
        C56052rL A01 = C56052rL.A01();
        if (i != 0) {
            str2 = "get";
        } else {
            str2 = "set";
        }
        C56052rL.A0D(A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        C626836d.A0G(A01, str);
        C41032Ir.A0A(A01, this);
    }

    public C35341wi(C35341wi r2) {
        C41032Ir.A0C(C56052rL.A00(), r2, this);
    }
}
