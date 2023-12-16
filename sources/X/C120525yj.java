package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.5yj  reason: invalid class name and case insensitive filesystem */
public final class C120525yj extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C157787is this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120525yj(C157787is r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0I = AnonymousClass002.A0I(r3);
        for (AnonymousClass593 r0 : AnonymousClass593.values()) {
            C18270x1.A1K(A0I, r0.statusColor);
        }
        C157787is r5 = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(A0I));
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass0x2.A1I(next, linkedHashMap, AnonymousClass0Y8.A04(r5.A08, AnonymousClass001.A0K(next)));
        }
        return linkedHashMap;
    }
}
