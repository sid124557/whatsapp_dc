package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1x1  reason: invalid class name and case insensitive filesystem */
public final class C35531x1 extends C35561x4 implements C833548b {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"admin", "guest", "owner", "subscriber"});

    public C35531x1(C95804uY r4, String str) {
        C56052rL A03 = C56052rL.A03();
        C56052rL.A0D(A03, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "jid");
        C626836d.A0D(r4, A03, "jid");
        A03.A0K(str, "view_role", A00);
        C41032Ir.A0A(A03, this);
    }
}
