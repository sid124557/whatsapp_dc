package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;

/* renamed from: X.9TK  reason: invalid class name */
public class AnonymousClass9TK {
    public final Context A00;
    public final AnonymousClass4FU A01;
    public final C69263Wi A02;
    public final AnonymousClass9U4 A03;
    public final C1901794j A04;
    public final Runnable A05;
    public final Runnable A06;
    public final boolean A07;

    public void A00(UserJid userJid, C203179nF r11, String str) {
        C626936e.A0B(A02());
        AnonymousClass9U4 r0 = this.A03;
        AnonymousClass9TC A042 = AnonymousClass9U4.A04(r0);
        C626936e.A06(A042);
        C194569Tl A002 = AnonymousClass9U4.A00(r0);
        C193609Ph r3 = new C193609Ph(userJid, A042, r11, this, str);
        C18270x1.A0w(new AnonymousClass9GZ(A002.A01, userJid, r3), A002.A03);
    }

    public final void A01(String str, ArrayList arrayList, boolean z) {
        C1901794j r2 = this.A04;
        r2.A0D(0);
        boolean z2 = this.A07;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = new IndiaUpiPaymentInviteFragment();
        indiaUpiPaymentInviteFragment.A0u(PaymentInviteFragment.A01(str, arrayList, z, z2));
        paymentBottomSheet.A02 = indiaUpiPaymentInviteFragment;
        this.A01.Boo(paymentBottomSheet);
        r2.A00.A0B(paymentBottomSheet, new C205059qM(paymentBottomSheet, 2, this));
    }

    public boolean A02() {
        AnonymousClass9TC A042 = AnonymousClass9U4.A04(this.A03);
        if (A042 == null) {
            return false;
        }
        return A042.A03.A0C();
    }

    public AnonymousClass9TK(Context context, AnonymousClass4FU r2, C69263Wi r3, AnonymousClass9U4 r4, C1901794j r5, Runnable runnable, Runnable runnable2, boolean z) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = context;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = runnable;
        this.A05 = runnable2;
        this.A07 = z;
    }
}
