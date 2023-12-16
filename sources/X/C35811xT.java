package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
public class C35811xT extends C34771vn {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;

    public C35811xT(AnonymousClass36K r11) {
        AnonymousClass36K r3 = r11;
        AnonymousClass36K.A0N(r11, "notification");
        String[] A1b = AnonymousClass0x9.A1b();
        C135206kI r7 = C135206kI.A00;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r3, C135206kI.class, A0R, A0S, r7, A1b, false);
        Class<String> cls = String.class;
        C626836d.A06(r3, cls, A0R, A0S, "contacts", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
        this.A03 = (String) C626836d.A05(r3, cls, A0R, A0S, "clicked_invite_link", new String[]{"invite", "receiver", "reason"}, false);
        this.A01 = C626836d.A06(r3, UserJid.class, A0R, A0S, (Object) null, new String[]{"invite", "receiver", PublicKeyCredentialControllerUtility.JSON_KEY_USER}, false);
        this.A02 = C626836d.A02(r11, C86304Jp.A00(56), 0);
        this.A00 = r11;
        this.A00 = C626836d.A0C(r11, new String[]{"invite", "receiver"}, 57).get(0);
    }

    public C35811xT(AnonymousClass36K r13, C35641xC r14) {
        AnonymousClass36K r5 = r13;
        AnonymousClass36K A022 = C41032Ir.A02(r13, r14);
        this.A03 = (String) C626836d.A05(r5, String.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), "1", new String[]{"bot", "v"}, false);
        this.A02 = C626836d.A02(r13, new C86294Jo(A022, 1), 0);
        this.A00 = C626836d.A0B(r5, C86304Jp.A00(11), new String[]{"bot", "bot"}, 1, Long.MAX_VALUE);
        this.A00 = r13;
        this.A01 = C626836d.A0B(r5, C86304Jp.A00(12), new String[]{"bot"}, 1, 1).get(0);
    }
}
