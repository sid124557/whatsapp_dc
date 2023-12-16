package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.2nX  reason: invalid class name and case insensitive filesystem */
public class C53712nX {
    public C53242mm A00;
    public final C89644eZ A01;
    public final C56962sq A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final RequestPhoneNumberViewModel A05;
    public final C183538qC A06;

    public void A00(C27981fH r7, Integer num) {
        C89644eZ r5 = this.A01;
        if (r5 != null) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
            A002.A05 = R.string.f11nameremoved;
            A002.A0B = new Object[0];
            AnonymousClass4I1 r1 = new AnonymousClass4I1(12);
            A002.A04 = R.string.f11nameremoved;
            A002.A07 = r1;
            A002.A01(new C85834Hu(num, r7, this, 4), R.string.f11nameremoved);
            C18270x1.A0t(A002.A00(), r5);
            RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A05;
            if (requestPhoneNumberViewModel != null) {
                int intValue = num.intValue();
                C162457s7.A0J(r7, 0);
                requestPhoneNumberViewModel.A05.A00(r7, 2, intValue, true);
            }
        }
    }

    public void A01(Integer num) {
        C53242mm r3 = (C53242mm) this.A05.A01.A07();
        if (r3 == null) {
            return;
        }
        if (!r3.A02) {
            this.A01.Bon(((AnonymousClass3LX) ((C48062eH) this.A06.get()).A02(AnonymousClass3LX.class)).A00(r3.A01, num.intValue()), "SharePhoneNumberBottomSheet");
        } else if (r3.A04) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
            A002.A05 = R.string.f11nameremoved;
            A002.A0B = new Object[0];
            C18270x1.A0t(A002.A00(), this.A01);
        } else {
            A00(r3.A01, num);
        }
    }

    public boolean A02(Jid jid) {
        C53242mm r1;
        if (!(jid instanceof C27981fH) || (r1 = this.A00) == null || (r1.A03 && r1.A02)) {
            return true;
        }
        return false;
    }

    public C53712nX(C89644eZ r1, C56962sq r2, C64773Ex r3, AnonymousClass5ZU r4, RequestPhoneNumberViewModel requestPhoneNumberViewModel, C183538qC r6) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = requestPhoneNumberViewModel;
    }
}
