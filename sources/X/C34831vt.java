package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1vt  reason: invalid class name and case insensitive filesystem */
public class C34831vt extends C41022Iq {
    public String A00;
    public String A01;

    public C34831vt(AnonymousClass36K r10, int i) {
        AnonymousClass36K r2 = r10;
        switch (i) {
            case 0:
            case 3:
            case 9:
                AnonymousClass36K.A0N(r10, "field");
                String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
                Class<String> cls = String.class;
                Long A0U = AnonymousClass0x2.A0U();
                Long A0i = AnonymousClass0x7.A0i();
                this.A00 = (String) C626836d.A06(r2, cls, A0U, A0i, (Object) null, strArr, false);
                this.A01 = (String) C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"reason"}, false);
                this.A00 = r10;
                return;
            case 1:
                AnonymousClass36K.A0N(r10, "metadata");
                Class<String> cls2 = String.class;
                Long A0U2 = AnonymousClass0x2.A0U();
                this.A00 = (String) C626836d.A06(r2, cls2, A0U2, AnonymousClass0x7.A0i(), (Object) null, new String[]{"key"}, false);
                this.A01 = (String) C626836d.A06(r2, cls2, A0U2, 1000L, (Object) null, new String[]{"value"}, false);
                this.A00 = r10;
                return;
            case 2:
                AnonymousClass36K.A0N(r10, "fds");
                Class<String> cls3 = String.class;
                this.A01 = (String) C626836d.A05(r2, cls3, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"state"}, false);
                this.A00 = (String) C626836d.A05(r2, cls3, AnonymousClass0x2.A0T(), 10000L, (Object) null, new String[]{"parameters"}, false);
                this.A00 = r10;
                return;
            case 4:
                AnonymousClass36K.A0N(r10, "option");
                String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
                Class<String> cls4 = String.class;
                Long A0U3 = AnonymousClass0x2.A0U();
                this.A00 = (String) C626836d.A06(r2, cls4, A0U3, 20L, (Object) null, strArr2, false);
                this.A01 = (String) C626836d.A06(r2, cls4, A0U3, 20L, (Object) null, new String[]{"value"}, false);
                this.A00 = r10;
                return;
            case 5:
                AnonymousClass36K.A0N(r10, "property");
                String[] strArr3 = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
                Class<String> cls5 = String.class;
                Long A0U4 = AnonymousClass0x2.A0U();
                this.A00 = (String) C626836d.A06(r2, cls5, A0U4, 200L, (Object) null, strArr3, false);
                this.A01 = (String) C626836d.A06(r2, cls5, A0U4, 200L, (Object) null, new String[]{"value"}, false);
                this.A00 = r10;
                return;
            case 6:
                AnonymousClass36K.A0N(r10, "promotion");
                String[] strArr4 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls6 = String.class;
                Long A0R = AnonymousClass0x2.A0R();
                Long A0S = AnonymousClass0x2.A0S();
                this.A00 = (String) C626836d.A06(r2, cls6, A0R, A0S, (Object) null, strArr4, false);
                this.A01 = (String) C626836d.A05(r2, cls6, A0R, A0S, (Object) null, new String[]{"instance_id"}, false);
                this.A00 = r10;
                return;
            case 7:
                AnonymousClass36K.A0N(r10, "attribute");
                Class<String> cls7 = String.class;
                Long A0R2 = AnonymousClass0x2.A0R();
                Long A0S2 = AnonymousClass0x2.A0S();
                this.A00 = (String) C626836d.A06(r2, cls7, A0R2, A0S2, (Object) null, new String[]{"key"}, false);
                this.A01 = (String) C626836d.A06(r2, cls7, A0R2, A0S2, (Object) null, new String[]{"value"}, false);
                this.A00 = r10;
                return;
            default:
                Class<String> cls8 = String.class;
                Long A0U5 = AnonymousClass0x2.A0U();
                Long A0i2 = AnonymousClass0x7.A0i();
                this.A00 = (String) C626836d.A06(r2, cls8, A0U5, A0i2, (Object) null, new String[]{"aadhaar-otp-txn-id"}, false);
                this.A01 = (String) C626836d.A06(r2, cls8, A0U5, A0i2, (Object) null, new String[]{"aadhaar-otp-txn-ts"}, false);
                this.A00 = r10;
                return;
        }
    }
}
