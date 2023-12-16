package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9GK  reason: invalid class name */
public class AnonymousClass9GK extends AnonymousClass5ZM {
    public final C64223Cq A00;
    public final UserJid A01;
    public final AnonymousClass9U4 A02;

    public AnonymousClass9GK(C64223Cq r1, UserJid userJid, AnonymousClass9U4 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = userJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        UserJid userJid = this.A01;
        if (userJid != null) {
            A0s.add(userJid);
        }
        if (!this.A00.A00(C59812xW.A0M, AnonymousClass227.A0C, A0s).A00()) {
            return Boolean.FALSE;
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass9U4.A03(this.A02).A0H((UserJid) it.next());
        }
        return Boolean.TRUE;
    }
}
