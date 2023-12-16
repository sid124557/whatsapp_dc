package X;

import java.util.Set;

/* renamed from: X.2Vd  reason: invalid class name and case insensitive filesystem */
public class C44222Vd {
    public final /* synthetic */ C54142oF A00;

    public C44222Vd(C54142oF r1) {
        this.A00 = r1;
    }

    public void A00(String str, Set set, boolean z) {
        boolean z2;
        C54142oF r2 = this.A00;
        C43802Tn r0 = r2.A06;
        boolean z3 = r0.A0A;
        Set set2 = set;
        boolean contains = set.contains(r0.A04);
        if (!z3 ? contains : !contains) {
            z2 = false;
        } else {
            z2 = true;
        }
        r2.A00 = z2;
        r2.A03.BkS(new C117305ri(r2, set2, str, 1, z));
    }
}
