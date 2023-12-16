package X;

import com.whatsapp.R;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.8Oc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173048Oc implements Callable {
    public final /* synthetic */ C153427bI A00;
    public final /* synthetic */ C151617Vm A01;
    public final /* synthetic */ AnonymousClass7P6 A02;
    public final /* synthetic */ Map A03;

    public final Object call() {
        C153427bI r4 = this.A00;
        C151617Vm r3 = this.A01;
        Map map = this.A03;
        AnonymousClass7P6 r7 = this.A02;
        AnonymousClass8DC r10 = AnonymousClass8DC.A00;
        if (r4 != null) {
            r4.A01.get(R.id.bk_context_key_performance_logger);
        }
        AnonymousClass79O.A00.getAndIncrement();
        C159567m6.A01("Bloks Bind");
        AnonymousClass7P6 A002 = C154107cc.A00(C154707dc.A00, r4, r3.A00.A00(map), (C154997e7) r4.A01.get(R.id.bk_context_key_performance_logger), r7, r3.A01, new C155007e8(), r10);
        AnonymousClass79U.A00.incrementAndGet();
        C159567m6.A00();
        return A002;
    }

    public /* synthetic */ C173048Oc(C153427bI r1, C151617Vm r2, AnonymousClass7P6 r3, Map map) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = map;
        this.A02 = r3;
    }
}
