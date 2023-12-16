package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Xb  reason: invalid class name and case insensitive filesystem */
public final class C44682Xb {
    public final C56612sH A00;
    public final AnonymousClass31C A01;

    public void A00(AnonymousClass4CS r14, long[] jArr) {
        AnonymousClass31C r6 = this.A01;
        String A03 = r6.A03();
        ArrayList A0I = AnonymousClass002.A0I(r5);
        for (long valueOf : jArr) {
            A0I.add(new C35261wa(Long.valueOf(valueOf), Long.valueOf(C56612sH.A00(this.A00))));
        }
        C35711xJ r2 = new C35711xJ(new C35371wl(A03, 21), (List) A0I);
        r6.A0D(new C35571x5(r2, new AnonymousClass2F2(r14), 8), C41032Ir.A05(r2), A03, 430, 32000);
    }

    public C44682Xb(C56612sH r1, AnonymousClass31C r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
