package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1wq  reason: invalid class name and case insensitive filesystem */
public class C35421wq extends C35561x4 implements C833548b {
    public C35421wq(int i) {
        String str;
        C56052rL A02 = C56052rL.A02();
        if (i != 0) {
            str = "text";
        } else {
            str = "media";
        }
        C56052rL.A0D(A02, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        C41032Ir.A0A(A02, this);
    }
}
