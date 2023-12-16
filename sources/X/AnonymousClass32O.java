package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.32O  reason: invalid class name */
public class AnonymousClass32O {
    public final Handler A00 = new C18880yP(Looper.getMainLooper(), this);
    public final C29411im A01;
    public final AnonymousClass1VX A02;
    public final C66503Lr A03;
    public final C50022hV A04;
    public final AnonymousClass31C A05;
    public final HashMap A06 = AnonymousClass001.A0t();

    public AnonymousClass32O(C29411im r3, AnonymousClass1VX r4, C66503Lr r5, C50022hV r6, AnonymousClass31C r7) {
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
    }

    public static /* synthetic */ void A00(AnonymousClass32O r6, C95814uZ r7) {
        C18260x0.A1P(AnonymousClass001.A0o(), "HandleMeComposing/before/write/Paused; toJid=", r7);
        AnonymousClass31C r62 = r6.A05;
        C35471wv r4 = new C35471wv();
        C56052rL A042 = C56052rL.A04("chatstate");
        Class[] clsArr = new Class[2];
        clsArr[0] = C27991fJ.class;
        if (C626836d.A0I(r7, "to", AnonymousClass0x9.A1A(UserJid.class, clsArr, 1), false)) {
            C56052rL.A06(r7, A042, "to");
        }
        C41032Ir.A09(A042, r4);
        r62.A0G(A042.A0F(), 5);
        C18260x0.A1R(AnonymousClass001.A0o(), "HandleMeComposing/write/paused; toJid=", r7);
    }

    public static /* synthetic */ void A01(AnonymousClass32O r7, C95814uZ r8, int i) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HandleMeComposing/handleComposing; toJid=");
        A0o.append(r8);
        C18260x0.A0w("; media=", A0o, i);
        AnonymousClass31C r5 = r7.A05;
        if (i == 1) {
            str = "audio";
        } else {
            str = null;
        }
        C35471wv r6 = new C35471wv("audio".equals(str));
        C56052rL A042 = C56052rL.A04("chatstate");
        Class[] clsArr = new Class[2];
        clsArr[0] = C27991fJ.class;
        if (C626836d.A0I(r8, "to", AnonymousClass0x9.A1A(UserJid.class, clsArr, 1), false)) {
            C56052rL.A06(r8, A042, "to");
        }
        C41032Ir.A09(A042, r6);
        r5.A0G(A042.A0F(), 4);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("HandleMeComposing/sendComposing; toJid=");
        A0o2.append(r8);
        C18260x0.A0y("; media=", A0o2, i);
    }
}
