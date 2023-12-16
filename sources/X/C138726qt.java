package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6qt  reason: invalid class name and case insensitive filesystem */
public class C138726qt extends C41022Iq {
    public Object A00;
    public String A01;
    public String A02;

    public C138726qt(AnonymousClass36K r10, int i) {
        Object A05;
        AnonymousClass36K r2 = r10;
        if (i != 0) {
            AnonymousClass36K.A0N(r10, "description");
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            Class<String> cls = String.class;
            Long A0U = AnonymousClass0x2.A0U();
            this.A02 = (String) C626836d.A06(r2, cls, A0U, 50L, (Object) null, strArr, false);
            this.A00 = AnonymousClass6C7.A0b(r10, Long.class, new String[]{"update_time"});
            A05 = C626836d.A06(r2, cls, A0U, 65536L, (Object) null, new String[]{"#elementValue"}, false);
        } else {
            AnonymousClass36K.A0N(r10, "error");
            this.A00 = C626836d.A06(r2, Long.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, AnonymousClass6C9.A1a(), false);
            Class<String> cls2 = String.class;
            this.A02 = (String) C626836d.A06(r2, cls2, AnonymousClass0x2.A0U(), 1000L, (Object) null, new String[]{"text"}, false);
            A05 = C626836d.A05(r2, cls2, AnonymousClass0x2.A0T(), 10000L, (Object) null, new String[]{"parameters"}, false);
        }
        this.A01 = (String) A05;
        this.A00 = r10;
    }
}
