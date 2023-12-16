package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1x0  reason: invalid class name and case insensitive filesystem */
public final class C35521x0 extends C35561x4 implements C833548b {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"account_sync", "groups", "newsletter_metadata"});

    public C35521x0(String str, Long l) {
        C56052rL A04 = C56052rL.A04("clean");
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A04, l, "timestamp");
        }
        A04.A0L(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C41032Ir.A0A(A04, this);
    }
}
