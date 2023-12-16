package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2gm  reason: invalid class name and case insensitive filesystem */
public final class C49592gm {
    public final C29441ip A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass5ZC A03;

    public C49592gm(C29441ip r4, AnonymousClass1VX r5, AnonymousClass4FV r6) {
        C18260x0.A0Z(r5, r6, r4, 1);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r4;
        this.A03 = AnonymousClass0x9.A0U(r5.A0O(C58422vE.A02, 5506), true);
    }

    public final List A00(List list) {
        if (list == null || list.isEmpty() || !this.A01.A0Y(C58422vE.A02, 5367)) {
            return C72023d3.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            String str = (String) next;
            if (!C107575bX.A0F(str) && this.A03.A01(str)) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public final void A01(C104575Rn r4) {
        C26061bW r0 = r4.A00;
        AnonymousClass4FV r2 = this.A02;
        r2.BhD(r0);
        for (AnonymousClass3ZG BhD : r4.A01) {
            r2.BhD(BhD);
        }
    }
}
