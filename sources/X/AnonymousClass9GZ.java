package X;

import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9GZ  reason: invalid class name */
public class AnonymousClass9GZ extends AnonymousClass5ZM {
    public final AnonymousClass8EA A00;
    public final UserJid A01;
    public final C193609Ph A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A05(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C133676hl r10 = (C133676hl) obj;
        C193609Ph r0 = this.A02;
        AnonymousClass9TK r5 = r0.A03;
        C203179nF r8 = r0.A02;
        UserJid userJid = r0.A00;
        String str = r0.A04;
        if (r8 != null) {
            C204829pz r1 = (C204829pz) r8;
            if (1 - r1.A01 == 0) {
                ((ContactPickerFragment) r1.A00).A19.BjL();
            }
        }
        if (!(r10 == null || r10.A05 == null || TextUtils.isEmpty(r10.A09()))) {
            AnonymousClass9TC A04 = AnonymousClass9U4.A04(r5.A03);
            if (A04 != null && A04.A02.A0X(733) && A04.A03.A0C()) {
                int i = (int) ((r10.A08().A00 >> 12) & 15);
                if (i != 0) {
                    if (i == 1) {
                        r5.A02.A0P(r5.A00.getString(R.string.f11nameremoved), 1);
                        return;
                    } else if (i == 2) {
                        r5.A01(str, C18300x5.A0s(userJid), false);
                        return;
                    } else if (i != 3) {
                        Log.e("PAY: conversation/startPaymentInviteFlow/invalid consumer status");
                        return;
                    }
                }
            }
            Runnable runnable = r5.A06;
            if (runnable != null) {
                if (r8 != null) {
                    String A09 = r10.A09();
                    C204829pz r82 = (C204829pz) r8;
                    if (2 - r82.A01 == 0) {
                        ((C194369Sp) r82.A00).A00 = A09;
                    }
                }
                runnable.run();
                return;
            }
            return;
        }
        r5.A01(str, C18300x5.A0s(userJid), true);
    }

    public AnonymousClass9GZ(AnonymousClass8EA r1, UserJid userJid, C193609Ph r3) {
        this.A00 = r1;
        this.A01 = userJid;
        this.A02 = r3;
    }
}
