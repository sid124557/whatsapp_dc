package X;

import java.util.Iterator;

/* renamed from: X.5pb  reason: invalid class name and case insensitive filesystem */
public class C116015pb implements AnonymousClass66I {
    public final AnonymousClass3DO A00;
    public final AnonymousClass33p A01;

    public /* synthetic */ void BMb() {
    }

    public void BMc() {
        AnonymousClass3DO r2 = this.A00;
        Iterator it = r2.A00().iterator();
        while (it.hasNext()) {
            r2.A02(AnonymousClass001.A0m(it));
        }
        C18270x1.A0l(C18270x1.A03(this.A01), "report_unhealthy_module", true);
    }

    public C116015pb(AnonymousClass3DO r1, AnonymousClass33p r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
