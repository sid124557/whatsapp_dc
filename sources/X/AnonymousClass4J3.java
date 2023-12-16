package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4J3  reason: invalid class name */
public class AnonymousClass4J3 implements C181798nL {
    public Object A00;
    public final int A01;

    public AnonymousClass4J3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C104325Qn Azv(UserJid userJid) {
        switch (this.A01) {
            case 0:
                AnonymousClass4J3 r3 = this;
                return new C104325Qn((AnonymousClass5UW) ((C118075sx) r3.A00).A03.A4T.get(), (C105145Tt) ((C118075sx) r3.A00).A03.A4V.get(), userJid, (AnonymousClass4FS) ((C118075sx) r3.A00).A03.AbX.get());
            case 1:
                AnonymousClass4J3 r32 = this;
                return new C104325Qn((AnonymousClass5UW) ((C118065sw) r32.A00).A02.A4T.get(), (C105145Tt) ((C118065sw) r32.A00).A02.A4V.get(), userJid, (AnonymousClass4FS) ((C118065sw) r32.A00).A02.AbX.get());
            default:
                return null;
        }
    }
}
