package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.56Q  reason: invalid class name */
public class AnonymousClass56Q extends C41022Iq {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;

    public AnonymousClass56Q(AnonymousClass36K r12, int i) {
        String[] strArr;
        int i2;
        AnonymousClass36K r4 = r12;
        if (i != 0) {
            AnonymousClass36K.A0N(r12, "thumbnail_media");
            Class<Long> cls = Long.class;
            Long A0U = AnonymousClass0x2.A0U();
            Long A0S = AnonymousClass0x2.A0S();
            this.A00 = C626836d.A06(r4, cls, A0U, A0S, (Object) null, new String[]{"original_dimensions", "height"}, false);
            this.A02 = C626836d.A06(r4, cls, A0U, A0S, (Object) null, new String[]{"original_dimensions", "width"}, false);
            Class<String> cls2 = String.class;
            this.A05 = (String) C626836d.A06(r4, cls2, A0U, A0S, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
            this.A04 = (String) C626836d.A06(r4, cls2, A0U, A0S, (Object) null, new String[]{"original_image_url", "#elementValue"}, false);
            this.A03 = (String) C626836d.A06(r4, cls2, A0U, 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
            this.A00 = r12;
            strArr = new String[]{"original_dimensions"};
            i2 = 400;
        } else {
            AnonymousClass36K.A0N(r12, "image");
            Class<Long> cls3 = Long.class;
            Long A0U2 = AnonymousClass0x2.A0U();
            Long A0S2 = AnonymousClass0x2.A0S();
            this.A00 = C626836d.A06(r4, cls3, A0U2, A0S2, (Object) null, new String[]{"original_dimensions", "height"}, false);
            this.A02 = C626836d.A06(r4, cls3, A0U2, A0S2, (Object) null, new String[]{"original_dimensions", "width"}, false);
            Class<String> cls4 = String.class;
            this.A05 = (String) C626836d.A06(r4, cls4, A0U2, A0S2, (Object) null, new String[]{"request_image_url", "#elementValue"}, false);
            this.A04 = (String) C626836d.A06(r4, cls4, A0U2, A0S2, (Object) null, new String[]{"original_image_url", "#elementValue"}, false);
            this.A03 = (String) C626836d.A06(r4, cls4, A0U2, 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
            this.A00 = r12;
            strArr = new String[]{"original_dimensions"};
            i2 = 374;
        }
        this.A01 = C18290x4.A0k(C626836d.A0B(r4, new C1896292a(i2), strArr, 1, 1));
    }
}
