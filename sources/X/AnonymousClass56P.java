package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.56P  reason: invalid class name */
public class AnonymousClass56P extends C41022Iq {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;

    public AnonymousClass56P(AnonymousClass36K r20, int i) {
        Object obj;
        AnonymousClass36K r5 = r20;
        switch (i) {
            case 0:
                AnonymousClass36K.A0N(r5, "metadata");
                String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME, PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls = String.class;
                Long A0U = AnonymousClass0x2.A0U();
                this.A03 = (String) C626836d.A06(r5, cls, A0U, 50L, (Object) null, strArr, false);
                AnonymousClass36K r12 = r5;
                this.A01 = C626836d.A06(r12, Long.class, AnonymousClass0x2.A0T(), AnonymousClass0x2.A0S(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "update_time"}, false);
                this.A02 = (String) C626836d.A06(r5, cls, A0U, 2000L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
                this.A00 = r5;
                this.A00 = C626836d.A0B(r12, new C1896292a(324), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, 1, 1).get(0);
                return;
            case 1:
                AnonymousClass36K.A0N(r5, "collection");
                String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"};
                Class<String> cls2 = String.class;
                Long A0U2 = AnonymousClass0x2.A0U();
                this.A02 = (String) C626836d.A06(r5, cls2, A0U2, 200L, (Object) null, strArr2, false);
                this.A03 = (String) C626836d.A06(r5, cls2, A0U2, 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
                try {
                    obj = C626836d.A04(r5, new C1896292a(358), new String[0]);
                } catch (AnonymousClass24Y unused) {
                    obj = null;
                }
                this.A00 = obj;
                this.A01 = C626836d.A0B(r5, new C1896292a(359), new String[]{"product"}, 0, 50);
                break;
            default:
                AnonymousClass36K.A0N(r5, "item");
                this.A01 = C626836d.A05(r5, Long.class, -1L, AnonymousClass0x2.A0S(), (Object) null, new String[]{"mute"}, false);
                Class<String> cls3 = String.class;
                Long A0U3 = AnonymousClass0x2.A0U();
                this.A03 = (String) C626836d.A05(r5, cls3, A0U3, 20L, (Object) null, new String[]{"notify"}, false);
                this.A02 = (String) C626836d.A05(r5, cls3, A0U3, 20L, (Object) null, new String[]{"call"}, false);
                Class[] clsArr = new Class[2];
                clsArr[0] = C27991fJ.class;
                this.A00 = C626836d.A00(r5, AnonymousClass0x9.A1A(UserJid.class, clsArr, 1), new String[]{"jid"});
                break;
        }
        this.A00 = r5;
    }
}
