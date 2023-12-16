package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6rM  reason: invalid class name and case insensitive filesystem */
public class C139006rM extends C41022Iq {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;

    public C139006rM(AnonymousClass36K r22, AnonymousClass36K r23, int i) {
        int i2;
        AnonymousClass36K r2 = r22;
        String[] A0Z = AnonymousClass36K.A0Z(r2, "iq");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R, A0S, "error", A0Z, false);
        Class<Jid> cls2 = Jid.class;
        AnonymousClass36K r9 = r23;
        Long l = A0R;
        Long l2 = A0S;
        AnonymousClass36K r14 = r2;
        Class<Jid> cls3 = cls2;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A02 = C626836d.A06(r14, cls3, l3, l4, C626836d.A06(r9, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls4 = cls;
        C626836d.A06(r2, cls, l3, l4, C626836d.A06(r9, cls4, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr, true);
        AnonymousClass36K r92 = r2;
        this.A03 = (String) C626836d.A06(r92, cls4, 1L, l2, (Object) null, new String[]{"error", "text"}, false);
        this.A00 = C626836d.A06(r92, Long.class, 1L, l2, (Object) null, new String[]{"error", "code"}, false);
        this.A00 = r2;
        String[] strArr2 = {"error"};
        if (i != 0) {
            i2 = 406;
        } else {
            i2 = 34;
        }
        this.A01 = C626836d.A0B(r2, C1896292a.A00(i2), strArr2, 1, 1).get(0);
    }

    public C139006rM(AnonymousClass36K r18) {
        AnonymousClass36K r3 = r18;
        AnonymousClass36K.A0N(r3, "description");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r3, cls, A0U, 256L, (Object) null, strArr, false);
        Class<UserJid> cls2 = UserJid.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        AnonymousClass36K r10 = r3;
        this.A00 = C626836d.A05(r10, cls2, A0R, A0S, (Object) null, new String[]{"participant"}, false);
        this.A01 = C626836d.A05(r10, cls2, A0R, A0S, (Object) null, new String[]{"participant_pn"}, false);
        this.A02 = C626836d.A06(r10, Long.class, AnonymousClass0x2.A0T(), A0S, (Object) null, new String[]{"t"}, false);
        this.A03 = (String) C626836d.A06(r3, cls, A0U, 65536L, (Object) null, new String[]{"body", "#elementValue"}, false);
        this.A00 = r3;
    }
}
