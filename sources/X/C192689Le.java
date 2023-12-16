package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Le  reason: invalid class name and case insensitive filesystem */
public class C192689Le implements AnonymousClass49D {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C192689Le(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void BrK() {
        if (this.A04 != 0) {
            C193999Re r3 = (C193999Re) this.A00;
            r3.A04.A0G().B64().A02((Activity) this.A01, new C196609bH((AnonymousClass49C) this.A03), r3.A03, (String) C1899593h.A0X((C166557yt) this.A02), false);
            return;
        }
        C56962sq r1 = ((C193999Re) this.A00).A00;
        UserJid A032 = AnonymousClass32Y.A03((Jid) this.A03);
        C626936e.A06(A032);
        r1.A0D((Activity) this.A01, (AnonymousClass49C) this.A02, A032);
    }
}
