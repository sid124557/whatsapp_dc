package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.32M  reason: invalid class name */
public class AnonymousClass32M {
    public static AnonymousClass32M A05 = new AnonymousClass32M(-2, (String) null);
    public final int A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final boolean A04;

    public AnonymousClass32M(List list, Map map, int i) {
        this.A04 = true;
        this.A01 = null;
        this.A00 = i;
        this.A03 = Collections.unmodifiableMap(map);
        this.A02 = Collections.unmodifiableList(list);
    }

    public AnonymousClass32M(int i, String str) {
        this.A04 = false;
        this.A01 = str;
        this.A00 = i;
        this.A03 = Collections.emptyMap();
        this.A02 = Collections.emptyList();
    }
}
