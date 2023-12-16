package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Re  reason: invalid class name and case insensitive filesystem */
public class C193999Re {
    public final C56962sq A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final AnonymousClass9U5 A03;
    public final AnonymousClass9U4 A04;

    public void A00(Activity activity, AnonymousClass49C r18, UserJid userJid, C166557yt r20, boolean z, boolean z2) {
        Object A0X;
        C192689Le r4;
        Activity activity2 = activity;
        UserJid userJid2 = userJid;
        boolean A1W = AnonymousClass000.A1W(userJid2);
        int i = R.string.f11nameremoved;
        if (z2) {
            i = R.string.f11nameremoved;
        }
        Object[] objArr = new Object[1];
        C166557yt r12 = r20;
        if (A1W) {
            A0X = this.A02.A0H(this.A01.A0A(userJid2));
        } else {
            A0X = C1899593h.A0X(r12);
        }
        String A0F = AnonymousClass002.A0F(activity2, A0X, objArr, 0, i);
        AnonymousClass49C r6 = r18;
        if (A1W) {
            r4 = new C192689Le(activity2, r6, userJid2, this, 0);
        } else if (this.A04.A0G().B64() != null) {
            r4 = new C192689Le(activity2, r12, r6, this, 1);
        } else {
            r4 = null;
        }
        ((AnonymousClass4FU) activity2).Boo(UnblockDialogFragment.A00(r4, A0F, 0, z));
    }

    public C193999Re(C56962sq r1, C64773Ex r2, AnonymousClass5ZU r3, AnonymousClass9U5 r4, AnonymousClass9U4 r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }
}
