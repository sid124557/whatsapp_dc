package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.6ri  reason: invalid class name and case insensitive filesystem */
public final class C139226ri extends C41022Iq implements C183418q0 {
    public void Aw2(C149057Kt r8) {
        List list = r8.A01;
        AnonymousClass36J r5 = AnonymousClass36J.A00;
        AnonymousClass36K r4 = this.A00;
        C162457s7.A0D(r4);
        C149067Ku r3 = r8.A00;
        list.add(r5.A0A(r4, new AnonymousClass746(r3, 12), new AnonymousClass746(r3, 13), 3));
    }

    public C139226ri(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "group");
        Class<String> cls = String.class;
        C626836d.A0F(r10, cls, "true", new String[]{"truncated"});
        C626836d.A06(r2, cls, 10L, 50L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        C626836d.A06(r2, Long.class, AnonymousClass0x2.A0T(), 19999L, (Object) null, new String[]{"size"}, false);
        this.A00 = r10;
    }
}
