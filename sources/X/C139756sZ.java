package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.6sZ  reason: invalid class name and case insensitive filesystem */
public class C139756sZ extends C34771vn {
    public Object A00;
    public Object A01;

    public C139756sZ(AnonymousClass36K r23, C35711xJ r24, int i) {
        AnonymousClass36K r3 = r23;
        AnonymousClass36K A02 = C41032Ir.A02(r3, r24);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        if (1 - i != 0) {
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r3, cls, A0R, A0S, "result", strArr, false);
            C626836d.A06(r3, cls, A0R, A0S, C626836d.A06(A02, cls, A0R, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
            this.A00 = C626836d.A06(r3, Jid.class, A0R, A0S, (Object) null, new String[]{"from"}, false);
            this.A01 = AnonymousClass6C8.A0b(r3, C1896292a.A00(291), "messages");
        } else {
            Long A0R2 = AnonymousClass0x2.A0R();
            Long A0S2 = AnonymousClass0x2.A0S();
            C626836d.A06(r3, cls, A0R2, A0S2, "error", strArr, false);
            String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            Long l = A0R2;
            Long l2 = A0S2;
            C626836d.A06(r3, cls, A0R2, A0S2, C626836d.A06(A02, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
            AnonymousClass36K r10 = r3;
            this.A01 = C626836d.A06(r10, Jid.class, l, l2, (Object) null, new String[]{"from"}, false);
            this.A00 = AnonymousClass6C8.A0b(r3, C1896292a.A00(290), "error");
        }
        this.A00 = r3;
    }

    public C139756sZ(AnonymousClass36K r23, C35721xK r24) {
        AnonymousClass36K r3 = r23;
        AnonymousClass36K A02 = C41032Ir.A02(r3, r24);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r3, cls, A0R, A0S, "result", strArr, false);
        Class<Jid> cls2 = Jid.class;
        Long l = A0R;
        Long l2 = A0S;
        AnonymousClass36K r15 = r3;
        Class<Jid> cls3 = cls2;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A00 = C626836d.A06(r15, cls3, l3, l4, C626836d.A06(A02, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C626836d.A06(r3, cls, l3, l4, C626836d.A06(A02, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        this.A01 = C626836d.A0B(r3, C1896292a.A00(100), new String[]{"groups", "group"}, 1, 10000);
        this.A00 = r3;
    }
}
