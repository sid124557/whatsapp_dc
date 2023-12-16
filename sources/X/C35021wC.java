package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wC  reason: invalid class name and case insensitive filesystem */
public final class C35021wC extends C41022Iq {
    public static final ArrayList A03 = AnonymousClass0x2.A0i(new String[]{"all", "category", "featured"});
    public final String A00;
    public final String A01;
    public final List A02;

    public C35021wC(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "section");
        this.A00 = (String) C626836d.A06(r2, String.class, AnonymousClass0x2.A0T(), 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
        this.A01 = C626836d.A0A(r10, A03, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE});
        this.A02 = C626836d.A0B(r2, C86304Jp.A00(16), new String[]{"bot"}, 0, Long.MAX_VALUE);
        this.A00 = r10;
    }
}
