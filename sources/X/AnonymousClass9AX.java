package X;

import android.content.Context;

/* renamed from: X.9AX  reason: invalid class name */
public class AnonymousClass9AX extends C1908099x {
    public final /* synthetic */ AnonymousClass9VD A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AX(Context context, C69263Wi r13, C40602Ha r14, C153607bd r15, AnonymousClass9VD r16, C197109ca r17, AnonymousClass9B3 r18, String str, String str2, String str3) {
        super(context, r13, r14, r15, r17, r18, "upi-bind-device", str, 20);
        this.A00 = r16;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final void A06(AnonymousClass34V r7) {
        AnonymousClass9VD r5 = this.A00;
        if (r5.A01 != null) {
            if (r7.A00 == 11453) {
                String A03 = r5.A0H.A03();
                C196629bS r0 = r5.A0B;
                String str = this.A01;
                String str2 = this.A02;
                r0.A0J(str, str2, A03);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1L(A0o, C1908099x.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A03, A0o));
            }
            r5.A01.BQy(r7);
        }
    }

    public void A03(AnonymousClass34V r3) {
        super.A03(r3);
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r3);
        A06(r3);
    }

    public void A04(AnonymousClass34V r3) {
        super.A04(r3);
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r3);
        A06(r3);
    }

    public void A05(AnonymousClass36K r7) {
        super.A05(r7);
        AnonymousClass9VD r5 = this.A00;
        String A03 = r5.A0H.A03();
        C196629bS r0 = r5.A0B;
        String str = this.A01;
        String str2 = this.A02;
        r0.A0J(str, str2, A03);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1L(A0o, C1908099x.A01("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ", str, str2, A03, A0o));
        C203039n1 r1 = r5.A01;
        if (r1 != null) {
            r1.BQy((AnonymousClass34V) null);
        }
    }
}
