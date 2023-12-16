package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6sC  reason: invalid class name and case insensitive filesystem */
public final class C139526sC extends C41022Iq implements C180008k4 {
    public static final ArrayList A02 = C18260x0.A0C("image", "preview");
    public final String A00;
    public final String A01;

    public C139526sC(AnonymousClass36K r10) {
        AnonymousClass36K.A0N(r10, "picture");
        this.A00 = (String) C626836d.A06(r10, String.class, AnonymousClass0x2.A0U(), 50L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        this.A01 = AnonymousClass6C9.A0d(r10, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A02);
        this.A00 = r10;
    }
}
