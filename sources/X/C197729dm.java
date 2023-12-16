package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.9dm  reason: invalid class name and case insensitive filesystem */
public final class C197729dm implements AnonymousClass4EZ {
    public final /* synthetic */ C202579mF A00;
    public final /* synthetic */ C137006nc A01;
    public final /* synthetic */ C35711xJ A02;
    public final /* synthetic */ String A03;

    public void BSN(AnonymousClass36K r5, String str) {
        C162457s7.A0J(r5, 1);
        C202579mF r3 = this.A00;
        new C139746sY(r5, this.A02, 10);
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = ((AnonymousClass9c9) r3).A00;
        indiaUpiBankAccountDetailsActivity.A04.BkS(new AnonymousClass9g0(indiaUpiBankAccountDetailsActivity));
    }

    public void BdM(AnonymousClass36K r21, String str) {
        C69263Wi r2;
        Runnable r1;
        AnonymousClass36K r13 = r21;
        C162457s7.A0J(r13, 1);
        C35711xJ r22 = this.A02;
        AnonymousClass36K A022 = C41032Ir.A02(r13, r22);
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        Class<String> cls2 = cls;
        Long l = A0R;
        Long l2 = A0S;
        C626836d.A06(r13, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        C626836d.A06(r13, Long.class, AnonymousClass0x2.A0U(), l2, (Object) null, new String[]{"account", "version"}, false);
        String A0A = C626836d.A0A(r13, C192239Is.A00, new String[]{"account", "international-payments-status"});
        C626836d.A04(r13, new C205019qI(A022, 11), new String[0]);
        C205029qJ.A02(r13, new String[]{"account"}, 49);
        if (C162457s7.A0P(A0A, "deactivated")) {
            this.A01.A01.A01(this.A03);
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = ((AnonymousClass9c9) this.A00).A00;
            r2 = indiaUpiBankAccountDetailsActivity.A04;
            r1 = new C199099fz(indiaUpiBankAccountDetailsActivity);
        } else {
            C202579mF r3 = this.A00;
            new C139746sY(r13, r22, 10);
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = ((AnonymousClass9c9) r3).A00;
            r2 = indiaUpiBankAccountDetailsActivity2.A04;
            r1 = new AnonymousClass9g0(indiaUpiBankAccountDetailsActivity2);
        }
        r2.BkS(r1);
    }

    public C197729dm(C202579mF r1, C137006nc r2, C35711xJ r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
    }

    public void BQs(String str) {
        Log.e("deactivateInternationalPayments/onDeactivateInternational/onDeliveryFailure");
    }
}
