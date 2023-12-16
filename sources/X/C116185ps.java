package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ps  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116185ps implements C183208pf {
    public final /* synthetic */ C111975iz A00;
    public final /* synthetic */ UserJid A01;

    public final void BPB() {
        C111975iz r6 = this.A00;
        UserJid userJid = this.A01;
        C179058iX r0 = r6.A0F.A04;
        if (r0 != null) {
            ((C170738Ei) r0).A00.A04(6);
        }
        String A002 = r6.A09.A00(r6.A00);
        if ("UNBLOCKED".equals(A002)) {
            r6.A0I.A00();
            C111095hX r4 = r6.A06;
            Context context = r6.A04;
            int i = 9;
            if (r6.A0K) {
                i = 13;
            }
            r4.A0A(context, C627736r.A0c(context, userJid, (Integer) null, i));
            return;
        }
        r6.A0H.A02(r6.A04, A002);
    }

    public /* synthetic */ C116185ps(C111975iz r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }
}
