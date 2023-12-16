package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1wA  reason: invalid class name and case insensitive filesystem */
public final class C35001wA extends C41022Iq {
    public static final ArrayList A02 = C18260x0.A0C("false", "true");
    public final String A00;
    public final String A01;

    public C35001wA(AnonymousClass36K r10) {
        AnonymousClass36K.A0N(r10, "entry_point");
        this.A00 = (String) C626836d.A06(r10, String.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
        this.A01 = C626836d.A0A(r10, A02, new String[]{"should_show"});
        this.A00 = r10;
    }
}
