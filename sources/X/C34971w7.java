package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1w7  reason: invalid class name and case insensitive filesystem */
public final class C34971w7 extends C41022Iq {
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"admin", "guest", "owner", "subscriber"});
    public final String A00;

    public C34971w7(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "metadata");
        this.A00 = C41022Iq.A00(r4, "membership", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01);
        this.A00 = r4;
    }
}
