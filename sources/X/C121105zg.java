package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5zg  reason: invalid class name and case insensitive filesystem */
public final class C121105zg extends C829045j implements AnonymousClass4GP {
    public static final C121105zg A00 = new C121105zg();

    public C121105zg() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AbstractCollection abstractCollection = (AbstractCollection) C18300x5.A0d(C100845Cm.A02);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(abstractCollection));
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C193199Nn r0 = (C193199Nn) it.next();
            AnonymousClass0x2.A1I(r0.A01, linkedHashMap, r0.A00);
        }
        return AnonymousClass8OQ.copyOf((Map) linkedHashMap);
    }
}
