package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1wV  reason: invalid class name and case insensitive filesystem */
public final class C35211wV extends C41032Ir {
    public static final ArrayList A00 = C18260x0.A0C("image", "video");

    public C35211wV(String str, String str2, String str3, String str4) {
        C56052rL A04 = C56052rL.A04("media");
        String str5 = str;
        if (C626836d.A0M(str5, 1, 1000, false)) {
            C56052rL.A0D(A04, "iv", str5);
        }
        String str6 = str2;
        if (C626836d.A0M(str6, 1, 1000, false)) {
            C56052rL.A0D(A04, "cipherKey", str6);
        }
        String str7 = str3;
        if (C626836d.A0M(str7, 1, 2000, false)) {
            A04.A0J(str7);
        }
        A04.A0K(str4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C41032Ir.A0A(A04, this);
    }
}
