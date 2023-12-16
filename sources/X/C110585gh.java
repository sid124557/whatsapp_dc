package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5gh  reason: invalid class name and case insensitive filesystem */
public class C110585gh implements C17190ui {
    public final C101015Dd A00;
    public final C104325Qn A01;
    public final UserJid A02;

    public C05550Ty Azr(Class cls) {
        C101015Dd r0 = this.A00;
        UserJid userJid = this.A02;
        C104325Qn r9 = this.A01;
        C118075sx r4 = r0.A00;
        C64333Db r3 = r4.A03;
        C56612sH A2p = C64333Db.A2p(r3);
        AnonymousClass1VX A4B = C64333Db.A4B(r3);
        C56972sr A06 = C64333Db.A06(r3);
        Application A002 = C69773Yi.A00(r3.AdE);
        C105255Ue A0a = C86644Kx.A0a(r3);
        C107695bk r02 = r3.A00;
        C105145Tt A0P = C86644Kx.A0P(r3);
        C104975Tb AhS = r3.AhS();
        C620433g A0K = C86624Kv.A0K(r3);
        C88744aj r13 = C88744aj.A00;
        C104325Qn r24 = r9;
        C55752qr r26 = (C55752qr) r02.A2K.get();
        UserJid userJid2 = userJid;
        C103115Lp r30 = (C103115Lp) r02.A8P.get();
        C105405Uu r20 = (C105405Uu) r3.A4W.get();
        AnonymousClass5QB r21 = (AnonymousClass5QB) r02.A2H.get();
        AnonymousClass5Y9 r23 = (AnonymousClass5Y9) r3.A4Y.get();
        return new C87614Tz(A002, r13, A06, (C105035Th) r3.A3s.get(), A0K, (C48372en) r3.A3x.get(), new C154197cm(), r4.A01.ABU(), r20, r21, A0P, r23, r24, AhS, r26, A2p, A4B, userJid2, r30, A0a, C64333Db.A8y(r3));
    }

    public C110585gh(C101015Dd r1, C104325Qn r2, UserJid userJid) {
        this.A02 = userJid;
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
