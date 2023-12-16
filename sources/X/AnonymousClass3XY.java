package X;

import java.util.Map;

/* renamed from: X.3XY  reason: invalid class name */
public final class AnonymousClass3XY implements C84724Dl {
    public final /* synthetic */ C43292Ro A00;

    public AnonymousClass3XY(C43292Ro r1) {
        this.A00 = r1;
    }

    public void BaN(C46202bF r9) {
        C43292Ro r7 = this.A00;
        String str = r7.A03;
        String str2 = r7.A04;
        if (r9 == null || r9.A00 != 5) {
            C46772cB r1 = r7.A00;
            if (r1 != null) {
                C48722fM r3 = r1.A00.A05;
                if (r3 == null) {
                    throw C18270x1.A0S("fcsLoadingEventManager");
                }
                String str3 = r1.A04;
                C162457s7.A0C(str3);
                r3.A01((C60752z6) null, "onLoadingFailure", str3, (Map) null);
                return;
            }
            return;
        }
        AnonymousClass39C r12 = r7.A02;
        if (r12 != null) {
            C53332mv r0 = r7.A01;
            r0.A02.A02(r0.A00.A00(str, str2), new AnonymousClass32G((Object) r9, r12.A00, r12.A02), r12.A01);
        }
        C46772cB r02 = r7.A00;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void BaH(C150917Ss r2) {
        throw AnonymousClass23S.A00();
    }
}
