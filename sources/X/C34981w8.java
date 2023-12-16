package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1w8  reason: invalid class name and case insensitive filesystem */
public class C34981w8 extends C41022Iq {
    public Object A00;
    public String A01;

    public C34981w8(AnonymousClass36K r22, AnonymousClass36K r23, int i) {
        String str;
        AnonymousClass36K r2 = r22;
        String[] A0Z = AnonymousClass36K.A0Z(r2, "iq");
        Class<String> cls = String.class;
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                str = "result";
                break;
            default:
                str = "error";
                break;
        }
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R, A0S, str, A0Z, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        AnonymousClass36K r9 = r23;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A01 = (String) C626836d.A06(r2, cls, l3, l4, C626836d.A06(r9, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr, true);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<Jid> cls2 = Jid.class;
        this.A00 = C626836d.A06(r2, cls2, l3, l4, C626836d.A06(r9, cls2, l, l2, (Object) null, new String[]{"to"}, false), A1b, true);
        this.A00 = r2;
    }

    public C34981w8(AnonymousClass36K r10, int i) {
        Object A0B;
        AnonymousClass36K r2 = r10;
        if (2 - i != 0) {
            AnonymousClass36K.A0N(r10, "collection");
            this.A01 = (String) C626836d.A06(r2, String.class, AnonymousClass0x2.A0U(), 1000L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
            A0B = C626836d.A06(r2, Long.class, AnonymousClass0x2.A0T(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"version"}, false);
        } else {
            AnonymousClass36K.A0N(r10, "surface");
            this.A01 = (String) C626836d.A06(r2, String.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
            A0B = C626836d.A0B(r2, C86304Jp.A00(98), new String[]{"promotion"}, 0, 100);
        }
        this.A00 = A0B;
        this.A00 = r10;
    }
}
