package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1vx  reason: invalid class name and case insensitive filesystem */
public final class C34871vx extends C41022Iq {
    public final UserJid A00;
    public final Long A01;
    public final String A02;
    public final List A03;

    public C34871vx(AnonymousClass36K r9) {
        AnonymousClass36K r1 = r9;
        AnonymousClass36K.A0N(r9, "bot");
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        this.A00 = (UserJid) C626836d.A06(r1, UserJid.class, A0R, A0S, (Object) null, new String[]{"jid"}, false);
        this.A02 = (String) C626836d.A06(r1, String.class, A0R, A0S, (Object) null, new String[]{"persona_id"}, false);
        this.A01 = (Long) C626836d.A05(r1, Long.class, A0R, A0S, (Object) null, new String[]{"count"}, false);
        this.A03 = C626836d.A0B(r1, C86304Jp.A00(17), new String[]{"theme"}, 0, 2);
        this.A00 = r9;
    }
}
