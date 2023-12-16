package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8JI  reason: invalid class name */
public class AnonymousClass8JI implements AnonymousClass4EZ {
    public final /* synthetic */ C15790rw A00;
    public final /* synthetic */ C15790rw A01;
    public final /* synthetic */ C15790rw A02;
    public final /* synthetic */ C102585Jk A03;
    public final /* synthetic */ C35721xK A04;
    public final /* synthetic */ Runnable A05;

    public AnonymousClass8JI(C15790rw r1, C15790rw r2, C15790rw r3, C102585Jk r4, C35721xK r5, Runnable runnable) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r1;
        this.A05 = runnable;
        this.A02 = r2;
        this.A00 = r3;
    }

    public void BQs(String str) {
        this.A00.AwB(C18290x4.A0Z());
    }

    public void BSN(AnonymousClass36K r4, String str) {
        try {
            AnonymousClass4B7[] r2 = new AnonymousClass4B7[7];
            C1896292a.A0U(r2, 193, AnonymousClass92Z.A03(C41032Ir.A02(r4, this.A04), r4, 27) ? 1 : 0);
            C1896292a.A0P(r2, 194);
            C1896292a.A0Q(r2, 195);
            C1896292a.A0R(r2, 196);
            C1896292a.A0S(r2, 197);
            C1896292a.A0T(r2, 198);
            r2[6] = C1896292a.A00(199);
            ((C183458q4) C626836d.A07(r4, "IQErrorRateOverlimit|IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorForbidden|IQErrorLocked|IQErrorFallbackClient", AnonymousClass0x2.A0i(r2), AnonymousClass6CA.A0i())).AwD(new C157177hr(this));
        } catch (AnonymousClass24Y unused) {
            this.A01.AwB(AnonymousClass001.A0f());
        }
    }

    public void BdM(AnonymousClass36K r12, String str) {
        int i;
        try {
            AnonymousClass36K r4 = r12;
            boolean A032 = AnonymousClass92Z.A03(C41032Ir.A02(r12, this.A04), r12, 28);
            C626836d.A0B(r4, C1896292a.A00(200), new String[]{"leave", "group"}, 0, 1024);
            List<C138956rH> A0B = C626836d.A0B(r4, C1896292a.A00(201), new String[]{"leave", "linked_groups"}, 0, 1024);
            C1896292a.A0N(r12, new String[]{"leave"}, 202).get(A032 ? 1 : 0);
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (C138956rH r1 : A0B) {
                C27991fJ r2 = (C27991fJ) ((C138696qq) r1.A01).A00;
                C138636qk r0 = (C138636qk) r1.A00;
                if (r0 == null) {
                    A0s2.add(r2);
                } else {
                    C156417ga r13 = new C156417ga(this, r2, A0s);
                    int i2 = r0.A00;
                    List list = r13.A02;
                    C27991fJ r22 = r13.A01;
                    if (2 - i2 != 0) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    list.add(new AnonymousClass5HU(r22, i));
                }
            }
            AnonymousClass5HV r42 = new AnonymousClass5HV(A0s2, A0s);
            List list2 = r42.A01;
            if (!list2.isEmpty()) {
                this.A03.A01.A01(new C70193a6(this, 12, list2));
            }
            if (r42.A00.isEmpty()) {
                this.A05.run();
            } else {
                this.A02.AwB(r42);
            }
        } catch (Exception e) {
            this.A01.AwB(AnonymousClass001.A0f());
            throw e;
        }
    }
}
