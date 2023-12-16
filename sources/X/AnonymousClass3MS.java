package X;

import java.util.List;

/* renamed from: X.3MS  reason: invalid class name */
public final class AnonymousClass3MS implements AnonymousClass4EJ {
    public final /* synthetic */ C50052hY A00;
    public final /* synthetic */ C58762vm A01;
    public final /* synthetic */ C72383dd A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public AnonymousClass3MS(C50052hY r1, C58762vm r2, C72383dd r3, List list, List list2) {
        this.A01 = r2;
        this.A04 = list;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list2;
    }

    public void BQp() {
        AnonymousClass356.A02("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onDeliveryFailure");
        this.A00.A00();
    }

    public void Bd3(C60272yH r11) {
        AnonymousClass356.A03("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onSuccess");
        C58762vm r6 = this.A01;
        List list = this.A04;
        C50052hY r5 = this.A00;
        C72383dd r7 = this.A02;
        C54662p5 A002 = C54662p5.A00();
        List list2 = this.A03;
        AnonymousClass4AM r3 = r6.A02;
        C50912iy r2 = AnonymousClass2BX.A00;
        C67123Ob r1 = new C67123Ob(r6, r7, list, list2);
        C162457s7.A0J(r2, 1);
        r3.B0i(r2, (AnonymousClass27A) null, r1).Bh4(new C67233Om(A002, r5, r6, r7, list, list2));
    }

    public void BSB(Exception exc) {
        AnonymousClass356.A02(AnonymousClass000.A0a("WaffleEligibilityCheckHelper/makeEligibilityGraphqlCall/pingIfNeeded/onError: ", C18270x1.A0X(exc), exc));
        this.A00.A01(C34581vO.A00);
    }
}
