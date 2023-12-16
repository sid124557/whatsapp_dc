package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Ev  reason: invalid class name */
public class AnonymousClass3Ev implements C84424Ch {
    public final /* synthetic */ AnonymousClass11H A00;

    public AnonymousClass3Ev(AnonymousClass11H r1) {
        this.A00 = r1;
    }

    public void onError(int i) {
        AnonymousClass11H r3 = this.A00;
        if (i == 403) {
            ArrayList A0s = AnonymousClass001.A0s();
            C56942so r5 = r3.A0O;
            C27991fJ r4 = r3.A0s;
            Iterator it = r5.A05(r4).iterator();
            while (it.hasNext()) {
                GroupJid groupJid = AnonymousClass0x7.A0O(it).A02;
                if (groupJid instanceof C27991fJ) {
                    A0s.add(groupJid);
                }
            }
            r5.A0A(r4);
            r3.A0h.A0c(A0s, false);
        } else if (i == 404 && !r3.A0r.A00(r3.A04)) {
            r3.A0O.A09(r3.A0s);
        } else {
            return;
        }
        C06270Wx.A04(r3.A14, i);
    }

    public void onSuccess() {
        AnonymousClass11H r5 = this.A00;
        C27991fJ r4 = r5.A0s;
        C55682qk r6 = r5.A0J;
        AnonymousClass4FS r2 = r5.A17;
        AnonymousClass31C r7 = r5.A0t;
        C66493Lq r1 = r5.A0h;
        C56942so r0 = r5.A0O;
        String A03 = r7.A03();
        r7.A0D(new C68343Su(r6, r1, r4, r2), C385228a.A00(r0.A00(r4), r4, A03), A03, 297, 32000);
        r5.A0v.A02(r4, (C27991fJ) null, r5.A04.A06, 2);
    }
}
