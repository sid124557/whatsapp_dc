package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.9Gb  reason: invalid class name and case insensitive filesystem */
public class C191719Gb extends AnonymousClass5ZM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiBankAccountDetailsActivity A01;
    public final /* synthetic */ Runnable A02;

    public C191719Gb(IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity, Runnable runnable, int i) {
        this.A01 = indiaUpiBankAccountDetailsActivity;
        this.A00 = i;
        this.A02 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = this.A01;
        AnonymousClass36F A012 = AnonymousClass9U4.A01(indiaUpiBankAccountDetailsActivity.A0D);
        Integer[] numArr = new Integer[2];
        boolean A1Y = C18300x5.A1Y(numArr, 417);
        numArr[1] = 418;
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1P(numArr2, 40, A1Y ? 1 : 0);
        if (A012.A0R(indiaUpiBankAccountDetailsActivity.A00.A0A, numArr, numArr2, 1).size() > 0) {
            A1Y = true;
        }
        return Boolean.valueOf(A1Y);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass001.A1Z(obj)) {
            C621433s.A01(this.A01, this.A00);
        } else {
            this.A02.run();
        }
    }
}
