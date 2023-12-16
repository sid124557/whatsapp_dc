package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.8Og  reason: invalid class name and case insensitive filesystem */
public final class C173088Og implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C180488l9 A03;
    public final /* synthetic */ C160247nJ A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ Object A06;

    public C173088Og(Context context, C180488l9 r2, C160247nJ r3, Object obj, Object obj2, int i, long j) {
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = context;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C147657Fd r1;
        C160247nJ r6 = this.A04;
        if (r6 != null) {
            C180488l9 r4 = this.A03;
            long j = this.A01;
            C151847Wn r3 = r6.A02;
            if (r4 == r6.A01 && C151847Wn.A00(r3, j)) {
                return new C160247nJ(r6.A00, r4, r3, this.A06);
            }
        }
        Object obj = this.A05;
        Context context = this.A02;
        int i = this.A00;
        if (r6 == null || (r1 = r6.A00) == null) {
            r1 = null;
        }
        return C152987aU.A00(new C152987aU(context, new C157997jG(r1), obj, i), this.A03, this.A06, this.A01);
    }
}
