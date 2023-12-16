package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1wP  reason: invalid class name and case insensitive filesystem */
public final class C35151wP extends C41022Iq implements C84304Bv {
    public static final ArrayList A00 = C18260x0.A0C("uwp_alpha", "uwp_beta");

    public void AwE(C58892vz r1) {
    }

    public C35151wP(AnonymousClass36K r10) {
        AnonymousClass36K.A0N(r10, "config");
        Class<String> cls = String.class;
        C626836d.A0F(r10, cls, "wns", new String[]{"platform"});
        C626836d.A06(r10, cls, AnonymousClass0x2.A0U(), 255L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        C41022Iq.A01(r10, "version", A00);
        this.A00 = r10;
    }
}
