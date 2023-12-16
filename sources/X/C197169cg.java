package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9cg  reason: invalid class name and case insensitive filesystem */
public final class C197169cg implements C184548s0 {
    public final Map A00 = new LinkedHashMap();

    public C45422Zz B95(String str) {
        return (C45422Zz) this.A00.get(str);
    }

    public void BcL() {
        for (C45422Zz r1 : this.A00.values()) {
            if (r1.A00) {
                C55212pz A002 = r1.A00();
                if (A002.A00) {
                    A002.A04();
                }
            }
        }
    }
}
