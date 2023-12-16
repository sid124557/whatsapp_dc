package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Rd  reason: invalid class name and case insensitive filesystem */
public final class C67913Rd implements AnonymousClass4DJ {
    public final /* synthetic */ AnonymousClass11I A00;

    public C67913Rd(AnonymousClass11I r1) {
        this.A00 = r1;
    }

    public void Bd7(C632738p r11) {
        AnonymousClass11I r0 = this.A00;
        r0.A03.A0G(r0.A0D.A00((C624034w) null, (UserJid) null, (AnonymousClass39I) null, r11.A01, (C30791n7) null, (Boolean) null, r11.A02));
    }

    public void BS6(AnonymousClass34V r15) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("init/getPaymentConfig : failed. Error code = ");
        Log.e(C160757oG.A01("PaymentCheckoutOrderViewModel", AnonymousClass000.A0h(A0o, r15.A00)));
        AnonymousClass11I r0 = this.A00;
        AnonymousClass08M r5 = r0.A03;
        AnonymousClass34W r6 = r0.A0D;
        AnonymousClass212 r4 = AnonymousClass212.GET_PAYMENT_CONFIG_FAILED;
        int A02 = C18320x8.A02(r4, 0);
        int i = R.string.f11nameremoved;
        int i2 = R.string.f11nameremoved;
        if (A02 != 1) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        }
        r5.A0G(r6.A00((C624034w) null, (UserJid) null, new AnonymousClass39I(r4, i, i2), (AnonymousClass213) null, (C30791n7) null, (Boolean) null, (List) null));
    }
}
