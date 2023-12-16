package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Fx  reason: invalid class name and case insensitive filesystem */
public final class C65023Fx implements AnonymousClass664 {
    public final C65203Gp A00;
    public final C22431Oa A01;
    public final C56982ss A02;
    public final C56662sM A03;
    public final C623934v A04;

    public void BQV() {
        C65203Gp r3 = this.A00;
        if (r3.A0Q()) {
            List<AnonymousClass1SS> A0A = this.A04.A0A("pnForLidChat", false);
            HashSet A0K = AnonymousClass002.A0K();
            for (AnonymousClass1SS r0 : A0A) {
                A0K.add(r0.A00);
            }
            Set A0F = this.A02.A0F();
            C162457s7.A0D(A0F);
            AnonymousClass4C5 A05 = C829345m.A05(C826844n.A00, new C626335w(A0F, 1));
            AnonymousClass41Z r02 = new AnonymousClass41Z(A0K);
            C162457s7.A0J(A05, 0);
            Set A032 = C829345m.A03(C829345m.A05(new C817741a(this), new AnonymousClass8PL(r02, A05, false)));
            if (C18310x6.A1X(A032)) {
                r3.A0K(A032);
            }
        }
    }

    public C65023Fx(C65203Gp r1, C22431Oa r2, C56982ss r3, C56662sM r4, C623934v r5) {
        C18260x0.A0c(r3, r1, r4, r5);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    public String BDW() {
        return "PnForLidChatMutationDailyCron";
    }
}
