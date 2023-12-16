package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public final class C34941w4 extends C41022Iq {
    public static final ArrayList A01 = C18260x0.A0C("false", "true");
    public final UserJid A00;

    public C34941w4(AnonymousClass36K r10) {
        AnonymousClass36K.A0N(r10, "bot");
        this.A00 = (UserJid) C626836d.A06(r10, UserJid.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"jid"}, false);
        C41022Iq.A01(r10, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, A01);
        this.A00 = r10;
    }
}
