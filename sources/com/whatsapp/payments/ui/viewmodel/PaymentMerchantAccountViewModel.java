package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass303;
import X.AnonymousClass3RZ;
import X.AnonymousClass4FS;
import X.AnonymousClass66R;
import X.AnonymousClass6CA;
import X.AnonymousClass7YE;
import X.AnonymousClass8P7;
import X.AnonymousClass8XV;
import X.AnonymousClass8XW;
import X.AnonymousClass8XX;
import X.AnonymousClass906;
import X.AnonymousClass9U4;
import X.AnonymousClass9WE;
import X.C05550Ty;
import X.C06270Wx;
import X.C166587yw;
import X.C171618Ht;
import X.C18260x0;
import X.C1906999m;
import X.C194529Tg;
import X.C203499no;
import X.C29251iW;
import X.C29261iX;
import X.C43942Ub;
import X.C84044Au;

public final class PaymentMerchantAccountViewModel extends C05550Ty {
    public final C43942Ub A00;
    public final C29251iW A01;
    public final C1906999m A02;
    public final C84044Au A03;
    public final C29261iX A04;
    public final AnonymousClass9U4 A05;
    public final C203499no A06;
    public final C194529Tg A07;
    public final AnonymousClass4FS A08;
    public final AnonymousClass66R A09 = AnonymousClass8P7.A00(AnonymousClass8XV.A00);
    public final AnonymousClass66R A0A = AnonymousClass8P7.A00(AnonymousClass8XW.A00);
    public final AnonymousClass66R A0B = AnonymousClass8P7.A00(AnonymousClass8XX.A00);

    public final void A0D(int i) {
        this.A06.BKE((AnonymousClass303) null, AnonymousClass001.A0f(), Integer.valueOf(i), "business_hub", (String) null);
    }

    public static final void A00(AnonymousClass7YE r2, PaymentMerchantAccountViewModel paymentMerchantAccountViewModel) {
        C06270Wx A0J;
        AnonymousClass9WE A022;
        C166587yw r0 = r2.A00;
        if (r0 != null) {
            if (paymentMerchantAccountViewModel.A07.A04(r0.A0A)) {
                paymentMerchantAccountViewModel.A02.A05();
                A0J = AnonymousClass6CA.A0J(paymentMerchantAccountViewModel.A0B);
                A022 = AnonymousClass9WE.A01((Object) null);
            } else {
                A0J = AnonymousClass6CA.A0J(paymentMerchantAccountViewModel.A0B);
                A022 = AnonymousClass9WE.A02((Object) null, (Throwable) null);
            }
            A0J.A0G(A022);
        }
    }

    public static final void A01(PaymentMerchantAccountViewModel paymentMerchantAccountViewModel) {
        AnonymousClass6CA.A0J(paymentMerchantAccountViewModel.A0A).A0G(Boolean.valueOf(AnonymousClass000.A1X(paymentMerchantAccountViewModel.A07.A00())));
    }

    public static final void A02(PaymentMerchantAccountViewModel paymentMerchantAccountViewModel) {
        paymentMerchantAccountViewModel.A07.A02(new AnonymousClass3RZ(paymentMerchantAccountViewModel));
    }

    public static final void A03(PaymentMerchantAccountViewModel paymentMerchantAccountViewModel, boolean z) {
        C06270Wx A0J = AnonymousClass6CA.A0J(paymentMerchantAccountViewModel.A09);
        C194529Tg r1 = paymentMerchantAccountViewModel.A07;
        A0J.A0G(r1.A00());
        if (z) {
            r1.A01();
        }
    }

    public void A0C() {
        this.A04.A07(this.A03);
        this.A01.A07(this.A00);
    }

    public PaymentMerchantAccountViewModel(C29251iW r3, C1906999m r4, C29261iX r5, AnonymousClass9U4 r6, C203499no r7, C194529Tg r8, AnonymousClass4FS r9) {
        C18260x0.A0f(r9, r6, r7, r3, r8);
        C18260x0.A0U(r4, r5);
        this.A08 = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r3;
        this.A07 = r8;
        this.A02 = r4;
        this.A04 = r5;
        AnonymousClass906 r1 = new AnonymousClass906(this, 1);
        this.A00 = r1;
        C171618Ht r0 = new C171618Ht(this);
        this.A03 = r0;
        r5.A06(r0);
        r3.A06(r1);
    }
}
