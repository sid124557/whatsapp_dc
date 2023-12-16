package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
public final class C35701xI extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("block", "unblock");
    public static final ArrayList A01 = C18260x0.A0C("calls", "marketing_messages");
    public static final ArrayList A02 = AnonymousClass0x2.A0i(new String[]{"profile_view", "quick_action", "suspicious_chat_banner", "system_event_message"});
    public static final ArrayList A03 = AnonymousClass0x2.A0i(new String[]{"no_longer_relevant", "no_sign_up", "spammy_messages", "too_many_messages"});

    public C35701xI(UserJid userJid, String str, String str2, String str3, String str4) {
        C56052rL A002 = C56052rL.A00();
        C56052rL.A0D(A002, "xmlns", "optoutlist");
        C56052rL.A0D(A002, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C626836d.A0G(A002, str);
        C56052rL A04 = C56052rL.A04("item");
        C56052rL.A06(userJid, A04, "jid");
        A04.A0L("marketing_messages", "category", A01);
        A04.A0L(str2, "action", A00);
        A04.A0K(str3, "reason", A03);
        A04.A0K(str4, "entry_point", A02);
        C41032Ir.A06(A04, A002, this);
    }
}
