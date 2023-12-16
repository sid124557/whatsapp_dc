package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6qw  reason: invalid class name and case insensitive filesystem */
public class C138756qw extends C41022Iq {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public C138756qw(AnonymousClass36K r10, int i) {
        AnonymousClass36K r2 = r10;
        if (i != 0) {
            AnonymousClass36K.A0N(r10, "upi");
            Class<String> cls = String.class;
            Long A0U = AnonymousClass0x2.A0U();
            this.A04 = (String) C626836d.A06(r2, cls, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"payee_vpa"}, false);
            this.A02 = (String) C626836d.A06(r2, cls, A0U, 1000L, (Object) null, new String[]{"payee_name"}, false);
            this.A01 = (String) C626836d.A06(r2, cls, A0U, 4L, (Object) null, new String[]{"payee_mcc"}, false);
            this.A03 = (String) C626836d.A06(r2, cls, A0U, 4L, (Object) null, new String[]{"payee_purpose_code"}, false);
            this.A05 = (String) C626836d.A06(r2, cls, A0U, 35L, (Object) null, new String[]{"upi_reference_id"}, false);
            this.A00 = (String) C626836d.A05(r2, cls, A0U, AnonymousClass0x2.A0S(), (Object) null, new String[]{"note"}, false);
        } else {
            AnonymousClass36K.A0N(r10, "state");
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
            Class<String> cls2 = String.class;
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            this.A02 = (String) C626836d.A06(r2, cls2, A0R, A0S, (Object) null, strArr, false);
            this.A00 = (String) C626836d.A05(r2, cls2, A0R, A0S, (Object) null, new String[]{"input_path"}, false);
            this.A01 = (String) C626836d.A05(r2, cls2, A0R, A0S, (Object) null, new String[]{"input_selector"}, false);
            this.A03 = (String) C626836d.A05(r2, cls2, A0R, A0S, (Object) null, new String[]{"next"}, false);
            this.A05 = (String) C626836d.A05(r2, cls2, A0R, A0S, (Object) null, new String[]{"result_selector"}, false);
            this.A04 = (String) C626836d.A05(r2, cls2, A0R, A0S, (Object) null, new String[]{"result_path"}, false);
        }
        this.A00 = r10;
    }
}
