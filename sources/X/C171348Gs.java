package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8Gs  reason: invalid class name and case insensitive filesystem */
public class C171348Gs implements C184408rk {
    public final List A00;
    public final /* synthetic */ C112275jT A01;

    public C171348Gs(C112275jT r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public void BSO(AnonymousClass7T4 r3, int i) {
        C184178rN r1 = this.A01.A0A;
        if (r1 != null) {
            r1.BNq(this.A00, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        C184178rN r0 = this.A01.A0A;
        if (r0 != null) {
            r0.BNr(map);
        }
    }
}
