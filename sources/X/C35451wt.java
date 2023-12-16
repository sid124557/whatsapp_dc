package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public final class C35451wt extends C35561x4 implements C833548b {
    public C35451wt(Long l) {
        C56052rL A04 = C56052rL.A04("clean");
        C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "syncd_app_state");
        if (C626836d.A0K(l, false)) {
            C56052rL.A0A(A04, l, "timestamp");
        }
        C41032Ir.A0A(A04, this);
    }
}
