package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4J1  reason: invalid class name */
public class AnonymousClass4J1 implements C181728nE {
    public Object A00;
    public final int A01;

    public AnonymousClass4J1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C87604Ty Azu(UserJid userJid) {
        UserJid userJid2 = userJid;
        switch (this.A01) {
            case 0:
                AnonymousClass4J1 r1 = this;
                C56972sr r4 = (C56972sr) ((C118075sx) r1.A00).A03.AJW.get();
                Application A002 = C69773Yi.A00(((C118075sx) r1.A00).A03.AdE);
                C56422rx r8 = (C56422rx) ((C118075sx) r1.A00).A03.AZn.get();
                C620433g r6 = (C620433g) ((C118075sx) r1.A00).A03.A3v.get();
                C29291ia r7 = (C29291ia) ((C118075sx) r1.A00).A03.A3w.get();
                return new C87604Ty(A002, r4, (C105035Th) ((C118075sx) r1.A00).A03.A3s.get(), r6, r7, r8, userJid2, (AnonymousClass4FS) ((C118075sx) r1.A00).A03.AbX.get());
            case 1:
                AnonymousClass4J1 r12 = this;
                C56972sr r42 = (C56972sr) ((C118065sw) r12.A00).A02.AJW.get();
                Application A003 = C69773Yi.A00(((C118065sw) r12.A00).A02.AdE);
                C56422rx r82 = (C56422rx) ((C118065sw) r12.A00).A02.AZn.get();
                C620433g r62 = (C620433g) ((C118065sw) r12.A00).A02.A3v.get();
                C29291ia r72 = (C29291ia) ((C118065sw) r12.A00).A02.A3w.get();
                return new C87604Ty(A003, r42, (C105035Th) ((C118065sw) r12.A00).A02.A3s.get(), r62, r72, r82, userJid2, (AnonymousClass4FS) ((C118065sw) r12.A00).A02.AbX.get());
            default:
                return null;
        }
    }
}
