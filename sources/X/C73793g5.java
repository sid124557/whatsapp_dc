package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3g5  reason: invalid class name and case insensitive filesystem */
public final class C73793g5 extends C73803g6 {
    public static final List A06(Map map) {
        if (map.size() != 0) {
            Iterator A0q = AnonymousClass000.A0q(map);
            if (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (!A0q.hasNext()) {
                    return C18290x4.A12(AnonymousClass3Z6.A02(A0w.getKey(), A0w.getValue()));
                }
                ArrayList A0z = C18290x4.A0z(map);
                AnonymousClass3Z6.A03(A0w.getKey(), A0w.getValue(), A0z);
                do {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q);
                    AnonymousClass3Z6.A03(A0w2.getKey(), A0w2.getValue(), A0z);
                } while (A0q.hasNext());
                return A0z;
            }
        }
        return C72023d3.A00;
    }
}
