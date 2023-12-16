package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6sD  reason: invalid class name and case insensitive filesystem */
public final class C139536sD extends C41022Iq implements C180008k4 {
    public static final ArrayList A03 = C18260x0.A0C("image", "preview");
    public final String A00;
    public final String A01;
    public final String A02;

    public C139536sD(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "picture");
        Class<String> cls = String.class;
        this.A01 = (String) C626836d.A06(r2, cls, AnonymousClass0x2.A0U(), 50L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        this.A00 = (String) C626836d.A06(r2, cls, AnonymousClass0x2.A0T(), 4096L, (Object) null, new String[]{"direct_path"}, false);
        this.A02 = AnonymousClass6C9.A0d(r10, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A03);
        this.A00 = r10;
    }
}
