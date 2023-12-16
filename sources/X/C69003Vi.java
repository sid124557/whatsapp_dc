package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Vi  reason: invalid class name and case insensitive filesystem */
public final class C69003Vi implements AnonymousClass4GF {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public void BhW(C624134x r7, C378824k r8) {
        C162457s7.A0J(r7, 0);
        C624034w r5 = r7.A0P;
        if (r5 != null && r5.A0H()) {
            AnonymousClass36F A0A = ((AnonymousClass9U4) this.A03.get()).A0A();
            C162457s7.A0D(A0A);
            A0A.A0J(r7, true);
            r5.A0F(false);
            ((C53622nO) this.A02.get()).A00(r7);
            AnonymousClass1S4 r0 = r5.A0A;
            if (!(r0 == null || r0.A02 == null || 200 != r5.A03)) {
                C626936e.A00();
                AnonymousClass1S4 r2 = r5.A0A;
                C626936e.A06(r2);
                AnonymousClass39U r02 = r2.A02;
                C626936e.A06(r02);
                C30791n7 A002 = ((C194909Va) this.A01.get()).A00(r02.A02);
                if (A002 != null) {
                    AnonymousClass39W r03 = A002.A00;
                    C626936e.A06(r03);
                    C626936e.A06(r03);
                    AnonymousClass39S r3 = r03.A01;
                    if (r3 != null) {
                        String str = r5.A0K;
                        String str2 = r3.A04;
                        if (str2 == null || str2.length() == 0 || !str2.equals(str)) {
                            r3.A04 = str;
                            ((AnonymousClass35R) this.A00.get()).A0F(A002, A002.A1L);
                        }
                    } else {
                        Log.e("PaymentsDatabaseInserterPostProcessor/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY");
                    }
                }
            }
            if (r8 != null) {
                throw C18260x0.A02(C69003Vi.class);
            }
        }
    }

    public C69003Vi(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        C18260x0.A0c(r1, r2, r3, r4);
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }
}
