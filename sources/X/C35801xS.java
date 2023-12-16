package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1xS  reason: invalid class name and case insensitive filesystem */
public final class C35801xS extends C34771vn {
    public static final ArrayList A02 = C18260x0.A0C("AI available", "In waitlist");
    public final C138966rI A00;
    public final String A01;

    public C35801xS(AnonymousClass36K r5, C35721xK r6) {
        AnonymousClass36K A022 = C41032Ir.A02(r5, r6);
        this.A01 = C41022Iq.A00(r5, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "state", A02);
        this.A00 = (C138966rI) C626836d.A02(r5, new C86294Jo(A022, 3), 0);
        this.A00 = r5;
    }
}
