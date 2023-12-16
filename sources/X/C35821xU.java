package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.1xU  reason: invalid class name and case insensitive filesystem */
public class C35821xU extends C34771vn {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;

    public C35821xU(AnonymousClass36K r24, C35721xK r25) {
        AnonymousClass36K r4 = r24;
        AnonymousClass36K A022 = C41032Ir.A02(r4, r25);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r4, cls, A0R, A0S, "result", strArr, false);
        String[] A1b = AnonymousClass0x9.A1b();
        Class<C27991fJ> cls2 = C27991fJ.class;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A00 = C626836d.A06(r4, cls2, l3, l4, C626836d.A06(A022, cls2, l, l2, (Object) null, new String[]{"to"}, false), A1b, true);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        this.A05 = (String) C626836d.A06(r4, cls, l3, l4, C626836d.A06(A022, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        this.A01 = C626836d.A08(r4, new String[]{"sub_group_suggestions_action", "approve"}, 52);
        this.A04 = C626836d.A08(r4, new String[]{"sub_group_suggestions_action", "reject"}, 53);
        this.A02 = C626836d.A08(r4, new String[]{"sub_group_suggestions_action", "cancel"}, 54);
        this.A00 = r4;
        this.A03 = C626836d.A0C(r4, new String[]{"sub_group_suggestions_action"}, 55).get(0);
    }

    public C35821xU(AnonymousClass36K r22, C35641xC r23) {
        AnonymousClass36K r7 = r22;
        AnonymousClass36K A022 = C41032Ir.A02(r7, r23);
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r7, cls, A0R, A0S, "2", new String[]{"bot", "v"}, false);
        AnonymousClass36K r14 = r7;
        this.A00 = C626836d.A06(r14, UserJid.class, A0R, A0S, (Object) null, new String[]{"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, "jid"}, false);
        this.A05 = (String) C626836d.A06(r7, cls, A0R, A0S, (Object) null, new String[]{"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, "persona_id"}, false);
        this.A04 = C626836d.A02(r7, new C86294Jo(A022, 2), 0);
        this.A03 = C626836d.A0B(r7, C86304Jp.A00(13), new String[]{"bot", "section"}, 1, Long.MAX_VALUE);
        this.A00 = r7;
        this.A02 = C626836d.A0B(r7, C86304Jp.A00(14), new String[]{"bot"}, 1, 1).get(0);
        this.A01 = C626836d.A0B(r7, C86304Jp.A00(15), new String[]{"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, 1, 1).get(0);
    }
}
