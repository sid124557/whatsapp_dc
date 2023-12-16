package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Wh  reason: invalid class name and case insensitive filesystem */
public final class C105765Wh {
    public final C623534r A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final Map A05;

    public final boolean A00() {
        if (this.A00 != null || !this.A02.isEmpty() || !this.A03.isEmpty() || !this.A01.isEmpty() || !this.A05.isEmpty() || !this.A04.isEmpty()) {
            return false;
        }
        return true;
    }

    public C105765Wh(C623534r r4, List list, List list2, List list3, Map map, Map map2) {
        this.A00 = r4;
        this.A02 = AnonymousClass6A5.A00(list, new C1222463q(true), 6);
        this.A03 = AnonymousClass6A5.A00(list2, new C1222463q(true), 6);
        this.A01 = AnonymousClass6A5.A00(list3, new C1222463q(false), 6);
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        C162457s7.A0D(unmodifiableMap);
        this.A05 = unmodifiableMap;
        Map unmodifiableMap2 = Collections.unmodifiableMap(map2);
        C162457s7.A0D(unmodifiableMap2);
        this.A04 = unmodifiableMap2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C105765Wh() {
        /*
            r7 = this;
            r1 = 0
            X.3d3 r2 = X.C72023d3.A00
            java.util.Map r5 = X.C73813g7.A0A()
            java.util.Map r6 = X.C73813g7.A0A()
            r0 = r7
            r3 = r2
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105765Wh.<init>():void");
    }
}
