package com.whatsapp.payments.ui.invites;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4FU;
import X.C08310eF;
import X.C134246ig;
import X.C1899593h;
import X.C1901794j;
import X.C194209Rz;
import X.C194319Sk;
import X.C196399am;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.List;

public abstract class PaymentInviteFragment extends Hilt_PaymentInviteFragment {
    public C194319Sk A00;
    public C196399am A01;
    public C1901794j A02;
    public PaymentIncentiveViewModel A03;
    public String A04;
    public List A05;

    public static Bundle A01(String str, ArrayList arrayList, boolean z, boolean z2) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("payment_service", 3);
        A08.putParcelableArrayList("user_jids", arrayList);
        A08.putBoolean("requires_sync", z);
        A08.putString("referral_screen", str);
        A08.putBoolean("show_incentive_blurb", z2);
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r6.A0E(X.AnonymousClass9U4.A05(r6.A05), r6.A06.A00()) == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            r3 = r13
            boolean r2 = r13 instanceof com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment
            if (r2 == 0) goto L_0x0029
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r3 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r3
            X.6ig r1 = new X.6ig
            r1.<init>()
            java.lang.String r0 = "payment_invite_prompt"
            r1.A0b = r0
            java.lang.String r0 = r3.A04
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "chat"
        L_0x0016:
            r1.A0a = r0
            r3.A1L(r1)
            java.lang.Integer r0 = X.C18290x4.A0Z()
            r1.A08 = r0
            r3.A1L(r1)
            X.9ca r0 = r3.A0B
            r0.BKA(r1)
        L_0x0029:
            android.os.Bundle r5 = r13.A0H()
            android.os.Bundle r1 = r13.A0H()
            java.lang.String r0 = "user_jids"
            java.util.ArrayList r0 = r1.getParcelableArrayList(r0)
            X.C626936e.A06(r0)
            r13.A05 = r0
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r1.getString(r0)
            r13.A04 = r0
            X.0XL r1 = X.C18290x4.A0O(r13)
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel> r0 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r0
            r13.A03 = r0
            java.lang.String r0 = "show_incentive_blurb"
            boolean r1 = r5.getBoolean(r0)
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0071
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r13.A03
            X.9Vi r1 = r6.A06
            X.9VG r3 = r1.A00()
            X.9U4 r1 = r6.A05
            X.9Tz r1 = X.AnonymousClass9U4.A05(r1)
            boolean r1 = r6.A0E(r1, r3)
            r12 = 1
            if (r1 != 0) goto L_0x0072
        L_0x0071:
            r12 = 0
        L_0x0072:
            r3 = r13
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r3 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r3
            X.5mM r10 = r3.A03
            X.3Ex r7 = r3.A00
            X.5ZU r9 = r3.A02
            X.2rx r8 = r3.A01
            java.lang.String r11 = r3.A04
            X.9Du r6 = new X.9Du
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A01 = r6
            X.0XL r6 = X.C18290x4.A0O(r13)
            java.lang.Class<X.94j> r1 = X.C1901794j.class
            X.0Ty r1 = r6.A01(r1)
            X.94j r1 = (X.C1901794j) r1
            r13.A02 = r1
            java.lang.String r1 = "payment_service"
            r5.getInt(r1)
            X.9am r7 = r13.A01
            r1 = 2131432185(0x7f0b12f9, float:1.848612E38)
            r6 = 2131432184(0x7f0b12f8, float:1.8486118E38)
            if (r7 == 0) goto L_0x00ae
            android.view.View r1 = r15.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00fc
            X.AnonymousClass9LS.A00(r1, r7)
        L_0x00ae:
            java.util.List r1 = r13.A05
            int r1 = r1.size()
            if (r1 != r0) goto L_0x00ee
            java.lang.String r1 = "requires_sync"
            boolean r1 = r5.getBoolean(r1)
            if (r1 == 0) goto L_0x00ee
            X.9am r5 = r13.A01
            r6 = 0
            X.7HR r1 = new X.7HR
            r1.<init>(r0, r6)
            r5.Axq(r1)
            java.util.List r1 = r13.A05
            java.lang.Object r5 = r1.get(r4)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            if (r2 == 0) goto L_0x00e9
            X.94e r2 = r3.A0D
            android.content.Context r4 = r3.A1D()
            X.9Sr r3 = r3.A0A
            X.33l r1 = r2.A03
            java.lang.Boolean r8 = r1.A05()
            X.9on r7 = new X.9on
            r7.<init>(r5, r0, r2)
            r3.A00(r4, r5, r6, r7, r8)
        L_0x00e9:
            X.9am r0 = r13.A01
            r0.A0B = r13
            return
        L_0x00ee:
            X.9am r3 = r13.A01
            r2 = 2
            java.util.List r1 = r13.A05
            X.7HR r0 = new X.7HR
            r0.<init>(r2, r1)
            r3.Axq(r0)
            goto L_0x00e9
        L_0x00fc:
            android.view.View r1 = r15.findViewById(r6)
            r7.BfU(r1)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.PaymentInviteFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1J(int i, boolean z) {
        if (this instanceof IndiaUpiPaymentInviteFragment) {
            IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
            C134246ig r2 = new C134246ig();
            r2.A0b = "payment_invite_prompt";
            String str = indiaUpiPaymentInviteFragment.A04;
            if (str == null) {
                str = "chat";
            }
            r2.A0a = str;
            indiaUpiPaymentInviteFragment.A1L(r2);
            int i2 = 1;
            C1899593h.A1B(r2, 1);
            if (z) {
                i2 = 54;
            }
            r2.A07 = Integer.valueOf(i2);
            r2.A0I = Long.valueOf((long) i);
            indiaUpiPaymentInviteFragment.A0B.BKA(r2);
        }
    }

    public void A1K(boolean z) {
        if (this instanceof IndiaUpiPaymentInviteFragment) {
            IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
            C08310eF r1 = indiaUpiPaymentInviteFragment.A0E;
            if (r1 instanceof PaymentBottomSheet) {
                String str = indiaUpiPaymentInviteFragment.A04;
                new C194209Rz(indiaUpiPaymentInviteFragment.A0R(), (AnonymousClass4FU) indiaUpiPaymentInviteFragment.A0R(), indiaUpiPaymentInviteFragment.A06, indiaUpiPaymentInviteFragment.A08, str, z).A00((PaymentBottomSheet) r1);
                return;
            }
            return;
        }
        this.A02.A0D(4);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }
}
