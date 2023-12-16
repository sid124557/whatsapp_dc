package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4xx  reason: invalid class name and case insensitive filesystem */
public final class C97254xx extends AnonymousClass94y {
    public C203719oC A0D() {
        C203719oC A0H = this.A0b.A0H("P2M_LITE");
        C162457s7.A0H(A0H);
        return A0H;
    }

    public AnonymousClass9NZ A0G() {
        C624034w r0;
        AnonymousClass1S4 r02;
        String A0J;
        C191479Fb r2 = new C191479Fb();
        r2.A04 = this.A0O.A00.getString(R.string.f11nameremoved);
        C193629Pj r03 = this.A06;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || (A0J = r02.A0J()) == null) {
            return null;
        }
        r2.A03 = A0J;
        return r2;
    }

    public C97254xx(Bundle bundle, C69263Wi r2, C56972sr r3, C620433g r4, C56962sq r5, C64773Ex r6, C620633i r7, C56612sH r8, C54292oU r9, C620733j r10, C66543Lv r11, C194909Va r12, AnonymousClass36F r13, C617332a r14, AnonymousClass8EA r15, C194539Ti r16, C1906899l r17, C620933l r18, C29271iY r19, C1907099n r20, AnonymousClass9U4 r21, AnonymousClass9b0 r22, AnonymousClass9TZ r23, C203499no r24, C194969Vi r25, AnonymousClass9Tp r26, C158777kX r27, AnonymousClass9V7 r28, C195219Wq r29, AnonymousClass4FS r30) {
        super(bundle, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
    }

    public void A0S(List list) {
        C624034w r0;
        UserJid userJid;
        C624034w r10;
        C624034w r4;
        A0R(list);
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass9NZ A0G = A0G();
        if (A0G != null) {
            A0s.add(A0G);
        }
        C193629Pj r02 = this.A06;
        if (!(r02 == null || (r4 = r02.A01) == null)) {
            C191479Fb r2 = new C191479Fb();
            Context context = this.A0O.A00;
            r2.A04 = context.getString(R.string.f11nameremoved);
            r2.A03 = context.getString(this.A0k.A0B(r4));
            A0s.add(r2);
        }
        C193629Pj r03 = this.A06;
        if (!(r03 == null || (r10 = r03.A01) == null)) {
            C191479Fb r5 = new C191479Fb();
            Context context2 = this.A0O.A00;
            r5.A04 = context2.getString(R.string.f11nameremoved);
            Object[] A0L = AnonymousClass002.A0L();
            C620733j r7 = this.A0P;
            C56612sH r9 = this.A0N;
            r5.A03 = C86614Ku.A0s(context2, C107175ap.A04(r7, C107505bQ.A03(r7, r9.A0I(r10.A06)), C107145am.A00(r7, r9.A0I(r10.A06))), A0L, R.string.f11nameremoved);
            A0s.add(r5);
        }
        if (AnonymousClass0x7.A1S(A0s)) {
            AnonymousClass94y.A01(list);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                list.add(it.next());
                list.add(new AnonymousClass9FF());
            }
        }
        C1907099n r3 = this.A0a;
        if (r3.A0D()) {
            AnonymousClass9FW r1 = new AnonymousClass9FW();
            r1.A02 = "";
            list.add(r1);
            list.add(new AnonymousClass9FF());
            AnonymousClass9FS r22 = new AnonymousClass9FS();
            r22.A01 = true;
            r22.A00 = new C1235468v(this, 4);
            list.add(r22);
        }
        list.add(new AnonymousClass9FF());
        AnonymousClass9FW r52 = new AnonymousClass9FW();
        if (r3.A0D()) {
            r52.A00 = "756694756131577";
            r52.A01 = "p2m-lite-learn-more-link";
        } else {
            C54292oU r72 = this.A0O;
            Context context3 = r72.A00;
            Object[] A0L2 = AnonymousClass002.A0L();
            C193629Pj r04 = this.A06;
            String str = null;
            if (!(r04 == null || (r0 = r04.A01) == null || (userJid = r0.A0D) == null)) {
                AnonymousClass3ZH A0A = this.A0L.A0A(userJid);
                String A0J = A0A.A0J();
                if (A0J == null || !(!C175738Zn.A0V(A0J))) {
                    String A0L3 = A0A.A0L();
                    str = (A0L3 == null || !(C175738Zn.A0V(A0L3) ^ true)) ? C54292oU.A00(r72).getString(R.string.f11nameremoved) : A0A.A0L();
                } else {
                    str = A0A.A0J();
                }
            }
            r52.A02 = C86614Ku.A0s(context3, str, A0L2, R.string.f11nameremoved);
        }
        list.add(r52);
    }
}
