package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7P4  reason: invalid class name */
public final class AnonymousClass7P4 {
    public Integer A00;
    public final AnonymousClass891 A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public AnonymousClass7P4(AnonymousClass891 r4, String str, String str2, Map map, Set set) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.A05 = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.A04 = map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4 == null ? AnonymousClass891.A00 : r4;
        HashSet A15 = AnonymousClass0x9.A15(unmodifiableSet);
        Iterator A0v = AnonymousClass001.A0v(map);
        if (A0v.hasNext()) {
            A0v.next();
            throw AnonymousClass001.A0g("zaa");
        } else {
            this.A06 = Collections.unmodifiableSet(A15);
        }
    }
}
