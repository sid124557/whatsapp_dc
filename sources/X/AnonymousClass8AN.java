package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.8AN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8AN implements C180968lv {
    public final C157667ig A00;
    public final C161707qI A01;

    public final Object BuJ() {
        boolean z;
        Map map;
        Map map2;
        C161707qI r4 = this.A01;
        C157667ig r3 = this.A00;
        if (C161707qI.A02()) {
            z = AnonymousClass001.A1Z(C161707qI.A00(new AnonymousClass8AM("gms:phenotype:phenotype_flag:debug_disable_caching")));
        } else {
            z = false;
        }
        if (z) {
            map = r3.A00();
        } else {
            map = r3.A06;
        }
        if (map2 == null) {
            synchronized (r3.A03) {
                map2 = r3.A06;
                if (map2 == null) {
                    map2 = r3.A00();
                    r3.A06 = map2;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(r4.A02);
    }

    public AnonymousClass8AN(C157667ig r1, C161707qI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
