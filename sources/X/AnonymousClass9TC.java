package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;

/* renamed from: X.9TC  reason: invalid class name */
public class AnonymousClass9TC {
    public final C56612sH A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final C1906899l A03;
    public final C195219Wq A04;

    public Intent A00(C624134x r4) {
        if (this.A03.A0E()) {
            return null;
        }
        Intent A08 = AnonymousClass0x9.A08(this.A01.A00, IndiaUpiPaymentsAccountSetupActivity.class);
        A08.putExtra("extra_setup_mode", 2);
        A08.putExtra("extra_payments_entry_type", 2);
        A08.putExtra("extra_is_first_payment_method", true);
        A08.putExtra("extra_skip_value_props_display", false);
        C95814uZ r1 = r4.A1J.A00;
        if (r1 instanceof GroupJid) {
            r1 = r4.A0n();
        }
        String A07 = C627336j.A07(r1);
        A08.putExtra("extra_jid", A07);
        A08.putExtra("extra_inviter_jid", A07);
        AnonymousClass5VI.A00(A08, "acceptInvite");
        return A08;
    }

    public Drawable A01() {
        Context context = this.A01.A00;
        return C195219Wq.A03(context, AnonymousClass1S3.A05, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved), R.dimen.f6nameremoved);
    }

    public AnonymousClass9TC(C56612sH r1, C54292oU r2, AnonymousClass1VX r3, C1906899l r4, C195219Wq r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }
}
