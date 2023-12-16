package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gl  reason: invalid class name and case insensitive filesystem */
public final class C191789Gl extends AnonymousClass5ZM {
    public final C64773Ex A00;
    public final C194909Va A01;
    public final AnonymousClass9NU A02;
    public final C194819Up A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191789Gl(C64773Ex r2, C194909Va r3, AnonymousClass9NU r4, PaymentSettingsFragment paymentSettingsFragment, C194819Up r6) {
        super(paymentSettingsFragment, true);
        C162457s7.A0J(r2, 2);
        C162457s7.A0J(r3, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass9OT r9 = (AnonymousClass9OT) obj;
        C162457s7.A0J(r9, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        List list = r9.A00;
        indiaUpiPaymentSettingsFragment.A0V = list;
        List list2 = r9.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("IndiaUpiPaymentSettingsFragment:fetchAndDisplayRecentMerchantsContacts List of paid merchants: ", A0o, list);
        AnonymousClass0x2.A18(A0o);
        if (!list2.isEmpty()) {
            AnonymousClass31C r5 = indiaUpiPaymentSettingsFragment.A0B;
            C66413Li r4 = indiaUpiPaymentSettingsFragment.A07;
            AnonymousClass9H1 r1 = new AnonymousClass9H1(indiaUpiPaymentSettingsFragment.A05, indiaUpiPaymentSettingsFragment.A0S, r4, r5, indiaUpiPaymentSettingsFragment, list2);
            indiaUpiPaymentSettingsFragment.A06 = r1;
            AnonymousClass0x7.A1B(r1, indiaUpiPaymentSettingsFragment.A15);
            return;
        }
        indiaUpiPaymentSettingsFragment.A1r(indiaUpiPaymentSettingsFragment.A0V);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A002;
        List A0s;
        AnonymousClass3Z6 r0;
        AnonymousClass39W r02;
        AnonymousClass39S r1;
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A00.A0h(A0s2);
        List<C30791n7> A022 = this.A01.A02();
        C194819Up r12 = this.A03;
        if (r12.A03) {
            List list = r12.A01;
            ArrayList A0s3 = AnonymousClass001.A0s();
            if (A022.isEmpty()) {
                r0 = new AnonymousClass3Z6(A0s3, list);
            } else {
                HashMap A0t = AnonymousClass001.A0t();
                Iterator it = A0s2.iterator();
                while (it.hasNext()) {
                    C1899593h.A1T(A0t, it);
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1H("PaymentContactFilterUtils/filterTopCheckoutContacts latestCheckoutMessages size: ", A0o, A022);
                AnonymousClass0x2.A18(A0o);
                ArrayList A0s4 = AnonymousClass001.A0s();
                for (C30791n7 r13 : A022) {
                    C95814uZ r03 = r13.A1J.A00;
                    String str = null;
                    if (r03 != null) {
                        str = r03.getRawString();
                    }
                    Object obj = A0t.get(str);
                    if (!(obj == null || A0s3.contains(obj) || (r02 = r13.A00) == null || (r1 = r02.A01) == null)) {
                        if (AnonymousClass39S.A00(r1.A07.A01) != 1 || r1.A04 != null || r1.A05) {
                            A0s4.add(String.valueOf(str));
                            A0s3.add(obj);
                        }
                    }
                }
                ArrayList A0s5 = AnonymousClass001.A0s();
                if (A0s3.size() < 3) {
                    int i = 0;
                    int i2 = 0;
                    while (i < Math.min(3 - (A0s3.size() - i2), list.size())) {
                        String A0n = AnonymousClass001.A0n(list, i);
                        i++;
                        if (A0s4.contains(AnonymousClass32X.A00(A0n).getRawString())) {
                            i2++;
                        } else {
                            A0s5.add(A0n);
                        }
                    }
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("PaymentContactFilterUtils/filterTopCheckoutContacts paidMerchantContacts size: ");
                A0o2.append(A0s3.size());
                C18260x0.A1A(" unsavedMerchants ", A0o2, A0s5);
                r0 = new AnonymousClass3Z6(A0s3, A0s5);
            }
            A002 = (List) r0.first;
            A0s = (List) r0.second;
        } else {
            A002 = AnonymousClass9Lr.A00(A0s2, A022);
            A0s = AnonymousClass001.A0s();
        }
        return new AnonymousClass9OT(A002, A0s);
    }
}
