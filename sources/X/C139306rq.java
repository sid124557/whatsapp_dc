package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6rq  reason: invalid class name and case insensitive filesystem */
public final class C139306rq extends C41022Iq implements C179958jz {
    public static final ArrayList A01 = C18260x0.A0C("admin", "superadmin");
    public final C179948jy A00;

    public C139306rq(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "participant");
        AnonymousClass6C8.A13(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01);
        AnonymousClass4B7[] r2 = new AnonymousClass4B7[4];
        int A0V = C1896292a.A0V(r2, 186);
        C1896292a.A0P(r2, 187);
        C1896292a.A0Q(r2, 188);
        this.A00 = (C179948jy) C626836d.A07(r4, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJidAndPn|ParticipantWithJid", C1896292a.A0M(r2, 189), new String[A0V]);
        this.A00 = r4;
    }
}
