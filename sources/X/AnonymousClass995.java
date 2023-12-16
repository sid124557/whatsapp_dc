package X;

import com.whatsapp.payments.ui.PaymentInvitePickerActivity;

/* renamed from: X.995  reason: invalid class name */
public abstract class AnonymousClass995 extends C89634eX {
    public boolean A00 = false;

    public static void A0L(C88834as r1, C64333Db r2, C89634eX r3, C620733j r4) {
        r3.A0N = r4;
        C107545bU.A02((C29301ib) r2.A57.get(), r3);
        C107545bU.A06(r1.ABp(), r3);
        C107545bU.A09(r3, (C29241iV) r2.AGn.get());
        C107545bU.A08(r3, (C53592nL) r2.A6M.get());
        C107545bU.A0B(r3, (AnonymousClass2ML) r2.AIy.get());
        C107545bU.A01((AnonymousClass64J) r2.AEN.get(), r3);
    }

    public static void A0X(C107695bk r1, C89634eX r2) {
        C1001659u.A00(r2, new AnonymousClass5QT());
        C107545bU.A00((C48852fa) r1.ABc.get(), r2);
        C107545bU.A07(r2, (C53802nh) r1.A6e.get());
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            PaymentInvitePickerActivity paymentInvitePickerActivity = (PaymentInvitePickerActivity) this;
            C88834as r4 = (C88834as) AnonymousClass0x9.A0K(this);
            C64333Db r2 = r4.A4Z;
            C1899593h.A15(r2, paymentInvitePickerActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, paymentInvitePickerActivity, C1899593h.A0W(r2, r1, paymentInvitePickerActivity));
            A0X(r1, paymentInvitePickerActivity);
            C107545bU.A0A(paymentInvitePickerActivity, C86614Ku.A0k(r2));
            C107545bU.A05(C86604Kt.A0S(r2), paymentInvitePickerActivity);
            paymentInvitePickerActivity.A0B = C64333Db.A26(r2);
            paymentInvitePickerActivity.A0D = C86604Kt.A0R(r2);
            paymentInvitePickerActivity.A08 = C86654Ky.A0T(r2);
            C107545bU.A04(C86604Kt.A0Q(r2), paymentInvitePickerActivity);
            C107545bU.A03(C86614Ku.A0P(r2), paymentInvitePickerActivity);
            A0L(r4, r2, paymentInvitePickerActivity, C64333Db.A2t(r2));
            paymentInvitePickerActivity.A00 = C1899593h.A0I(r2);
        }
    }

    public AnonymousClass995() {
        C204019og.A00(this, 109);
    }
}
