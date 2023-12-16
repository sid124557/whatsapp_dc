package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6r8  reason: invalid class name and case insensitive filesystem */
public final class C138866r8 extends C41022Iq {
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"active", "geosuspended", "suspended"});
    public final String A00;

    public C138866r8(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "metadata");
        this.A00 = C626836d.A0A(r4, A01, new String[]{"state", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE});
        this.A00 = r4;
    }
}
