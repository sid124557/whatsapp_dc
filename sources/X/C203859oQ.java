package X;

import com.whatsapp.R;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.Collection;

/* renamed from: X.9oQ  reason: invalid class name and case insensitive filesystem */
public class C203859oQ extends C56602sG {
    public Object A00;
    public final int A01;

    public C203859oQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(C95814uZ r3) {
        if (1 - this.A01 != 0) {
            super.A03(r3);
        } else if (r3 != null) {
            AnonymousClass9Bs r1 = (AnonymousClass9Bs) this.A00;
            if (r3.equals(r1.A0E)) {
                r1.A7u();
            }
        }
    }

    public void A04(C95814uZ r3) {
        if (1 - this.A01 != 0) {
            super.A04(r3);
        } else if (r3 != null) {
            AnonymousClass9Bs r1 = (AnonymousClass9Bs) this.A00;
            if (r3.equals(r1.A0E)) {
                r1.A7u();
            }
        }
    }

    public void A06(UserJid userJid) {
        if (1 - this.A01 != 0) {
            super.A06(userJid);
        } else if (userJid != null) {
            AnonymousClass9Bs r1 = (AnonymousClass9Bs) this.A00;
            if (userJid.equals(r1.A0E)) {
                r1.A7u();
            }
        }
    }

    public void A08(Collection collection) {
        switch (this.A01) {
            case 0:
                ChangeEphemeralSettingActivity changeEphemeralSettingActivity = (ChangeEphemeralSettingActivity) this.A00;
                C95814uZ r2 = changeEphemeralSettingActivity.A0I;
                if ((r2 instanceof UserJid) && changeEphemeralSettingActivity.A04.A0P(AnonymousClass32Y.A03(r2)) && !changeEphemeralSettingActivity.isFinishing()) {
                    C69263Wi r22 = changeEphemeralSettingActivity.A05;
                    int i = changeEphemeralSettingActivity.A02;
                    int i2 = R.string.f11nameremoved;
                    if (i == 0) {
                        i2 = R.string.f11nameremoved;
                    }
                    r22.A0H(i2, 1);
                    changeEphemeralSettingActivity.finish();
                    return;
                }
                return;
            case 2:
                ((PaymentGroupParticipantPickerActivity) this.A00).A0E.notifyDataSetChanged();
                return;
            default:
                super.A08(collection);
                return;
        }
    }
}
