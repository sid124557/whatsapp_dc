package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.73B  reason: invalid class name */
public class AnonymousClass73B {
    public static AnonymousClass84O A00(C153427bI r9, C131266dJ r10, AnonymousClass84O r11) {
        C153427bI r4 = r9;
        C160817oM A02 = C162377rs.A02(r9);
        C158847ke r5 = r10.A01;
        if (r5 == null) {
            C161827qc.A03("Tree resources can only be read from the UI Thread");
            r5 = A02.A04.A01((Map) null, A02.A09);
        }
        AnonymousClass7P6 A00 = C154107cc.A00(C154707dc.A00, r4, r5, (C154997e7) r4.A01.get(R.id.bk_context_key_performance_logger), (AnonymousClass7P6) null, r11, new C155007e8(), AnonymousClass8DC.A00);
        if (!A00.A03.isEmpty()) {
            C159737mN.A01("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A01;
    }
}
